package vf1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: vf1.d4 */
public final class C14747d4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ RecyclerView f40719d;

    public C14747d4(RecyclerView recyclerView) {
        this.f40719d = recyclerView;
    }

    public final void run() {
        RecyclerView.LayoutManager layoutManager = this.f40719d.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        int C = ((FinderLinearLayoutManager) layoutManager).mo16957C() - 1;
        if (C >= 0) {
            RecyclerView recyclerView = this.f40719d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(C));
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback$smoothScrollToPrevPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/feed/ui/FinderLocalTimelineContract$ViewCallback$smoothScrollToPrevPosition$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
