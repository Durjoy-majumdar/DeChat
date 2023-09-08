package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import org.json.JSONObject;

/* renamed from: fm0.m */
public class C86958m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f252394d;

    /* renamed from: e */
    public final /* synthetic */ int f252395e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f252396f;

    /* renamed from: g */
    public final /* synthetic */ JSONObject f252397g;

    /* renamed from: h */
    public final /* synthetic */ C86963n f252398h;

    public C86958m(C86963n nVar, C81879g gVar, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f252398h = nVar;
        this.f252394d = gVar;
        this.f252395e = i;
        this.f252396f = jSONObject;
        this.f252397g = jSONObject2;
    }

    public void run() {
        C83849m0 Z = this.f252394d.getRuntime().mo113042Z();
        if (Z.getRenderPagesCount() <= 1) {
            this.f252394d.mo109647a(this.f252395e, this.f252398h.mo115109j("fail cannot navigate back at first page"));
        } else {
            Z.mo116378x(this.f252396f.optInt("delta", 1), "scene_jsapi_navigate_back", this.f252397g, new m$$a(this, this.f252394d, this.f252395e));
        }
    }
}
