package gp2;

import android.app.Activity;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95198o2;
import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C7594e;
import e42.C7596h;
import gy3.C87412m;
import hp2.C87580d;

/* renamed from: gp2.f */
public final class C87292f<T extends C7594e> extends C87580d<T> {
    /* renamed from: e */
    public String mo16e() {
        SnsMethodCalculate.markStartTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
        SnsMethodCalculate.markEndTimeMs("getName", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
        return "getScreenSizeSync";
    }

    /* renamed from: p */
    public C7596h mo121697p(C7596h hVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
        C87412m.m108594g(hVar, "data");
        T t = this.f251227a;
        Activity e0 = t != null ? t.mo8720e0() : null;
        if (e0 == null) {
            Log.m105920e("SnsAdMb.JsApi", "activity is null");
            C7596h g = mo120842g(10000, "activity is null");
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
            return g;
        }
        C7596h hVar2 = new C7596h();
        int[] b = C95198o2.m121130b(e0);
        hVar2.put("screenWidth", b[0]);
        hVar2.put("screenHeight", b[1]);
        if (C85875k4.m106205t(e0, false)) {
            hVar2.put("cutout", C85875k4.m106198o(e0));
        } else {
            hVar2.put("cutout", 0);
        }
        hVar2.put("navigationBar", C85875k4.m106188j(e0));
        mo120845j(hVar2);
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.MBJsApiGetScreenSizeSync");
        return hVar2;
    }
}
