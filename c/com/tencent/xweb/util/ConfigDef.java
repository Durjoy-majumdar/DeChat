package com.tencent.xweb.util;

import android.os.Build;
import android.text.TextUtils;
import com.tencent.xweb.XWebSdk;
import com.tencent.xweb.file.XVFSFile;
import com.tencent.xweb.internal.ConstValue;
import com.tencent.xweb.util.NumberUtil;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.xwalk.core.XWalkEnvironment;

public class ConfigDef {
    private static final String TAG = "ConfigDef";

    public static class BaseVersion {
        public String UPDATE_FORWARD_SPEED_CONFIG;
        public String UPDATE_SCHEDULE_TIME_RANGE_BIND;
        public String UPDATE_SPEED_CONFIG;
        public boolean bCanUseCellular;
        public boolean bForbidDownloadWhenNoUin;
        public boolean bUseCdn;
        public Filter filter = new Filter();
        public boolean lowPriority;
        public int nPeriod;
        public Patch[] patches;
        public String releaseDate;
        public String strMd5;
        public String strUrl;
        public float updateEndTime = -1.0f;
        public String updateSchedule;
        public float updateStartTime = -1.0f;
        public int version;
        public int versionId;

        public int[] getSchedules() {
            if (TextUtils.isEmpty(this.updateSchedule)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (String str : this.updateSchedule.split(XVFSFile.PATH_SEPARATOR)) {
                if (!TextUtils.isEmpty(str)) {
                    NumberUtil.ParseResult safeParseInt = NumberUtil.safeParseInt(str);
                    if (safeParseInt.parseSuc) {
                        int intValue = safeParseInt.intValue();
                        if (intValue < 0 || intValue > 10000) {
                            XWebLog.m21909e(ConfigDef.TAG, " get invalid schedule value = " + intValue + ", schedule str is " + this.updateSchedule);
                            return null;
                        }
                        arrayList.add(safeParseInt);
                    } else {
                        XWebLog.m21909e(ConfigDef.TAG, " parse schedule failed, schedule str is " + this.updateSchedule);
                        return null;
                    }
                }
            }
            if (arrayList.size() == 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            while (i < arrayList.size()) {
                int intValue2 = ((NumberUtil.ParseResult) arrayList.get(i)).intValue();
                if (i <= 0 || intValue2 >= iArr[i - 1]) {
                    iArr[i] = intValue2;
                    i++;
                } else {
                    XWebLog.m21909e(ConfigDef.TAG, " get invalid schedule this value smaller than previous one, schedule str is " + this.updateSchedule);
                    return null;
                }
            }
            return iArr;
        }
    }

    public static class Command {
        public Filter filter = new Filter();
        public String module;
        public String optype;
        public String opvalue;

        public String toString() {
            return "Command{optype='" + this.optype + '\'' + ", opvalue='" + this.opvalue + '\'' + ", module='" + this.module + '\'' + ", filter=" + this.filter + '}';
        }
    }

    public static class Config {
        public Command[] commands;
        public String signature;
        public String strConfigVer;
        public String strMd5;
        public Version[] versions;
    }

    public static class Filter {
        public int apiMax = -1;
        public int apiMin = -1;
        public int apkMax = -1;
        public int apkMin = -1;
        public int appClientVerMax = -1;
        public int appClientVerMin = -1;
        public String appInfoBlackList;
        public String appInfoWhiteList;
        public String blackDeviceAbis = null;
        public String blackRuntimeAbis = null;
        public int chromeMax = -1;
        public int chromeMin = -1;
        public int dayGrayMax = -1;
        public int dayGrayMin = -1;
        public String deviceAbis = null;
        public String forbidAppRegex = "";
        public String forbidDeviceRegex = "";
        public int grayMax = -1;
        public int grayMin = -1;
        public double hoursEnd = -1.0d;
        public double hoursStart = -1.0d;
        public int preDownApkMax = -1;
        public int preDownApkMin = -1;
        public String runtimeAbis = null;
        public int sdkMax = -1;
        public int sdkMin = -1;
        private String source;
        private String strTargetRuntimeAbi = null;
        public int targetApiMax = -1;
        public int targetApiMin = -1;
        public int usertype = -1;
        public String whiteAppRegex = "";
        public String whiteDeviceRegex = "";
        public int x5coremax = -1;
        public int x5coremin = -1;
        public int x5sdkmax = -1;
        public int x5sdkmin = -1;

        private boolean checkAppInfoBlackList() {
            return !TextUtils.isEmpty(this.appInfoBlackList) && XWalkEnvironment.containsAppInfo(this.appInfoBlackList);
        }

        private boolean checkAppInfoWhiteList() {
            return !TextUtils.isEmpty(this.appInfoWhiteList) && !XWalkEnvironment.containsAppInfo(this.appInfoWhiteList);
        }

        private boolean checkBlackDeviceAbis() {
            return !TextUtils.isEmpty(this.blackDeviceAbis) && matchAbis(this.blackDeviceAbis, AbiUtil.getDeviceAbi());
        }

        private boolean checkBlackRuntimeAbis() {
            return !TextUtils.isEmpty(this.blackRuntimeAbis) && matchAbis(this.blackRuntimeAbis, getTargetRuntimeAbi());
        }

        private boolean checkDeviceAbis() {
            return !TextUtils.isEmpty(this.deviceAbis) && !matchAbis(this.deviceAbis, AbiUtil.getDeviceAbi());
        }

        private boolean checkRuntimeAbis(boolean z) {
            return (z || !TextUtils.isEmpty(this.runtimeAbis)) && !matchAbis(this.runtimeAbis, getTargetRuntimeAbi());
        }

        private boolean checkUserType() {
            return this.usertype > 0 && XWebSdk.getIpType() != this.usertype;
        }

        private boolean checkValuesInRange(int i, int i2, int i3, int i4, boolean z) {
            return z && isInRange(i, this.apkMin, this.apkMax) && isInRange(i2, this.preDownApkMin, this.preDownApkMax) && isInRange(i3, this.sdkMin, this.sdkMax) && isInRange(Build.VERSION.SDK_INT, this.apiMin, this.apiMax) && isInRange(i4, this.targetApiMin, this.targetApiMax) && isInRange(XWebGrayValueUtil.getTodayGrayValue(), this.dayGrayMin, this.dayGrayMax) && !isMatchDeviceRex(this.forbidDeviceRegex) && !isMatchRex(this.forbidAppRegex, XWalkEnvironment.getPackageName()) && isInTimeRange();
        }

        private boolean checkWhiteAppRegex() {
            String str = this.whiteAppRegex;
            return str != null && str.trim() != null && !this.whiteAppRegex.trim().isEmpty() && !isMatchRex(this.whiteAppRegex, XWalkEnvironment.getPackageName());
        }

        private boolean checkWhiteDeviceRegex() {
            String str = this.whiteDeviceRegex;
            return str != null && str.trim() != null && !this.whiteDeviceRegex.trim().isEmpty() && !isMatchDeviceRex(this.whiteDeviceRegex);
        }

        private String getLogTag() {
            String str = this.source;
            if (str == null || "".equals(str)) {
                return "ConfigFilter(" + hashCode() + ")";
            }
            return "ConfigFilter(" + this.source + "|" + hashCode() + ")";
        }

        private static boolean isInRange(int i, int i2, int i3) {
            if (i3 <= 0 || i <= i3) {
                return i2 <= 0 || i >= i2;
            }
            return false;
        }

        private boolean isInTimeRange() {
            if (!isValidHour(this.hoursStart) && !isValidHour(this.hoursEnd)) {
                return true;
            }
            double currentHour = NumberUtil.getCurrentHour();
            double d = this.hoursEnd;
            if (d > 0.0d && currentHour > d) {
                return false;
            }
            double d2 = this.hoursStart;
            return d2 <= 0.0d || currentHour >= d2;
        }

        private static boolean isMatchDeviceRex(String str) {
            String str2 = "";
            if (CachedSystemBuildInfo.getBrand() != null) {
                str2 = str2 + CachedSystemBuildInfo.getBrand();
            }
            if (CachedSystemBuildInfo.getModel() != null) {
                str2 = str2 + " " + CachedSystemBuildInfo.getModel();
            }
            if (CachedSystemBuildInfo.getManufacturer() != null) {
                str2 = str2 + " " + CachedSystemBuildInfo.getManufacturer();
            }
            if (str == null || str2 == null || str.isEmpty()) {
                return false;
            }
            return isMatchRex(str, str2);
        }

        private static boolean isMatchRex(String str, String str2) {
            boolean z = false;
            if (str == null || str.isEmpty() || str.trim() == null || str.trim().isEmpty() || str2 == null || str2.isEmpty()) {
                return false;
            }
            try {
                z = Pattern.compile(str.toUpperCase()).matcher(str2.toUpperCase()).find();
                XWebLog.m21913w(ConfigDef.TAG, "isMatchRex, result:" + z + ", regex:" + str + ", content:" + str2);
                return z;
            } catch (Throwable unused) {
                XWebLog.m21909e(ConfigDef.TAG, "_IsMatchRex, compile pattern failed, strRex:" + str + ", strContent:" + str2);
                return z;
            }
        }

        private boolean isValidHour(double d) {
            return d >= 0.0d && d < 24.0d;
        }

        private static boolean matchAbis(String str, String str2) {
            String[] split;
            if (str == null || (split = str.split("\\|")) == null || split.length < 0 || TextUtils.isEmpty(str2)) {
                return false;
            }
            String trim = str2.trim();
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3) && str3.trim().equalsIgnoreCase(trim)) {
                    return true;
                }
            }
            return false;
        }

        public boolean checkMatch(boolean z, boolean z2, String str) {
            this.source = str;
            int installedNewstVersionForCurAbi = XWalkEnvironment.getInstalledNewstVersionForCurAbi();
            int installedNewstVersionForPredownAbi = XWalkEnvironment.getInstalledNewstVersionForPredownAbi();
            int xWebSdkVersion = XWebSdk.getXWebSdkVersion();
            int i = XWalkEnvironment.getApplicationContext().getApplicationInfo() != null ? XWalkEnvironment.getApplicationContext().getApplicationInfo().targetSdkVersion : 0;
            boolean z3 = z || isInRange(XWebGrayValueUtil.getGrayValue(), this.grayMin, this.grayMax);
            String logTag = getLogTag();
            StringBuilder sb = new StringBuilder();
            sb.append("checkMatch, ignoreGrayValue:");
            sb.append(z);
            sb.append(", grayValue(");
            sb.append(XWebGrayValueUtil.getGrayValue());
            sb.append("):");
            sb.append(isInRange(XWebGrayValueUtil.getGrayValue(), this.grayMin, this.grayMax));
            sb.append(", apk(");
            sb.append(installedNewstVersionForCurAbi);
            sb.append("):");
            sb.append(isInRange(installedNewstVersionForCurAbi, this.apkMin, this.apkMax));
            sb.append(", preDownApk(");
            sb.append(installedNewstVersionForPredownAbi);
            sb.append("):");
            sb.append(isInRange(installedNewstVersionForPredownAbi, this.preDownApkMin, this.preDownApkMax));
            sb.append(", sdk(");
            sb.append(xWebSdkVersion);
            sb.append("):");
            sb.append(isInRange(xWebSdkVersion, this.sdkMin, this.sdkMax));
            sb.append(", api(");
            int i2 = Build.VERSION.SDK_INT;
            sb.append(i2);
            sb.append("):");
            sb.append(isInRange(i2, this.apiMin, this.apiMax));
            sb.append(", targetApi(");
            sb.append(i);
            sb.append("):");
            sb.append(isInRange(i, this.targetApiMin, this.targetApiMax));
            sb.append(", todayGrayValue(");
            sb.append(XWebGrayValueUtil.getTodayGrayValue());
            sb.append("):");
            sb.append(isInRange(XWebGrayValueUtil.getTodayGrayValue(), this.dayGrayMin, this.dayGrayMax));
            sb.append(", forbidDeviceRegex(");
            sb.append(this.forbidDeviceRegex);
            sb.append("):");
            sb.append(isMatchDeviceRex(this.forbidDeviceRegex));
            sb.append(", forbidAppRegex(");
            sb.append(this.forbidAppRegex);
            sb.append("):");
            sb.append(isMatchRex(this.forbidAppRegex, XWalkEnvironment.getPackageName()));
            sb.append(", timeRange:");
            sb.append(isInTimeRange());
            sb.append(", runtimeAbi:");
            sb.append(AbiUtil.getRuntimeAbi());
            sb.append(", targetRuntimeAbi:");
            sb.append(getTargetRuntimeAbi());
            XWebLog.m21911i(logTag, sb.toString());
            if (!checkValuesInRange(installedNewstVersionForCurAbi, installedNewstVersionForPredownAbi, xWebSdkVersion, i, z3)) {
                return false;
            }
            if (checkUserType()) {
                String logTag2 = getLogTag();
                XWebLog.m21911i(logTag2, "not match user type:" + this.usertype);
                return false;
            } else if (checkWhiteDeviceRegex()) {
                String logTag3 = getLogTag();
                XWebLog.m21911i(logTag3, "not match white device regex:" + this.whiteDeviceRegex);
                return false;
            } else if (checkWhiteAppRegex()) {
                String logTag4 = getLogTag();
                XWebLog.m21911i(logTag4, "not match white app regex:" + this.whiteAppRegex);
                return false;
            } else {
                if (this.chromeMin > 0 || this.chromeMax > 0) {
                    int chromiumVersion = ChromiumVersionUtil.getChromiumVersion();
                    if (!isInRange(chromiumVersion, this.chromeMin, this.chromeMax)) {
                        String logTag5 = getLogTag();
                        XWebLog.m21911i(logTag5, "not match chromium version(" + this.chromeMin + ", " + this.chromeMax + "), current version is:" + chromiumVersion);
                        return false;
                    }
                }
                if (checkRuntimeAbis(z2)) {
                    String logTag6 = getLogTag();
                    XWebLog.m21911i(logTag6, "not match whiteRuntimeAbis, white abis is:" + this.runtimeAbis + ", cur runtime abi is:" + AbiUtil.getRuntimeAbi() + ", target runtime abi:" + getTargetRuntimeAbi());
                    return false;
                } else if (checkDeviceAbis()) {
                    String logTag7 = getLogTag();
                    XWebLog.m21911i(logTag7, "not match whiteDeviceAbis, white abis is:" + this.deviceAbis + ", cur device abi is:" + AbiUtil.getDeviceAbi());
                    return false;
                } else if (checkBlackRuntimeAbis()) {
                    String logTag8 = getLogTag();
                    XWebLog.m21911i(logTag8, "match blackRuntimeAbis, black abis is:" + this.blackRuntimeAbis + ", cur runtime abi is:" + AbiUtil.getRuntimeAbi() + ", target runtime abi:" + getTargetRuntimeAbi());
                    return false;
                } else if (checkBlackDeviceAbis()) {
                    String logTag9 = getLogTag();
                    XWebLog.m21911i(logTag9, "match blackDeviceAbis, black abis is:" + this.blackDeviceAbis + ", cur device abi is:" + AbiUtil.getDeviceAbi());
                    return false;
                } else {
                    int initConfig = XWalkEnvironment.getInitConfig(ConstValue.INIT_CONFIG_KEY_CLIENT_VERSION, 0);
                    if (initConfig > 0 && !isInRange(initConfig, this.appClientVerMin, this.appClientVerMax)) {
                        String logTag10 = getLogTag();
                        XWebLog.m21911i(logTag10, "not match AppClientVersion(" + this.appClientVerMin + ", " + this.appClientVerMax + "), cur client version is:" + initConfig);
                        return false;
                    } else if (checkAppInfoWhiteList()) {
                        String logTag11 = getLogTag();
                        XWebLog.m21911i(logTag11, "not match appInfoWhiteList:" + this.appInfoWhiteList);
                        return false;
                    } else if (!checkAppInfoBlackList()) {
                        return true;
                    } else {
                        String logTag12 = getLogTag();
                        XWebLog.m21911i(logTag12, "match appInfoBlackList:" + this.appInfoBlackList);
                        return false;
                    }
                }
            }
        }

        public String getTargetRuntimeAbi() {
            return !TextUtils.isEmpty(this.strTargetRuntimeAbi) ? this.strTargetRuntimeAbi : AbiUtil.getRuntimeAbi();
        }

        public boolean isPredownMode() {
            return !AbiUtil.getRuntimeAbi().equalsIgnoreCase(this.strTargetRuntimeAbi);
        }

        public void setTargetRuntimeAbi(String str) {
            this.strTargetRuntimeAbi = str;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Filter{");
            if (this.sdkMin != 0) {
                sb.append("sdkMin=");
                sb.append(this.sdkMin);
            }
            if (this.sdkMax != 0) {
                sb.append(", sdkMax=");
                sb.append(this.sdkMax);
            }
            if (this.apkMin != 0) {
                sb.append(", apkMin=");
                sb.append(this.apkMin);
            }
            if (this.apkMax != 0) {
                sb.append(", apkMax=");
                sb.append(this.apkMax);
            }
            if (this.preDownApkMin != 0) {
                sb.append(", preDownApkMin=");
                sb.append(this.preDownApkMin);
            }
            if (this.preDownApkMax != 0) {
                sb.append(", preDownApkMax=");
                sb.append(this.preDownApkMax);
            }
            if (this.apiMin != 0) {
                sb.append(", apiMin=");
                sb.append(this.apiMin);
            }
            if (this.apiMax != 0) {
                sb.append(", apiMax=");
                sb.append(this.apiMax);
            }
            if (this.targetApiMin != 0) {
                sb.append(", targetApiMin=");
                sb.append(this.targetApiMin);
            }
            if (this.targetApiMax != 0) {
                sb.append(", targetApiMax=");
                sb.append(this.targetApiMax);
            }
            if (this.grayMin != 0) {
                sb.append(", grayMin=");
                sb.append(this.grayMin);
            }
            if (this.grayMax != 0) {
                sb.append(", grayMax=");
                sb.append(this.grayMax);
            }
            if (this.dayGrayMin != 0) {
                sb.append(", dayGrayMin=");
                sb.append(this.dayGrayMin);
            }
            if (this.dayGrayMax != 0) {
                sb.append(", dayGrayMax=");
                sb.append(this.dayGrayMax);
            }
            if (this.chromeMin != 0) {
                sb.append(", chromeMin=");
                sb.append(this.chromeMin);
            }
            if (this.chromeMax != 0) {
                sb.append(", chromeMax=");
                sb.append(this.chromeMax);
            }
            if (this.usertype != 0) {
                sb.append(", usertype=");
                sb.append(this.usertype);
            }
            if (this.hoursStart != -1.0d) {
                sb.append(", hoursStart=");
                sb.append(this.hoursStart);
            }
            if (this.hoursEnd != -1.0d) {
                sb.append(", hoursEnd=");
                sb.append(this.hoursEnd);
            }
            if (this.x5sdkmin != 0) {
                sb.append(", x5sdkmin=");
                sb.append(this.x5sdkmin);
            }
            if (this.x5sdkmax != 0) {
                sb.append(", x5sdkmax=");
                sb.append(this.x5sdkmax);
            }
            if (this.x5coremin != 0) {
                sb.append(", x5coremin=");
                sb.append(this.x5coremin);
            }
            if (this.x5coremax != 0) {
                sb.append(", x5coremax=");
                sb.append(this.x5coremax);
            }
            if (this.appClientVerMin != 0) {
                sb.append(", appClientVerMin=");
                sb.append(this.appClientVerMin);
            }
            if (this.appClientVerMax != 0) {
                sb.append(", appClientVerMax=");
                sb.append(this.appClientVerMax);
            }
            if (!TextUtils.isEmpty(this.forbidDeviceRegex)) {
                sb.append(", forbidDeviceRegex='");
                sb.append(this.forbidDeviceRegex);
                sb.append('\'');
            }
            if (!TextUtils.isEmpty(this.whiteDeviceRegex)) {
                sb.append(", whiteDeviceRegex='");
                sb.append(this.whiteDeviceRegex);
                sb.append('\'');
            }
            if (!TextUtils.isEmpty(this.forbidAppRegex)) {
                sb.append(", forbidAppRegex='");
                sb.append(this.forbidAppRegex);
                sb.append('\'');
            }
            if (!TextUtils.isEmpty(this.whiteAppRegex)) {
                sb.append(", whiteAppRegex='");
                sb.append(this.whiteAppRegex);
                sb.append('\'');
            }
            if (!TextUtils.isEmpty(this.deviceAbis)) {
                sb.append(", deviceAbis='");
                sb.append(this.deviceAbis);
                sb.append('\'');
            }
            if (!TextUtils.isEmpty(this.runtimeAbis)) {
                sb.append(", runtimeAbis='");
                sb.append(this.runtimeAbis);
                sb.append('\'');
            }
            if (!TextUtils.isEmpty(this.blackDeviceAbis)) {
                sb.append(", blackDeviceAbis='");
                sb.append(this.blackDeviceAbis);
                sb.append('\'');
            }
            if (!TextUtils.isEmpty(this.blackRuntimeAbis)) {
                sb.append(", blackRuntimeAbis='");
                sb.append(this.blackRuntimeAbis);
                sb.append('\'');
            }
            if (!TextUtils.isEmpty(this.appInfoWhiteList)) {
                sb.append(", appInfoWhiteList='");
                sb.append(this.appInfoWhiteList);
                sb.append('\'');
            }
            if (!TextUtils.isEmpty(this.appInfoBlackList)) {
                sb.append(", appInfoBlackList='");
                sb.append(this.appInfoBlackList);
                sb.append('\'');
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static class Patch {
        public boolean bCanUseCellular;
        public boolean bUseCdn;
        public int nPatchType;
        public int nTargetVersion;
        public String strMd5;
        public String strUrl;
    }

    public static class PluginConfig {
        public Command[] commands;
        public PluginInfo[] plugins = null;
        public String signature;
        public String strConfigVer = "";
        public String strMd5 = "";
    }

    public static class PluginInfo extends BaseVersion {
        public String strName = "";
    }

    public static class Version extends BaseVersion {
        public boolean bTryUseSharedCore = true;
        public boolean supportPredown;
        public String updateHourSpeed;
        public VersionDes verDes = new VersionDes();
    }

    public static class VersionDes {
        public String strVersion = "";
    }
}
