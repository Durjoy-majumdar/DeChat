package com.tencent.p014mm.plugin.finder.p056ui;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C9662c2;
import tf1.C13913l;

/* renamed from: com.tencent.mm.plugin.finder.ui.a4 */
public final class C3770a4 implements C13913l {

    /* renamed from: a */
    public final /* synthetic */ FinderShareFeedRelUI f17240a;

    /* renamed from: b */
    public final /* synthetic */ FinderFeedShareRelativeListLoader f17241b;

    /* renamed from: com.tencent.mm.plugin.finder.ui.a4$a */
    public static final class C3771a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLinearLayoutManager f17242d;

        /* renamed from: e */
        public final /* synthetic */ FinderFeedShareRelativeListLoader f17243e;

        /* renamed from: f */
        public final /* synthetic */ FinderShareFeedRelUI f17244f;

        public C3771a(FinderLinearLayoutManager finderLinearLayoutManager, FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader, FinderShareFeedRelUI finderShareFeedRelUI) {
            this.f17242d = finderLinearLayoutManager;
            this.f17243e = finderFeedShareRelativeListLoader;
            this.f17244f = finderShareFeedRelUI;
        }

        public final void run() {
            FinderLinearLayoutManager finderLinearLayoutManager = this.f17242d;
            int initPos = this.f17243e.getInitPos();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            aVar.mo10233c(Integer.valueOf(initPos));
            C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$5$2$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$5$2$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            FinderShareFeedRelUI.m3925V7(this.f17244f);
        }
    }

    public C3770a4(FinderShareFeedRelUI finderShareFeedRelUI, FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader) {
        this.f17240a = finderShareFeedRelUI;
        this.f17241b = finderFeedShareRelativeListLoader;
    }

    public void call(int i) {
        C9662c2 c2Var = this.f17240a.f17168u;
        if (c2Var != null) {
            RecyclerView recyclerView = c2Var.getRecyclerView();
            FinderShareFeedRelUI finderShareFeedRelUI = this.f17240a;
            FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f17241b;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
            finderShareFeedRelUI.mo4134g8(false);
            finderShareFeedRelUI.mo4135i8(false);
            recyclerView.post(new C3771a((FinderLinearLayoutManager) layoutManager, finderFeedShareRelativeListLoader, finderShareFeedRelUI));
            ShareRelPresenter shareRelPresenter = this.f17240a.f17167t;
            if (shareRelPresenter != null) {
                shareRelPresenter.mo4147C1();
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        } else {
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }
}
