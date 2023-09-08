package uq1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import te3.C49277ef1;
import te3.C51411tl0;
import te3.C52271zj0;
import te3.C52277zk1;
import te3.C64237ap1;
import te3.C64311db1;
import te3.C64446ig1;
import te3.C64472jk0;
import te3.C64473jl0;
import te3.C64494kj0;
import te3.C64589nq2;
import te3.C64636pq2;
import te3.C64803wi0;

/* renamed from: uq1.u */
public final class C65462u {

    /* renamed from: A */
    public ArrayList<C52277zk1> f188359A;

    /* renamed from: B */
    public C64446ig1 f188360B;

    /* renamed from: a */
    public final int f188361a;

    /* renamed from: b */
    public final String f188362b;

    /* renamed from: c */
    public final C64636pq2 f188363c;

    /* renamed from: d */
    public final C64311db1 f188364d;

    /* renamed from: e */
    public final C64472jk0 f188365e;

    /* renamed from: f */
    public final int f188366f;

    /* renamed from: g */
    public final boolean f188367g;

    /* renamed from: h */
    public final String f188368h;

    /* renamed from: i */
    public final ArrayList<C64589nq2> f188369i;

    /* renamed from: j */
    public final boolean f188370j;

    /* renamed from: k */
    public final boolean f188371k;

    /* renamed from: l */
    public final C64473jl0 f188372l;

    /* renamed from: m */
    public final String f188373m;

    /* renamed from: n */
    public final String f188374n;

    /* renamed from: o */
    public final int f188375o;

    /* renamed from: p */
    public final C49277ef1 f188376p;

    /* renamed from: q */
    public final FinderItem f188377q;

    /* renamed from: r */
    public final LinkedList<FinderJumpInfo> f188378r;

    /* renamed from: s */
    public final C64237ap1 f188379s;

    /* renamed from: t */
    public C51411tl0 f188380t;

    /* renamed from: u */
    public long f188381u;

    /* renamed from: v */
    public final int f188382v;

    /* renamed from: w */
    public C52271zj0 f188383w;

    /* renamed from: x */
    public long f188384x;

    /* renamed from: y */
    public C64494kj0 f188385y;

    /* renamed from: z */
    public C64803wi0 f188386z;

    public C65462u(int i, String str, C64636pq2 pq22, C64311db1 db12, C64472jk0 jk02, int i2, boolean z, String str2, ArrayList<C64589nq2> arrayList, boolean z2, boolean z3, C64473jl0 jl02, String str3, String str4, int i3, C49277ef1 ef12, FinderItem finderItem, LinkedList<FinderJumpInfo> linkedList, C64237ap1 ap12, C51411tl0 tl02, long j, int i4) {
        String str5 = str3;
        String str6 = str4;
        LinkedList<FinderJumpInfo> linkedList2 = linkedList;
        C87412m.m108594g(str, "description");
        C87412m.m108594g(str2, "videoPathBeforeCut");
        C87412m.m108594g(str5, "remoteUrl");
        C87412m.m108594g(str6, "paramsJson");
        C87412m.m108594g(linkedList2, "jumpInfoList");
        this.f188361a = i;
        this.f188362b = str;
        this.f188363c = pq22;
        this.f188364d = db12;
        this.f188365e = jk02;
        this.f188366f = i2;
        this.f188367g = z;
        this.f188368h = str2;
        this.f188369i = arrayList;
        this.f188370j = z2;
        this.f188371k = z3;
        this.f188372l = jl02;
        this.f188373m = str5;
        this.f188374n = str6;
        this.f188375o = i3;
        this.f188376p = ef12;
        this.f188377q = finderItem;
        this.f188378r = linkedList2;
        this.f188379s = ap12;
        this.f188380t = tl02;
        this.f188381u = j;
        this.f188382v = i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65462u)) {
            return false;
        }
        C65462u uVar = (C65462u) obj;
        return this.f188361a == uVar.f188361a && C87412m.m108589b(this.f188362b, uVar.f188362b) && C87412m.m108589b(this.f188363c, uVar.f188363c) && C87412m.m108589b(this.f188364d, uVar.f188364d) && C87412m.m108589b(this.f188365e, uVar.f188365e) && this.f188366f == uVar.f188366f && this.f188367g == uVar.f188367g && C87412m.m108589b(this.f188368h, uVar.f188368h) && C87412m.m108589b(this.f188369i, uVar.f188369i) && this.f188370j == uVar.f188370j && this.f188371k == uVar.f188371k && C87412m.m108589b(this.f188372l, uVar.f188372l) && C87412m.m108589b(this.f188373m, uVar.f188373m) && C87412m.m108589b(this.f188374n, uVar.f188374n) && this.f188375o == uVar.f188375o && C87412m.m108589b(this.f188376p, uVar.f188376p) && C87412m.m108589b(this.f188377q, uVar.f188377q) && C87412m.m108589b(this.f188378r, uVar.f188378r) && C87412m.m108589b(this.f188379s, uVar.f188379s) && C87412m.m108589b(this.f188380t, uVar.f188380t) && this.f188381u == uVar.f188381u && this.f188382v == uVar.f188382v;
    }

    public int hashCode() {
        int hashCode = ((this.f188361a * 31) + this.f188362b.hashCode()) * 31;
        C64636pq2 pq22 = this.f188363c;
        int i = 0;
        int hashCode2 = (hashCode + (pq22 == null ? 0 : pq22.hashCode())) * 31;
        C64311db1 db12 = this.f188364d;
        int hashCode3 = (hashCode2 + (db12 == null ? 0 : db12.hashCode())) * 31;
        C64472jk0 jk02 = this.f188365e;
        int hashCode4 = (((hashCode3 + (jk02 == null ? 0 : jk02.hashCode())) * 31) + this.f188366f) * 31;
        boolean z = this.f188367g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode5 = (((hashCode4 + (z ? 1 : 0)) * 31) + this.f188368h.hashCode()) * 31;
        ArrayList<C64589nq2> arrayList = this.f188369i;
        int hashCode6 = (hashCode5 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        boolean z3 = this.f188370j;
        if (z3) {
            z3 = true;
        }
        int i2 = (hashCode6 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f188371k;
        if (!z4) {
            z2 = z4;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        C64473jl0 jl02 = this.f188372l;
        int hashCode7 = (((((((i3 + (jl02 == null ? 0 : jl02.hashCode())) * 31) + this.f188373m.hashCode()) * 31) + this.f188374n.hashCode()) * 31) + this.f188375o) * 31;
        C49277ef1 ef12 = this.f188376p;
        int hashCode8 = (hashCode7 + (ef12 == null ? 0 : ef12.hashCode())) * 31;
        FinderItem finderItem = this.f188377q;
        int hashCode9 = (((hashCode8 + (finderItem == null ? 0 : finderItem.hashCode())) * 31) + this.f188378r.hashCode()) * 31;
        C64237ap1 ap12 = this.f188379s;
        int hashCode10 = (hashCode9 + (ap12 == null ? 0 : ap12.hashCode())) * 31;
        C51411tl0 tl02 = this.f188380t;
        if (tl02 != null) {
            i = tl02.hashCode();
        }
        long j = this.f188381u;
        return ((((hashCode10 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f188382v;
    }

    public String toString() {
        return "HoldingPostData(mediaType=" + this.f188361a + ", description=" + this.f188362b + ", localContent=" + this.f188363c + ", location=" + this.f188364d + ", extendedReading=" + this.f188365e + ", originalFlag=" + this.f188366f + ", isFromCamera=" + this.f188367g + ", videoPathBeforeCut=" + this.f188368h + ", atContactList=" + this.f188369i + ", isLongVideo=" + this.f188370j + ", isNewsFeed=" + this.f188371k + ", fromAppInfo=" + this.f188372l + ", remoteUrl=" + this.f188373m + ", paramsJson=" + this.f188374n + ", sdkShareType=" + this.f188375o + ", activityEvent=" + this.f188376p + ", draftFinderItem=" + this.f188377q + ", jumpInfoList=" + this.f188378r + ", videoTemplateInfo=" + this.f188379s + ", reportInfo=" + this.f188380t + ", postFlag=" + this.f188381u + ", watermarkFlag=" + this.f188382v + ')';
    }
}
