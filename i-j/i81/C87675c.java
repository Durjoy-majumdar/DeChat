package i81;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import i81.C87679g;
import j20.C117293c;
import p269xe.C91177a;

/* renamed from: i81.c */
public final class C87675c implements C117293c {
    /* renamed from: a */
    public Object mo109570a(String str, String str2, String str3, String str4, String str5, Object obj, Object[] objArr) {
        C87679g.C87680a aVar;
        String str6 = str;
        String str7 = str2;
        String str8 = str4;
        Object obj2 = obj;
        Log.m105918d("MicroMsg.SensitiveApiCallPatch", "hook call " + str8 + " from " + str6 + '#' + str7);
        Context applicationContext = MMApplicationContext.getContext().getApplicationContext();
        C87679g.C87680a aVar2 = C87679g.f253958a;
        C87412m.m108593f(applicationContext, "gContext");
        if (C87679g.C87680a.m109073a(aVar2, applicationContext)) {
            aVar = aVar2;
            C91177a.m114419c("wifi", str, str2, str3, str4, str5, obj, objArr);
        } else {
            aVar = aVar2;
        }
        C87412m.m108592e(obj2, "null cannot be cast to non-null type android.net.wifi.WifiManager");
        WifiManager wifiManager = (WifiManager) obj2;
        if (str8 == null) {
            return null;
        }
        switch (str4.hashCode()) {
            case -2129330689:
                if (!str8.equals("startScan")) {
                    return null;
                }
                if (C87679g.C87680a.m109073a(aVar, applicationContext)) {
                    return Boolean.valueOf(wifiManager.startScan());
                }
                Log.m105920e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str8 + " from " + str6 + '#' + str7);
                return null;
            case -1437827709:
                if (!str8.equals("getScanResults")) {
                    return null;
                }
                if (C87679g.C87680a.m109073a(aVar, applicationContext)) {
                    return wifiManager.getScanResults();
                }
                Log.m105920e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str8 + " from " + str6 + '#' + str7);
                return null;
            case -703033767:
                if (!str8.equals("getConfiguredNetworks")) {
                    return null;
                }
                if (C87679g.C87680a.m109073a(aVar, applicationContext)) {
                    return wifiManager.getConfiguredNetworks();
                }
                Log.m105920e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str8 + " from " + str6 + '#' + str7);
                return null;
            case 977831330:
                if (!str8.equals("getConnectionInfo")) {
                    return null;
                }
                if (C87679g.C87680a.m109073a(aVar, applicationContext)) {
                    return wifiManager.getConnectionInfo();
                }
                Log.m105920e("MicroMsg.SensitiveApiCallPatch", "no permission granted call " + str8 + " from " + str6 + '#' + str7);
                return null;
            default:
                return null;
        }
    }
}
