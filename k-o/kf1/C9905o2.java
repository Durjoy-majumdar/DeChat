package kf1;

import com.tencent.p014mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.o2 */
public final class C9905o2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f30525d;

    /* renamed from: e */
    public final /* synthetic */ FinderFollowFeedUIContract$Presenter f30526e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9905o2(RefreshLoadMoreLayout.C7080c<Object> cVar, FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter) {
        super(0);
        this.f30525d = cVar;
        this.f30526e = finderFollowFeedUIContract$Presenter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r2 = r2.getRecyclerView();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r10 = this;
            com.tencent.mm.view.RefreshLoadMoreLayout$c<java.lang.Object> r0 = r10.f30525d
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
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r2 = r10.f30526e
            kf1.h r2 = r2.f30176f
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
            if (r2 == 0) goto L_0x003d
            int r4 = r2.mo82597F4()
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            r5 = 1
            if (r4 > 0) goto L_0x0043
            r4 = 1
            goto L_0x0044
        L_0x0043:
            r4 = 0
        L_0x0044:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "[checkEmptyHeader] isEmpty="
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = " reason="
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "FinderFollowFeedUIContract.Presenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            if (r4 != 0) goto L_0x0076
            if (r2 == 0) goto L_0x00f4
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r6 = r10.f30526e
            jq3.l$a r6 = r6.f13050p
            cm1.g r6 = (cm1.C0731g) r6
            int r6 = r6.hashCode()
            long r6 = (long) r6
            r2.mo85802j6(r6, r1)
            goto L_0x00f4
        L_0x0076:
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r6 = r10.f30526e
            kf1.h r6 = r6.f30176f
            if (r6 == 0) goto L_0x007f
            com.tencent.mm.view.RefreshLoadMoreLayout r6 = r6.f30220j
            goto L_0x0080
        L_0x007f:
            r6 = r3
        L_0x0080:
            if (r6 != 0) goto L_0x0083
            goto L_0x0086
        L_0x0083:
            r6.setEnableLoadMore(r1)
        L_0x0086:
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r6 = r10.f30526e
            jq3.l$a r6 = r6.f13050p
            boolean r7 = r6 instanceof cm1.C0731g
            if (r7 == 0) goto L_0x00c7
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FeedHeaderEmptyData"
            gy3.C87412m.m108592e(r6, r7)
            cm1.g r6 = (cm1.C0731g) r6
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131829304(0x7f112238, float:1.9291573E38)
            java.lang.String r8 = r8.getString(r9)
            java.lang.String r9 = "getContext().resources.g…g.finder_no_more_content)"
            gy3.C87412m.m108593f(r8, r9)
            r6.f1744d = r8
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r6 = r10.f30526e
            jq3.l$a r6 = r6.f13050p
            gy3.C87412m.m108592e(r6, r7)
            cm1.g r6 = (cm1.C0731g) r6
            int r8 = r0.f24947b
            r6.f1745e = r8
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r6 = r10.f30526e
            jq3.l$a r6 = r6.f13050p
            gy3.C87412m.m108592e(r6, r7)
            cm1.g r6 = (cm1.C0731g) r6
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r7 = r10.f30526e
            int r7 = r7.f13046i
            r6.f1746f = r7
        L_0x00c7:
            if (r2 == 0) goto L_0x00d5
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r6 = r10.f30526e
            jq3.l$a r6 = r6.f13050p
            boolean r6 = r2.mo85795Y5(r6)
            if (r6 != 0) goto L_0x00d5
            r6 = 1
            goto L_0x00d6
        L_0x00d5:
            r6 = 0
        L_0x00d6:
            if (r6 == 0) goto L_0x00e0
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r6 = r10.f30526e
            jq3.l$a r6 = r6.f13050p
            r2.mo85793T5(r6, r1)
            goto L_0x00f4
        L_0x00e0:
            com.tencent.mm.view.RefreshLoadMoreLayout$c<java.lang.Object> r6 = r10.f30525d
            if (r6 == 0) goto L_0x00f4
            if (r2 == 0) goto L_0x00f4
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r6 = r10.f30526e
            jq3.l$a r6 = r6.f13050p
            cm1.g r6 = (cm1.C0731g) r6
            int r6 = r6.hashCode()
            long r6 = (long) r6
            r2.mo85798e6(r6)
        L_0x00f4:
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r2 = r10.f30526e
            kf1.h r2 = r2.f30176f
            if (r2 == 0) goto L_0x00fc
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r2.f30220j
        L_0x00fc:
            if (r3 != 0) goto L_0x00ff
            goto L_0x010a
        L_0x00ff:
            int r0 = r0.f24947b
            r2 = -1
            if (r0 != r2) goto L_0x0106
            if (r4 != 0) goto L_0x0107
        L_0x0106:
            r1 = 1
        L_0x0107:
            r3.setEnableNestedScroll(r1)
        L_0x010a:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9905o2.invoke():java.lang.Object");
    }
}
