package com.tencent.xweb.util;

public class SchedulerConfig {
    public boolean bCanUseCellular;
    public boolean bIsPatchUpdate;
    public boolean bTryUseSharedCore;
    public boolean bUseCdn;
    public long nLastFetchConfigTime;
    public int nPatchTargetVersion;
    public int nPatchType = 1;
    public long nTimeToUpdate;
    public int nTryCnt;
    public int nTryUseSharedCoreCount;
    public String patchMd5 = "";
    public String path = "";
    public boolean skipSubFileMD5Check = false;
    public String strAbi;
    public String strConfigVer = "";
    public String strFullPackageUrl = "";
    public String strLastFetchAbi = "";
    public String strMd5 = "";
    public String strPatchUrl = "";
    public String strScheduleType;
    public String strUrl = "";
    public String strVersionDetail = "";
    public float timeHourEnd = -1.0f;
    public float timeHourStart = -1.0f;
    public String updateForwardSpeedConfig = "";
    public String updateScheduleTimeRangeBind = "";
    public String updateSpeedConfig = "";
    public int version;
    public int versionId;
}
