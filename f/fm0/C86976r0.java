package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82644m7;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;

/* renamed from: fm0.r0 */
public class C86976r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f252433d;

    /* renamed from: e */
    public final /* synthetic */ int f252434e;

    /* renamed from: f */
    public final /* synthetic */ String f252435f;

    /* renamed from: g */
    public final /* synthetic */ C86979s0 f252436g;

    public C86976r0(C86979s0 s0Var, C81879g gVar, int i, String str) {
        this.f252436g = s0Var;
        this.f252433d = gVar;
        this.f252434e = i;
        this.f252435f = str;
    }

    public void run() {
        C83780d1 a = C82644m7.m101430a(this.f252433d);
        if (a == null) {
            this.f252433d.mo109647a(this.f252434e, this.f252436g.mo115109j("fail"));
            return;
        }
        a.mo116199u1(this.f252435f);
        this.f252433d.mo109647a(this.f252434e, this.f252436g.mo115109j("ok"));
    }
}
