package com.tencent.xweb.util;

import com.tencent.xweb.LibraryLoader;

public class BSpatch extends Patch {
    private static final String TAG = "BSpatch";

    static {
        LibraryLoader.loadLibrary("bspatch_utils");
    }

    public static void test() {
        new BSpatch().doPatch("/data/data/com.tencent.wxweb/cache/libxwalk_old.so", "/data/data/com.tencent.wxweb/cache/libxwalk.patch", "/data/data/com.tencent.wxweb/cache/libxwalk_new.so");
    }

    public int doPatch(String str, String str2, String str3) {
        boolean z;
        XWebLog.m21911i(TAG, "doBSPatch oldFile:" + str + ",patchFile:" + str2 + ",newFile:" + str3);
        long currentTimeMillis = System.currentTimeMillis();
        WXWebReporter.onPatchApply();
        if (str.equals(str3)) {
            str3 = str + ".temp";
            z = true;
        } else {
            z = false;
        }
        int nativeDoPatch = new BSpatch().nativeDoPatch(str, str2, str3);
        if (nativeDoPatch < 0) {
            XWebLog.m21911i(TAG, "doBSPatch failed, ret = " + nativeDoPatch + ", isSamePath = " + z + ", newFile = " + str3);
            WXWebReporter.onPatchApplyFailed();
            String md5 = MD5.getMD5(str);
            String md52 = MD5.getMD5(str2);
            String md53 = MD5.getMD5(str3);
            StringBuilder sb = new StringBuilder();
            sb.append("doBSPatch failed, oldFileMD5 = ");
            if (md5 == null) {
                md5 = "";
            }
            sb.append(md5);
            sb.append(", patchFileMD5 = ");
            if (md52 == null) {
                md52 = "";
            }
            sb.append(md52);
            sb.append(", newFileMD5 = ");
            if (md53 == null) {
                md53 = "";
            }
            sb.append(md53);
            XWebLog.m21911i(TAG, sb.toString());
        } else {
            XWebLog.m21911i(TAG, "doBSPatch successful");
            if (z) {
                if (!FileUtils.copyFile(str3, str)) {
                    XWebLog.m21909e(TAG, "doBSPatch same path, copy failed");
                    return -1;
                }
                FileUtils.deleteFile(str3);
            }
            WXWebReporter.onPatchApplySuccess(System.currentTimeMillis() - currentTimeMillis);
        }
        return nativeDoPatch;
    }

    public native int nativeDoPatch(String str, String str2, String str3);
}
