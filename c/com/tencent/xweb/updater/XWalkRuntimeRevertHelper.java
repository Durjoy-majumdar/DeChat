package com.tencent.xweb.updater;

import android.content.Context;
import com.tencent.xweb.util.AbiUtil;
import com.tencent.xweb.util.FileListMD5Checker;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebCleaner;
import com.tencent.xweb.util.XWebLog;
import java.io.File;
import org.xwalk.core.XWalkEnvironment;

public class XWalkRuntimeRevertHelper {
    public static final String TAG = "XWalkRuntimeRevertHelper";

    private static boolean checkApkExist(int i) {
        File fileListConfigFile = XWebCleaner.getFileListConfigFile(i);
        if (fileListConfigFile != null) {
            return FileListMD5Checker.checkFileListMd5(i, fileListConfigFile);
        }
        XWebLog.m21909e(TAG, "checkApkExist, no config file");
        return false;
    }

    public static int revertToApkVer(Context context, int i) {
        File[] listFiles = new File(context.getApplicationInfo().dataDir).listFiles();
        int i2 = -1;
        if (listFiles == null) {
            XWebLog.m21911i(TAG, "revertToApkVer failed, files is null");
            return -1;
        }
        int installedNewstVersionForCurAbi = XWalkEnvironment.getInstalledNewstVersionForCurAbi();
        boolean z = false;
        int i3 = -1;
        boolean z2 = false;
        for (File apkVersion : listFiles) {
            int apkVersion2 = XWebCleaner.getApkVersion(apkVersion);
            if (apkVersion2 >= 0) {
                if (apkVersion2 == i) {
                    z2 = true;
                }
                if (apkVersion2 <= i && apkVersion2 >= 2000 && apkVersion2 != installedNewstVersionForCurAbi && apkVersion2 > i3) {
                    i3 = apkVersion2;
                }
            }
        }
        if (i3 > 0) {
            z = true;
        }
        if (z2 && checkApkExist(i)) {
            XWebLog.m21911i(TAG, "revertToApkVer checkApkExist targetApk exist");
            i2 = i;
        } else if (!checkApkExist(i3)) {
            XWebLog.m21911i(TAG, "revertToApkVer nAvailableOldVer targetApk not exist");
        } else {
            i2 = i3;
        }
        if (i2 == i) {
            WXWebReporter.idkeyReport(89, 1);
        } else if (i2 > 0) {
            WXWebReporter.idkeyReport(90, 1);
        } else if (z) {
            WXWebReporter.idkeyReport(92, 1);
        } else {
            WXWebReporter.idkeyReport(91, 1);
        }
        XWebLog.m21911i(TAG, "revert from:" + XWalkEnvironment.getInstalledNewstVersionForCurAbi() + " to:" + i2);
        XWalkEnvironment.setCoreVersionInfo(i2, "revert from:" + XWalkEnvironment.getInstalledNewstVersionForCurAbi() + " to:" + i2, AbiUtil.getRuntimeAbi());
        return i2;
    }
}
