package com.tencent.liteav.base;

import com.tencent.liteav.base.annotations.JNINamespace;
import java.lang.Thread;

@JNINamespace("base::android")
public class JavaExceptionReporter implements Thread.UncaughtExceptionHandler {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mCrashAfterReport;
    private boolean mHandlingException;
    private final Thread.UncaughtExceptionHandler mParent;

    static {
        Class<JavaExceptionReporter> cls = JavaExceptionReporter.class;
    }

    private JavaExceptionReporter(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, boolean z) {
        this.mParent = uncaughtExceptionHandler;
        this.mCrashAfterReport = z;
    }

    private static void installHandler(boolean z) {
        Thread.setDefaultUncaughtExceptionHandler(new JavaExceptionReporter(Thread.getDefaultUncaughtExceptionHandler(), z));
    }

    public static void reportStackTrace(String str) {
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (!this.mHandlingException) {
            this.mHandlingException = true;
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.mParent;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
