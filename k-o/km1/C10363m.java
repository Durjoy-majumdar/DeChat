package km1;

/* renamed from: km1.m */
public final class C10363m implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C10361l f31552d;

    public C10363m(C10361l lVar) {
        this.f31552d = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00b8, code lost:
        r5 = r5.getView();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r17 = this;
            r0 = r17
            km1.l r1 = r0.f31552d
            r1.getClass()
            f40.o r2 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r2 = r2.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FIRST_SHOW_NEARBY_LIVE_SQUARE_SCROLL_GUIDE_CNT_INT_SYNC
            r4 = 0
            int r2 = r2.mo119689j(r3, r4)
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r6 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_NEVER_SCROLL_IN_LIVE_SQUARE_CNT_BOOLEAN_SYNC
            r7 = 1
            boolean r5 = r5.mo119686g(r6, r7)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "onAnimationStart scrollGuideCnt:"
            r6.append(r8)
            r6.append(r2)
            java.lang.String r8 = " isNeverScroll:"
            r6.append(r8)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = "FinderLivePageScrollGuideHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            if (r5 != 0) goto L_0x005b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onAnimationStart return for isNeverScroll:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            goto L_0x01b3
        L_0x005b:
            int r5 = r1.f31540a
            if (r2 <= r5) goto L_0x0075
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "onAnimationStart return for scrollGuideCnt:"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r1)
            goto L_0x01b3
        L_0x0075:
            android.view.View r5 = new android.view.View
            android.view.View r6 = r1.f31542c
            gy3.C87412m.m108591d(r6)
            android.content.Context r6 = r6.getContext()
            r5.<init>(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "attachFloatView floatView:"
            r6.append(r9)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r6)
            r5.setTag(r8)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r9 = -1
            r6.<init>(r9, r9)
            km1.k r9 = new km1.k
            r9.<init>(r1)
            r5.setOnTouchListener(r9)
            android.view.View r9 = r1.f31542c
            java.lang.String r10 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout"
            gy3.C87412m.m108592e(r9, r10)
            androidx.coordinatorlayout.widget.CoordinatorLayout r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r9
            r9.addView(r5, r6)
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r5 = r1.f31545f
            if (r5 == 0) goto L_0x00c6
            android.view.View r5 = r5.getView()
            if (r5 == 0) goto L_0x00c6
            r6 = 2131312846(0x7f0940ce, float:1.8244072E38)
            android.view.View r5 = r5.findViewById(r6)
            goto L_0x00c7
        L_0x00c6:
            r5 = 0
        L_0x00c7:
            if (r5 != 0) goto L_0x00ca
            goto L_0x010c
        L_0x00ca:
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r6.mo10233c(r9)
            java.lang.Object[] r10 = r6.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper"
            java.lang.String r12 = "showNextPageFragmentGuide"
            java.lang.String r13 = "()V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r5
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.Object r6 = r6.mo10231a(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r5.setVisibility(r6)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/nearby/guide/FinderLivePageScrollGuideHelper"
            java.lang.String r11 = "showNextPageFragmentGuide"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x010c:
            java.lang.Class<com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC> r5 = com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r6 = r1.f31545f
            if (r6 != 0) goto L_0x0113
            goto L_0x0166
        L_0x0113:
            bl3.r r9 = bl3.C39818r.f106831a
            androidx.fragment.app.Fragment r6 = r6.getParentFragment()
            gy3.C87412m.m108591d(r6)
            bl3.r$a r6 = r9.mo62445d(r6)
            androidx.lifecycle.i0 r6 = r6.mo75002a(r5)
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC r6 = (com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) r6
            java.util.LinkedList<com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment> r6 = r6.f15663o
            int r6 = r6.size()
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r10 = r1.f31545f
            gy3.C87412m.m108591d(r10)
            androidx.fragment.app.Fragment r10 = r10.getParentFragment()
            gy3.C87412m.m108591d(r10)
            bl3.r$a r9 = r9.mo62445d(r10)
            androidx.lifecycle.i0 r5 = r9.mo75002a(r5)
            com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC r5 = (com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) r5
            int r5 = r5.mo3606e3()
            int r9 = r5 + 1
            if (r6 != r9) goto L_0x0168
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "getSmoothScrollDistance return 0 for size:"
            r9.append(r10)
            r9.append(r6)
            java.lang.String r6 = " index:"
            r9.append(r6)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r5)
        L_0x0166:
            r6 = 0
            goto L_0x019e
        L_0x0168:
            android.view.View r6 = r1.f31543d
            if (r6 == 0) goto L_0x0171
            int r6 = r6.getWidth()
            goto L_0x0172
        L_0x0171:
            r6 = 0
        L_0x0172:
            int r6 = r6 * r5
            android.view.View r5 = r1.f31543d
            gy3.C87412m.m108591d(r5)
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r9 = 2131165363(0x7f0700b3, float:1.794494E38)
            float r5 = r5.getDimension(r9)
            int r5 = (int) r5
            int r6 = r6 + r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "getSmoothScrollDistance distance:"
            r5.append(r9)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
        L_0x019e:
            r1.mo10663f(r6, r4, r4)
            int r2 = r2 + r7
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.mo119677K(r3, r2)
            r1.f31546g = r7
        L_0x01b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: km1.C10363m.run():void");
    }
}
