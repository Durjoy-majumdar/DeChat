package ak1;

import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import gy3.C8480h;
import gy3.C87412m;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: ak1.m0 */
public final class C54099m0 {

    /* renamed from: a */
    public String f151824a;

    /* renamed from: b */
    public String f151825b;

    /* renamed from: c */
    public String f151826c;

    /* renamed from: d */
    public long f151827d;

    /* renamed from: e */
    public long f151828e;

    /* renamed from: f */
    public long f151829f;

    /* renamed from: g */
    public long f151830g;

    /* renamed from: h */
    public long f151831h;

    /* renamed from: i */
    public long f151832i;

    /* renamed from: j */
    public long f151833j;

    /* renamed from: k */
    public int f151834k;

    /* renamed from: l */
    public long f151835l;

    /* renamed from: m */
    public long f151836m;

    /* renamed from: n */
    public long f151837n;

    /* renamed from: o */
    public long f151838o;

    /* renamed from: p */
    public long f151839p;

    /* renamed from: q */
    public long f151840q;

    /* renamed from: r */
    public long f151841r;

    /* renamed from: s */
    public long f151842s;

    /* renamed from: t */
    public long f151843t;

    /* renamed from: u */
    public long f151844u;

    /* renamed from: v */
    public final HashMap<Long, LinkedList<C54118z>> f151845v;

    /* renamed from: w */
    public long f151846w;

    /* renamed from: x */
    public long f151847x;

    /* renamed from: y */
    public String f151848y;

    public C54099m0() {
        this((String) null, (String) null, (String) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (HashMap) null, 0, 0, (String) null, 33554431, (C8480h) null);
    }

    public C54099m0(String str, String str2, String str3, long j, long j2, long j3, long j4, long j5, long j6, long j7, int i, long j8, long j9, long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, HashMap hashMap, long j28, long j29, String str4, int i2, C8480h hVar) {
        int i3 = i2;
        String str5 = (i3 & 1) != 0 ? "" : str;
        String str6 = (i3 & 2) != 0 ? "" : str2;
        String str7 = (i3 & 4) != 0 ? "" : str3;
        long j35 = (i3 & 8) != 0 ? 0 : j;
        long j36 = (i3 & 16) != 0 ? 0 : j2;
        long j37 = (i3 & 32) != 0 ? 0 : j3;
        long j38 = (i3 & 64) != 0 ? 0 : j4;
        long j39 = (i3 & 128) != 0 ? 0 : j5;
        long j44 = (i3 & 256) != 0 ? 0 : j6;
        long j45 = (i3 & 512) != 0 ? 0 : j7;
        int i4 = (i3 & 1024) != 0 ? 0 : i;
        String str8 = "";
        long j46 = (i3 & 2048) != 0 ? 0 : j8;
        long j47 = (i3 & 4096) != 0 ? 0 : j9;
        long j48 = (i3 & 8192) != 0 ? 0 : j15;
        long j49 = (i3 & 16384) != 0 ? 0 : j16;
        long j54 = (32768 & i3) != 0 ? 0 : j17;
        long j55 = (65536 & i3) != 0 ? 0 : j18;
        long j56 = (131072 & i3) != 0 ? 0 : j19;
        long j57 = (262144 & i3) != 0 ? 0 : j25;
        long j58 = (524288 & i3) != 0 ? 0 : j26;
        long j59 = (1048576 & i3) != 0 ? 0 : j27;
        HashMap hashMap2 = (2097152 & i3) != 0 ? new HashMap() : hashMap;
        long j64 = (i3 & 4194304) != 0 ? 0 : j28;
        long j65 = (i3 & 8388608) != 0 ? 0 : j29;
        String str9 = (i3 & TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0 ? str8 : str4;
        C87412m.m108594g(str5, "liveId");
        C87412m.m108594g(str6, "feedId");
        C87412m.m108594g(str7, "description");
        C87412m.m108594g(hashMap2, "promoteGoods");
        C87412m.m108594g(str9, "shopWindowId");
        this.f151824a = str5;
        this.f151825b = str6;
        this.f151826c = str7;
        this.f151827d = j35;
        this.f151828e = j36;
        this.f151829f = j37;
        this.f151830g = j38;
        this.f151831h = j39;
        this.f151832i = j44;
        this.f151833j = j45;
        this.f151834k = i4;
        this.f151835l = j46;
        this.f151836m = j47;
        this.f151837n = j48;
        this.f151838o = j49;
        this.f151839p = j54;
        this.f151840q = j55;
        this.f151841r = j56;
        this.f151842s = j57;
        this.f151843t = j58;
        this.f151844u = j59;
        this.f151845v = hashMap2;
        this.f151846w = j64;
        this.f151847x = j65;
        this.f151848y = str9;
    }

    /* renamed from: a */
    public final long mo74784a() {
        return this.f151835l;
    }

    /* renamed from: b */
    public final long mo74785b() {
        return this.f151846w;
    }

    /* renamed from: c */
    public final void mo74786c(long j) {
        this.f151835l = j;
    }

    /* renamed from: d */
    public final void mo74787d(long j) {
        this.f151846w = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54099m0)) {
            return false;
        }
        C54099m0 m0Var = (C54099m0) obj;
        return C87412m.m108589b(this.f151824a, m0Var.f151824a) && C87412m.m108589b(this.f151825b, m0Var.f151825b) && C87412m.m108589b(this.f151826c, m0Var.f151826c) && this.f151827d == m0Var.f151827d && this.f151828e == m0Var.f151828e && this.f151829f == m0Var.f151829f && this.f151830g == m0Var.f151830g && this.f151831h == m0Var.f151831h && this.f151832i == m0Var.f151832i && this.f151833j == m0Var.f151833j && this.f151834k == m0Var.f151834k && this.f151835l == m0Var.f151835l && this.f151836m == m0Var.f151836m && this.f151837n == m0Var.f151837n && this.f151838o == m0Var.f151838o && this.f151839p == m0Var.f151839p && this.f151840q == m0Var.f151840q && this.f151841r == m0Var.f151841r && this.f151842s == m0Var.f151842s && this.f151843t == m0Var.f151843t && this.f151844u == m0Var.f151844u && C87412m.m108589b(this.f151845v, m0Var.f151845v) && this.f151846w == m0Var.f151846w && this.f151847x == m0Var.f151847x && C87412m.m108589b(this.f151848y, m0Var.f151848y);
    }

    public int hashCode() {
        long j = this.f151827d;
        long j2 = this.f151828e;
        long j3 = this.f151829f;
        long j4 = this.f151830g;
        long j5 = this.f151831h;
        long j6 = this.f151832i;
        long j7 = this.f151833j;
        long j8 = this.f151835l;
        long j9 = this.f151836m;
        long j15 = this.f151837n;
        long j16 = this.f151838o;
        long j17 = this.f151839p;
        long j18 = this.f151840q;
        long j19 = this.f151841r;
        long j25 = this.f151842s;
        long j26 = this.f151843t;
        long j27 = this.f151844u;
        long j28 = this.f151846w;
        long j29 = this.f151847x;
        return (((((((((((((((((((((((((((((((((((((((((((((((this.f151824a.hashCode() * 31) + this.f151825b.hashCode()) * 31) + this.f151826c.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f151834k) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31) + ((int) (j15 ^ (j15 >>> 32)))) * 31) + ((int) (j16 ^ (j16 >>> 32)))) * 31) + ((int) (j17 ^ (j17 >>> 32)))) * 31) + ((int) (j18 ^ (j18 >>> 32)))) * 31) + ((int) (j19 ^ (j19 >>> 32)))) * 31) + ((int) (j25 ^ (j25 >>> 32)))) * 31) + ((int) (j26 ^ (j26 >>> 32)))) * 31) + ((int) (j27 ^ (j27 >>> 32)))) * 31) + this.f151845v.hashCode()) * 31) + ((int) (j28 ^ (j28 >>> 32)))) * 31) + ((int) (j29 ^ (j29 >>> 32)))) * 31) + this.f151848y.hashCode();
    }

    public String toString() {
        return "LiveStaticsData_21056(liveId=" + this.f151824a + ", feedId=" + this.f151825b + ", description=" + this.f151826c + ", liveStartTimeMs=" + this.f151827d + ", liveEndTimeMs=" + this.f151828e + ", oriFansCount=" + this.f151829f + ", liveDurationSeconds=" + this.f151830g + ", audienceCount=" + this.f151831h + ", likeCount=" + this.f151832i + ", newFansNum=" + this.f151833j + ", errorCode=" + this.f151834k + ", floatingCount=" + this.f151835l + ", shareSnsCount=" + this.f151836m + ", shareSessionCount=" + this.f151837n + ", exchangeCameraCount=" + this.f151838o + ", complainCount=" + this.f151839p + ", allCommentCloseCount=" + this.f151840q + ", allCommentOpenCount=" + this.f151841r + ", personalCommentCloseCount=" + this.f151842s + ", personalCommentOpenCount=" + this.f151843t + ", kickOutCount=" + this.f151844u + ", promoteGoods=" + this.f151845v + ", topComment=" + this.f151846w + ", tickleTimes=" + this.f151847x + ", shopWindowId=" + this.f151848y + ')';
    }
}
