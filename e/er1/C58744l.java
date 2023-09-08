package er1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.storage.FeedData;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedList;
import jq3.C60905o;
import o40.C61926c;

/* renamed from: er1.l */
public final class C58744l {

    /* renamed from: a */
    public boolean f168203a;

    /* renamed from: b */
    public long f168204b;

    /* renamed from: c */
    public String f168205c;

    /* renamed from: d */
    public FeedData f168206d;

    /* renamed from: e */
    public int f168207e;

    /* renamed from: f */
    public int f168208f;

    /* renamed from: g */
    public C60905o f168209g;

    /* renamed from: h */
    public C0740i2 f168210h;

    /* renamed from: i */
    public final LinkedList<C58744l> f168211i;

    public C58744l() {
        this(false, 0, (String) null, (FeedData) null, 0, 0, (C60905o) null, (C0740i2) null, 255, (C8480h) null);
    }

    public C58744l(boolean z, long j, String str, FeedData feedData, int i, int i2, C60905o oVar, C0740i2 i2Var) {
        C87412m.m108594g(str, "mediaId");
        this.f168203a = z;
        this.f168204b = j;
        this.f168205c = str;
        this.f168206d = feedData;
        this.f168207e = i;
        this.f168208f = i2;
        this.f168209g = oVar;
        this.f168210h = i2Var;
        this.f168211i = new LinkedList<>();
    }

    /* renamed from: a */
    public static C58744l m68320a(C58744l lVar, boolean z, long j, String str, FeedData feedData, int i, int i2, C60905o oVar, C0740i2 i2Var, int i3, Object obj) {
        C58744l lVar2 = lVar;
        int i4 = i3;
        boolean z2 = (i4 & 1) != 0 ? lVar2.f168203a : z;
        long j2 = (i4 & 2) != 0 ? lVar2.f168204b : j;
        String str2 = (i4 & 4) != 0 ? lVar2.f168205c : str;
        FeedData feedData2 = (i4 & 8) != 0 ? lVar2.f168206d : feedData;
        int i5 = (i4 & 16) != 0 ? lVar2.f168207e : i;
        int i6 = (i4 & 32) != 0 ? lVar2.f168208f : i2;
        C60905o oVar2 = (i4 & 64) != 0 ? lVar2.f168209g : oVar;
        C0740i2 i2Var2 = (i4 & 128) != 0 ? lVar2.f168210h : i2Var;
        lVar.getClass();
        C87412m.m108594g(str2, "mediaId");
        return new C58744l(z2, j2, str2, feedData2, i5, i6, oVar2, i2Var2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58744l)) {
            return false;
        }
        C58744l lVar = (C58744l) obj;
        return this.f168203a == lVar.f168203a && this.f168204b == lVar.f168204b && C87412m.m108589b(this.f168205c, lVar.f168205c) && C87412m.m108589b(this.f168206d, lVar.f168206d) && this.f168207e == lVar.f168207e && this.f168208f == lVar.f168208f && C87412m.m108589b(this.f168209g, lVar.f168209g) && C87412m.m108589b(this.f168210h, lVar.f168210h);
    }

    public int hashCode() {
        boolean z = this.f168203a;
        if (z) {
            z = true;
        }
        long j = this.f168204b;
        int hashCode = (((((z ? 1 : 0) * true) + ((int) (j ^ (j >>> 32)))) * 31) + this.f168205c.hashCode()) * 31;
        FeedData feedData = this.f168206d;
        int i = 0;
        int hashCode2 = (((((hashCode + (feedData == null ? 0 : feedData.hashCode())) * 31) + this.f168207e) * 31) + this.f168208f) * 31;
        C60905o oVar = this.f168209g;
        int hashCode3 = (hashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        C0740i2 i2Var = this.f168210h;
        if (i2Var != null) {
            i = i2Var.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("isValid=");
        sb.append(this.f168203a);
        sb.append(" feedType=");
        sb.append(this.f168207e);
        sb.append(" feedPosition=");
        sb.append(this.f168208f);
        sb.append(" feedId=");
        sb.append(C61926c.m72691p(this.f168204b));
        sb.append(" mediaId=");
        sb.append(this.f168205c);
        sb.append(" holder=");
        boolean z = true;
        sb.append(this.f168209g != null);
        sb.append(" centerList=");
        sb.append(this.f168211i.size());
        sb.append(" feed=");
        if (this.f168206d != null) {
            z = false;
        }
        sb.append(z);
        return sb.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C58744l(boolean r11, long r12, java.lang.String r14, com.tencent.p014mm.plugin.finder.storage.FeedData r15, int r16, int r17, jq3.C60905o r18, cm1.C0740i2 r19, int r20, gy3.C8480h r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = r11
        L_0x0009:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0010
            r2 = 0
            goto L_0x0011
        L_0x0010:
            r2 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = ""
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L_0x0020
            r5 = r6
            goto L_0x0021
        L_0x0020:
            r5 = r15
        L_0x0021:
            r7 = r0 & 16
            r8 = 0
            if (r7 == 0) goto L_0x0028
            r7 = 0
            goto L_0x002a
        L_0x0028:
            r7 = r16
        L_0x002a:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r8 = r17
        L_0x0031:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0037
            r9 = r6
            goto L_0x0039
        L_0x0037:
            r9 = r18
        L_0x0039:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r6 = r19
        L_0x0040:
            r11 = r10
            r12 = r1
            r13 = r2
            r15 = r4
            r16 = r5
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r6
            r11.<init>(r12, r13, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58744l.<init>(boolean, long, java.lang.String, com.tencent.mm.plugin.finder.storage.FeedData, int, int, jq3.o, cm1.i2, int, gy3.h):void");
    }
}
