package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.headless.C81915k;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82644m7;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.appbrand.report.quality.C84185b;
import com.tencent.p014mm.plugin.appbrand.report.quality.QualitySessionRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kr0.C88267e;
import org.json.JSONObject;
import zt3.C119157j;

/* renamed from: fm0.v */
public final class C86984v extends C86954l {

    /* renamed from: fm0.v$a */
    public static final class C86985a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C81879g f252442d;

        /* renamed from: e */
        public final /* synthetic */ boolean f252443e;

        public C86985a(C81879g gVar, boolean z) {
            this.f252442d = gVar;
            this.f252443e = z;
        }

        public final void run() {
            QualitySessionRuntime c;
            C83780d1 a = C82644m7.m101430a(this.f252442d);
            if (a != null) {
                Log.m105924i("MicroMsg.AppBrand.JsApiPageInitReadyWC", "invoke renderingCacheAccepted[" + this.f252443e + "] appId[" + this.f252442d.getAppId() + "] url[" + a.mo116162Q0() + ']');
                if ((a instanceof C83928t1) && this.f252443e && (c = C84185b.m103770c(((C83928t1) a).getAppId(), true)) != null) {
                    synchronized (c) {
                        if (c.f245853N == null) {
                            c.f245853N = Boolean.TRUE;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: v */
    public String mo1731t(C81879g gVar, JSONObject jSONObject) {
        C87412m.m108594g(gVar, "env");
        try {
            if (gVar instanceof C83928t1) {
                if (((C83928t1) gVar).mo116168W0()) {
                    C81634a.C81639e L0 = ((C83928t1) gVar).mo116157L0();
                    if (C87412m.m108589b("manual", L0 != null ? L0.f239627t : null) && jSONObject != null) {
                        jSONObject.put("ignoreWebviewPreload", true);
                    }
                }
            }
            if ((gVar instanceof C88267e) && (((C88267e) gVar).mo114341l0() instanceof C81915k) && jSONObject != null) {
                jSONObject.put("ignoreWebviewPreload", true);
            }
        } catch (Exception unused) {
        }
        String v = super.mo1731t(gVar, jSONObject);
        boolean z = false;
        if (jSONObject != null) {
            z = jSONObject.optBoolean("renderingCacheAccepted", false);
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C86985a(gVar, z));
        C87412m.m108593f(v, "super.invoke(env, data).…}\n            }\n        }");
        return v;
    }
}
