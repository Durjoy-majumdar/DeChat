package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import com.tencent.p014mm.plugin.appbrand.page.C83958w0;

/* renamed from: fm0.x */
public class C86988x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f252445d;

    /* renamed from: e */
    public final /* synthetic */ String f252446e;

    /* renamed from: f */
    public final /* synthetic */ int f252447f;

    /* renamed from: g */
    public final /* synthetic */ C86990y f252448g;

    public C86988x(C86990y yVar, C81879g gVar, String str, int i) {
        this.f252448g = yVar;
        this.f252445d = gVar;
        this.f252446e = str;
        this.f252447f = i;
    }

    public void run() {
        C83849m0 Z = this.f252445d.getRuntime().mo113042Z();
        String str = this.f252446e;
        Z.getClass();
        Z.mo116338c0(new C83958w0(Z, str, false));
        this.f252445d.mo109647a(this.f252447f, this.f252448g.mo115109j("ok"));
    }
}
