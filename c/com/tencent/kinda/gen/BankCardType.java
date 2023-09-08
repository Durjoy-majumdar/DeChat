package com.tencent.kinda.gen;

public final class BankCardType {
    public String mBankName;
    public String mBankType;
    public String mBankaccType;
    public String mBankaccTypeName;
    public String mForbidWord;
    public boolean mIsMaintainance;

    public BankCardType() {
    }

    public BankCardType(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.mBankType = str;
        this.mBankName = str2;
        this.mBankaccType = str3;
        this.mBankaccTypeName = str4;
        this.mIsMaintainance = z;
        this.mForbidWord = str5;
    }

    public String getBankName() {
        return this.mBankName;
    }

    public String getBankType() {
        return this.mBankType;
    }

    public String getBankaccType() {
        return this.mBankaccType;
    }

    public String getBankaccTypeName() {
        return this.mBankaccTypeName;
    }

    public String getForbidWord() {
        return this.mForbidWord;
    }

    public boolean getIsMaintainance() {
        return this.mIsMaintainance;
    }

    public String toString() {
        return "BankCardType{mBankType=" + this.mBankType + ",mBankName=" + this.mBankName + ",mBankaccType=" + this.mBankaccType + ",mBankaccTypeName=" + this.mBankaccTypeName + ",mIsMaintainance=" + this.mIsMaintainance + ",mForbidWord=" + this.mForbidWord + "}";
    }
}
