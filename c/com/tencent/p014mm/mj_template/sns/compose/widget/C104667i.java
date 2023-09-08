package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p004b0.C103953l0;
import p175j0.C108504h;
import p436a1.C103221a0;
import p436a1.C103272w;
import p721v0.C65503j;
import p868x0.C111983i;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.i */
public final class C104667i extends C87413o implements C32228q<C65503j, C108504h, Integer, C65503j> {

    /* renamed from: d */
    public final /* synthetic */ C103272w f310813d;

    /* renamed from: e */
    public final /* synthetic */ float f310814e;

    /* renamed from: f */
    public final /* synthetic */ C103953l0 f310815f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104667i(C103272w wVar, float f, C103953l0 l0Var) {
        super(3);
        this.f310813d = wVar;
        this.f310814e = f;
        this.f310815f = l0Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g((C65503j) obj, "$this$composed");
        hVar.mo51557H(-50404169);
        C103272w wVar = this.f310813d;
        long j = wVar != null ? wVar.f304517a : C103272w.f304510b;
        int i = C65503j.f188489K0;
        C65503j c = C111983i.m152702c(C103221a0.m136602a(C65503j.C65504a.f188490d, C104662e.f310800d), new C104666h(this.f310814e, j, this.f310815f));
        hVar.mo51565P();
        return c;
    }
}
