package lm1;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLivePresenter;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: lm1.e */
public final class C10548e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView.LayoutManager f31826d;

    /* renamed from: e */
    public final /* synthetic */ int f31827e;

    /* renamed from: f */
    public final /* synthetic */ int f31828f;

    /* renamed from: g */
    public final /* synthetic */ NearbyLivePresenter f31829g;

    public C10548e(RecyclerView.LayoutManager layoutManager, int i, int i2, NearbyLivePresenter nearbyLivePresenter) {
        this.f31826d = layoutManager;
        this.f31827e = i;
        this.f31828f = i2;
        this.f31829g = nearbyLivePresenter;
    }

    public final void run() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.f31826d;
        int i = this.f31827e;
        int i2 = this.f31828f;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i2));
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(staggeredGridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$2$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        staggeredGridLayoutManager.mo17414U(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
        C117292a.m165359e(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$2$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        this.f31829g.mo3583n(false, "IInitDone");
    }
}
