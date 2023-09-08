package com.tencent.liteav.base.util;

import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;

@JNINamespace("liteav")
public class LiteavLog {
    private static C17108a sCallback = null;
    private static final boolean useChromiumBaseLog = true;

    /* renamed from: com.tencent.liteav.base.util.LiteavLog$b */
    public enum C17107b {
        kAll(0),
        kInfo(1),
        kWarning(2),
        kError(3),
        kFatal(4),
        kNone(5);
        
        public int mNativeValue;

        private C17107b(int i) {
            this.mNativeValue = i;
        }

        /* renamed from: a */
        public static final C17107b m16907a(int i) {
            return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? kNone : kFatal : kError : kWarning : kInfo : kAll;
        }
    }

    /* renamed from: com.tencent.liteav.base.util.LiteavLog$a */
    public interface C17108a {
        /* renamed from: a */
        void mo19357a(C17107b bVar, String str, String str2);
    }

    static {
        C28637q.m38304a();
    }

    /* renamed from: d */
    public static void m16897d(String str, String str2, Object... objArr) {
        m16896d(str, String.format(str2, objArr));
    }

    /* renamed from: e */
    public static void m16900e(String str, String str2, Object... objArr) {
        m16898e(str, String.format(str2, objArr));
    }

    /* renamed from: i */
    public static void m16902i(String str, String str2, Object... objArr) {
        m16901i(str, String.format(str2, objArr));
    }

    public static native void nativeSetConsoleLogEnabled(boolean z);

    public static native void nativeSetLogCallbackEnabled(boolean z);

    public static native void nativeSetLogCompressEnabled(boolean z);

    public static native void nativeSetLogFilePath(String str);

    public static native void nativeSetLogLevel(int i);

    public static native void nativeSetLogToFileEnabled(boolean z);

    public static void onLog(int i, String str) {
        C17108a aVar = sCallback;
        if (aVar != null) {
            aVar.mo19357a(C17107b.m16907a(i), "TXLiteAVSDK", str);
        }
    }

    public static void setCallback(C17108a aVar) {
        sCallback = aVar;
    }

    /* renamed from: v */
    public static void m16904v(String str, String str2, Object... objArr) {
        m16903v(str, String.format(str2, objArr));
    }

    /* renamed from: w */
    public static void m16906w(String str, String str2, Object... objArr) {
        m16905w(str, String.format(str2, objArr));
    }

    /* renamed from: d */
    public static void m16896d(String str, String str2) {
        Log.m97545d(str, str2, new Object[0]);
    }

    /* renamed from: e */
    public static void m16898e(String str, String str2) {
        Log.m97546e(str, str2, new Object[0]);
    }

    /* renamed from: i */
    public static void m16901i(String str, String str2) {
        Log.m97547i(str, str2, new Object[0]);
    }

    /* renamed from: v */
    public static void m16903v(String str, String str2) {
        Log.m97548v(str, str2, new Object[0]);
    }

    /* renamed from: w */
    public static void m16905w(String str, String str2) {
        Log.m97549w(str, str2, new Object[0]);
    }

    /* renamed from: e */
    public static void m16899e(String str, String str2, Throwable th) {
        m16898e(str, str2 + "\n" + android.util.Log.getStackTraceString(th));
    }
}
