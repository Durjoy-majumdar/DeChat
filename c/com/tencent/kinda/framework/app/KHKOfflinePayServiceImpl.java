package com.tencent.kinda.framework.app;

import com.tencent.kinda.framework.api.IHKOfflinePayServices;
import com.tencent.kinda.gen.KHKOfflinePayService;
import com.tencent.kinda.gen.VoidBoolCallback;
import di3.C86312j;

public class KHKOfflinePayServiceImpl implements KHKOfflinePayService {
    private static final String TAG = "KHKOfflinePayServiceImpl";

    public byte[] decryptByAes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).decryptByAes(bArr, bArr2, bArr3);
    }

    public String decryptByCftCert(String str, String str2) {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).decryptByCftCert(str, str2);
    }

    public boolean deleteCftCert(String str) {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).deleteCftCert(str);
    }

    public byte[] encryptByAes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).encryptByAes(bArr, bArr2, bArr3);
    }

    public String genAlgoToken(String str, int i, int i2, byte[] bArr, long j, long j2, long j3, int i3) {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).genAlgoToken(str, i, i2, bArr, j, j2, j3, i3);
    }

    public String getCertid() {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).getCertid();
    }

    public String getCftCSR(String str) {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).getCftCSR(str);
    }

    public String getCftCertSign(String str, String str2) {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).getCftCertSign(str, str2);
    }

    public String getDeviceid() {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).getDeviceid();
    }

    public String getLastSelectedCVItemId() {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).getLastSelectedCVItemId();
    }

    public String getLastSelectedCardBindSerial() {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).getLastSelectedCardBindSerial();
    }

    public String getOfflinePayAckKey() {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).getOfflinePayAckKey();
    }

    public boolean importCftCert(String str, String str2) {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).importCftCert(str, str2);
    }

    public boolean isCertExists(String str) {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).isCertExists(str);
    }

    public void openHKFacingReceiveView() {
        ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).openHKFacingReceiveView();
    }

    public void openHalfPageWebViewImpl(String str, VoidBoolCallback voidBoolCallback) {
        ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).openHalfPageWebViewImpl(str, voidBoolCallback);
    }

    public void openScanQrCodeView() {
        ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).openScanQrCodeView();
    }

    public void removeCertid() {
        ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).removeCertId();
    }

    public boolean setCertid(String str) {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).setCertid(str);
    }

    public boolean setDeviceid(String str) {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).setDeviceid(str);
    }

    public void setLastSelectedCVItemId(String str) {
        ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).setLastSelectedCVItemId(str);
    }

    public void setLastSelectedCardBindSerial(String str) {
        ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).setLastSelectedCardBindSerial(str);
    }

    public void setOfflinePayAckKey(String str) {
        ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).setOfflinePayAckKey(str);
    }

    public String sha256Hex(byte[] bArr) {
        return ((IHKOfflinePayServices) C86312j.m106911c(IHKOfflinePayServices.class)).sha256Hex(bArr);
    }
}
