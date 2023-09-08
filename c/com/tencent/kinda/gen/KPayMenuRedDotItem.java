package com.tencent.kinda.gen;

public final class KPayMenuRedDotItem {
    public long mExpireTime;
    public String mItemName;
    public String mWording;

    public KPayMenuRedDotItem() {
    }

    public KPayMenuRedDotItem(String str, long j, String str2) {
        this.mItemName = str;
        this.mExpireTime = j;
        this.mWording = str2;
    }

    public long getExpireTime() {
        return this.mExpireTime;
    }

    public String getItemName() {
        return this.mItemName;
    }

    public String getWording() {
        return this.mWording;
    }

    public String toString() {
        return "KPayMenuRedDotItem{mItemName=" + this.mItemName + ",mExpireTime=" + this.mExpireTime + ",mWording=" + this.mWording + "}";
    }
}
