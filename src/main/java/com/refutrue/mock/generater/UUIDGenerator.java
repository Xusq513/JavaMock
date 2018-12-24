package com.refutrue.mock.generater;

import java.util.UUID;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/24 13:35
 * @Description:
 */
public class UUIDGenerator extends RandomAdapter<String>{

    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
