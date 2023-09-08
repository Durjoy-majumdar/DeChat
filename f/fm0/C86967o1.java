package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.page.C83974y0;

/* renamed from: fm0.o1 */
public class C86967o1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f252419d;

    /* renamed from: e */
    public final /* synthetic */ String f252420e;

    /* renamed from: f */
    public final /* synthetic */ int f252421f;

    /* renamed from: g */
    public final /* synthetic */ C86971p1 f252422g;

    public C86967o1(C86971p1 p1Var, C81879g gVar, String str, int i) {
        this.f252422g = p1Var;
        this.f252419d = gVar;
        this.f252420e = str;
        this.f252421f = i;
    }

    public void run() {
        C83849m0 Z = this.f252419d.getRuntime().mo113042Z();
        String str = this.f252420e;
        Z.getClass();
        Z.mo116338c0(new C83974y0(Z, str));
        this.f252419d.mo109647a(this.f252421f, this.f252422g.mo115109j("ok"));
    }
}
