package com.refutrue.mock.generater;

import com.refutrue.mock.annotation.Random;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/19 14:59
 * @Description:
 */
public abstract class RandomAdapter<T> implements IGenerator<T>{

    protected Random random;

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
