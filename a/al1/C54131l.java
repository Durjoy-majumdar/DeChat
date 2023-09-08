package al1;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import pe3.C89349b;
import te3.C48965c71;
import te3.C50168kr0;
import te3.C51395th0;
import te3.C51938x81;

/* renamed from: al1.l */
public final class C54131l {

    /* renamed from: a */
    public C89349b f152021a;

    /* renamed from: b */
    public long f152022b;

    /* renamed from: c */
    public String f152023c;

    /* renamed from: d */
    public C50168kr0 f152024d;

    /* renamed from: e */
    public FinderObject f152025e;

    /* renamed from: f */
    public int f152026f;

    /* renamed from: g */
    public String f152027g;

    /* renamed from: h */
    public int f152028h;

    /* renamed from: i */
    public float f152029i;

    /* renamed from: j */
    public float f152030j;

    /* renamed from: k */
    public int f152031k;

    /* renamed from: l */
    public int f152032l;

    /* renamed from: m */
    public String f152033m;

    /* renamed from: n */
    public C51395th0 f152034n;

    /* renamed from: o */
    public int f152035o;

    /* renamed from: p */
    public LinkedList<C48965c71> f152036p;

    /* renamed from: q */
    public int f152037q;

    /* renamed from: r */
    public C51938x81 f152038r;

    /* renamed from: s */
    public boolean f152039s;

    public C54131l() {
        this((C89349b) null, 0, (String) null, (C50168kr0) null, (FinderObject) null, 0, (String) null, 0, 0.0f, 0.0f, 0, 0, (String) null, (C51395th0) null, 0, (LinkedList) null, 0, (C51938x81) null, false, 524287, (C8480h) null);
    }

    public C54131l(C89349b bVar, long j, String str, C50168kr0 kr02, FinderObject finderObject, int i, String str2, int i2, float f, float f2, int i3, int i4, String str3, C51395th0 th02, int i5, LinkedList linkedList, int i6, C51938x81 x812, boolean z, int i7, C8480h hVar) {
        int i8;
        LinkedList linkedList2;
        int i9 = i7;
        C89349b bVar2 = (i9 & 1) != 0 ? null : bVar;
        long j2 = (i9 & 2) != 0 ? 0 : j;
        String str4 = "";
        String str5 = (i9 & 4) != 0 ? str4 : str;
        C50168kr0 kr03 = (i9 & 8) != 0 ? null : kr02;
        FinderObject finderObject2 = (i9 & 16) != 0 ? null : finderObject;
        int i15 = (i9 & 32) != 0 ? 3 : i;
        str4 = (i9 & 64) == 0 ? str2 : str4;
        int i16 = (i9 & 128) != 0 ? 0 : i2;
        float f3 = 0.0f;
        float f4 = (i9 & 256) != 0 ? 0.0f : f;
        f3 = (i9 & 512) == 0 ? f2 : f3;
        int i17 = (i9 & 1024) != 0 ? 0 : i3;
        int i18 = (i9 & 2048) != 0 ? -1 : i4;
        String str6 = (i9 & 4096) != 0 ? null : str3;
        C51395th0 th03 = (i9 & 8192) != 0 ? null : th02;
        int i19 = (i9 & 16384) != 0 ? 0 : i5;
        if ((i9 & 32768) != 0) {
            i8 = i19;
            linkedList2 = new LinkedList();
        } else {
            i8 = i19;
            linkedList2 = linkedList;
        }
        int i25 = (i9 & 65536) != 0 ? 0 : i6;
        C51938x81 x813 = (i9 & 131072) != 0 ? null : x812;
        boolean z2 = (i9 & 262144) != 0 ? false : z;
        C87412m.m108594g(str4, "nonceId");
        C87412m.m108594g(linkedList2, "readList");
        this.f152021a = bVar2;
        this.f152022b = j2;
        this.f152023c = str5;
        this.f152024d = kr03;
        this.f152025e = finderObject2;
        this.f152026f = i15;
        this.f152027g = str4;
        this.f152028h = i16;
        this.f152029i = f4;
        this.f152030j = f3;
        this.f152031k = i17;
        this.f152032l = i18;
        this.f152033m = str6;
        this.f152034n = th03;
        this.f152035o = i8;
        this.f152036p = linkedList2;
        this.f152037q = i25;
        this.f152038r = x813;
        this.f152039s = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54131l)) {
            return false;
        }
        C54131l lVar = (C54131l) obj;
        return C87412m.m108589b(this.f152021a, lVar.f152021a) && this.f152022b == lVar.f152022b && C87412m.m108589b(this.f152023c, lVar.f152023c) && C87412m.m108589b(this.f152024d, lVar.f152024d) && C87412m.m108589b(this.f152025e, lVar.f152025e) && this.f152026f == lVar.f152026f && C87412m.m108589b(this.f152027g, lVar.f152027g) && this.f152028h == lVar.f152028h && C87412m.m108589b(Float.valueOf(this.f152029i), Float.valueOf(lVar.f152029i)) && C87412m.m108589b(Float.valueOf(this.f152030j), Float.valueOf(lVar.f152030j)) && this.f152031k == lVar.f152031k && this.f152032l == lVar.f152032l && C87412m.m108589b(this.f152033m, lVar.f152033m) && C87412m.m108589b(this.f152034n, lVar.f152034n) && this.f152035o == lVar.f152035o && C87412m.m108589b(this.f152036p, lVar.f152036p) && this.f152037q == lVar.f152037q && C87412m.m108589b(this.f152038r, lVar.f152038r) && this.f152039s == lVar.f152039s;
    }

    public int hashCode() {
        C89349b bVar = this.f152021a;
        int i = 0;
        int hashCode = bVar == null ? 0 : bVar.hashCode();
        long j = this.f152022b;
        int i2 = ((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f152023c;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        C50168kr0 kr02 = this.f152024d;
        int hashCode3 = (hashCode2 + (kr02 == null ? 0 : kr02.hashCode())) * 31;
        FinderObject finderObject = this.f152025e;
        int hashCode4 = (((((((((((((((hashCode3 + (finderObject == null ? 0 : finderObject.hashCode())) * 31) + this.f152026f) * 31) + this.f152027g.hashCode()) * 31) + this.f152028h) * 31) + Float.floatToIntBits(this.f152029i)) * 31) + Float.floatToIntBits(this.f152030j)) * 31) + this.f152031k) * 31) + this.f152032l) * 31;
        String str2 = this.f152033m;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C51395th0 th02 = this.f152034n;
        int hashCode6 = (((((((hashCode5 + (th02 == null ? 0 : th02.hashCode())) * 31) + this.f152035o) * 31) + this.f152036p.hashCode()) * 31) + this.f152037q) * 31;
        C51938x81 x812 = this.f152038r;
        if (x812 != null) {
            i = x812.hashCode();
        }
        int i3 = (hashCode6 + i) * 31;
        boolean z = this.f152039s;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public String toString() {
        return "FinderLiveRelatedLoaderParam(lastBuf=" + this.f152021a + ", objectId=" + this.f152022b + ", sessionBuffer=" + this.f152023c + ", lbsTabTipsInfo=" + this.f152024d + ", targetFeedObject=" + this.f152025e + ", tabType=" + this.f152026f + ", nonceId=" + this.f152027g + ", scene=" + this.f152028h + ", long=" + this.f152029i + ", lat=" + this.f152030j + ", commentScene=" + this.f152031k + ", pullMoreType=" + this.f152032l + ", contextId=" + this.f152033m + ", byPassInfo=" + this.f152034n + ", enterScene=" + this.f152035o + ", readList=" + this.f152036p + ", curIndex=" + this.f152037q + ", squareEntranceInfo=" + this.f152038r + ", isFirstPagePreload=" + this.f152039s + ')';
    }
}
