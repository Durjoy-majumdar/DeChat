package tm0;

import android.content.Context;
import android.net.wifi.WifiManager;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import rx3.C13598b0;

/* renamed from: tm0.p0 */
public final class C14034p0 extends C87413o implements C32227p<Context, Map<String, Object>, C13598b0> {

    /* renamed from: d */
    public static final C14034p0 f39387d = new C14034p0();

    public C14034p0() {
        super(2);
    }

    public Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        Map map = (Map) obj2;
        C87412m.m108594g(map, "outRes");
        WifiManager wifiManager = null;
        Object systemService = context != null ? context.getSystemService("wifi") : null;
        if (systemService instanceof WifiManager) {
            wifiManager = (WifiManager) systemService;
        }
        map.put("wifiEnabled", Boolean.valueOf(wifiManager != null ? wifiManager.isWifiEnabled() : false));
        return C13598b0.f38549a;
    }
}
