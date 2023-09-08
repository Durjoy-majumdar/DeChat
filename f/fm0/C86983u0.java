package fm0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import org.json.JSONObject;

/* renamed from: fm0.u0 */
public class C86983u0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ JSONObject f252438d;

    /* renamed from: e */
    public final /* synthetic */ C81925i2 f252439e;

    /* renamed from: f */
    public final /* synthetic */ int f252440f;

    /* renamed from: g */
    public final /* synthetic */ C86986v0 f252441g;

    public C86983u0(C86986v0 v0Var, JSONObject jSONObject, C81925i2 i2Var, int i) {
        this.f252441g = v0Var;
        this.f252438d = jSONObject;
        this.f252439e = i2Var;
        this.f252440f = i;
    }

    public void run() {
        String optString = this.f252438d.optString("color", "");
        C83780d1 pageView = this.f252439e.getRuntime().mo113042Z().getPageView();
        if (pageView == null) {
            this.f252439e.mo109647a(this.f252440f, this.f252441g.mo115109j("fail:page don't exist"));
            return;
        }
        if (optString.equals("white") || optString.equals("black")) {
            pageView.mo116201v1(optString);
        }
        this.f252439e.mo109647a(this.f252440f, this.f252441g.mo115109j("ok"));
    }
}
