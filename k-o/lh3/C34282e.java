package lh3;

import gy3.C87412m;
import java.util.List;

/* renamed from: lh3.e */
public final class C34282e<T> {

    /* renamed from: a */
    public final List<T> f92400a;

    /* renamed from: b */
    public final boolean f92401b;

    /* renamed from: c */
    public final long f92402c;

    /* renamed from: d */
    public final long f92403d;

    public C34282e(List<? extends T> list, boolean z, long j, long j2) {
        C87412m.m108594g(list, "data");
        this.f92400a = list;
        this.f92401b = z;
        this.f92402c = j;
        this.f92403d = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34282e)) {
            return false;
        }
        C34282e eVar = (C34282e) obj;
        return C87412m.m108589b(this.f92400a, eVar.f92400a) && this.f92401b == eVar.f92401b && this.f92402c == eVar.f92402c && this.f92403d == eVar.f92403d;
    }

    public int hashCode() {
        int hashCode = this.f92400a.hashCode() * 31;
        boolean z = this.f92401b;
        if (z) {
            z = true;
        }
        long j = this.f92402c;
        long j2 = this.f92403d;
        return ((((hashCode + (z ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "PageDataWrapper(data=" + this.f92400a + ", hasMore=" + this.f92401b + ", minFeedId=" + this.f92402c + ", maxFeedId=" + this.f92403d + ')';
    }
}
