package al1;

import gy3.C87412m;

/* renamed from: al1.f */
public final class C0080f {

    /* renamed from: a */
    public long f503a;

    /* renamed from: b */
    public final long f504b;

    /* renamed from: c */
    public final String f505c;

    public C0080f(long j, long j2, String str) {
        this.f503a = j;
        this.f504b = j2;
        this.f505c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0080f)) {
            return false;
        }
        C0080f fVar = (C0080f) obj;
        return this.f503a == fVar.f503a && this.f504b == fVar.f504b && C87412m.m108589b(this.f505c, fVar.f505c);
    }

    public int hashCode() {
        long j = this.f503a;
        long j2 = this.f504b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f505c;
        return i + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FinderLiveBalanceData(wecoinBalance=" + this.f503a + ", consumeBalanceCNY=" + this.f504b + ", consumeVerifyUrl=" + this.f505c + ')';
    }
}
