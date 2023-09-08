package lm1;

import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLivePresenter;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C87413o;
import o40.C61926c;
import rx3.C13598b0;
import tf1.C13913l;

/* renamed from: lm1.g */
public final class C10550g implements C13913l {

    /* renamed from: a */
    public final /* synthetic */ C8477a0 f31833a;

    /* renamed from: b */
    public final /* synthetic */ NearbyLivePresenter f31834b;

    /* renamed from: c */
    public final /* synthetic */ NearbyLivePresenter$createFeedLoader$1 f31835c;

    /* renamed from: lm1.g$a */
    public static final class C10551a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f31836d;

        /* renamed from: e */
        public final /* synthetic */ NearbyLivePresenter f31837e;

        /* renamed from: f */
        public final /* synthetic */ int f31838f;

        /* renamed from: g */
        public final /* synthetic */ NearbyLivePresenter$createFeedLoader$1 f31839g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10551a(C8477a0 a0Var, NearbyLivePresenter nearbyLivePresenter, int i, NearbyLivePresenter$createFeedLoader$1 nearbyLivePresenter$createFeedLoader$1) {
            super(0);
            this.f31836d = a0Var;
            this.f31837e = nearbyLivePresenter;
            this.f31838f = i;
            this.f31839g = nearbyLivePresenter$createFeedLoader$1;
        }

        /* JADX WARNING: Removed duplicated region for block: B:131:0x036f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke() {
            /*
                r20 = this;
                r0 = r20
                gy3.a0 r1 = r0.f31836d
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r2 = r0.f31837e
                os1.w r3 = r2.f15615p
                int r4 = r2.mo3582j0()
                boolean r3 = r3.mo11637f3(r4)
                java.util.LinkedList r4 = new java.util.LinkedList
                bl3.r r5 = bl3.C39818r.f106831a
                java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r6 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
                bl3.r$a r5 = r5.mo62446e(r6)
                java.lang.Class<os1.w> r6 = os1.C11759w.class
                androidx.lifecycle.i0 r5 = r5.mo75002a(r6)
                os1.w r5 = (os1.C11759w) r5
                int r2 = r2.mo3582j0()
                os1.w$a r2 = r5.mo11635d3(r2)
                java.util.List<? extends cm1.i2> r2 = r2.f34430b
                r4.<init>(r2)
                java.util.Iterator r2 = r4.iterator()
                r5 = 0
                r6 = 0
            L_0x0035:
                boolean r7 = r2.hasNext()
                r8 = -1
                if (r7 == 0) goto L_0x004a
                java.lang.Object r7 = r2.next()
                cm1.i2 r7 = (cm1.C0740i2) r7
                boolean r7 = r7 instanceof kf1.C9833k9
                if (r7 == 0) goto L_0x0047
                goto L_0x004b
            L_0x0047:
                int r6 = r6 + 1
                goto L_0x0035
            L_0x004a:
                r6 = -1
            L_0x004b:
                java.util.Iterator r2 = r4.iterator()
                r7 = 0
            L_0x0050:
                boolean r9 = r2.hasNext()
                r10 = 1
                if (r9 == 0) goto L_0x0070
                java.lang.Object r9 = r2.next()
                cm1.i2 r9 = (cm1.C0740i2) r9
                boolean r11 = r9 instanceof cm1.C0784u1
                if (r11 == 0) goto L_0x0069
                cm1.u1 r9 = (cm1.C0784u1) r9
                int r9 = r9.f1835e
                if (r9 <= r6) goto L_0x0069
                r9 = 1
                goto L_0x006a
            L_0x0069:
                r9 = 0
            L_0x006a:
                if (r9 == 0) goto L_0x006d
                goto L_0x0071
            L_0x006d:
                int r7 = r7 + 1
                goto L_0x0050
            L_0x0070:
                r7 = -1
            L_0x0071:
                if (r6 == r8) goto L_0x0083
                int r2 = r4.size()
                if (r6 >= r2) goto L_0x0083
                java.util.LinkedList r2 = new java.util.LinkedList
                java.util.List r9 = r4.subList(r5, r6)
                r2.<init>(r9)
                goto L_0x0088
            L_0x0083:
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
            L_0x0088:
                if (r6 == r8) goto L_0x00ab
                int r9 = r4.size()
                if (r7 >= r9) goto L_0x00ab
                java.lang.Object r7 = r4.get(r6)
                boolean r7 = r7 instanceof kf1.C9833k9
                if (r7 == 0) goto L_0x00ab
                java.util.LinkedList r7 = new java.util.LinkedList
                java.lang.Object r4 = r4.get(r6)
                java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderStreamCardFeed"
                gy3.C87412m.m108592e(r4, r6)
                kf1.k9 r4 = (kf1.C9833k9) r4
                java.util.LinkedList<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r4 = r4.f30389f
                r7.<init>(r4)
                goto L_0x00b0
            L_0x00ab:
                java.util.LinkedList r7 = new java.util.LinkedList
                r7.<init>()
            L_0x00b0:
                java.util.Iterator r2 = r2.iterator()
            L_0x00b4:
                boolean r4 = r2.hasNext()
                java.lang.String r6 = "Finder.NearbyLivePresenter"
                if (r4 == 0) goto L_0x00ff
                java.lang.Object r4 = r2.next()
                cm1.i2 r4 = (cm1.C0740i2) r4
                boolean r9 = r4 instanceof cm1.C0797z
                if (r9 == 0) goto L_0x00b4
                cm1.z r4 = (cm1.C0797z) r4
                com.tencent.mm.plugin.finder.storage.FinderItem r9 = r4.mo3513o()
                te3.c21 r9 = r9.getLiveInfo()
                if (r9 == 0) goto L_0x00d8
                int r9 = r9.f182394f
                if (r9 != r10) goto L_0x00d8
                r9 = 1
                goto L_0x00d9
            L_0x00d8:
                r9 = 0
            L_0x00d9:
                if (r9 != 0) goto L_0x00b4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r9 = "canTimelineRefresh isHardRefresh for beforeFollowDataList feed:"
                r3.append(r9)
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                long r11 = r4.f164794id
                java.lang.String r4 = o40.C61926c.m72691p(r11)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
                r3 = 1
                goto L_0x00b4
            L_0x00ff:
                java.util.Iterator r2 = r7.iterator()
            L_0x0103:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L_0x014c
                java.lang.Object r4 = r2.next()
                cm1.i2 r4 = (cm1.C0740i2) r4
                boolean r7 = r4 instanceof cm1.C0797z
                if (r7 == 0) goto L_0x0103
                cm1.z r4 = (cm1.C0797z) r4
                com.tencent.mm.plugin.finder.storage.FinderItem r7 = r4.mo3513o()
                te3.c21 r7 = r7.getLiveInfo()
                if (r7 == 0) goto L_0x0125
                int r7 = r7.f182394f
                if (r7 != r10) goto L_0x0125
                r7 = 1
                goto L_0x0126
            L_0x0125:
                r7 = 0
            L_0x0126:
                if (r7 != 0) goto L_0x0103
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r7 = "canTimelineRefresh isHardRefresh for followDataList feed:"
                r3.append(r7)
                com.tencent.mm.plugin.finder.storage.FinderItem r4 = r4.mo3513o()
                com.tencent.mm.protocal.protobuf.FinderObject r4 = r4.getFeedObject()
                long r11 = r4.f164794id
                java.lang.String r4 = o40.C61926c.m72691p(r11)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r3)
                r3 = 1
                goto L_0x0103
            L_0x014c:
                r1.f27482d = r3
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "[initData] canTimelineRefresh="
                r1.append(r2)
                gy3.a0 r2 = r0.f31836d
                boolean r2 = r2.f27482d
                r1.append(r2)
                java.lang.String r2 = " targetPageForceRefreshFlag:"
                r1.append(r2)
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r2 = r0.f31837e
                boolean r2 = r2.f15610h
                r1.append(r2)
                java.lang.String r2 = ", incrementCount="
                r1.append(r2)
                int r2 = r0.f31838f
                r1.append(r2)
                java.lang.String r2 = " memoryCacheFlag:"
                r1.append(r2)
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r2 = r0.f31837e
                int r2 = r2.mo3582j0()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r1)
                gy3.a0 r1 = r0.f31836d
                boolean r1 = r1.f27482d
                if (r1 != 0) goto L_0x0360
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r1 = r0.f31837e
                boolean r2 = r1.f15610h
                if (r2 == 0) goto L_0x0198
                goto L_0x0360
            L_0x0198:
                r1.f15609g = r10
                os1.w r2 = r1.f15615p
                int r1 = r1.mo3582j0()
                os1.w$a r1 = r2.mo11635d3(r1)
                int r2 = r1.f34431c
                int r3 = r1.f34432d
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1 r4 = r0.f31839g
                java.lang.String r4 = r4.getTAG()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = "[initData] canTimelineRefresh "
                r6.append(r7)
                gy3.a0 r7 = r0.f31836d
                boolean r7 = r7.f27482d
                r6.append(r7)
                java.lang.String r7 = " fromPreload:"
                r6.append(r7)
                boolean r7 = r1.f34436h
                r6.append(r7)
                java.lang.String r7 = " lastPos="
                r6.append(r7)
                r6.append(r2)
                java.lang.String r7 = " fromTopPixel="
                r6.append(r7)
                r6.append(r3)
                java.lang.String r6 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r4 = r0.f31837e
                im1.d r6 = r4.f15617r
                if (r6 == 0) goto L_0x01ea
                r6.f28941a = r2
                r6.f28942b = r3
            L_0x01ea:
                lm1.c r4 = r4.mo3584n0()
                androidx.recyclerview.widget.RecyclerView r4 = r4.getRecyclerView()
                r6 = 0
                if (r4 == 0) goto L_0x01fa
                androidx.recyclerview.widget.RecyclerView$LayoutManager r7 = r4.getLayoutManager()
                goto L_0x01fb
            L_0x01fa:
                r7 = r6
            L_0x01fb:
                boolean r9 = r7 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
                if (r9 == 0) goto L_0x0267
                r9 = r7
                androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r9
                k20.a r15 = new k20.a
                r15.<init>()
                java.lang.ThreadLocal<k20.a> r11 = k20.C60958c.f173611a
                java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
                r15.mo10233c(r11)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
                r15.mo10233c(r11)
                java.lang.Object[] r12 = r15.mo10232b()
                java.lang.String r13 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$2$1$call$1"
                java.lang.String r14 = "invoke"
                java.lang.String r16 = "()V"
                java.lang.String r17 = "Undefined"
                java.lang.String r18 = "scrollToPositionWithOffset"
                java.lang.String r19 = "(II)V"
                r11 = r9
                r8 = r15
                r15 = r16
                r16 = r17
                r17 = r18
                r18 = r19
                j20.C117292a.m165358d(r11, r12, r13, r14, r15, r16, r17, r18)
                java.lang.Object r11 = r8.mo10231a(r5)
                java.lang.Integer r11 = (java.lang.Integer) r11
                int r11 = r11.intValue()
                java.lang.Object r8 = r8.mo10231a(r10)
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
                r9.mo17414U(r11, r8)
                java.lang.String r12 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$2$1$call$1"
                java.lang.String r13 = "invoke"
                java.lang.String r14 = "()V"
                java.lang.String r15 = "Undefined"
                java.lang.String r16 = "scrollToPositionWithOffset"
                java.lang.String r17 = "(II)V"
                r11 = r9
                j20.C117292a.m165359e(r11, r12, r13, r14, r15, r16, r17)
                lm1.e r8 = new lm1.e
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r9 = r0.f31837e
                r8.<init>(r7, r2, r3, r9)
                r4.post(r8)
            L_0x0267:
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r2 = r0.f31837e
                os1.w r3 = r2.f15615p
                int r2 = r2.mo3582j0()
                os1.w$a r2 = r3.mo11635d3(r2)
                int r2 = r2.f34437i
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r3 = r0.f31837e
                androidx.fragment.app.Fragment r3 = r3.f15611i
                boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment
                if (r4 == 0) goto L_0x0280
                com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r3 = (com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) r3
                goto L_0x0281
            L_0x0280:
                r3 = r6
            L_0x0281:
                if (r3 == 0) goto L_0x028a
                te3.x91 r3 = r3.f15690r
                if (r3 == 0) goto L_0x028a
                java.util.LinkedList<te3.x91> r3 = r3.f144537j
                goto L_0x028b
            L_0x028a:
                r3 = r6
            L_0x028b:
                if (r3 != 0) goto L_0x0292
                java.util.LinkedList r3 = new java.util.LinkedList
                r3.<init>()
            L_0x0292:
                if (r2 == 0) goto L_0x033c
                int r4 = r3.size()
                if (r4 <= 0) goto L_0x033c
                te3.x91 r4 = new te3.x91
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
                r7 = 0
                r8 = -1
            L_0x02a5:
                boolean r9 = r3.hasNext()
                if (r9 == 0) goto L_0x02c1
                java.lang.Object r9 = r3.next()
                int r11 = r7 + 1
                if (r7 < 0) goto L_0x02bd
                te3.x91 r9 = (te3.C51942x91) r9
                int r12 = r9.f144531d
                if (r12 != r2) goto L_0x02bb
                r8 = r7
                r4 = r9
            L_0x02bb:
                r7 = r11
                goto L_0x02a5
            L_0x02bd:
                sx3.C64197v.m75542k()
                throw r6
            L_0x02c1:
                int r3 = r8 + 1
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1 r7 = r0.f31839g
                java.lang.String r7 = r7.getTAG()
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r11 = "init subTab position subTabId:"
                r9.append(r11)
                r9.append(r2)
                java.lang.String r2 = " subIndex:"
                r9.append(r2)
                r9.append(r8)
                java.lang.String r2 = " realIndex:"
                r9.append(r2)
                r9.append(r3)
                java.lang.String r2 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r2)
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r2 = r0.f31837e
                lm1.c r2 = r2.mo3584n0()
                androidx.recyclerview.widget.RecyclerView r2 = r2.mo10821y0()
                if (r3 <= 0) goto L_0x033c
                if (r2 == 0) goto L_0x0305
                androidx.recyclerview.widget.RecyclerView$e r7 = r2.getAdapter()
                if (r7 == 0) goto L_0x0305
                int r5 = r7.getItemCount()
            L_0x0305:
                if (r3 >= r5) goto L_0x033c
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r5 = r0.f31837e
                te3.x91 r5 = r5.f15612j
                if (r5 == 0) goto L_0x0314
                java.util.LinkedList<te3.x91> r5 = r5.f144537j
                if (r5 == 0) goto L_0x0314
                r5.clear()
            L_0x0314:
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r5 = r0.f31837e
                te3.x91 r5 = r5.f15612j
                if (r5 == 0) goto L_0x0321
                java.util.LinkedList<te3.x91> r5 = r5.f144537j
                if (r5 == 0) goto L_0x0321
                r5.add(r4)
            L_0x0321:
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r5 = r0.f31837e
                androidx.fragment.app.Fragment r7 = r5.f15611i
                boolean r8 = r7 instanceof com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment
                if (r8 == 0) goto L_0x032c
                com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r7 = (com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) r7
                goto L_0x032d
            L_0x032c:
                r7 = r6
            L_0x032d:
                if (r7 != 0) goto L_0x0330
                goto L_0x0332
            L_0x0330:
                r7.f15691s = r4
            L_0x0332:
                if (r2 == 0) goto L_0x033c
                lm1.f r4 = new lm1.f
                r4.<init>(r5, r3, r2)
                r2.post(r4)
            L_0x033c:
                int r2 = r0.f31838f
                if (r2 > 0) goto L_0x0345
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r2 = r0.f31837e
                r2.mo3590q(r6)
            L_0x0345:
                boolean r1 = r1.f34436h
                if (r1 == 0) goto L_0x0358
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r1 = r0.f31837e
                java.lang.String r2 = "fromPreload"
                r1.mo3568G(r2)
                nn1.a r1 = nn1.C11235c.f33110a
                java.lang.String r2 = "onHitPreloadEnd"
                r1.mo11310b(r2)
                goto L_0x0369
            L_0x0358:
                nn1.a r1 = nn1.C11235c.f33110a
                java.lang.String r2 = "onHitCache"
                r1.mo11310b(r2)
                goto L_0x0369
            L_0x0360:
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r1 = r0.f31837e
                r1.f15609g = r5
                r2 = 0
                r1.mo3579e(r2, r5)
            L_0x0369:
                com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r1 = r0.f31837e
                kn1.a r1 = r1.f15616q
                if (r1 == 0) goto L_0x0371
                r1.f31559g = r10
            L_0x0371:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: lm1.C10550g.C10551a.invoke():java.lang.Object");
        }
    }

    public C10550g(C8477a0 a0Var, NearbyLivePresenter nearbyLivePresenter, NearbyLivePresenter$createFeedLoader$1 nearbyLivePresenter$createFeedLoader$1) {
        this.f31833a = a0Var;
        this.f31834b = nearbyLivePresenter;
        this.f31835c = nearbyLivePresenter$createFeedLoader$1;
    }

    public void call(int i) {
        C61926c.m72668M(new C10551a(this.f31833a, this.f31834b, i, this.f31835c));
    }
}
