package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82644m7;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;

/* renamed from: fm0.i1 */
public class C86947i1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f252374d;

    /* renamed from: e */
    public final /* synthetic */ int f252375e;

    /* renamed from: f */
    public final /* synthetic */ C86950j1 f252376f;

    public C86947i1(C86950j1 j1Var, C81879g gVar, int i) {
        this.f252376f = j1Var;
        this.f252374d = gVar;
        this.f252375e = i;
    }

    public void run() {
        C83780d1 a = C82644m7.m101430a(this.f252374d);
        if (a == null) {
            this.f252374d.mo109647a(this.f252375e, this.f252376f.mo115109j("fail:page don't exist"));
            return;
        }
        a.mo116197t1(true);
        this.f252374d.mo109647a(this.f252375e, this.f252376f.mo115109j("ok"));
    }
}
