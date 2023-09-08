package ao0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import bo0.C79729a;
import bo0.C79743f;
import bo0.C79744g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import zn0.C91803c;

/* renamed from: ao0.g */
public class C79614g {

    /* renamed from: a */
    public static boolean f233460a;

    /* renamed from: b */
    public static WeakReference<C79729a> f233461b;

    /* renamed from: c */
    public static C79612e f233462c;

    /* renamed from: d */
    public static C79610c f233463d;

    /* renamed from: e */
    public static Context f233464e;

    /* renamed from: f */
    public static BroadcastReceiver f233465f;

    /* renamed from: g */
    public static volatile C79611d f233466g;

    /* renamed from: ao0.g$b */
    public static class C79616b extends BroadcastReceiver {
        public C79616b(C79615a aVar) {
        }

        public void onReceive(Context context, Intent intent) {
            Log.m105924i("MicroMsg.WiFiManagerWrapper", "onReceive");
            if (intent == null || !"android.net.wifi.SCAN_RESULTS".equals(intent.getAction())) {
                Log.m105928w("MicroMsg.WiFiManagerWrapper", "onReceive, action not match");
                return;
            }
            C79611d dVar = C79614g.f233466g;
            if (dVar == null) {
                Log.m105924i("MicroMsg.WiFiManagerWrapper", "onReceive, getWiFiListCallback is null");
                return;
            }
            ((C91803c.C91805b) dVar).mo125654a(C79614g.m96680a(false));
        }
    }

    /* renamed from: a */
    public static C79613f m96680a(boolean z) {
        List<ScanResult> list;
        String str;
        C79613f fVar = new C79613f();
        String str2 = null;
        f233462c = null;
        if (f233460a && C79743f.m96882b()) {
            if (z) {
                C79743f.m96884d();
            }
            try {
                list = (List) C117292a.m165363i(C79743f.f233719a, "com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/internal/WifiManagerInternalWrapper", "getScanResults", "()Ljava/util/List;", "android/net/wifi/WifiManager", "getScanResults", "()Ljava/util/List;");
            } catch (Throwable th) {
                Log.printErrStackTrace("MicroMsg.WifiManagerInternalWrapper", th, "getScanResults", new Object[0]);
                list = null;
            }
            fVar.f233459b = new ArrayList();
            fVar.f233458a = "ok";
            if (list != null) {
                Log.m105919d("MicroMsg.WiFiManagerWrapper", "[getWifiList] ScanResult:%s, size:%d", list, Integer.valueOf(list.size()));
                WifiInfo a = C79743f.m96881a();
                Log.m105919d("MicroMsg.WiFiManagerWrapper", "[getWifiList] currentWiFiInfo:%s", a);
                if (a == null || TextUtils.isEmpty(a.getSSID())) {
                    str = null;
                } else {
                    str2 = C79744g.m96886b(a.getSSID());
                    str = Util.nullAs(a.getBSSID(), "");
                }
                for (ScanResult scanResult : list) {
                    if (scanResult != null) {
                        String str3 = scanResult.capabilities;
                        char c = str3 == null ? 65535 : str3.contains("WEP") ? 1 : scanResult.capabilities.contains("PSK") ? 2 : scanResult.capabilities.contains("EAP") ? (char) 3 : 0;
                        C79612e eVar = new C79612e();
                        eVar.f233453a = C79744g.m96886b(scanResult.SSID);
                        eVar.f233454b = Util.nullAs(scanResult.BSSID, "");
                        int i = scanResult.level;
                        int i2 = 99;
                        if (i <= -100) {
                            i2 = 0;
                        } else if (i < -55) {
                            i2 = (int) ((((float) (i + 100)) * ((float) 99)) / 45.0f);
                        }
                        eVar.f233455c = Integer.valueOf(i2);
                        eVar.f233456d = Boolean.valueOf(c == 2);
                        eVar.f233457e = Integer.valueOf(scanResult.frequency);
                        if (str2 != null && str != null && eVar.f233453a.compareTo(str2) == 0 && eVar.f233454b.compareTo(str) == 0) {
                            f233462c = eVar;
                        }
                        if (c == 0 || c == 2) {
                            ((ArrayList) fVar.f233459b).add(eVar);
                        }
                    }
                }
                Log.m105924i("MicroMsg.WiFiManagerWrapper", "[getWifiList] mCurrentWiFi: " + f233462c);
            } else {
                Log.m105920e("MicroMsg.WiFiManagerWrapper", "wifiList is null");
            }
        } else if (f233460a) {
            fVar.f233458a = "wifi is disable";
        } else {
            fVar.f233458a = "sdk not init";
        }
        return fVar;
    }

    /* renamed from: b */
    public static void m96681b(Context context) {
        if (!f233460a && context != null) {
            f233464e = MMApplicationContext.getContext();
            Log.m105924i("MicroMsg.WiFiManagerWrapper", "initSdk, register WifiScanResultBroadcastReceiver");
            if (f233465f == null) {
                f233465f = new C79616b((C79615a) null);
            }
            f233464e.registerReceiver(f233465f, new IntentFilter("android.net.wifi.SCAN_RESULTS"));
            WifiManager wifiManager = (WifiManager) f233464e.getSystemService("wifi");
            if (wifiManager != null) {
                C79743f.f233719a = wifiManager;
                f233460a = true;
            }
        }
    }
}
