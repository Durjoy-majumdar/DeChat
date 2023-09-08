package com.tencent.map.geolocation.sapp;

import android.os.Bundle;
import android.text.TextUtils;

public final class TencentLocationRequest {
    public static final int REQUEST_DOMAIN_MODE_COMMON = 0;
    public static final int REQUEST_DOMAIN_MODE_FOREGIN = 1;
    public static final int REQUEST_DOMAIN_MODE_IOT = 2;
    public static final int REQUEST_LEVEL_ADMIN_AREA = 3;
    public static final int REQUEST_LEVEL_GEO = 0;
    public static final int REQUEST_LEVEL_NAME = 1;
    public static final int REQUEST_LEVEL_POI = 4;
    public boolean mAllowCache;
    public boolean mAllowDirection;
    public boolean mAllowGps;
    public long mExpirationTime;
    public Bundle mExtras;
    public boolean mIndoorLocationMode;
    public long mInterval;
    public int mNumUpdates;
    public String mOpenId;
    public String mQQ;
    public int mRequestDomainMode;
    public int mRequestLevel;
    public String mSmallAppKey;

    public TencentLocationRequest() {
    }

    public static void copy(TencentLocationRequest tencentLocationRequest, TencentLocationRequest tencentLocationRequest2) {
        tencentLocationRequest.mInterval = tencentLocationRequest2.mInterval;
        tencentLocationRequest.mRequestLevel = tencentLocationRequest2.mRequestLevel;
        tencentLocationRequest.mAllowCache = tencentLocationRequest2.mAllowCache;
        tencentLocationRequest.mAllowDirection = tencentLocationRequest2.mAllowDirection;
        tencentLocationRequest.mExpirationTime = tencentLocationRequest2.mExpirationTime;
        tencentLocationRequest.mNumUpdates = tencentLocationRequest2.mNumUpdates;
        tencentLocationRequest.mIndoorLocationMode = tencentLocationRequest2.mIndoorLocationMode;
        tencentLocationRequest.mRequestDomainMode = tencentLocationRequest2.mRequestDomainMode;
        tencentLocationRequest.mAllowGps = tencentLocationRequest2.mAllowGps;
        tencentLocationRequest.mQQ = tencentLocationRequest2.mQQ;
        tencentLocationRequest.mSmallAppKey = tencentLocationRequest2.mSmallAppKey;
        tencentLocationRequest.mOpenId = tencentLocationRequest2.mOpenId;
        tencentLocationRequest.mExtras.clear();
        tencentLocationRequest.mExtras.putAll(tencentLocationRequest2.mExtras);
    }

    public static TencentLocationRequest create() {
        TencentLocationRequest tencentLocationRequest = new TencentLocationRequest();
        tencentLocationRequest.mInterval = 10000;
        tencentLocationRequest.mRequestLevel = 1;
        tencentLocationRequest.mAllowCache = true;
        tencentLocationRequest.mAllowDirection = false;
        tencentLocationRequest.mIndoorLocationMode = false;
        tencentLocationRequest.mRequestDomainMode = 0;
        tencentLocationRequest.mExpirationTime = 0;
        tencentLocationRequest.mNumUpdates = Integer.MAX_VALUE;
        tencentLocationRequest.mAllowGps = true;
        tencentLocationRequest.mQQ = "";
        tencentLocationRequest.mOpenId = "";
        tencentLocationRequest.mSmallAppKey = "";
        tencentLocationRequest.mExtras = new Bundle();
        return tencentLocationRequest;
    }

    private boolean isAllowedLevel(int i) {
        return i == 0 || i == 1 || i == 3 || i == 4 || i == 7;
    }

    public String getAndroidId() {
        String string = this.mExtras.getString("androidId");
        return string == null ? "" : string;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public long getInterval() {
        return this.mInterval;
    }

    public String getOpenId() {
        return this.mOpenId;
    }

    public String getQQ() {
        return this.mQQ;
    }

    public int getRequestDomainMode() {
        return this.mRequestDomainMode;
    }

    public int getRequestLevel() {
        return this.mRequestLevel;
    }

    public String getSmallAppKey() {
        return this.mSmallAppKey;
    }

    public long getmExpirationTime() {
        return this.mExpirationTime;
    }

    public boolean isAllowCache() {
        return this.mAllowCache;
    }

    public boolean isAllowDirection() {
        return this.mAllowDirection;
    }

    public boolean isAllowGPS() {
        return this.mAllowGps;
    }

    public boolean isIndoorLocationMode() {
        return this.mIndoorLocationMode;
    }

    public TencentLocationRequest setAllowCache(boolean z) {
        this.mAllowCache = z;
        return this;
    }

    public TencentLocationRequest setAllowDirection(boolean z) {
        this.mAllowDirection = z;
        return this;
    }

    public TencentLocationRequest setAllowGPS(boolean z) {
        this.mAllowGps = z;
        return this;
    }

    public TencentLocationRequest setAndroidId(String str) {
        if (str == null) {
            str = "";
        }
        this.mExtras.putString("androidId", str);
        return this;
    }

    public TencentLocationRequest setIndoorLocationMode(boolean z) {
        this.mIndoorLocationMode = z;
        return this;
    }

    public TencentLocationRequest setInterval(long j) {
        if (j >= 0) {
            this.mInterval = j;
            return this;
        }
        throw new IllegalArgumentException("interval should >= 0");
    }

    public TencentLocationRequest setLocationDomainMode(int i) {
        this.mRequestDomainMode = i;
        return this;
    }

    public TencentLocationRequest setOpenId(String str) {
        this.mOpenId = str;
        return this;
    }

    public TencentLocationRequest setQQ(String str) {
        this.mQQ = str;
        return this;
    }

    public TencentLocationRequest setRequestLevel(int i) {
        if (isAllowedLevel(i)) {
            this.mRequestLevel = i;
            return this;
        }
        throw new IllegalArgumentException("request_level: " + i + " not supported!");
    }

    public TencentLocationRequest setSmallAppKey(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mSmallAppKey = str;
        }
        return this;
    }

    public void setmExpirationTime(long j) {
        this.mExpirationTime = j;
    }

    public String toString() {
        return "TencentLocationRequest {interval=" + this.mInterval + "ms,level=" + this.mRequestLevel + ",allowCache=" + this.mAllowCache + ",allowGps=" + this.mAllowGps + ",allowDirection=" + this.mAllowDirection + ",QQ=" + this.mQQ + ",DomainMode=" + this.mRequestDomainMode + ",openId=" + this.mOpenId + "}";
    }

    public TencentLocationRequest(TencentLocationRequest tencentLocationRequest) {
        this.mInterval = tencentLocationRequest.mInterval;
        this.mRequestLevel = tencentLocationRequest.mRequestLevel;
        this.mAllowCache = tencentLocationRequest.mAllowCache;
        this.mAllowDirection = tencentLocationRequest.mAllowDirection;
        this.mExpirationTime = tencentLocationRequest.mExpirationTime;
        this.mNumUpdates = tencentLocationRequest.mNumUpdates;
        this.mAllowGps = tencentLocationRequest.mAllowGps;
        this.mIndoorLocationMode = tencentLocationRequest.mIndoorLocationMode;
        this.mRequestDomainMode = tencentLocationRequest.mRequestDomainMode;
        this.mQQ = tencentLocationRequest.mQQ;
        this.mSmallAppKey = tencentLocationRequest.mSmallAppKey;
        this.mOpenId = tencentLocationRequest.mOpenId;
        Bundle bundle = new Bundle();
        this.mExtras = bundle;
        bundle.putAll(tencentLocationRequest.mExtras);
    }
}
