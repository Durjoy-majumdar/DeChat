package com.tencent.kinda.gen;

public final class Wording {
    public String mDesc;
    public String mEntryTip;
    public boolean mNeedshow;
    public String mSubDesc;
    public String mSubTitle;
    public String mTitle;

    public Wording() {
    }

    public Wording(boolean z, String str, String str2, String str3, String str4, String str5) {
        this.mNeedshow = z;
        this.mEntryTip = str;
        this.mTitle = str2;
        this.mSubTitle = str3;
        this.mDesc = str4;
        this.mSubDesc = str5;
    }

    public String getDesc() {
        return this.mDesc;
    }

    public String getEntryTip() {
        return this.mEntryTip;
    }

    public boolean getNeedshow() {
        return this.mNeedshow;
    }

    public String getSubDesc() {
        return this.mSubDesc;
    }

    public String getSubTitle() {
        return this.mSubTitle;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String toString() {
        return "Wording{mNeedshow=" + this.mNeedshow + ",mEntryTip=" + this.mEntryTip + ",mTitle=" + this.mTitle + ",mSubTitle=" + this.mSubTitle + ",mDesc=" + this.mDesc + ",mSubDesc=" + this.mSubDesc + "}";
    }
}
