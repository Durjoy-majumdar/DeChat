package hp2;

import android.app.Activity;
import com.tencent.p014mm.plugin.sns.p106ui.SnsAdNativeLandingPagesUI;
import com.tencent.p014mm.plugin.sns.p106ui.VideoFullScreenActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import e42.C7594e;
import e42.C7596h;
import gy3.C87412m;
import org.json.JSONObject;
import qs2.C101271i0;

/* renamed from: hp2.b */
public abstract class C87578b<T extends C7594e> extends C87579c<T> {
    /* renamed from: s */
    public void mo121698s(C7596h hVar) {
        SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiCompJsAsyncBase");
        C87412m.m108594g(hVar, "data");
        T t = this.f251227a;
        Activity e0 = t != null ? t.mo8720e0() : null;
        if (e0 == null) {
            Log.m105920e("SnsAdMb.JsApi", "the activity is null, the landing launched?");
            mo122027r(mo120842g(10000, "the activity is null, the landing launched?"));
            SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiCompJsAsyncBase");
            return;
        }
        C101271i0 n8 = e0 instanceof SnsAdNativeLandingPagesUI ? ((SnsAdNativeLandingPagesUI) e0).mo132541n8() : e0 instanceof VideoFullScreenActivity ? ((VideoFullScreenActivity) e0).mo133148T0() : new C101271i0();
        try {
            C87412m.m108593f(n8, "pageData");
            mo121696u(new C87577a(e0, n8), hVar);
        } catch (Exception e) {
            Log.m105920e("SnsAdMb.JsApi", "there is an exception: " + e.getMessage());
            mo122027r(mo120842g(10000, "there is an exception: " + e.getMessage()));
        }
        SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.magicbrush.jsapi.base.MBJsApiCompJsAsyncBase");
    }

    /* renamed from: u */
    public abstract void mo121696u(C87577a aVar, JSONObject jSONObject);
}
