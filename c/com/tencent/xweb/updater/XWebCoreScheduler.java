package com.tencent.xweb.updater;

import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.XWebEmbedSetting;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.util.AbiUtil;
import com.tencent.xweb.util.ConfigDef;
import com.tencent.xweb.util.Scheduler;
import com.tencent.xweb.util.SchedulerConfig;
import com.tencent.xweb.util.VersionMatcher;
import com.tencent.xweb.util.XWebLog;
import org.xwalk.core.XWalkEnvironment;

public class XWebCoreScheduler extends Scheduler {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static XWebCoreScheduler sXWebCoreScheduler;

    public static XWebCoreScheduler getXWebCoreScheduler() {
        if (sXWebCoreScheduler == null) {
            sXWebCoreScheduler = new XWebCoreScheduler();
        }
        return sXWebCoreScheduler;
    }

    public String getCustomCurHourSpeedConfig(boolean z) {
        return !z ? CommandCfg.getInstance().getCmd(CommandDef.COMMAND_UPDATE_SPEED_CONFIG, XWalkEnvironment.MODULE_TOOLS) : CommandCfg.getInstance().getCmd(CommandDef.COMMAND_UPDATE_FORWARD_SPEED_CONFIG, XWalkEnvironment.MODULE_TOOLS);
    }

    public String getScheduleType() {
        return "XWebCore";
    }

    public UpdateConfig getUpdateConfig(SchedulerConfig schedulerConfig) {
        UpdateConfig updateConfig;
        UpdateConfig updateConfig2;
        String str;
        try {
            if (!schedulerConfig.bIsPatchUpdate) {
                String str2 = schedulerConfig.strMd5;
                if (str2 != null) {
                    if (!str2.isEmpty()) {
                        updateConfig = new UpdateConfig(schedulerConfig.strMd5, false, (String) null, schedulerConfig.strUrl, schedulerConfig.version, schedulerConfig.strAbi, schedulerConfig.nPatchTargetVersion, schedulerConfig.nPatchType);
                        updateConfig.versionDetail = schedulerConfig.strVersionDetail;
                        updateConfig.bUseCdn = schedulerConfig.bUseCdn;
                        updateConfig.bTryUseSharedCore = schedulerConfig.bTryUseSharedCore;
                        updateConfig.scheduler = this;
                        return updateConfig;
                    }
                }
                updateConfig2 = new UpdateConfig(schedulerConfig.strUrl, false, schedulerConfig.version, schedulerConfig.strAbi, schedulerConfig.nPatchTargetVersion, schedulerConfig.nPatchType);
            } else {
                String str3 = schedulerConfig.strMd5;
                if (!(str3 == null || str3.isEmpty() || (str = schedulerConfig.patchMd5) == null)) {
                    if (!str.isEmpty()) {
                        updateConfig = new UpdateConfig(schedulerConfig.patchMd5, true, schedulerConfig.strMd5, schedulerConfig.strUrl, schedulerConfig.version, schedulerConfig.strAbi, schedulerConfig.nPatchTargetVersion, schedulerConfig.nPatchType);
                        updateConfig.versionDetail = schedulerConfig.strVersionDetail;
                        updateConfig.bUseCdn = schedulerConfig.bUseCdn;
                        updateConfig.bTryUseSharedCore = schedulerConfig.bTryUseSharedCore;
                        updateConfig.scheduler = this;
                        return updateConfig;
                    }
                }
                updateConfig2 = new UpdateConfig(schedulerConfig.strUrl, true, schedulerConfig.version, schedulerConfig.strAbi, schedulerConfig.nPatchTargetVersion, schedulerConfig.nPatchType);
            }
            updateConfig = updateConfig2;
            updateConfig.versionDetail = schedulerConfig.strVersionDetail;
            updateConfig.bUseCdn = schedulerConfig.bUseCdn;
            updateConfig.bTryUseSharedCore = schedulerConfig.bTryUseSharedCore;
            updateConfig.scheduler = this;
            return updateConfig;
        } catch (Throwable th) {
            XWebLog.m21910e(this.TAG, "getUpdateConfig error", th);
            return null;
        }
    }

    public synchronized boolean hasScheduler() {
        if (!super.hasScheduler()) {
            return false;
        }
        if (getCurSchedulerConfig().version > XWalkEnvironment.getInstalledNewstVersion(getCurSchedulerConfig().strAbi)) {
            return true;
        }
        XWebLog.m21913w(this.TAG, "hasScheduler, scheduler config version lower than current version");
        return false;
    }

    public boolean needForceUpdate() {
        if (!XWalkEnvironment.hasInstalledAvailableVersion()) {
            if (!"true".equalsIgnoreCase(CommandCfg.getInstance().getCmd(CommandDef.COMMAND_DIS_UPDATE_IMEDIATELY_WHEN_NO_XWEB, XWalkEnvironment.MODULE_TOOLS))) {
                if (getCurSchedulerConfig().nTryCnt > 0) {
                    XWebLog.addInitializeLog(this.TAG, "needForceUpdate, update failed before, do not force update");
                    if (!"true".equalsIgnoreCase(CommandCfg.getInstance().getCmd(CommandDef.COMMAND_ALLOW_FAILED_SCHEDULE_FORCE_UPDATE, XWalkEnvironment.MODULE_TOOLS))) {
                        return false;
                    }
                }
                XWebLog.addInitializeLog(this.TAG, "needForceUpdate, no availableVersion installed, do start download");
                return true;
            }
            XWebLog.addInitializeLog(this.TAG, "needForceUpdate, no availableVersion but dis_update_immediately_when_no_xweb is true");
        }
        return false;
    }

    public SchedulerConfig onConfigDownLoaded(ConfigDef.Config config) {
        if (config == null) {
            return null;
        }
        String str = this.TAG;
        XWebLog.addInitializeLog(str, "onConfigDownLoaded, config version:" + config.strConfigVer + ", runtime abi:" + AbiUtil.getRuntimeAbi());
        if (!XWebEmbedSetting.getForbidDownloadCode() || XWalkEnvironment.isInTestMode()) {
            SchedulerConfig onUpdateScheduleConfig = onUpdateScheduleConfig(new VersionMatcher().getMatchedSchedulerConfig(config, AbiUtil.getRuntimeAbi(), this));
            if (onUpdateScheduleConfig != null) {
                String str2 = this.TAG;
                XWebLog.addInitializeLog(str2, "onConfigDownLoaded, download apk version:" + onUpdateScheduleConfig.version);
            }
            return onUpdateScheduleConfig;
        }
        XWebLog.addInitializeLog(this.TAG, "onConfigDownLoaded, forbid download code");
        return null;
    }
}
