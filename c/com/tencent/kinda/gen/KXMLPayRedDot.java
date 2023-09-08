package com.tencent.kinda.gen;

public final class KXMLPayRedDot {
    public long mExpireTime;
    public String mReddotId;
    public String mWording;

    public KXMLPayRedDot() {
    }

    public KXMLPayRedDot(String str, long j, String str2) {
        this.mReddotId = str;
        this.mExpireTime = j;
        this.mWording = str2;
    }

    public long getExpireTime() {
        return this.mExpireTime;
    }

    public String getReddotId() {
        return this.mReddotId;
    }

    public String getWording() {
        return this.mWording;
    }

    public String toString() {
        return "KXMLPayRedDot{mReddotId=" + this.mReddotId + ",mExpireTime=" + this.mExpireTime + ",mWording=" + this.mWording + "}";
    }
}
