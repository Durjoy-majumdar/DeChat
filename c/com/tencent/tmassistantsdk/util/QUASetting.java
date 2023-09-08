package com.tencent.tmassistantsdk.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import p156gj.C87203t;

public class QUASetting {
    public static final String APP_VERSION = "100";
    public static final String BUILD_NO = "100";
    public static final int ROOT_STATUS_UNKNOWN = 0;
    public static final String UN_DEFINED = "NA";
    public static String mChannelId = "NA";
    public Context mContext;

    public QUASetting(Context context) {
        this.mContext = context;
    }

    private StringBuffer filter(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (TextUtils.isEmpty(str)) {
            stringBuffer.append(UN_DEFINED);
            return stringBuffer;
        }
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (!(c <= ' ' || c == '/' || c == '_' || c == '&' || c == '|' || c == '-')) {
                stringBuffer.append(c);
            }
        }
        return stringBuffer;
    }

    private String getAndroidVersion() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = Build.VERSION.RELEASE;
        if (TextUtils.isEmpty(str)) {
            stringBuffer.append(UN_DEFINED);
        } else {
            stringBuffer.append(str);
        }
        stringBuffer.append("_");
        stringBuffer.append(Build.VERSION.SDK_INT);
        return stringBuffer.toString();
    }

    public static String getBuildNo() {
        return "100";
    }

    private int getDeviceHeight() {
        return this.mContext.getResources().getDisplayMetrics().heightPixels;
    }

    private int getDeviceWidth() {
        return this.mContext.getResources().getDisplayMetrics().widthPixels;
    }

    private int getRootStatus() {
        return 0;
    }

    private String getUA() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(filter(Build.BRAND));
        stringBuffer.append("_");
        stringBuffer.append(filter(C87203t.m108275k()));
        return stringBuffer.toString();
    }

    public String buildQUA() {
        QUABuilder qUABuilder = new QUABuilder();
        qUABuilder.mBuildNo = getBuildNo();
        qUABuilder.mChannel = "";
        qUABuilder.mChannelId = mChannelId;
        qUABuilder.mAdrRelease = getAndroidVersion();
        qUABuilder.mDeviceHeight = getDeviceHeight();
        qUABuilder.mDeviceWidth = getDeviceWidth();
        qUABuilder.mRootStatus = getRootStatus();
        qUABuilder.mUA = getUA();
        qUABuilder.mVersionName = "100";
        return qUABuilder.get();
    }
}
