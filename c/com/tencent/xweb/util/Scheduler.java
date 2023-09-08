package com.tencent.xweb.util;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.dynamite.ProviderConstants;
import com.tencent.xweb.CommandCfg;
import com.tencent.xweb.CommandCfgPlugin;
import com.tencent.xweb.internal.CommandDef;
import com.tencent.xweb.util.ConfigDef;
import com.tencent.xweb.util.NumberUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.xwalk.core.XWalkEnvironment;

public abstract class Scheduler {
    public static final long DAY_MILLS = 86400000;
    public static final long DEFAULT_EXPIRE_TIME = 18000000;
    public static final long EXPIRE_TIME_AFTER_SCHEDULE = 3600000;
    public static final long FETCH_CONFIG_PERIOD = 86400000;
    public static final long HOUR_MILLS = 3600000;
    public static final long MAX_FAILED_COUNT = 3;
    public static final long MINUTE_MILLS = 60000;
    public static final long RE_SCHEDULER_APPEND_TIME = 7200000;
    private static final String STAG = "Scheduler";
    public static boolean sForceCheckUpdate;
    public String TAG = (getScheduleType() + STAG);
    public boolean mParseScheduleConfigFailed = false;
    public SchedulerConfig schedulerConfig;

    public static class TimeRangeBind {
        public TimeRange rangeFrom = new TimeRange();
        public TimeRange rangeTo = new TimeRange();

        public String dump(double d, double d2) {
            return "[ " + this.rangeFrom.timeStart + "," + this.rangeFrom.timeEnd + "] => [" + this.rangeTo.timeStart + "," + this.rangeTo.timeEnd + "], scale=" + getScheduleTimeScale(d, d2);
        }

        public double getScheduleTimeScale(double d, double d2) {
            return this.rangeFrom.getScale(d2) * this.rangeTo.getScale(d);
        }

        public boolean isMatched(double d, double d2) {
            return isMatched(d, d2, 1.0d);
        }

        public boolean isMatched(double d, double d2, double d3) {
            TimeRange timeRange = this.rangeFrom;
            if (d2 > timeRange.timeEnd || d2 < timeRange.timeStart) {
                return false;
            }
            TimeRange timeRange2 = this.rangeTo;
            if (d > timeRange2.timeEnd || d < timeRange2.timeStart || ((double) XWebGrayValueUtil.getTodayGrayValueByKey("DOWNLOAD_SCHEDULE")) > getScheduleTimeScale(d, d2) * 10000.0d * d3) {
                return false;
            }
            return true;
        }
    }

    public static long getFetchConfigPeriod() {
        long cmdAsInt = ((long) CommandCfg.getInstance().getCmdAsInt(CommandDef.COMMAND_FORCE_CMD_PERIOD, XWalkEnvironment.MODULE_TOOLS, 0)) * 60000;
        if (isValidPeriodForFetchConfig(cmdAsInt)) {
            return cmdAsInt;
        }
        long baseConfigUpdatePeriod = XWebUpdateConfigUtil.getBaseConfigUpdatePeriod();
        if (isValidPeriodForFetchConfig(baseConfigUpdatePeriod)) {
            return baseConfigUpdatePeriod;
        }
        long cmdFetchConfigPeriodMills = (long) CommandCfg.getInstance().getCmdFetchConfigPeriodMills();
        if (isValidPeriodForFetchConfig(cmdFetchConfigPeriodMills)) {
            return cmdFetchConfigPeriodMills;
        }
        return 86400000;
    }

    public static String[] getHourSpeedPieces(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split(";");
    }

    public static double getRandomTime(double d, double d2, double d3) {
        if (d > d3 || d3 < d2) {
            XWebLog.m21909e(STAG, "getRandomTime, currentHour is bigger than endHour");
            return 0.0d;
        }
        if (d2 >= d) {
            d = d2;
        }
        return d + (Math.random() * (d3 - d));
    }

    private boolean getShouldUpdateFromConfig(double d, double d2, long j) {
        boolean z;
        long j2 = j;
        boolean z2 = false;
        boolean z3 = true;
        int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i < 0 || j2 > 3600000) {
            z = false;
        } else {
            WXWebReporter.idkeyReport(903, (long) (getIdkeyOffsetFromDefault() + 154), 1);
            z = true;
        }
        if (i >= 0 && ((double) j2) < d) {
            z2 = true;
        }
        if (i >= 0 || ((double) (-j2)) >= d2) {
            z3 = z2;
        } else {
            WXWebReporter.idkeyReport(903, (long) (getIdkeyOffsetFromDefault() + 161), 1);
        }
        if (z && !z3) {
            WXWebReporter.idkeyReport(903, (long) (getIdkeyOffsetFromDefault() + 150), 1);
        }
        if (!z && z3) {
            WXWebReporter.idkeyReport(903, (long) (getIdkeyOffsetFromDefault() + 151), 1);
        }
        String str = this.TAG;
        XWebLog.addInitializeLog(str, "shouldUpdateDefault = " + z + ", shouldUpdateFromConfig = " + z3);
        return z3;
    }

    private String getTimeRangeBindConfig() {
        return !TextUtils.isEmpty(getCurSchedulerConfig().updateScheduleTimeRangeBind) ? getCurSchedulerConfig().updateScheduleTimeRangeBind : getCustomTimeRangeBindConfig();
    }

    public static TimeRangeBind getTimeRangePairItem(String str) {
        TimeRangeBind timeRangeBind = new TimeRangeBind();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.trim().replace("=>", "_").split("_");
        if (split == null || split.length != 2) {
            XWebLog.m21909e(STAG, "strRanges error");
            return null;
        }
        TimeRange timeRange = TimeRange.getTimeRange(split[0]);
        timeRangeBind.rangeFrom = timeRange;
        if (timeRange == null) {
            XWebLog.m21909e(STAG, "parse rangeFrom failed");
            return null;
        }
        TimeRange timeRange2 = TimeRange.getTimeRange(split[1]);
        timeRangeBind.rangeTo = timeRange2;
        if (timeRange2 != null) {
            return timeRangeBind;
        }
        XWebLog.m21909e(STAG, "parse rangeTo failed");
        return null;
    }

    public static long getUpdateTimeFromPeriod(ConfigDef.BaseVersion baseVersion, String str) {
        long j = (long) (baseVersion.nPeriod * 60 * 1000);
        if (0 == j) {
            XWebLog.m21913w(str, "getUpdateTimeFromPeriod, invalid period");
            return 0;
        }
        ConfigDef.Filter filter = baseVersion.filter;
        int i = filter.grayMin;
        int i2 = 10000;
        if (i <= 0 || i > 10000) {
            i = 0;
        }
        int i3 = filter.grayMax;
        if (i3 > 0 && i3 <= 10000) {
            i2 = i3;
        }
        int i4 = (i2 - i) + 1;
        if (i4 <= 0) {
            i4 = 1;
        }
        double d = (double) i4;
        double grayValue = ((double) (((long) (XWebGrayValueUtil.getGrayValue() - i)) * j)) / d;
        return (long) (grayValue + (Math.random() * ((((double) (j * ((long) ((XWebGrayValueUtil.getGrayValue() + 1) - i)))) / d) - grayValue)));
    }

    public static long getUpdateTimeFromSchedules(ConfigDef.BaseVersion baseVersion, String str) {
        ConfigDef.BaseVersion baseVersion2 = baseVersion;
        String str2 = str;
        int[] schedules = baseVersion.getSchedules();
        if (schedules == null || schedules.length == 0) {
            XWebLog.m21911i(str2, "getUpdateTimeFromSchedules, invalid schedules");
            return 0;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        try {
            if (!TextUtils.isEmpty(baseVersion2.releaseDate)) {
                date = simpleDateFormat.parse(baseVersion2.releaseDate);
            }
        } catch (Throwable th) {
            XWebLog.m21910e(str2, "getUpdateTimeFromSchedules error", th);
            WXWebReporter.idkeyReport(903, 158, 1);
        }
        double time = ((double) (new Date().getTime() - date.getTime())) / 8.64E7d;
        int i = (int) time;
        if (time < 0.0d) {
            i--;
        }
        int i2 = 0;
        if (Math.abs(time) > 365.0d) {
            i = 0;
        }
        ConfigDef.Filter filter = baseVersion2.filter;
        int i3 = filter.grayMin;
        int i4 = 10000;
        if (i3 <= 0 || i3 > 10000) {
            i3 = 0;
        }
        int i5 = filter.grayMax;
        if (i5 > 0 && i5 <= 10000) {
            i4 = i5;
        }
        double grayValue = (((double) (XWebGrayValueUtil.getGrayValue() - i3)) * 10000.0d) / ((double) ((i4 - i3) + 1));
        while (i2 < schedules.length && grayValue > ((double) schedules[i2])) {
            i2++;
        }
        double currentHour = NumberUtil.getCurrentHour();
        double validStartTime = getValidStartTime((double) baseVersion2.updateStartTime);
        double validEndTime = getValidEndTime((double) baseVersion2.updateStartTime, (double) baseVersion2.updateEndTime);
        int i6 = i2 - i;
        XWebLog.m21911i(str2, "getUpdateTimeFromSchedules, releaseDate:" + date + ", currentGrayValue:" + grayValue + ", dayToUpdate:" + i6);
        if (i6 <= 0) {
            if (baseVersion2.lowPriority && currentHour > validStartTime) {
                XWebLog.m21911i(str2, "low priority version, schedule to next day to update");
            } else if (currentHour >= validEndTime) {
                XWebLog.m21911i(str2, "end hour passed, schedule to next day to update");
            } else {
                double randomTime = getRandomTime(currentHour, validStartTime, validEndTime);
                XWebLog.m21911i(str2, "update today, schedule hour:" + randomTime);
                return (long) ((randomTime - currentHour) * 3600000.0d);
            }
            i6 = 1;
        }
        double randomTime2 = getRandomTime(0.0d, validStartTime, validEndTime);
        XWebLog.m21911i(str2, "getUpdateTimeFromSchedules, schedule hour:" + randomTime2);
        return (long) ((randomTime2 * 3600000.0d) + ((double) (((long) (i6 - 1)) * 86400000)) + ((double) NumberUtil.milliesToNextDay()));
    }

    public static long getUpdateTimeFromVersion(ConfigDef.BaseVersion baseVersion, String str) {
        if (!TextUtils.isEmpty(baseVersion.updateSchedule)) {
            long updateTimeFromSchedules = getUpdateTimeFromSchedules(baseVersion, str);
            XWebLog.addInitializeLog(str, "has scheduler, schedule after " + ((updateTimeFromSchedules / 60) / 1000) + " minutes to update");
            return System.currentTimeMillis() + updateTimeFromSchedules;
        } else if (baseVersion.nPeriod > 0) {
            long updateTimeFromPeriod = getUpdateTimeFromPeriod(baseVersion, str);
            XWebLog.addInitializeLog(str, "has period, schedule after " + ((updateTimeFromPeriod / 60) / 1000) + " minutes to update");
            return System.currentTimeMillis() + updateTimeFromPeriod;
        } else {
            XWebLog.addInitializeLog(str, "no schedule time, return 100");
            return 100;
        }
    }

    public static double getValidEndTime(double d, double d2) {
        if (d2 >= d && d2 >= 0.0d && d2 <= 32.0d) {
            return d2;
        }
        return 24.0d;
    }

    public static double getValidStartTime(double d) {
        if (d < 0.0d || d > 24.0d) {
            return 0.0d;
        }
        return d;
    }

    public static boolean isValidPeriodForFetchConfig(long j) {
        return j >= 1800000 && j < 259200000;
    }

    public static boolean isValidUpdateTimeZone(double d, double d2) {
        return d >= 0.0d && d <= 24.0d && d2 >= 0.0d && d2 <= 24.0d && d2 >= d;
    }

    private synchronized void resetNextUpdateTime(SharedPreferences.Editor editor, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        long j = ((long) i) * RE_SCHEDULER_APPEND_TIME;
        editor.putLong("nTimeToUpdate", currentTimeMillis + j);
        String str = this.TAG;
        XWebLog.addInitializeLog(str, "resetNextUpdateTime, update after " + (j / 60000) + " minutes");
    }

    public void abandonCurrentScheduler() {
        XWebLog.addInitializeLog(this.TAG, "abandon current scheduler");
        saveSchedulerConfig((SchedulerConfig) null);
    }

    public boolean checkNeedFetchConfig(long j, long j2) {
        long fetchConfigPeriod = getFetchConfigPeriod();
        if (j > j2 + fetchConfigPeriod || j + fetchConfigPeriod < j2) {
            return true;
        }
        XWebLog.addInitializeLog(this.TAG, "checkNeedFetchConfig, no need");
        return false;
    }

    public String dumpSchedule() {
        String str;
        String str2;
        if (hasScheduler()) {
            Date date = new Date(getCurSchedulerConfig().nTimeToUpdate);
            StringBuilder sb = new StringBuilder();
            sb.append(this.TAG);
            sb.append(": has scheduler for ver = ");
            sb.append(getCurSchedulerConfig().version);
            sb.append(" version id = ");
            sb.append(getCurSchedulerConfig().versionId);
            sb.append(" update time in ");
            sb.append(date);
            String str3 = "";
            if (!TextUtils.isEmpty(getCurSchedulerConfig().updateSpeedConfig)) {
                str = " update speed config:" + getCurSchedulerConfig().updateSpeedConfig;
            } else {
                str = str3;
            }
            sb.append(str);
            if (!TextUtils.isEmpty(getCurSchedulerConfig().updateForwardSpeedConfig)) {
                str2 = " update forward speed config:" + getCurSchedulerConfig().updateForwardSpeedConfig;
            } else {
                str2 = str3;
            }
            sb.append(str2);
            if (!TextUtils.isEmpty(getCurSchedulerConfig().updateScheduleTimeRangeBind)) {
                str3 = " update time range config:" + getCurSchedulerConfig().updateScheduleTimeRangeBind;
            }
            sb.append(str3);
            return sb.toString();
        }
        return this.TAG + ": has no scheduler";
    }

    public double getCurHourSpeed(String str) {
        return getCurHourSpeed(str, NumberUtil.getCurrentHour());
    }

    public final String getCurHourSpeedConfig(boolean z) {
        return (!z || TextUtils.isEmpty(getCurSchedulerConfig().updateForwardSpeedConfig)) ? (z || TextUtils.isEmpty(getCurSchedulerConfig().updateSpeedConfig)) ? getCustomCurHourSpeedConfig(z) : getCurSchedulerConfig().updateSpeedConfig : getCurSchedulerConfig().updateForwardSpeedConfig;
    }

    public double getCurHourUpdateTimeGapForwardMillis() {
        this.mParseScheduleConfigFailed = false;
        return getCurHourSpeed(getCurHourSpeedConfig(true)) * 3600000.0d;
    }

    public double getCurHourUpdateTimeGapMillis() {
        this.mParseScheduleConfigFailed = false;
        return getCurHourSpeed(getCurHourSpeedConfig(false)) * 3600000.0d;
    }

    public synchronized SchedulerConfig getCurSchedulerConfig() {
        SchedulerConfig schedulerConfig2 = this.schedulerConfig;
        if (schedulerConfig2 != null) {
            return schedulerConfig2;
        }
        SchedulerConfig schedulerConfig3 = new SchedulerConfig();
        this.schedulerConfig = schedulerConfig3;
        schedulerConfig3.strScheduleType = getScheduleType();
        SharedPreferences mMKVSharedPreferencesForSchduler = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForSchduler(getScheduleType());
        this.schedulerConfig.nLastFetchConfigTime = mMKVSharedPreferencesForSchduler.getLong("nLastFetchConfigTime", 0);
        this.schedulerConfig.strLastFetchAbi = mMKVSharedPreferencesForSchduler.getString("strLastFetchAbi", "");
        if (!mMKVSharedPreferencesForSchduler.contains("strUrl")) {
            return this.schedulerConfig;
        }
        this.schedulerConfig.strMd5 = mMKVSharedPreferencesForSchduler.getString("strMd5", "");
        this.schedulerConfig.versionId = mMKVSharedPreferencesForSchduler.getInt("versionId", 0);
        this.schedulerConfig.timeHourStart = mMKVSharedPreferencesForSchduler.getFloat("timeHourStart", -1.0f);
        this.schedulerConfig.timeHourEnd = mMKVSharedPreferencesForSchduler.getFloat("timeHourEnd", -1.0f);
        this.schedulerConfig.strUrl = mMKVSharedPreferencesForSchduler.getString("strUrl", "");
        this.schedulerConfig.strFullPackageUrl = mMKVSharedPreferencesForSchduler.getString("strFullPackageUrl", "");
        this.schedulerConfig.strConfigVer = mMKVSharedPreferencesForSchduler.getString("strConfigVer", "");
        this.schedulerConfig.bIsPatchUpdate = mMKVSharedPreferencesForSchduler.getBoolean("bIsPatchUpdate", false);
        this.schedulerConfig.nTimeToUpdate = mMKVSharedPreferencesForSchduler.getLong("nTimeToUpdate", 0);
        this.schedulerConfig.version = mMKVSharedPreferencesForSchduler.getInt(ProviderConstants.API_COLNAME_FEATURE_VERSION, 0);
        this.schedulerConfig.nTryCnt = mMKVSharedPreferencesForSchduler.getInt("nTryCnt", 0);
        this.schedulerConfig.nPatchTargetVersion = mMKVSharedPreferencesForSchduler.getInt("nPatchTargetVersion", 0);
        this.schedulerConfig.nTryUseSharedCoreCount = mMKVSharedPreferencesForSchduler.getInt("nTryUseSharedCoreCount", 0);
        this.schedulerConfig.patchMd5 = mMKVSharedPreferencesForSchduler.getString("patchMd5", "");
        this.schedulerConfig.strVersionDetail = mMKVSharedPreferencesForSchduler.getString("strVersionDetail", "");
        this.schedulerConfig.bCanUseCellular = mMKVSharedPreferencesForSchduler.getBoolean("bCanUseCellular", false);
        this.schedulerConfig.bUseCdn = mMKVSharedPreferencesForSchduler.getBoolean("bUseCdn", false);
        this.schedulerConfig.bTryUseSharedCore = mMKVSharedPreferencesForSchduler.getBoolean("bTryUseSharedCore", true);
        this.schedulerConfig.skipSubFileMD5Check = mMKVSharedPreferencesForSchduler.getBoolean("skipSubFileMD5Check", true);
        this.schedulerConfig.strAbi = mMKVSharedPreferencesForSchduler.getString("strAbi", "");
        this.schedulerConfig.path = mMKVSharedPreferencesForSchduler.getString("path", "");
        this.schedulerConfig.updateSpeedConfig = mMKVSharedPreferencesForSchduler.getString(CommandDef.COMMAND_UPDATE_SPEED_CONFIG, "");
        this.schedulerConfig.updateForwardSpeedConfig = mMKVSharedPreferencesForSchduler.getString(CommandDef.COMMAND_UPDATE_FORWARD_SPEED_CONFIG, "");
        this.schedulerConfig.updateScheduleTimeRangeBind = mMKVSharedPreferencesForSchduler.getString(CommandDef.COMMAND_UPDATE_SCHEDULE_TIME_RANGE_BIND, "");
        this.schedulerConfig.nPatchType = mMKVSharedPreferencesForSchduler.getInt("nPatchType", 1);
        return this.schedulerConfig;
    }

    public abstract String getCustomCurHourSpeedConfig(boolean z);

    public String getCustomTimeRangeBindConfig() {
        return CommandCfg.getInstance().getCmd(CommandDef.COMMAND_UPDATE_SCHEDULE_TIME_RANGE_BIND, XWalkEnvironment.MODULE_TOOLS);
    }

    public String getFreeFetchConfigZoneConfig() {
        return CommandCfg.getInstance().getCmd(CommandDef.COMMAND_FREE_FETCH_CONFIG_TIME_ZONE, XWalkEnvironment.MODULE_TOOLS);
    }

    public int getIdkeyOffsetFromDefault() {
        return 0;
    }

    public abstract String getScheduleType();

    public List<TimeRangeBind> getTimeRangeBind() {
        ArrayList arrayList = new ArrayList();
        String timeRangeBindConfig = getTimeRangeBindConfig();
        if (TextUtils.isEmpty(timeRangeBindConfig)) {
            return arrayList;
        }
        String[] split = timeRangeBindConfig.split(";");
        if (split == null || split.length == 0) {
            this.mParseScheduleConfigFailed = true;
            return arrayList;
        }
        for (String str : split) {
            if (!TextUtils.isEmpty(str)) {
                TimeRangeBind timeRangePairItem = getTimeRangePairItem(str);
                if (timeRangePairItem == null) {
                    this.mParseScheduleConfigFailed = true;
                } else {
                    arrayList.add(timeRangePairItem);
                }
            }
        }
        return arrayList;
    }

    public synchronized boolean hasScheduler() {
        return getCurSchedulerConfig() != null && getCurSchedulerConfig().version > 0 && !TextUtils.isEmpty(getCurSchedulerConfig().strUrl);
    }

    public boolean isInFreeFetchConfigTimeZone() {
        TimeRange timeRange;
        String[] hourSpeedPieces = getHourSpeedPieces(getFreeFetchConfigZoneConfig());
        if (!(hourSpeedPieces == null || hourSpeedPieces.length == 0)) {
            double currentHour = NumberUtil.getCurrentHour();
            for (String str : hourSpeedPieces) {
                if (!TextUtils.isEmpty(str) && (timeRange = TimeRange.getTimeRange(str)) != null && currentHour >= timeRange.timeStart && currentHour <= timeRange.timeEnd) {
                    return ((double) XWebGrayValueUtil.getTodayGrayValue()) < timeRange.scale * 10000.0d;
                }
            }
        }
        return false;
    }

    public boolean isInFreeUpdateTimeZone() {
        String[] split;
        String cmd = CommandCfg.getInstance().getCmd(CommandDef.COMMAND_FREE_UPDATE_TIME_ZONE, XWalkEnvironment.MODULE_TOOLS);
        if (TextUtils.isEmpty(cmd) || !cmd.contains("-") || (split = cmd.split("-")) == null || split.length != 2) {
            return false;
        }
        NumberUtil.ParseResult safeParseDouble = NumberUtil.safeParseDouble(split[0]);
        if (!safeParseDouble.parseSuc) {
            return false;
        }
        NumberUtil.ParseResult safeParseDouble2 = NumberUtil.safeParseDouble(split[1]);
        if (!safeParseDouble2.parseSuc || !isValidUpdateTimeZone(safeParseDouble.doubleValue(), safeParseDouble2.doubleValue())) {
            return false;
        }
        double currentHour = NumberUtil.getCurrentHour();
        return currentHour >= safeParseDouble.doubleValue() && currentHour <= safeParseDouble2.doubleValue();
    }

    public boolean isMatchTimeRangeBind(long j, double d) {
        return isMatchTimeRangeBind(NumberUtil.getCurrentHour(), NumberUtil.milliesToHourInDay(j), d);
    }

    public boolean isSameScheduler(SchedulerConfig schedulerConfig2, SchedulerConfig schedulerConfig3) {
        if (schedulerConfig2.version == schedulerConfig3.version && schedulerConfig2.bCanUseCellular == schedulerConfig3.bCanUseCellular && schedulerConfig2.bUseCdn == schedulerConfig3.bUseCdn && schedulerConfig2.bIsPatchUpdate == schedulerConfig3.bIsPatchUpdate && schedulerConfig2.versionId == schedulerConfig3.versionId && isSameString(schedulerConfig2.strMd5, schedulerConfig3.strMd5) && isSameString(schedulerConfig2.strFullPackageUrl, schedulerConfig3.strFullPackageUrl) && isSameString(schedulerConfig2.strAbi, schedulerConfig3.strAbi) && schedulerConfig2.nPatchType == schedulerConfig3.nPatchType) {
            return !schedulerConfig2.bIsPatchUpdate || isSameString(schedulerConfig2.patchMd5, schedulerConfig3.patchMd5);
        }
        return false;
    }

    public boolean isSameString(String str, String str2) {
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return str == null ? str == str2 : str.equals(str2);
        }
        return true;
    }

    public synchronized boolean isTimeToUpdate(boolean z) {
        return isTimeToUpdate(z, 0);
    }

    public boolean needForceUpdate() {
        return false;
    }

    public void onStartFetchConfig() {
        getCurSchedulerConfig().nLastFetchConfigTime = System.currentTimeMillis();
        getCurSchedulerConfig().strLastFetchAbi = AbiUtil.getRuntimeAbi();
        SharedPreferences.Editor edit = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForSchduler(getScheduleType()).edit();
        edit.putLong("nLastFetchConfigTime", getCurSchedulerConfig().nLastFetchConfigTime);
        edit.putString("strLastFetchAbi", getCurSchedulerConfig().strLastFetchAbi);
        edit.commit();
    }

    public void onUpdateFailed(int i) {
        if (i == -10) {
            SharedPreferences mMKVSharedPreferencesForSchduler = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForSchduler(getScheduleType());
            int i2 = mMKVSharedPreferencesForSchduler.getInt("nTryUseSharedCoreCount", 0);
            String str = this.TAG;
            XWebLog.addInitializeLog(str, "onUpdateFailed, shared mode, current nTryUseSharedCoreCount:" + i2);
            int i3 = i2 + 1;
            getCurSchedulerConfig().nTryUseSharedCoreCount = i3;
            SharedPreferences.Editor edit = mMKVSharedPreferencesForSchduler.edit();
            edit.putInt("nTryUseSharedCoreCount", i3);
            resetNextUpdateTime(edit, i3);
            edit.commit();
        } else if (!NetworkUtil.isNetworkAvailable()) {
            XWebLog.m21913w(this.TAG, "onUpdateFailed, network not available");
        } else {
            SharedPreferences mMKVSharedPreferencesForSchduler2 = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForSchduler(getScheduleType());
            int i4 = mMKVSharedPreferencesForSchduler2.getInt("nTryCnt", 0) + 1;
            if (i == -3 || i == -4) {
                getCurSchedulerConfig().bIsPatchUpdate = false;
                getCurSchedulerConfig().strUrl = getCurSchedulerConfig().strFullPackageUrl;
                getCurSchedulerConfig().bCanUseCellular = false;
                saveSchedulerConfig(getCurSchedulerConfig());
                XWebLog.addInitializeLog(this.TAG, "onUpdateFailed, switch to full package update");
            } else if (i <= -2 && i >= -5) {
                i4 = (int) (((long) i4) + 3);
            }
            if (((long) i4) > 3) {
                XWebLog.addInitializeLog(this.TAG, "onUpdateFailed, failed too many times, abandon current scheduler");
                abandonCurrentScheduler();
                return;
            }
            getCurSchedulerConfig().nTryCnt = i4;
            SharedPreferences.Editor edit2 = mMKVSharedPreferencesForSchduler2.edit();
            edit2.putInt("nTryCnt", i4);
            resetNextUpdateTime(edit2, i4);
            edit2.commit();
        }
    }

    public SchedulerConfig onUpdateScheduleConfig(SchedulerConfig schedulerConfig2) {
        SchedulerConfig curSchedulerConfig = getCurSchedulerConfig();
        if (schedulerConfig2 == null) {
            XWebLog.addInitializeLog(this.TAG, "onUpdateScheduleConfig, got no schedule need download");
            if (hasScheduler()) {
                if (curSchedulerConfig != null) {
                    String str = this.TAG;
                    XWebLog.addInitializeLog(str, "onUpdateScheduleConfig, clear current scheduler, version:" + curSchedulerConfig.version);
                }
                saveSchedulerConfig((SchedulerConfig) null);
            }
            return null;
        } else if (isSameScheduler(schedulerConfig2, curSchedulerConfig)) {
            boolean z = false;
            boolean z2 = true;
            if (!isSameString(schedulerConfig2.updateSpeedConfig, curSchedulerConfig.updateSpeedConfig)) {
                XWebLog.addInitializeLog(this.TAG, "onUpdateScheduleConfig, update UPDATE_SPEED_CONFIG");
                curSchedulerConfig.updateSpeedConfig = schedulerConfig2.updateSpeedConfig;
                z = true;
            }
            if (!isSameString(schedulerConfig2.updateForwardSpeedConfig, curSchedulerConfig.updateForwardSpeedConfig)) {
                XWebLog.addInitializeLog(this.TAG, "onUpdateScheduleConfig, update UPDATE_FORWARD_SPEED_CONFIG");
                curSchedulerConfig.updateForwardSpeedConfig = schedulerConfig2.updateForwardSpeedConfig;
                z = true;
            }
            if (!isSameString(schedulerConfig2.updateScheduleTimeRangeBind, curSchedulerConfig.updateScheduleTimeRangeBind)) {
                XWebLog.addInitializeLog(this.TAG, "onUpdateScheduleConfig, update UPDATE_SCHEDULE_TIME_RANGE_BIND");
                curSchedulerConfig.updateScheduleTimeRangeBind = schedulerConfig2.updateScheduleTimeRangeBind;
            } else {
                z2 = z;
            }
            if (z2) {
                saveSchedulerConfig(curSchedulerConfig);
            }
            XWebLog.addInitializeLog(this.TAG, "onUpdateScheduleConfig, got same scheduler, use current version");
            return curSchedulerConfig;
        } else {
            if (hasScheduler()) {
                WXWebReporter.idkeyReport(903, 149, 1);
                String str2 = this.TAG;
                XWebLog.addInitializeLog(str2, "onUpdateScheduleConfig, got newer scheduler, version: " + schedulerConfig2.version);
            }
            saveSchedulerConfig(schedulerConfig2);
            return schedulerConfig2;
        }
    }

    public void rescheduleToNextDay() {
        long j;
        double currentHour = NumberUtil.getCurrentHour();
        if (currentHour < ((double) getCurSchedulerConfig().timeHourStart) || currentHour < 6.0d) {
            String str = this.TAG;
            XWebLog.addInitializeLog(str, "rescheduleToNextDay, currentHour:" + currentHour + ", so still schedule in today");
            j = -((long) (currentHour * 3600000.0d));
        } else {
            j = NumberUtil.milliesToNextDay();
        }
        long randomTime = (long) (((double) j) + (getRandomTime(0.0d, getValidStartTime((double) getCurSchedulerConfig().timeHourStart), getValidEndTime((double) getCurSchedulerConfig().timeHourStart, (double) getCurSchedulerConfig().timeHourEnd)) * 3600000.0d));
        getCurSchedulerConfig().nTimeToUpdate = System.currentTimeMillis() + randomTime;
        saveSchedulerConfig(getCurSchedulerConfig());
        String str2 = this.TAG;
        XWebLog.addInitializeLog(str2, "rescheduleToNextDay, " + (randomTime / 60000) + " minutes later");
    }

    public synchronized void resetLastFetchConfigTime() {
        SharedPreferences.Editor edit = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForSchduler(getScheduleType()).edit();
        edit.putLong("nLastFetchConfigTime", 0);
        edit.commit();
        getCurSchedulerConfig().nLastFetchConfigTime = 0;
    }

    public synchronized void resetLastUpdateTime() {
        SharedPreferences.Editor edit = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForSchduler(getScheduleType()).edit();
        edit.putLong("nLastFetchConfigTime", 0);
        edit.commit();
        getCurSchedulerConfig().nLastFetchConfigTime = 0;
        getCurSchedulerConfig().nTimeToUpdate = 0;
    }

    public synchronized void saveSchedulerConfig(SchedulerConfig schedulerConfig2) {
        this.schedulerConfig = schedulerConfig2;
        if (schedulerConfig2 == null) {
            this.schedulerConfig = new SchedulerConfig();
        }
        this.schedulerConfig.strScheduleType = getScheduleType();
        SharedPreferences.Editor edit = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForSchduler(getScheduleType()).edit();
        edit.putString("strMd5", this.schedulerConfig.strMd5);
        edit.putString("strUrl", this.schedulerConfig.strUrl);
        edit.putString("strFullPackageUrl", this.schedulerConfig.strFullPackageUrl);
        edit.putString("strConfigVer", this.schedulerConfig.strConfigVer);
        edit.putBoolean("bIsPatchUpdate", this.schedulerConfig.bIsPatchUpdate);
        edit.putBoolean("bCanUseCellular", this.schedulerConfig.bCanUseCellular);
        edit.putBoolean("bUseCdn", this.schedulerConfig.bUseCdn);
        edit.putLong("nTimeToUpdate", this.schedulerConfig.nTimeToUpdate);
        edit.putInt(ProviderConstants.API_COLNAME_FEATURE_VERSION, this.schedulerConfig.version);
        edit.putInt("nTryCnt", this.schedulerConfig.nTryCnt);
        edit.putInt("nPatchTargetVersion", this.schedulerConfig.nPatchTargetVersion);
        edit.putInt("nTryUseSharedCoreCount", this.schedulerConfig.nTryUseSharedCoreCount);
        edit.putString("patchMd5", this.schedulerConfig.patchMd5);
        edit.putString("strVersionDetail", this.schedulerConfig.strVersionDetail);
        edit.putBoolean("bTryUseSharedCore", this.schedulerConfig.bTryUseSharedCore);
        edit.putBoolean("skipSubFileMD5Check", this.schedulerConfig.skipSubFileMD5Check);
        edit.putString("strAbi", this.schedulerConfig.strAbi);
        edit.putString("path", this.schedulerConfig.path);
        edit.putInt("versionId", this.schedulerConfig.versionId);
        edit.putFloat("timeHourStart", this.schedulerConfig.timeHourStart);
        edit.putFloat("timeHourEnd", this.schedulerConfig.timeHourEnd);
        edit.putString(CommandDef.COMMAND_UPDATE_SPEED_CONFIG, this.schedulerConfig.updateSpeedConfig);
        edit.putString(CommandDef.COMMAND_UPDATE_FORWARD_SPEED_CONFIG, this.schedulerConfig.updateForwardSpeedConfig);
        edit.putString(CommandDef.COMMAND_UPDATE_SCHEDULE_TIME_RANGE_BIND, this.schedulerConfig.updateScheduleTimeRangeBind);
        edit.putInt("nPatchType", this.schedulerConfig.nPatchType);
        edit.commit();
    }

    public double getCurHourSpeed(String str, double d) {
        TimeRange timeRange;
        if (TextUtils.isEmpty(str)) {
            return 1.0d;
        }
        String[] hourSpeedPieces = getHourSpeedPieces(str);
        if (hourSpeedPieces == null || hourSpeedPieces.length == 0) {
            this.mParseScheduleConfigFailed = true;
            return 1.0d;
        }
        for (String str2 : hourSpeedPieces) {
            if (!TextUtils.isEmpty(str2) && (timeRange = TimeRange.getTimeRange(str2)) != null && d >= timeRange.timeStart && d <= timeRange.timeEnd) {
                return timeRange.getScale(d);
            }
        }
        return 1.0d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01eb, code lost:
        return false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0177 A[SYNTHETIC, Splitter:B:74:0x0177] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isTimeToUpdate(boolean r28, int r29) {
        /*
            r27 = this;
            r8 = r27
            r0 = r29
            monitor-enter(r27)
            r1 = 2
            r9 = 0
            if (r0 <= r1) goto L_0x0012
            java.lang.String r0 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.String r1 = "isTimeToUpdate, abort because depth > 2"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x0205 }
            monitor-exit(r27)
            return r9
        L_0x0012:
            boolean r1 = r27.hasScheduler()     // Catch:{ all -> 0x0205 }
            if (r1 != 0) goto L_0x0021
            java.lang.String r0 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.String r1 = "isTimeToUpdate, abort because no scheduler"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x0205 }
            monitor-exit(r27)
            return r9
        L_0x0021:
            boolean r1 = r27.needForceUpdate()     // Catch:{ all -> 0x0205 }
            r10 = 1
            if (r1 != 0) goto L_0x01ed
            boolean r1 = sForceCheckUpdate     // Catch:{ all -> 0x0205 }
            if (r1 == 0) goto L_0x002e
            goto L_0x01ed
        L_0x002e:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0205 }
            double r13 = r27.getCurHourUpdateTimeGapMillis()     // Catch:{ all -> 0x0205 }
            boolean r1 = r8.mParseScheduleConfigFailed     // Catch:{ all -> 0x0205 }
            if (r1 == 0) goto L_0x0051
            java.lang.String r1 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.String r2 = "isTimeToUpdate, parse update speed failed"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r2)     // Catch:{ all -> 0x0205 }
            r15 = 903(0x387, double:4.46E-321)
            int r1 = r27.getIdkeyOffsetFromDefault()     // Catch:{ all -> 0x0205 }
            int r1 = r1 + 163
            long r1 = (long) r1     // Catch:{ all -> 0x0205 }
            r19 = 1
            r17 = r1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r15, r17, r19)     // Catch:{ all -> 0x0205 }
        L_0x0051:
            double r4 = r27.getCurHourUpdateTimeGapForwardMillis()     // Catch:{ all -> 0x0205 }
            boolean r1 = r8.mParseScheduleConfigFailed     // Catch:{ all -> 0x0205 }
            if (r1 == 0) goto L_0x0070
            java.lang.String r1 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.String r2 = "isTimeToUpdate, parse update forward speed failed"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r2)     // Catch:{ all -> 0x0205 }
            r15 = 903(0x387, double:4.46E-321)
            int r1 = r27.getIdkeyOffsetFromDefault()     // Catch:{ all -> 0x0205 }
            int r1 = r1 + 163
            long r1 = (long) r1     // Catch:{ all -> 0x0205 }
            r19 = 1
            r17 = r1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r15, r17, r19)     // Catch:{ all -> 0x0205 }
        L_0x0070:
            com.tencent.xweb.util.SchedulerConfig r1 = r27.getCurSchedulerConfig()     // Catch:{ all -> 0x0205 }
            long r1 = r1.nTimeToUpdate     // Catch:{ all -> 0x0205 }
            r6 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x00a8
            if (r28 != 0) goto L_0x0080
            monitor-exit(r27)
            return r10
        L_0x0080:
            r1 = 4704985352480227328(0x414b774000000000, double:3600000.0)
            double r6 = java.lang.Math.random()     // Catch:{ all -> 0x0205 }
            double r6 = r6 * r1
            long r1 = (long) r6     // Catch:{ all -> 0x0205 }
            long r1 = r11 - r1
            java.lang.String r3 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.String r6 = "no scheduled time, just random a time in one hour"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r3, r6)     // Catch:{ all -> 0x0205 }
            r15 = 903(0x387, double:4.46E-321)
            int r3 = r27.getIdkeyOffsetFromDefault()     // Catch:{ all -> 0x0205 }
            int r3 = r3 + 155
            long r6 = (long) r3     // Catch:{ all -> 0x0205 }
            r19 = 1
            r17 = r6
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r15, r17, r19)     // Catch:{ all -> 0x0205 }
            r6 = r1
            r15 = 0
            goto L_0x00aa
        L_0x00a8:
            r6 = r1
            r15 = 1
        L_0x00aa:
            java.lang.String r1 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0205 }
            r2.<init>()     // Catch:{ all -> 0x0205 }
            java.lang.String r3 = "scheduled time is after "
            r2.append(r3)     // Catch:{ all -> 0x0205 }
            long r16 = r6 - r11
            r18 = 60000(0xea60, double:2.9644E-319)
            long r9 = r16 / r18
            r2.append(r9)     // Catch:{ all -> 0x0205 }
            java.lang.String r3 = " minutes later"
            r2.append(r3)     // Catch:{ all -> 0x0205 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0205 }
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r2)     // Catch:{ all -> 0x0205 }
            long r9 = r11 - r6
            long r1 = com.tencent.xweb.util.NumberUtil.milliesToNextDay()     // Catch:{ all -> 0x0205 }
            long r16 = r1 + r11
            r18 = 180000(0x2bf20, double:8.8932E-319)
            long r21 = r6 - r18
            r23 = 86400000(0x5265c00, double:4.2687272E-316)
            long r25 = r16 - r23
            int r3 = (r21 > r25 ? 1 : (r21 == r25 ? 0 : -1))
            if (r3 >= 0) goto L_0x00e5
            r3 = 1
            goto L_0x00e6
        L_0x00e5:
            r3 = 0
        L_0x00e6:
            long r21 = r6 + r18
            int r25 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r25 <= 0) goto L_0x00ef
            r16 = 1
            goto L_0x00f1
        L_0x00ef:
            r16 = 0
        L_0x00f1:
            int r17 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r17 < 0) goto L_0x00fe
            long r1 = r1 + r18
            int r17 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r17 <= 0) goto L_0x00fc
            goto L_0x00fe
        L_0x00fc:
            r1 = 0
            goto L_0x00ff
        L_0x00fe:
            r1 = 1
        L_0x00ff:
            if (r15 != 0) goto L_0x0109
            java.lang.String r0 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.String r1 = "no scheduled time, ignore dangers time"
            com.tencent.xweb.util.XWebLog.m21911i(r0, r1)     // Catch:{ all -> 0x0205 }
            goto L_0x0151
        L_0x0109:
            if (r3 == 0) goto L_0x0127
            java.lang.String r1 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.String r2 = "isPastDaySchedule need reschedule to next day"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r1, r2)     // Catch:{ all -> 0x0205 }
            r27.rescheduleToNextDay()     // Catch:{ all -> 0x0205 }
            r9 = 903(0x387, double:4.46E-321)
            r11 = 146(0x92, double:7.2E-322)
            r13 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r9, r11, r13)     // Catch:{ all -> 0x0205 }
            r1 = 1
            int r0 = r0 + r1
            r1 = 0
            boolean r0 = r8.isTimeToUpdate(r1, r0)     // Catch:{ all -> 0x0205 }
            monitor-exit(r27)
            return r0
        L_0x0127:
            if (r16 == 0) goto L_0x013c
            java.lang.String r0 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.String r1 = "isFutureDaySchedule no need download now"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x0205 }
            r2 = 903(0x387, double:4.46E-321)
            r4 = 147(0x93, double:7.26E-322)
            r6 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r2, r4, r6)     // Catch:{ all -> 0x0205 }
            monitor-exit(r27)
            r0 = 0
            return r0
        L_0x013c:
            if (r1 == 0) goto L_0x0151
            java.lang.String r0 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.String r1 = "dangerous time do not update"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x0205 }
            r2 = 903(0x387, double:4.46E-321)
            r4 = 148(0x94, double:7.3E-322)
            r6 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r2, r4, r6)     // Catch:{ all -> 0x0205 }
            monitor-exit(r27)
            r0 = 0
            return r0
        L_0x0151:
            r1 = r27
            r2 = r13
            r16 = r11
            r11 = r6
            r6 = r9
            boolean r0 = r1.getShouldUpdateFromConfig(r2, r4, r6)     // Catch:{ all -> 0x0205 }
            if (r0 == 0) goto L_0x0177
            java.lang.String r0 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.String r1 = "time to update"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x0205 }
            r2 = 903(0x387, double:4.46E-321)
            int r0 = r27.getIdkeyOffsetFromDefault()     // Catch:{ all -> 0x0205 }
            int r0 = r0 + 152
            long r4 = (long) r0     // Catch:{ all -> 0x0205 }
            r6 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r2, r4, r6)     // Catch:{ all -> 0x0205 }
            monitor-exit(r27)
            r0 = 1
            return r0
        L_0x0177:
            boolean r0 = r27.isInFreeUpdateTimeZone()     // Catch:{ all -> 0x0205 }
            if (r0 == 0) goto L_0x0196
            java.lang.String r0 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.String r1 = "time to update because in free update time zone"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x0205 }
            r2 = 903(0x387, double:4.46E-321)
            int r0 = r27.getIdkeyOffsetFromDefault()     // Catch:{ all -> 0x0205 }
            int r0 = r0 + 153
            long r4 = (long) r0     // Catch:{ all -> 0x0205 }
            r6 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r2, r4, r6)     // Catch:{ all -> 0x0205 }
            monitor-exit(r27)
            r0 = 1
            return r0
        L_0x0196:
            r0 = 4715597048437538816(0x41712a8800000000, double:1.8E7)
            double r13 = r13 / r0
            boolean r0 = r8.isMatchTimeRangeBind(r11, r13)     // Catch:{ all -> 0x0205 }
            if (r0 == 0) goto L_0x01b3
            r1 = 903(0x387, double:4.46E-321)
            int r0 = r27.getIdkeyOffsetFromDefault()     // Catch:{ all -> 0x0205 }
            int r0 = r0 + 162
            long r3 = (long) r0     // Catch:{ all -> 0x0205 }
            r5 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r1, r3, r5)     // Catch:{ all -> 0x0205 }
            monitor-exit(r27)
            r0 = 1
            return r0
        L_0x01b3:
            if (r15 == 0) goto L_0x01e3
            com.tencent.xweb.util.SchedulerConfig r0 = r27.getCurSchedulerConfig()     // Catch:{ all -> 0x0205 }
            long r0 = r0.nTimeToUpdate     // Catch:{ all -> 0x0205 }
            long r11 = r16 - r0
            long r0 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0205 }
            r2 = 7776000000(0x1cf7c5800, double:3.841854462E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x01e3
            java.lang.String r0 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.String r1 = "has scheduler waiting for update, but time has passed"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x0205 }
            r27.rescheduleToNextDay()     // Catch:{ all -> 0x0205 }
            r2 = 903(0x387, double:4.46E-321)
            int r0 = r27.getIdkeyOffsetFromDefault()     // Catch:{ all -> 0x0205 }
            int r0 = r0 + 156
            long r4 = (long) r0     // Catch:{ all -> 0x0205 }
            r6 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r2, r4, r6)     // Catch:{ all -> 0x0205 }
            goto L_0x01ea
        L_0x01e3:
            java.lang.String r0 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.String r1 = "has scheduler waiting for update, but time is not up"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x0205 }
        L_0x01ea:
            monitor-exit(r27)
            r0 = 0
            return r0
        L_0x01ed:
            java.lang.String r0 = r8.TAG     // Catch:{ all -> 0x0205 }
            java.lang.String r1 = "isTimeToUpdate, force update"
            com.tencent.xweb.util.XWebLog.addInitializeLog(r0, r1)     // Catch:{ all -> 0x0205 }
            r2 = 903(0x387, double:4.46E-321)
            int r0 = r27.getIdkeyOffsetFromDefault()     // Catch:{ all -> 0x0205 }
            int r0 = r0 + 157
            long r4 = (long) r0     // Catch:{ all -> 0x0205 }
            r6 = 1
            com.tencent.xweb.util.WXWebReporter.idkeyReport(r2, r4, r6)     // Catch:{ all -> 0x0205 }
            monitor-exit(r27)
            r0 = 1
            return r0
        L_0x0205:
            r0 = move-exception
            monitor-exit(r27)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.xweb.util.Scheduler.isTimeToUpdate(boolean, int):boolean");
    }

    public synchronized boolean checkNeedFetchConfig() {
        try {
            if (!AbiUtil.getRuntimeAbi().equalsIgnoreCase(getCurSchedulerConfig().strLastFetchAbi) && !TextUtils.isEmpty(getCurSchedulerConfig().strLastFetchAbi) && !"true".equalsIgnoreCase(CommandCfgPlugin.getInstance().getCmd(CommandDef.COMMAND_DISABLE_ABI_SWITCH_RESET_CONFIG_TIME, XWalkEnvironment.MODULE_TOOLS))) {
                XWebLog.addInitializeLog(this.TAG, "checkNeedFetchConfig, disable_abi_switch_reset_config_time is true");
                return true;
            }
        } catch (Throwable th) {
            XWebLog.m21910e(this.TAG, "checkNeedFetchConfig, identify abi switch error", th);
        }
        if (isInFreeFetchConfigTimeZone()) {
            XWebLog.addInitializeLog(this.TAG, "checkNeedFetchConfig, in FreeFetchConfigTimeZone");
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (checkNeedFetchConfig(currentTimeMillis, getCurSchedulerConfig().nLastFetchConfigTime)) {
            long j = XWebSharedPreferenceUtil.getMMKVSharedPreferencesForSchduler(getScheduleType()).getLong("nLastFetchConfigTime", 0);
            getCurSchedulerConfig().nLastFetchConfigTime = j;
            if (checkNeedFetchConfig(currentTimeMillis, j)) {
                XWebLog.addInitializeLog(this.TAG, "checkNeedFetchConfig, need fetch config");
                return true;
            }
        }
        return false;
    }

    public boolean isMatchTimeRangeBind(double d, double d2, double d3) {
        double d4 = d;
        double d5 = d2;
        this.mParseScheduleConfigFailed = false;
        List<TimeRangeBind> timeRangeBind = getTimeRangeBind();
        if (this.mParseScheduleConfigFailed) {
            XWebLog.addInitializeLog(this.TAG, "isMatchTimeRangeBind, parse range schedule config failed");
            WXWebReporter.idkeyReport(903, (long) (getIdkeyOffsetFromDefault() + 163), 1);
        }
        for (TimeRangeBind next : timeRangeBind) {
            if (next.isMatched(d, d2, d3)) {
                String str = this.TAG;
                XWebLog.addInitializeLog(str, "isMatchTimeRangeBind, matched time range zone, currentHour:" + d4 + " scheduleHour:" + d5 + ", timeRange:" + next.dump(d4, d5));
                return true;
            }
        }
        return false;
    }
}
