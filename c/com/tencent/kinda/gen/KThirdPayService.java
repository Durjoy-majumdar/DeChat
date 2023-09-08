package com.tencent.kinda.gen;

public interface KThirdPayService {
    boolean isDcepAppInstalled();

    boolean isYunShanFuAppInstalled();

    void startDcepPayImpl(String str, String str2, ITransmitKvData iTransmitKvData, VoidITransmitKvDataCallback voidITransmitKvDataCallback);

    void startYunShanFuPayImpl(String str, VoidITransmitKvDataCallback voidITransmitKvDataCallback);
}
