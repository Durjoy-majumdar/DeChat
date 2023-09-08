package fm0;

import com.tencent.p014mm.plugin.appbrand.C81879g;

/* renamed from: fm0.b0 */
public final class C8131b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81879g f26992d;

    /* renamed from: e */
    public final /* synthetic */ int f26993e;

    /* renamed from: f */
    public final /* synthetic */ String f26994f;

    /* renamed from: g */
    public final /* synthetic */ int f26995g;

    /* renamed from: h */
    public final /* synthetic */ C8133c0 f26996h;

    public C8131b0(C81879g gVar, int i, String str, int i2, C8133c0 c0Var) {
        this.f26992d = gVar;
        this.f26993e = i;
        this.f26994f = str;
        this.f26995g = i2;
        this.f26996h = c0Var;
    }

    public final void run() {
        try {
            this.f26992d.mo109647a(this.f26995g, this.f26996h.mo115109j(this.f26992d.getRuntime().mo113042Z().mo116337b0(this.f26993e, this.f26994f) ? "ok" : "fail"));
        } catch (UnsupportedOperationException unused) {
            this.f26992d.mo109647a(this.f26995g, this.f26996h.mo115109j("fail:not supported"));
        }
    }
}
