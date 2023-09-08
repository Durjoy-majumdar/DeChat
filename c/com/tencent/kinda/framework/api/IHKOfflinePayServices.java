package com.tencent.kinda.framework.api;

import com.tencent.kinda.gen.VoidBoolCallback;
import di3.C7335d;

public interface IHKOfflinePayServices extends C7335d {
    byte[] decryptByAes(byte[] bArr, byte[] bArr2, byte[] bArr3);

    String decryptByCftCert(String str, String str2);

    boolean deleteCftCert(String str);

    byte[] encryptByAes(byte[] bArr, byte[] bArr2, byte[] bArr3);

    String genAlgoToken(String str, int i, int i2, byte[] bArr, long j, long j2, long j3, int i3);

    String getCertid();

    String getCftCSR(String str);

    String getCftCertSign(String str, String str2);

    String getDeviceid();

    String getLastSelectedCVItemId();

    String getLastSelectedCardBindSerial();

    String getOfflinePayAckKey();

    boolean importCftCert(String str, String str2);

    boolean isCertExists(String str);

    void openHKFacingReceiveView();

    void openHalfPageWebViewImpl(String str, VoidBoolCallback voidBoolCallback);

    void openScanQrCodeView();

    void removeCertId();

    boolean setCertid(String str);

    boolean setDeviceid(String str);

    void setLastSelectedCVItemId(String str);

    void setLastSelectedCardBindSerial(String str);

    void setOfflinePayAckKey(String str);

    String sha256Hex(byte[] bArr);
}
