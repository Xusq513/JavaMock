package com.refutrue.mock.generater;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 15:09
 * @Description:
 */
public class SignGenerator extends SignAdapter<Object> {

    @Override
    public Object generate() {
        return sign.value();
    }
}
