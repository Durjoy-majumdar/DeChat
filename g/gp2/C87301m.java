package gp2;

import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C7594e;
import e42.C7596h;
import gy3.C87412m;
import hp2.C87579c;
import ke3.C88144b;

/* renamed from: gp2.m */
public final class C87301m<T extends C7594e> extends C87579c<T> {
    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenLocationPage");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenLocationPage");
        return "openLocationPage";
    }

    /* renamed from: s */
    public void mo121698s(C7596h hVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenLocationPage");
        C87412m.m108594g(hVar, "data");
        try {
            double optDouble = hVar.optDouble("slat");
            double optDouble2 = hVar.optDouble("slong");
            int optInt = hVar.optInt("scale");
            String optString = hVar.optString("poiname");
            String optString2 = hVar.optString(FirebaseAnalytics.C113379b.LOCATION);
            Intent intent = new Intent();
            intent.putExtra("map_view_type", 1);
            intent.putExtra("kwebmap_slat", optDouble);
            intent.putExtra("kwebmap_lng", optDouble2);
            intent.putExtra("kwebmap_scale", optInt);
            intent.putExtra("kPoiName", optString);
            intent.putExtra("Kwebmap_locaion", optString2);
            T t = this.f251227a;
            C88144b.m109795m(t != null ? t.mo8720e0() : null, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, 2002);
            mo122027r(mo120844i());
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenLocationPage");
        } catch (Exception unused) {
            Log.m105928w("SnsAdMb.JsApi", "open location view page failed");
            mo122027r(mo120842g(10000, "open location view page failed"));
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiOpenLocationPage");
        }
    }
}
