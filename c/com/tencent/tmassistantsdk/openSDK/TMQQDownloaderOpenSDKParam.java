package com.tencent.tmassistantsdk.openSDK;

public class TMQQDownloaderOpenSDKParam {
    public String SNGAppId;
    public String actionFlag;
    public String channelId;
    public String sdkId;
    public String taskApkId;
    public String taskAppId;
    public String taskPackageName;
    public int taskVersion;
    public String uin;
    public String uinType;
    public String via;

    public TMQQDownloaderOpenSDKParam() {
        this.SNGAppId = "";
        this.taskAppId = "";
        this.taskApkId = "";
        this.taskVersion = 0;
        this.via = "";
        this.taskPackageName = "";
        this.uin = "";
        this.uinType = "";
        this.channelId = "";
        this.actionFlag = "0";
        this.sdkId = "";
    }

    public TMQQDownloaderOpenSDKParam(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.sdkId = "";
        this.SNGAppId = str;
        this.taskAppId = str2;
        this.taskApkId = str3;
        this.taskVersion = i;
        this.via = str4;
        this.taskPackageName = str5;
        this.uin = str6;
        this.uinType = str7;
        this.channelId = str8;
        this.actionFlag = str9;
    }
}
