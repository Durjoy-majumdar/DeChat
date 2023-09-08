package hb2;

import gy3.C87412m;

/* renamed from: hb2.n */
public final class C8507n {

    /* renamed from: a */
    public final String f27538a;

    public C8507n(String str) {
        C87412m.m108594g(str, "key");
        this.f27538a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8507n) && C87412m.m108589b(this.f27538a, ((C8507n) obj).f27538a);
    }

    public int hashCode() {
        return this.f27538a.hashCode();
    }

    public String toString() {
        return "MusicTingLyricCacheKey(key=" + this.f27538a + ')';
    }
}
