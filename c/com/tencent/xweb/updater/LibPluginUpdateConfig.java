package com.tencent.xweb.updater;

import com.tencent.xweb.util.FileUtils;
import com.tencent.xweb.util.MD5;
import com.tencent.xweb.util.XWebLog;
import com.tencent.xweb.xwalk.plugin.XWalkPlugin;
import com.tencent.xweb.xwalk.plugin.XWalkPluginManager;
import java.io.File;

public class LibPluginUpdateConfig extends LibUpdateConfig {
    public static final String TAG = "LibPluginUpdateConfig";
    private String mPluginName;

    public LibPluginUpdateConfig(String str, int i) {
        super(i);
        this.mPluginName = str;
    }

    public boolean copyPackageToLocal(String str, String str2) {
        XWebLog.m21911i(TAG, "copyPackageToLocal, pluginName:" + this.mPluginName + ", fileName:" + str);
        String findSoLibDir = findSoLibDir(str);
        if (findSoLibDir == null) {
            XWebLog.addInitializeLog(TAG, "can not find so file");
            return false;
        }
        String downloadPath = getDownloadPath();
        if (downloadPath == null || downloadPath.isEmpty()) {
            XWebLog.addInitializeLog(TAG, "download path is empty");
            return false;
        }
        String str3 = findSoLibDir + File.separator + str;
        XWebLog.m21911i(TAG, "copyPackageToLocal, src file path:" + str3);
        File file = new File(str3);
        File file2 = new File(downloadPath);
        if (file2.exists()) {
            if (MD5.checkMD5(file2.getAbsolutePath(), str2)) {
                XWebLog.addInitializeLog(TAG, "copyPackageToLocal, already have file and md5 matched");
                return true;
            }
            XWebLog.addInitializeLog(TAG, "copyPackageToLocal, already have file but md5 not matched");
            file2.delete();
        }
        if (!file.exists()) {
            XWebLog.addInitializeLog(TAG, "copyPackageToLocal, src file not find, path:" + str3);
            return false;
        } else if (FileUtils.copyFile(file, file2)) {
            return true;
        } else {
            XWebLog.addInitializeLog(TAG, "copyPackageToLocal, copy file failed");
            return false;
        }
    }

    public String getDownloadPath() {
        XWalkPlugin plugin = XWalkPluginManager.getPlugin(this.mPluginName);
        if (plugin != null) {
            return plugin.getDownloadFullPath(this.apkVer, false);
        }
        XWebLog.m21909e(TAG, "getDownloadPath error, plugin is null");
        return "";
    }
}
