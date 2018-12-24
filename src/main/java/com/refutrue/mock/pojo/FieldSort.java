package com.refutrue.mock.pojo;

import java.lang.reflect.Field;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/24 11:27
 * @Description:
 */
public class FieldSort {

    private Field f;

    private int order;

    public Field getF() {
        return f;
    }

    public void setF(Field f) {
        this.f = f;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
