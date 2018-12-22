package com.refutrue.mock.pojo;

import com.refutrue.mock.generater.IGenerator;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 12:52
 * @Description:
 */
public class FieldMsg {

    private Field field ;

    private List<Annotation> annotationList = new ArrayList<Annotation>();

    private IGenerator generator;

    public IGenerator getGenerator() {
        return generator;
    }

    public void setGenerator(IGenerator generator) {
        this.generator = generator;
    }

    public void addAnnotation2List(Annotation annotation){
        annotationList.add(annotation);
    }

    public List<Annotation> getAnnotationList(){
        return this.annotationList;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }
}
