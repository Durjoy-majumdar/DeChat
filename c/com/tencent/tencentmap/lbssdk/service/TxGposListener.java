package com.tencent.tencentmap.lbssdk.service;

public interface TxGposListener {
    void onTxGposLocation(int[] iArr, double[] dArr);

    void onTxGposNmeaGsv(byte[] bArr);

    void onTxRtcmReceived(int[] iArr);
}
