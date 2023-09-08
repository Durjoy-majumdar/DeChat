package rs1;

import jq3.C60898l;
import jq3.C60905o;

/* renamed from: rs1.p5 */
public final class C13364p5 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C13298k5 f37874d;

    public C13364p5(C13298k5 k5Var) {
        this.f37874d = k5Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        r11 = r11.getDataListJustForAdapter();
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r8, android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.C16631z r11) {
        /*
            r7 = this;
            jq3.o r11 = (jq3.C60905o) r11
            java.lang.String r0 = "adapter"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "view"
            gy3.C87412m.m108594g(r9, r0)
            java.lang.String r9 = "holder"
            gy3.C87412m.m108594g(r11, r9)
            jq3.l r8 = (jq3.C60898l) r8
            int r8 = r8.mo85796c6()
            int r10 = r10 - r8
            if (r10 < 0) goto L_0x0152
            rs1.k5 r8 = r7.f37874d
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r8 = r8.mo12749g3()
            int r8 = r8.getSize()
            if (r10 >= r8) goto L_0x0152
            rs1.k5 r8 = r7.f37874d
            r8.getClass()
            java.lang.Object r9 = r11.f173503E
            cm1.j0 r9 = (cm1.C55018j0) r9
            kf1.i3 r11 = r8.f37741h
            r0 = 0
            if (r11 == 0) goto L_0x014c
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader<cm1.i2> r11 = r11.f13124s
            if (r11 == 0) goto L_0x0046
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r11 = r11.getDataListJustForAdapter()
            if (r11 == 0) goto L_0x0046
            java.lang.Object r11 = sx3.C110818d0.m150916N(r11)
            cm1.i2 r11 = (cm1.C0740i2) r11
            goto L_0x0047
        L_0x0046:
            r11 = r0
        L_0x0047:
            boolean r1 = r11 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r1 == 0) goto L_0x004e
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r11 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r11
            goto L_0x004f
        L_0x004e:
            r11 = r0
        L_0x004f:
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L_0x0061
            long r3 = r11.getItemId()
            long r5 = r9.getItemId()
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 != 0) goto L_0x0061
            r11 = 1
            goto L_0x0062
        L_0x0061:
            r11 = 0
        L_0x0062:
            java.lang.String r3 = ", id = "
            java.lang.String r4 = "FinderHorizontalVideoNewFormUIC"
            if (r11 == 0) goto L_0x008c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "onGridItemClick: click same item, position = "
            r8.append(r11)
            r8.append(r10)
            r8.append(r3)
            long r9 = r9.getItemId()
            java.lang.String r9 = o40.C61926c.m72691p(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r8)
            goto L_0x0152
        L_0x008c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r5 = "onGridItemClick: position = "
            r11.append(r5)
            r11.append(r10)
            r11.append(r3)
            long r5 = r9.getItemId()
            java.lang.String r3 = o40.C61926c.m72691p(r5)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r11)
            bl3.r r11 = bl3.C39818r.f106831a
            android.app.Activity r3 = r8.getContext()
            bl3.r$a r11 = r11.mo62443b(r3)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC> r3 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.class
            androidx.lifecycle.i0 r11 = r11.mo75002a(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC r11 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC) r11
            as1.a r11 = r11.mo5141e3()
            int r3 = r11.f18132i
            r11.mo4919k(r3, r1)
            r8.mo12746d3(r9)
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r11 = r8.mo12749g3()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r9.mo3513o()
            long r3 = r1.getId()
            r11.f13561d = r3
            com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader r11 = r8.mo12749g3()
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r9.mo3513o()
            java.lang.String r1 = r1.getObjectNonceId()
            r11.mo2706d(r1)
            dp1.f2 r11 = dp1.C7435f2.f25626a
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            android.app.Activity r3 = r8.getContext()
            rs1.s8 r1 = r1.mo12873f(r3)
            if (r1 == 0) goto L_0x00fb
            te3.hj1 r0 = r1.mo12861q3()
        L_0x00fb:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            long r3 = r8.f37737d
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            java.lang.String r4 = "feedid"
            r1.put(r4, r3)
            long r3 = r8.f37737d
            java.lang.String r3 = o40.C61926c.m72691p(r3)
            java.lang.String r4 = "recommend_feedid"
            r1.put(r4, r3)
            java.lang.String r3 = "recommend_feed_location_id"
            r1.put(r3, r10)
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r9.mo3513o()
            com.tencent.mm.protocal.protobuf.FinderObject r10 = r10.getFeedObject()
            te3.ek1 r10 = r10.flow_card_recommand_reason
            if (r10 == 0) goto L_0x012b
            java.lang.String r10 = r10.f132981d
            if (r10 != 0) goto L_0x012d
        L_0x012b:
            java.lang.String r10 = ""
        L_0x012d:
            java.lang.String r3 = "recommend_reason"
            r1.put(r3, r10)
            int r10 = r8.f37738e
            java.lang.String r3 = "expose_type"
            r1.put(r3, r10)
            rx3.b0 r10 = rx3.C13598b0.f38549a
            java.lang.String r10 = "more_recommend_feed"
            r11.mo8577a(r0, r10, r2, r1)
            dp1.q r10 = dp1.C7450q.f25643a
            android.app.Activity r8 = r8.getContext()
            r11 = 54
            r10.mo8593a(r8, r9, r11)
            goto L_0x0152
        L_0x014c:
            java.lang.String r8 = "presenter"
            gy3.C87412m.m108603p(r8)
            throw r0
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13364p5.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
