package tx3;

import gy3.C87412m;

/* renamed from: tx3.c */
public final class C26316c {
    /* renamed from: a */
    public static final <E> E[] m33797a(int i) {
        if (i >= 0) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* renamed from: b */
    public static final <E> void m33798b(E[] eArr, int i, int i2) {
        C87412m.m108594g(eArr, "<this>");
        while (i < i2) {
            eArr[i] = null;
            i++;
        }
    }
}
