package com.tencent.mapsdk.internal;

/* renamed from: com.tencent.mapsdk.internal.hp */
public final class C113817hp implements C24236ix<C113732fo> {
    /* renamed from: a */
    public final /* synthetic */ Object mo41013a(float f, Object obj, Object obj2) {
        C113732fo foVar = (C113732fo) obj;
        C113732fo foVar2 = (C113732fo) obj2;
        double d = foVar.f340215a;
        double d2 = (double) f;
        double d3 = foVar.f340216b;
        return new C113732fo(d + ((foVar2.f340215a - d) * d2), d3 + (d2 * (foVar2.f340216b - d3)));
    }

    /* renamed from: a */
    private static C113732fo m157188a(float f, C113732fo foVar, C113732fo foVar2) {
        double d = foVar.f340215a;
        double d2 = (double) f;
        double d3 = foVar.f340216b;
        return new C113732fo(d + ((foVar2.f340215a - d) * d2), d3 + (d2 * (foVar2.f340216b - d3)));
    }
}
