package com.refutrue.mock.bean;

import com.refutrue.mock.annotation.*;
import com.refutrue.mock.annotation.Number;
import com.refutrue.mock.generater.IDGenerator;
import com.refutrue.mock.generater.NumberRandomGenerator;
import com.refutrue.mock.generater.TAGenerator;

import java.util.Date;

/**
 * @Author   Michael Xu
 * @Date   2018/12/24 13  59
 * @Description 交易汇总
 */
public class TradeSum {

    @Order(1)
    public String transactionCfmDate; // 交易确认日期
    @Order(14)
    @Sign("20181221")
    public String transactionDate  ;//交易发生日期
    @Order(28)
    @Time(formatter = "yyyy-MM-dd hh:mm:ss",max="2018-12-21 23:59:59",min="2018-12-21 00:00:00")
    public Date createTime  ;//创建时间
    @Order(2)
    @Dict(dictList = {"156","840"})
    public String currencyType; // 结算币种
    @Order(3)
    @Random(length = 4,generator = NumberRandomGenerator.class)
    public String confireDvol  ; // 基金账户交易确认份数
    @Order(4)
    @Number(min = 1D,max = 1000000D)
    public Double confirmedAmount ; //每笔交易确认金额
    @Order(5)
    public String businessCode  ;  //业务代码
    @Order(6)
    @Random(length = 10000000,generator = TAGenerator.class)
    public String taaccountId  ;//投资人基金账号
    @Order(7)
    public String targetTaAccountId  ;//对方基金账号#转销售人、非交易过户时
    @Order(8)
    @Random(length = 9,generator = NumberRandomGenerator.class)
    public String targetDistributeOrCode  ;//对方销售人代码
    @Order(9)
    @Random(length = 9,generator = NumberRandomGenerator.class)
    public String distributeOrCode  ;//销售人代码/金融机构编码
    @Order(10)
    @Random(length = 9,generator = NumberRandomGenerator.class)
    public String targetBranchCode  ;//对方网点号
    @Order(11)
    @Random(length = 9,generator = NumberRandomGenerator.class)
    public String branchCode  ;//网点号码
    @Order(12)
    @Random(length = 4,generator = NumberRandomGenerator.class)
    public String regionCode  ;//交易所在地区编号
    @Order(13)
    @Random(length = 4,generator = NumberRandomGenerator.class)
    public String targetRegionCode  ;//对方所在地区编号
    @Order(15)
    @Sign("120000")
    public String transactionTime  ;//交易发生时间
    @Order(16)
    @Dict(dictList = {"0","1"})
    public String individualOrInstitution  ;//个人/机构标志  0-机构，1-个人，2-产品
    @Order(17)
    @Number(min = 1D,max = 1000000D)
    public Double tradingPrice   ;//交易价格
    @Order(18)
    @Random(length = 18,generator = NumberRandomGenerator.class)
    public String serialNo  ;//TA确认交易流水号
    @Order(19)
    @Number(min = 1D,max = 300D)
    public Double nav  ;//基金单位净值
    @Order(20)
    @Random(length = 6)
    public String fundCode  ;//基金代码
    @Order(21)
    @Dict(dictList = {"0","1"})
    public String transferDirection  ; //转入/转出标识 0-转出，1-转入
    @Order(22)
    @Random(length = 4,generator = NumberRandomGenerator.class)
    public String tradingMethod  ;//使用的交易手段#第1位：CALLCENTER第2位：INTERNET第3位：自助终端第4位：柜台第5~8位：保留每个字符取1表示使用此种手段，取0表示不使用
    @Order(23)
    public String frozenCause  ;//冻结原因#0-司法冻结，1-柜台冻结2-质押冻结，3-质押、司法双重冻结 4-柜台、司法双重冻结
    @Order(24)
    @Random(length = 6,generator = NumberRandomGenerator.class)
    public String totalVolOfDistributorInTa  ;//基金总份数（含冻结）
    @Order(25)
    @Sign("1")
    public String industryCategory  ;//适用机构
    @Order(39)
    public Date updateDate  ;//更新日期
    @Order(26)
    @Random(length = 2,generator = IDGenerator.class)
    public Integer id  ;//主键ID
}
