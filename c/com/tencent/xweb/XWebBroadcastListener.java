package com.tencent.xweb;

import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.util.XWebGrayValueUtil;
import com.tencent.xweb.util.XWebLog;
import org.xwalk.core.XWalkEnvironment;

public class XWebBroadcastListener implements IXWebBroadcastListener {
    public static final String TAG = "XWebBroadcastListener";

    public void onMainCfgUpdated() {
        XWebGrayValueUtil.resetGrayValue();
        if (!"true".equalsIgnoreCase(CommandCfg.getInstance().getCmd(CommandDef.COMMAND_DIS_REFRESH_MAIN, XWalkEnvironment.MODULE_TOOLS))) {
            CommandCfg.resetCommandCfg();
            UrlDispatcher.refresh();
            return;
        }
        XWebLog.m21911i(TAG, "onMainCfgUpdated, dis_refresh_main_cmd false");
    }

    public void onPluginCfgUpdated() {
        if (!"true".equalsIgnoreCase(CommandCfg.getInstance().getCmd(CommandDef.COMMAND_DIS_REFRESH_PLUGIN, XWalkEnvironment.MODULE_TOOLS))) {
            CommandCfgPlugin.resetCommandCfgPlugin();
        } else {
            XWebLog.m21911i(TAG, "onPluginCfgUpdated, dis_refresh_plugin_cmd false");
        }
    }

    public void onUpdateFinished(int i) {
        if (i != 0) {
            return;
        }
        if (!XWebSdkInternal.isWaitForXWeb()) {
            XWebLog.m21911i(TAG, "onUpdateFinished, not waiting for xweb");
            return;
        }
        int availableVersion = XWalkEnvironment.getAvailableVersion();
        int installedNewstVersionForCurAbi = XWalkEnvironment.getInstalledNewstVersionForCurAbi();
        if (availableVersion <= 0 && installedNewstVersionForCurAbi > 0 && !"true".equalsIgnoreCase(CommandCfg.getInstance().getCmd(CommandDef.COMMAND_DIS_REINIT_WEB_CORE))) {
            XWebLog.m21911i(TAG, "onUpdateFinished, loadedVersion:" + availableVersion + ", installedVersion:" + installedNewstVersionForCurAbi);
            WebView.reinitToXWeb();
        }
    }

    public void onUpdateProgressed(int i) {
    }

    public void onUpdateStart(int i) {
    }
}
