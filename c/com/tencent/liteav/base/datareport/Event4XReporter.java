package com.tencent.liteav.base.datareport;

import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
public class Event4XReporter {
    private static final int INVALID_INSTANCE = 0;
    public static final int REPORT_EVENT = 1;
    public static final int REPORT_STATUS = 2;
    private static final String TAG = "Event4XReporter";
    private long mNativeEvent4XReporterAndroid = 0;

    public Event4XReporter(int i, int i2, String str, boolean z, int i3) {
        this.mNativeEvent4XReporterAndroid = nativeCreate(i, i2, str, z, i3);
    }

    private static native long nativeCreate(int i, int i2, String str, boolean z, int i3);

    private static native void nativeDestroy(long j);

    private static native int nativeGetColdDownTime(long j);

    private static native void nativeSendReport(long j);

    private static native void nativeSetCommonIntValue(long j, String str, long j2);

    private static native void nativeSetCommonStringValue(long j, String str, String str2);

    private static native void nativeSetEventIntValue(long j, String str, long j2);

    private static native void nativeSetEventStringValue(long j, String str, String str2);

    public int GetColdDownTime() {
        long j = this.mNativeEvent4XReporterAndroid;
        if (j == 0) {
            return 10000;
        }
        return nativeGetColdDownTime(j);
    }

    public void ReportDau(int i, int i2, String str) {
        long j = this.mNativeEvent4XReporterAndroid;
        if (j != 0) {
            nativeSetEventStringValue(j, "event_id", String.valueOf(i));
            nativeSetEventStringValue(this.mNativeEvent4XReporterAndroid, "err_code", String.valueOf(i2));
            nativeSetEventStringValue(this.mNativeEvent4XReporterAndroid, "err_info", str);
            nativeSendReport(this.mNativeEvent4XReporterAndroid);
        }
    }

    public void SendReport() {
        long j = this.mNativeEvent4XReporterAndroid;
        if (j != 0) {
            nativeSendReport(j);
        }
    }

    public void SetCommonIntValue(String str, long j) {
        long j2 = this.mNativeEvent4XReporterAndroid;
        if (j2 != 0 && str != null) {
            nativeSetCommonIntValue(j2, str, j);
        }
    }

    public void SetCommonStringValue(String str, String str2) {
        long j = this.mNativeEvent4XReporterAndroid;
        if (j != 0 && str != null && str2 != null) {
            nativeSetCommonStringValue(j, str, str2);
        }
    }

    public void SetEventIntValue(String str, long j) {
        long j2 = this.mNativeEvent4XReporterAndroid;
        if (j2 != 0 && str != null) {
            nativeSetEventIntValue(j2, str, j);
        }
    }

    public void SetEventStringValue(String str, String str2) {
        long j = this.mNativeEvent4XReporterAndroid;
        if (j != 0 && str != null && str2 != null) {
            nativeSetEventStringValue(j, str, str2);
        }
    }

    public synchronized void destroy() {
        long j = this.mNativeEvent4XReporterAndroid;
        if (j != 0) {
            nativeDestroy(j);
            this.mNativeEvent4XReporterAndroid = 0;
        }
    }

    public void finalize() {
        super.finalize();
        destroy();
    }
}
