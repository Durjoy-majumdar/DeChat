package com.tencent.tmassistantsdk.protocol.jce;

import com.p013qq.taf.jce.JceInputStream;
import com.p013qq.taf.jce.JceOutputStream;
import com.p013qq.taf.jce.JceStruct;
import java.util.ArrayList;

public final class AppSimpleDetail extends JceStruct {
    public static ArrayList<ApkDownUrl> cache_apkDownUrl;
    public ArrayList<ApkDownUrl> apkDownUrl;
    public long apkId;
    public String apkMd5;
    public long appId;
    public String appName;
    public String channelId;
    public String diffApkMd5;
    public long diffFileSize;
    public long fileSize;
    public String iconUrl;
    public String packageName;
    public String signatureMd5;
    public int versionCode;
    public String versionName;

    public AppSimpleDetail() {
        this.appId = 0;
        this.apkId = 0;
        this.appName = "";
        this.iconUrl = "";
        this.packageName = "";
        this.versionName = "";
        this.versionCode = 0;
        this.signatureMd5 = "";
        this.apkMd5 = "";
        this.fileSize = 0;
        this.apkDownUrl = null;
        this.diffApkMd5 = "";
        this.diffFileSize = 0;
        this.channelId = "";
    }

    public void readFrom(JceInputStream jceInputStream) {
        this.appId = jceInputStream.read(this.appId, 0, false);
        this.apkId = jceInputStream.read(this.apkId, 1, false);
        this.appName = jceInputStream.readString(2, false);
        this.iconUrl = jceInputStream.readString(3, false);
        this.packageName = jceInputStream.readString(4, false);
        this.versionName = jceInputStream.readString(5, false);
        this.versionCode = jceInputStream.read(this.versionCode, 6, false);
        this.signatureMd5 = jceInputStream.readString(7, false);
        this.apkMd5 = jceInputStream.readString(8, false);
        this.fileSize = jceInputStream.read(this.fileSize, 9, false);
        if (cache_apkDownUrl == null) {
            cache_apkDownUrl = new ArrayList<>();
            cache_apkDownUrl.add(new ApkDownUrl());
        }
        this.apkDownUrl = (ArrayList) jceInputStream.read(cache_apkDownUrl, 10, false);
        this.diffApkMd5 = jceInputStream.readString(11, false);
        this.diffFileSize = jceInputStream.read(this.diffFileSize, 12, false);
        this.channelId = jceInputStream.readString(13, false);
    }

    public void writeTo(JceOutputStream jceOutputStream) {
        jceOutputStream.write(this.appId, 0);
        jceOutputStream.write(this.apkId, 1);
        String str = this.appName;
        if (str != null) {
            jceOutputStream.write(str, 2);
        }
        String str2 = this.iconUrl;
        if (str2 != null) {
            jceOutputStream.write(str2, 3);
        }
        String str3 = this.packageName;
        if (str3 != null) {
            jceOutputStream.write(str3, 4);
        }
        String str4 = this.versionName;
        if (str4 != null) {
            jceOutputStream.write(str4, 5);
        }
        jceOutputStream.write(this.versionCode, 6);
        String str5 = this.signatureMd5;
        if (str5 != null) {
            jceOutputStream.write(str5, 7);
        }
        String str6 = this.apkMd5;
        if (str6 != null) {
            jceOutputStream.write(str6, 8);
        }
        jceOutputStream.write(this.fileSize, 9);
        ArrayList<ApkDownUrl> arrayList = this.apkDownUrl;
        if (arrayList != null) {
            jceOutputStream.write(arrayList, 10);
        }
        String str7 = this.diffApkMd5;
        if (str7 != null) {
            jceOutputStream.write(str7, 11);
        }
        jceOutputStream.write(this.diffFileSize, 12);
        String str8 = this.channelId;
        if (str8 != null) {
            jceOutputStream.write(str8, 13);
        }
    }

    public AppSimpleDetail(long j, long j2, String str, String str2, String str3, String str4, int i, String str5, String str6, long j3, ArrayList<ApkDownUrl> arrayList, String str7, long j4, String str8) {
        this.appId = j;
        this.apkId = j2;
        this.appName = str;
        this.iconUrl = str2;
        this.packageName = str3;
        this.versionName = str4;
        this.versionCode = i;
        this.signatureMd5 = str5;
        this.apkMd5 = str6;
        this.fileSize = j3;
        this.apkDownUrl = arrayList;
        this.diffApkMd5 = str7;
        this.diffFileSize = j4;
        this.channelId = str8;
    }
}
