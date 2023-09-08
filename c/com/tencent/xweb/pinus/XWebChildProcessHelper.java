package com.tencent.xweb.pinus;

import android.os.ParcelFileDescriptor;

public class XWebChildProcessHelper {
    private static ChildProcessCrashDumpFileCallback sChildProcessDumpFileCallback;

    public interface ChildProcessCrashDumpFileCallback {
        void setupChildProcessCrashDumpFiles(String str, String str2);

        void setupIsolatedProcessCrashDumpFiles(ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2);
    }

    public static ChildProcessCrashDumpFileCallback getCrashDumpFileCallback() {
        return sChildProcessDumpFileCallback;
    }

    public static void setCrashDumpFileCallback(ChildProcessCrashDumpFileCallback childProcessCrashDumpFileCallback) {
        sChildProcessDumpFileCallback = childProcessCrashDumpFileCallback;
    }
}
