package com.refutrue.mock.builder;

import com.refutrue.mock.pojo.FieldMsg;

import java.util.List;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 14:32
 * @Description:
 */
public interface IBeanBuilder <T>{

    public T build(List<FieldMsg> list,Class<T> cls) throws Exception;
}
