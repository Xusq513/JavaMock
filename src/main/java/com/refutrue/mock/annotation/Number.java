package com.refutrue.mock.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/18 17:20
 * @Description:
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface Number {

    public double max() default Double.MAX_VALUE;

    public double min() default 0D;

}
