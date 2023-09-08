package hb2;

import gy3.C87412m;

/* renamed from: hb2.d */
public final class C8505d {

    /* renamed from: a */
    public final long f27535a;

    /* renamed from: b */
    public final String f27536b;

    public C8505d(long j, String str) {
        C87412m.m108594g(str, "nonceId");
        this.f27535a = j;
        this.f27536b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8505d)) {
            return false;
        }
        C8505d dVar = (C8505d) obj;
        return this.f27535a == dVar.f27535a && C87412m.m108589b(this.f27536b, dVar.f27536b);
    }

    public int hashCode() {
        long j = this.f27535a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.f27536b.hashCode();
    }

    public String toString() {
        return "FinderFeedDetailCacheKey(feedId=" + this.f27535a + ", nonceId=" + this.f27536b + ')';
    }
}
