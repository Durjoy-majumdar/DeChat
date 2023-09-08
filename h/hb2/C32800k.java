package hb2;

import gy3.C87412m;
import te3.C48799b23;

/* renamed from: hb2.k */
public final class C32800k {

    /* renamed from: a */
    public final C48799b23 f89231a;

    /* renamed from: b */
    public final long f89232b;

    public C32800k(C48799b23 b232, long j) {
        C87412m.m108594g(b232, "response");
        this.f89231a = b232;
        this.f89232b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32800k)) {
            return false;
        }
        C32800k kVar = (C32800k) obj;
        return C87412m.m108589b(this.f89231a, kVar.f89231a) && this.f89232b == kVar.f89232b;
    }

    public int hashCode() {
        long j = this.f89232b;
        return (this.f89231a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MusicMvRecommendListCache(response=" + this.f89231a + ", timestamp=" + this.f89232b + ')';
    }
}
