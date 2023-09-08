package ak1;

import ak1.C54067f0;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: ak1.b0 */
public final class C54064b0 {

    /* renamed from: a */
    public final long f151399a;

    /* renamed from: b */
    public final long f151400b;

    /* renamed from: c */
    public final String f151401c;

    /* renamed from: d */
    public final long f151402d;

    /* renamed from: e */
    public final long f151403e;

    /* renamed from: f */
    public final C54067f0.C54078q f151404f;

    /* renamed from: g */
    public final String f151405g;

    /* renamed from: h */
    public final long f151406h;

    /* renamed from: i */
    public final long f151407i;

    /* renamed from: j */
    public final String f151408j;

    /* renamed from: k */
    public final String f151409k;

    /* renamed from: l */
    public final long f151410l;

    /* renamed from: m */
    public final C54067f0.C54083s0 f151411m;

    /* renamed from: n */
    public final String f151412n;

    /* renamed from: o */
    public final String f151413o;

    /* renamed from: p */
    public final String f151414p;

    /* renamed from: q */
    public final String f151415q;

    /* renamed from: r */
    public final String f151416r;

    public C54064b0(long j, long j2, String str, long j3, long j4, C54067f0.C54078q qVar, String str2, long j5, long j6, String str3, String str4, long j7, C54067f0.C54083s0 s0Var, String str5, String str6, String str7, String str8, String str9, int i, C8480h hVar) {
        C54067f0.C54078q qVar2 = qVar;
        C54067f0.C54083s0 s0Var2 = s0Var;
        int i2 = i;
        long j8 = (i2 & 1) != 0 ? 0 : j;
        long j9 = (i2 & 2) != 0 ? 0 : j2;
        String str10 = (i2 & 4) != 0 ? "" : str;
        long j15 = (i2 & 8) != 0 ? 0 : j3;
        long j16 = (i2 & 16) != 0 ? -1 : j4;
        String str11 = (i2 & 64) != 0 ? "" : str2;
        long j17 = (i2 & 128) != 0 ? 0 : j5;
        long j18 = (i2 & 256) != 0 ? 0 : j6;
        String str12 = (i2 & 512) != 0 ? "" : str3;
        String str13 = "";
        String str14 = (i2 & 1024) != 0 ? str13 : str4;
        long j19 = j16;
        String str15 = (i2 & 8192) != 0 ? str13 : str5;
        String str16 = (i2 & 16384) != 0 ? str13 : str6;
        long j25 = j15;
        String str17 = (i2 & 32768) != 0 ? str13 : str7;
        String str18 = (65536 & i2) != 0 ? str13 : str8;
        String str19 = (i2 & 131072) != 0 ? str13 : str9;
        C87412m.m108594g(str10, "userName");
        C87412m.m108594g(qVar2, "actionType");
        C87412m.m108594g(str11, "commentscene");
        C87412m.m108594g(str12, "shareUserName");
        C87412m.m108594g(str14, "snsFeedid");
        C87412m.m108594g(s0Var2, "enterType");
        C87412m.m108594g(str15, "sessionBuf");
        C87412m.m108594g(str16, "clickTabContextId");
        C87412m.m108594g(str17, "clickSubTabContextId");
        C87412m.m108594g(str18, "chnlExtra");
        C87412m.m108594g(str19, "talkerUsername");
        this.f151399a = j8;
        this.f151400b = j9;
        this.f151401c = str10;
        this.f151402d = j25;
        this.f151403e = j19;
        this.f151404f = qVar2;
        this.f151405g = str11;
        this.f151406h = j17;
        this.f151407i = j18;
        this.f151408j = str12;
        this.f151409k = str14;
        this.f151410l = j7;
        this.f151411m = s0Var2;
        this.f151412n = str15;
        this.f151413o = str16;
        this.f151414p = str17;
        this.f151415q = str18;
        this.f151416r = str19;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54064b0)) {
            return false;
        }
        C54064b0 b0Var = (C54064b0) obj;
        return this.f151399a == b0Var.f151399a && this.f151400b == b0Var.f151400b && C87412m.m108589b(this.f151401c, b0Var.f151401c) && this.f151402d == b0Var.f151402d && this.f151403e == b0Var.f151403e && this.f151404f == b0Var.f151404f && C87412m.m108589b(this.f151405g, b0Var.f151405g) && this.f151406h == b0Var.f151406h && this.f151407i == b0Var.f151407i && C87412m.m108589b(this.f151408j, b0Var.f151408j) && C87412m.m108589b(this.f151409k, b0Var.f151409k) && this.f151410l == b0Var.f151410l && this.f151411m == b0Var.f151411m && C87412m.m108589b(this.f151412n, b0Var.f151412n) && C87412m.m108589b(this.f151413o, b0Var.f151413o) && C87412m.m108589b(this.f151414p, b0Var.f151414p) && C87412m.m108589b(this.f151415q, b0Var.f151415q) && C87412m.m108589b(this.f151416r, b0Var.f151416r);
    }

    public int hashCode() {
        long j = this.f151399a;
        long j2 = this.f151400b;
        long j3 = this.f151402d;
        long j4 = this.f151403e;
        long j5 = this.f151406h;
        long j6 = this.f151407i;
        long j7 = this.f151410l;
        return (((((((((((((((((((((((((((((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f151401c.hashCode()) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.f151404f.hashCode()) * 31) + this.f151405g.hashCode()) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + this.f151408j.hashCode()) * 31) + this.f151409k.hashCode()) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f151411m.hashCode()) * 31) + this.f151412n.hashCode()) * 31) + this.f151413o.hashCode()) * 31) + this.f151414p.hashCode()) * 31) + this.f151415q.hashCode()) * 31) + this.f151416r.hashCode();
    }

    public String toString() {
        return "HellVisitorEnterData(feedId=" + this.f151399a + ", liveId=" + this.f151400b + ", userName=" + this.f151401c + ", index=" + this.f151402d + ", onlineNum=" + this.f151403e + ", actionType=" + this.f151404f + ", commentscene=" + this.f151405g + ", enterStatus=" + this.f151406h + ", shareType=" + this.f151407i + ", shareUserName=" + this.f151408j + ", snsFeedid=" + this.f151409k + ", enterTime=" + this.f151410l + ", enterType=" + this.f151411m + ", sessionBuf=" + this.f151412n + ", clickTabContextId=" + this.f151413o + ", clickSubTabContextId=" + this.f151414p + ", chnlExtra=" + this.f151415q + ", talkerUsername=" + this.f151416r + ')';
    }
}
