package com.tencent.xweb.util;

import com.tencent.xweb.updater.XWebRuntimeInstaller;
import com.tencent.xweb.util.ConfigDef;
import java.util.ArrayList;
import org.xwalk.core.XWalkEnvironment;

public class VersionMatcher {
    private static final String TAG = "VersionMatcher";
    private String source;

    private String getLogTag() {
        if (this.source == null) {
            return TAG;
        }
        return "VersionMatcher(" + this.source + "|" + hashCode() + ")";
    }

    private ConfigDef.Patch getMatchedPatch(ConfigDef.Version version, String str) {
        ArrayList arrayList = new ArrayList();
        ConfigDef.Patch[] patchArr = version.patches;
        int i = 0;
        if (patchArr != null) {
            for (ConfigDef.Patch patch : patchArr) {
                if (patch.nTargetVersion == XWalkEnvironment.getInstalledNewstVersion(str)) {
                    XWebLog.m21911i(getLogTag(), "getMatchedPatch, got candidate matched patch to upgrade to version:" + patch.nTargetVersion + ", its nPatchType is :" + patch.nPatchType);
                    arrayList.add(patch);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            int i2 = ((ConfigDef.Patch) arrayList.get(0)).nPatchType;
            for (int i3 = 1; i3 < arrayList.size(); i3++) {
                if (((ConfigDef.Patch) arrayList.get(i3)).nPatchType > i2) {
                    i2 = ((ConfigDef.Patch) arrayList.get(i3)).nPatchType;
                    i = i3;
                }
            }
            XWebLog.m21911i(getLogTag(), "getMatchedPatch, got final matched patch to upgrade to version:" + ((ConfigDef.Patch) arrayList.get(i)).nTargetVersion + ", its nPatchType is :" + ((ConfigDef.Patch) arrayList.get(i)).nPatchType);
            return (ConfigDef.Patch) arrayList.get(i);
        }
        XWebLog.m21911i(getLogTag(), "getMatchedPatch, no matched patch");
        return null;
    }

    private ConfigDef.Version getMatchedVersion(ConfigDef.Config config, String str, Scheduler scheduler) {
        ConfigDef.Version[] versionArr;
        if (config == null || (versionArr = config.versions) == null || versionArr.length == 0) {
            XWebLog.m21911i(getLogTag(), "invalid config");
            return null;
        }
        for (ConfigDef.Version version : versionArr) {
            if (version == null) {
                XWebLog.m21911i(getLogTag(), "invalid version");
            } else {
                XWebLog.m21911i(getLogTag(), "try match version:" + version.version + ", filter:" + version.filter);
                if (!XWebGrayValueUtil.hasUin() && version.bForbidDownloadWhenNoUin) {
                    XWebLog.m21911i(getLogTag(), "forbid download when no uin and currently has no uin");
                } else if (version.version < 2000) {
                    XWebLog.m21911i(getLogTag(), "version is not support, below SDK_SUPPORT_MIN_APKVERSION");
                } else {
                    int installedNewstVersion = XWalkEnvironment.getInstalledNewstVersion(version.filter.runtimeAbis);
                    if (version.version <= installedNewstVersion) {
                        XWebLog.m21911i(getLogTag(), "version is too old, current version:" + installedNewstVersion);
                    } else {
                        version.filter.setTargetRuntimeAbi(str);
                        if (!version.filter.checkMatch(false, true, scheduler.TAG)) {
                            XWebLog.m21911i(getLogTag(), "version filter out");
                        } else {
                            String str2 = version.filter.runtimeAbis;
                            XWebRuntimeInstaller.getLastTryEmbedInstallVersion(str2);
                            if (!XWalkEnvironment.RUNTIME_ABI_ARM64_STR.equalsIgnoreCase(str2)) {
                                XWalkEnvironment.RUNTIME_ABI_ARM32_STR.equalsIgnoreCase(str2);
                            }
                            if (!version.filter.isPredownMode() || version.supportPredown) {
                                return version;
                            }
                            XWebLog.m21911i(getLogTag(), "version.supportPredown is false, version:" + version.version);
                        }
                    }
                }
            }
        }
        XWebLog.m21911i(getLogTag(), "getMatchedVersion, no matched version");
        return null;
    }

    public SchedulerConfig getMatchedSchedulerConfig(ConfigDef.Config config, String str, Scheduler scheduler) {
        this.source = scheduler.TAG;
        SchedulerConfig schedulerConfig = new SchedulerConfig();
        ConfigDef.Version matchedVersion = getMatchedVersion(config, str, scheduler);
        if (matchedVersion == null) {
            return null;
        }
        String logTag = getLogTag();
        XWebLog.m21911i(logTag, "getMatchedSchedulerConfig, got matched version:" + matchedVersion.version);
        schedulerConfig.strConfigVer = config.strConfigVer;
        schedulerConfig.strMd5 = matchedVersion.strMd5;
        schedulerConfig.updateSpeedConfig = matchedVersion.UPDATE_SPEED_CONFIG;
        schedulerConfig.updateForwardSpeedConfig = matchedVersion.UPDATE_FORWARD_SPEED_CONFIG;
        schedulerConfig.updateScheduleTimeRangeBind = matchedVersion.UPDATE_SCHEDULE_TIME_RANGE_BIND;
        schedulerConfig.version = matchedVersion.version;
        schedulerConfig.strVersionDetail = matchedVersion.verDes.strVersion;
        schedulerConfig.bCanUseCellular = matchedVersion.bCanUseCellular;
        schedulerConfig.bUseCdn = matchedVersion.bUseCdn;
        schedulerConfig.bTryUseSharedCore = matchedVersion.bTryUseSharedCore;
        ConfigDef.Patch matchedPatch = getMatchedPatch(matchedVersion, str);
        String str2 = matchedVersion.strUrl;
        schedulerConfig.strFullPackageUrl = str2;
        schedulerConfig.strAbi = matchedVersion.filter.runtimeAbis;
        schedulerConfig.versionId = matchedVersion.versionId;
        schedulerConfig.timeHourStart = matchedVersion.updateStartTime;
        schedulerConfig.timeHourEnd = matchedVersion.updateEndTime;
        if (matchedPatch != null) {
            schedulerConfig.bIsPatchUpdate = true;
            schedulerConfig.nPatchTargetVersion = matchedPatch.nTargetVersion;
            schedulerConfig.strUrl = matchedPatch.strUrl;
            schedulerConfig.patchMd5 = matchedPatch.strMd5;
            schedulerConfig.bCanUseCellular = matchedPatch.bCanUseCellular;
            schedulerConfig.bUseCdn = matchedPatch.bUseCdn;
            schedulerConfig.nPatchType = matchedPatch.nPatchType;
        } else {
            schedulerConfig.bIsPatchUpdate = false;
            schedulerConfig.strUrl = str2;
        }
        schedulerConfig.nTimeToUpdate = Scheduler.getUpdateTimeFromVersion(matchedVersion, scheduler.TAG);
        return schedulerConfig;
    }
}
