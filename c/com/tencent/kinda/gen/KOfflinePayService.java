package com.tencent.kinda.gen;

import java.util.ArrayList;

public interface KOfflinePayService {
    void cleanCftToken(String str);

    String decryptByCftCert(String str, String str2);

    boolean deleteCftCert(String str);

    String getCertCAVersion();

    String getCertid();

    String getCftCSR(String str);

    String getCftCertSign(String str, String str2);

    String getCftToken(String str);

    int getCodever();

    String getDeviceid();

    int getKindaOfflinePayCertType();

    int getKindaOfflinePayCsrCertType();

    String getLastSelectedCardBankType();

    String getLastSelectedCardBindSerial();

    long getLastTokenUpdateTs();

    String getOfflinePayAckKey();

    boolean getOfflinePayHasSuccess();

    int getRegetTokenNum();

    int getRemainCftTokenNum(String str);

    String getSignUserId();

    String getTokenPin();

    int getTokenUpdateInterval();

    boolean importCftCert(String str, String str2);

    boolean isCertExists(String str);

    void removeCertid();

    boolean setCertid(String str);

    boolean setCftTokenCode(String str, String str2);

    boolean setCodever(int i);

    boolean setDeviceid(String str);

    boolean setKindaOfflinePayCertType(int i);

    boolean setKindaOfflinePayCsrCertType(int i);

    void setLastSelectedCardBindSerial(String str, String str2);

    void setLastTokenUpdateTs(long j);

    void setOfflinePayAckKey(String str);

    void setOfflinePayHasSuccess();

    void setOfflineStateClose();

    void setOfflineStateOpen();

    void setRegetTokenNum(int i);

    boolean setTokenPin(String str);

    void setTokenUpdateInterval(int i);

    void updateCert(String str, ArrayList<String> arrayList);
}
