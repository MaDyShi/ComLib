package com.nade.utils.yvbase.utils;


/**
 * Created by KuKa on 2017/6/2.
 * URL 地址管理 1.2
 */


public interface InternetAddressUtis {
     // String Url = "http://173692vg40.51mypc.cn:40820"; // 本地
   // String Url1 = "http://173692vg40.51mypc.cn:11481/v1.0";//本地

    String Url = "http://192.168.3.53:8080";// 本地
    /*String ServiceUrl = "http://192.168.3.53:8082/v1.0";// 服务
    String OrderUrl = "http://192.168.3.53:8085/v1.0";// 订单
    String PayUrl = "http://192.168.3.53:8083/v1.0";// 支付*/

    String ServiceUrl = "http://192.168.3.51:8082/v1.0";// 服务
    String OrderUrl = "http://192.168.3.51:8085/v1.0";// 订单
    String PayUrl = "http://192.168.3.51:8083/v1.0";// 支付

    //   String Url = "https://www.hzyivi.com/online";//z

    String IMG_URL = "http://oxc8t6uon.bkt.clouddn.com/"; //zp
    String GETADVICELIST = "/user/getUserAdviceList";//获取意见建议列表
    String DELETEADVICE = "/user/deleteAdviceById";// 删除意见建议

    String EXITGRADEMONEY = "/user/quitCaution";// 退押金

    String USERLOGIN = "/user/login";// 用户登陆
    String EQUIQMENTREGIST = "/equipment/register";// 设备注册
    String GETPHONECODE = "/verify/sendCodeNotLogin";// 获取验证码
    String USERREGIST = "/user/userRegister";// 用户注册
    String USERRESETPASSWORD = "/user/forgetPassword";// 忘记密码 重新设置
    String CHANGEMINEMESSAGE = "/user/updateUserInfo";// 修改个人信息
    String MINEACCOUNTINFO = "/account/getAccountInfo";// 我的账号信息

    /**
     * v1.0  拼车新版
     */

    String GETUNITPRICEFORROLE = "/services/publishServiceByRole";// 根据角色创建服务以及单座价格
    String PASSSENDSERVICE = "/services/passerCertainPublishService";//乘客确认并发布服务
    String OWNERSENDSERVICE = "/services/ownerCertainPublishService";// 车主确认并发布服务
    String GETSERVICEDETAIL = "/services/getServiceDetail";//获取服务详情
    String GETMINESERVICELIST = "/services/getMainPageServiceListByRole";//根据角色获取服务列表
    String GETPASSNEAROWNERSERVICELIST = "/services/getPasserNearbyServiceList";// 获取乘客附近的车主服务列表
    String FROMSERVICEIDGETMATCHLISTANDDETAIL = "/services/getMatchServiceListDetail";// 根据serviceid 获取详情和匹配订单
    String CANCELSERVICEFORROLE = "/services/cancelService";// 车主或乘客取消订单
    String PASSBUYSERVICEBACKPRICE = "/services/getDealPayment";// 乘客购票根据座位获取价格
    String PINCHEYIVIPAYBUYORCARTICKIT = "/payment/ticketByYipay";// 车主抢单 或 乘客购票 钱包支付
    String PINCHEOTHERPAYBUYORCRYTICKET = "/payment/ticketByPaytool";// 车主抢单 或 乘客购票 第三方支付
    String OWNERCRYSERVICEBACKLOSSPRICE = "/services/getDealPenalty";// 车主抢单获取爽约金
    String OWNERDOINGORDERLIST = "/services/getOwnerOrderUnderWay";// 车主进行中的订单
    String GETORDERDETAILFORORDERCODE = "/order/getOrderByOrderCode";// 获取订单详情
    String PASSGETMATCHSERVICEDETAIL = "/services/getMatchServiceDetail";// 乘客获取匹配订单详情
    String YIVIPAYTICKETORLOSSMONEY = "/payment/penaltyByYipay";// 支付车费 或 爽约金 钱包支付
    String OTHERPAYTICKETORLOSSMONEY = "/payment/penaltyByPaytool";// 支付车费 或 爽约金 第三方支付
    String PINCHECHANGEORDERSTATE = "/order/updateOrder";// 操作拼车订单改变状态

    /**
     * 订单监控
     */


    String GETROUTELIST = "/monitor/getOrderMonitorList";// 获取个人监控订单
    String GETROUTEISNUMBER = "/monitor/getRestPermitMonitorCount";//获取可监控的条数
    String SENGMONITORROUTE = "/monitor/publishOrderMonitor"; // 发布订单监控
    String DELETEMONITORROUTE = "/monitor/deleteMonitorRoute";// 删除监控路线/订单
    String EDITMONITORROUTE = "/monitor/editMonitorRoute";// 编辑监控路线


    String REPLYVIP = "/user/insertYiviVipUser";// 申请vip
    String VIPYVPAY = "/yivipay/applyVipUserPay";
    String VIPWXPAY = "/wxpay/applyVipUserWXPay";
    String VIPALIPAY = "/alipay/applyVipUserAliPay";
    String XVIPRULE = "/protocol/vipRule";// vip 协议

    String GETQINIUTOKEN = "/qiniu/getToken";// 获取七牛云key
    String CHENAGEYIVIPAYWORD = "/account/modifyPayPassword";// 修改支付密码
    String SETYIVIPAYWORD = "/account/setPayPassword";// 修改支付密码
    String GETCODE = "/verify/sendCode"; // 登录状态下获取验证码
    String PAYWORDSTATES = "/account/isSetPayPassword";// 是否设置支付密码
    String HOPE_SENG = "/bonus/sendBonus";// 发送心愿接口
    String HOPE_SENG_ALIPAY = "/alipay/bonusPay";//发送心愿阿里支付接口
    String HOPE_SEND_YIWEIPAY = "/yivipay/bonusPay";// 发送心愿一喂钱包支付接口
    String HOPE_GETHOPE_BOOK = "/bonus/getBonusList";// 获取心愿列表
    String HOPE_CONTENT = "/bonus/getBonusById"; //红包详情页面
    String CRY_RESULT = "/bonus/sendBless"; // 请红包页面
    String RESULT_SENDWISH = "/bonus/blessWish";// 发送祝福语
    String PAY_SERVICERMONEY = "/alipay/serviceMargin"; // 服务保证金支付宝支付接口
    String PAY_YIVISERVICEMONEY = "/yivipay/serviceMargin";// 服务保证金钱包支付
    String ADDOUTACCOUNT = "/cash/addCashAccount";// 添加提现账户
    String MODIFYOUTACCOUNT = "/cash/modifyCashAccount";//修改提现账户
    String REMOVEOUTACCOUNT = "/cash/removeCashAccount";//删除提现账户
    String GETOUTACOUNTMSG = "/cash/getCashAccount";// 获取提现账户信息
    String GETDEFULTEACCOUNT = "/cash/getDefaultCashAccount";// 获取默认体现账户信息
    String GETOUTACCOUNTLIST = "/cash/getCashAccountList";//获取提现账户列表
    String APPLYOUT = "/cash/applyCash";// 提现接口
    String GETSTREAMLIST = "/account/getAccountFlowList";// 获取账户流水列表
    String GETUSERINFO = "/user/getUserInfo";// 个人信息接口
    String CORRECTPHONE = "/verify/correctOldMobile"; //验证原手机号
    String UPDATAPHONE = "/user/updatePhone";// 修改手机号码




    /**
     * 服务
     */
    String ISOPENSTORE = "/shop/isOpenedStore";// 是否已开店
    String PAYSERVICEMONEY = "/shop/isInsurance";// 是否已缴纳保证金
    String GETSTOREMESSAGE = "/shop/getMyStore"; // 获取店铺信息

    String SHOPREPORT = "/shop/report";// 举报店铺

    String COMPLITESERVICE = "/businessOrder/complaint";// 申述订单
    String GETCOMPLITEMESSAGE = "/businessOrder/getComplaint";// 获取申诉信息
    String CANCELCOMPLTE = "/businessOrder/cancelComplaint";// 取消申诉
    String AWARDLIST = "/message/getRewardMeList";// 打赏过我的
    String GETPINGLUNLIST = "/businessOrder/getCommentList";// 获取服务得评论列表

    /**
     * 协议
     */
    String XUSERREGIST = "/protocol/register";// 用户注册协议
    String XHOPE = "/protocol/wishNotice";//心语心愿说明协议
    String XBAO = "/protocol/margin";// 保证金协议
    String XYIVIERGRADE = "/protocol/authentic";// 一喂员等级信息
    String XYIVIREGISTER = "/protocol/register";// 一喂员注册协议
    String XYIVINO = "/protocol/notice";// 一喂员须知
    String XYIVIGUANLI = "/protocol/regulation";//一喂员管理条例
    String XPROBLEM = "/protocol/problem";// 常见问题
    String XCITYPARTNER = "/protocol/cityParnter"; //城市合伙人协议 ///protocol/cityParnter

    String GETNOTICELIST = "/notice/getMyNoticeList";// 获取个人公告列表


    String OTHERLOGIN = "/user/thirdPartyLogin";// 第三方登陆
    String OTHERBANDPHONE = "/user/bindThirdPartyUser";// 第三方登陆绑定手机号


    /**
     * 红包
     */
    String REDLIST = "/redpacket/queryMypacketList";//红包列表（get）
    String CRYREDPAGKETMONEY = "/redpacket/updateRedPacketStatus";// 抢红包接口
    String GETALLSIGN = "/sign/findSignAll";//查看本月签到
    String TOSIGN = "/sign/userSign";// 签到/补签
    String SIGNYIVIPAY = "/sign/payRepairSign";//签到钱包支付
    String SIGNALIPAY = "/alipay/repairSignAliPay";//签到阿里支付


    /**
     * 商圈
     */


    String SENGMYDIARY = "/tradingarea/addMyArea";// 发布日记
    String MYBUSINESSNERDIARY = "/tradingarea/queryNewAreaList";//我的商圈最新
    String MyBUSINESSDIANRYZAN = "/tradingarea/fabulousArea";// 商圈点赞
    String MyBUSINESSDIANRYCAnCELZAN = "/tradingarea/cancelFabulousArea";// 商圈取消点赞
    String MyBUSINESSDIARYHOT = "/tradingarea/queryTodayHotAreaList";// 商圈最热
    String MYBUSINESSDIARYMYCOLLECT = "/tradingarea/queryMyFollowAreaList";// 商圈我关注的
    String MYBUSINESSDIARYNEAR = "/tradingarea/queryNearAreaList";//商圈离我最近的
    String MYBUSINESSCOLLECTDIARYUSER = "/areafan/followUser";//关注用户
    String MYBUSINESSCANCELCOLLECTUSER = "/areafan/cancelFollowUser";//取消关注
    String DIARYZANLIST = "/tradingarea/queryFabulousList";// 日记点赞人员列表
    String DIARYLOOKLIST = "/tradingarea/queryAreaSeeList";// 日记看过的列表
    String DIARYCONTENT = "/tradingarea/findTradingAreaDetails";// 日记详情
    String DIARYCOMLIST = "/areacomment/queryCommentAreaList";// 日记评论列表
    String MYBUSINESSDIARYAWORD = "/tradingarea/areaReward";// 打赏
    String DIARYAWORDYIVIPAY = "/yivipay/areaRewardPay";//打赏钱包支付
    String DIARYAWORDALIPAY = "/alipay/areaRewardAliPay";//阿里支付
    String MYBUSINESSDIARYREPORT = "/tradingarea/reportArea";//举报商圈
    String COMMENTDIARY = "/areacomment/commentArea";//评论商圈
    String BACKCOMMENT = "/areacomment/commentArea";// 回复评论
    String COMMENTBACKLIST = "/areacomment/queryReplyList";//评论下的回复列表
    String COMMENTBACKORBACK = "/areacomment/replyArea";// 回复评论或回复
    String USERBUSINESS = "/tradingarea/queryMyTradingArea";//用户商圈列表接口 包含信息
    String DELETEDIARY = "/tradingarea/deleteArea";//删除自己的商圈
    String MYCOLLECTUSER = "/areafan/queryFanToMeList";// 我关注的
    String MYFANSLIST = "/areafan/queryMyFansList";//我的粉丝列表
    String REWORDTOMELIST = "/tradingarea/queryRewardToMeList";// 打赏我的列表
    String SENDFENSREDPACKET = "/arearedpacket/pushFansRedPacket";// 粉丝红包
    String FANSREDPAYYIVI = "/yivipay/areaRedPay";//红包钱包支付
    String FANSREDPAYALI = "/alipay/areaRedPay";//红包阿里支付
    String MYFANSREDPACKETSTREAM = "/arearedpacket/findRedPacketsFromArea";//某一红包明细
    String MYALLFANSREDPACKETSTREAM = "/arearedpacket/queryMyPushAreaRedPacket";//所有个人粉丝红包明细
    String MYBUSINESSFANSCRYRED = "/arearedpacket/grabRedPacket";//我的粉丝抢红包
    String TOMYFANSREDPACKETLIST = "/arearedpacket/queryComeAreaRedPacket";//我收到的粉丝红包列表
    String CRYFANSRED = "/arearedpacket/grabRedPacket";//抢粉丝红包
    String HOPECRYTOLIST ="/bonus/findBonusList";//获取已抢心愿列表

    String GETRONGTOKEN = "/rongyun/token";//获取容云token
    String GETOTHERUSERINFO = "/celebrityguess/queryUserInfo";//查看他人信息

    String USERIDENTITYINFO = "/alipay/identityAndYwUserAudit";//实名认证及一喂员升级阿里支付
    String USERIDENTITYYIVIPAY = "/yivipay/identityAndYwUserAudit";// 实名认证一喂支付
    String YIVIERYIVIPAY = "/yivipay/orderDeposit";//一喂员升级钱包支付
    String LOADAAPK = "http://app.qq.com/#id=detail&appid=1106283851";
    String READNOTICE = "/notice/updateNoticeHasRead";//设置公告已读
    String NEWMYADVICE ="/user/adaptAdvice";//新版意见建议
    String GETUSERNOIDENTITYINFO = "/user/getUserLastInfo";//获取实名未通过的实名资料
    String GETCARIDENTITYINFO = "/vehicle/getOwnerLastAuditInfo";// 车辆认证
    String CHEXTVERSION = "/config/getAppConfigByChannel";// 检查更新接口
    String HOPERECEIVERLIST = "/bonus/getMyReceivedBless";//收到的祝福列表
    String HOPESENDLIST = "/bonus/getMySendBless";//发送的祝福列表

    String GETHOMELIST = "/shunfeng/getMainPage";// 乘客首页列表接口
    String GETOWNERMINELIST = "/shunfeng/getOwnerTradeOrderList";// 车主进行中的订单
    String GETPINCHEBOOKMONEYORID = "/shunfeng/publishServiceByRole";// 获取订单价格和id
    String OWNERSENDBOOK = "/shunfeng/ownerCertainPublishService";// 车主发布
    String PASSENGERSENDBOOK = "/shunfeng/passerCertainPublishService";// 乘客发布
    String GETOWNERORPASSENGERMONITORLIST = "/shunfeng/getMonitorOrderList";// 获取监控列表
    String GETMATCHINGBOOKLIST = "/shunfeng/getMonitorListDetail";// 获取匹配订单
    String PASSENGERGETNEAROWNERBOOK = "/shunfeng/getPasserNearbyServiceList";// 乘客检索附近的车主订单列表
    String HINTPASSENGERPAYOROVERORDER = "/shunfeng/alertPasser";// 提醒乘客付款或完结订单  推送类型；2054：提醒乘客去付款；2055：提醒乘客完结订单
}

