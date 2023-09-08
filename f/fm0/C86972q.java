package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82644m7;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import org.json.JSONObject;

/* renamed from: fm0.q */
public class C86972q implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f252428d;

    /* renamed from: e */
    public final /* synthetic */ int f252429e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f252430f;

    /* renamed from: g */
    public final /* synthetic */ C86975r f252431g;

    public C86972q(C86975r rVar, C81879g gVar, int i, JSONObject jSONObject) {
        this.f252431g = rVar;
        this.f252428d = gVar;
        this.f252429e = i;
        this.f252430f = jSONObject;
    }

    public void run() {
        C83780d1 a = C82644m7.m101430a(this.f252428d);
        if (a == null) {
            this.f252428d.mo109647a(this.f252429e, this.f252431g.mo115109j("fail:page don't exist"));
            return;
        }
        Extension E0 = a.mo116150E0(this.f252431g.f252432g);
        if (E0 != null) {
            this.f252431g.mo121371w(this.f252428d, this.f252430f, this.f252429e, E0);
        } else if (!a.isRunning()) {
            this.f252428d.mo109647a(this.f252429e, this.f252431g.mo115109j("fail:interrupted"));
        } else if (!a.f241593r) {
            this.f252428d.mo109647a(this.f252429e, this.f252431g.mo115109j("fail:not supported"));
        } else {
            throw new IllegalAccessError(String.format("%s Not Found", new Object[]{this.f252431g.f252432g.getName()}));
        }
    }
}
