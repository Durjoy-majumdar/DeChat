package com.tencent.kinda.framework.api;

import di3.C7335d;

public interface IOfflinePayTsmServices extends C7335d {
    void cleanTsmToken(String str);

    String decryptByTsmCert(String str, String str2);

    boolean deleteTsmCert(String str);

    int getRemainTsmTokenCount(String str);

    String getTokenPrefix();

    String getTsmCSR(String str);

    String getTsmCertCAVersion();

    String getTsmCertSign(String str, String str2);

    String getTsmSignUserId();

    String getTsmToken(String str);

    boolean importTsmCert(String str, String str2);

    boolean isOfflinePayCertExists(String str);

    boolean setTsmTokenCode(String str, String str2);

    void updateTsmCert(String str, String[] strArr);
}
