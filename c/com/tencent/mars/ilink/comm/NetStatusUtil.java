package com.tencent.mars.ilink.comm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.tencent.mars.ilink.xlog.Log;

public class NetStatusUtil {
    public static final int CMNET = 6;
    public static final int CMWAP = 5;
    public static final int CTNET = 8;
    public static final int CTWAP = 7;
    public static final int LTE = 10;
    public static final int MOBILE = 9;
    public static final int NETTYPE_NOT_WIFI = 0;
    public static final int NETTYPE_WIFI = 1;
    public static final int NET_3G = 4;
    public static final int NON_NETWORK = -1;
    public static final int NO_SIM_OPERATOR = 0;
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
    private static int nowStrength = 30;

    public static void dumpNetStatus(Context context) {
        try {
            Log.m160928i(TAG, ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().toString());
        } catch (Exception e) {
            Log.m160925e(TAG, "", e);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0031 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getBackgroundLimitType(android.content.Context r6) {
        /*
            r0 = 1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityManagerNative"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ Exception -> 0x0031 }
            java.lang.String r3 = "getDefault"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0031 }
            java.lang.reflect.Method r3 = r2.getMethod(r3, r4)     // Catch:{ Exception -> 0x0031 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch:{ Exception -> 0x0031 }
            java.lang.Class r3 = r2.getClass()     // Catch:{ Exception -> 0x0031 }
            java.lang.String r4 = "getProcessLimit"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0031 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ Exception -> 0x0031 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0031 }
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch:{ Exception -> 0x0031 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0031 }
            int r2 = r2.intValue()     // Catch:{ Exception -> 0x0031 }
            if (r2 != 0) goto L_0x0031
            return r0
        L_0x0031:
            int r2 = getWifiSleeepPolicy(r6)     // Catch:{ Exception -> 0x0045 }
            r3 = 2
            if (r2 == r3) goto L_0x0045
            int r6 = getNetType(r6)     // Catch:{ Exception -> 0x0045 }
            if (r6 == 0) goto L_0x003f
            goto L_0x0045
        L_0x003f:
            if (r2 == r0) goto L_0x0043
            if (r2 != 0) goto L_0x0045
        L_0x0043:
            r6 = 3
            return r6
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.ilink.comm.NetStatusUtil.getBackgroundLimitType(android.content.Context):int");
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
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    public static String getISPName(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        return telephonyManager == null ? "" : telephonyManager.getSimOperatorName().length() <= 100 ? telephonyManager.getSimOperatorName() : telephonyManager.getSimOperatorName().substring(0, 100);
    }

    public static int getNetType(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return -1;
        }
        if (activeNetworkInfo.getType() == 1) {
            return 0;
        }
        if (activeNetworkInfo.getExtraInfo() == null) {
            return 9;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase("uninet")) {
            return 1;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase("uniwap")) {
            return 2;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase("3gwap")) {
            return 3;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase("3gnet")) {
            return 4;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase("cmwap")) {
            return 5;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase("cmnet")) {
            return 6;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase("ctwap")) {
            return 7;
        }
        if (activeNetworkInfo.getExtraInfo().equalsIgnoreCase("ctnet")) {
            return 8;
        }
        return activeNetworkInfo.getExtraInfo().equalsIgnoreCase("LTE") ? 10 : 9;
    }

    public static int getNetTypeForStat(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return 999;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
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
        } catch (Exception unused) {
            return 999;
        }
    }

    public static String getNetTypeString(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) ? "NON_NETWORK" : activeNetworkInfo.getType() == 1 ? "WIFI" : activeNetworkInfo.getExtraInfo() != null ? activeNetworkInfo.getExtraInfo() : "MOBILE";
    }

    public static int getNetWorkType(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.getType();
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int getProxyInfo(Context context, StringBuffer stringBuffer) {
        try {
            String defaultHost = Proxy.getDefaultHost();
            int defaultPort = Proxy.getDefaultPort();
            if (defaultHost == null || defaultHost.length() <= 0 || defaultPort <= 0) {
                String property = System.getProperty("http.proxyHost");
                String property2 = System.getProperty("http.proxyPort");
                int i = 80;
                if (property2 != null && property2.length() > 0) {
                    i = Integer.parseInt(property2);
                }
                if (property == null || property.length() <= 0) {
                    return 0;
                }
                stringBuffer.append(property);
                return i;
            }
            stringBuffer.append(defaultHost);
            return defaultPort;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int getStrength(Context context) {
        if (context == null) {
            return 0;
        }
        return nowStrength;
    }

    public static int getWifiSleeepPolicy(Context context) {
        return Settings.System.getInt(context.getContentResolver(), "wifi_sleep_policy", 2);
    }

    public static int guessNetSpeed(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo.getType() == 1) {
                return 102400;
            }
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype != 1) {
                return subtype != 2 ? 102400 : 8192;
            }
            return 4096;
        } catch (Exception unused) {
        }
    }

    public static boolean is2G(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo.getType() == 1) {
                return false;
            }
            return activeNetworkInfo.getSubtype() == 2 || activeNetworkInfo.getSubtype() == 1 || activeNetworkInfo.getSubtype() == 4;
        } catch (Exception unused) {
        }
    }

    public static boolean is3G(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo.getType() != 1 && activeNetworkInfo.getSubtype() >= 5 && activeNetworkInfo.getSubtype() < 13;
        } catch (Exception unused) {
        }
    }

    public static boolean is4G(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            return activeNetworkInfo.getType() != 1 && activeNetworkInfo.getSubtype() >= 13;
        } catch (Exception unused) {
        }
    }

    public static boolean isConnected(Context context) {
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().isConnected();
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
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo().getType() != 1;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r2 = r2.getActiveNetworkInfo();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isNetworkConnected(android.content.Context r2) {
        /*
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            r0 = 0
            if (r2 != 0) goto L_0x000c
            return r0
        L_0x000c:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            if (r2 != 0) goto L_0x0013
            return r0
        L_0x0013:
            android.net.NetworkInfo$State r2 = r2.getState()
            android.net.NetworkInfo$State r1 = android.net.NetworkInfo.State.CONNECTED
            if (r2 != r1) goto L_0x001c
            r0 = 1
        L_0x001c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mars.ilink.comm.NetStatusUtil.isNetworkConnected(android.content.Context):boolean");
    }

    public static boolean isWap(int i) {
        return i == 2 || i == 5 || i == 7 || i == 3;
    }

    public static boolean isWap(Context context) {
        return isWap(getNetType(context));
    }

    public static boolean isWifi(int i) {
        return i == 0;
    }

    public static boolean isWifi(Context context) {
        return isWifi(getNetType(context));
    }
}
