package com.tencent.p014mm.plugin.finder.nearby.video;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kn1.C10364a;
import kotlin.Metadata;
import os1.C11759w;
import tf1.C13913l;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/video/NearbyVideoPresenter$feedLoader$2$1", "Ltf1/l;", "", "incrementCount", "Lrx3/b0;", "call", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$feedLoader$2$1 */
public final class NearbyVideoPresenter$feedLoader$2$1 implements C13913l {
    public final /* synthetic */ NearbyVideoFeedLoader $this_apply;
    private byte _hellAccFlag_;
    public final /* synthetic */ NearbyVideoPresenter this$0;

    public NearbyVideoPresenter$feedLoader$2$1(NearbyVideoFeedLoader nearbyVideoFeedLoader, NearbyVideoPresenter nearbyVideoPresenter) {
        this.$this_apply = nearbyVideoFeedLoader;
        this.this$0 = nearbyVideoPresenter;
    }

    public void call(int i) {
        int i2 = i;
        String tag = this.$this_apply.getTAG();
        Log.m105924i(tag, "[initData] canTimelineRefresh=" + this.this$0.canTimelineRefresh + ", incrementCount=" + i2);
        if (this.this$0.canTimelineRefresh) {
            this.this$0.autoFlingToRefresh(0, false);
            this.this$0.getViewCallback().mo3668c().post(NearbyVideoPresenter$feedLoader$2$1$call$1.INSTANCE);
        } else {
            C11759w.C11760a d3 = this.this$0.tlCache.mo11635d3(2);
            int i3 = d3.f34431c;
            int i4 = d3.f34432d;
            String tag2 = this.$this_apply.getTAG();
            Log.m105924i(tag2, "[initData] canTimelineRefresh " + this.this$0.canTimelineRefresh + " lastPos=" + i3 + " fromTopPixel=" + i4);
            RecyclerView.LayoutManager layoutManager = this.this$0.getViewCallback().getRecyclerView().getLayoutManager();
            this.this$0.totalDy = i4;
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i4));
                aVar.mo10233c(Integer.valueOf(i3));
                C9556a aVar2 = aVar;
                C117292a.m165358d(staggeredGridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/video/NearbyVideoPresenter$feedLoader$2$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.mo17414U(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                C117292a.m165359e(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/nearby/video/NearbyVideoPresenter$feedLoader$2$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                this.this$0.getViewCallback().getRecyclerView().post(new NearbyVideoPresenter$feedLoader$2$1$call$2(layoutManager, i3, i4, this.this$0));
            }
            if (i2 <= 0) {
                this.this$0.checkEmptyHeader((RefreshLoadMoreLayout.C7080c<Object>) null);
            }
        }
        this.this$0.getViewCallback().mo3668c().post(NearbyVideoPresenter$feedLoader$2$1$call$3.INSTANCE);
        C10364a access$getNextPagePreload$p = this.this$0.nextPagePreload;
        if (access$getNextPagePreload$p != null) {
            access$getNextPagePreload$p.f31559g = true;
        }
    }
}
