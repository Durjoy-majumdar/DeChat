package lm1;

import cm1.C0740i2;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLivePresenter;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: lm1.h */
public final class C10552h extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ NearbyLivePresenter f31840d;

    /* renamed from: e */
    public final /* synthetic */ NearbyLivePresenter$createFeedLoader$1 f31841e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10552h(NearbyLivePresenter nearbyLivePresenter, NearbyLivePresenter$createFeedLoader$1 nearbyLivePresenter$createFeedLoader$1) {
        super(1);
        this.f31840d = nearbyLivePresenter;
        this.f31841e = nearbyLivePresenter$createFeedLoader$1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (((r0 == null || (r0 = r0.f144537j) == null || r0.size() != 0) ? false : true) != false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r0 = r0.f144537j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r13) {
        /*
            r12 = this;
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse r13 = (com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse) r13
            java.lang.String r0 = "it"
            gy3.C87412m.m108594g(r13, r0)
            int r0 = r13.getPullType()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x008e
            com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r0 = r12.f31840d
            te3.x91 r0 = r0.f15612j
            if (r0 == 0) goto L_0x0021
            java.util.LinkedList<te3.x91> r0 = r0.f144537j
            if (r0 == 0) goto L_0x0021
            int r0 = r0.size()
            if (r0 != r2) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 != 0) goto L_0x0039
            com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r0 = r12.f31840d
            te3.x91 r0 = r0.f15612j
            if (r0 == 0) goto L_0x0036
            java.util.LinkedList<te3.x91> r0 = r0.f144537j
            if (r0 == 0) goto L_0x0036
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 == 0) goto L_0x008e
        L_0x0039:
            com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r0 = r12.f31840d
            te3.x91 r0 = r0.f15612j
            if (r0 == 0) goto L_0x004a
            java.util.LinkedList<te3.x91> r0 = r0.f144537j
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            te3.x91 r0 = (te3.C51942x91) r0
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            bl3.r r3 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r3 = r3.mo62446e(r4)
            java.lang.Class<os1.w> r4 = os1.C11759w.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            java.lang.String r4 = "UICProvider.of(FinderCom…eloadCacheVM::class.java)"
            gy3.C87412m.m108593f(r3, r4)
            os1.w r3 = (os1.C11759w) r3
            com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r4 = r12.f31840d
            te3.x91 r4 = r4.f15612j
            java.lang.String r0 = r3.mo11634c3(r4, r0)
            if (r0 == 0) goto L_0x008e
            java.util.List r4 = r13.getIncrementList()
            if (r4 == 0) goto L_0x008e
            boolean r5 = r4.isEmpty()
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x008e
            java.util.HashMap<java.lang.String, os1.w$d> r3 = r3.f34427h
            os1.w$d r11 = new os1.w$d
            r6 = 0
            long r7 = java.lang.System.currentTimeMillis()
            r9 = 1
            r10 = 0
            r5 = r11
            r5.<init>(r6, r7, r9, r10)
            java.util.ArrayList<cm1.i2> r5 = r11.f34447a
            r5.addAll(r4)
            r3.put(r0, r11)
        L_0x008e:
            int r0 = r13.getPullType()
            if (r0 == 0) goto L_0x009a
            int r0 = r13.getPullType()
            if (r0 != r2) goto L_0x00c3
        L_0x009a:
            com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter r0 = r12.f31840d
            androidx.fragment.app.Fragment r0 = r0.f15611i
            boolean r3 = r0 instanceof com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment
            if (r3 == 0) goto L_0x00ae
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment"
            gy3.C87412m.m108592e(r0, r3)
            com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment r0 = (com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment) r0
            java.lang.String r0 = r0.mo3551S()
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r0 = ""
        L_0x00b0:
            com.tencent.mm.plugin.finder.extension.reddot.o0$a r3 = com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0.f12984a
            r4 = 2
            com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$createFeedLoader$1 r5 = r12.f31841e
            te3.hj1 r5 = r5.getContextObj()
            int r13 = r13.getPullType()
            if (r13 != 0) goto L_0x00c0
            r1 = 1
        L_0x00c0:
            r3.mo2461k(r4, r5, r1, r0)
        L_0x00c3:
            rx3.b0 r13 = rx3.C13598b0.f38549a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: lm1.C10552h.invoke(java.lang.Object):java.lang.Object");
    }
}
