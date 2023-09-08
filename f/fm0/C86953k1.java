package fm0;

import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83966x;
import org.json.JSONObject;

/* renamed from: fm0.k1 */
public class C86953k1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f252387d;

    /* renamed from: e */
    public final /* synthetic */ int f252388e;

    /* renamed from: f */
    public final /* synthetic */ JSONObject f252389f;

    /* renamed from: g */
    public final /* synthetic */ C86957l1 f252390g;

    public C86953k1(C86957l1 l1Var, C81925i2 i2Var, int i, JSONObject jSONObject) {
        this.f252390g = l1Var;
        this.f252387d = i2Var;
        this.f252388e = i;
        this.f252389f = jSONObject;
    }

    public void run() {
        C83820i0 currentPage = this.f252387d.getRuntime().mo113042Z().getCurrentPage();
        if (!(currentPage instanceof C83966x)) {
            this.f252387d.mo109647a(this.f252388e, this.f252390g.mo115109j("fail:not TabBar page"));
            return;
        }
        ((C83966x) currentPage).getTabBar().mo110007i(this.f252389f.optBoolean("animation", true));
        this.f252387d.mo109647a(this.f252388e, this.f252390g.mo115109j("ok"));
    }
}
