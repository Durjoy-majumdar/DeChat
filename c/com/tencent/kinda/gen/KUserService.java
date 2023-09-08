package com.tencent.kinda.gen;

public interface KUserService {
    String city();

    long localBalance();

    String province();

    void updateBalance(long j);

    void updateLqtBalance(long j);

    void updateUserInfo(ITransmitKvData iTransmitKvData);
}
