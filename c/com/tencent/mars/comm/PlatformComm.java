package com.tencent.mars.comm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.tencent.p014mm.sdk.platformtools.ConnectivityCompat;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.xweb.file.XVFSFile;
import java.io.PrintWriter;
import java.io.StringWriter;

public class PlatformComm {
    public static final int EMobile = 2;
    public static final int ENoNet = -1;
    public static final int EOtherNet = 3;
    public static final int EWifi = 1;
    private static final boolean IS_PROXY_ON = false;
    public static final int NETTYPE_2G = 3;
    public static final int NETTYPE_3G = 4;
    public static final int NETTYPE_4G = 5;
    public static final int NETTYPE_5G = 7;
    public static final int NETTYPE_NON = -1;
    public static final int NETTYPE_NOT_WIFI = 0;
    public static final int NETTYPE_UNKNOWN = 6;
    public static final int NETTYPE_WAP = 2;
    public static final int NETTYPE_WIFI = 1;
    private static final String TAG = "PlatformComm";
    /* access modifiers changed from: private */
    public static Context context;
    /* access modifiers changed from: private */
    public static MMHandler handler;
    public static IReportCrash reportCrashImp;
    public static IResetProcess resetprocessimp;

    public static class APNInfo {
        public String extraInfo;
        public int netType;
        public int subNetType;
    }

    public static class Assert {
        public static void assertTrue(String str, boolean z) {
        }

        public static void assertTrue(boolean z) {
        }
    }

    public interface IReportCrash {
        void reportIdkey();
    }

    public interface IResetProcess {
        void restartProcess();
    }

    public static class SIMInfo {
        public String ispCode;
        public String ispName;
    }

    public static class WifiInfo {
        public String bssid;
        public String ssid;
    }

    public static void init(Context context2, MMHandler mMHandler) {
        context = context2;
        handler = mMHandler;
        NetworkSignalUtil.InitNetworkSignalUtil(context2);
    }

    public static class C2Java {
        private static String exception2String(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }

        public static APNInfo getAPNInfo() {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
                APNInfo aPNInfo = new APNInfo();
                if (activeNetworkInfo == null) {
                    return null;
                }
                aPNInfo.netType = activeNetworkInfo.getType();
                aPNInfo.subNetType = activeNetworkInfo.getSubtype();
                if (1 != activeNetworkInfo.getType()) {
                    aPNInfo.extraInfo = activeNetworkInfo.getExtraInfo() == null ? "" : activeNetworkInfo.getExtraInfo();
                } else {
                    aPNInfo.extraInfo = getCurWifiInfo().ssid;
                }
                return aPNInfo;
            } catch (Exception e) {
                Log.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                return null;
            }
        }

        public static int getCurRadioAccessNetworkInfo() {
            if (PlatformComm.context == null) {
                Assert.assertTrue(false);
                return 0;
            }
            try {
                return ((TelephonyManager) PlatformComm.context.getSystemService("phone")).getNetworkType();
            } catch (Exception e) {
                Log.m105920e(PlatformComm.TAG, exception2String(e));
                Log.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                Assert.assertTrue(e.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return 0;
            }
        }

        public static SIMInfo getCurSIMInfo() {
            int iSPCode;
            try {
                if (PlatformComm.context == null || (iSPCode = NetStatusUtil.getISPCode(PlatformComm.context)) == 0) {
                    return null;
                }
                SIMInfo sIMInfo = new SIMInfo();
                String str = "" + iSPCode;
                sIMInfo.ispCode = str;
                Log.m105919d(PlatformComm.TAG, "getISPCode MCC_MNC=%s", str);
                sIMInfo.ispName = NetStatusUtil.getISPName(PlatformComm.context);
                return sIMInfo;
            } catch (Exception e) {
                Log.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                return null;
            }
        }

        @Deprecated
        public static WifiInfo getCurWifiInfo() {
            WifiInfo wifiInfo = new WifiInfo();
            ConnectivityCompat.Companion companion = ConnectivityCompat.Companion;
            wifiInfo.ssid = companion.getFormattedWiFiSsid();
            wifiInfo.bssid = companion.getFormattedWiFiBssid();
            return wifiInfo;
        }

        public static int getNetInfo() {
            NetworkInfo networkInfo;
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) MMApplicationContext.getContext().getSystemService("connectivity");
                if (connectivityManager == null) {
                    return -1;
                }
                networkInfo = connectivityManager.getActiveNetworkInfo();
                if (networkInfo == null) {
                    return -1;
                }
                try {
                    int type = networkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            return (type == 2 || type == 3 || type == 4 || type == 5) ? 2 : 3;
                        }
                        return 1;
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                    return 3;
                }
            } catch (Exception unused) {
                networkInfo = null;
            }
        }

        public static int getProxyInfo(StringBuffer stringBuffer) {
            return -1;
        }

        public static long getSignal(boolean z) {
            try {
                if (PlatformComm.context != null) {
                    return z ? NetworkSignalUtil.getWifiSignalStrength() : NetworkSignalUtil.getGSMSignalStrength();
                }
                Assert.assertTrue(false);
                return 0;
            } catch (Exception e) {
                Log.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                return 0;
            }
        }

        public static int getStatisticsNetType() {
            if (PlatformComm.context == null) {
                Assert.assertTrue(false);
                return 0;
            }
            try {
                int netType = NetStatusUtil.getNetType(PlatformComm.context);
                if (netType == -1) {
                    return -1;
                }
                if (NetStatusUtil.isWifi(netType)) {
                    return 1;
                }
                if (NetStatusUtil.is2G(PlatformComm.context)) {
                    return 3;
                }
                if (NetStatusUtil.is3G(PlatformComm.context)) {
                    return 4;
                }
                if (NetStatusUtil.is4G(PlatformComm.context)) {
                    return 5;
                }
                if (NetStatusUtil.is5G(PlatformComm.context)) {
                    return 7;
                }
                return NetStatusUtil.isWap(netType) ? 2 : 6;
            } catch (Exception e) {
                Log.m105920e(PlatformComm.TAG, exception2String(e));
                Log.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                Assert.assertTrue(e.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return -1;
            }
        }

        public static boolean isNetworkConnected() {
            if (PlatformComm.context == null) {
                Assert.assertTrue(false);
                return false;
            }
            try {
                return NetStatusUtil.isNetworkConnected(PlatformComm.context);
            } catch (Exception e) {
                Log.m105920e(PlatformComm.TAG, exception2String(e));
                Log.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                Assert.assertTrue(e.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return false;
            }
        }

        public static void restartProcess() {
            if (PlatformComm.resetprocessimp != null) {
                try {
                    PlatformComm.handler.post(new Runnable() {
                        public void run() {
                            PlatformComm.resetprocessimp.restartProcess();
                        }
                    });
                } catch (Exception e) {
                    Log.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                }
            }
        }

        public static boolean startAlarm(int i, int i2, int i3) {
            Log.m105925i(PlatformComm.TAG, "start alarm type:%d id is %d", Integer.valueOf(i), Integer.valueOf(i2));
            if (PlatformComm.context == null) {
                Assert.assertTrue(false);
                return false;
            }
            try {
                return Alarm.start(i, (long) i2, i3, PlatformComm.context);
            } catch (Exception e) {
                IReportCrash iReportCrash = PlatformComm.reportCrashImp;
                if (iReportCrash != null) {
                    iReportCrash.reportIdkey();
                }
                Log.m105920e(PlatformComm.TAG, exception2String(e));
                Log.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                Assert.assertTrue(e.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return false;
            }
        }

        public static boolean stopAlarm(int i) {
            if (PlatformComm.context == null) {
                Assert.assertTrue(false);
                return false;
            }
            try {
                return Alarm.stop((long) i, PlatformComm.context);
            } catch (Exception e) {
                Log.m105920e(PlatformComm.TAG, exception2String(e));
                Log.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                Assert.assertTrue(e.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return false;
            }
        }

        public static WakerLock wakeupLock_new() {
            if (PlatformComm.context == null) {
                Assert.assertTrue(false);
                return null;
            }
            try {
                return new WakerLock(PlatformComm.context, PlatformComm.TAG);
            } catch (Exception e) {
                Log.m105920e(PlatformComm.TAG, exception2String(e));
                Log.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                Assert.assertTrue(e.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return null;
            }
        }

        public static boolean startAlarm(int i, int i2) {
            Log.m105925i(PlatformComm.TAG, "start alarm no type id is %d", Integer.valueOf(i));
            if (PlatformComm.context == null) {
                Assert.assertTrue(false);
                return false;
            }
            try {
                return Alarm.start(113, (long) i, i2, PlatformComm.context);
            } catch (Exception e) {
                IReportCrash iReportCrash = PlatformComm.reportCrashImp;
                if (iReportCrash != null) {
                    iReportCrash.reportIdkey();
                }
                Log.m105920e(PlatformComm.TAG, exception2String(e));
                Log.printErrStackTrace(PlatformComm.TAG, e, "", new Object[0]);
                Assert.assertTrue(e.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return false;
            }
        }
    }
}
