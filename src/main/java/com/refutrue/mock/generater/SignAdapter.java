package com.refutrue.mock.generater;

import com.refutrue.mock.annotation.Sign;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 15:08
 * @Description:
 */
public abstract class SignAdapter<T> implements IGenerator<T>{

    protected Sign sign;

    public Sign getSign() {
        return sign;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }
}
