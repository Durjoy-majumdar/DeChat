package p009c2;

import gy3.C87412m;
import p735w1.C37958a;
import p735w1.C38006x;

/* renamed from: c2.a0 */
public final class C28480a0 {
    /* renamed from: a */
    public static final C37958a m38219a(C28482z zVar) {
        C87412m.m108594g(zVar, "<this>");
        C37958a aVar = zVar.f78285a;
        long j = zVar.f78286b;
        aVar.getClass();
        return aVar.subSequence(C38006x.m41698f(j), C38006x.m41697e(j));
    }

    /* renamed from: b */
    public static final C37958a m38220b(C28482z zVar, int i) {
        C87412m.m108594g(zVar, "<this>");
        return zVar.f78285a.subSequence(C38006x.m41697e(zVar.f78286b), Math.min(C38006x.m41697e(zVar.f78286b) + i, zVar.f78285a.f100413d.length()));
    }

    /* renamed from: c */
    public static final C37958a m38221c(C28482z zVar, int i) {
        C87412m.m108594g(zVar, "<this>");
        return zVar.f78285a.subSequence(Math.max(0, C38006x.m41698f(zVar.f78286b) - i), C38006x.m41698f(zVar.f78286b));
    }
}
