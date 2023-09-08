package com.tencent.thumbplayer.core.common;

import android.app.ActivityManager;
import android.content.Context;
import android.media.audiofx.AudioEffect;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;
import org.xwalk.core.XWalkEnvironment;
import p385u2.C111105a;

public class TPSystemInfo {
    public static final int CHIP_ARM_AARCH64 = 7;
    public static final int CHIP_ARM_LATER = 50;
    public static final int CHIP_ARM_V5 = 3;
    public static final int CHIP_ARM_V6 = 4;
    public static final int CHIP_ARM_V7_NENO = 6;
    public static final int CHIP_ARM_V7_NO_NENO = 5;
    public static final int CHIP_MIPS = 2;
    public static final int CHIP_UNKNOW = 0;
    public static final int CHIP_X86 = 1;
    public static final int CPU_HW_HISI = 2;
    public static final int CPU_HW_MTK = 1;
    public static final int CPU_HW_OTHER = -1;
    public static final int CPU_HW_QUALCOMM = 0;
    public static final int CPU_HW_SAMSUNG = 3;
    private static final String DEVICE_MANUFACTURER = Build.MANUFACTURER;
    private static final String DEVICE_OS_VERSION = Build.VERSION.RELEASE;
    private static final String PRODUCT_BOARD = Build.BOARD;
    private static final String PRODUCT_DEVICE = Build.DEVICE;
    public static final int SDK_INT;
    private static long sAppInstallTime;
    private static int sAudioBestFramesPerBust = 0;
    private static int sAudioBestSampleRate = 0;
    private static int sCpuArch = -1;
    private static int sCpuArchitecture = 0;
    private static int sCpuHWProductIdx = -1;
    private static int sCpuHWProducter = -1;
    private static String sCpuHardware = "";
    private static final String[][] sCpuPerfList = {new String[]{"MSM7227", "MSM7627", "MSM7227T", "MSM7627T", "MSM7227A", "MSM7627A", "QSD8250", "QSD8650", "MSM7230", "MSM7630", "APQ8055", "MSM8255", "MSM8655", "MSM8255T", "MSM8655T", "MSM8225", "MSM8625", "MSM8260", "MSM8660", "MSM8x25Q", "MSM8x26", "MSM8x10", "MSM8x12", "MSM8x30", "MSM8260A", "MSM8660A", "MSM8960", "MSM8208", "MSM8916", "MSM8960T", "MSM8909", "MSM8916v2", "MSM8936", "MSM8909v2", "MSM8917", "APQ8064", "APQ8064T", "MSM8920", "MSM8939", "MSM8937", "MSM8939v2", "MSM8940", "MSM8952", "MSM8974", "MSM8x74AA", "MSM8x74AB", "MSM8x74AC", "MSM8953", "APQ8084", "MSM8953Pro", "MSM8992", "MSM8956", "MSM8976", "MSM8976Pro", "MSM8994", "MSM8996", "MSM8996Pro", "MSM8998", "SDM845", "SM8150", "SM8250", "SM8250-AB", "SM8250-AC", "SM8350", "SM8350-AC", "SM8450"}, new String[]{"MT6516", "MT6513", "MT6573", "MT6515M", "MT6515", "MT6575", "MT6572", "MT6577", "MT6589", "MT6582", "MT6592", "MT6595", "MT6735", "MT6750", "MT6753", "MT6752", "MT6755", "MT6755", "MT6755T", "MT6795", "MT6757", "MT675x", "MT6797", "MT6797T", "MT6797X", "MT6771V", "MT6799", "MT6769Z", "MT6785T", "MT6853V", "MT6853V", "MT6873", "MT6874", "MT6875", "MT6877", "MT6885", "MT6889V", "MT6889Z", "MT6891Z", "MT6893", "MT6983"}, new String[]{"K3V2", "K3V2E", "K3V2+", "Kirin910", "Kirin920", "Kirin925", "Kirin928", "Kirin620", "Kirin650", "Kirin655", "Kirin930", "Kirin935", "Kirin950", "Kirin955", "Kirin960", "Kirin970", "Kirin810", "Kirin980", "Kirin820", "Kirin985", "Kirin990", "Kirin9000E", "Kirin9000"}, new String[]{"S5L8900", "S5PC100", "Exynos3110", "Exynos3475", "Exynos4210", "Exynos4212", "SMDK4x12", "Exynos4412", "Exynos5250", "Exynos5260", "Exynos5410", "Exynos5420", "Exynos5422", "Exynos5430", "Exynos5800", "Exynos5433", "Exynos7580", "Exynos7870", "Exynos7870", "Exynos7420", "Exynos8890", "Exynos890", "Exynos8895", "Exynos9810", "Exynos9820", "Exynos9825", "Exynos990", "Exynos1080", "Exynos2100", "Exynos2200"}};
    private static long sCurrentCpuFreq = -1;
    private static String sDeviceName = "";
    private static String sFeature = "";
    private static long sMaxCpuFreq = -1;
    private static int sNumOfCores = -1;
    private static int sOpenGLVersion = 0;
    private static String sProcessorName = "N/A";
    public static int sScreenHeight;
    public static int sScreenWidth;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i == 25) {
            String str = Build.VERSION.CODENAME;
            if (!TextUtils.isEmpty(str) && str.charAt(0) == 'O') {
                i = 26;
            }
        }
        SDK_INT = i;
    }

    private static boolean checkPermission(Context context, String str) {
        boolean z = true;
        if (!hasMarshmallow()) {
            return true;
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        if ("android.permission.WRITE_SETTINGS".equals(str)) {
            return Settings.System.canWrite(context);
        }
        try {
            if (C111105a.m151499a(context, str) != 0) {
                z = false;
            }
            return z;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    public static int getBestAudioFramesPerBust() {
        return sAudioBestFramesPerBust;
    }

    public static int getBestAudioSampleRate() {
        return sAudioBestSampleRate;
    }

    public static int getCpuArchFromId(int i) {
        if (i != 64) {
            switch (i) {
                case 5:
                    return 3;
                case 6:
                    return 4;
                case 7:
                    return 6;
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    return 0;
            }
        }
        return 7;
    }

    public static int getCpuArchitecture() {
        int i = sCpuArch;
        if (-1 != i) {
            return i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getCpuArchitecture Build.CPU_ABI: ");
        String str = Build.CPU_ABI;
        sb.append(str);
        TPNativeLog.printLog(2, sb.toString());
        if (str.contains(XWalkEnvironment.RUNTIME_ABI_ARM64_STR)) {
            sCpuArch = 7;
            return 7;
        }
        if (str != null && (str.contains("x86") || str.contains("X86"))) {
            sCpuArch = 1;
        } else if (str == null || (!str.contains("mips") && !str.contains("Mips"))) {
            if (sCpuArchitecture == 0) {
                getCpuInfo();
            }
            TPNativeLog.printLog(2, "getCpuArchitecture mCpuArchitecture:" + sCpuArchitecture);
            if (!TextUtils.isEmpty(sCpuHardware) && sCpuHardware.contains("MSM8994")) {
                sCpuArch = 7;
                return 7;
            } else if (isARMV5Whitelist()) {
                sCpuArch = 3;
                return 3;
            } else if (!TextUtils.isEmpty(sProcessorName) && sProcessorName.contains("ARMv6")) {
                sCpuArch = 4;
                return 4;
            } else if (!TextUtils.isEmpty(sProcessorName) && sProcessorName.contains("AArch64")) {
                sCpuArch = 7;
                return 7;
            } else if (sCpuArchitecture != 7 || TextUtils.isEmpty(sFeature) || sFeature.contains("neon") || sFeature.contains("asimd")) {
                sCpuArch = getCpuArchFromId(sCpuArchitecture);
            } else {
                sCpuArch = 4;
                return 4;
            }
        } else {
            sCpuArch = 2;
        }
        return sCpuArch;
    }

    private static int getCpuHWProducer(String str) {
        if (str.isEmpty()) {
            return -1;
        }
        if (str.contains("Exynos") || str.contains("SMDK") || str.contains("S5L8900") || str.contains("S5PC100")) {
            return 3;
        }
        if (str.contains("Kirin") || str.contains("K3V")) {
            return 2;
        }
        if (str.contains("MSM") || str.contains("APQ") || str.contains("QSD") || str.contains("SDM") || str.contains("SM")) {
            return 0;
        }
        return str.contains("MT6") ? 1 : -1;
    }

    public static int getCpuHWProductIndex(String str) {
        if (sCpuHWProducter < 0) {
            sCpuHWProducter = getCpuHWProducer(str);
        }
        int i = sCpuHWProducter;
        if (i >= 0 && sCpuHWProductIdx < 0) {
            String[] strArr = sCpuPerfList[i];
            int i2 = -1;
            for (int i3 = 0; i3 < strArr.length; i3++) {
                if (str.contains(strArr[i3]) && (-1 == i2 || strArr[i3].length() > strArr[i2].length())) {
                    i2 = i3;
                }
            }
            sCpuHWProductIdx = i2;
        }
        return sCpuHWProductIdx;
    }

    public static int getCpuHWProducter(String str) {
        if (sCpuHWProducter < 0) {
            sCpuHWProducter = getCpuHWProducer(str);
        }
        return sCpuHWProducter;
    }

    public static String getCpuHarewareName() {
        if (TextUtils.isEmpty(sCpuHardware)) {
            getCpuInfo();
        }
        return sCpuHardware;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.io.InputStreamReader} */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0033 A[SYNTHETIC, Splitter:B:22:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003b A[Catch:{ IOException -> 0x0037 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void getCpuInfo() {
        /*
            r0 = 0
            r1 = 4
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0029 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch:{ all -> 0x0029 }
            java.lang.String r4 = "UTF-8"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0029 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0026 }
            r3.<init>(r2)     // Catch:{ all -> 0x0026 }
        L_0x0015:
            java.lang.String r0 = r3.readLine()     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r2.close()     // Catch:{ IOException -> 0x0037 }
            r3.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0046
        L_0x0022:
            parseCpuInfoLine(r0)     // Catch:{ all -> 0x0027 }
            goto L_0x0015
        L_0x0026:
            r3 = r0
        L_0x0027:
            r0 = r2
            goto L_0x002a
        L_0x0029:
            r3 = r0
        L_0x002a:
            java.lang.String r2 = "Unknown"
            sCpuHardware = r2     // Catch:{ all -> 0x0047 }
            r2 = 0
            sCpuArchitecture = r2     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x0039
            r0.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0039
        L_0x0037:
            r0 = move-exception
            goto L_0x003f
        L_0x0039:
            if (r3 == 0) goto L_0x0046
            r3.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x0046
        L_0x003f:
            java.lang.String r0 = r0.getMessage()
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r1, r0)
        L_0x0046:
            return
        L_0x0047:
            r2 = move-exception
            if (r0 == 0) goto L_0x0050
            r0.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x0050
        L_0x004e:
            r0 = move-exception
            goto L_0x0056
        L_0x0050:
            if (r3 == 0) goto L_0x005d
            r3.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x005d
        L_0x0056:
            java.lang.String r0 = r0.getMessage()
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r1, r0)
        L_0x005d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPSystemInfo.getCpuInfo():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        com.tencent.thumbplayer.core.common.TPNativeLog.printLog(4, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00cc, code lost:
        if (r7 != null) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00ce, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d1, code lost:
        if (r6 != null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d3, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00d6, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:12:0x002d, B:39:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0080 A[SYNTHETIC, Splitter:B:42:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0085 A[Catch:{ all -> 0x00cb, all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0096 A[SYNTHETIC, Splitter:B:51:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x009b A[Catch:{ all -> 0x00cb, all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ac A[SYNTHETIC, Splitter:B:60:0x00ac] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00b1 A[Catch:{ all -> 0x00cb, all -> 0x0034 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00c2 A[SYNTHETIC, Splitter:B:69:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00c7 A[Catch:{ all -> 0x00cb, all -> 0x0034 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:57:0x00a3=Splitter:B:57:0x00a3, B:39:0x0077=Splitter:B:39:0x0077, B:66:0x00b9=Splitter:B:66:0x00b9, B:48:0x008d=Splitter:B:48:0x008d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getCurrentCpuFreq() {
        /*
            long r0 = sCurrentCpuFreq
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0009
            return r0
        L_0x0009:
            r0 = 1024000(0xfa000, double:5.05923E-318)
            r4 = 0
            r5 = 4
            java.lang.String r6 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x009f, Exception -> 0x0089, all -> 0x0073 }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x009f, Exception -> 0x0089, all -> 0x0073 }
            r8.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x009f, Exception -> 0x0089, all -> 0x0073 }
            java.lang.String r6 = "UTF-8"
            r7.<init>(r8, r6)     // Catch:{ FileNotFoundException -> 0x00b5, IOException -> 0x009f, Exception -> 0x0089, all -> 0x0073 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x0069, Exception -> 0x0064, all -> 0x005f }
            r6.<init>(r7)     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x0069, Exception -> 0x0064, all -> 0x005f }
            java.lang.String r4 = r6.readLine()     // Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0059, Exception -> 0x0057, all -> 0x0055 }
            if (r4 != 0) goto L_0x003d
            r7.close()     // Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0059, Exception -> 0x0057, all -> 0x0055 }
            r6.close()     // Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0059, Exception -> 0x0057, all -> 0x0055 }
            r7.close()     // Catch:{ all -> 0x0034 }
            r6.close()     // Catch:{ all -> 0x0034 }
            return r2
        L_0x0034:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r5, r0)
            return r2
        L_0x003d:
            java.lang.String r4 = r4.trim()     // Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0059, Exception -> 0x0057, all -> 0x0055 }
            int r8 = r4.length()     // Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0059, Exception -> 0x0057, all -> 0x0055 }
            if (r8 <= 0) goto L_0x004b
            long r0 = java.lang.Long.parseLong(r4)     // Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0059, Exception -> 0x0057, all -> 0x0055 }
        L_0x004b:
            sCurrentCpuFreq = r0     // Catch:{ FileNotFoundException -> 0x005c, IOException -> 0x0059, Exception -> 0x0057, all -> 0x0055 }
            r7.close()     // Catch:{ all -> 0x0034 }
            r6.close()     // Catch:{ all -> 0x0034 }
            goto L_0x00ca
        L_0x0055:
            r4 = move-exception
            goto L_0x0077
        L_0x0057:
            r4 = move-exception
            goto L_0x008d
        L_0x0059:
            r4 = move-exception
            goto L_0x00a3
        L_0x005c:
            r4 = move-exception
            goto L_0x00b9
        L_0x005f:
            r6 = move-exception
            r9 = r6
            r6 = r4
            r4 = r9
            goto L_0x0077
        L_0x0064:
            r6 = move-exception
            r9 = r6
            r6 = r4
            r4 = r9
            goto L_0x008d
        L_0x0069:
            r6 = move-exception
            r9 = r6
            r6 = r4
            r4 = r9
            goto L_0x00a3
        L_0x006e:
            r6 = move-exception
            r9 = r6
            r6 = r4
            r4 = r9
            goto L_0x00b9
        L_0x0073:
            r6 = move-exception
            r7 = r4
            r4 = r6
            r6 = r7
        L_0x0077:
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x00cb }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r5, r4)     // Catch:{ all -> 0x00cb }
            if (r7 == 0) goto L_0x0083
            r7.close()     // Catch:{ all -> 0x0034 }
        L_0x0083:
            if (r6 == 0) goto L_0x00ca
            r6.close()     // Catch:{ all -> 0x0034 }
            goto L_0x00ca
        L_0x0089:
            r6 = move-exception
            r7 = r4
            r4 = r6
            r6 = r7
        L_0x008d:
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x00cb }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r5, r4)     // Catch:{ all -> 0x00cb }
            if (r7 == 0) goto L_0x0099
            r7.close()     // Catch:{ all -> 0x0034 }
        L_0x0099:
            if (r6 == 0) goto L_0x00ca
            r6.close()     // Catch:{ all -> 0x0034 }
            goto L_0x00ca
        L_0x009f:
            r6 = move-exception
            r7 = r4
            r4 = r6
            r6 = r7
        L_0x00a3:
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x00cb }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r5, r4)     // Catch:{ all -> 0x00cb }
            if (r7 == 0) goto L_0x00af
            r7.close()     // Catch:{ all -> 0x0034 }
        L_0x00af:
            if (r6 == 0) goto L_0x00ca
            r6.close()     // Catch:{ all -> 0x0034 }
            goto L_0x00ca
        L_0x00b5:
            r6 = move-exception
            r7 = r4
            r4 = r6
            r6 = r7
        L_0x00b9:
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x00cb }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r5, r4)     // Catch:{ all -> 0x00cb }
            if (r7 == 0) goto L_0x00c5
            r7.close()     // Catch:{ all -> 0x0034 }
        L_0x00c5:
            if (r6 == 0) goto L_0x00ca
            r6.close()     // Catch:{ all -> 0x0034 }
        L_0x00ca:
            return r0
        L_0x00cb:
            r0 = move-exception
            if (r7 == 0) goto L_0x00d1
            r7.close()     // Catch:{ all -> 0x0034 }
        L_0x00d1:
            if (r6 == 0) goto L_0x00d6
            r6.close()     // Catch:{ all -> 0x0034 }
        L_0x00d6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPSystemInfo.getCurrentCpuFreq():long");
    }

    public static String getDeviceManufacturer() {
        return DEVICE_MANUFACTURER;
    }

    public static synchronized String getDeviceName() {
        String str;
        synchronized (TPSystemInfo.class) {
            if (TextUtils.isEmpty(sDeviceName)) {
                sDeviceName = Build.MODEL;
            }
            str = sDeviceName;
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063 A[SYNTHETIC, Splitter:B:36:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0068 A[Catch:{ IOException -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x006f A[Catch:{ IOException -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0074 A[Catch:{ IOException -> 0x0051 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getMaxCpuFreq() {
        /*
            long r0 = sMaxCpuFreq
            r2 = -1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0009
            return r0
        L_0x0009:
            r0 = 0
            r1 = 4
            r2 = 0
            java.lang.String r4 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x006c, all -> 0x0060 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006c, all -> 0x0060 }
            r6.<init>(r4)     // Catch:{ IOException -> 0x006c, all -> 0x0060 }
            java.lang.String r4 = "UTF-8"
            r5.<init>(r6, r4)     // Catch:{ IOException -> 0x006c, all -> 0x0060 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            r4.<init>(r5)     // Catch:{ IOException -> 0x005d, all -> 0x005a }
            java.lang.String r0 = r4.readLine()     // Catch:{ IOException -> 0x005e, all -> 0x005b }
            if (r0 != 0) goto L_0x003c
            r5.close()     // Catch:{ IOException -> 0x005e, all -> 0x005b }
            r4.close()     // Catch:{ IOException -> 0x005e, all -> 0x005b }
            r5.close()     // Catch:{ IOException -> 0x0033 }
            r4.close()     // Catch:{ IOException -> 0x0033 }
            goto L_0x003b
        L_0x0033:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r1, r0)
        L_0x003b:
            return r2
        L_0x003c:
            java.lang.String r0 = r0.trim()     // Catch:{ IOException -> 0x005e, all -> 0x005b }
            int r6 = r0.length()     // Catch:{ IOException -> 0x005e, all -> 0x005b }
            if (r6 <= 0) goto L_0x004a
            long r2 = java.lang.Long.parseLong(r0)     // Catch:{ IOException -> 0x005e, all -> 0x005b }
        L_0x004a:
            r5.close()     // Catch:{ IOException -> 0x0051 }
            r4.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0077
        L_0x0051:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r1, r0)
            goto L_0x0077
        L_0x005a:
            r4 = r0
        L_0x005b:
            r0 = r5
            goto L_0x0061
        L_0x005d:
            r4 = r0
        L_0x005e:
            r0 = r5
            goto L_0x006d
        L_0x0060:
            r4 = r0
        L_0x0061:
            if (r0 == 0) goto L_0x0066
            r0.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0066:
            if (r4 == 0) goto L_0x0077
            r4.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0077
        L_0x006c:
            r4 = r0
        L_0x006d:
            if (r0 == 0) goto L_0x0072
            r0.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0072:
            if (r4 == 0) goto L_0x0077
            r4.close()     // Catch:{ IOException -> 0x0051 }
        L_0x0077:
            sMaxCpuFreq = r2
            r0 = 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "MaxCpuFreq "
            r1.append(r4)
            long r4 = sMaxCpuFreq
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPSystemInfo.getMaxCpuFreq():long");
    }

    public static int getNumCores() {
        int i = sNumOfCores;
        if (-1 != i) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new FileFilter() {
                public boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]", file.getName());
                }
            });
            if (listFiles == null) {
                sNumOfCores = 1;
                return 1;
            }
            sNumOfCores = listFiles.length;
            TPNativeLog.printLog(2, "core num " + sNumOfCores);
            return sNumOfCores;
        } catch (Exception e) {
            TPNativeLog.printLog(4, e.getMessage());
            sNumOfCores = 1;
            return 1;
        }
    }

    public static int getOpenGLSupportVersion(Context context) {
        if (sOpenGLVersion == 0) {
            try {
                ActivityManager activityManager = (ActivityManager) context.getApplicationContext().getSystemService(EnvConsts.ACTIVITY_MANAGER_SRVNAME);
                if (activityManager == null) {
                    return sOpenGLVersion;
                }
                sOpenGLVersion = activityManager.getDeviceConfigurationInfo().reqGlEsVersion;
            } catch (Throwable th) {
                TPNativeLog.printLog(4, th.getMessage());
            }
        }
        return sOpenGLVersion;
    }

    public static String getOsVersion() {
        return DEVICE_OS_VERSION;
    }

    public static String getProductBoard() {
        return PRODUCT_BOARD;
    }

    public static String getProductDevice() {
        return PRODUCT_DEVICE;
    }

    public static int getScreenHeight(Context context) {
        if (context == null) {
            return 0;
        }
        int i = sScreenHeight;
        if (i != 0) {
            return i;
        }
        try {
            sScreenHeight = context.getResources().getDisplayMetrics().heightPixels;
        } catch (Throwable unused) {
            sScreenHeight = 0;
        }
        return sScreenHeight;
    }

    public static int getScreenWidth(Context context) {
        if (context == null) {
            return 0;
        }
        int i = sScreenWidth;
        if (i != 0) {
            return i;
        }
        try {
            sScreenWidth = context.getResources().getDisplayMetrics().widthPixels;
        } catch (Throwable unused) {
            sScreenWidth = 0;
        }
        return sScreenWidth;
    }

    public static int getSystemCpuUsage(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1;
        }
        float f = -1.0f;
        try {
            String[] split = str.trim().split("\\s+");
            long systemIdleTime = getSystemIdleTime(split);
            long systemUptime = getSystemUptime(split);
            String[] split2 = str2.trim().split("\\s+");
            long systemIdleTime2 = getSystemIdleTime(split2);
            long systemUptime2 = getSystemUptime(split2);
            if (systemIdleTime >= 0 && systemUptime >= 0 && systemIdleTime2 >= 0 && systemUptime2 >= 0) {
                long j = systemIdleTime2 + systemUptime2;
                long j2 = systemIdleTime + systemUptime;
                if (j > j2 && systemUptime2 >= systemUptime) {
                    f = (((float) (systemUptime2 - systemUptime)) / ((float) (j - j2))) * 100.0f;
                }
            }
        } catch (Throwable th) {
            TPNativeLog.printLog(4, th.getMessage());
        }
        return (int) f;
    }

    public static long getSystemIdleTime(String[] strArr) {
        try {
            return Long.parseLong(strArr[4]);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static long getSystemUptime(String[] strArr) {
        long j = 0;
        for (int i = 1; i < strArr.length; i++) {
            if (4 != i) {
                try {
                    j += Long.parseLong(strArr[i]);
                } catch (Throwable unused) {
                    return -1;
                }
            }
        }
        return j;
    }

    private static boolean hasMarshmallow() {
        return Build.VERSION.SDK_INT >= 23;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void initAudioBestSettings(android.content.Context r3) {
        /*
            java.lang.Class<com.tencent.thumbplayer.core.common.TPSystemInfo> r0 = com.tencent.thumbplayer.core.common.TPSystemInfo.class
            monitor-enter(r0)
            if (r3 == 0) goto L_0x0039
            int r1 = sAudioBestSampleRate     // Catch:{ all -> 0x0036 }
            if (r1 <= 0) goto L_0x000a
            goto L_0x0039
        L_0x000a:
            java.lang.String r1 = "audio"
            java.lang.Object r3 = r3.getSystemService(r1)     // Catch:{ all -> 0x0036 }
            android.media.AudioManager r3 = (android.media.AudioManager) r3     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "android.media.property.OUTPUT_SAMPLE_RATE"
            java.lang.String r1 = r3.getProperty(r1)     // Catch:{ all -> 0x0036 }
            java.lang.String r2 = "android.media.property.OUTPUT_FRAMES_PER_BUFFER"
            java.lang.String r3 = r3.getProperty(r2)     // Catch:{ all -> 0x0036 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x002b }
            sAudioBestSampleRate = r1     // Catch:{ NumberFormatException -> 0x002b }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x002b }
            sAudioBestFramesPerBust = r3     // Catch:{ NumberFormatException -> 0x002b }
            goto L_0x0034
        L_0x002b:
            r3 = move-exception
            r1 = 4
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0036 }
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r1, r3)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r0)
            return
        L_0x0036:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        L_0x0039:
            monitor-exit(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPSystemInfo.initAudioBestSettings(android.content.Context):void");
    }

    public static boolean isARMV5Whitelist() {
        return getDeviceName().equals("XT882") || getDeviceName().equals("ME860") || getDeviceName().equals("MB860") || getDeviceName().equals("Lenovo P70") || getDeviceName().equals("Lenovo A60") || getDeviceName().equals("Lenovo A366t");
    }

    private static void parseCpuInfoLine(String str) {
        int indexOf;
        int indexOf2;
        if (str.contains("aarch64") || str.contains("AArch64")) {
            sCpuArchitecture = 64;
        }
        if (str.startsWith("Processor")) {
            int indexOf3 = str.indexOf(58);
            if (indexOf3 > 1) {
                String substring = str.substring(indexOf3 + 1, str.length());
                sProcessorName = substring;
                sProcessorName = substring.trim();
            }
        } else if (str.startsWith("CPU architecture")) {
            if (sCpuArchitecture == 0 && (indexOf2 = str.indexOf(58)) > 1) {
                String trim = str.substring(indexOf2 + 1, str.length()).trim();
                if (trim.length() > 0 && trim.length() < 2) {
                    sCpuArchitecture = (int) Long.parseLong(trim);
                } else if (trim.length() > 1) {
                    sCpuArchitecture = (int) Long.parseLong(trim.substring(0, 1));
                }
            }
        } else if (str.startsWith("Features")) {
            int indexOf4 = str.indexOf(58);
            if (indexOf4 > 1) {
                sFeature = str.substring(indexOf4 + 1, str.length()).trim();
            }
        } else if (str.startsWith("Hardware") && (indexOf = str.indexOf(58)) > 1) {
            sCpuHardware = str.substring(indexOf + 1, str.length()).trim().replace(" ", "");
            TPNativeLog.printLog(2, "hardware " + sCpuHardware);
            getCpuHWProductIndex(sCpuHardware);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r1 != null) goto L_0x0030;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String readStringFromFile(java.io.File r7) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x003c, all -> 0x0037 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x003c, all -> 0x0037 }
            r2.<init>(r7)     // Catch:{ FileNotFoundException -> 0x003c, all -> 0x0037 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x003c, all -> 0x0037 }
            long r2 = r7.length()     // Catch:{ FileNotFoundException -> 0x0034, all -> 0x0038 }
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0017
            goto L_0x0030
        L_0x0017:
            long r2 = r7.length()     // Catch:{ FileNotFoundException -> 0x0034, all -> 0x0038 }
            int r3 = (int) r2     // Catch:{ FileNotFoundException -> 0x0034, all -> 0x0038 }
            char[] r2 = new char[r3]     // Catch:{ FileNotFoundException -> 0x0034, all -> 0x0038 }
            r3 = 0
            long r4 = r7.length()     // Catch:{ FileNotFoundException -> 0x0034, all -> 0x0038 }
            int r7 = (int) r4     // Catch:{ FileNotFoundException -> 0x0034, all -> 0x0038 }
            int r7 = r1.read(r2, r3, r7)     // Catch:{ FileNotFoundException -> 0x0034, all -> 0x0038 }
            if (r7 <= 0) goto L_0x0030
            java.lang.String r7 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x0034, all -> 0x0038 }
            r7.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0034, all -> 0x0038 }
            r0 = r7
        L_0x0030:
            r1.close()     // Catch:{ all -> 0x003b }
            goto L_0x003b
        L_0x0034:
            r7 = move-exception
            r0 = r1
            goto L_0x003d
        L_0x0037:
            r1 = r0
        L_0x0038:
            if (r1 == 0) goto L_0x003b
            goto L_0x0030
        L_0x003b:
            return r0
        L_0x003c:
            r7 = move-exception
        L_0x003d:
            throw r7     // Catch:{ all -> 0x003e }
        L_0x003e:
            r7 = move-exception
            if (r0 == 0) goto L_0x0044
            r0.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPSystemInfo.readStringFromFile(java.io.File):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001f A[SYNTHETIC, Splitter:B:13:0x001f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String readSystemStat() {
        /*
            r0 = 4
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x001c }
            java.lang.String r3 = "/proc/stat"
            java.lang.String r4 = "r"
            r2.<init>(r3, r4)     // Catch:{ all -> 0x001c }
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x001d }
            r2.close()     // Catch:{ all -> 0x0013 }
            goto L_0x0022
        L_0x0013:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            com.tencent.thumbplayer.core.common.TPNativeLog.printLog(r0, r2)
            goto L_0x0022
        L_0x001c:
            r2 = r1
        L_0x001d:
            if (r2 == 0) goto L_0x0022
            r2.close()     // Catch:{ all -> 0x0013 }
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.core.common.TPSystemInfo.readSystemStat():java.lang.String");
    }

    public static synchronized void setDeviceName(String str) {
        synchronized (TPSystemInfo.class) {
            sDeviceName = str;
        }
    }

    public static boolean supportInDeviceDolbyAudioEffect() {
        boolean z;
        Exception e;
        int i = 0;
        try {
            AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
            int length = queryEffects.length;
            z = false;
            while (i < length) {
                try {
                    if (queryEffects[i].implementor.contains("Dolby Laboratories")) {
                        z = true;
                    }
                    i++;
                } catch (Exception e2) {
                    e = e2;
                    TPNativeLog.printLog(4, e.getMessage());
                    return z;
                }
            }
        } catch (Exception e3) {
            e = e3;
            z = false;
            TPNativeLog.printLog(4, e.getMessage());
            return z;
        }
        return z;
    }

    private static void writeStringToFile(String str, String str2) {
        FileWriter fileWriter = null;
        try {
            File file = new File(str);
            if (file.exists() || !file.createNewFile()) {
                FileWriter fileWriter2 = new FileWriter(file, false);
                try {
                    fileWriter2.write(str2);
                    fileWriter2.flush();
                    fileWriter2.close();
                } catch (Throwable unused) {
                    fileWriter = fileWriter2;
                }
            }
        } catch (Throwable unused2) {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException unused3) {
                }
            }
        }
    }

    public static int getCpuHWProductIndex(int i, String str) {
        if (i >= 0) {
            String[][] strArr = sCpuPerfList;
            if (i >= strArr.length || TextUtils.isEmpty(str)) {
                return -1;
            }
            String[] strArr2 = strArr[i];
            for (int i2 = 0; i2 < strArr2.length; i2++) {
                if (TextUtils.equals(str, strArr2[i2])) {
                    return i2;
                }
            }
        }
        return -1;
    }
}
