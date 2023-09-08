package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

public final class UpdateInfoLog extends JceStruct {
    public int actionCode;
    public long appid;
    public String extra;
    public String packageName;
    public byte updateType;
    public byte yybExistFlag;

    public UpdateInfoLog() {
        this.updateType = 0;
        this.packageName = "";
        this.appid = 0;
        this.actionCode = 0;
        this.yybExistFlag = 0;
        this.extra = "";
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.updateType = jceInputStream.read(this.updateType, 0, true);
        this.packageName = jceInputStream.readString(1, true);
        this.appid = jceInputStream.read(this.appid, 2, false);
        this.actionCode = jceInputStream.read(this.actionCode, 3, true);
        this.yybExistFlag = jceInputStream.read(this.yybExistFlag, 4, false);
        this.extra = jceInputStream.readString(5, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.updateType, 0);
        jceOutputStream.write(this.packageName, 1);
        jceOutputStream.write(this.appid, 2);
        jceOutputStream.write(this.actionCode, 3);
        jceOutputStream.write(this.yybExistFlag, 4);
        String str = this.extra;
        if (str != null) {
            jceOutputStream.write(str, 5);
        }
    }

    public UpdateInfoLog(byte b, String str, long j, int i, byte b2, String str2) {
        this.updateType = b;
        this.packageName = str;
        this.appid = j;
        this.actionCode = i;
        this.yybExistFlag = b2;
        this.extra = str2;
    }
}
