package bo0;

import android.net.wifi.WifiConfiguration;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import java.util.List;

/* renamed from: bo0.d */
public class C79734d {
    /* renamed from: a */
    public static boolean m96871a(int i) {
        boolean z;
        boolean z2;
        try {
            z = C79743f.f233719a.removeNetwork(i);
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.WifiManagerInternalWrapper", th, "removeNetwork", new Object[0]);
            z = false;
        }
        if (!z) {
            try {
                z2 = C79743f.f233719a.disableNetwork(i);
            } catch (Throwable th4) {
                Log.printErrStackTrace("MicroMsg.WifiManagerInternalWrapper", th4, "disableNetwork", new Object[0]);
                z2 = false;
            }
            if (!z2) {
                return false;
            }
        }
        C79743f.m96883c();
        return true;
    }

    /* renamed from: b */
    public static List<WifiConfiguration> m96872b() {
        try {
            return (List) C117292a.m165363i(C79743f.f233719a, "com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/internal/WifiManagerInternalWrapper", "getConfiguredNetworks", "()Ljava/util/List;", "android/net/wifi/WifiManager", "getConfiguredNetworks", "()Ljava/util/List;");
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.WifiManagerInternalWrapper", th, "getConfiguredNetworks", new Object[0]);
            return null;
        }
    }
}
