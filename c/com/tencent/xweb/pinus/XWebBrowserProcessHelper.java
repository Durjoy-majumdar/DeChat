package com.tencent.xweb.pinus;

public class XWebBrowserProcessHelper {
    private static BrowserProcessCrashDumpFileCallback sBrowserProcessDumpFileCallback;

    public interface BrowserProcessCrashDumpFileCallback {
        String getCrashDumpFolderPath();

        String getJavaCrashDumpFilePath(String str);

        String getNativeCrashDumpFilePath(String str);
    }

    public static BrowserProcessCrashDumpFileCallback getCrashDumpFileCallback() {
        return sBrowserProcessDumpFileCallback;
    }

    public static void setCrashDumpFileCallback(BrowserProcessCrashDumpFileCallback browserProcessCrashDumpFileCallback) {
        sBrowserProcessDumpFileCallback = browserProcessCrashDumpFileCallback;
    }
}
