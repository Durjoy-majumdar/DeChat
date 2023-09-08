package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

public final class IPCHead extends JceStruct {
    public int cmdId;
    public String hostPackageName;
    public String hostVersionCode;
    public int requestId;

    public IPCHead() {
        this.requestId = 0;
        this.cmdId = 0;
        this.hostPackageName = "";
        this.hostVersionCode = "";
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.requestId = jceInputStream.read(this.requestId, 0, true);
        this.cmdId = jceInputStream.read(this.cmdId, 1, true);
        this.hostPackageName = jceInputStream.readString(2, true);
        this.hostVersionCode = jceInputStream.readString(3, true);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.requestId, 0);
        jceOutputStream.write(this.cmdId, 1);
        jceOutputStream.write(this.hostPackageName, 2);
        jceOutputStream.write(this.hostVersionCode, 3);
    }

    public IPCHead(int i, int i2, String str, String str2) {
        this.requestId = i;
        this.cmdId = i2;
        this.hostPackageName = str;
        this.hostVersionCode = str2;
    }
}
