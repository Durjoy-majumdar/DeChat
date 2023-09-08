package tm0;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82016a0;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;
import ks0.C21379a;
import ks0.C21380b;
import ks0.C21383c;
import org.json.JSONObject;

/* renamed from: tm0.i */
public class C22544i extends C82016a0 {
    public static final int CTRL_INDEX = 425;
    public static final String NAME = "getBatteryInfo";

    /* renamed from: t */
    public String mo1731t(C82381f fVar, JSONObject jSONObject) {
        C21383c cVar;
        C21380b bVar = (C21380b) C21379a.INST.f60482d;
        synchronized (bVar) {
            Context context = bVar.f60484d;
            if (context == null) {
                Log.m105920e("MicroMsg.AppBrandBatteryManagerImplBelow21", "getBatteryInfo no context");
                cVar = C21379a.f60480g;
            } else {
                Intent intent = bVar.f60487g;
                if (intent == null) {
                    bVar.f60489i = new C21380b.C21382b((C21380b.C21381a) null);
                    intent = context.getApplicationContext().registerReceiver(bVar.f60489i, bVar.f60485e);
                    bVar.f60487g = intent;
                }
                if (intent == null) {
                    Log.m105920e("MicroMsg.AppBrandBatteryManagerImplBelow21", "getBatteryInfo no intent got");
                    cVar = C21379a.f60480g;
                } else {
                    cVar = bVar.f60486f.mo33479a(intent);
                }
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(FirebaseAnalytics.C113379b.LEVEL, Integer.valueOf(cVar.f60492b));
        hashMap.put("isCharging", Boolean.valueOf(cVar.f60491a));
        return mo115112m("ok", hashMap);
    }
}
