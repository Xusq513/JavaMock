package com.refutrue.mock.annotation;

import com.refutrue.mock.generater.StringGenerator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/18 17:26
 * @Description:
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Random {

    public int length() default 0;

    public Class<?> generator() default StringGenerator.class;
}
