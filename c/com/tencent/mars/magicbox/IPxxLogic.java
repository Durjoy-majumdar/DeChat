package com.tencent.mars.magicbox;

public class IPxxLogic {
    private static ICallBack callBack;

    public interface ICallBack {
        String getCrashFilePath(int i);

        String getUploadLogExtrasInfo(String str);

        void recoverLinkAddrs();

        void setNewDnsDebugHostInfo(String str, int i);

        void uploadLogFail(int i);

        void uploadLogResponse(int i, long j, long j2);

        void uploadLogSuccess(int i);
    }

    private static String getCrashFilePath(int i) {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.getCrashFilePath(i);
    }

    private static String getUploadLogExtrasInfo(String str) {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return null;
        }
        return iCallBack.getUploadLogExtrasInfo(str);
    }

    public static native void onIPxx(String str, int i);

    public static void recoverLinkAddrs() {
        ICallBack iCallBack = callBack;
        if (iCallBack != null) {
            iCallBack.recoverLinkAddrs();
        }
    }

    public static void setCallBack(ICallBack iCallBack) {
        callBack = iCallBack;
    }

    public static native void setHost(String str);

    private static void setNewDnsDebugHostInfo(String str, int i) {
        ICallBack iCallBack = callBack;
        if (iCallBack != null) {
            iCallBack.setNewDnsDebugHostInfo(str, i);
        }
    }

    public static native int uploadFile(String str, int i, int i2, long j, String str2, String str3);

    public static native int uploadLog(int i, int[] iArr, boolean z, long j, String str, int i2, int i3);

    public static void uploadLogFail(int i) {
        ICallBack iCallBack = callBack;
        if (iCallBack != null) {
            iCallBack.uploadLogFail(i);
        }
    }

    public static void uploadLogResponse(int i, long j, long j2) {
        ICallBack iCallBack = callBack;
        if (iCallBack != null) {
            iCallBack.uploadLogResponse(i, j, j2);
        }
    }

    public static void uploadLogSuccess(int i) {
        ICallBack iCallBack = callBack;
        if (iCallBack != null) {
            iCallBack.uploadLogSuccess(i);
        }
    }
}
