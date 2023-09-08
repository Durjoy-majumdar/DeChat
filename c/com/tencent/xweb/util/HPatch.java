package com.tencent.xweb.util;

import com.tencent.xweb.LibraryLoader;

public class HPatch extends Patch {
    private static final String TAG = "HPatch";

    static {
        LibraryLoader.loadLibrary("xweb_hpatchz");
    }

    public static void test() {
        new HPatch().doPatch("/data/data/com.tencent.wxweb/cache/libxwalk_old.so", "/data/data/com.tencent.wxweb/cache/libxwalk.patch", "/data/data/com.tencent.wxweb/cache/libxwalk_new.so");
    }

    public int doPatch(String str, String str2, String str3) {
        boolean z;
        XWebLog.m21911i(TAG, "doHPatch oldFile:" + str + ",patchFile:" + str2 + ",newFile:" + str3);
        long currentTimeMillis = System.currentTimeMillis();
        WXWebReporter.onPatchApply();
        if (str.equals(str3)) {
            str3 = str + ".temp";
            z = true;
        } else {
            z = false;
        }
        int patch = new HPatch().patch(str, str2, str3, 262144);
        if (patch != 0) {
            XWebLog.m21911i(TAG, "doHPatch failed");
            WXWebReporter.onPatchApplyFailed();
        } else {
            XWebLog.m21911i(TAG, "doHPatch successful");
            if (z) {
                if (!FileUtils.copyFile(str3, str)) {
                    XWebLog.m21909e(TAG, "doHPatch same path, copy failed");
                    return -1;
                }
                FileUtils.deleteFile(str3);
            }
            WXWebReporter.onPatchApplySuccess(System.currentTimeMillis() - currentTimeMillis);
        }
        return patch;
    }

    public native int patch(String str, String str2, String str3, long j);
}
