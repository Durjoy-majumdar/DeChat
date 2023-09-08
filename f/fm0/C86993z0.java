package fm0;

import bu0.C79819c;
import bu0.C79839k;
import bu0.C79840l;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83966x;

/* renamed from: fm0.z0 */
public class C86993z0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f252462d;

    /* renamed from: e */
    public final /* synthetic */ int f252463e;

    /* renamed from: f */
    public final /* synthetic */ String f252464f;

    /* renamed from: g */
    public final /* synthetic */ int f252465g;

    /* renamed from: h */
    public final /* synthetic */ String f252466h;

    /* renamed from: i */
    public final /* synthetic */ String f252467i;

    /* renamed from: j */
    public final /* synthetic */ C86926a1 f252468j;

    /* renamed from: fm0.z0$a */
    public class C86994a extends C79839k {

        /* renamed from: a */
        public final /* synthetic */ C79819c f252469a;

        public C86994a(C79819c cVar) {
            this.f252469a = cVar;
        }

        /* renamed from: a */
        public void mo110023a(String str, C79840l lVar) {
            super.mo110023a(str, lVar);
            C79819c cVar = this.f252469a;
            C86993z0 z0Var = C86993z0.this;
            int i = z0Var.f252465g;
            cVar.mo110006h(i, z0Var.f252466h, (C79840l) cVar.f233946j.get(i).first, (C79840l) null, true);
        }
    }

    /* renamed from: fm0.z0$b */
    public class C86995b extends C79839k {

        /* renamed from: a */
        public final /* synthetic */ C79819c f252471a;

        public C86995b(C79819c cVar) {
            this.f252471a = cVar;
        }

        /* renamed from: a */
        public void mo110023a(String str, C79840l lVar) {
            super.mo110023a(str, lVar);
            C79819c cVar = this.f252471a;
            C86993z0 z0Var = C86993z0.this;
            int i = z0Var.f252465g;
            cVar.mo110006h(i, z0Var.f252466h, (C79840l) null, (C79840l) cVar.f233946j.get(i).second, true);
        }
    }

    public C86993z0(C86926a1 a1Var, C81925i2 i2Var, int i, String str, int i2, String str2, String str3) {
        this.f252468j = a1Var;
        this.f252462d = i2Var;
        this.f252463e = i;
        this.f252464f = str;
        this.f252465g = i2;
        this.f252466h = str2;
        this.f252467i = str3;
    }

    public void run() {
        C83820i0 currentPage = this.f252462d.getRuntime().mo113042Z().getCurrentPage();
        if (!(currentPage instanceof C83966x)) {
            this.f252462d.mo109647a(this.f252463e, this.f252468j.mo115109j("fail:not TabBar page"));
            return;
        }
        C79819c tabBar = ((C83966x) currentPage).getTabBar();
        tabBar.mo110006h(this.f252465g, this.f252466h, tabBar.f233940d.mo110029a(this.f252464f, new C86994a(tabBar), this.f252462d, this.f252465g), tabBar.f233940d.mo110029a(this.f252467i, new C86995b(tabBar), this.f252462d, this.f252465g), false);
        this.f252462d.mo109647a(this.f252463e, this.f252468j.mo115109j("ok"));
    }
}
