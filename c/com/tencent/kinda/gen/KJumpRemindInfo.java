package com.tencent.kinda.gen;

public final class KJumpRemindInfo {
    public boolean mIsPopUpWindows;
    public int mJumpType;
    public String mLeftButtonWording;
    public String mRightButtonWording;
    public String mTitle;
    public KRedirectUrl mUrl;
    public String mWording;

    public KJumpRemindInfo() {
    }

    public KJumpRemindInfo(int i, boolean z, String str, String str2, String str3, KRedirectUrl kRedirectUrl, String str4) {
        this.mJumpType = i;
        this.mIsPopUpWindows = z;
        this.mWording = str;
        this.mLeftButtonWording = str2;
        this.mRightButtonWording = str3;
        this.mUrl = kRedirectUrl;
        this.mTitle = str4;
    }

    public boolean getIsPopUpWindows() {
        return this.mIsPopUpWindows;
    }

    public int getJumpType() {
        return this.mJumpType;
    }

    public String getLeftButtonWording() {
        return this.mLeftButtonWording;
    }

    public String getRightButtonWording() {
        return this.mRightButtonWording;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public KRedirectUrl getUrl() {
        return this.mUrl;
    }

    public String getWording() {
        return this.mWording;
    }

    public String toString() {
        return "KJumpRemindInfo{mJumpType=" + this.mJumpType + ",mIsPopUpWindows=" + this.mIsPopUpWindows + ",mWording=" + this.mWording + ",mLeftButtonWording=" + this.mLeftButtonWording + ",mRightButtonWording=" + this.mRightButtonWording + ",mUrl=" + this.mUrl + ",mTitle=" + this.mTitle + "}";
    }
}
