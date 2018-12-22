package com.refutrue.mock.generater;

import com.refutrue.mock.annotation.Time;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/20 19:27
 * @Description:
 */
public abstract class TimeAdapter<T> implements IGenerator<T>{

    protected Time time;

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
