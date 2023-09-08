package com.tencent.thumbplayer.core.common;

public class TPNativeLog {
    public static final int LEVEL_DEBUG = 1;
    public static final int LEVEL_ERROR = 4;
    public static final int LEVEL_INFO = 2;
    public static final int LEVEL_VERBOSE = 0;
    public static final int LEVEL_WARN = 3;
    private static final String TAG = "PlayerCore";
    private static ITPNativeLogCallback mLogCallback;

    private static void onPrintLog(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        try {
            int i4 = 0;
            String str = new String(bArr, 0, i2, "UTF-8");
            String str2 = new String(bArr2, 0, i3, "UTF-8");
            if (i == 0) {
                i4 = 4;
            } else if (i == 1) {
                i4 = 3;
            } else if (i == 2) {
                i4 = 2;
            } else if (i == 3) {
                i4 = 1;
            }
            printLog(i4, str, str2);
        } catch (Exception e) {
            printLog(4, e.getMessage());
        }
    }

    public static void printLog(int i, String str) {
        printLog(i, TAG, str);
    }

    public static void printLogDefault(int i, String str, String str2) {
    }

    public static void setLogCallback(ITPNativeLogCallback iTPNativeLogCallback) {
        mLogCallback = iTPNativeLogCallback;
    }

    public static void printLog(int i, String str, String str2) {
        ITPNativeLogCallback iTPNativeLogCallback = mLogCallback;
        if (iTPNativeLogCallback != null) {
            iTPNativeLogCallback.onPrintLog(i, str, str2);
        } else {
            printLogDefault(i, str, str2);
        }
    }
}
