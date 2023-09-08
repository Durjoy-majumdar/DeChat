package ak1;

import ak1.C54067f0;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: ak1.a0 */
public final class C54061a0 {

    /* renamed from: a */
    public final long f151380a;

    /* renamed from: b */
    public final long f151381b;

    /* renamed from: c */
    public final String f151382c;

    /* renamed from: d */
    public final long f151383d;

    /* renamed from: e */
    public final long f151384e;

    /* renamed from: f */
    public final C54067f0.C54078q f151385f;

    /* renamed from: g */
    public final String f151386g;

    /* renamed from: h */
    public final long f151387h;

    /* renamed from: i */
    public final String f151388i;

    /* renamed from: j */
    public final String f151389j;

    /* renamed from: k */
    public final int f151390k;

    /* renamed from: l */
    public final String f151391l;

    /* renamed from: m */
    public final String f151392m;

    /* renamed from: n */
    public String f151393n;

    public C54061a0(long j, long j2, String str, long j3, long j4, C54067f0.C54078q qVar, String str2, long j5, String str3, String str4, int i, String str5, String str6, String str7, int i2, C8480h hVar) {
        C54067f0.C54078q qVar2 = qVar;
        int i3 = i2;
        long j6 = (i3 & 1) != 0 ? 0 : j;
        long j7 = (i3 & 2) != 0 ? 0 : j2;
        String str8 = (i3 & 4) != 0 ? "" : str;
        long j8 = (i3 & 8) != 0 ? 0 : j3;
        long j9 = (i3 & 16) != 0 ? -1 : j4;
        String str9 = (i3 & 64) != 0 ? "" : str2;
        long j15 = (i3 & 128) != 0 ? 0 : j5;
        String str10 = "";
        String str11 = (i3 & 256) != 0 ? str10 : str3;
        long j16 = j15;
        String str12 = (i3 & 512) != 0 ? str10 : str4;
        int i4 = (i3 & 1024) != 0 ? 0 : i;
        String str13 = (i3 & 2048) != 0 ? str10 : str5;
        String str14 = str12;
        String str15 = (i3 & 4096) != 0 ? str10 : str6;
        String str16 = (i3 & 8192) != 0 ? str10 : str7;
        C87412m.m108594g(str8, "userName");
        C87412m.m108594g(qVar2, "actionType");
        C87412m.m108594g(str9, "commentscene");
        C87412m.m108594g(str11, "shareUserName");
        C87412m.m108594g(str13, "clickTabContextId");
        C87412m.m108594g(str15, "clickSubTabContextId");
        C87412m.m108594g(str16, "chnlExtra");
        this.f151380a = j6;
        this.f151381b = j7;
        this.f151382c = str8;
        this.f151383d = j8;
        this.f151384e = j9;
        this.f151385f = qVar2;
        this.f151386g = str9;
        this.f151387h = j16;
        this.f151388i = str11;
        this.f151389j = str14;
        this.f151390k = i4;
        this.f151391l = str13;
        this.f151392m = str15;
        this.f151393n = str16;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54061a0)) {
            return false;
        }
        C54061a0 a0Var = (C54061a0) obj;
        return this.f151380a == a0Var.f151380a && this.f151381b == a0Var.f151381b && C87412m.m108589b(this.f151382c, a0Var.f151382c) && this.f151383d == a0Var.f151383d && this.f151384e == a0Var.f151384e && this.f151385f == a0Var.f151385f && C87412m.m108589b(this.f151386g, a0Var.f151386g) && this.f151387h == a0Var.f151387h && C87412m.m108589b(this.f151388i, a0Var.f151388i) && C87412m.m108589b(this.f151389j, a0Var.f151389j) && this.f151390k == a0Var.f151390k && C87412m.m108589b(this.f151391l, a0Var.f151391l) && C87412m.m108589b(this.f151392m, a0Var.f151392m) && C87412m.m108589b(this.f151393n, a0Var.f151393n);
    }

    public int hashCode() {
        long j = this.f151380a;
        long j2 = this.f151381b;
        long j3 = this.f151383d;
        long j4 = this.f151384e;
        long j5 = this.f151387h;
        int hashCode = ((((((((((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f151382c.hashCode()) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f151385f.hashCode()) * 31) + this.f151386g.hashCode()) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f151388i.hashCode()) * 31;
        String str = this.f151389j;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f151390k) * 31) + this.f151391l.hashCode()) * 31) + this.f151392m.hashCode()) * 31) + this.f151393n.hashCode();
    }

    public String toString() {
        return "HellVisitorClickData(feedId=" + this.f151380a + ", liveId=" + this.f151381b + ", userName=" + this.f151382c + ", index=" + this.f151383d + ", onlineNum=" + this.f151384e + ", actionType=" + this.f151385f + ", commentscene=" + this.f151386g + ", shareType=" + this.f151387h + ", shareUserName=" + this.f151388i + ", snsFeedid=" + this.f151389j + ", enterIconType=" + this.f151390k + ", clickTabContextId=" + this.f151391l + ", clickSubTabContextId=" + this.f151392m + ", chnlExtra=" + this.f151393n + ')';
    }
}
