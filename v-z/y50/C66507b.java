package y50;

import gy3.C87412m;

/* renamed from: y50.b */
public final class C66507b {

    /* renamed from: a */
    public final long f191324a;

    /* renamed from: b */
    public final String f191325b;

    /* renamed from: c */
    public final String f191326c;

    /* renamed from: d */
    public final String f191327d;

    /* renamed from: e */
    public final String f191328e;

    public C66507b(long j, String str, String str2, String str3, String str4) {
        this.f191324a = j;
        this.f191325b = str;
        this.f191326c = str2;
        this.f191327d = str3;
        this.f191328e = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66507b)) {
            return false;
        }
        C66507b bVar = (C66507b) obj;
        return this.f191324a == bVar.f191324a && C87412m.m108589b(this.f191325b, bVar.f191325b) && C87412m.m108589b(this.f191326c, bVar.f191326c) && C87412m.m108589b(this.f191327d, bVar.f191327d) && C87412m.m108589b(this.f191328e, bVar.f191328e);
    }

    public int hashCode() {
        long j = this.f191324a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f191325b;
        int i2 = 0;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f191326c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f191327d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f191328e;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public String toString() {
        return "ApplyLiveMicInfo(liveId=" + this.f191324a + ", micId=" + this.f191325b + ", uid=" + this.f191326c + ", roomId=" + this.f191327d + ", sdkUid=" + this.f191328e + ')';
    }
}
