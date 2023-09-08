package dp1;

import ef1.C58553c;
import ef1.C7637b;
import ef1.C7643l;
import ef1.C7645n;

/* renamed from: dp1.g1 */
public final class C7438g1 extends C7643l {

    /* renamed from: s */
    public long f25628s;

    public C7438g1() {
        this((C58553c) null);
    }

    /* renamed from: d */
    public void mo8584d() {
        super.mo8584d();
        this.f25628s = -1;
    }

    /* renamed from: g */
    public C7637b mo8585g(int i) {
        return new C7645n(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x01b9 A[LOOP:0: B:14:0x009c->B:70:0x01b9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01c0 A[EDGE_INSN: B:89:0x01c0->B:71:0x01c0 ?: BREAK  , SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ef1.C7642k mo8586h(androidx.recyclerview.widget.RecyclerView r22, int r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.String r2 = "recyclerView"
            gy3.C87412m.m108594g(r1, r2)
            ef1.k r2 = super.mo8587b(r22, r23)
            ef1.n r2 = (ef1.C7645n) r2
            long r3 = r0.f25628s
            r2.f25964l = r3
            int r3 = r0.f167611e
            r2.f25965m = r3
            int r3 = r0.f167612f
            r2.f25966n = r3
            er1.w3 r3 = er1.C58784w3.f168295a
            android.graphics.Rect r4 = r0.f167610d
            r3.getClass()
            java.lang.String r3 = "globalVisibleRect"
            gy3.C87412m.m108594g(r4, r3)
            r3 = 3
            r5 = 3
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0033
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            goto L_0x0034
        L_0x0033:
            r5 = 0
        L_0x0034:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x003e
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            java.lang.String r8 = "feedDataList"
            gy3.C87412m.m108594g(r5, r8)
            java.lang.String r8 = "notFeedDataList"
            gy3.C87412m.m108594g(r3, r8)
            androidx.recyclerview.widget.RecyclerView$e r8 = r22.getAdapter()
            boolean r9 = r8 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r9 == 0) goto L_0x01c0
            androidx.recyclerview.widget.RecyclerView$LayoutManager r9 = r22.getLayoutManager()
            boolean r9 = r9 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r9 == 0) goto L_0x01c0
            androidx.recyclerview.widget.RecyclerView$LayoutManager r9 = r22.getLayoutManager()
            java.lang.String r10 = "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"
            gy3.C87412m.m108592e(r9, r10)
            androidx.recyclerview.widget.LinearLayoutManager r9 = (androidx.recyclerview.widget.LinearLayoutManager) r9
            int r9 = r9.mo16957C()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r11 = r22.getLayoutManager()
            gy3.C87412m.m108592e(r11, r10)
            androidx.recyclerview.widget.LinearLayoutManager r11 = (androidx.recyclerview.widget.LinearLayoutManager) r11
            int r10 = r11.mo16959E()
            java.lang.String r11 = er1.C58784w3.f168296b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "[getVisibleFeedListByAdapterPosRange] old="
            r12.append(r13)
            int r13 = r22.getChildCount()
            r12.append(r13)
            java.lang.String r13 = " new="
            r12.append(r13)
            int r13 = r10 - r9
            int r13 = r13 + r6
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            if (r9 > r10) goto L_0x01c0
        L_0x009c:
            androidx.recyclerview.widget.RecyclerView$z r11 = r1.mo17023I0(r9)
            if (r11 == 0) goto L_0x01b4
            android.view.View r12 = r11.f44854d
            java.lang.String r13 = "childHolder.itemView"
            gy3.C87412m.m108593f(r12, r13)
            boolean r13 = r11 instanceof jq3.C60905o
            if (r13 == 0) goto L_0x01b4
            jq3.o r11 = (jq3.C60905o) r11
            java.lang.Object r11 = r11.f173503E
            jq3.c r11 = (jq3.C9493c) r11
            r13 = r8
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r13 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r13
            int r14 = r13.mo85796c6()
            int r17 = r9 - r14
            boolean r14 = r11 instanceof cm1.C0740i2
            if (r14 == 0) goto L_0x01b4
            long r14 = r11.getItemId()
            r18 = 0
            int r16 = (r14 > r18 ? 1 : (r14 == r18 ? 0 : -1))
            if (r16 == 0) goto L_0x01b4
            ef1.i r14 = new ef1.i
            r16 = r11
            cm1.i2 r16 = (cm1.C0740i2) r16
            r18 = 0
            r19 = 4
            r20 = 0
            r15 = r14
            r15.<init>(r16, r17, r18, r19, r20)
            boolean r15 = r11 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r15 == 0) goto L_0x0199
            android.util.LongSparseArray<jq3.q> r13 = r13.f165744w
            long r6 = r11.getItemId()
            java.lang.Object r6 = r13.get(r6)
            jq3.q r6 = (jq3.C9508q) r6
            if (r6 == 0) goto L_0x0195
            r7 = r11
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r7 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r7
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()
            te3.bl0 r7 = r7.getFoldedLayout()
            if (r7 == 0) goto L_0x018f
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r15 = 0
            r1.getChildVisibleRect(r12, r7, r15)
            int r13 = r4.top
            r6.f29684e = r13
            int r13 = r4.bottom
            r6.f29685f = r13
            int r7 = r7.top
            r6.f29683d = r7
            r7 = 2131302308(0x7f0917a4, float:1.8222698E38)
            android.view.View r7 = r12.findViewById(r7)
            com.tencent.mm.plugin.finder.view.FinderFoldedScrollLayout r7 = (com.tencent.p014mm.plugin.finder.view.FinderFoldedScrollLayout) r7
            if (r7 == 0) goto L_0x018f
            int r12 = r7.getVisibility()
            if (r12 != 0) goto L_0x0121
            r12 = 1
            goto L_0x0122
        L_0x0121:
            r12 = 0
        L_0x0122:
            if (r12 == 0) goto L_0x0125
            goto L_0x0126
        L_0x0125:
            r7 = r15
        L_0x0126:
            if (r7 == 0) goto L_0x018f
            android.view.ViewParent r12 = r7.getParent()
            if (r12 == 0) goto L_0x018f
            android.view.ViewParent r12 = r12.getParent()
            if (r12 == 0) goto L_0x018f
            boolean r15 = r12 instanceof android.view.View
            if (r15 == 0) goto L_0x018f
            r15 = r12
            android.view.View r15 = (android.view.View) r15
            int r13 = r15.getTop()
            r6.f29686g = r13
            java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
            r18 = r4
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r4 = r7.getAdapter()
            r13.<init>(r4)
            r6.f29690k = r13
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r4 = r7.getAdapter()
            android.util.LongSparseArray<jq3.s> r4 = r4.f165735A
            r6.f29689j = r4
            int r4 = r6.f29686g
            if (r4 != 0) goto L_0x0163
            er1.d4 r4 = new er1.d4
            r4.<init>(r6, r12)
            r15.post(r4)
            goto L_0x0191
        L_0x0163:
            int r7 = r6.f29685f
            int r12 = r6.f29684e
            int r7 = r7 - r12
            int r12 = r6.f29683d
            int r7 = r7 - r12
            if (r7 <= r4) goto L_0x0184
            boolean r4 = r6.f29687h
            if (r4 != 0) goto L_0x0191
            r4 = 1
            r6.f29687h = r4
            java.lang.ref.WeakReference<com.tencent.mm.view.recyclerview.WxRecyclerAdapter<?>> r4 = r6.f29690k
            if (r4 == 0) goto L_0x0191
            java.lang.Object r4 = r4.get()
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r4 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r4
            if (r4 == 0) goto L_0x0191
            r4.mo82616y6()
            goto L_0x0191
        L_0x0184:
            boolean r4 = r6.f29687h
            if (r4 == 0) goto L_0x0191
            r4 = 0
            r6.f29687h = r4
            r4 = 1
            r6.f29688i = r4
            goto L_0x0192
        L_0x018f:
            r18 = r4
        L_0x0191:
            r4 = 1
        L_0x0192:
            r14.f167638c = r6
            goto L_0x01ac
        L_0x0195:
            r18 = r4
            r4 = 1
            goto L_0x01ac
        L_0x0199:
            r18 = r4
            r4 = 1
            android.util.LongSparseArray<jq3.q> r6 = r13.f165744w
            long r12 = r11.getItemId()
            java.lang.Object r6 = r6.get(r12)
            jq3.q r6 = (jq3.C9508q) r6
            if (r6 == 0) goto L_0x01ac
            r14.f167638c = r6
        L_0x01ac:
            boolean r6 = r11 instanceof cm1.C0707a0
            if (r6 != 0) goto L_0x01b7
            r5.add(r14)
            goto L_0x01b7
        L_0x01b4:
            r18 = r4
            r4 = 1
        L_0x01b7:
            if (r9 == r10) goto L_0x01c0
            int r9 = r9 + 1
            r4 = r18
            r6 = 1
            goto L_0x009c
        L_0x01c0:
            r2.f25968p = r5
            r2.f25969q = r3
            int r3 = r0.f167611e
            int r4 = r2.f25953d
            if (r3 != r4) goto L_0x01d0
            int r5 = r0.f167612f
            int r6 = r2.f25955f
            if (r5 == r6) goto L_0x01ee
        L_0x01d0:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r5) goto L_0x01e4
            int r6 = r0.f167612f
            if (r6 != r5) goto L_0x01da
            goto L_0x01e4
        L_0x01da:
            if (r4 >= r3) goto L_0x01dd
            r3 = r4
        L_0x01dd:
            int r4 = r2.f25955f
            if (r4 <= r6) goto L_0x01e2
            r6 = r4
        L_0x01e2:
            r4 = r3
            goto L_0x01e6
        L_0x01e4:
            int r6 = r2.f25955f
        L_0x01e6:
            er1.w3 r3 = er1.C58784w3.f168295a
            java.util.List r1 = r3.mo83903U(r4, r6, r1)
            r2.f25967o = r1
        L_0x01ee:
            long r3 = r2.f25958i
            r0.f25628s = r3
            int r1 = r2.f25953d
            r0.f167611e = r1
            int r1 = r2.f25955f
            r0.f167612f = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dp1.C7438g1.mo8586h(androidx.recyclerview.widget.RecyclerView, int):ef1.k");
    }

    public C7438g1(C58553c cVar) {
        super(cVar);
        this.f25628s = -1;
    }
}
