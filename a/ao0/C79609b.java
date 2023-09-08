package ao0;

import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import bo0.C79734d;
import bo0.C79743f;
import bo0.C79744g;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: ao0.b */
public final class C79609b {

    /* renamed from: a */
    public static final C79609b f233451a = new C79609b();

    /* renamed from: b */
    public static volatile boolean f233452b = true;

    /* renamed from: a */
    public final C79612e mo109751a(boolean z) {
        String str;
        C79612e eVar;
        boolean z2 = f233452b;
        Log.m105924i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "get, preventScanWifi: " + z2 + ", acceptIncompleteWiFiItem: " + z);
        if (z2) {
            return mo109752b();
        }
        WifiInfo a = C79743f.m96881a();
        String str2 = "";
        if (a == null || TextUtils.isEmpty(a.getSSID())) {
            str = str2;
        } else {
            String b = C79744g.m96886b(a.getSSID());
            str = Util.nullAs(a.getBSSID(), str2);
            str2 = b;
        }
        C79612e eVar2 = C79614g.f233462c;
        C79612e eVar3 = null;
        if (eVar2 != null && str2.compareTo(eVar2.f233453a) == 0 && str.compareTo(C79614g.f233462c.f233454b) == 0) {
            eVar = C79614g.f233462c;
        } else if (a != null) {
            Log.m105924i("MicroMsg.WiFiManagerWrapper", "getCurrentWiFi, currentWiFiInfo is null, try getWifiList");
            C79614g.m96680a(true);
            eVar = C79614g.f233462c;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            return eVar;
        }
        if (z) {
            eVar3 = mo109752b();
        }
        return eVar3;
    }

    /* renamed from: b */
    public final C79612e mo109752b() {
        WifiInfo a = C79743f.m96881a();
        WifiConfiguration wifiConfiguration = null;
        if (a == null) {
            return null;
        }
        Log.m105924i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "getIncompleteWiFiItem, wifiInfo.ssid: " + a.getSSID() + ", wifiInfo.bssid: " + a.getBSSID());
        C79612e eVar = new C79612e();
        eVar.f233453a = C79744g.m96886b(a.getSSID());
        eVar.f233454b = a.getBSSID();
        f233451a.getClass();
        boolean z = false;
        if (C87412m.m108589b(eVar.f233454b, a.getBSSID())) {
            Log.m105924i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "fillBestEffort, connectionInfo got");
            int rssi = a.getRssi();
            int i = 99;
            if (rssi <= -100) {
                i = 0;
            } else if (rssi < -55) {
                i = (int) ((((float) (rssi - -100)) * ((float) 99)) / 45.0f);
            }
            eVar.f233455c = Integer.valueOf(i);
            eVar.f233457e = Integer.valueOf(a.getFrequency());
        }
        String str = eVar.f233454b;
        List<WifiConfiguration> b = C79734d.m96872b();
        if (b != null) {
            Iterator<WifiConfiguration> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WifiConfiguration next = it.next();
                if (Objects.equals(next.BSSID, str)) {
                    wifiConfiguration = next;
                    break;
                }
            }
        }
        if (wifiConfiguration != null) {
            Log.m105924i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "fillBestEffort, wifiConfig not null");
            if (2 == C79744g.m96885a(wifiConfiguration)) {
                z = true;
            }
            eVar.f233456d = Boolean.valueOf(z);
        }
        Log.m105924i("MicroMsg.AppBrand.GetCurrentWiFiLogic", "fillBestEffort, signalStrength: " + eVar.f233455c + ", frequency: " + eVar.f233457e + ", security: " + eVar.f233456d);
        return eVar;
    }
}
