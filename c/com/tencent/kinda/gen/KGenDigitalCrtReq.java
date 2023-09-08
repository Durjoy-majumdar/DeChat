package com.tencent.kinda.gen;

public final class KGenDigitalCrtReq {
    public int mCertEncryptType;
    public String mCreTail;
    public String mIdNo;
    public int mIdType;
    public String mReqKey;
    public String mToken;
    public int mType;
    public String mVerifyCode;

    public KGenDigitalCrtReq() {
    }

    public KGenDigitalCrtReq(int i, int i2, String str, String str2, String str3, String str4, String str5, int i3) {
        this.mType = i;
        this.mIdType = i2;
        this.mIdNo = str;
        this.mReqKey = str2;
        this.mVerifyCode = str3;
        this.mToken = str4;
        this.mCreTail = str5;
        this.mCertEncryptType = i3;
    }

    public int getCertEncryptType() {
        return this.mCertEncryptType;
    }

    public String getCreTail() {
        return this.mCreTail;
    }

    public String getIdNo() {
        return this.mIdNo;
    }

    public int getIdType() {
        return this.mIdType;
    }

    public String getReqKey() {
        return this.mReqKey;
    }

    public String getToken() {
        return this.mToken;
    }

    public int getType() {
        return this.mType;
    }

    public String getVerifyCode() {
        return this.mVerifyCode;
    }

    public String toString() {
        return "KGenDigitalCrtReq{mType=" + this.mType + ",mIdType=" + this.mIdType + ",mIdNo=" + this.mIdNo + ",mReqKey=" + this.mReqKey + ",mVerifyCode=" + this.mVerifyCode + ",mToken=" + this.mToken + ",mCreTail=" + this.mCreTail + ",mCertEncryptType=" + this.mCertEncryptType + "}";
    }
}
