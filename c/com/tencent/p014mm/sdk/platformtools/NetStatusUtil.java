package com.tencent.p014mm.sdk.platformtools;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.sdk.systemservicecache.NetworkCache;
import j20.C117292a;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;

/* renamed from: com.tencent.mm.sdk.platformtools.NetStatusUtil */
public class NetStatusUtil {
    public static final String CELL_CDMA = "cdma";
    public static final String CELL_GSM = "gsm";
    public static final int CMNET = 6;
    public static final int CMWAP = 5;
    public static final int CTNET = 8;
    public static final int CTWAP = 7;
    public static final int IOS_NETTYPE_2G = 2;
    public static final int IOS_NETTYPE_3G = 3;
    public static final int IOS_NETTYPE_4G = 4;
    public static final int IOS_NETTYPE_5G = 5;
    public static final int IOS_NETTYPE_UNKNOW = 0;
    public static final int IOS_NETTYPE_WIFI = 1;
    public static final int LTE = 10;
    public static final int MOBILE = 9;
    public static final int NETTYPE_NOT_WIFI = 0;
    public static final int NETTYPE_WIFI = 1;
    public static final int NETWORK_TYPE_NR = 20;
    public static final int NET_3G = 4;
    public static final int NON_NETWORK = -1;
    public static final int NO_SIM_OPERATOR = 0;
    public static final int NR_5G = 11;
    public static final int OLD_IOS_NETTYPE_2G = 3;
    public static final int OLD_IOS_NETTYPE_3G = 4;
    public static final int OLD_IOS_NETTYPE_4G = 5;
    public static final int OLD_IOS_NETTYPE_NOT_WIFI = 0;
    public static final int OLD_IOS_NETTYPE_WAP = 2;
    public static final int OLD_IOS_NETTYPE_WIFI = 1;
    public static final int POLICY_NONE = 0;
    public static final int POLICY_REJECT_METERED_BACKGROUND = 1;
    private static final String TAG = "MicroMsg.NetStatusUtil";
    public static final int TBACKGROUND_DATA_LIMITED = 2;
    public static final int TBACKGROUND_NOT_LIMITED = 0;
    public static final int TBACKGROUND_PROCESS_LIMITED = 1;
    public static final int TBACKGROUND_WIFI_LIMITED = 3;
    public static final int UNINET = 1;
    public static final int UNIWAP = 2;
    public static final int UNKNOW_TYPE = 999;
    public static final int WAP_3G = 3;
    public static final int WIFI = 0;
    private byte _hellAccFlag_;

    /* renamed from: com.tencent.mm.sdk.platformtools.NetStatusUtil$MacInfo */
    public static class MacInfo {
        public String dbm;
        public String mac;

        public MacInfo(String str, String str2) {
            this.mac = str;
            this.dbm = str2;
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.NetStatusUtil$CellInfo */
    public static class CellInfo {
        public static final int MAX_CID = 65535;
        public static final int MAX_LAC = 65535;
        public String cellid;
        public String dbm;
        public String lac;
        public String mcc;
        public String mnc;
        public String networkId;
        public String stationId;
        public String systemId;
        public String type;

        public CellInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.mcc = str;
            this.mnc = str2;
            this.lac = str3;
            this.type = str6;
            this.cellid = str4;
            this.stationId = str7;
            this.networkId = str8;
            this.systemId = str9;
            this.dbm = str5;
        }
    }

    public static String dumpNetStatus(Context context) {
        StringBuilder sb = new StringBuilder();
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            sb.append("isAvailable " + activeNetworkInfo.isAvailable() + APLogFileUtil.SEPARATOR_LINE);
            sb.append("isConnected " + activeNetworkInfo.isConnected() + APLogFileUtil.SEPARATOR_LINE);
            sb.append("isRoaming " + activeNetworkInfo.isRoaming() + APLogFileUtil.SEPARATOR_LINE);
            sb.append("isFailover " + activeNetworkInfo.isFailover() + APLogFileUtil.SEPARATOR_LINE);
            sb.append("getSubtypeName " + activeNetworkInfo.getSubtypeName() + APLogFileUtil.SEPARATOR_LINE);
            sb.append("getSubtype " + activeNetworkInfo.getSubtype() + APLogFileUtil.SEPARATOR_LINE);
            sb.append("getType " + activeNetworkInfo.getType() + APLogFileUtil.SEPARATOR_LINE);
            sb.append("getExtraInfo " + activeNetworkInfo.getExtraInfo() + APLogFileUtil.SEPARATOR_LINE);
            sb.append("activeNetInfo " + activeNetworkInfo.toString() + APLogFileUtil.SEPARATOR_LINE);
            sb.append("is2G " + is2G(context) + APLogFileUtil.SEPARATOR_LINE);
            sb.append("is3G " + is3G(context) + APLogFileUtil.SEPARATOR_LINE);
            sb.append("is4G " + is4G(context) + APLogFileUtil.SEPARATOR_LINE);
            sb.append("isWifi " + isWifi(context) + APLogFileUtil.SEPARATOR_LINE);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("netstatus ");
            sb4.append(sb.toString());
            Log.m105924i(TAG, sb4.toString());
        } catch (Exception e) {
            Log.m105924i(TAG, e.getMessage());
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        return sb.toString();
    }

    public static NetworkInfo getActiveNetworkInfo(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    public static int getBackgroundLimitType(Context context) {
        try {
            Class<?> cls = Class.forName("android.app.ActivityManagerNative");
            Object invoke = cls.getMethod("getDefault", new Class[0]).invoke(cls, new Object[0]);
            if (((Integer) invoke.getClass().getMethod("getProcessLimit", new Class[0]).invoke(invoke, new Object[0])).intValue() == 0) {
                return 1;
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        try {
            int wifiSleepPolicy = getWifiSleepPolicy(context);
            if (wifiSleepPolicy == 2 || getNetType(context) != 0) {
                return 0;
            }
            return (wifiSleepPolicy == 1 || wifiSleepPolicy == 0) ? 3 : 0;
        } catch (Exception e2) {
            Log.printErrStackTrace(TAG, e2, "", new Object[0]);
        }
    }

    @Deprecated
    public static synchronized List<CellInfo> getCellInfoList(Context context) {
        LinkedList linkedList;
        synchronized (NetStatusUtil.class) {
            Log.m105920e(TAG, "getCellInfoList() here will always return empty list, and mostly you should not read cell info list any more");
            linkedList = new LinkedList();
        }
        return linkedList;
    }

    public static String getFormatedNetType(Context context) {
        return is2G(context) ? "2G" : is3G(context) ? "3G" : is4G(context) ? "4G" : is5G(context) ? "5G" : isWifi(context) ? "WIFI" : getNetTypeString(context);
    }

    public static int getIOSNetType(Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (activeNetworkInfo.getSubtype() != 1) {
                if (activeNetworkInfo.getSubtype() != 2) {
                    if (activeNetworkInfo.getSubtype() >= 13) {
                        return 4;
                    }
                    if (activeNetworkInfo.getSubtype() >= 3) {
                        return 3;
                    }
                    if (activeNetworkInfo.getSubtype() >= 20) {
                        return 5;
                    }
                    return 0;
                }
            }
            return 2;
        } catch (Exception unused) {
        }
    }

    public static int getIOSOldNetType(Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return 0;
        }
        try {
            int netType = getNetType(context);
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 0;
            }
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (activeNetworkInfo.getSubtype() != 1) {
                if (activeNetworkInfo.getSubtype() != 2) {
                    if (activeNetworkInfo.getSubtype() >= 13) {
                        return 5;
                    }
                    if (activeNetworkInfo.getSubtype() >= 3) {
                        return 4;
                    }
                    return isWap(netType) ? 2 : 0;
                }
            }
            return 3;
        } catch (Exception unused) {
        }
    }

    public static int getISPCode(Context context) {
        String simOperator;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (!(telephonyManager == null || (simOperator = telephonyManager.getSimOperator()) == null || simOperator.length() < 5)) {
            StringBuilder sb = new StringBuilder();
            try {
                int length = simOperator.length();
                if (length > 6) {
                    length = 6;
                }
                for (int i = 0; i < length; i++) {
                    if (!Character.isDigit(simOperator.charAt(i))) {
                        if (sb.length() > 0) {
                            break;
                        }
                    } else {
                        sb.append(simOperator.charAt(i));
                    }
                }
                return Integer.valueOf(sb.toString()).intValue();
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        return 0;
    }

    public static String getISPName(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return "";
            }
            Log.m105919d(TAG, "getISPName ISPName=%s", telephonyManager.getSimOperatorName());
            return telephonyManager.getSimOperatorName().length() <= 100 ? telephonyManager.getSimOperatorName() : telephonyManager.getSimOperatorName().substring(0, 100);
        } catch (Exception unused) {
            return "";
        }
    }

    public static int getNetType(NetworkInfo networkInfo) {
        if (networkInfo.getType() == 1) {
            return 0;
        }
        Log.m105919d(TAG, "activeNetInfo extra=%s, type=%d", networkInfo.getExtraInfo(), Integer.valueOf(networkInfo.getType()));
        if (networkInfo.getExtraInfo() == null) {
            return 9;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("uninet")) {
            return 1;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("uniwap")) {
            return 2;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("3gwap")) {
            return 3;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("3gnet")) {
            return 4;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("cmwap")) {
            return 5;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("cmnet")) {
            return 6;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("ctwap")) {
            return 7;
        }
        if (networkInfo.getExtraInfo().equalsIgnoreCase("ctnet")) {
            return 8;
        }
        return networkInfo.getExtraInfo().equalsIgnoreCase("LTE") ? 10 : 9;
    }

    public static int getNetTypeForStat(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return 999;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return 999;
            }
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype == 0) {
                return 999;
            }
            return subtype * 1000;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return 999;
        }
    }

    public static String getNetTypeString(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return "NON_NETWORK";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return "NON_NETWORK";
            }
            if (activeNetworkInfo.getType() == 1) {
                return "WIFI";
            }
            Log.m105919d(TAG, "activeNetInfo extra=%s, type=%d", activeNetworkInfo.getExtraInfo(), Integer.valueOf(activeNetworkInfo.getType()));
            return activeNetworkInfo.getExtraInfo() != null ? activeNetworkInfo.getExtraInfo() : "MOBILE";
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return "NON_NETWORK";
        }
    }

    public static int getNetWorkType(Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return -1;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.getType();
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        return -1;
    }

    public static int getProxyInfo(Context context, StringBuffer stringBuffer) {
        try {
            String defaultHost = Proxy.getDefaultHost();
            int defaultPort = Proxy.getDefaultPort();
            Log.m105919d(TAG, "dkwap api host:%s port:%d thr:%d", defaultHost, Integer.valueOf(defaultPort), Long.valueOf(Thread.currentThread().getId()));
            if (defaultHost == null || defaultHost.length() <= 0 || defaultPort <= 0) {
                String property = System.getProperty("http.proxyHost");
                String property2 = System.getProperty("http.proxyPort");
                Log.m105919d(TAG, "dkwap vm host:%s port:%s thr:%d", property, property2, Long.valueOf(Thread.currentThread().getId()));
                int i = 80;
                if (property2 != null && property2.length() > 0) {
                    i = Integer.parseInt(property2);
                }
                if (property != null && property.length() > 0) {
                    stringBuffer.append(property);
                    return i;
                }
                return 0;
            }
            stringBuffer.append(defaultHost);
            return defaultPort;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static int getWifiSleepPolicy(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "wifi_sleep_policy", 2);
    }

    public static int guessNetSpeed(Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return 102400;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo.getType() == 1) {
                return 102400;
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype != 1) {
                return subtype != 2 ? 102400 : 8192;
            }
            return 4096;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static boolean is2G(Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || activeNetworkInfo.getType() == 1) {
                    return false;
                }
                Log.m105919d(TAG, "is2G subtype %d", Integer.valueOf(activeNetworkInfo.getSubtype()));
                if (activeNetworkInfo.getSubtype() == 2 || activeNetworkInfo.getSubtype() == 1 || activeNetworkInfo.getSubtype() == 4 || activeNetworkInfo.getSubtype() == 16 || activeNetworkInfo.getSubtype() == 7 || activeNetworkInfo.getSubtype() == 11) {
                    return true;
                }
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        return false;
    }

    public static boolean is3G(Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || activeNetworkInfo.getType() == 1) {
                return false;
            }
            Log.m105919d(TAG, "is3G subtype %d", Integer.valueOf(activeNetworkInfo.getSubtype()));
            return activeNetworkInfo.getSubtype() >= 5 && activeNetworkInfo.getSubtype() < 13;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static boolean is4G(Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || activeNetworkInfo.getType() == 1) {
                return false;
            }
            Log.m105919d(TAG, "is4G subtype %d", Integer.valueOf(activeNetworkInfo.getSubtype()));
            return activeNetworkInfo.getSubtype() >= 13 && activeNetworkInfo.getSubtype() < 20;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
    }

    public static boolean is5G(Context context) {
        if (context != null) {
            try {
                if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    return false;
                }
            } catch (Exception e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || activeNetworkInfo.getType() == 1) {
            return false;
        }
        Log.m105919d(TAG, "is5G subtype %d", Integer.valueOf(activeNetworkInfo.getSubtype()));
        return activeNetworkInfo.getSubtype() >= 20;
    }

    public static boolean isConnected(NetworkInfo networkInfo) {
        try {
            return networkInfo.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isImmediatelyDestroyActivities(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0) != 0;
    }

    public static boolean isKnownDirectNet(Context context) {
        int netType = getNetType(context);
        return 6 == netType || 1 == netType || 4 == netType || 8 == netType || 10 == netType || netType == 0;
    }

    public static boolean isLimited(int i) {
        return i == 2 || i == 1 || i == 3;
    }

    public static boolean isMobile(Context context) {
        if (context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            return (activeNetworkInfo == null || activeNetworkInfo.getType() == 1) ? false : true;
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
            return false;
        }
    }

    public static boolean isMobileNetworkOpen(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager != null) {
                Method method = connectivityManager.getClass().getMethod("getMobileDataEnabled", new Class[0]);
                method.setAccessible(true);
                return ((Boolean) method.invoke(connectivityManager, new Object[0])).booleanValue();
            }
        } catch (Exception e) {
            Log.printErrStackTrace(TAG, e, "", new Object[0]);
        }
        return false;
    }

    @Deprecated
    public static boolean isNetworkConnected(Context context) {
        return isConnected(context);
    }

    public static boolean isWap(int i) {
        return i == 2 || i == 5 || i == 7 || i == 3;
    }

    public static boolean isWap(Context context) {
        return isWap(getNetType(context));
    }

    public static boolean isWapFromCache(Context context) {
        return NetworkCache.INSTANCE.isWapFromCache(context);
    }

    public static boolean isWifi(int i) {
        return i == 0;
    }

    public static boolean isWifi(NetworkInfo networkInfo) {
        return isWifi(getNetType(networkInfo));
    }

    public static boolean isWifiFromCache(Context context) {
        return NetworkCache.INSTANCE.isWifiFromCache(context);
    }

    public static boolean isWifiOr4G(Context context) {
        int netType = getNetType(context);
        if (netType == 0 || netType == 10) {
            Log.m105918d(TAG, "[cpan] is wifi or 4g network");
            return true;
        }
        Log.m105918d(TAG, "[cpan] is mobile network");
        return false;
    }

    private static Intent searchIntentByClass(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            List<PackageInfo> installedPackages = packageManager.getInstalledPackages(0);
            if (installedPackages == null || installedPackages.size() <= 0) {
                return null;
            }
            Log.m105920e(TAG, "package  size" + installedPackages.size());
            for (int i = 0; i < installedPackages.size(); i++) {
                try {
                    Log.m105920e(TAG, "package " + installedPackages.get(i).packageName);
                    Intent intent = new Intent();
                    intent.setPackage(installedPackages.get(i).packageName);
                    List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                    int size = queryIntentActivities != null ? queryIntentActivities.size() : 0;
                    if (size > 0) {
                        try {
                            Log.m105920e(TAG, "activityName count " + size);
                            int i2 = 0;
                            while (i2 < size) {
                                ActivityInfo activityInfo = queryIntentActivities.get(i2).activityInfo;
                                try {
                                    if (activityInfo.name.contains(str)) {
                                        Intent intent2 = new Intent("/");
                                        intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                                        intent2.setAction("android.intent.action.VIEW");
                                        C9556a aVar = new C9556a();
                                        aVar.mo10233c(intent2);
                                        C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/sdk/platformtools/NetStatusUtil", "searchIntentByClass", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                        try {
                                            context.startActivity((Intent) aVar.mo10231a(0));
                                            C117292a.m165359e(context, "com/tencent/mm/sdk/platformtools/NetStatusUtil", "searchIntentByClass", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                            return intent2;
                                        } catch (Exception e) {
                                            e = e;
                                        }
                                    } else {
                                        Context context2 = context;
                                        i2++;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    Context context3 = context;
                                    try {
                                        Log.printErrStackTrace(TAG, e, "", new Object[0]);
                                    } catch (Exception e3) {
                                        e = e3;
                                    }
                                }
                            }
                        } catch (Exception e4) {
                            e = e4;
                            Context context4 = context;
                            String str2 = str;
                            Log.printErrStackTrace(TAG, e, "", new Object[0]);
                        }
                    }
                    Context context5 = context;
                    String str3 = str;
                } catch (Exception e5) {
                    e = e5;
                    Context context6 = context;
                    String str4 = str;
                    Log.printErrStackTrace(TAG, e, "", new Object[0]);
                }
            }
            return null;
        } catch (Exception e6) {
            Log.printErrStackTrace(TAG, e6, "", new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:10|11|12|13|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ed, code lost:
        searchIntentByClass(r12, "ManageAccountsSettings");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x00a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void startSettingItent(android.content.Context r12, int r13) {
        /*
            r0 = 1
            java.lang.String r1 = "android.intent.action.VIEW"
            java.lang.String r2 = "/"
            r3 = 0
            if (r13 == r0) goto L_0x00f3
            r0 = 2
            if (r13 == r0) goto L_0x0058
            r0 = 3
            if (r13 == r0) goto L_0x0010
            goto L_0x0142
        L_0x0010:
            android.content.Intent r13 = new android.content.Intent     // Catch:{ Exception -> 0x0051 }
            r13.<init>()     // Catch:{ Exception -> 0x0051 }
            java.lang.String r0 = "android.settings.WIFI_IP_SETTINGS"
            r13.setAction(r0)     // Catch:{ Exception -> 0x0051 }
            k20.a r0 = new k20.a     // Catch:{ Exception -> 0x0051 }
            r0.<init>()     // Catch:{ Exception -> 0x0051 }
            r0.mo10233c(r13)     // Catch:{ Exception -> 0x0051 }
            java.lang.Object[] r5 = r0.mo10232b()     // Catch:{ Exception -> 0x0051 }
            java.lang.String r6 = "com/tencent/mm/sdk/platformtools/NetStatusUtil"
            java.lang.String r7 = "startSettingItent"
            java.lang.String r8 = "(Landroid/content/Context;I)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r4 = r12
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0051 }
            java.lang.Object r13 = r0.mo10231a(r3)     // Catch:{ Exception -> 0x0051 }
            android.content.Intent r13 = (android.content.Intent) r13     // Catch:{ Exception -> 0x0051 }
            r12.startActivity(r13)     // Catch:{ Exception -> 0x0051 }
            java.lang.String r1 = "com/tencent/mm/sdk/platformtools/NetStatusUtil"
            java.lang.String r2 = "startSettingItent"
            java.lang.String r3 = "(Landroid/content/Context;I)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r12
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0051 }
            goto L_0x0142
        L_0x0051:
            java.lang.String r13 = "AdvancedSettings"
            searchIntentByClass(r12, r13)
            goto L_0x0142
        L_0x0058:
            android.content.Intent r13 = new android.content.Intent     // Catch:{ Exception -> 0x00a3 }
            r13.<init>(r2)     // Catch:{ Exception -> 0x00a3 }
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r4 = "com.android.providers.subscribedfeeds"
            java.lang.String r5 = "com.android.settings.ManageAccountsSettings"
            r0.<init>(r4, r5)     // Catch:{ Exception -> 0x00a3 }
            r13.setComponent(r0)     // Catch:{ Exception -> 0x00a3 }
            r13.setAction(r1)     // Catch:{ Exception -> 0x00a3 }
            k20.a r0 = new k20.a     // Catch:{ Exception -> 0x00a3 }
            r0.<init>()     // Catch:{ Exception -> 0x00a3 }
            r0.mo10233c(r13)     // Catch:{ Exception -> 0x00a3 }
            java.lang.Object[] r5 = r0.mo10232b()     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r6 = "com/tencent/mm/sdk/platformtools/NetStatusUtil"
            java.lang.String r7 = "startSettingItent"
            java.lang.String r8 = "(Landroid/content/Context;I)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r4 = r12
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00a3 }
            java.lang.Object r13 = r0.mo10231a(r3)     // Catch:{ Exception -> 0x00a3 }
            android.content.Intent r13 = (android.content.Intent) r13     // Catch:{ Exception -> 0x00a3 }
            r12.startActivity(r13)     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r5 = "com/tencent/mm/sdk/platformtools/NetStatusUtil"
            java.lang.String r6 = "startSettingItent"
            java.lang.String r7 = "(Landroid/content/Context;I)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r4 = r12
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00a3 }
            goto L_0x0142
        L_0x00a3:
            android.content.Intent r13 = new android.content.Intent     // Catch:{ Exception -> 0x00ed }
            r13.<init>(r2)     // Catch:{ Exception -> 0x00ed }
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Exception -> 0x00ed }
            java.lang.String r2 = "com.htc.settings.accountsync"
            java.lang.String r4 = "com.htc.settings.accountsync.ManageAccountsSettings"
            r0.<init>(r2, r4)     // Catch:{ Exception -> 0x00ed }
            r13.setComponent(r0)     // Catch:{ Exception -> 0x00ed }
            r13.setAction(r1)     // Catch:{ Exception -> 0x00ed }
            k20.a r0 = new k20.a     // Catch:{ Exception -> 0x00ed }
            r0.<init>()     // Catch:{ Exception -> 0x00ed }
            r0.mo10233c(r13)     // Catch:{ Exception -> 0x00ed }
            java.lang.Object[] r5 = r0.mo10232b()     // Catch:{ Exception -> 0x00ed }
            java.lang.String r6 = "com/tencent/mm/sdk/platformtools/NetStatusUtil"
            java.lang.String r7 = "startSettingItent"
            java.lang.String r8 = "(Landroid/content/Context;I)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r4 = r12
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x00ed }
            java.lang.Object r13 = r0.mo10231a(r3)     // Catch:{ Exception -> 0x00ed }
            android.content.Intent r13 = (android.content.Intent) r13     // Catch:{ Exception -> 0x00ed }
            r12.startActivity(r13)     // Catch:{ Exception -> 0x00ed }
            java.lang.String r1 = "com/tencent/mm/sdk/platformtools/NetStatusUtil"
            java.lang.String r2 = "startSettingItent"
            java.lang.String r3 = "(Landroid/content/Context;I)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r12
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00ed }
            goto L_0x0142
        L_0x00ed:
            java.lang.String r13 = "ManageAccountsSettings"
            searchIntentByClass(r12, r13)
            goto L_0x0142
        L_0x00f3:
            android.content.Intent r13 = new android.content.Intent     // Catch:{ Exception -> 0x013d }
            r13.<init>(r2)     // Catch:{ Exception -> 0x013d }
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ Exception -> 0x013d }
            java.lang.String r2 = "com.android.settings"
            java.lang.String r4 = "com.android.settings.DevelopmentSettings"
            r0.<init>(r2, r4)     // Catch:{ Exception -> 0x013d }
            r13.setComponent(r0)     // Catch:{ Exception -> 0x013d }
            r13.setAction(r1)     // Catch:{ Exception -> 0x013d }
            k20.a r0 = new k20.a     // Catch:{ Exception -> 0x013d }
            r0.<init>()     // Catch:{ Exception -> 0x013d }
            r0.mo10233c(r13)     // Catch:{ Exception -> 0x013d }
            java.lang.Object[] r5 = r0.mo10232b()     // Catch:{ Exception -> 0x013d }
            java.lang.String r6 = "com/tencent/mm/sdk/platformtools/NetStatusUtil"
            java.lang.String r7 = "startSettingItent"
            java.lang.String r8 = "(Landroid/content/Context;I)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r4 = r12
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x013d }
            java.lang.Object r13 = r0.mo10231a(r3)     // Catch:{ Exception -> 0x013d }
            android.content.Intent r13 = (android.content.Intent) r13     // Catch:{ Exception -> 0x013d }
            r12.startActivity(r13)     // Catch:{ Exception -> 0x013d }
            java.lang.String r1 = "com/tencent/mm/sdk/platformtools/NetStatusUtil"
            java.lang.String r2 = "startSettingItent"
            java.lang.String r3 = "(Landroid/content/Context;I)V"
            java.lang.String r4 = "Undefined"
            java.lang.String r5 = "startActivity"
            java.lang.String r6 = "(Landroid/content/Intent;)V"
            r0 = r12
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x013d }
            goto L_0x0142
        L_0x013d:
            java.lang.String r13 = "DevelopmentSettings"
            searchIntentByClass(r12, r13)
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.NetStatusUtil.startSettingItent(android.content.Context, int):void");
    }

    public static boolean isConnected(Context context) {
        ConnectivityManager connectivityManager;
        if ((context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) || (connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            return connectivityManager.getActiveNetworkInfo().isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isWifi(Context context) {
        return isWifi(getNetType(context));
    }

    public static int getIOSNetType(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return 0;
        }
        try {
            if (networkInfo.getType() == 1) {
                return 1;
            }
            if (networkInfo.getSubtype() != 1) {
                if (networkInfo.getSubtype() != 2) {
                    if (networkInfo.getSubtype() >= 13) {
                        return 4;
                    }
                    if (networkInfo.getSubtype() >= 3) {
                        return 3;
                    }
                    return 0;
                }
            }
            return 2;
        } catch (Exception unused) {
        }
    }

    public static int getNetType(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if ((context != null && context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) || (connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return -1;
        }
        return getNetType(activeNetworkInfo);
    }
}
