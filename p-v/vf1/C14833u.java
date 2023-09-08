package vf1;

import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.feed.model.FinderInteractionSearchFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderFavTimelineUI;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C9993u1;
import rs1.C63575n3;
import tf1.C13913l;

/* renamed from: vf1.u */
public final class C14833u implements C13913l {

    /* renamed from: a */
    public final /* synthetic */ FinderFavTimelineUI f40830a;

    /* renamed from: b */
    public final /* synthetic */ FinderInteractionSearchFeedLoader f40831b;

    public C14833u(FinderFavTimelineUI finderFavTimelineUI, FinderInteractionSearchFeedLoader finderInteractionSearchFeedLoader) {
        this.f40830a = finderFavTimelineUI;
        this.f40831b = finderInteractionSearchFeedLoader;
    }

    public void call(int i) {
        C9993u1 u1Var = this.f40830a.f14271t;
        if (u1Var != null) {
            RecyclerView.LayoutManager layoutManager = u1Var.getRecyclerView().getLayoutManager();
            if (layoutManager != null) {
                FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                int initPos = this.f40831b.getInitPos();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(Integer.valueOf(initPos));
                C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFavTimelineUI$createFeedLoader$3$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/ui/FinderFavTimelineUI$createFeedLoader$3$1", "call", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            C63575n3 n3Var = (C63575n3) C39818r.f106831a.mo62444c(this.f40830a).mo75002a(C63575n3.class);
            C9993u1 u1Var2 = this.f40830a.f14271t;
            if (u1Var2 != null) {
                n3Var.mo88422e3(u1Var2.getRecyclerView());
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        } else {
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }
}
