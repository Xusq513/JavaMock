package com.refutrue.mock.generater;

import com.refutrue.mock.annotation.Dict;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/20 19:17
 * @Description:
 */
public abstract class DictAdapter<T> implements IGenerator<T>{

    protected Dict dict;

    public Dict getDict() {
        return dict;
    }

    public void setDict(Dict dict) {
        this.dict = dict;
    }
}
