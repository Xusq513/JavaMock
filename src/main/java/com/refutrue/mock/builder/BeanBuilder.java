package com.refutrue.mock.builder;

import com.refutrue.mock.annotation.Dict;
import com.refutrue.mock.generater.IGenerator;
import com.refutrue.mock.pojo.FieldMsg;
import com.refutrue.mock.util.DateUtil;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 14:33
 * @Description:
 */
public class BeanBuilder<T> implements IBeanBuilder<T>{

    public static IBuilder builder = new ClassBuilder();

    public static Map<Class,List<FieldMsg>> map = new HashMap<>();

    @Override
    public T build(Class<T> cls) throws Exception {
        List<FieldMsg> list = getFieldMsgByMap(cls);
        T t = cls.newInstance();
        if(list != null){
            list.forEach(fieldMsg -> {
                Field f = fieldMsg.getField();
                IGenerator generator = fieldMsg.getGenerator();
                if(generator != null){
                    try {
                        Object obj = generator.generate();
                        if(obj instanceof Date && f.getType() == String.class){
                            obj = DateUtil.dateToString((Date)obj,"yyyyMMdd");
                        }
                        f.set(t,obj);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        return t;
    }

    public static List<FieldMsg> getFieldMsgByMap(Class<?> cls){
        List<FieldMsg> list;
        list = map.get(cls);
        if(list == null){
            list = builder.build(cls);
            map.put(cls,list);
        }
        return list;
    }
}
