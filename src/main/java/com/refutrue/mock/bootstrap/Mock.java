package com.refutrue.mock.bootstrap;

import com.refutrue.mock.annotation.Dict;
import com.refutrue.mock.annotation.Order;
import com.refutrue.mock.annotation.Time;
import com.refutrue.mock.bean.Account;
import com.refutrue.mock.builder.ClassBuilder;
import com.refutrue.mock.builder.IBuilder;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 12:38
 * @Description:
 */
public class Mock {

    public static void main(String[] args)  {
        IBuilder iBuilder = new ClassBuilder();
//        iBuilder.build(Account.class).forEach(f -> {
//            System.out.println(f.getAnnotationList());
//        });

    }
}
