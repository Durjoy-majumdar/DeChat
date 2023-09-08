package com.tencent.p014mm.plugin.appbrand.page;

import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.page.w0 */
public class C83958w0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f245105d;

    /* renamed from: e */
    public final /* synthetic */ boolean f245106e;

    /* renamed from: f */
    public final /* synthetic */ C83849m0 f245107f;

    public C83958w0(C83849m0 m0Var, String str, boolean z) {
        this.f245107f = m0Var;
        this.f245105d = str;
        this.f245106e = z;
    }

    public void run() {
        this.f245107f.mo116380z(this.f245105d, this.f245106e ? C83817h4.AUTO_RE_LAUNCH : C83817h4.RE_LAUNCH, (JSONObject) null);
    }
}
