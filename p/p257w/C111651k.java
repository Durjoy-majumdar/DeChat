package p257w;

import gy3.C87412m;

/* renamed from: w.k */
public final class C111651k {
    /* renamed from: a */
    public static C111647j m152177a(float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        float f3 = (i & 2) != 0 ? 0.0f : f2;
        long j3 = Long.MIN_VALUE;
        long j4 = (i & 4) != 0 ? Long.MIN_VALUE : j;
        if ((i & 8) == 0) {
            j3 = j2;
        }
        return new C111647j(C111656m1.f334256a, Float.valueOf(f), new C37907l(f3), j4, j3, (i & 16) != 0 ? false : z);
    }

    /* renamed from: b */
    public static C111647j m152178b(C111647j jVar, float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        C111647j jVar2 = jVar;
        float floatValue = (i & 1) != 0 ? ((Number) jVar.getValue()).floatValue() : f;
        float f3 = (i & 2) != 0 ? ((C37907l) jVar2.f334236f).f100321a : f2;
        long j3 = (i & 4) != 0 ? jVar2.f334237g : j;
        long j4 = (i & 8) != 0 ? jVar2.f334238h : j2;
        boolean z2 = (i & 16) != 0 ? jVar2.f334239i : z;
        C87412m.m108594g(jVar, "<this>");
        return new C111647j(jVar2.f334234d, Float.valueOf(floatValue), new C37907l(f3), j3, j4, z2);
    }

    /* renamed from: c */
    public static final <T, V extends C37919o> V m152179c(C37906k1<T, V> k1Var, T t) {
        C87412m.m108594g(k1Var, "<this>");
        C37919o oVar = (C37919o) k1Var.mo61399a().invoke(t);
        C87412m.m108594g(oVar, "<this>");
        return oVar.mo61403c();
    }
}
