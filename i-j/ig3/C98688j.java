package ig3;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: ig3.j */
public final class C98688j {

    /* renamed from: a */
    public long f289389a;

    /* renamed from: b */
    public String f289390b;

    /* renamed from: c */
    public long f289391c;

    /* renamed from: d */
    public long f289392d;

    /* renamed from: e */
    public long f289393e;

    /* renamed from: f */
    public long f289394f;

    /* renamed from: g */
    public long f289395g;

    /* renamed from: h */
    public long f289396h;

    /* renamed from: i */
    public long f289397i;

    /* renamed from: j */
    public int f289398j;

    /* renamed from: k */
    public int f289399k;

    public C98688j() {
        this(0, (String) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2047, (C8480h) null);
    }

    public C98688j(long j, String str, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i, int i2, int i3, C8480h hVar) {
        int i4 = i3;
        long j9 = (i4 & 1) != 0 ? 0 : j;
        String str2 = (i4 & 2) != 0 ? "" : str;
        long j15 = (i4 & 4) != 0 ? 0 : j2;
        long j16 = (i4 & 8) != 0 ? 0 : j3;
        long j17 = (i4 & 16) != 0 ? 0 : j4;
        long j18 = (i4 & 32) != 0 ? 0 : j5;
        long j19 = (i4 & 64) != 0 ? 0 : j6;
        long j25 = (i4 & 128) != 0 ? 0 : j7;
        long j26 = (i4 & 256) != 0 ? 0 : j8;
        int i5 = (i4 & 512) != 0 ? 0 : i;
        int i6 = (i4 & 1024) != 0 ? 0 : i2;
        C87412m.m108594g(str2, "fromUser");
        this.f289389a = j9;
        this.f289390b = str2;
        this.f289391c = j15;
        this.f289392d = j16;
        this.f289393e = j17;
        this.f289394f = j18;
        this.f289395g = j19;
        this.f289396h = j25;
        this.f289397i = j26;
        this.f289398j = i5;
        this.f289399k = i6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C98688j)) {
            return false;
        }
        C98688j jVar = (C98688j) obj;
        return this.f289389a == jVar.f289389a && C87412m.m108589b(this.f289390b, jVar.f289390b) && this.f289391c == jVar.f289391c && this.f289392d == jVar.f289392d && this.f289393e == jVar.f289393e && this.f289394f == jVar.f289394f && this.f289395g == jVar.f289395g && this.f289396h == jVar.f289396h && this.f289397i == jVar.f289397i && this.f289398j == jVar.f289398j && this.f289399k == jVar.f289399k;
    }

    public int hashCode() {
        long j = this.f289389a;
        long j2 = this.f289391c;
        long j3 = this.f289392d;
        long j4 = this.f289393e;
        long j5 = this.f289394f;
        long j6 = this.f289395g;
        long j7 = this.f289396h;
        long j8 = this.f289397i;
        return (((((((((((((((((((((int) (j ^ (j >>> 32))) * 31) + this.f289390b.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + this.f289398j) * 31) + this.f289399k;
    }

    public String toString() {
        return "VideoMsgPreloadData(msgSvrId=" + this.f289389a + ", fromUser=" + this.f289390b + ", cdnUrlSize=" + this.f289391c + ", cdnUrlPri=" + this.f289392d + ", cdnUrlPd=" + this.f289393e + ", cdnRawUrlSize=" + this.f289394f + ", cdnRawUrlPri=" + this.f289395g + ", cdnRawUrlPd=" + this.f289396h + ", createTime=" + this.f289397i + ", preloadStatus=" + this.f289398j + ", resourceStatus=" + this.f289399k + ')';
    }
}
