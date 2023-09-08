package p486d2;

import gy3.C87412m;

/* renamed from: d2.d */
public final class C31047d {

    /* renamed from: a */
    public final C31048f f83288a;

    public C31047d(C31048f fVar) {
        C87412m.m108594g(fVar, "platformLocale");
        this.f83288a = fVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C31047d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C87412m.m108589b(this.f83288a.mo57947a(), ((C31047d) obj).f83288a.mo57947a());
    }

    public int hashCode() {
        return this.f83288a.mo57947a().hashCode();
    }

    public String toString() {
        return this.f83288a.mo57947a();
    }
}
