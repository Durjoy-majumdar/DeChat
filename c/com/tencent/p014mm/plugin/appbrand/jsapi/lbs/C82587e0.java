package com.tencent.p014mm.plugin.appbrand.jsapi.lbs;

import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.Log;
import js0.C88024r;
import li0.C88509c;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.lbs.e0 */
public class C82587e0 extends C82581d0 {

    /* renamed from: s */
    public C82572a0 f241711s;

    /* renamed from: t */
    public C88509c.C88512b f241712t;

    public C82587e0(C82381f fVar) {
        super(fVar);
    }

    /* renamed from: e */
    public void mo114900e(AppBrandRuntime appBrandRuntime) {
        C82572a0 a0Var = this.f241711s;
        if (a0Var != null) {
            Log.m105924i("MicroMsg.LbsBlinkHelper", "stopBlinkSubTitleImmediately");
            C88024r.m109572b(new C82577b0(a0Var));
        }
        if (!(appBrandRuntime == null || this.f241712t == null)) {
            appBrandRuntime.f238113K.mo122982e(this.f241712t);
        }
        this.f241711s = null;
        this.f241712t = null;
        this.f241703o = null;
    }
}
