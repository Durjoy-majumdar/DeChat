package com.tencent.p014mm.plugin.multitalk.ilinkservice;

import com.tencent.p014mm.plugin.voip.model.C106333b;
import com.tencent.p014mm.plugin.voip.model.C106336d;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import p206nj.C76861g;

/* renamed from: com.tencent.mm.plugin.multitalk.ilinkservice.o */
public final class C105669o {

    /* renamed from: a */
    public final Object f314185a = new Object();

    /* renamed from: b */
    public boolean f314186b;

    /* renamed from: c */
    public C106336d f314187c;

    /* renamed from: d */
    public final C76861g.C47263a f314188d = new C76861g.C47263a();

    /* renamed from: a */
    public final int mo150536a(C106333b bVar, int i, int i2, int i3) {
        if (this.f314187c == null) {
            C106336d dVar = new C106336d();
            this.f314187c = dVar;
            dVar.mo152544c(i, i2, i3, 0);
        }
        C106336d dVar2 = this.f314187c;
        C87412m.m108591d(dVar2);
        dVar2.mo152543b(MMApplicationContext.getContext(), false);
        C106336d dVar3 = this.f314187c;
        C87412m.m108591d(dVar3);
        dVar3.f317212q = bVar;
        C106336d dVar4 = this.f314187c;
        C87412m.m108591d(dVar4);
        return dVar4.mo152545d();
    }
}
