package com.refutrue.mock.generater;

import com.refutrue.mock.util.RandomString;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/24 11:16
 * @Description:
 */
public class NumberRandomGenerator extends RandomAdapter<String>{

    @Override
    public String generate() {
        return RandomString.generateNumber(random.length());
    }
}
