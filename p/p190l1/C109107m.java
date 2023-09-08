package p190l1;

import gy3.C87412m;
import p1166z0.C112539e;
import p1166z0.C112545k;
import p560i2.C33181m;

/* renamed from: l1.m */
public final class C109107m {
    /* renamed from: a */
    public static final boolean m148148a(C109111s sVar) {
        C87412m.m108594g(sVar, "<this>");
        return !sVar.f326723g && sVar.f326720d;
    }

    /* renamed from: b */
    public static final boolean m148149b(C109111s sVar) {
        C87412m.m108594g(sVar, "<this>");
        return sVar.f326723g && !sVar.f326720d;
    }

    /* renamed from: c */
    public static final boolean m148150c(C109111s sVar, long j) {
        C87412m.m108594g(sVar, "$this$isOutOfBounds");
        long j2 = sVar.f326719c;
        float c = C112539e.m153738c(j2);
        float d = C112539e.m153739d(j2);
        return c < 0.0f || c > ((float) ((int) (j >> 32))) || d < 0.0f || d > ((float) C33181m.m39966b(j));
    }

    /* renamed from: d */
    public static final boolean m148151d(C109111s sVar, long j, long j2) {
        C87412m.m108594g(sVar, "$this$isOutOfBounds");
        if (!(sVar.f326724h == 1)) {
            return m148150c(sVar, j);
        }
        long j3 = sVar.f326719c;
        float c = C112539e.m153738c(j3);
        float d = C112539e.m153739d(j3);
        return c < (-C112545k.m153758d(j2)) || c > ((float) ((int) (j >> 32))) + C112545k.m153758d(j2) || d < (-C112545k.m153756b(j2)) || d > ((float) C33181m.m39966b(j)) + C112545k.m153756b(j2);
    }

    /* renamed from: e */
    public static final long m148152e(C109111s sVar, boolean z) {
        long f = C112539e.m153741f(sVar.f326719c, sVar.f326722f);
        if (z || !sVar.mo160355b()) {
            return f;
        }
        int i = C112539e.f336958e;
        return C112539e.f336955b;
    }
}
