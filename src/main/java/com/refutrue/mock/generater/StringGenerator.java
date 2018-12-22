package com.refutrue.mock.generater;

import com.refutrue.mock.util.RandomString;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/19 14:32
 * @Description: 随机字符串
 */
public class StringGenerator extends RandomAdapter<String>{

    public String generate() {
        int length = random.length();
        return RandomString.generateString(length);
    }

}
