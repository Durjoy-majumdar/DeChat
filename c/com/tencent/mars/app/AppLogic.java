package com.tencent.mars.app;

public class AppLogic {
    private static final String TAG = "mars.app.NativeAppJni$C2Java";
    private static ICallBack callBack;

    public static class DeviceInfo {
        public String devicename;
        public String devicetype;

        public DeviceInfo(String str, String str2) {
            this.devicename = str;
            this.devicetype = str2;
        }
    }

    public interface ICallBack {
        AccountInfo getAccountInfo();

        String getAppFilePath();

        int getClientVersion();

        String getCurLanguage();

        DeviceInfo getDeviceType();
    }

    private static AccountInfo getAccountInfo() {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.getAccountInfo();
    }

    public static String getAppFilePath() {
        ICallBack iCallBack = callBack;
        if (iCallBack != null) {
            return iCallBack.getAppFilePath();
        }
        return null;
    }

    private static int getClientVersion() {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return 0;
        }
        return iCallBack.getClientVersion();
    }

    private static String getCurLanguage() {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.getCurLanguage();
    }

    private static DeviceInfo getDeviceType() {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.getDeviceType();
    }

    public static void setCallBack(ICallBack iCallBack) {
        callBack = iCallBack;
    }

    public static class AccountInfo {
        public long uin;
        public String userName;

        public AccountInfo() {
            this.uin = 0;
            this.userName = "";
        }

        public AccountInfo(long j, String str) {
            this.uin = j;
            this.userName = str;
        }
    }
}
