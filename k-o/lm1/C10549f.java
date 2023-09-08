package lm1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLivePresenter;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: lm1.f */
public final class C10549f implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ NearbyLivePresenter f31830d;

    /* renamed from: e */
    public final /* synthetic */ int f31831e;

    /* renamed from: f */
    public final /* synthetic */ RecyclerView f31832f;

    public C10549f(NearbyLivePresenter nearbyLivePresenter, int i, RecyclerView recyclerView) {
        this.f31830d = nearbyLivePresenter;
        this.f31831e = i;
        this.f31832f = recyclerView;
    }

    public final void run() {
        this.f31830d.mo3584n0().mo10816E(this.f31831e);
        RecyclerView.LayoutManager layoutManager = this.f31832f.getLayoutManager();
        if (layoutManager != null) {
            int i = this.f31831e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(layoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$2$1$call$1$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            layoutManager.scrollToPosition(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(layoutManager, "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$createFeedLoader$2$1$call$1$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
    }
}
