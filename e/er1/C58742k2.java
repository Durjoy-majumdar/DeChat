package er1;

import fy3.C32226l;
import hp3.C87581a;
import rx3.C13598b0;
import te3.C50858pp0;
import te3.C64287ci1;

/* renamed from: er1.k2 */
public final class C58742k2<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C64287ci1 f168198a;

    /* renamed from: b */
    public final /* synthetic */ C32226l<C50858pp0, C13598b0> f168199b;

    public C58742k2(C64287ci1 ci12, C32226l<? super C50858pp0, C13598b0> lVar) {
        this.f168198a = ci12;
        this.f168199b = lVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: te3.xn2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call(java.lang.Object r12) {
        /*
            r11 = this;
            ob0.b$c r12 = (ob0.C89132b.C89134c) r12
            int r0 = r12.f256793a
            if (r0 != 0) goto L_0x01b4
            int r0 = r12.f256794b
            if (r0 != 0) goto L_0x01b4
            T r0 = r12.f256796d
            te3.pp0 r0 = (te3.C50858pp0) r0
            te3.fp1 r0 = r0.f139889d
            if (r0 == 0) goto L_0x01b4
            te3.ci1 r1 = r11.f168198a
            te3.l40 r2 = r0.f183185p
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x001e
            java.lang.String r4 = r2.f184031d
            if (r4 != 0) goto L_0x001f
        L_0x001e:
            r4 = r3
        L_0x001f:
            r1.f182500i = r4
            if (r2 == 0) goto L_0x0027
            java.lang.String r2 = r2.f184032e
            if (r2 != 0) goto L_0x0028
        L_0x0027:
            r2 = r3
        L_0x0028:
            r1.f182501j = r2
            long r4 = r0.f183176d
            java.lang.String r2 = o40.C61926c.m72691p(r4)
            r1.f182502n = r2
            java.util.LinkedList<java.lang.String> r2 = r0.f183178f
            java.lang.String r4 = "productInfo.img_urls"
            gy3.C87412m.m108593f(r2, r4)
            r4 = 0
            java.lang.Object r2 = sx3.C110818d0.m150917O(r2, r4)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0043
            r2 = r3
        L_0x0043:
            r1.f182503o = r2
            java.lang.String r2 = r0.f183177e
            if (r2 != 0) goto L_0x004a
            r2 = r3
        L_0x004a:
            r1.f182504p = r2
            int r2 = r0.f183181i
            r1.f182506r = r2
            int r2 = r0.f183173S
            r5 = 1
            if (r2 == 0) goto L_0x0057
            r2 = 1
            goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            r1.f182494H = r2
            T r2 = r12.f256796d
            te3.pp0 r2 = (te3.C50858pp0) r2
            java.lang.String r2 = r2.f139893h
            r1.f182514z = r2
            java.util.LinkedList<java.lang.String> r2 = r0.f183171Q
            java.lang.String r6 = "productInfo.icon_urls"
            gy3.C87412m.m108593f(r2, r6)
            java.lang.Object r2 = sx3.C110818d0.m150916N(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.f182487A = r2
            java.util.LinkedList<java.lang.String> r2 = r0.f183171Q
            gy3.C87412m.m108593f(r2, r6)
            java.lang.Object r2 = sx3.C110818d0.m150917O(r2, r5)
            java.lang.String r2 = (java.lang.String) r2
            r1.f182489C = r2
            int r2 = r0.f183168M
            if (r2 == 0) goto L_0x0086
            int r2 = r0.f183180h
            r1.f182505q = r2
        L_0x0086:
            java.util.LinkedList<te3.z44> r2 = r0.f183165J
            java.lang.String r6 = "productInfo.show_box_items"
            gy3.C87412m.m108593f(r2, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0096:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00b1
            java.lang.Object r7 = r2.next()
            r8 = r7
            te3.z44 r8 = (te3.z44) r8
            int r8 = r8.f186625d
            r9 = 6
            if (r8 != r9) goto L_0x00aa
            r8 = 1
            goto L_0x00ab
        L_0x00aa:
            r8 = 0
        L_0x00ab:
            if (r8 == 0) goto L_0x0096
            r6.add(r7)
            goto L_0x0096
        L_0x00b1:
            java.util.Iterator r2 = r6.iterator()
            r6 = 0
        L_0x00b6:
            boolean r7 = r2.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x0113
            java.lang.Object r7 = r2.next()
            int r9 = r6 + 1
            if (r6 < 0) goto L_0x010f
            te3.z44 r7 = (te3.z44) r7
            if (r6 == 0) goto L_0x00f9
            if (r6 == r5) goto L_0x00e4
            r10 = 2
            if (r6 == r10) goto L_0x00cf
            goto L_0x010d
        L_0x00cf:
            te3.ge2 r6 = new te3.ge2
            r6.<init>()
            pe3.b r7 = r7.f186626e
            if (r7 == 0) goto L_0x00dc
            byte[] r8 = r7.mo123703f()
        L_0x00dc:
            r6.parseFrom(r8)
            java.lang.String r6 = r6.f183317d
            r1.f182493G = r6
            goto L_0x010d
        L_0x00e4:
            te3.ge2 r6 = new te3.ge2
            r6.<init>()
            pe3.b r7 = r7.f186626e
            if (r7 == 0) goto L_0x00f1
            byte[] r8 = r7.mo123703f()
        L_0x00f1:
            r6.parseFrom(r8)
            java.lang.String r6 = r6.f183317d
            r1.f182492F = r6
            goto L_0x010d
        L_0x00f9:
            te3.ge2 r6 = new te3.ge2
            r6.<init>()
            pe3.b r7 = r7.f186626e
            if (r7 == 0) goto L_0x0106
            byte[] r8 = r7.mo123703f()
        L_0x0106:
            r6.parseFrom(r8)
            java.lang.String r6 = r6.f183317d
            r1.f182491E = r6
        L_0x010d:
            r6 = r9
            goto L_0x00b6
        L_0x010f:
            sx3.C64197v.m75542k()
            throw r8
        L_0x0113:
            java.util.LinkedList<te3.z44> r2 = r0.f183165J
            java.lang.String r6 = "this.show_box_items"
            gy3.C87412m.m108593f(r2, r6)
            java.util.Iterator r2 = r2.iterator()
        L_0x011f:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0136
            java.lang.Object r6 = r2.next()
            r7 = r6
            te3.z44 r7 = (te3.z44) r7
            int r7 = r7.f186625d
            if (r7 != r5) goto L_0x0132
            r7 = 1
            goto L_0x0133
        L_0x0132:
            r7 = 0
        L_0x0133:
            if (r7 == 0) goto L_0x011f
            goto L_0x0137
        L_0x0136:
            r6 = r8
        L_0x0137:
            te3.z44 r6 = (te3.z44) r6
            if (r6 == 0) goto L_0x014b
            pe3.b r2 = r6.f186626e
            if (r2 == 0) goto L_0x014b
            te3.xn2 r8 = new te3.xn2
            r8.<init>()
            byte[] r2 = r2.mo123703f()
            r8.parseFrom(r2)
        L_0x014b:
            java.lang.String r2 = "Finder.FinderProductShareUtil"
            if (r8 == 0) goto L_0x0193
            long r4 = eb0.C31543z5.m39453c()
            long r6 = r8.f186353e
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x0160
            int r6 = r8.f186352d
            if (r6 <= 0) goto L_0x0160
            r1.f182510v = r6
            goto L_0x018f
        L_0x0160:
            er1.f2 r6 = er1.C58719f2.f168110a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r0.f183177e
            r6.append(r7)
            java.lang.String r7 = ",discount_price:"
            r6.append(r7)
            int r7 = r8.f186352d
            r6.append(r7)
            java.lang.String r7 = ", serverTime:"
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = ",end_time_ms:"
            r6.append(r4)
            long r4 = r8.f186353e
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
        L_0x018f:
            long r4 = r8.f186353e
            r1.f182511w = r4
        L_0x0193:
            java.lang.String r0 = r0.f183193x
            if (r0 != 0) goto L_0x0198
            goto L_0x0199
        L_0x0198:
            r3 = r0
        L_0x0199:
            er1.f2 r0 = er1.C58719f2.f168110a
            java.lang.String r4 = "Finder.FinderProductShareUtil_requestProductInfoOk"
            r0.mo83634g(r1, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "requestId:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
        L_0x01b4:
            er1.j2 r0 = new er1.j2
            fy3.l<te3.pp0, rx3.b0> r1 = r11.f168199b
            r0.<init>(r1, r12)
            o40.C61926c.m72668M(r0)
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: er1.C58742k2.call(java.lang.Object):java.lang.Object");
    }
}
