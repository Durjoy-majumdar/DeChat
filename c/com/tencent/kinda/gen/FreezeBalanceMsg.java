package com.tencent.kinda.gen;

public final class FreezeBalanceMsg {
    public long mBgColor;
    public String mLeftIcon;
    public String mRightIcon;
    public String mRouteUrl;
    public String mWording;
    public long mWordingColor;
    public int mWordingSize;

    public FreezeBalanceMsg() {
    }

    public FreezeBalanceMsg(String str, long j, int i, long j2, String str2, String str3, String str4) {
        this.mWording = str;
        this.mWordingColor = j;
        this.mWordingSize = i;
        this.mBgColor = j2;
        this.mRouteUrl = str2;
        this.mLeftIcon = str3;
        this.mRightIcon = str4;
    }

    public long getBgColor() {
        return this.mBgColor;
    }

    public String getLeftIcon() {
        return this.mLeftIcon;
    }

    public String getRightIcon() {
        return this.mRightIcon;
    }

    public String getRouteUrl() {
        return this.mRouteUrl;
    }

    public String getWording() {
        return this.mWording;
    }

    public long getWordingColor() {
        return this.mWordingColor;
    }

    public int getWordingSize() {
        return this.mWordingSize;
    }

    public String toString() {
        return "FreezeBalanceMsg{mWording=" + this.mWording + ",mWordingColor=" + this.mWordingColor + ",mWordingSize=" + this.mWordingSize + ",mBgColor=" + this.mBgColor + ",mRouteUrl=" + this.mRouteUrl + ",mLeftIcon=" + this.mLeftIcon + ",mRightIcon=" + this.mRightIcon + "}";
    }
}
