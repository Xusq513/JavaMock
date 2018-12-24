package com.refutrue.mock.executor;

import com.refutrue.mock.annotation.Order;
import com.refutrue.mock.builder.BeanBuilder;
import com.refutrue.mock.builder.IBeanBuilder;
import com.refutrue.mock.pojo.FieldSort;
import com.refutrue.mock.util.DateUtil;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.*;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 12:41
 * @Description:
 */
public class FileExecutor<T> implements IExecutor<T>{

    public static Map<Class,List<FieldSort>> map = new HashMap<>();

    private Class<T> cls;

    private int rowNums;

    private String filePath;

    private String splitString;

    private IBeanBuilder<T> beanBuilder = new BeanBuilder<T>();

    public FileExecutor(Class<T> cls, int rowNums,String filePath,String splitString) {
        this.cls = cls;
        this.rowNums = rowNums;
        this.filePath = filePath;
        this.splitString = splitString;
    }

    public void execute() throws Exception {
        File file = new File(filePath);
        if(file.exists()){
            file.delete();
        }
        file.createNewFile();
        FileWriter fw = new FileWriter(file);
        List<FieldSort> list = getFieldSortByMap();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < rowNums;i++){
            T t = beanBuilder.build(cls);
            sb.setLength(0);
            list.forEach(fieldSort -> {
                Object obj = null;
                try {
                    obj = fieldSort.getF().get(t);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if(obj != null){
                    if(fieldSort.getF().getType() == Date.class){
                        sb.append(DateUtil.dateToString((Date)obj,"yyyyMMdd hh:mm:ss"));
                    }else{
                        sb.append(obj.toString());
                    }
                }
                sb.append(splitString);
            });
            if(sb.length() > 0){
                sb.setLength(sb.length() - 1);
            }
            fw.write(sb.toString());
            fw.write(System.getProperty("line.separator"));
            if(i % 20000 == 0){
                System.out.println("已经写了" + i + "行记录");
                fw.flush();
            }
        }
        fw.close();

    }

    public List<FieldSort> getFieldSort(){
        List<FieldSort> list = new ArrayList<>();
        List<Field> fieldList = Arrays.asList(cls.getDeclaredFields());
        fieldList.forEach(field -> {
            int orderNum = Integer.MAX_VALUE;
            Order order = field.getAnnotation(Order.class);
            if(order != null){
                orderNum = order.value();
            }
            FieldSort fieldSort = new FieldSort();
            fieldSort.setF(field);
            fieldSort.setOrder(orderNum);
            list.add(fieldSort);
        });
        list.sort( (a,b)->{
            return  a.getOrder() - b.getOrder();
        });
        return list;
    }

    public  List<FieldSort> getFieldSortByMap(){
        List<FieldSort> list = map.get(cls);
        if(list == null){
            list = getFieldSort();
            map.put(cls,list);
        }
        return list;
    }

    public FileExecutor setClass(Class<T> cls){
        this.cls = cls;
        return this;
    }

    public FileExecutor rowNum(int rowNums){
        this.rowNums = rowNums;
        return this;
    }
}
