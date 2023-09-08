package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.page.C83951v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: fm0.o */
public class C86965o implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f252411d;

    /* renamed from: e */
    public final /* synthetic */ int f252412e;

    /* renamed from: f */
    public final /* synthetic */ String f252413f;

    /* renamed from: g */
    public final /* synthetic */ JSONObject f252414g;

    /* renamed from: h */
    public final /* synthetic */ C86968p f252415h;

    public C86965o(C86968p pVar, C81879g gVar, int i, String str, JSONObject jSONObject) {
        this.f252415h = pVar;
        this.f252411d = gVar;
        this.f252412e = i;
        this.f252413f = str;
        this.f252414g = jSONObject;
    }

    public void run() {
        int i = this.f252411d.getRuntime().mo113051d0().f261064g;
        if (this.f252411d.getRuntime().mo113042Z().getPageCount() >= i) {
            Log.m105920e("MicroMsg.JsApiNavigateTo", "page limit exceeded: " + i);
            C81879g gVar = this.f252411d;
            int i2 = this.f252412e;
            C86968p pVar = this.f252415h;
            gVar.mo109647a(i2, pVar.mo115109j("fail:page limit exceeded: " + i));
            return;
        }
        C83849m0 Z = this.f252411d.getRuntime().mo113042Z();
        String str = this.f252413f;
        JSONObject jSONObject = this.f252414g;
        Z.getClass();
        Z.mo116338c0(new C83951v0(Z, str, jSONObject));
        this.f252411d.mo109647a(this.f252412e, this.f252415h.mo115109j("ok"));
    }
}
