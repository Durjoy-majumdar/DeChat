package p175j0;

import gy3.C87412m;

/* renamed from: j0.b1 */
public final class C9268b1 {

    /* renamed from: a */
    public final String f29018a;

    public C9268b1(String str) {
        C87412m.m108594g(str, "key");
        this.f29018a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9268b1) && C87412m.m108589b(this.f29018a, ((C9268b1) obj).f29018a);
    }

    public int hashCode() {
        return this.f29018a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f29018a + ')';
    }
}
