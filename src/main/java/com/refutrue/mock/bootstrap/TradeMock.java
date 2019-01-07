package com.refutrue.mock.bootstrap;

import com.refutrue.mock.bean.Trade;
import com.refutrue.mock.executor.FileExecutor;
import com.refutrue.mock.executor.IExecutor;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/24 14:57
 * @Description:
 */
public class TradeMock {

    public static void main(String[] args) throws Exception {
        IExecutor<Trade> executor = new FileExecutor<>(Trade.class,50000000,"D:/trade5.txt","&");
        executor.execute();
    }
}
