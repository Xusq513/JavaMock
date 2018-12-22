package com.refutrue.mock.generater;

import com.refutrue.mock.annotation.Number;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/20 19:11
 * @Description:
 */
public abstract class NumberAdpter<T> implements IGenerator<T>{

    protected Number number;

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = number;
    }
}
