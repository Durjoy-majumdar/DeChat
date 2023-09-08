package kf1;

import androidx.recyclerview.widget.RecyclerView;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: kf1.wb */
public final class C10035wb implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f30756d;

    /* renamed from: e */
    public final /* synthetic */ int f30757e;

    public C10035wb(RecyclerView recyclerView, int i) {
        this.f30756d = recyclerView;
        this.f30757e = i;
    }

    public final void run() {
        RecyclerView recyclerView = this.f30756d;
        int i = this.f30757e;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        C117292a.m165358d(recyclerView, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$ViewCallback$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/feed/FinderTopicTimelineUIContract$ViewCallback$smoothScrollToNextPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
