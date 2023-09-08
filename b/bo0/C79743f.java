package bo0;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;

/* renamed from: bo0.f */
public final class C79743f {

    /* renamed from: a */
    public static WifiManager f233719a;

    /* renamed from: a */
    public static WifiInfo m96881a() {
        try {
            return (WifiInfo) C117292a.m165363i(f233719a, "com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/internal/WifiManagerInternalWrapper", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;", "android/net/wifi/WifiManager", "getConnectionInfo", "()Landroid/net/wifi/WifiInfo;");
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.WifiManagerInternalWrapper", th, "getConnectionInfo", new Object[0]);
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m96882b() {
        try {
            return f233719a.isWifiEnabled();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.WifiManagerInternalWrapper", th, "isWifiEnabled", new Object[0]);
            return false;
        }
    }

    /* renamed from: c */
    public static boolean m96883c() {
        try {
            return f233719a.saveConfiguration();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.WifiManagerInternalWrapper", th, "saveConfiguration", new Object[0]);
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m96884d() {
        try {
            return ((Boolean) C117292a.m165363i(f233719a, "com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/internal/WifiManagerInternalWrapper", "startScan", "()Z", "android/net/wifi/WifiManager", "startScan", "()Z")).booleanValue();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.WifiManagerInternalWrapper", th, "startScan", new Object[0]);
            return false;
        }
    }
}
