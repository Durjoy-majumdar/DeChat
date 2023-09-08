package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82644m7;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;

/* renamed from: fm0.h */
public class C86942h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f252365d;

    /* renamed from: e */
    public final /* synthetic */ int f252366e;

    /* renamed from: f */
    public final /* synthetic */ C86945i f252367f;

    public C86942h(C86945i iVar, C81879g gVar, int i) {
        this.f252367f = iVar;
        this.f252365d = gVar;
        this.f252366e = i;
    }

    public void run() {
        C83780d1 a = C82644m7.m101430a(this.f252365d);
        if (a == null) {
            this.f252365d.mo109647a(this.f252366e, this.f252367f.mo115109j("fail:page don't exist"));
            return;
        }
        a.mo116197t1(false);
        this.f252365d.mo109647a(this.f252366e, this.f252367f.mo115109j("ok"));
    }
}
