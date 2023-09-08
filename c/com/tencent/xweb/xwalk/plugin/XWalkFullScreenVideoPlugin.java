package com.tencent.xweb.xwalk.plugin;

import com.tencent.xweb.util.MD5;
import com.tencent.xweb.util.SchedulerConfig;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebLog;
import java.io.File;

public class XWalkFullScreenVideoPlugin extends XWalkPlugin {
    public static final String FULLSCREEN_VIDEO_JS_FILENAME = "xweb_fullscreen_video.js";

    public void checkFiles() {
        XWebLog.m21911i(getPluginName(), "checkFiles, skip");
    }

    public String getDownloadFullPath(int i, boolean z) {
        String versionDir = getVersionDir(i);
        if (versionDir == null || versionDir.isEmpty()) {
            return "";
        }
        if (!z) {
            return versionDir + File.separator + "xweb_fullscreen_video.js";
        }
        return versionDir + File.separator + "patch";
    }

    public String getPluginName() {
        return XWalkPluginManager.XWALK_PLUGIN_NAME_FULL_SCREEN_VIDEO;
    }

    public boolean isDownloadImmediately() {
        return true;
    }

    public boolean isIgnoreForbidDownloadCode() {
        return true;
    }

    public int performInstall(SchedulerConfig schedulerConfig) {
        String pluginName = getPluginName();
        XWebLog.m21911i(pluginName, "performInstall version " + schedulerConfig.version);
        if (MD5.checkMD5(schedulerConfig.path, schedulerConfig.strMd5)) {
            setAvailableVersion(schedulerConfig.version, true);
            String pluginName2 = getPluginName();
            XWebLog.m21911i(pluginName2, "performInstall " + getAvailableVersion() + " success");
            return 0;
        }
        XWebLog.m21909e(getPluginName(), "performInstall failed, md5 not match");
        File file = new File(schedulerConfig.path);
        if (file.exists()) {
            file.delete();
        }
        WXWebReporter.onPluginCheckFailed(getPluginName(), false);
        return -2;
    }
}
