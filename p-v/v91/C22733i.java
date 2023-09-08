package v91;

import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: v91.i */
public final class C22733i {

    /* renamed from: a */
    public String f65380a;

    /* renamed from: b */
    public long f65381b;

    /* renamed from: c */
    public long f65382c;

    /* renamed from: d */
    public int f65383d;

    /* renamed from: e */
    public float f65384e;

    /* renamed from: f */
    public float f65385f;

    /* renamed from: g */
    public String f65386g;

    /* renamed from: h */
    public int f65387h;

    /* renamed from: i */
    public long f65388i;

    /* renamed from: j */
    public long f65389j;

    /* renamed from: k */
    public boolean f65390k;

    /* renamed from: l */
    public int f65391l;

    /* renamed from: m */
    public int f65392m;

    /* renamed from: n */
    public float f65393n;

    /* renamed from: o */
    public float f65394o;

    /* renamed from: p */
    public int f65395p;

    /* renamed from: q */
    public int f65396q;

    /* renamed from: r */
    public int f65397r;

    /* renamed from: s */
    public int f65398s;

    /* renamed from: t */
    public String f65399t;

    /* renamed from: u */
    public String f65400u;

    /* renamed from: v */
    public String f65401v;

    /* renamed from: w */
    public int f65402w;

    /* renamed from: x */
    public int f65403x;

    /* renamed from: y */
    public String f65404y;

    public C22733i() {
        this((String) null, 0, 0, 0, 0.0f, 0.0f, (String) null, 0, 0, 0, false, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, (String) null, (String) null, (String) null, 0, 0, (String) null, 33554431, (C8480h) null);
    }

    public C22733i(String str, long j, long j2, int i, float f, float f2, String str2, int i2, long j3, long j4, boolean z, int i3, int i4, float f3, float f4, int i5, int i6, int i7, int i8, String str3, String str4, String str5, int i9, int i15, String str6, int i16, C8480h hVar) {
        int i17 = i16;
        String str7 = (i17 & 1) != 0 ? null : str;
        long j5 = (i17 & 2) != 0 ? 0 : j;
        long j6 = (i17 & 4) != 0 ? 0 : j2;
        int i18 = (i17 & 8) != 0 ? 0 : i;
        float f5 = (i17 & 16) != 0 ? 0.0f : f;
        float f6 = (i17 & 32) != 0 ? 0.0f : f2;
        String str8 = (i17 & 64) != 0 ? null : str2;
        int i19 = (i17 & 128) != 0 ? 0 : i2;
        long j7 = (i17 & 256) != 0 ? 0 : j3;
        long j8 = (i17 & 512) != 0 ? 0 : j4;
        boolean z2 = (i17 & 1024) != 0 ? false : z;
        int i25 = (i17 & 2048) != 0 ? 0 : i3;
        int i26 = (i17 & 4096) != 0 ? 0 : i4;
        float f7 = (i17 & 8192) != 0 ? 0.0f : f3;
        float f8 = (i17 & 16384) != 0 ? 0.0f : f4;
        int i27 = (i17 & 32768) != 0 ? -1 : i5;
        int i28 = (i17 & 65536) != 0 ? -1 : i6;
        int i29 = (i17 & 131072) != 0 ? -1 : i7;
        int i35 = (i17 & 262144) != 0 ? -1 : i8;
        String str9 = (i17 & 524288) != 0 ? null : str3;
        String str10 = (i17 & 1048576) != 0 ? null : str4;
        String str11 = (i17 & 2097152) != 0 ? null : str5;
        int i36 = (i17 & 4194304) != 0 ? 0 : i9;
        int i37 = (i17 & 8388608) != 0 ? 0 : i15;
        String str12 = (i17 & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? null : str6;
        this.f65380a = str7;
        this.f65381b = j5;
        this.f65382c = j6;
        this.f65383d = i18;
        this.f65384e = f5;
        this.f65385f = f6;
        this.f65386g = str8;
        this.f65387h = i19;
        this.f65388i = j7;
        this.f65389j = j8;
        this.f65390k = z2;
        this.f65391l = i25;
        this.f65392m = i26;
        this.f65393n = f7;
        this.f65394o = f8;
        this.f65395p = i27;
        this.f65396q = i28;
        this.f65397r = i29;
        this.f65398s = i35;
        this.f65399t = str9;
        this.f65400u = str10;
        this.f65401v = str11;
        this.f65402w = i36;
        this.f65403x = i37;
        this.f65404y = str12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22733i)) {
            return false;
        }
        C22733i iVar = (C22733i) obj;
        return C87412m.m108589b(this.f65380a, iVar.f65380a) && this.f65381b == iVar.f65381b && this.f65382c == iVar.f65382c && this.f65383d == iVar.f65383d && C87412m.m108589b(Float.valueOf(this.f65384e), Float.valueOf(iVar.f65384e)) && C87412m.m108589b(Float.valueOf(this.f65385f), Float.valueOf(iVar.f65385f)) && C87412m.m108589b(this.f65386g, iVar.f65386g) && this.f65387h == iVar.f65387h && this.f65388i == iVar.f65388i && this.f65389j == iVar.f65389j && this.f65390k == iVar.f65390k && this.f65391l == iVar.f65391l && this.f65392m == iVar.f65392m && C87412m.m108589b(Float.valueOf(this.f65393n), Float.valueOf(iVar.f65393n)) && C87412m.m108589b(Float.valueOf(this.f65394o), Float.valueOf(iVar.f65394o)) && this.f65395p == iVar.f65395p && this.f65396q == iVar.f65396q && this.f65397r == iVar.f65397r && this.f65398s == iVar.f65398s && C87412m.m108589b(this.f65399t, iVar.f65399t) && C87412m.m108589b(this.f65400u, iVar.f65400u) && C87412m.m108589b(this.f65401v, iVar.f65401v) && this.f65402w == iVar.f65402w && this.f65403x == iVar.f65403x && C87412m.m108589b(this.f65404y, iVar.f65404y);
    }

    public int hashCode() {
        String str = this.f65380a;
        int i = 0;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f65381b;
        long j2 = this.f65382c;
        int floatToIntBits = ((((((((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f65383d) * 31) + Float.floatToIntBits(this.f65384e)) * 31) + Float.floatToIntBits(this.f65385f)) * 31;
        String str2 = this.f65386g;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        long j3 = this.f65388i;
        long j4 = this.f65389j;
        int i2 = (((((((floatToIntBits + hashCode2) * 31) + this.f65387h) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        boolean z = this.f65390k;
        if (z) {
            z = true;
        }
        int floatToIntBits2 = (((((((((((((((((i2 + (z ? 1 : 0)) * 31) + this.f65391l) * 31) + this.f65392m) * 31) + Float.floatToIntBits(this.f65393n)) * 31) + Float.floatToIntBits(this.f65394o)) * 31) + this.f65395p) * 31) + this.f65396q) * 31) + this.f65397r) * 31) + this.f65398s) * 31;
        String str3 = this.f65399t;
        int hashCode3 = (floatToIntBits2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f65400u;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f65401v;
        int hashCode5 = (((((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.f65402w) * 31) + this.f65403x) * 31;
        String str6 = this.f65404y;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "WaterFeed(sessionId=" + this.f65380a + ", startExposureMs=" + this.f65381b + ", endExposureMs=" + this.f65382c + ", disAppearType=" + this.f65383d + ", itemExposureAreaWeigth=" + this.f65384e + ", screenExposureAreaWeigth=" + this.f65385f + ", contextId=" + this.f65386g + ", scene=" + this.f65387h + ", updateTimeMs=" + this.f65388i + ", itemExposureTimeMs=" + this.f65389j + ", isShowing=" + this.f65390k + ", x=" + this.f65391l + ", y=" + this.f65392m + ", height=" + this.f65393n + ", width=" + this.f65394o + ", position=" + this.f65395p + ", itemPosition=" + this.f65396q + ", itemPos=" + this.f65397r + ", itemArrayIndex=" + this.f65398s + ", feedId=" + this.f65399t + ", userName=" + this.f65400u + ", nickName=" + this.f65401v + ", commentCount=" + this.f65402w + ", likeCount=" + this.f65403x + ", itemBufffer=" + this.f65404y + ')';
    }
}
