package com.refutrue.mock.builder;

import com.refutrue.mock.annotation.Dict;
import com.refutrue.mock.pojo.FieldMsg;

import java.util.List;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 14:33
 * @Description:
 */
public class BeanBuilder<T> implements IBeanBuilder<T>{



    @Override
    public T build(List<FieldMsg> list,Class<T> cls) throws Exception {
        T t = cls.newInstance();
        list.forEach(fieldMsg -> {

        });
        return t;
    }
}
