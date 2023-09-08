package p723vf;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: vf.n */
public final class C90791n {

    /* renamed from: a */
    public String f260711a;

    /* renamed from: b */
    public String f260712b;

    /* renamed from: c */
    public long f260713c;

    /* renamed from: d */
    public long f260714d;

    /* renamed from: e */
    public long f260715e;

    /* renamed from: f */
    public long f260716f;

    /* renamed from: g */
    public long f260717g;

    /* renamed from: h */
    public long f260718h;

    /* renamed from: i */
    public long f260719i;

    /* renamed from: j */
    public long f260720j;

    /* renamed from: k */
    public long f260721k;

    public C90791n() {
        this((String) null, (String) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2047, (C8480h) null);
    }

    public C90791n(String str, String str2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i, C8480h hVar) {
        int i2 = i;
        String str3 = null;
        String str4 = (i2 & 1) != 0 ? null : str;
        str3 = (i2 & 2) == 0 ? str2 : str3;
        long j15 = (i2 & 4) != 0 ? 0 : j;
        long j16 = (i2 & 8) != 0 ? 0 : j2;
        long j17 = (i2 & 16) != 0 ? 0 : j3;
        long j18 = (i2 & 32) != 0 ? 0 : j4;
        long j19 = (i2 & 64) != 0 ? 0 : j5;
        long j25 = (i2 & 128) != 0 ? 0 : j6;
        long j26 = (i2 & 256) != 0 ? 0 : j7;
        long j27 = (i2 & 512) != 0 ? 0 : j8;
        long j28 = (i2 & 1024) != 0 ? 0 : j9;
        this.f260711a = str4;
        this.f260712b = str3;
        this.f260713c = j15;
        this.f260714d = j16;
        this.f260715e = j17;
        this.f260716f = j18;
        this.f260717g = j19;
        this.f260718h = j25;
        this.f260719i = j26;
        this.f260720j = j27;
        this.f260721k = j28;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C90791n)) {
            return false;
        }
        C90791n nVar = (C90791n) obj;
        return C87412m.m108589b(this.f260711a, nVar.f260711a) && C87412m.m108589b(this.f260712b, nVar.f260712b) && this.f260713c == nVar.f260713c && this.f260714d == nVar.f260714d && this.f260715e == nVar.f260715e && this.f260716f == nVar.f260716f && this.f260717g == nVar.f260717g && this.f260718h == nVar.f260718h && this.f260719i == nVar.f260719i && this.f260720j == nVar.f260720j && this.f260721k == nVar.f260721k;
    }

    public int hashCode() {
        String str = this.f260711a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f260712b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j = this.f260713c;
        long j2 = this.f260714d;
        long j3 = this.f260715e;
        long j4 = this.f260716f;
        long j5 = this.f260717g;
        long j6 = this.f260718h;
        long j7 = this.f260719i;
        long j8 = this.f260720j;
        long j9 = this.f260721k;
        return ((((((((((((((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)));
    }

    public String toString() {
        return "SmapsItem(name=" + this.f260711a + ", permission=" + this.f260712b + ", count=" + this.f260713c + ", vmSize=" + this.f260714d + ", rss=" + this.f260715e + ", pss=" + this.f260716f + ", sharedClean=" + this.f260717g + ", sharedDirty=" + this.f260718h + ", privateClean=" + this.f260719i + ", privateDirty=" + this.f260720j + ", swapPss=" + this.f260721k + ")";
    }
}
