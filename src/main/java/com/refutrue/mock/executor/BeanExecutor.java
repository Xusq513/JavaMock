package com.refutrue.mock.executor;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 12:41
 * @Description:
 */
public class BeanExecutor implements IExecutor{

    private Class<?> cls;

    private int rowNums;

    public void execute() {

    }

    public BeanExecutor setClass(Class<?> cls){
        this.cls = cls;
        return this;
    }

    public BeanExecutor rowNum(int rowNums){
        this.rowNums = rowNums;
        return this;
    }
}
