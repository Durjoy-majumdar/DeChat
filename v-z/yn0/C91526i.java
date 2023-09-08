package yn0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import gy3.C87412m;
import org.json.JSONObject;

/* renamed from: yn0.i */
public final class C91526i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82870p f262343d;

    /* renamed from: e */
    public final /* synthetic */ C91527j f262344e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f262345f;

    /* renamed from: g */
    public final /* synthetic */ int f262346g;

    public C91526i(C82870p pVar, C91527j jVar, JSONObject jSONObject, int i) {
        this.f262343d = pVar;
        this.f262344e = jVar;
        this.f262345f = jSONObject;
        this.f262346g = i;
    }

    public final void run() {
        C82870p pVar = this.f262343d;
        C87412m.m108592e(pVar, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<com.tencent.mm.plugin.appbrand.jsapi.AppBrandComponent>");
        ((C82268c) pVar).mo1505u(this.f262344e, this.f262345f, this.f262346g);
    }
}
