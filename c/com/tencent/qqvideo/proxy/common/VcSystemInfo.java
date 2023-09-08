package com.tencent.qqvideo.proxy.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.mapsdk.internal.C0947jz;
import j20.C117292a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class VcSystemInfo {
    public static final int CHIP_ARM_LATER = 50;
    public static final int CHIP_ARM_V5 = 3;
    public static final int CHIP_ARM_V6 = 4;
    public static final int CHIP_ARM_V7_NENO = 6;
    public static final int CHIP_ARM_V7_NO_NENO = 5;
    public static final int CHIP_MIPS = 2;
    public static final int CHIP_UNKNOW = 0;
    public static final int CHIP_X86 = 1;
    public static final int NETWORK_AP_3G = 2;
    public static final int NETWORK_AP_GPRS = 3;
    public static final int NETWORK_AP_LINE = 4;
    public static final int NETWORK_AP_WIFI = 1;
    public static final int NETWORK_CLASS_2_G = 2;
    public static final int NETWORK_CLASS_3_G = 3;
    public static final int NETWORK_CLASS_4_G = 4;
    public static final int NETWORK_CLASS_UNKNOWN = 0;
    public static final int NETWORK_NONE = 0;
    private static final int NETWORK_TYPE_1xRTT = 7;
    private static final int NETWORK_TYPE_CDMA = 4;
    private static final int NETWORK_TYPE_EDGE = 2;
    private static final int NETWORK_TYPE_EHRPD = 14;
    private static final int NETWORK_TYPE_EVDO_0 = 5;
    private static final int NETWORK_TYPE_EVDO_A = 6;
    private static final int NETWORK_TYPE_EVDO_B = 12;
    private static final int NETWORK_TYPE_GPRS = 1;
    private static final int NETWORK_TYPE_HSDPA = 8;
    private static final int NETWORK_TYPE_HSPA = 10;
    private static final int NETWORK_TYPE_HSPAP = 15;
    private static final int NETWORK_TYPE_HSUPA = 9;
    private static final int NETWORK_TYPE_IDEN = 11;
    private static final int NETWORK_TYPE_LTE = 13;
    private static final int NETWORK_TYPE_UMTS = 3;
    public static final int PLAYER_LEVEL_1 = 1;
    public static final int PLAYER_LEVEL_11 = 11;
    public static final int PLAYER_LEVEL_16 = 16;
    public static final int PLAYER_LEVEL_21 = 21;
    public static final int PLAYER_LEVEL_26 = 26;
    public static final int PLAYER_LEVEL_6 = 6;
    private static final String TAG = "VcSystemInfo";
    public static final int TYPE_CMNET = 2;
    public static final int TYPE_CMWAP = 3;
    public static final int TYPE_NONE = 0;
    public static final int TYPE_OTHER = 4;
    public static final int TYPE_WIFI = 1;
    private static int appVersionCode = 0;
    private static String appVersionName = null;
    private static String deviceID = "";
    private static String deviceIMEI = null;
    private static String deviceIMSI = null;
    private static String deviceMacAddr = null;
    public static int mCpuArchitecture = 0;
    public static String mCpuHardware = "";
    private static int mDeviceLevel = 0;
    public static String mFeature = "";
    private static int mMCC = 0;
    private static int mMNC = 0;
    public static String mProcessorName = "N/A";
    public static int mScreenHeight;
    public static int mScreenWidth;
    public int mCoreNumber = 1;
    public long mCurrCpuFreq = 0;
    private long mLastCpu;
    private long mLastIdle;
    public long mMaxCpuFreq = 0;
    public int mdispHeight;
    public int mdispWidth;

    public VcSystemInfo() {
        mScreenWidth = C0947jz.f2205e;
        mScreenHeight = 480;
        this.mdispWidth = C0947jz.f2205e;
        this.mdispHeight = 240;
        this.mLastCpu = 0;
        this.mLastIdle = 0;
    }

    public static int GetNetAP(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return 0;
        }
        return "wifi".equalsIgnoreCase(activeNetworkInfo.getTypeName()) ? 1 : 2;
    }

    public static String PrintStack(Throwable th) {
        if (th == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            th.printStackTrace(new PrintStream(byteArrayOutputStream));
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        } catch (Throwable th4) {
            byteArrayOutputStream.close();
            throw th4;
        }
        return byteArrayOutputStream.toString();
    }

    public static long getAppInstallTime(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir).lastModified() / 1000;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static String getAppName(Context context, String str) {
        if (context == null) {
            return "";
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int getAppVersionCode(Context context, String str) {
        int i = appVersionCode;
        if (i != 0) {
            return i;
        }
        if (context == null) {
            return 0;
        }
        try {
            int i2 = context.getPackageManager().getPackageInfo(str, 0).versionCode;
            appVersionCode = i2;
            return i2;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String getAppVersionName(Context context) {
        if (!TextUtils.isEmpty(appVersionName)) {
            return appVersionName;
        }
        if (context == null) {
            return "";
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            appVersionName = str;
            return str == null ? "" : str;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String getDeviceID(Context context) {
        if (!TextUtils.isEmpty(deviceID)) {
            return deviceID;
        }
        if (context == null) {
            return "";
        }
        try {
            String string = Settings.System.getString(context.getContentResolver(), "android_id");
            deviceID = string;
            if (string == null) {
                deviceID = "";
            }
        } catch (Throwable unused) {
            deviceID = "";
        }
        return deviceID;
    }

    public static String getDeviceIMEI(Context context) {
        if (!TextUtils.isEmpty(deviceIMEI)) {
            return deviceIMEI;
        }
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String str = (String) C117292a.m165363i(telephonyManager, "com/tencent/qqvideo/proxy/common/VcSystemInfo", "getDeviceIMEI", "(Landroid/content/Context;)Ljava/lang/String;", "android/telephony/TelephonyManager", "getDeviceId", "()Ljava/lang/String;");
                deviceIMEI = str;
                if (str == null) {
                    deviceIMEI = "";
                }
                return deviceIMEI;
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String getDeviceIMSI(Context context) {
        if (!TextUtils.isEmpty(deviceIMSI)) {
            return deviceIMSI;
        }
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String str = (String) C117292a.m165363i(telephonyManager, "com/tencent/qqvideo/proxy/common/VcSystemInfo", "getDeviceIMSI", "(Landroid/content/Context;)Ljava/lang/String;", "android/telephony/TelephonyManager", "getSubscriberId", "()Ljava/lang/String;");
                deviceIMSI = str;
                if (str == null) {
                    deviceIMSI = "";
                }
                return deviceIMSI;
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String getDeviceMacAddr(Context context) {
        WifiInfo wifiInfo;
        if (!TextUtils.isEmpty(deviceMacAddr)) {
            return deviceMacAddr;
        }
        if (context == null) {
            return "";
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (!(wifiManager == null || (wifiInfo = (WifiInfo) C117292a.m165363i(wifiManager, "com/tencent/qqvideo/proxy/common/VcSystemInfo", "getDeviceMacAddr", "(Landroid/content/Context;)Ljava/lang/String;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;")) == null)) {
                String macAddress = wifiInfo.getMacAddress();
                deviceMacAddr = macAddress;
                if (macAddress == null) {
                    deviceMacAddr = "";
                }
                return deviceMacAddr;
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static int getMCC(Context context) {
        int i = mMCC;
        if (i != 0) {
            return i;
        }
        if (context == null) {
            return 0;
        }
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                mMCC = configuration.mcc;
            }
            return mMCC;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int getMNC(Context context) {
        int i = mMNC;
        if (i != 0) {
            return i;
        }
        if (context == null) {
            return 0;
        }
        try {
            Configuration configuration = context.getResources().getConfiguration();
            if (configuration != null) {
                mMNC = configuration.mnc;
            }
            return mMNC;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        if (r2 != null) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0058 A[Catch:{ all -> 0x0052, all -> 0x005e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getMarketId(android.content.Context r4) {
        /*
            r0 = -1
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 0
            android.content.Context r4 = r4.getApplicationContext()     // Catch:{ all -> 0x0055 }
            android.content.res.AssetManager r4 = r4.getAssets()     // Catch:{ all -> 0x0055 }
            java.lang.String r2 = "channel.ini"
            java.io.InputStream r4 = r4.open(r2)     // Catch:{ all -> 0x0055 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0052 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0052 }
            r3.<init>(r4)     // Catch:{ all -> 0x0052 }
            r2.<init>(r3)     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0053 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0053 }
            if (r3 != 0) goto L_0x0049
            java.lang.String r3 = "CHANNEL="
            boolean r3 = r1.contains(r3)     // Catch:{ all -> 0x0053 }
            if (r3 == 0) goto L_0x0049
            java.lang.String r3 = "="
            int r3 = r1.indexOf(r3)     // Catch:{ all -> 0x0053 }
            int r3 = r3 + 1
            java.lang.String r1 = r1.substring(r3)     // Catch:{ all -> 0x0053 }
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0053 }
            if (r3 != 0) goto L_0x0049
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x0053 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0053 }
        L_0x0049:
            if (r4 == 0) goto L_0x004e
            r4.close()     // Catch:{ all -> 0x005e }
        L_0x004e:
            r2.close()     // Catch:{ all -> 0x005e }
            goto L_0x005e
        L_0x0052:
            r2 = r1
        L_0x0053:
            r1 = r4
            goto L_0x0056
        L_0x0055:
            r2 = r1
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            r1.close()     // Catch:{ all -> 0x005e }
        L_0x005b:
            if (r2 == 0) goto L_0x005e
            goto L_0x004e
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqvideo.proxy.common.VcSystemInfo.getMarketId(android.content.Context):int");
    }

    public static int getNetWorkType(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return 0;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 0;
            }
            int type = activeNetworkInfo.getType();
            return type != 0 ? type != 1 ? 4 : 1 : (activeNetworkInfo.getExtraInfo() == null || "cmnet".equalsIgnoreCase(activeNetworkInfo.getExtraInfo())) ? 2 : 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static int getNetworkClass(int i) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return 2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return 3;
            case 13:
                return 4;
            default:
                return 0;
        }
    }

    public static int getNetworkClass(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getType() != 0) {
            return 0;
        }
        return getNetworkClass(activeNetworkInfo.getSubtype());
    }

    public static int getOsVerInt() {
        return 0;
    }

    public static int getOsVerIntFromVerStr() {
        String osVersion = getOsVersion();
        int osVerInt = getOsVerInt();
        if (osVersion.length() < 3) {
            return osVerInt;
        }
        try {
            int parseInt = Integer.parseInt(osVersion.substring(0, 1));
            int parseInt2 = Integer.parseInt(osVersion.substring(2, 3));
            if (parseInt == 2) {
                if (parseInt2 == 3) {
                    return 9;
                }
                return osVerInt;
            } else if (parseInt != 4) {
                return osVerInt;
            } else {
                if (parseInt2 == 0) {
                    return 14;
                }
                if (parseInt2 == 1) {
                    return 16;
                }
                if (parseInt2 == 2) {
                    return 17;
                }
                if (parseInt2 == 3) {
                    return 18;
                }
                if (parseInt2 != 4) {
                    return osVerInt;
                }
                return 19;
            }
        } catch (Exception unused) {
            return osVerInt;
        }
    }

    public static String getOsVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getRomInfo() {
        return Build.VERSION.INCREMENTAL;
    }

    public static long getRxBytesFromNetwork(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            context.getClassLoader().loadClass("android.net.TrafficStats");
            return TrafficStats.getTotalRxBytes();
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    public static int getScreenHeight(Context context) {
        if (context == null) {
            return 0;
        }
        int i = mScreenHeight;
        if (i != 0) {
            return i;
        }
        try {
            mScreenHeight = context.getResources().getDisplayMetrics().heightPixels;
        } catch (Throwable unused) {
        }
        return mScreenHeight;
    }

    public static int getScreenWidth(Context context) {
        if (context == null) {
            return 0;
        }
        int i = mScreenWidth;
        if (i != 0) {
            return i;
        }
        try {
            mScreenWidth = context.getResources().getDisplayMetrics().widthPixels;
        } catch (Throwable unused) {
        }
        return mScreenWidth;
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
        } catch (Throwable unused) {
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

    public static String getWiFiMacAddress(Context context) {
        try {
            return ((WifiInfo) C117292a.m165363i((WifiManager) context.getSystemService("wifi"), "com/tencent/qqvideo/proxy/common/VcSystemInfo", "getWiFiMacAddress", "(Landroid/content/Context;)Ljava/lang/String;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;")).getMacAddress();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int getWifiNetStrength(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            WifiInfo wifiInfo = (WifiInfo) C117292a.m165363i((WifiManager) context.getSystemService("wifi"), "com/tencent/qqvideo/proxy/common/VcSystemInfo", "getWifiNetStrength", "(Landroid/content/Context;)I", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
            if (wifiInfo == null) {
                return 0;
            }
            wifiInfo.getRssi();
            return WifiManager.calculateSignalLevel(wifiInfo.getRssi(), 101);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r2 = (r2 = (android.net.ConnectivityManager) r2.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isNetworkAvailable(android.content.Context r2) {
        /*
            r0 = 0
            if (r2 == 0) goto L_0x0029
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            if (r2 != 0) goto L_0x0012
            return r0
        L_0x0012:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            if (r2 == 0) goto L_0x0029
            boolean r1 = r2.isAvailable()
            if (r1 != 0) goto L_0x001f
            goto L_0x0029
        L_0x001f:
            android.net.NetworkInfo$State r2 = r2.getState()
            android.net.NetworkInfo$State r1 = android.net.NetworkInfo.State.CONNECTED
            if (r2 != r1) goto L_0x0029
            r2 = 1
            return r2
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqvideo.proxy.common.VcSystemInfo.isNetworkAvailable(android.content.Context):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        r2 = (r2 = (r2 = (android.net.ConnectivityManager) r2.getSystemService("connectivity")).getActiveNetworkInfo()).getType();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isNetworkTypeMobile(android.content.Context r2) {
        /*
            r0 = 1
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            if (r2 == 0) goto L_0x0028
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            if (r2 == 0) goto L_0x0028
            int r2 = r2.getType()
            if (r2 == 0) goto L_0x0028
            r1 = 2
            if (r2 == r1) goto L_0x0028
            r1 = 3
            if (r2 == r1) goto L_0x0028
            r1 = 4
            if (r2 == r1) goto L_0x0028
            r1 = 5
            if (r2 == r1) goto L_0x0028
            r2 = 0
            return r2
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqvideo.proxy.common.VcSystemInfo.isNetworkTypeMobile(android.content.Context):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        if (r1 != null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String readSystemStat() {
        /*
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0013 }
            java.lang.String r2 = "/proc/stat"
            java.lang.String r3 = "r"
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0013 }
            java.lang.String r0 = r1.readLine()     // Catch:{ all -> 0x0014 }
        L_0x000f:
            r1.close()     // Catch:{ all -> 0x0017 }
            goto L_0x0017
        L_0x0013:
            r1 = r0
        L_0x0014:
            if (r1 == 0) goto L_0x0017
            goto L_0x000f
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqvideo.proxy.common.VcSystemInfo.readSystemStat():java.lang.String");
    }
}
