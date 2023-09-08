package hb2;

import gy3.C87412m;

/* renamed from: hb2.m */
public final class C32801m {

    /* renamed from: a */
    public final String f89233a;

    /* renamed from: b */
    public final long f89234b;

    public C32801m(String str, long j) {
        C87412m.m108594g(str, "lyric");
        this.f89233a = str;
        this.f89234b = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32801m)) {
            return false;
        }
        C32801m mVar = (C32801m) obj;
        return C87412m.m108589b(this.f89233a, mVar.f89233a) && this.f89234b == mVar.f89234b;
    }

    public int hashCode() {
        long j = this.f89234b;
        return (this.f89233a.hashCode() * 31) + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "MusicTingLyricCache(lyric=" + this.f89233a + ", timestamp=" + this.f89234b + ')';
    }
}
