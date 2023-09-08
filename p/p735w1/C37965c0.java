package p735w1;

import gy3.C87412m;

/* renamed from: w1.c0 */
public final class C37965c0 extends C37963b0 {

    /* renamed from: a */
    public final String f100436a;

    public C37965c0(String str) {
        C87412m.m108594g(str, "verbatim");
        this.f100436a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37965c0) && C87412m.m108589b(this.f100436a, ((C37965c0) obj).f100436a);
    }

    public int hashCode() {
        return this.f100436a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f100436a + ')';
    }
}
