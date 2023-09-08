package com.pay;

import android.app.Activity;
import android.content.Context;
import com.pay.api.APPayResponseInfo;
import com.tencent.midas.api.APMidasPayAPI;

public class AndroidPay {
    public static final int LANDSCAPE = 0;
    public static final int PORTRAINT = 1;
    private static volatile AndroidPay gInstance;
    public Context applicationContext;
    public Activity fromActivity;
    public boolean isShowListOtherNum;
    public boolean isShowNum;
    public String offerId;
    public APPayResponseInfo payResponseInfo;
    public byte[] resdata;
    public String unit;

    private AndroidPay() {
        this.applicationContext = null;
        this.payResponseInfo = null;
        this.unit = "";
        this.isShowNum = true;
        this.isShowListOtherNum = true;
        this.payResponseInfo = new APPayResponseInfo();
    }

    public static void Destory() {
    }

    public static String getPaySDKVersion(Activity activity) {
        return APMidasPayAPI.getMidasSDKVersion(activity);
    }

    public static void setCustomUrlParam(String str) {
    }

    public static void setElseNumberVisible(boolean z) {
        gInstance.isShowListOtherNum = z;
    }

    public static void setEnv(String str) {
        APMidasPayAPI.setEnv(str);
    }

    public static void setIsShowSaveNum(boolean z) {
        gInstance.isShowNum = z;
    }

    public static void setLogEnable(boolean z) {
        APMidasPayAPI.setLogEnable(z);
    }

    public static void setNumberVisible(boolean z) {
        setIsShowSaveNum(z);
    }

    public static void setOfferId(String str) {
        gInstance.offerId = str;
    }

    public static void setPropUnit(String str) {
        gInstance.unit = str;
    }

    public static void setResData(byte[] bArr) {
        gInstance.resdata = bArr;
    }

    public static void setScreenType(int i) {
    }

    public static void setWechatAppId(String str) {
    }

    public static AndroidPay singleton() {
        if (gInstance == null) {
            synchronized (AndroidPay.class) {
                if (gInstance == null) {
                    gInstance = new AndroidPay();
                }
            }
        }
        return gInstance;
    }

    public Context getContext() {
        return this.applicationContext;
    }
}
