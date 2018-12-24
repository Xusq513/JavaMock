package com.refutrue.mock.generater;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/24 13:35
 * @Description:
 */
public class IDGenerator extends RandomAdapter<Integer>{

    public static Integer number = 0;

    @Override
    public Integer generate() {
        number ++ ;
        return number;
    }
}
