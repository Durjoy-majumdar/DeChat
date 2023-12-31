package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;

public final class AppDetailParam extends JceStruct {
    public byte actionFlag;
    public long apkId;
    public int apkVersionCode;
    public long appId;
    public byte appType;
    public byte authPlatform;
    public String channelId;
    public int grayVersionCode;
    public String manifestMd5;
    public String packageName;
    public String signatureMd5;
    public String token;
    public String verifyAppId;
    public byte verifyType;
    public int versionCode;

    public AppDetailParam() {
        this.appId = 0;
        this.packageName = "";
        this.signatureMd5 = "";
        this.versionCode = 0;
        this.manifestMd5 = "";
        this.appType = 1;
        this.apkId = 0;
        this.apkVersionCode = 0;
        this.channelId = "";
        this.actionFlag = 0;
        this.grayVersionCode = 0;
        this.token = "";
        this.verifyType = 0;
        this.authPlatform = 0;
        this.verifyAppId = "";
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.appId = jceInputStream.read(this.appId, 0, false);
        this.packageName = jceInputStream.readString(1, false);
        this.signatureMd5 = jceInputStream.readString(2, false);
        this.versionCode = jceInputStream.read(this.versionCode, 3, false);
        this.manifestMd5 = jceInputStream.readString(4, false);
        this.appType = jceInputStream.read(this.appType, 5, false);
        this.apkId = jceInputStream.read(this.apkId, 6, false);
        this.apkVersionCode = jceInputStream.read(this.apkVersionCode, 7, false);
        this.channelId = jceInputStream.readString(8, false);
        this.actionFlag = jceInputStream.read(this.actionFlag, 9, false);
        this.grayVersionCode = jceInputStream.read(this.grayVersionCode, 10, false);
        this.token = jceInputStream.readString(11, false);
        this.verifyType = jceInputStream.read(this.verifyType, 12, false);
        this.authPlatform = jceInputStream.read(this.authPlatform, 13, false);
        this.verifyAppId = jceInputStream.readString(14, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.appId, 0);
        String str = this.packageName;
        if (str != null) {
            jceOutputStream.write(str, 1);
        }
        String str2 = this.signatureMd5;
        if (str2 != null) {
            jceOutputStream.write(str2, 2);
        }
        jceOutputStream.write(this.versionCode, 3);
        String str3 = this.manifestMd5;
        if (str3 != null) {
            jceOutputStream.write(str3, 4);
        }
        jceOutputStream.write(this.appType, 5);
        jceOutputStream.write(this.apkId, 6);
        jceOutputStream.write(this.apkVersionCode, 7);
        String str4 = this.channelId;
        if (str4 != null) {
            jceOutputStream.write(str4, 8);
        }
        jceOutputStream.write(this.actionFlag, 9);
        jceOutputStream.write(this.grayVersionCode, 10);
        String str5 = this.token;
        if (str5 != null) {
            jceOutputStream.write(str5, 11);
        }
        jceOutputStream.write(this.verifyType, 12);
        jceOutputStream.write(this.authPlatform, 13);
        String str6 = this.verifyAppId;
        if (str6 != null) {
            jceOutputStream.write(str6, 14);
        }
    }

    public AppDetailParam(long j, String str, String str2, int i, String str3, byte b, long j2, int i2, String str4, byte b2, int i3, String str5, byte b3, byte b4, String str6) {
        this.appId = j;
        this.packageName = str;
        this.signatureMd5 = str2;
        this.versionCode = i;
        this.manifestMd5 = str3;
        this.appType = b;
        this.apkId = j2;
        this.apkVersionCode = i2;
        this.channelId = str4;
        this.actionFlag = b2;
        this.grayVersionCode = i3;
        this.token = str5;
        this.verifyType = b3;
        this.authPlatform = b4;
        this.verifyAppId = str6;
    }
}
