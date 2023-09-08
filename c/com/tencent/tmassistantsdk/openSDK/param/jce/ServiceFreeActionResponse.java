package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

public final class ServiceFreeActionResponse extends JceStruct {
    public static byte[] cache_revertField;
    public byte[] revertField;

    public ServiceFreeActionResponse() {
        this.revertField = null;
    }

    public void readFrom(JceInputStream jceInputStream) {
        if (cache_revertField == null) {
            byte[] bArr = new byte[1];
            cache_revertField = bArr;
            bArr[0] = 0;
        }
        this.revertField = jceInputStream.read(cache_revertField, 0, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        byte[] bArr = this.revertField;
        if (bArr != null) {
            jceOutputStream.write(bArr, 0);
        }
    }

    public ServiceFreeActionResponse(byte[] bArr) {
        this.revertField = bArr;
    }
}
