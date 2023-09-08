package u91;

import gy3.C8480h;
import gy3.C87412m;

/* renamed from: u91.c */
public final class C22623c {

    /* renamed from: a */
    public String f65064a;

    /* renamed from: b */
    public String f65065b;

    /* renamed from: c */
    public long f65066c;

    /* renamed from: d */
    public long f65067d;

    /* renamed from: e */
    public long f65068e;

    /* renamed from: f */
    public String f65069f;

    /* renamed from: g */
    public String f65070g;

    /* renamed from: h */
    public int f65071h;

    /* renamed from: i */
    public boolean f65072i;

    /* renamed from: j */
    public String f65073j;

    /* renamed from: k */
    public String f65074k;

    /* renamed from: l */
    public String f65075l;

    public C22623c() {
        this((String) null, (String) null, 0, 0, 0, (String) null, (String) null, 0, false, (String) null, (String) null, (String) null, 4095, (C8480h) null);
    }

    public C22623c(String str, String str2, long j, long j2, long j3, String str3, String str4, int i, boolean z, String str5, String str6, String str7, int i2, C8480h hVar) {
        int i3 = i2;
        String str8 = (i3 & 1) != 0 ? null : str;
        String str9 = (i3 & 2) != 0 ? null : str2;
        long j4 = -1;
        long j5 = (i3 & 4) != 0 ? -1 : j;
        long j6 = (i3 & 8) != 0 ? -1 : j2;
        j4 = (i3 & 16) == 0 ? j3 : j4;
        String str10 = (i3 & 32) != 0 ? null : str3;
        String str11 = (i3 & 64) != 0 ? null : str4;
        boolean z2 = false;
        int i4 = (i3 & 128) != 0 ? 0 : i;
        z2 = (i3 & 256) == 0 ? z : z2;
        String str12 = (i3 & 512) != 0 ? null : str5;
        String str13 = (i3 & 1024) != 0 ? null : str6;
        String str14 = (i3 & 2048) != 0 ? "" : str7;
        C87412m.m108594g(str14, "finderContextID");
        this.f65064a = str8;
        this.f65065b = str9;
        this.f65066c = j5;
        this.f65067d = j6;
        this.f65068e = j4;
        this.f65069f = str10;
        this.f65070g = str11;
        this.f65071h = i4;
        this.f65072i = z2;
        this.f65073j = str12;
        this.f65074k = str13;
        this.f65075l = str14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22623c)) {
            return false;
        }
        C22623c cVar = (C22623c) obj;
        return C87412m.m108589b(this.f65064a, cVar.f65064a) && C87412m.m108589b(this.f65065b, cVar.f65065b) && this.f65066c == cVar.f65066c && this.f65067d == cVar.f65067d && this.f65068e == cVar.f65068e && C87412m.m108589b(this.f65069f, cVar.f65069f) && C87412m.m108589b(this.f65070g, cVar.f65070g) && this.f65071h == cVar.f65071h && this.f65072i == cVar.f65072i && C87412m.m108589b(this.f65073j, cVar.f65073j) && C87412m.m108589b(this.f65074k, cVar.f65074k) && C87412m.m108589b(this.f65075l, cVar.f65075l);
    }

    public int hashCode() {
        String str = this.f65064a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f65065b;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        long j = this.f65066c;
        long j2 = this.f65067d;
        long j3 = this.f65068e;
        int i2 = (((((((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str3 = this.f65069f;
        int hashCode3 = (i2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f65070g;
        int hashCode4 = (((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f65071h) * 31;
        boolean z = this.f65072i;
        if (z) {
            z = true;
        }
        int i3 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str5 = this.f65073j;
        int hashCode5 = (i3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f65074k;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((hashCode5 + i) * 31) + this.f65075l.hashCode();
    }

    public String toString() {
        return "StayTimeStatistics(sessionId=" + this.f65064a + ", pageName=" + this.f65065b + ", stayTimeMs=" + this.f65066c + ", enterTimeMs=" + this.f65067d + ", exitTimeMs=" + this.f65068e + ", clickTabContextId=" + this.f65069f + ", sid=" + this.f65070g + ", reportType=" + this.f65071h + ", isPoi=" + this.f65072i + ", extraInfo=" + this.f65073j + ", enterSourceInfo=" + this.f65074k + ", finderContextID=" + this.f65075l + ')';
    }
}
