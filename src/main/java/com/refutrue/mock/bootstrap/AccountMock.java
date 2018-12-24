package com.refutrue.mock.bootstrap;

import com.refutrue.mock.bean.Account;
import com.refutrue.mock.executor.FileExecutor;
import com.refutrue.mock.executor.IExecutor;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/22 12:38
 * @Description:
 */
public class AccountMock {

    public static void main(String[] args) throws Exception {
        IExecutor<Account> executor = new FileExecutor<>(Account.class,10000000,"D:/fxq/account.txt","&");
        executor.execute();
    }
}
