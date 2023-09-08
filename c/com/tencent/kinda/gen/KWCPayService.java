package com.tencent.kinda.gen;

public interface KWCPayService {
    void clearFreezeBalanceMsg();

    void getBannerInfoImpl(int i, VoidITransmitKvDataNoticeItemCallback voidITransmitKvDataNoticeItemCallback);

    void getCardListAndUsrVerifiedInfoImpl(VoidITransmitKvDataCallback voidITransmitKvDataCallback);

    String getFiltedTruthName(String str);

    FreezeBalanceMsg getFreezeBalanceMsg();

    boolean isBalanceMasked();

    boolean isNeedWalletLock();

    boolean isSetWalletLock();

    void setBalanceMasked(boolean z);

    void startUseCaseImpl(String str, ITransmitKvData iTransmitKvData, VoidITransmitKvDataCallback voidITransmitKvDataCallback);
}
