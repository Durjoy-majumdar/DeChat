package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;

/* renamed from: com.tencent.mm.plugin.appbrand.page.z3$$c */
public class z3$$c extends C83857n2 {

    /* renamed from: d */
    public final /* synthetic */ C83984z3 f245186d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z3$$c(C83984z3 z3Var, C83780d1 d1Var) {
        super(d1Var);
        this.f245186d = z3Var;
    }

    /* renamed from: c */
    public void mo116417c(String str) {
        if (!this.f245186d.f245175h) {
            Log.m105925i("Luggage.MPWebViewRenderEngineLegacyImpl", "[perf] PageFrame[%s] ready cost %dms", str, Long.valueOf(Util.currentTicks() - this.f245186d.f245182r));
        }
        C2039g2.m1988b(new z3$$c$$a(this));
    }
}
