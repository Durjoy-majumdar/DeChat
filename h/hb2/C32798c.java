package hb2;

import gy3.C87412m;
import te3.C50008jm0;

/* renamed from: hb2.c */
public final class C32798c {

    /* renamed from: a */
    public final C50008jm0 f89224a;

    /* renamed from: b */
    public final long f89225b;

    public C32798c(C50008jm0 jm02, long j) {
        C87412m.m108594g(jm02, "response");
        this.f89224a = jm02;
        this.f89225b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32798c)) {
            return false;
        }
        C32798c cVar = (C32798c) obj;
        return C87412m.m108589b(this.f89224a, cVar.f89224a) && this.f89225b == cVar.f89225b;
    }

    public int hashCode() {
        long j = this.f89225b;
        return (this.f89224a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "FinderFeedDetailCache(response=" + this.f89224a + ", timestamp=" + this.f89225b + ')';
    }
}
