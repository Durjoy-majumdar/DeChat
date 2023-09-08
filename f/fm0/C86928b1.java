package fm0;

import bu0.C79819c;
import bu0.C79832e;
import com.tencent.p014mm.plugin.appbrand.C81925i2;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83966x;

/* renamed from: fm0.b1 */
public class C86928b1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81925i2 f252343d;

    /* renamed from: e */
    public final /* synthetic */ int f252344e;

    /* renamed from: f */
    public final /* synthetic */ String f252345f;

    /* renamed from: g */
    public final /* synthetic */ String f252346g;

    /* renamed from: h */
    public final /* synthetic */ String f252347h;

    /* renamed from: i */
    public final /* synthetic */ String f252348i;

    /* renamed from: j */
    public final /* synthetic */ C86929c1 f252349j;

    public C86928b1(C86929c1 c1Var, C81925i2 i2Var, int i, String str, String str2, String str3, String str4) {
        this.f252349j = c1Var;
        this.f252343d = i2Var;
        this.f252344e = i;
        this.f252345f = str;
        this.f252346g = str2;
        this.f252347h = str3;
        this.f252348i = str4;
    }

    public void run() {
        C83820i0 currentPage = this.f252343d.getRuntime().mo113042Z().getCurrentPage();
        if (!(currentPage instanceof C83966x)) {
            this.f252343d.mo109647a(this.f252344e, this.f252349j.mo115109j("fail:not TabBar page"));
            return;
        }
        C79819c tabBar = ((C83966x) currentPage).getTabBar();
        String str = this.f252345f;
        String str2 = this.f252346g;
        String str3 = this.f252347h;
        String str4 = this.f252348i;
        tabBar.getClass();
        tabBar.mo110002e(new C79832e(tabBar, str, str2, str3, str4));
        this.f252343d.mo109647a(this.f252344e, this.f252349j.mo115109j("ok"));
    }
}
