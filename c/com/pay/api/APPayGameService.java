package com.pay.api;

import com.pay.AndroidPay;
import com.pay.http.APBaseHttpReq;
import com.pay.http.APHttpHandle;
import com.pay.http.IAPHttpAnsObserver;
import com.pay.network.model.APMpAns;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.midas.api.APMidasResponse;
import com.tencent.midas.api.IAPMidasNetCallBack;
import com.tencent.midas.api.IAPMidasPayCallBack;
import com.tencent.midas.api.request.APMidasBaseRequest;
import com.tencent.midas.api.request.APMidasGameRequest;
import com.tencent.midas.api.request.APMidasGoodsRequest;
import com.tencent.midas.api.request.APMidasNetRequest;
import com.tencent.midas.comm.APBeanUtil;
import com.tencent.midas.comm.APLog;
import java.util.HashMap;

public class APPayGameService {
    public static final String ACCOUNT_TYPE_COMMON = "common";
    public static final String ACCOUNT_TYPE_SECURITY = "secrety";
    public static final int LOGINPLATFORM_MOBILEQQ = 2;
    public static final int LOGINPLATFORM_WECHAT = 1;
    public static final String PAY_CHANNEL_BANK = "bank";
    public static final String PAY_CHANNEL_WECHAT = "wechat";
    private static IAPMidasPayCallBack midasCallBack = new IAPMidasPayCallBack() {
        public void MidasPayCallBack(APMidasResponse aPMidasResponse) {
            if (APPayGameService.serviceDelegate != null) {
                APPayResponseInfo aPPayResponseInfo = new APPayResponseInfo();
                try {
                    APBeanUtil.copyProperties(aPMidasResponse, aPPayResponseInfo);
                } catch (Exception e) {
                    APLog.m161214i("APPayGameService", "midas callBack copyProperties error:" + e.toString());
                }
                APLog.m161214i("midasCallBack", "MidasPayCallBack");
                APPayGameService.serviceDelegate.PayGameServiceCallBack(aPPayResponseInfo);
            }
        }

        public void MidasPayNeedLogin() {
            if (APPayGameService.serviceDelegate != null) {
                APLog.m161214i("midasCallBack", "MidasPayNeedLogin");
                APPayGameService.serviceDelegate.PayGameNeedLogin();
            }
        }
    };
    /* access modifiers changed from: private */
    public static IAPPayGameServiceCallBack serviceDelegate;

    public static IAPPayGameServiceCallBack GetDelegate() {
        return serviceDelegate;
    }

    public static void LauchVmallView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        APMidasGoodsRequest aPMidasGoodsRequest = new APMidasGoodsRequest();
        setCommParams(aPMidasGoodsRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasGoodsRequest.mallType = 2;
        APMidasPayAPI.launchPay(AndroidPay.singleton().fromActivity, aPMidasGoodsRequest, midasCallBack);
    }

    public static void LaunchGroupBuyView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        APMidasGoodsRequest aPMidasGoodsRequest = new APMidasGoodsRequest();
        setCommParams(aPMidasGoodsRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasGoodsRequest.mallType = 1;
        APMidasPayAPI.launchPay(AndroidPay.singleton().fromActivity, aPMidasGoodsRequest, midasCallBack);
    }

    public static void LaunchMPSaveCurrencyView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, String str11, String str12, String str13) {
        APMidasGameRequest aPMidasGameRequest = new APMidasGameRequest();
        setCommParams(aPMidasGameRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasGameRequest.acctType = str8;
        aPMidasGameRequest.saveValue = str9;
        aPMidasGameRequest.resId = i;
        APMidasBaseRequest.APMidasMPInfo aPMidasMPInfo = aPMidasGameRequest.mpInfo;
        aPMidasMPInfo.payChannel = str10;
        aPMidasMPInfo.discountType = str11;
        aPMidasMPInfo.discountUrl = str12;
        aPMidasMPInfo.extras = str13;
        APMidasPayAPI.launchPay(AndroidPay.singleton().fromActivity, aPMidasGameRequest, midasCallBack);
    }

    public static void LaunchMPSaveGoodsView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10, String str11, String str12) {
        APMidasGoodsRequest aPMidasGoodsRequest = new APMidasGoodsRequest();
        aPMidasGoodsRequest.tokenType = 1;
        setCommParams(aPMidasGoodsRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasGoodsRequest.goodsTokenUrl = str8;
        aPMidasGoodsRequest.resId = i;
        APMidasBaseRequest.APMidasMPInfo aPMidasMPInfo = aPMidasGoodsRequest.mpInfo;
        aPMidasMPInfo.payChannel = str9;
        aPMidasMPInfo.discountType = str10;
        aPMidasMPInfo.discountUrl = str11;
        aPMidasMPInfo.extras = str12;
        APMidasPayAPI.launchPay(AndroidPay.singleton().fromActivity, aPMidasGoodsRequest, midasCallBack);
    }

    public static void LaunchMp(String str, String str2, String str3, String str4, String str5, String str6, String str7, IAPHttpAnsObserver iAPHttpAnsObserver) {
        startMpNetWork(str, str2, str3, str4, str5, str6, str7, "", iAPHttpAnsObserver);
    }

    public static void LaunchSaveCurrencyView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, int i) {
        APMidasGameRequest aPMidasGameRequest = new APMidasGameRequest();
        setCommParams(aPMidasGameRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasGameRequest.acctType = str8;
        aPMidasGameRequest.saveValue = str9;
        aPMidasGameRequest.isCanChange = z;
        aPMidasGameRequest.resId = i;
        APMidasPayAPI.launchPay(AndroidPay.singleton().fromActivity, aPMidasGameRequest, midasCallBack);
    }

    public static void LaunchSaveGoodsView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        APMidasGoodsRequest aPMidasGoodsRequest = new APMidasGoodsRequest();
        aPMidasGoodsRequest.tokenType = 1;
        setCommParams(aPMidasGoodsRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasGoodsRequest.goodsTokenUrl = str8;
        aPMidasGoodsRequest.resId = i;
        APMidasPayAPI.launchPay(AndroidPay.singleton().fromActivity, aPMidasGoodsRequest, midasCallBack);
    }

    public static void LaunchSaveGoodsViewWithoutToken(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, String str10) {
        APMidasGoodsRequest aPMidasGoodsRequest = new APMidasGoodsRequest();
        aPMidasGoodsRequest.tokenType = 2;
        setCommParams(aPMidasGoodsRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasGoodsRequest.prodcutId = str8;
        aPMidasGoodsRequest.saveValue = str9;
        aPMidasGoodsRequest.isCanChange = z;
        APMidasPayAPI.launchPay(AndroidPay.singleton().fromActivity, aPMidasGoodsRequest, midasCallBack);
    }

    public static void SetDelegate(IAPPayGameServiceCallBack iAPPayGameServiceCallBack) {
        serviceDelegate = iAPPayGameServiceCallBack;
    }

    @Deprecated
    public static void SetNeedReloginInSDK(boolean z) {
    }

    public static void release() {
        serviceDelegate = null;
    }

    @Deprecated
    public static void reportCrashApLog(Throwable th) {
    }

    private static void setCommParams(APMidasBaseRequest aPMidasBaseRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        aPMidasBaseRequest.offerId = AndroidPay.singleton().offerId;
        aPMidasBaseRequest.openId = str;
        aPMidasBaseRequest.openKey = str2;
        aPMidasBaseRequest.sessionId = str3;
        aPMidasBaseRequest.sessionType = str4;
        aPMidasBaseRequest.zoneId = str5;
        aPMidasBaseRequest.f343435pf = str6;
        aPMidasBaseRequest.pfKey = str7;
        aPMidasBaseRequest.extendInfo.unit = AndroidPay.singleton().unit;
        aPMidasBaseRequest.extendInfo.isShowNum = AndroidPay.singleton().isShowNum;
        aPMidasBaseRequest.resData = AndroidPay.singleton().resdata;
        aPMidasBaseRequest.extendInfo.isShowListOtherNum = AndroidPay.singleton().isShowListOtherNum;
    }

    private static void startMpNetWork(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, IAPHttpAnsObserver iAPHttpAnsObserver) {
        String str9 = str8;
        final IAPHttpAnsObserver iAPHttpAnsObserver2 = iAPHttpAnsObserver;
        APMidasNetRequest aPMidasNetRequest = new APMidasNetRequest();
        setCommParams(aPMidasNetRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasNetRequest.reqType = APMidasNetRequest.NET_REQ_MP;
        if (str9 != null || "".equals(str9)) {
            aPMidasNetRequest.mpInfo.drmInfo = str9;
        }
        final APMpAns aPMpAns = new APMpAns(APHttpHandle.getIntanceHandel(), iAPHttpAnsObserver2, new HashMap(), APMidasNetRequest.NET_REQ_MP);
        APMidasPayAPI.launchNet(AndroidPay.singleton().fromActivity, aPMidasNetRequest, new IAPMidasNetCallBack() {
            public void MidasNetError(String str, int i, String str2) {
                APMpAns aPMpAns = aPMpAns;
                aPMpAns.resultCode = i;
                aPMpAns.resultMsg = str2;
                iAPHttpAnsObserver2.onError(aPMpAns);
            }

            public void MidasNetFinish(String str, String str2) {
                aPMpAns.onFinishAns(str2.getBytes(), (APBaseHttpReq) null);
                iAPHttpAnsObserver2.onFinish(aPMpAns);
            }

            public void MidasNetStop(String str) {
                iAPHttpAnsObserver2.onStop(aPMpAns);
            }
        });
    }

    public static void LaunchMp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, IAPHttpAnsObserver iAPHttpAnsObserver) {
        startMpNetWork(str, str2, str3, str4, str5, str6, str7, str8, iAPHttpAnsObserver);
    }

    public static void LaunchSaveCurrencyView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, int i, String str10, String str11) {
        APMidasGameRequest aPMidasGameRequest = new APMidasGameRequest();
        setCommParams(aPMidasGameRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasGameRequest.acctType = str8;
        aPMidasGameRequest.saveValue = str9;
        aPMidasGameRequest.isCanChange = z;
        aPMidasGameRequest.resId = i;
        APMidasBaseRequest.APMidasMPInfo aPMidasMPInfo = aPMidasGameRequest.mpInfo;
        aPMidasMPInfo.drmInfo = str10;
        aPMidasMPInfo.discoutId = str11;
        APMidasPayAPI.launchPay(AndroidPay.singleton().fromActivity, aPMidasGameRequest, midasCallBack);
    }

    public static void LaunchSaveCurrencyView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        APMidasGameRequest aPMidasGameRequest = new APMidasGameRequest();
        setCommParams(aPMidasGameRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasGameRequest.acctType = str8;
        aPMidasGameRequest.saveValue = "";
        aPMidasGameRequest.isCanChange = true;
        aPMidasGameRequest.resId = i;
        APMidasPayAPI.launchPay(AndroidPay.singleton().fromActivity, aPMidasGameRequest, midasCallBack);
    }

    public static void LaunchSaveCurrencyView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, String str10) {
        APMidasGameRequest aPMidasGameRequest = new APMidasGameRequest();
        setCommParams(aPMidasGameRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasGameRequest.acctType = str8;
        aPMidasGameRequest.saveValue = "";
        aPMidasGameRequest.isCanChange = true;
        aPMidasGameRequest.resId = i;
        APMidasBaseRequest.APMidasMPInfo aPMidasMPInfo = aPMidasGameRequest.mpInfo;
        aPMidasMPInfo.drmInfo = str9;
        aPMidasMPInfo.discoutId = str10;
        APMidasPayAPI.launchPay(AndroidPay.singleton().fromActivity, aPMidasGameRequest, midasCallBack);
    }
}
