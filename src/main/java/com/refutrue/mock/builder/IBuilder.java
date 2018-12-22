package com.refutrue.mock.builder;

import com.refutrue.mock.pojo.FieldMsg;

import java.util.List;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 12:51
 * @Description:
 */
public interface IBuilder {

   public List<FieldMsg> build(Class<?> cls);
}
