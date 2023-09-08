package com.tencent.p014mm.plugin.finder.nearby.video;

import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "invoke", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$checkEmptyHeader$1 */
public final class NearbyVideoPresenter$checkEmptyHeader$1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: $r */
    public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f15777$r;
    public final /* synthetic */ NearbyVideoPresenter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NearbyVideoPresenter$checkEmptyHeader$1(RefreshLoadMoreLayout.C7080c<Object> cVar, NearbyVideoPresenter nearbyVideoPresenter) {
        super(0);
        this.f15777$r = cVar;
        this.this$0 = nearbyVideoPresenter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r3 = r3.getRecyclerView();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r9 = this;
            com.tencent.mm.view.RefreshLoadMoreLayout$c<java.lang.Object> r0 = r9.f15777$r
            r1 = 2131829304(0x7f112238, float:1.9291573E38)
            r2 = 0
            if (r0 != 0) goto L_0x001b
            com.tencent.mm.view.RefreshLoadMoreLayout$c r0 = new com.tencent.mm.view.RefreshLoadMoreLayout$c
            r0.<init>(r2)
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getString(r1)
            r0.f24948c = r3
        L_0x001b:
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter r3 = r9.this$0
            com.tencent.mm.plugin.finder.nearby.video.b r3 = r3.getViewCallback()
            r4 = 0
            if (r3 == 0) goto L_0x002f
            androidx.recyclerview.widget.RecyclerView r3 = r3.getRecyclerView()
            if (r3 == 0) goto L_0x002f
            androidx.recyclerview.widget.RecyclerView$e r3 = r3.getAdapter()
            goto L_0x0030
        L_0x002f:
            r3 = r4
        L_0x0030:
            boolean r5 = r3 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r5 == 0) goto L_0x0037
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r3 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r3
            goto L_0x0038
        L_0x0037:
            r3 = r4
        L_0x0038:
            if (r3 == 0) goto L_0x003f
            int r5 = r3.mo82597F4()
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
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "[checkEmptyHeader] isEmpty="
            r7.append(r8)
            r7.append(r5)
            java.lang.String r8 = " reason="
            r7.append(r8)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "Finder.NearbyVideoPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            int r7 = r0.f24946a
            r8 = 2
            if (r7 == r8) goto L_0x0070
            int r7 = r0.f24947b
            r8 = -2
            if (r7 != r8) goto L_0x0070
            r7 = 1
            goto L_0x0071
        L_0x0070:
            r7 = 0
        L_0x0071:
            if (r5 != 0) goto L_0x0087
            if (r7 != 0) goto L_0x0087
            if (r3 == 0) goto L_0x0111
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter r1 = r9.this$0
            cm1.g r1 = r1.emptyData
            int r1 = r1.hashCode()
            long r7 = (long) r1
            r3.mo85802j6(r7, r2)
            goto L_0x0111
        L_0x0087:
            if (r7 == 0) goto L_0x00a0
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter r7 = r9.this$0
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoFeedLoader r7 = r7.getFeedLoader()
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r7 = r7.getDataList()
            r7.clear()
            if (r3 == 0) goto L_0x009b
            r3.notifyDataSetChanged()
        L_0x009b:
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter r7 = r9.this$0
            r7.isEmptyLocation = r6
        L_0x00a0:
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter r7 = r9.this$0
            com.tencent.mm.plugin.finder.nearby.video.b r7 = r7.getViewCallback()
            if (r7 == 0) goto L_0x00ad
            com.tencent.mm.view.RefreshLoadMoreLayout r7 = r7.mo3668c()
            goto L_0x00ae
        L_0x00ad:
            r7 = r4
        L_0x00ae:
            if (r7 != 0) goto L_0x00b1
            goto L_0x00b4
        L_0x00b1:
            r7.setEnableLoadMore(r2)
        L_0x00b4:
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter r7 = r9.this$0
            cm1.g r7 = r7.emptyData
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r1 = r8.getString(r1)
            java.lang.String r8 = "getContext().resources.g…g.finder_no_more_content)"
            gy3.C87412m.m108593f(r1, r8)
            r7.getClass()
            r7.f1744d = r1
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter r1 = r9.this$0
            cm1.g r1 = r1.emptyData
            int r7 = r0.f24947b
            r1.f1745e = r7
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter r1 = r9.this$0
            cm1.g r1 = r1.emptyData
            r7 = 1002(0x3ea, float:1.404E-42)
            r1.f1746f = r7
            if (r3 == 0) goto L_0x00f4
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter r1 = r9.this$0
            cm1.g r1 = r1.emptyData
            boolean r1 = r3.mo85795Y5(r1)
            if (r1 != 0) goto L_0x00f4
            r1 = 1
            goto L_0x00f5
        L_0x00f4:
            r1 = 0
        L_0x00f5:
            if (r1 == 0) goto L_0x0101
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter r1 = r9.this$0
            cm1.g r1 = r1.emptyData
            r3.mo85793T5(r1, r2)
            goto L_0x0111
        L_0x0101:
            if (r3 == 0) goto L_0x0111
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter r1 = r9.this$0
            cm1.g r1 = r1.emptyData
            int r1 = r1.hashCode()
            long r7 = (long) r1
            r3.mo85798e6(r7)
        L_0x0111:
            com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter r1 = r9.this$0
            com.tencent.mm.plugin.finder.nearby.video.b r1 = r1.getViewCallback()
            if (r1 == 0) goto L_0x011d
            com.tencent.mm.view.RefreshLoadMoreLayout r4 = r1.mo3668c()
        L_0x011d:
            if (r4 != 0) goto L_0x0120
            goto L_0x012b
        L_0x0120:
            int r0 = r0.f24947b
            r1 = -1
            if (r0 != r1) goto L_0x0127
            if (r5 != 0) goto L_0x0128
        L_0x0127:
            r2 = 1
        L_0x0128:
            r4.setEnableNestedScroll(r2)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.video.NearbyVideoPresenter$checkEmptyHeader$1.invoke():void");
    }
}
