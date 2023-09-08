package com.pay.api;

import com.pay.AndroidPay;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.midas.api.APMidasResponse;
import com.tencent.midas.api.IAPMidasPayCallBack;
import com.tencent.midas.api.request.APMidasBaseRequest;
import com.tencent.midas.api.request.APMidasMonthRequest;
import com.tencent.midas.api.request.APMidasSubscribeRequest;
import com.tencent.midas.comm.APBeanUtil;
import com.tencent.midas.comm.APLog;

public class APPayOpenService {
    private static IAPMidasPayCallBack midasCallBack = new IAPMidasPayCallBack() {
        public void MidasPayCallBack(APMidasResponse aPMidasResponse) {
            if (APPayOpenService.serviceDelegate != null) {
                APPayResponseInfo aPPayResponseInfo = new APPayResponseInfo();
                try {
                    APBeanUtil.copyProperties(aPMidasResponse, aPPayResponseInfo);
                } catch (Exception e) {
                    APLog.m161214i("APPayOpenService", "midasCallBack copyProperties error:" + e.toString());
                }
                APPayOpenService.serviceDelegate.PayOpenServiceCallBack(aPPayResponseInfo);
            }
        }

        public void MidasPayNeedLogin() {
            if (APPayOpenService.serviceDelegate != null) {
                APPayOpenService.serviceDelegate.PayOpenServiceNeedLogin();
            }
        }
    };
    /* access modifiers changed from: private */
    public static IAPPayOpenServiceCallBack serviceDelegate;

    public static IAPPayOpenServiceCallBack GetDelegate() {
        return serviceDelegate;
    }

    public static void LaunchOpenServiceView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, boolean z, String str11) {
        APMidasMonthRequest aPMidasMonthRequest = new APMidasMonthRequest();
        setCommParams(aPMidasMonthRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasMonthRequest.serviceCode = str8;
        aPMidasMonthRequest.serviceName = str9;
        aPMidasMonthRequest.resId = i;
        aPMidasMonthRequest.saveValue = str10;
        aPMidasMonthRequest.isCanChange = z;
        aPMidasMonthRequest.remark = str11;
        APMidasPayAPI.launchPay(AndroidPay.singleton().fromActivity, aPMidasMonthRequest, midasCallBack);
    }

    public static void SetDelegate(IAPPayOpenServiceCallBack iAPPayOpenServiceCallBack) {
        serviceDelegate = iAPPayOpenServiceCallBack;
    }

    @Deprecated
    public static void SetNeedReloginInSDK(boolean z) {
    }

    public static void release() {
        serviceDelegate = null;
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
    }

    public static void LaunchOpenServiceView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10) {
        APMidasMonthRequest aPMidasMonthRequest = new APMidasMonthRequest();
        setCommParams(aPMidasMonthRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasMonthRequest.serviceCode = str8;
        aPMidasMonthRequest.serviceName = str9;
        aPMidasMonthRequest.resId = i;
        aPMidasMonthRequest.remark = str10;
        APMidasPayAPI.launchPay(AndroidPay.singleton().fromActivity, aPMidasMonthRequest, midasCallBack);
    }

    public static void LaunchOpenServiceView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, String str11, boolean z, String str12) {
        APMidasSubscribeRequest aPMidasSubscribeRequest = new APMidasSubscribeRequest();
        setCommParams(aPMidasSubscribeRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasSubscribeRequest.serviceCode = str8;
        aPMidasSubscribeRequest.serviceName = str9;
        aPMidasSubscribeRequest.resId = i;
        aPMidasSubscribeRequest.saveValue = str10;
        aPMidasSubscribeRequest.productId = str11;
        aPMidasSubscribeRequest.isCanChange = z;
        aPMidasSubscribeRequest.remark = str12;
        APMidasPayAPI.launchPay(AndroidPay.singleton().fromActivity, aPMidasSubscribeRequest, midasCallBack);
    }

    public static void LaunchOpenServiceView(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, boolean z, String str11, boolean z2) {
        APMidasMonthRequest aPMidasMonthRequest = new APMidasMonthRequest();
        setCommParams(aPMidasMonthRequest, str, str2, str3, str4, str5, str6, str7);
        aPMidasMonthRequest.serviceCode = str8;
        aPMidasMonthRequest.serviceName = str9;
        aPMidasMonthRequest.resId = i;
        aPMidasMonthRequest.remark = str11;
        aPMidasMonthRequest.autoPay = z2;
        APMidasPayAPI.launchPay(AndroidPay.singleton().fromActivity, aPMidasMonthRequest, midasCallBack);
    }
}
