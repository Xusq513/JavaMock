package com.refutrue.mock.generater;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/19 14:37
 * @Description:  生成最大值和最小值之间的数值
 */
public class NumberGenerator extends NumberAdpter<Double>{

    public Double generate() {
        Double max = number.max();
        Double min = number.min();
        return min + (max - min) * Math.random();
    }
}
