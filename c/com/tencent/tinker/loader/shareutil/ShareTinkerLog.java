package com.tencent.tinker.loader.shareutil;

import android.os.Handler;
import android.os.Message;

public class ShareTinkerLog {
    public static final int FN_LOG_PRINT_PENDING_LOGS = 4002;
    public static final int FN_LOG_PRINT_STACKTRACE = 4001;
    private static final String TAG = "Tinker.ShareTinkerLog";
    private static final TinkerLogImp debugLog;
    private static final TinkerLogImp[] tinkerLogImpRef;
    private static final Handler[] tinkerLogInlineFenceRef;

    public interface TinkerLogImp {
        /* renamed from: d */
        void mo55591d(String str, String str2, Object... objArr);

        /* renamed from: e */
        void mo55592e(String str, String str2, Object... objArr);

        /* renamed from: i */
        void mo55593i(String str, String str2, Object... objArr);

        void printErrStackTrace(String str, Throwable th, String str2, Object... objArr);

        /* renamed from: v */
        void mo55595v(String str, String str2, Object... objArr);

        /* renamed from: w */
        void mo55596w(String str, String str2, Object... objArr);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0031 */
    static {
        /*
            r0 = 1
            android.os.Handler[] r1 = new android.os.Handler[r0]
            r2 = 0
            r3 = 0
            r1[r2] = r3
            tinkerLogInlineFenceRef = r1
            com.tencent.tinker.loader.shareutil.ShareTinkerLog$1 r4 = new com.tencent.tinker.loader.shareutil.ShareTinkerLog$1
            r4.<init>()
            debugLog = r4
            com.tencent.tinker.loader.shareutil.ShareTinkerLog$TinkerLogImp[] r5 = new com.tencent.tinker.loader.shareutil.ShareTinkerLog.TinkerLogImp[r0]
            r5[r2] = r4
            tinkerLogImpRef = r5
            monitor-enter(r1)
            java.lang.String r4 = "com.tencent.tinker.loader.shareutil.TinkerLogInlineFence"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ all -> 0x0031 }
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ all -> 0x0031 }
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r5)     // Catch:{ all -> 0x0031 }
            r4.setAccessible(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0031 }
            java.lang.Object r0 = r4.newInstance(r0)     // Catch:{ all -> 0x0031 }
            android.os.Handler r0 = (android.os.Handler) r0     // Catch:{ all -> 0x0031 }
            r1[r2] = r0     // Catch:{ all -> 0x0031 }
            goto L_0x0035
        L_0x0031:
            android.os.Handler[] r0 = tinkerLogInlineFenceRef     // Catch:{ all -> 0x0039 }
            r0[r2] = r3     // Catch:{ all -> 0x0039 }
        L_0x0035:
            monitor-exit(r1)     // Catch:{ all -> 0x0039 }
            return
        L_0x0037:
            monitor-exit(r1)     // Catch:{ all -> 0x0039 }
            throw r0
        L_0x0039:
            r0 = move-exception
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tinker.loader.shareutil.ShareTinkerLog.<clinit>():void");
    }

    /* renamed from: d */
    public static void m106530d(String str, String str2, Object... objArr) {
        printLog(3, str, str2, objArr);
    }

    /* renamed from: e */
    public static void m106531e(String str, String str2, Object... objArr) {
        printLog(6, str, str2, objArr);
    }

    public static TinkerLogImp getDefaultImpl() {
        return debugLog;
    }

    public static TinkerLogImp getImpl() {
        TinkerLogImp tinkerLogImp;
        TinkerLogImp[] tinkerLogImpArr = tinkerLogImpRef;
        synchronized (tinkerLogImpArr) {
            tinkerLogImp = tinkerLogImpArr[0];
        }
        return tinkerLogImp;
    }

    private static Handler getInlineFence() {
        Handler handler;
        Handler[] handlerArr = tinkerLogInlineFenceRef;
        synchronized (handlerArr) {
            handler = handlerArr[0];
        }
        return handler;
    }

    /* renamed from: i */
    public static void m106532i(String str, String str2, Object... objArr) {
        printLog(4, str, str2, objArr);
    }

    public static void printErrStackTrace(String str, Throwable th, String str2, Object... objArr) {
        printLog(str, th, str2, objArr);
    }

    private static void printLog(int i, String str, String str2, Object... objArr) {
        Object[] objArr2 = {Integer.valueOf(i), Long.valueOf(System.currentTimeMillis()), str, str2, objArr};
        Handler inlineFence = getInlineFence();
        if (inlineFence != null) {
            Message obtain = Message.obtain(inlineFence, i, objArr2);
            inlineFence.handleMessage(obtain);
            obtain.recycle();
            return;
        }
        TinkerLogImp tinkerLogImp = debugLog;
        tinkerLogImp.mo55592e(str, "!! NO_LOG_IMPL !! Original Log: " + str2, objArr);
    }

    public static void printPendingLogs() {
        Handler inlineFence = getInlineFence();
        if (inlineFence != null) {
            Message obtain = Message.obtain(inlineFence, 4002);
            inlineFence.handleMessage(obtain);
            obtain.recycle();
        }
    }

    public static void setTinkerLogImp(TinkerLogImp tinkerLogImp) {
        TinkerLogImp[] tinkerLogImpArr = tinkerLogImpRef;
        synchronized (tinkerLogImpArr) {
            tinkerLogImpArr[0] = tinkerLogImp;
            if (!(tinkerLogImp == null || tinkerLogImp == debugLog)) {
                printPendingLogs();
            }
        }
    }

    /* renamed from: v */
    public static void m106533v(String str, String str2, Object... objArr) {
        printLog(2, str, str2, objArr);
    }

    /* renamed from: w */
    public static void m106534w(String str, String str2, Object... objArr) {
        printLog(5, str, str2, objArr);
    }

    private static void printLog(String str, Throwable th, String str2, Object... objArr) {
        Object[] objArr2 = {4001, Long.valueOf(System.currentTimeMillis()), str, th, str2, objArr};
        Handler inlineFence = getInlineFence();
        if (inlineFence != null) {
            Message obtain = Message.obtain(inlineFence, 4001, objArr2);
            inlineFence.handleMessage(obtain);
            obtain.recycle();
            return;
        }
        TinkerLogImp tinkerLogImp = debugLog;
        tinkerLogImp.printErrStackTrace(str, th, "!! NO_LOG_IMPL !! Original Log: " + str2, objArr);
    }
}
