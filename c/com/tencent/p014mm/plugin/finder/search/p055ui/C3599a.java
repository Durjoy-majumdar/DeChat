package com.tencent.p014mm.plugin.finder.search.p055ui;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.search.ui.a */
public final class C3599a extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f16677d;

    /* renamed from: e */
    public final /* synthetic */ int f16678e;

    /* renamed from: f */
    public final /* synthetic */ FinderMixSearchFeedFragment f16679f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView.C16631z f16680g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3599a(BaseFinderFeed baseFinderFeed, int i, FinderMixSearchFeedFragment finderMixSearchFeedFragment, RecyclerView.C16631z zVar) {
        super(1);
        this.f16677d = baseFinderFeed;
        this.f16678e = i;
        this.f16679f = finderMixSearchFeedFragment;
        this.f16680g = zVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r1 != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Number r12 = (java.lang.Number) r12
            r12.intValue()
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = r11.f16677d
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.mo3513o()
            boolean r12 = r12.isLiveFeed()
            r0 = 0
            if (r12 != 0) goto L_0x0027
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r12 = r11.f16677d
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.mo3513o()
            te3.c21 r12 = r12.getLiveInfo()
            r1 = 1
            if (r12 == 0) goto L_0x0024
            int r12 = r12.f182394f
            if (r12 != r1) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r1 = 0
        L_0x0025:
            if (r1 == 0) goto L_0x0046
        L_0x0027:
            java.lang.Class<ht1.j5> r12 = ht1.C8777j5.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            java.lang.String r1 = "getService(IHellLiveReport::class.java)"
            gy3.C87412m.m108593f(r12, r1)
            r2 = r12
            ht1.j5 r2 = (ht1.C8777j5) r2
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r11.f16677d
            int r12 = r11.f16678e
            long r4 = (long) r12
            ak1.f0$q r6 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM
            r8 = 0
            r9 = 16
            r10 = 0
            java.lang.String r7 = "temp_4"
            ht1.C8777j5.C8778a.m8604e(r2, r3, r4, r6, r7, r8, r9, r10)
        L_0x0046:
            er1.j4 r12 = er1.C58739j4.f168176a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = r11.f16677d
            boolean r12 = r12.mo83686O(r1)
            if (r12 == 0) goto L_0x0065
            com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment r12 = r11.f16679f
            com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter r12 = r12.f16655r
            if (r12 == 0) goto L_0x0082
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r11.f16677d
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment r2 = r11.f16679f
            java.util.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r2 = r2.f16656s
            r12.mo3909e(r0, r1, r2)
            goto L_0x0082
        L_0x0065:
            com.tencent.mm.plugin.finder.search.ui.FinderMixSearchFeedFragment r12 = r11.f16679f
            int r1 = r12.f17334o
            r2 = -1
            if (r1 != r2) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r0 = r1
        L_0x006e:
            com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter r1 = r12.f16655r
            if (r1 == 0) goto L_0x0082
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = r11.f16677d
            java.util.List<com.tencent.mm.plugin.finder.model.BaseFinderFeed> r12 = r12.f16656s
            androidx.recyclerview.widget.RecyclerView$z r3 = r11.f16680g
            android.view.View r3 = r3.f44854d
            java.lang.String r4 = "holder.itemView"
            gy3.C87412m.m108593f(r3, r4)
            r1.mo3916q(r2, r12, r0, r3)
        L_0x0082:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.search.p055ui.C3599a.invoke(java.lang.Object):java.lang.Object");
    }
}
