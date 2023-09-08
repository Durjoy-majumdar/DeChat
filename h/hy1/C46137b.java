package hy1;

import gy3.C87412m;

/* renamed from: hy1.b */
public final class C46137b {

    /* renamed from: a */
    public final String f124319a;

    /* renamed from: b */
    public final int f124320b;

    /* renamed from: c */
    public final boolean f124321c;

    /* renamed from: d */
    public final String f124322d;

    /* renamed from: e */
    public final String f124323e;

    /* renamed from: f */
    public final boolean f124324f;

    /* renamed from: g */
    public final boolean f124325g;

    /* renamed from: h */
    public long f124326h;

    /* renamed from: i */
    public final boolean f124327i;

    /* renamed from: j */
    public long f124328j;

    /* renamed from: k */
    public final boolean f124329k;

    public C46137b(String str, int i, boolean z, String str2, String str3, boolean z2, boolean z3, long j, boolean z4, long j2, boolean z5) {
        C87412m.m108594g(str, "key");
        C87412m.m108594g(str2, "reportStr");
        this.f124319a = str;
        this.f124320b = i;
        this.f124321c = z;
        this.f124322d = str2;
        this.f124323e = str3;
        this.f124324f = z2;
        this.f124325g = z3;
        this.f124326h = j;
        this.f124327i = z4;
        this.f124328j = j2;
        this.f124329k = z5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46137b)) {
            return false;
        }
        C46137b bVar = (C46137b) obj;
        return C87412m.m108589b(this.f124319a, bVar.f124319a) && this.f124320b == bVar.f124320b && this.f124321c == bVar.f124321c && C87412m.m108589b(this.f124322d, bVar.f124322d) && C87412m.m108589b(this.f124323e, bVar.f124323e) && this.f124324f == bVar.f124324f && this.f124325g == bVar.f124325g && this.f124326h == bVar.f124326h && this.f124327i == bVar.f124327i && this.f124328j == bVar.f124328j && this.f124329k == bVar.f124329k;
    }

    public int hashCode() {
        int hashCode = ((this.f124319a.hashCode() * 31) + this.f124320b) * 31;
        boolean z = this.f124321c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode2 = (((hashCode + (z ? 1 : 0)) * 31) + this.f124322d.hashCode()) * 31;
        String str = this.f124323e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        boolean z3 = this.f124324f;
        if (z3) {
            z3 = true;
        }
        int i = (hashCode3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f124325g;
        if (z4) {
            z4 = true;
        }
        long j = this.f124326h;
        int i2 = (((i + (z4 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z5 = this.f124327i;
        if (z5) {
            z5 = true;
        }
        long j2 = this.f124328j;
        int i3 = (((i2 + (z5 ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z6 = this.f124329k;
        if (!z6) {
            z2 = z6;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "FeedTimeReportStruct(key=" + this.f124319a + ", logId=" + this.f124320b + ", reportOnExit=" + this.f124321c + ", reportStr=" + this.f124322d + ", timePlaceHolderKey=" + this.f124323e + ", markTimeStart=" + this.f124324f + ", isReportNow=" + this.f124325g + ", reportDuration=" + this.f124326h + ", isTimeMillSecond=" + this.f124327i + ", startTime=" + this.f124328j + ", recordOpenOtherPage=" + this.f124329k + ')';
    }
}
