package com.tencent.p014mm.plugin.emoji.model;

import gy3.C87412m;
import p813fl.C97907h0;

/* renamed from: com.tencent.mm.plugin.emoji.model.f */
public final class C93112f extends C93099a<C93113g> {

    /* renamed from: d */
    public boolean f268247d;

    /* renamed from: e */
    public C93113g f268248e;

    public C93112f(boolean z) {
        this.f268247d = z;
        this.f268248e = new C93113g(z);
    }

    /* renamed from: a */
    public C97907h0 mo127611a() {
        return new C93113g(this.f268247d);
    }

    /* renamed from: b */
    public C97907h0 mo127612b() {
        return this.f268248e;
    }

    /* renamed from: d */
    public void mo127613d(C97907h0 h0Var) {
        C93113g gVar = (C93113g) h0Var;
        C87412m.m108594g(gVar, "<set-?>");
        this.f268248e = gVar;
    }

    /* renamed from: f */
    public void mo127602f(boolean z) {
        this.f268247d = z;
    }
}
