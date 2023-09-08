package com.tencent.p014mm.plugin.finder.p056ui;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C9662c2;

/* renamed from: com.tencent.mm.plugin.finder.ui.e4 */
public final class C3788e4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderShareFeedRelUI f17263d;

    public C3788e4(FinderShareFeedRelUI finderShareFeedRelUI) {
        this.f17263d = finderShareFeedRelUI;
    }

    public final void run() {
        int E;
        C9662c2 c2Var = this.f17263d.f17168u;
        if (c2Var != null) {
            RecyclerView.LayoutManager layoutManager = c2Var.getRecyclerView().getLayoutManager();
            if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).mo16959E() - 1 >= 0) {
                C9662c2 c2Var2 = this.f17263d.f17168u;
                if (c2Var2 != null) {
                    RecyclerView recyclerView = c2Var2.getRecyclerView();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(E));
                    RecyclerView recyclerView2 = recyclerView;
                    C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$5$3$4", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                    recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$5$3$4", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                    return;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }
}
