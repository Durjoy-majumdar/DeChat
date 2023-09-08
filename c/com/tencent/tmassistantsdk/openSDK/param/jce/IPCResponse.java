package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

public final class IPCResponse extends JceStruct {
    public static byte[] cache_body;
    public static IPCHead cache_head;
    public byte[] body;
    public IPCHead head;

    public IPCResponse() {
        this.head = null;
        this.body = null;
    }

    public void readFrom(JceInputStream jceInputStream) {
        if (cache_head == null) {
            cache_head = new IPCHead();
        }
        this.head = (IPCHead) jceInputStream.read((JceStruct) cache_head, 0, true);
        if (cache_body == null) {
            byte[] bArr = new byte[1];
            cache_body = bArr;
            bArr[0] = 0;
        }
        this.body = jceInputStream.read(cache_body, 1, true);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write((JceStruct) this.head, 0);
        jceOutputStream.write(this.body, 1);
    }

    public IPCResponse(IPCHead iPCHead, byte[] bArr) {
        this.head = iPCHead;
        this.body = bArr;
    }
}
