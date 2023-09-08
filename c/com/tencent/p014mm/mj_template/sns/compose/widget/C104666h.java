package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p004b0.C103953l0;
import p1166z0.C112540f;
import p1166z0.C112545k;
import p1166z0.C112546l;
import p175j0.C108491a0;
import p175j0.C108500f2;
import p175j0.C60667k2;
import p436a1.C103257q;
import p436a1.C103272w;
import p436a1.C103274x;
import p835c1.C104231f;
import p835c1.C104233g;
import p835c1.C54601d;
import rx3.C13598b0;
import sx3.C64197v;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.h */
public final class C104666h extends C87413o implements C32226l<C54601d, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ float f310810d;

    /* renamed from: e */
    public final /* synthetic */ long f310811e;

    /* renamed from: f */
    public final /* synthetic */ C103953l0 f310812f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104666h(float f, long j, C103953l0 l0Var) {
        super(1);
        this.f310810d = f;
        this.f310811e = j;
        this.f310812f = l0Var;
    }

    public Object invoke(Object obj) {
        C54601d dVar = (C54601d) obj;
        C87412m.m108594g(dVar, "$this$drawWithContent");
        float T = dVar.mo143034T(this.f310810d);
        C60667k2 a = C108500f2.m146994a(new C55296g(this.f310812f, T));
        C60667k2 a2 = C108500f2.m146994a(new C55294f(this.f310812f, T));
        dVar.mo75508h0();
        C103257q.C103258a aVar = C103257q.f304461a;
        long j = C103272w.f304514f;
        C108491a0 a0Var = (C108491a0) a;
        C103257q.C103258a aVar2 = aVar;
        C104231f.C104232a.m139086e(dVar, C103257q.C103258a.m136720a(aVar2, C64197v.m75537f(new C103272w(this.f310811e), new C103272w(j)), 0.0f, ((Number) a0Var.getValue()).floatValue(), 0, 8, (Object) null), 0, C112546l.m153761a(C112545k.m153758d(dVar.mo145819e()), ((Number) a0Var.getValue()).floatValue()), 0.0f, (C104233g) null, (C103274x) null, 0, 122, (Object) null);
        C108491a0 a0Var2 = (C108491a0) a2;
        C103257q.C103258a aVar3 = aVar;
        C54601d dVar2 = dVar;
        C104231f.C104232a.m139086e(dVar2, C103257q.C103258a.m136720a(aVar3, C64197v.m75537f(new C103272w(j), new C103272w(this.f310811e)), C112545k.m153756b(dVar.mo145819e()) - ((Number) a0Var2.getValue()).floatValue(), C112545k.m153756b(dVar.mo145819e()), 0, 8, (Object) null), C112540f.m153745a(0.0f, C112545k.m153756b(dVar.mo145819e()) - ((Number) a0Var2.getValue()).floatValue()), 0, 0.0f, (C104233g) null, (C103274x) null, 0, 124, (Object) null);
        return C13598b0.f38549a;
    }
}
