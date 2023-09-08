package hb2;

import gy3.C87412m;

/* renamed from: hb2.l */
public final class C8506l {

    /* renamed from: a */
    public final String f27537a;

    public C8506l(String str) {
        C87412m.m108594g(str, "songInfoBase64");
        this.f27537a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8506l) && C87412m.m108589b(this.f27537a, ((C8506l) obj).f27537a);
    }

    public int hashCode() {
        return this.f27537a.hashCode();
    }

    public String toString() {
        return "MusicMvRecommendListCacheKey(songInfoBase64=" + this.f27537a + ')';
    }
}
