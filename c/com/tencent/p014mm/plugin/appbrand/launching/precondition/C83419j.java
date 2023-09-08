package com.tencent.p014mm.plugin.appbrand.launching.precondition;

import com.tencent.p014mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.p014mm.plugin.appbrand.launching.precondition.C83421k;
import com.tencent.p014mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr;
import com.tencent.p014mm.plugin.appbrand.launching.teenmode.C83472a;
import com.tencent.p014mm.plugin.appbrand.utils.C2039g2;
import fy3.C32227p;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.j */
public class C83419j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandInitConfigWC f243781d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f243782e;

    /* renamed from: f */
    public final /* synthetic */ C83421k.C83422a f243783f;

    /* renamed from: com.tencent.mm.plugin.appbrand.launching.precondition.j$a */
    public class C83420a implements C32227p<String, Boolean, C13598b0> {
        public C83420a() {
        }

        public Object invoke(Object obj, Object obj2) {
            C2039g2.m1988b(new C83418i(this, (String) obj, (Boolean) obj2));
            return null;
        }
    }

    public C83419j(C83421k.C83422a aVar, AppBrandInitConfigWC appBrandInitConfigWC, Runnable runnable) {
        this.f243783f = aVar;
        this.f243781d = appBrandInitConfigWC;
        this.f243782e = runnable;
    }

    public void run() {
        C83472a.m102435d(C83421k.this.f243785d.f243730d);
        AppBrandTeenModeTempAuthMgr.f243916a.mo115755b(C83421k.this.f243787f.getBaseContext(), this.f243781d, new C83420a());
    }
}
