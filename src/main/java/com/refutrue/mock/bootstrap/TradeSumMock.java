package com.refutrue.mock.bootstrap;

import com.refutrue.mock.bean.Trade;
import com.refutrue.mock.bean.TradeSum;
import com.refutrue.mock.executor.FileExecutor;
import com.refutrue.mock.executor.IExecutor;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/24 14:57
 * @Description:
 */
public class TradeSumMock {

    public static void main(String[] args) throws Exception {
        IExecutor<TradeSum> executor = new FileExecutor<>(TradeSum.class,20000000,"D:/tradeSum.txt","&");
        executor.execute();
    }
}
