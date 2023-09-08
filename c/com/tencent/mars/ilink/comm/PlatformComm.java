package com.tencent.mars.ilink.comm;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.telephony.TelephonyManager;
import com.tencent.mars.ilink.xlog.Log;
import com.tencent.mars.ilink.xlog.Xlog;
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
    public static final int NETTYPE_NON = -1;
    public static final int NETTYPE_NOT_WIFI = 0;
    public static final int NETTYPE_UNKNOWN = 6;
    public static final int NETTYPE_WAP = 2;
    public static final int NETTYPE_WIFI = 1;
    private static final String TAG = "PlatformComm";
    public static Context context = null;
    public static Handler handler = null;
    private static final Xlog m_xlog = new Xlog();

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

    public static class C2Java {
        private static String exception2String(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }

        public static APNInfo getAPNInfo() {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) PlatformComm.context.getSystemService("connectivity")).getActiveNetworkInfo();
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
            } catch (Exception unused) {
                return null;
            }
        }

        public static int getCurRadioAccessNetworkInfo() {
            Context context = PlatformComm.context;
            if (context == null) {
                Assert.assertTrue(false);
                return 0;
            }
            try {
                return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
            } catch (SecurityException e) {
                Assert.assertTrue(e.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return 0;
            } catch (Exception e2) {
                Assert.assertTrue(e2.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e2.getStackTrace()[0] + ", " + e2.getStackTrace()[1], false);
                return 0;
            }
        }

        public static SIMInfo getCurSIMInfo() {
            int iSPCode;
            try {
                Context context = PlatformComm.context;
                if (context == null || (iSPCode = NetStatusUtil.getISPCode(context)) == 0) {
                    return null;
                }
                SIMInfo sIMInfo = new SIMInfo();
                sIMInfo.ispCode = "" + iSPCode;
                sIMInfo.ispName = NetStatusUtil.getISPName(PlatformComm.context);
                return sIMInfo;
            } catch (Exception unused) {
                return null;
            }
        }

        public static WifiInfo getCurWifiInfo() {
            WifiInfo wifiInfo = new WifiInfo();
            wifiInfo.ssid = NetworkSignalUtil.getSSID();
            wifiInfo.bssid = NetworkSignalUtil.getBSSID();
            return wifiInfo;
        }

        public static int getNetInfo() {
            NetworkInfo activeNetworkInfo;
            ConnectivityManager connectivityManager = (ConnectivityManager) PlatformComm.context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return -1;
            }
            try {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1) {
                        return (type == 2 || type == 3 || type == 4 || type == 5) ? 2 : 3;
                    }
                    return 1;
                }
            } catch (Exception unused) {
                return 3;
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
            } catch (Exception unused) {
                return 0;
            }
        }

        public static int getStatisticsNetType() {
            Context context = PlatformComm.context;
            if (context == null) {
                Assert.assertTrue(false);
                return 0;
            }
            try {
                int netType = NetStatusUtil.getNetType(context);
                if (netType == -1) {
                    return -1;
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
                if (NetStatusUtil.isWifi(netType)) {
                    return 1;
                }
                return NetStatusUtil.isWap(netType) ? 2 : 6;
            } catch (Exception e) {
                exception2String(e);
                Assert.assertTrue(e.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return -1;
            }
        }

        public static boolean isNetworkConnected() {
            Context context = PlatformComm.context;
            if (context == null) {
                Assert.assertTrue(false);
                return false;
            }
            try {
                return NetStatusUtil.isNetworkConnected(context);
            } catch (Exception e) {
                exception2String(e);
                Assert.assertTrue(e.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return false;
            }
        }

        public static boolean startAlarm(int i, int i2, int i3) {
            Context context = PlatformComm.context;
            if (context == null) {
                Assert.assertTrue(false);
                return false;
            }
            try {
                return Alarm.start(i, (long) i2, i3, context);
            } catch (Exception e) {
                exception2String(e);
                Assert.assertTrue(e.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return false;
            }
        }

        public static boolean stopAlarm(int i) {
            Context context = PlatformComm.context;
            if (context == null) {
                Assert.assertTrue(false);
                return false;
            }
            try {
                return Alarm.stop((long) i, context);
            } catch (Exception e) {
                exception2String(e);
                Assert.assertTrue(e.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return false;
            }
        }

        public static WakerLock wakeupLock_new() {
            Context context = PlatformComm.context;
            if (context == null) {
                Assert.assertTrue(false);
                return null;
            }
            try {
                return new WakerLock(context);
            } catch (Exception e) {
                exception2String(e);
                Assert.assertTrue(e.getClass().getSimpleName() + XVFSFile.PATH_SEPARATOR + e.getStackTrace()[0] + ", " + e.getStackTrace()[1], false);
                return null;
            }
        }
    }

    public static class SIMInfo {
        public String ispCode;
        public String ispName;
    }

    public static class WifiInfo {
        public String bssid;
        public String ssid;
    }

    public static void init(Context context2, Handler handler2) {
        context = context2;
        handler = handler2;
        NetworkSignalUtil.InitNetworkSignalUtil(context2);
        Log.setLogImp(m_xlog);
    }
}
