package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.fb */
public final class C9731fb extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f30172d;

    /* renamed from: e */
    public final /* synthetic */ FinderTimelinePresenter f30173e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9731fb(RefreshLoadMoreLayout.C7080c<Object> cVar, FinderTimelinePresenter finderTimelinePresenter) {
        super(0);
        this.f30172d = cVar;
        this.f30173e = finderTimelinePresenter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r2 = r2.getRecyclerView();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r9 = this;
            com.tencent.mm.view.RefreshLoadMoreLayout$c<java.lang.Object> r0 = r9.f30172d
            r1 = 0
            if (r0 != 0) goto L_0x001b
            com.tencent.mm.view.RefreshLoadMoreLayout$c r0 = new com.tencent.mm.view.RefreshLoadMoreLayout$c
            r0.<init>(r1)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131830030(0x7f11250e, float:1.9293046E38)
            java.lang.String r2 = r2.getString(r3)
            r0.f24948c = r2
        L_0x001b:
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r9.f30173e
            kf1.n9 r2 = r2.f13269j
            r3 = 0
            if (r2 == 0) goto L_0x002d
            androidx.recyclerview.widget.RecyclerView r2 = r2.getRecyclerView()
            if (r2 == 0) goto L_0x002d
            androidx.recyclerview.widget.RecyclerView$e r2 = r2.getAdapter()
            goto L_0x002e
        L_0x002d:
            r2 = r3
        L_0x002e:
            boolean r4 = r2 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r4 == 0) goto L_0x0035
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r2 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r2
            goto L_0x0036
        L_0x0035:
            r2 = r3
        L_0x0036:
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r9.f30173e
            if (r2 == 0) goto L_0x003f
            int r5 = r2.mo82597F4()
            goto L_0x0040
        L_0x003f:
            r5 = 0
        L_0x0040:
            r6 = 1
            if (r5 > 0) goto L_0x0045
            r5 = 1
            goto L_0x0046
        L_0x0045:
            r5 = 0
        L_0x0046:
            r4.f13253M = r5
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r9.f30173e
            java.lang.String r4 = r4.f13249I
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "[checkEmptyHeader] isEmpty="
            r5.append(r7)
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r7 = r9.f30173e
            boolean r7 = r7.f13253M
            r5.append(r7)
            java.lang.String r7 = " reason="
            r5.append(r7)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r9.f30173e
            boolean r5 = r4.f13253M
            if (r5 != 0) goto L_0x0082
            if (r2 == 0) goto L_0x00fc
            jq3.l$a r4 = r4.f13257R
            cm1.g r4 = (cm1.C0731g) r4
            int r4 = r4.hashCode()
            long r4 = (long) r4
            r2.mo85802j6(r4, r1)
            goto L_0x00fc
        L_0x0082:
            kf1.n9 r4 = r4.f13269j
            if (r4 == 0) goto L_0x008b
            com.tencent.mm.view.RefreshLoadMoreLayout r4 = r4.mo10416c()
            goto L_0x008c
        L_0x008b:
            r4 = r3
        L_0x008c:
            if (r4 != 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r4.setEnableLoadMore(r1)
        L_0x0092:
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r9.f30173e
            jq3.l$a r4 = r4.f13257R
            boolean r5 = r4 instanceof cm1.C0731g
            if (r5 == 0) goto L_0x00d3
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData"
            gy3.C87412m.m108592e(r4, r5)
            cm1.g r4 = (cm1.C0731g) r4
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131829304(0x7f112238, float:1.9291573E38)
            java.lang.String r7 = r7.getString(r8)
            java.lang.String r8 = "getContext().resources.g…g.finder_no_more_content)"
            gy3.C87412m.m108593f(r7, r8)
            r4.f1744d = r7
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r9.f30173e
            jq3.l$a r4 = r4.f13257R
            gy3.C87412m.m108592e(r4, r5)
            cm1.g r4 = (cm1.C0731g) r4
            int r7 = r0.f24947b
            r4.f1745e = r7
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r9.f30173e
            jq3.l$a r4 = r4.f13257R
            gy3.C87412m.m108592e(r4, r5)
            cm1.g r4 = (cm1.C0731g) r4
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r5 = r9.f30173e
            int r5 = r5.f13272p
            r4.f1746f = r5
        L_0x00d3:
            if (r2 == 0) goto L_0x00e1
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r9.f30173e
            jq3.l$a r4 = r4.f13257R
            boolean r4 = r2.mo85795Y5(r4)
            if (r4 != 0) goto L_0x00e1
            r4 = 1
            goto L_0x00e2
        L_0x00e1:
            r4 = 0
        L_0x00e2:
            if (r4 == 0) goto L_0x00ec
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r9.f30173e
            jq3.l$a r4 = r4.f13257R
            r2.mo85793T5(r4, r1)
            goto L_0x00fc
        L_0x00ec:
            if (r2 == 0) goto L_0x00fc
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r4 = r9.f30173e
            jq3.l$a r4 = r4.f13257R
            cm1.g r4 = (cm1.C0731g) r4
            int r4 = r4.hashCode()
            long r4 = (long) r4
            r2.mo85798e6(r4)
        L_0x00fc:
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = r9.f30173e
            kf1.n9 r2 = r2.f13269j
            if (r2 == 0) goto L_0x0106
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r2.mo10416c()
        L_0x0106:
            if (r3 != 0) goto L_0x0109
            goto L_0x0118
        L_0x0109:
            int r0 = r0.f24947b
            r2 = -1
            if (r0 != r2) goto L_0x0114
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r0 = r9.f30173e
            boolean r0 = r0.f13253M
            if (r0 != 0) goto L_0x0115
        L_0x0114:
            r1 = 1
        L_0x0115:
            r3.setEnableNestedScroll(r1)
        L_0x0118:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9731fb.invoke():java.lang.Object");
    }
}
