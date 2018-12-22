package com.refutrue.mock.bean;

import com.refutrue.mock.annotation.*;
import com.refutrue.mock.annotation.Number;
import com.refutrue.mock.generater.NumberGenerator;
import com.refutrue.mock.generater.TAGenerator;

import java.util.Date;

/**
 * @Author: Michael Xu
 * @Date: 2018/12/18 17:15
 * @Description:
 */
public class Account {

    @Order(1)
    @Time(formatter = "yyyyMMdd",max="20191201",min="20181201")
    public String destroydate; //销户日期
    @Order(2)
    @Sign("1")
    public String wholeflag; //全量标志
    @Order(3)
    @Sign("1")
    public String modifyway; //修改方式
    @Order(4)
    @Dict(dictList = {"156","840"})
    public String registercurrencytype; //注册资金的货币类型
    @Order(5)
    @Sign("0")
    public String taskchecked; //是否已经完成了可疑特征检测 0未检测 1已检测
    @Order(6)
    @Random(length = 12)
    public String investorname; //投资人户名
    @Order(7)
    @Random(length = 12,generator = TAGenerator.class)
    public String taaccountid; //投资人账号
    @Order(8)
    @Sign("20181218")
    public String transactioncfmdate; //交易确认日期
    @Order(9)
    @Dict(dictList = {"120","122","124"})
    public String businesscode; //业务代码#101-开户，102销户，103-账户信息修改
    @Order(10)
    @Sign("12012099")
    public String regioncode; //交易所在地区编号
    @Order(11)
    @Dict(dictList = {"1","0"})
    public String individualorinstitution; //个人/机构标志#0-机构，1-个人，2-产品
    @Order(12)
    @Random(length = 16,generator = NumberGenerator.class)
    public String taserialno; //交易流水号
    @Order(13)
    @Random(length = 18,generator = NumberGenerator.class)
    public String instrepridcode; //法人代表身份证件代码
    @Order(14)
    @Dict(dictList = {"0","1","2"})
    public String instrepridtype; //法人代表证件类型#0-身份证，1-护照 2-军官证 3-士兵证 4-港澳居民来往内地通行证 5-户口本 6-外国护照 7-其它 8-文职证 9-警官证 A-台胞证 B-外国人永久居留身份证
    @Order(15)
    @Random(length = 12)
    public String instreprname; //法人代表姓名
    @Order(16)
    @Dict(dictList = {"0","1","2"})
    public String certificatetype; //个人证件类型及机构证件类型#个人证件类型0-身份证，1-护照2-军官证，3-士兵证4-港澳居民来往内地通行证，5-户口本6-外国护照，7-其它8-文职证，9-警官证A-台胞证,B-外国人永久居留身份证机构证件类型0-组织机构代码证1-营业执照，2-行政机关3-社会团体，4-军队5-武警6-下属机构（具有主管单位批文号）7-基金会，8-其它，9-登记证书，A-批文产品证件类型1-营业执照，8-其它，9-登记证书，A-批文
    @Order(17)
    @Random(length = 18,generator = NumberGenerator.class)
    public String certificateno; //投资人证件号码
    @Order(18)
    @Random(length = 18,generator = NumberGenerator.class)
    public String transactorcertno; //经办人证件号码
    @Order(19)
    @Dict(dictList = {"0","1","2"})
    public String transactorcerttype; //经办人证件类型#0-身份证，1-护照2-军官证，3-士兵证4-港澳居民来往内地通行证，5-户口本6-外国护照，7-其它8-文职证，9-警官证A-台胞证,B-外国人永久居留身份证
    @Order(20)
    @Dict(dictList = {"156","840"})
    public String nationality; //投资者国籍
    @Order(21)
    @Dict(dictList = {"01","02","03"})
    public String vocationcode; //投资人职业代码#01-党政机关、事业单位 02-企业单位03-自由业主04- 学生05-军人06-其他
    @Order(22)
    @Random(length = 15)
    public String accountnumber; //投资人收款银行账户账号
    @Order(23)
    @Random(length = 20)
    public String clearingagency; //投资人收款银行账户开户行
    @Order(24)
    @Time(formatter = "yyyyMMdd",max="20191201",min="20181201")
    public String certvaliddate; //证件有效日期
    @Order(25)
    @Time(formatter = "yyyyMMdd",max="20191201",min="20181201")
    public String insttrancertvaliddate; //机构经办人身份证件有效日期
    @Order(26)
    @Time(formatter = "yyyyMMdd",max="20191201",min="20181201")
    public String instreprcertvaliddate; //机构法人身份证件有效日期
    @Order(27)
    @Sign("北京市")
    public String province; //省/直辖市
    public String distributorcode; //销售人代码
    public String branchcode; //网点号码
    public String transactorname; //经办人姓名
    public String hometelno; //投资人住址电话
    public String mobiletelno; //投资人手机号码
    public String officetelno; //投资人单位电话号码
    public String telno; //投资人电话号码
    public String emailaddress; //投资人E-MAIL地址
    public String faxno; //投资人传真号码
    public String address; //通讯地址
    public String corpoproperty; //企业性质#0-国企，1-民营，2-合资，3-其他
    public String investortype; //投资者类型#以下为产品分类：201:开放式公募基金产品；202:封闭式公募基金产品；203:银行理财产品；204:信托计划；205:基金公司专户；206:基金子公司产品；207:保险产品；208:保险公司及其子公司的资产管理计划；209:证券公司集合理财产品（含证券公司大集合）；210:证券公司专项资管计划；211:证券公司定向资管计划；212:期货公司及其子公司的资产管理计划；213:私募投资基金；214:政府引导基金；215:全国社保基金；216:地方社保基金；217:基本养老保险；218:养老金产品；219:企业年金及职业年金；220:境外资金（QFII）；221:境外资金（RQFII）；222:其它境外资金；223:社会公益基金（慈善基金、捐赠基金等）； 224:其他产品以下为机构分类：101:证券公司；102:银行；103:信托投资公司；104:基金管理公司；105:保险公司；106:私募基金管理人；107:期货公司；108:其他境内金融机构；109:机关法人； 110:事业单位法人；111:社会团体法人；112:非金融机构企业法人；113:非金融类非法人机构；114:境外代理人；115:境外金融机构； 116:外国战略投资者；117:境外非金融机构 118:其它以下为个人分类001:私募基金管理人员工002:非私募基金管理人员工
    public String tradingmethod; //使用的交易手段#第1位：CALLCENTER第2位：INTERNET第3位：自助终端第4位：柜台第5~8位：保留
    public String vocation; //行业
    @Order(55)
    public Double id; //主键ID
    public Double creator_id; //创建人
    public Date create_time; //创建时间
    public Date last_edit_time; //修改时间
    public Double last_editor_id; //修改人
    public Double deleted; //删除标识
    public Double delete_user_id; //删除人
    public Date mark_deleted_time; //删除时间
    public Double checked; //审核标识
    public Double checker_id; //审核人
    public Date check_time; //审核时间
    public Date start_time; //开始时间
    public Date end_time; //结束时间
    public String operationuser; //操作人员
    public String operationtime; //操作日期
    public String riskdatastatus; //数据状态
    public String importtype; //数据来源
    public String importtime; //导入时间
    public String isblacklist; //是否黑名单
    public String isimmunity; //是否豁免 0：豁免 1：还原
    public String accountdate; //开户日期
    public String industrycategory; //监控数据
    public Double registercapital; //注册资金
    public String opendate; //开户日期
}
