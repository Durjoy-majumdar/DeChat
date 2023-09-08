package lm1;

import android.view.View;
import lm1.C10554j;
import te3.C51942x91;

/* renamed from: lm1.k */
public final class C10566k implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C10554j.C10556b f31874d;

    /* renamed from: e */
    public final /* synthetic */ int f31875e;

    /* renamed from: f */
    public final /* synthetic */ C10554j f31876f;

    /* renamed from: g */
    public final /* synthetic */ C51942x91 f31877g;

    public C10566k(C10554j.C10556b bVar, int i, C10554j jVar, C51942x91 x912) {
        this.f31874d = bVar;
        this.f31875e = i;
        this.f31876f = jVar;
        this.f31877g = x912;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r35) {
        /*
            r34 = this;
            r6 = r34
            java.lang.Class<ir.n> r7 = p565ir.C60606n.class
            java.lang.Class<h81.i> r8 = h81.C59774i.class
            java.lang.Class<rs1.s8> r9 = rs1.C13442s8.class
            java.lang.Class<ln1.f> r10 = ln1.C10584f.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r35
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLiveViewCallback$SubTabAdapter$onBindViewHolder$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r34
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            lm1.j$b r0 = r6.f31874d
            int r1 = r0.f31861d
            int r2 = r6.f31875e
            r0.f31861d = r2
            r0.notifyItemChanged(r1)
            lm1.j$b r0 = r6.f31874d
            int r1 = r0.f31861d
            r0.notifyItemChanged(r1)
            bl3.r r0 = bl3.C39818r.f106831a
            lm1.j r1 = r6.f31876f
            com.tencent.mm.ui.MMActivity r1 = r1.f31843d
            bl3.r$a r1 = r0.mo62444c(r1)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r10)
            ln1.f r1 = (ln1.C10584f) r1
            java.lang.String r2 = "switch_extra"
            r4 = 3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "SubTabContextID"
            java.lang.String r11 = "TabContextID"
            java.lang.String r12 = "sessionid"
            java.lang.String r13 = "sub_tab_id"
            java.lang.String r14 = "tab_id"
            r3 = 1
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = ";"
            r17 = r10
            java.lang.String r10 = ","
            r18 = r2
            java.lang.String r2 = "pgUdfKv.toString()"
            r19 = r7
            java.lang.String r7 = "enter_type"
            r20 = r3
            java.lang.String r3 = "is_new_square"
            r21 = r10
            java.lang.String r10 = "page_tab_"
            r22 = r2
            java.lang.String r2 = ""
            r23 = 0
            r24 = r2
            java.lang.String r2 = "SimpleUIComponent"
            if (r1 == 0) goto L_0x01de
            r25 = r4
            lm1.j r4 = r6.f31876f
            com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment r4 = r4.f31844e
            boolean r6 = r1.f31929n
            if (r6 == 0) goto L_0x0096
            java.lang.String r1 = "liveTabPageOut return for isNeverPageIn"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r1)
            goto L_0x009e
        L_0x0096:
            boolean r6 = r4 instanceof com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment
            if (r6 != 0) goto L_0x00a0
            boolean r6 = r4 instanceof com.tencent.p014mm.plugin.finder.nearby.live.localcity.NearbyLiveLocalCityFragment
            if (r6 != 0) goto L_0x00a0
        L_0x009e:
            goto L_0x01e0
        L_0x00a0:
            java.lang.String r6 = r4.mo3553U()
            r26 = r2
            java.lang.String r2 = r4.mo3552T()
            r27 = r7
            boolean r7 = r4 instanceof com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment
            if (r7 == 0) goto L_0x00b4
            r7 = r4
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r7 = (com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) r7
            goto L_0x00b6
        L_0x00b4:
            r7 = r23
        L_0x00b6:
            if (r7 == 0) goto L_0x00cc
            te3.x91 r7 = r7.f15691s
            if (r7 == 0) goto L_0x00cc
            int r7 = r7.f144531d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r7 = r7.toString()
            if (r7 != 0) goto L_0x00c9
            goto L_0x00cc
        L_0x00c9:
            r28 = r3
            goto L_0x00d0
        L_0x00cc:
            r28 = r3
            r7 = r24
        L_0x00d0:
            java.lang.String r3 = r1.f31926h
            r29 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r10)
            r3.append(r6)
            r30 = r10
            r10 = 95
            r3.append(r10)
            r3.append(r2)
            r3.append(r10)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r7 = r4.mo3551S()
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct r10 = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct
            r10.<init>()
            r31 = r0
            r32 = r1
            long r0 = eb0.C31543z5.m39453c()
            r10.f9768d = r0
            r10.mo1026u(r3)
            r0 = 1
            java.lang.String r1 = r10.mo86045b(r14, r6, r0)
            r10.f9770f = r1
            java.lang.String r1 = r10.mo86045b(r13, r2, r0)
            r10.f9771g = r1
            di3.d r1 = di3.C86312j.m106911c(r8)
            h81.i r1 = (h81.C59774i) r1
            java.lang.String r1 = r1.mo84751Wb()
            if (r1 != 0) goto L_0x0124
            r1 = r24
        L_0x0124:
            java.lang.String r1 = r10.mo86045b(r12, r1, r0)
            r10.f9772h = r1
            r0 = r31
            bl3.r$a r1 = r0.mo62445d(r4)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r9)
            rs1.s8 r1 = (rs1.C13442s8) r1
            java.lang.String r1 = r1.f38098n
            if (r1 != 0) goto L_0x013c
            r1 = r24
        L_0x013c:
            r10.mo1025t(r1)
            bl3.r$a r1 = r0.mo62445d(r4)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r9)
            rs1.s8 r1 = (rs1.C13442s8) r1
            java.lang.String r1 = r1.f38100p
            if (r1 != 0) goto L_0x014f
            r1 = r24
        L_0x014f:
            r2 = 1
            java.lang.String r1 = r10.mo86045b(r11, r1, r2)
            r10.f9774j = r1
            java.lang.String r1 = r10.mo86045b(r5, r7, r2)
            r10.f9775k = r1
            r1 = r32
            long r2 = r1.f31928j
            r6 = 0
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x016f
            r3 = r20
            r6 = r21
            r4 = r24
            r2 = r28
            goto L_0x019f
        L_0x016f:
            long r2 = eb0.C31543z5.m39453c()
            long r6 = r1.f31928j
            long r2 = r2 - r6
            c30.g r4 = new c30.g
            r4.<init>()
            java.lang.String r6 = "staytime"
            r4.mo145954o(r6, r2)
            r2 = r28
            r4.mo145967r(r2, r15)
            r6 = r25
            r3 = r27
            r4.mo145967r(r3, r6)
            java.lang.String r4 = r4.toString()
            r7 = r22
            gy3.C87412m.m108593f(r4, r7)
            r3 = r20
            r6 = r21
            r7 = 0
            java.lang.String r4 = z04.C112551y.m153814n(r4, r6, r3, r7)
        L_0x019f:
            r10.mo1027v(r4)
            r4 = r29
            r10.mo1024s(r4)
            di3.d r4 = di3.C86312j.m106911c(r19)
            ir.n r4 = (p565ir.C60606n) r4
            java.lang.String r4 = r4.tx0()
            r20 = r3
            r7 = r18
            r3 = 1
            java.lang.String r4 = r10.mo86045b(r7, r4, r3)
            r10.f9778n = r4
            r10.mo86054n()
            r3 = 0
            r1.f31928j = r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "reportSubTabPageOut "
            r1.append(r3)
            java.lang.String r3 = r10.mo1006q()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r3 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
            goto L_0x01ed
        L_0x01de:
            r25 = r4
        L_0x01e0:
            r27 = r7
            r30 = r10
            r7 = r18
            r6 = r21
            r33 = r3
            r3 = r2
            r2 = r33
        L_0x01ed:
            r1 = r34
            lm1.j r4 = r1.f31876f
            lm1.b<cm1.i2> r4 = r4.f31845f
            te3.x91 r10 = r1.f31877g
            r4.mo3588p0(r10)
            lm1.j r4 = r1.f31876f
            com.tencent.mm.ui.MMActivity r4 = r4.f31843d
            bl3.r$a r4 = r0.mo62444c(r4)
            r10 = r17
            androidx.lifecycle.i0 r4 = r4.mo75002a(r10)
            ln1.f r4 = (ln1.C10584f) r4
            if (r4 == 0) goto L_0x034b
            lm1.j r10 = r1.f31876f
            com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment r10 = r10.f31844e
            if (r10 == 0) goto L_0x034b
            boolean r1 = r10 instanceof com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment
            r26 = r3
            if (r1 != 0) goto L_0x021c
            boolean r3 = r10 instanceof com.tencent.p014mm.plugin.finder.nearby.live.localcity.NearbyLiveLocalCityFragment
            if (r3 != 0) goto L_0x021c
            goto L_0x034b
        L_0x021c:
            java.lang.String r3 = r10.mo3553U()
            r21 = r6
            java.lang.String r6 = r10.mo3552T()
            if (r1 == 0) goto L_0x022c
            r23 = r10
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r23 = (com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) r23
        L_0x022c:
            r1 = r23
            if (r1 == 0) goto L_0x0244
            te3.x91 r1 = r1.f15691s
            if (r1 == 0) goto L_0x0244
            int r1 = r1.f144531d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L_0x0241
            goto L_0x0244
        L_0x0241:
            r28 = r2
            goto L_0x0248
        L_0x0244:
            r28 = r2
            r1 = r24
        L_0x0248:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r17 = r15
            r15 = r30
            r2.append(r15)
            r2.append(r3)
            r15 = 95
            r2.append(r15)
            r2.append(r6)
            r2.append(r15)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            bl3.r$a r2 = r0.mo62445d(r10)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r9)
            rs1.s8 r2 = (rs1.C13442s8) r2
            java.lang.String r2 = r2.f38100p
            if (r2 != 0) goto L_0x0279
            r2 = r24
        L_0x0279:
            java.lang.String r15 = r10.mo3551S()
            r18 = r7
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct r7 = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct
            r7.<init>()
            r23 = r4
            r16 = r5
            long r4 = eb0.C31543z5.m39453c()
            r7.f9756d = r4
            r7.mo1022u(r1)
            r4 = 1
            java.lang.String r3 = r7.mo86045b(r14, r3, r4)
            r7.f9758f = r3
            java.lang.String r3 = r7.mo86045b(r13, r6, r4)
            r7.f9759g = r3
            di3.d r3 = di3.C86312j.m106911c(r8)
            h81.i r3 = (h81.C59774i) r3
            java.lang.String r3 = r3.mo84751Wb()
            if (r3 != 0) goto L_0x02ac
            r3 = r24
        L_0x02ac:
            java.lang.String r3 = r7.mo86045b(r12, r3, r4)
            r7.f9760h = r3
            bl3.r$a r0 = r0.mo62445d(r10)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r9)
            rs1.s8 r0 = (rs1.C13442s8) r0
            java.lang.String r0 = r0.f38098n
            if (r0 != 0) goto L_0x02c2
            r0 = r24
        L_0x02c2:
            r7.mo1021t(r0)
            r0 = 1
            java.lang.String r2 = r7.mo86045b(r11, r2, r0)
            r7.f9762j = r2
            r2 = r16
            java.lang.String r2 = r7.mo86045b(r2, r15, r0)
            r7.f9763k = r2
            r2 = r24
            r7.mo1023v(r2)
            r4 = r23
            java.lang.String r2 = r4.f31927i
            java.lang.String r3 = "ref_page_id"
            java.lang.String r2 = r7.mo86045b(r3, r2, r0)
            r7.f9765m = r2
            java.lang.String r2 = r4.f31926h
            r7.mo1020s(r2)
            di3.d r2 = di3.C86312j.m106911c(r19)
            ir.n r2 = (p565ir.C60606n) r2
            java.lang.String r2 = r2.tx0()
            r3 = r18
            java.lang.String r0 = r7.mo86045b(r3, r2, r0)
            r7.f9767o = r0
            c30.g r0 = new c30.g
            r0.<init>()
            r3 = r17
            r2 = r28
            r0.mo145967r(r2, r3)
            r3 = r25
            r2 = r27
            r0.mo145967r(r2, r3)
            java.lang.String r0 = r0.toString()
            r2 = r22
            gy3.C87412m.m108593f(r0, r2)
            r3 = r20
            r5 = r21
            r2 = 0
            java.lang.String r0 = z04.C112551y.m153814n(r0, r5, r3, r2)
            r7.mo1023v(r0)
            r7.mo86054n()
            r4.f31927i = r1
            long r0 = eb0.C31543z5.m39453c()
            r4.f31928j = r0
            r4.f31929n = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "reportSubTabPageIn "
            r0.append(r1)
            java.lang.String r1 = r7.mo1006q()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r26
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x034b:
            java.lang.String r0 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLiveViewCallback$SubTabAdapter$onBindViewHolder$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r34
            j20.C117292a.m165361g(r4, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lm1.C10566k.onClick(android.view.View):void");
    }
}
