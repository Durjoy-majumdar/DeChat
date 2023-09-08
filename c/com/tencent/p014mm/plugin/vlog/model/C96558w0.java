package com.tencent.p014mm.plugin.vlog.model;

import com.tencent.p014mm.xeffect.effect.VLogEffectJNI;
import d23.C106976a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import rr3.C110636m;
import xp3.C112168e;

/* renamed from: com.tencent.mm.plugin.vlog.model.w0 */
public final class C96558w0 implements C112168e {

    /* renamed from: a */
    public final C96552p0 f282619a;

    /* renamed from: b */
    public final HashMap<String, Integer> f282620b;

    /* renamed from: c */
    public final C110636m f282621c;

    public C96558w0(C96552p0 p0Var, HashMap<String, Integer> hashMap, C110636m mVar) {
        C87412m.m108594g(p0Var, "composition");
        C87412m.m108594g(hashMap, "labelMap");
        this.f282619a = p0Var;
        this.f282620b = hashMap;
        this.f282621c = mVar;
    }

    /* renamed from: a */
    public void mo134637a(long j) {
        C110636m mVar;
        C106205q0 c = C96551o.m123873c(this.f282619a, j);
        Integer num = this.f282620b.get(c != null ? c.f316490a : null);
        int intValue = num != null ? num.intValue() : -1;
        if (((ArrayList) C106976a.f320220m).contains(Integer.valueOf(intValue)) && (mVar = this.f282621c) != null) {
            VLogEffectJNI.INSTANCE.setScene$renderlib_release(mVar.f330969c, intValue);
        }
    }

    /* renamed from: d */
    public void mo134638d() {
    }
}
