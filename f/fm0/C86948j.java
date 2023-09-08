package fm0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83966x;
import org.json.JSONObject;

/* renamed from: fm0.j */
public class C86948j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f252377d;

    /* renamed from: e */
    public final /* synthetic */ int f252378e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f252379f;

    /* renamed from: g */
    public final /* synthetic */ C86951k f252380g;

    public C86948j(C86951k kVar, C81925i2 i2Var, int i, JSONObject jSONObject) {
        this.f252380g = kVar;
        this.f252377d = i2Var;
        this.f252378e = i;
        this.f252379f = jSONObject;
    }

    public void run() {
        C83820i0 currentPage = this.f252377d.getRuntime().mo113042Z().getCurrentPage();
        if (!(currentPage instanceof C83966x)) {
            this.f252377d.mo109647a(this.f252378e, this.f252380g.mo115109j("fail:not TabBar page"));
            return;
        }
        ((C83966x) currentPage).getTabBar().mo110001d(this.f252379f.optBoolean("animation", true));
        this.f252377d.mo109647a(this.f252378e, this.f252380g.mo115109j("ok"));
    }
}
