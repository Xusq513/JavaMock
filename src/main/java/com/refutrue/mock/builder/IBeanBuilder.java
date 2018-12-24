package com.refutrue.mock.builder;


/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 14:32
 * @Description:
 */
public interface IBeanBuilder <T>{

    public T build(Class<T> cls) throws Exception;
}
