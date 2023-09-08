package com.tencent.kinda.gen;

public final class RsaEncryptResult {
    public String mBase64Str;
    public int mRet;

    public RsaEncryptResult() {
    }

    public RsaEncryptResult(String str, int i) {
        this.mBase64Str = str;
        this.mRet = i;
    }

    public String getBase64Str() {
        return this.mBase64Str;
    }

    public int getRet() {
        return this.mRet;
    }

    public String toString() {
        return "RsaEncryptResult{mBase64Str=" + this.mBase64Str + ",mRet=" + this.mRet + "}";
    }
}
