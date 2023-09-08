package com.tencent.liteav.base.system;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Debug;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import com.tencent.liteav.base.annotations.JNINamespace;
import com.tencent.liteav.base.p1181b.C113456a;
import com.tencent.liteav.base.util.C113472r;
import com.tencent.liteav.base.util.C80205k;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@JNINamespace("liteav")
public class LiteavSystemInfo {
    private static final int APP_SYSTEM_METHOD_DEFAULT_GET_INTERVAL_MS = 10000;
    private static final String EXT_KEY_APP_NAME = "appName";
    private static final String EXT_KEY_APP_PACKAGE_NAME = "appPackageName";
    private static final String EXT_KEY_APP_VERSION = "appVersion";
    private static final String EXT_KEY_BUILD_BOARD = "buildBoard";
    private static final String EXT_KEY_BUILD_BRAND = "buildBrand";
    private static final String EXT_KEY_BUILD_HARDWARE = "buildHardware";
    private static final String EXT_KEY_BUILD_MANUFACTURER = "buildManufacturer";
    private static final String EXT_KEY_BUILD_MODEL = "buildModel";
    private static final String EXT_KEY_BUILD_VERSION = "buildVersion";
    private static final String EXT_KEY_BUILD_VERSION_INT = "buildVersionInt";
    private static final int GET_APP_MEMORY_INTERVAL_MS = 15000;
    private static final int NETWORK_TYPE_2G = 4;
    private static final int NETWORK_TYPE_3G = 3;
    private static final int NETWORK_TYPE_4G = 2;
    private static final int NETWORK_TYPE_5G = 6;
    private static final int NETWORK_TYPE_UNKNOWN = 0;
    private static final int NETWORK_TYPE_WIFI = 1;
    private static final int NETWORK_TYPE_WIRED = 5;
    private static final String TAG = "LiteavBaseSystemInfo";
    private static final C113472r<String> sAppName = new C113472r<>(C113460d.m155346a());
    private static final C113472r<String> sAppPackageName = new C113472r<>(C113470n.m155356a());
    private static final C113472r<String> sAppVersion = new C113472r<>(C113461e.m155347a());
    private static final C113472r<String> sBoard = new C113472r<>(C113469m.m155355a());
    private static final C113472r<String> sBrand = new C113472r<>(C113464h.m155350a());
    private static final C113456a sGatewayThrottler = new C113456a(10000);
    private static final C113472r<String> sHardware = new C113472r<>(C113466j.m155352a());
    private static AtomicBoolean sIsGettingMemoryUsage = new AtomicBoolean(false);
    private static int sLastGateway = 0;
    private static AtomicInteger sLastMemoryUsage = new AtomicInteger(0);
    private static int sLastNetworkType = 0;
    private static final C113472r<String> sManufacturer = new C113472r<>(C113465i.m155351a());
    private static final C113456a sMemoryUsageThrottler = new C113456a(15000);
    private static final C113472r<String> sModel = new C113472r<>(C113463g.m155349a());
    private static final C113456a sNetworkTypeThrottler = new C113456a(10000);
    private static volatile C80205k sProcessStateOwner;
    private static final Object sProcessStateOwnerLock = new Object();
    private static final C113472r<String> sSystemOSVersion = new C113472r<>(C113467k.m155353a());
    private static final C113472r<Integer> sSystemOSVersionInt = new C113472r<>(C113468l.m155354a());
    private static final C113472r<String> sUUID = new C113472r<>(C113462f.m155348a());

    public static synchronized int getAppBackgroundState() {
        int i;
        synchronized (LiteavSystemInfo.class) {
            if (sProcessStateOwner == null) {
                synchronized (sProcessStateOwnerLock) {
                    if (sProcessStateOwner == null) {
                        sProcessStateOwner = new C80205k(ContextUtils.getApplicationContext());
                    }
                }
            }
            i = sProcessStateOwner.f234754a ? 1 : 0;
        }
        return i;
    }

    public static synchronized int getAppMemoryUsage() {
        int i;
        synchronized (LiteavSystemInfo.class) {
            if (sMemoryUsageThrottler.mo169948a()) {
                getAppMemoryUsageFromSystem();
            }
            i = sLastMemoryUsage.get();
        }
        return i;
    }

    private static void getAppMemoryUsageFromSystem() {
        if (!sIsGettingMemoryUsage.get()) {
            sIsGettingMemoryUsage.set(true);
            AsyncTask.execute(C113459c.m155345a());
        }
    }

    public static String getAppName() {
        return sAppName.mo169971a();
    }

    public static String getAppPackageName() {
        return sAppPackageName.mo169971a();
    }

    public static String getAppVersion() {
        return sAppVersion.mo169971a();
    }

    public static String getBoard() {
        return sBoard.mo169971a();
    }

    public static String getBrand() {
        return sBrand.mo169971a();
    }

    public static String getDeviceUuid() {
        return sUUID.mo169971a();
    }

    public static synchronized int getGateway() {
        int i;
        synchronized (LiteavSystemInfo.class) {
            if (sGatewayThrottler.mo169948a()) {
                sLastGateway = getGatewayFromSystem();
            }
            i = sLastGateway;
        }
        return i;
    }

    private static int getGatewayFromSystem() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        try {
            return ((WifiManager) applicationContext.getSystemService("wifi")).getDhcpInfo().gateway;
        } catch (Throwable th) {
            Log.m97546e(TAG, "getGateway error " + th.getMessage(), new Object[0]);
            return 0;
        }
    }

    public static String getHardware() {
        return sHardware.mo169971a();
    }

    public static String getManufacturer() {
        return sManufacturer.mo169971a();
    }

    public static String getModel() {
        return sModel.mo169971a();
    }

    public static synchronized int getNetworkType() {
        int i;
        synchronized (LiteavSystemInfo.class) {
            if (sNetworkTypeThrottler.mo169948a()) {
                sLastNetworkType = getNetworkTypeFromSystem();
            }
            i = sLastNetworkType;
        }
        return i;
    }

    private static int getNetworkTypeFromSystem() {
        Context applicationContext = ContextUtils.getApplicationContext();
        if (applicationContext == null) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
        NetworkInfo networkInfo = null;
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception e) {
            Log.m97546e(TAG, "getNetworkType error occurred.", e);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return 0;
        }
        if (networkInfo.getType() == 9) {
            return 5;
        }
        if (networkInfo.getType() == 1) {
            return 1;
        }
        if (networkInfo.getType() != 0) {
            return 0;
        }
        try {
            int networkType = telephonyManager.getNetworkType();
            switch (networkType) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                    return 4;
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
                    return 2;
                default:
                    return (getSystemOSVersionInt() < 29 || networkType != 20) ? 2 : 6;
            }
        } catch (Exception e2) {
            Log.m97546e(TAG, "getNetworkType error occurred.", e2);
            return 2;
        }
    }

    public static String getSystemOSVersion() {
        return sSystemOSVersion.mo169971a();
    }

    public static int getSystemOSVersionInt() {
        return sSystemOSVersionInt.mo169971a().intValue();
    }

    public static /* synthetic */ void lambda$getAppMemoryUsageFromSystem$8() {
        int i;
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            i = memoryInfo.getTotalPss();
        } catch (Exception e) {
            Log.m97546e(TAG, "Get App memory usage failed." + e.getMessage(), new Object[0]);
            i = 0;
        }
        sLastMemoryUsage.set(i / 1024);
        sIsGettingMemoryUsage.set(false);
    }

    public static boolean setExtID(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -911706486:
                if (str.equals(EXT_KEY_BUILD_VERSION)) {
                    c = 0;
                    break;
                }
                break;
            case -794136500:
                if (str.equals(EXT_KEY_APP_NAME)) {
                    c = 1;
                    break;
                }
                break;
            case -589756065:
                if (str.equals(EXT_KEY_BUILD_MANUFACTURER)) {
                    c = 2;
                    break;
                }
                break;
            case -497349352:
                if (str.equals(EXT_KEY_BUILD_BOARD)) {
                    c = 3;
                    break;
                }
                break;
            case -497260103:
                if (str.equals(EXT_KEY_BUILD_BRAND)) {
                    c = 4;
                    break;
                }
                break;
            case -487188133:
                if (str.equals(EXT_KEY_BUILD_MODEL)) {
                    c = 5;
                    break;
                }
                break;
            case -441921776:
                if (str.equals(EXT_KEY_APP_PACKAGE_NAME)) {
                    c = 6;
                    break;
                }
                break;
            case -391134602:
                if (str.equals(EXT_KEY_BUILD_HARDWARE)) {
                    c = 7;
                    break;
                }
                break;
            case 725329157:
                if (str.equals(EXT_KEY_BUILD_VERSION_INT)) {
                    c = 8;
                    break;
                }
                break;
            case 1484112759:
                if (str.equals(EXT_KEY_APP_VERSION)) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                sSystemOSVersion.mo169972a(str2);
                break;
            case 1:
                sAppName.mo169972a(str2);
                break;
            case 2:
                sManufacturer.mo169972a(str2);
                break;
            case 3:
                sBoard.mo169972a(str2);
                break;
            case 4:
                sBrand.mo169972a(str2);
                break;
            case 5:
                sModel.mo169972a(str2);
                break;
            case 6:
                sAppPackageName.mo169972a(str2);
                break;
            case 7:
                sHardware.mo169972a(str2);
                break;
            case 8:
                try {
                    sSystemOSVersionInt.mo169972a(Integer.valueOf(Integer.parseInt(str2)));
                    break;
                } catch (Exception unused) {
                    break;
                }
            case 9:
                sAppVersion.mo169972a(str2);
                break;
            default:
                return false;
        }
        return true;
    }
}
