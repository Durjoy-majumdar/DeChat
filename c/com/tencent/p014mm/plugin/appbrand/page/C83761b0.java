package com.tencent.p014mm.plugin.appbrand.page;

/* renamed from: com.tencent.mm.plugin.appbrand.page.b0 */
public class C83761b0 extends x$$i {

    /* renamed from: f */
    public final /* synthetic */ long f244494f;

    /* renamed from: g */
    public final /* synthetic */ String f244495g;

    /* renamed from: h */
    public final /* synthetic */ Runnable f244496h;

    /* renamed from: i */
    public final /* synthetic */ C83966x f244497i;

    public C83761b0(C83966x xVar, long j, String str, Runnable runnable) {
        this.f244497i = xVar;
        this.f244494f = j;
        this.f244495g = str;
        this.f244496h = runnable;
    }

    /* renamed from: a */
    public void mo116098a() {
        this.f244497i.mo116591O(this.f244494f, this.f244495g);
        Runnable runnable = this.f244496h;
        if (runnable != null) {
            runnable.run();
        }
    }
}
