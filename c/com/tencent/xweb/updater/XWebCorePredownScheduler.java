package com.tencent.xweb.updater;

import android.text.TextUtils;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.util.AbiUtil;
import com.tencent.xweb.util.ConfigDef;
import com.tencent.xweb.util.SchedulerConfig;
import com.tencent.xweb.util.VersionMatcher;
import com.tencent.xweb.util.WXWebReporter;
import com.tencent.xweb.util.XWebCleaner;
import com.tencent.xweb.util.XWebCoreInfo;
import com.tencent.xweb.util.XWebLog;
import org.xwalk.core.XWalkEnvironment;

public class XWebCorePredownScheduler extends XWebCoreScheduler {
    private static XWebCorePredownScheduler sXWebCorePredownScheduler;

    public static XWebCoreScheduler getXWebCorePredownScheduler() {
        if (sXWebCorePredownScheduler == null) {
            sXWebCorePredownScheduler = new XWebCorePredownScheduler();
        }
        return sXWebCorePredownScheduler;
    }

    public String getScheduleType() {
        return "XWebCorePredown";
    }

    public boolean needForceUpdate() {
        return false;
    }

    public SchedulerConfig onConfigDownLoaded(ConfigDef.Config config) {
        SchedulerConfig schedulerConfig = null;
        if (config == null) {
            return null;
        }
        boolean z = false;
        if (!CommandCfg.getInstance().getCmdAsBoolean(CommandDef.COMMAND_ENABLE_PREDOWN_CORE, XWalkEnvironment.MODULE_TOOLS, false)) {
            String str = this.TAG;
            XWebLog.addInitializeLog(str, "onConfigDownLoaded, config version:" + config.strConfigVer + ", disable predown core");
            abandonCurrentScheduler();
            if (XWebCleaner.clearVersion(XWalkEnvironment.getInstalledNewstVersionForPredownAbi())) {
                WXWebReporter.idkeyReport(1749, 85);
            }
            if (XWalkEnvironment.RUNTIME_ABI_ARM32_STR.equalsIgnoreCase(AbiUtil.getRuntimeAbi())) {
                if (XWebCoreInfo.getVersionInfoForAbi(XWalkEnvironment.RUNTIME_ABI_ARM64_STR).ver != -1) {
                    XWalkEnvironment.setCoreVersionInfo(-1, (String) null, XWalkEnvironment.RUNTIME_ABI_ARM64_STR);
                }
            } else if (XWebCoreInfo.getVersionInfoForAbi(XWalkEnvironment.RUNTIME_ABI_ARM32_STR).ver != -1) {
                XWalkEnvironment.setCoreVersionInfo(-1, (String) null, XWalkEnvironment.RUNTIME_ABI_ARM32_STR);
            }
            return null;
        }
        String cmd = CommandCfg.getInstance().getCmd(CommandDef.COMMAND_PRE_DOWN_ABI, XWalkEnvironment.MODULE_TOOLS);
        String str2 = this.TAG;
        XWebLog.addInitializeLog(str2, "onConfigDownLoaded, config version:" + config.strConfigVer + ", enable predown core:" + cmd);
        if (!TextUtils.isEmpty(cmd) && !cmd.equalsIgnoreCase(AbiUtil.getRuntimeAbi()) && (schedulerConfig = new VersionMatcher().getMatchedSchedulerConfig(config, cmd, this)) != null) {
            WXWebReporter.idkeyReport(577, 240, 1);
        }
        if (schedulerConfig != null) {
            String str3 = this.TAG;
            XWebLog.addInitializeLog(str3, "onConfigDownLoaded, pre download version:" + schedulerConfig.version);
            z = true;
        }
        SchedulerConfig onUpdateScheduleConfig = onUpdateScheduleConfig(schedulerConfig);
        if (z && onUpdateScheduleConfig == schedulerConfig) {
            if (XWalkEnvironment.RUNTIME_ABI_ARM32_STR.equalsIgnoreCase(schedulerConfig.strAbi)) {
                WXWebReporter.idkeyReport(577, 236, 1);
            } else if (XWalkEnvironment.RUNTIME_ABI_ARM64_STR.equalsIgnoreCase(schedulerConfig.strAbi)) {
                WXWebReporter.idkeyReport(577, 237, 1);
            }
        }
        return onUpdateScheduleConfig;
    }
}
