package com.tencent.kinda.gen;

public final class NoticeItem {
    public int mIsShowNotice;
    public String mJumpUrl;
    public String mLeftIcon;
    public String mNoticeId;
    public String mWording;

    public NoticeItem() {
    }

    public NoticeItem(int i, String str, String str2, String str3, String str4) {
        this.mIsShowNotice = i;
        this.mWording = str;
        this.mLeftIcon = str2;
        this.mJumpUrl = str3;
        this.mNoticeId = str4;
    }

    public int getIsShowNotice() {
        return this.mIsShowNotice;
    }

    public String getJumpUrl() {
        return this.mJumpUrl;
    }

    public String getLeftIcon() {
        return this.mLeftIcon;
    }

    public String getNoticeId() {
        return this.mNoticeId;
    }

    public String getWording() {
        return this.mWording;
    }

    public String toString() {
        return "NoticeItem{mIsShowNotice=" + this.mIsShowNotice + ",mWording=" + this.mWording + ",mLeftIcon=" + this.mLeftIcon + ",mJumpUrl=" + this.mJumpUrl + ",mNoticeId=" + this.mNoticeId + "}";
    }
}
