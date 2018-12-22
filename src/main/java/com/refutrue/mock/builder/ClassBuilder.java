package com.refutrue.mock.builder;

import com.refutrue.mock.pojo.FieldMsg;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 14:18
 * @Description:
 */
public class ClassBuilder implements  IBuilder{

    private IGeneratorBuilder generatorBuilder = new GeneratorBuilder();

    public List<FieldMsg> build(Class<?> cls) {
        final List<FieldMsg> fieldMsgList = new ArrayList<>();
        Field[] fieldList = cls.getFields();
        Arrays.asList(fieldList).forEach(field -> {
            final FieldMsg fieldMsg = new FieldMsg();
            fieldMsg.setField(field);
            Arrays.asList(field.getAnnotations()).forEach(annotation -> {
                fieldMsg.addAnnotation2List(annotation);
            });
            generatorBuilder.build(fieldMsg);
            fieldMsgList.add(fieldMsg);
        });
        return fieldMsgList;
    }

}
