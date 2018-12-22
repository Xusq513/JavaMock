package com.refutrue.mock.builder;

import com.refutrue.mock.pojo.FieldMsg;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 14:50
 * @Description:
 */
public interface IGeneratorBuilder<T> {

    public FieldMsg build(FieldMsg fieldMsg);
}
