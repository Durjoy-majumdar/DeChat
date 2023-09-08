package dt0;

import com.tencent.p014mm.plugin.appbrand.widget.desktop.DragFeatureView;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: dt0.n */
public class C75455n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f221775d;

    /* renamed from: e */
    public final /* synthetic */ DragFeatureView f221776e;

    public C75455n(DragFeatureView dragFeatureView, boolean z) {
        this.f221776e = dragFeatureView;
        this.f221775d = z;
    }

    public void run() {
        Log.m105925i("MicroMsg.DragFeatureView", "alvinluo handleAttachEdge isTop: %b", Boolean.valueOf(this.f221775d));
        Log.m105925i("MicroMsg.DragFeatureView", "alvinluo handleAttachEdge canScroll: %b", Boolean.valueOf(this.f221776e.getRecyclerView().canScrollVertically(this.f221775d ? -10 : 10)));
        this.f221776e.getRecyclerView().scrollBy(0, this.f221775d ? -20 : 20);
        this.f221776e.post(this);
    }
}
