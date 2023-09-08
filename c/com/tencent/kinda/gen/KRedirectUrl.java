package com.tencent.kinda.gen;

public final class KRedirectUrl {
    public String mAppVersion;
    public String mAppid;
    public String mBtnName;
    public String mPath;
    public int mType;

    public KRedirectUrl() {
    }

    public KRedirectUrl(int i, String str, String str2, String str3, String str4) {
        this.mType = i;
        this.mAppid = str;
        this.mAppVersion = str2;
        this.mPath = str3;
        this.mBtnName = str4;
    }

    public String getAppVersion() {
        return this.mAppVersion;
    }

    public String getAppid() {
        return this.mAppid;
    }

    public String getBtnName() {
        return this.mBtnName;
    }

    public String getPath() {
        return this.mPath;
    }

    public int getType() {
        return this.mType;
    }

    public String toString() {
        return "KRedirectUrl{mType=" + this.mType + ",mAppid=" + this.mAppid + ",mAppVersion=" + this.mAppVersion + ",mPath=" + this.mPath + ",mBtnName=" + this.mBtnName + "}";
    }
}
