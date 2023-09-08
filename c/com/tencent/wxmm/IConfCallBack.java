package com.tencent.wxmm;

import java.nio.ByteBuffer;

public interface IConfCallBack {
    byte[] callBackFromConf(int i, int i2, byte[] bArr);

    void callbackVideoFrame(int i, ByteBuffer byteBuffer, int i2, int i3, int i4);

    void callbackWriteLog(int i, String str, String str2, int i2, String str3, String str4, int i3);
}
