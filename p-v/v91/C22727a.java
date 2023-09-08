package v91;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: v91.a */
public final class C22727a {

    /* renamed from: a */
    public float f65352a;

    /* renamed from: b */
    public float f65353b;

    /* renamed from: c */
    public String f65354c;

    /* renamed from: d */
    public String f65355d;

    /* renamed from: e */
    public String f65356e;

    /* renamed from: f */
    public int f65357f;

    /* renamed from: g */
    public long f65358g;

    /* renamed from: h */
    public long f65359h;

    /* renamed from: i */
    public float f65360i;

    /* renamed from: j */
    public float f65361j;

    /* renamed from: k */
    public int f65362k;

    /* renamed from: l */
    public int f65363l;

    /* renamed from: m */
    public String f65364m;

    /* renamed from: n */
    public String f65365n;

    /* renamed from: o */
    public String f65366o;

    /* renamed from: p */
    public int f65367p;

    /* renamed from: q */
    public int f65368q;

    public C22727a() {
        this(0.0f, 0.0f, (String) null, (String) null, (String) null, 0, 0, 0, 0.0f, 0.0f, 0, 0, (String) null, (String) null, (String) null, 0, 0, 131071, (C8480h) null);
    }

    public C22727a(float f, float f2, String str, String str2, String str3, int i, long j, long j2, float f3, float f4, int i2, int i3, String str4, String str5, String str6, int i4, int i5, int i6, C8480h hVar) {
        int i7 = i6;
        float f5 = (i7 & 1) != 0 ? 0.0f : f;
        float f6 = (i7 & 2) != 0 ? 0.0f : f2;
        String str7 = (i7 & 4) != 0 ? null : str;
        String str8 = (i7 & 8) != 0 ? null : str2;
        String str9 = (i7 & 16) != 0 ? null : str3;
        int i8 = (i7 & 32) != 0 ? 0 : i;
        long j3 = 0;
        long j4 = (i7 & 64) != 0 ? 0 : j;
        j3 = (i7 & 128) == 0 ? j2 : j3;
        float f7 = (i7 & 256) != 0 ? 0.0f : f3;
        float f8 = (i7 & 512) != 0 ? 0.0f : f4;
        int i9 = (i7 & 1024) != 0 ? 0 : i2;
        int i15 = (i7 & 2048) != 0 ? 0 : i3;
        String str10 = (i7 & 4096) != 0 ? null : str4;
        String str11 = (i7 & 8192) != 0 ? null : str5;
        String str12 = (i7 & 16384) != 0 ? null : str6;
        int i16 = (i7 & 32768) != 0 ? 0 : i4;
        int i17 = (i7 & 65536) != 0 ? 0 : i5;
        this.f65352a = f5;
        this.f65353b = f6;
        this.f65354c = str7;
        this.f65355d = str8;
        this.f65356e = str9;
        this.f65357f = i8;
        this.f65358g = j4;
        this.f65359h = j3;
        this.f65360i = f7;
        this.f65361j = f8;
        this.f65362k = i9;
        this.f65363l = i15;
        this.f65364m = str10;
        this.f65365n = str11;
        this.f65366o = str12;
        this.f65367p = i16;
        this.f65368q = i17;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22727a)) {
            return false;
        }
        C22727a aVar = (C22727a) obj;
        return C87412m.m108589b(Float.valueOf(this.f65352a), Float.valueOf(aVar.f65352a)) && C87412m.m108589b(Float.valueOf(this.f65353b), Float.valueOf(aVar.f65353b)) && C87412m.m108589b(this.f65354c, aVar.f65354c) && C87412m.m108589b(this.f65355d, aVar.f65355d) && C87412m.m108589b(this.f65356e, aVar.f65356e) && this.f65357f == aVar.f65357f && this.f65358g == aVar.f65358g && this.f65359h == aVar.f65359h && C87412m.m108589b(Float.valueOf(this.f65360i), Float.valueOf(aVar.f65360i)) && C87412m.m108589b(Float.valueOf(this.f65361j), Float.valueOf(aVar.f65361j)) && this.f65362k == aVar.f65362k && this.f65363l == aVar.f65363l && C87412m.m108589b(this.f65364m, aVar.f65364m) && C87412m.m108589b(this.f65365n, aVar.f65365n) && C87412m.m108589b(this.f65366o, aVar.f65366o) && this.f65367p == aVar.f65367p && this.f65368q == aVar.f65368q;
    }

    public int hashCode() {
        int floatToIntBits = ((Float.floatToIntBits(this.f65352a) * 31) + Float.floatToIntBits(this.f65353b)) * 31;
        String str = this.f65354c;
        int i = 0;
        int hashCode = (floatToIntBits + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f65355d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f65356e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.f65358g;
        long j2 = this.f65359h;
        int floatToIntBits2 = (((((((((((((((hashCode2 + hashCode3) * 31) + this.f65357f) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Float.floatToIntBits(this.f65360i)) * 31) + Float.floatToIntBits(this.f65361j)) * 31) + this.f65362k) * 31) + this.f65363l) * 31;
        String str4 = this.f65364m;
        int hashCode4 = (floatToIntBits2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f65365n;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f65366o;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((((hashCode5 + i) * 31) + this.f65367p) * 31) + this.f65368q;
    }

    public String toString() {
        return "ClickFeed(height=" + this.f65352a + ", width=" + this.f65353b + ", sessionId=" + this.f65354c + ", clickFeedId=" + this.f65355d + ", nickName=" + this.f65356e + ", scene=" + this.f65357f + ", updateTimeMs=" + this.f65358g + ", clickTimeMs=" + this.f65359h + ", itemExposureAreaWeigth=" + this.f65360i + ", screenExposureAreaWeigth=" + this.f65361j + ", itemDirection=" + this.f65362k + ", itemIndex=" + this.f65363l + ", shotScreenJson=" + this.f65364m + ", contextId=" + this.f65365n + ", itemBufffer=" + this.f65366o + ", itemArrayIndex=" + this.f65367p + ", position=" + this.f65368q + ')';
    }
}
