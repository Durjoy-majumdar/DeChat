package com.tencent.tmassistantsdk.openSDK.param.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

public final class IPCBaseParam extends JceStruct {
    public String channelId;
    public String hostAppId;
    public String taskAppId;
    public String taskPackageName;
    public String taskVersion;
    public String uin;
    public String uinType;
    public String via;

    public IPCBaseParam() {
        this.hostAppId = "";
        this.taskAppId = "";
        this.taskVersion = "";
        this.taskPackageName = "";
        this.uin = "";
        this.uinType = "";
        this.via = "";
        this.channelId = "";
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.hostAppId = jceInputStream.readString(0, true);
        this.taskAppId = jceInputStream.readString(1, false);
        this.taskVersion = jceInputStream.readString(2, true);
        this.taskPackageName = jceInputStream.readString(3, true);
        this.uin = jceInputStream.readString(4, false);
        this.uinType = jceInputStream.readString(5, false);
        this.via = jceInputStream.readString(6, false);
        this.channelId = jceInputStream.readString(7, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.hostAppId, 0);
        String str = this.taskAppId;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        jceOutputStream.write(this.taskVersion, 2);
        jceOutputStream.write(this.taskPackageName, 3);
        String str2 = this.uin;
        if (str2 != null) {
            jceOutputStream.write(str2, 4);
        }
        String str3 = this.uinType;
        if (str3 != null) {
            jceOutputStream.write(str3, 5);
        }
        String str4 = this.via;
        if (str4 != null) {
            jceOutputStream.write(str4, 6);
        }
        String str5 = this.channelId;
        if (str5 != null) {
            jceOutputStream.write(str5, 7);
        }
    }

    public IPCBaseParam(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.hostAppId = str;
        this.taskAppId = str2;
        this.taskVersion = str3;
        this.taskPackageName = str4;
        this.uin = str5;
        this.uinType = str6;
        this.via = str7;
        this.channelId = str8;
    }
}
