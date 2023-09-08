package com.tencent.kinda.gen;

public interface KCrtService {
    void delCert();

    String getCrtNo();

    boolean hasCrt();

    boolean isCrtExist(String str);

    String sign(String str, byte[] bArr);

    void startDeleteDigitalCrtImpl(String str, VoidCallback voidCallback, VoidStringCallback voidStringCallback);

    void startGenDigitalCrtImpl(KGenDigitalCrtReq kGenDigitalCrtReq, VoidCallback voidCallback, VoidStringCallback voidStringCallback);

    String updateCurrentDeviceCertNoWithInfo(ITransmitKvData iTransmitKvData);
}
