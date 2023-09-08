package com.tencent.mars.smc;

import com.tencent.mars.Mars;
import java.util.ArrayList;

public class SmcLogic {
    private static final String TAG = "mars.SmcLogic";
    private static ICallBack callBack = null;
    public static volatile boolean sInitiated = false;

    public static class BaseInfo {
        public String deviceBrand;
        public String deviceModel;
        public String languageVer;
        public String osName;
        public String osVersion;
    }

    public interface ICallBack {
        boolean OnSelfMonitorOpLogReady(byte[] bArr);

        String getKVCommPath();

        BaseInfo getKVCommReqBaseInfo();

        int getSingleReportBufSizeB();

        void onReportDataReady(byte[] bArr, byte[] bArr2, int i, String str);

        boolean onRequestGetStrategy(byte[] bArr, int i);
    }

    static {
        ArrayList<String> arrayList;
        try {
            arrayList = getLoadLibraries();
        } catch (UnsatisfiedLinkError unused) {
            arrayList = null;
        }
        Mars.checkLoadedModules(arrayList, TAG);
    }

    public static native void OnPluginMsg(long j, long j2, long j3, long j4, long j5, long j6);

    public static native void OnReportResp(int i, int i2, byte[] bArr, int i3);

    private static boolean OnSelfMonitorOpLogReady(byte[] bArr) {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return false;
        }
        return iCallBack.OnSelfMonitorOpLogReady(bArr);
    }

    public static native void OnStrategyResp(int i, int i2, byte[] bArr, int i3);

    public static native void SetDebugFlag(boolean z);

    public static native void SetMaxLogItemSize(long j);

    public static native void SetMonitorId(boolean z, int i, int i2, int i3, int i4, int i5, int i6);

    public static native void flushAllReportData();

    private static String getKVCommPath() {
        ICallBack iCallBack = callBack;
        return iCallBack == null ? "" : iCallBack.getKVCommPath();
    }

    private static BaseInfo getKVCommReqBaseInfo() {
        ICallBack iCallBack = callBack;
        return iCallBack == null ? new BaseInfo() : iCallBack.getKVCommReqBaseInfo();
    }

    private static native ArrayList<String> getLoadLibraries();

    private static int getSingleReportBufSizeB() {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return 0;
        }
        return iCallBack.getSingleReportBufSizeB();
    }

    public static native ArrayList<Integer> getStrategyVersions();

    public static native void onCreate();

    private static void onReportDataReady(byte[] bArr, byte[] bArr2, int i, String str) {
        ICallBack iCallBack = callBack;
        if (iCallBack != null) {
            iCallBack.onReportDataReady(bArr, bArr2, i, str);
        }
    }

    private static boolean onRequestGetStrategy(byte[] bArr, int i) {
        ICallBack iCallBack = callBack;
        if (iCallBack == null) {
            return false;
        }
        return iCallBack.onRequestGetStrategy(bArr, i);
    }

    public static native void reportIDKey(long j, long j2, long j3, boolean z);

    public static native void reportListIDKey(IDKey[] iDKeyArr, boolean z);

    public static void setCallBack(ICallBack iCallBack) {
        callBack = iCallBack;
    }

    public static native void setTimeZone(int i);

    public static native void setUin(long j);

    public static native void writeImportKvData(long j, String str, boolean z, boolean z2);

    public static native void writeImportKvDataWithType(long j, long j2, String str, boolean z, boolean z2);

    public static native void writeImportKvPbData(long j, byte[] bArr, boolean z);

    public static native void writeImportKvPbDataWithType(long j, long j2, byte[] bArr, boolean z);

    public static native void writeKvData(long j, String str, boolean z, boolean z2);

    public static native void writeKvDataWithIsolate(long j, String str, boolean z, boolean z2, String str2);

    public static native void writeKvDataWithType(long j, long j2, String str, boolean z, boolean z2);

    public static native void writeKvPbData(long j, byte[] bArr, boolean z);

    public static native void writeKvPbDataWithType(long j, long j2, byte[] bArr, boolean z);
}
