package com.tencent.p014mm.plugin.appbrand.page;

import java.util.Comparator;
import sq0.C90333e;
import sq0.C90337g;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m0$$h */
public class m0$$h implements Comparator<C90333e> {

    /* renamed from: d */
    public final /* synthetic */ C83849m0 f244787d;

    public m0$$h(C83849m0 m0Var) {
        this.f244787d = m0Var;
    }

    public int compare(Object obj, Object obj2) {
        C90333e eVar = (C90333e) obj;
        C90333e eVar2 = (C90333e) obj2;
        C90337g t = this.f244787d.getCurrentPage().mo116307t(eVar.mo124559a());
        C90337g t2 = this.f244787d.getCurrentPage().mo116307t(eVar2.mo124559a());
        if (t == null) {
            return 1;
        }
        if (t2 == null) {
            return -1;
        }
        return eVar2.priority().f259315a - eVar.priority().f259315a;
    }
}
