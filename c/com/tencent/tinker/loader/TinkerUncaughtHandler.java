package com.tencent.tinker.loader;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import com.tencent.tinker.loader.shareutil.ShareTinkerLog;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread;

public class TinkerUncaughtHandler implements Thread.UncaughtExceptionHandler {
    private static final String TAG = "Tinker.UncaughtHandler";
    private final Context context;
    private final File crashFile;
    private final Thread.UncaughtExceptionHandler ueh = Thread.getDefaultUncaughtExceptionHandler();

    public TinkerUncaughtHandler(Context context2) {
        this.context = context2;
        this.crashFile = SharePatchFileUtil.getPatchLastCrashFile(context2);
    }

    public void uncaughtException(Thread thread, Throwable th) {
        PrintWriter printWriter;
        IOException e;
        ShareTinkerLog.m106531e(TAG, "TinkerUncaughtHandler catch exception:" + Log.getStackTraceString(th), new Object[0]);
        this.ueh.uncaughtException(thread, th);
        if (this.crashFile != null && (Thread.getDefaultUncaughtExceptionHandler() instanceof TinkerUncaughtHandler)) {
            File parentFile = this.crashFile.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                try {
                    printWriter = new PrintWriter(new FileWriter(this.crashFile, false));
                    try {
                        printWriter.println("process:" + ShareTinkerInternals.getProcessName(this.context));
                        printWriter.println(ShareTinkerInternals.getExceptionCauseString(th));
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (IOException e3) {
                    printWriter = null;
                    e = e3;
                    try {
                        ShareTinkerLog.m106531e(TAG, "print crash file error:" + Log.getStackTraceString(e), new Object[0]);
                        SharePatchFileUtil.closeQuietly(printWriter);
                        Process.killProcess(Process.myPid());
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        SharePatchFileUtil.closeQuietly(printWriter);
                        throw th;
                    }
                } catch (Throwable th5) {
                    printWriter = null;
                    th = th5;
                    SharePatchFileUtil.closeQuietly(printWriter);
                    throw th;
                }
                SharePatchFileUtil.closeQuietly(printWriter);
                Process.killProcess(Process.myPid());
                return;
            }
            ShareTinkerLog.m106531e(TAG, "print crash file error: create directory fail!", new Object[0]);
        }
    }
}
