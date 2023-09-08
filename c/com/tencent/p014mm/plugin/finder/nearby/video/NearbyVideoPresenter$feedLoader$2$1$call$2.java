package com.tencent.p014mm.plugin.finder.nearby.video;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo182094d2 = {"Lrx3/b0;", "run", "()V", "<anonymous>"}, mo182095k = 3, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter$feedLoader$2$1$call$2 */
public final class NearbyVideoPresenter$feedLoader$2$1$call$2 implements Runnable {
    public final /* synthetic */ int $fromTopPixel;
    public final /* synthetic */ int $lastPos;
    public final /* synthetic */ RecyclerView.LayoutManager $layoutManager;
    private byte _hellAccFlag_;
    public final /* synthetic */ NearbyVideoPresenter this$0;

    public NearbyVideoPresenter$feedLoader$2$1$call$2(RecyclerView.LayoutManager layoutManager, int i, int i2, NearbyVideoPresenter nearbyVideoPresenter) {
        this.$layoutManager = layoutManager;
        this.$lastPos = i;
        this.$fromTopPixel = i2;
        this.this$0 = nearbyVideoPresenter;
    }

    public final void run() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.$layoutManager;
        int i = this.$lastPos;
        int i2 = this.$fromTopPixel;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(staggeredGridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/video/NearbyVideoPresenter$feedLoader$2$1$call$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        staggeredGridLayoutManager.mo17414U(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/nearby/video/NearbyVideoPresenter$feedLoader$2$1$call$2", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        this.this$0.checkAutoPlay("IInitDone");
    }
}
