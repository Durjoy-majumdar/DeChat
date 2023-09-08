package rs1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import tf1.C13913l;

/* renamed from: rs1.l5 */
public final class C13315l5 implements C13913l {

    /* renamed from: a */
    public final /* synthetic */ C13298k5 f37782a;

    /* renamed from: b */
    public final /* synthetic */ FinderFeedShareRelativeListLoader f37783b;

    /* renamed from: rs1.l5$a */
    public static final class C13316a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedShareRelativeListLoader f37784d;

        /* renamed from: e */
        public final /* synthetic */ FinderLinearLayoutManager f37785e;

        /* renamed from: f */
        public final /* synthetic */ C13298k5 f37786f;

        public C13316a(FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader, FinderLinearLayoutManager finderLinearLayoutManager, C13298k5 k5Var) {
            this.f37784d = finderFeedShareRelativeListLoader;
            this.f37785e = finderLinearLayoutManager;
            this.f37786f = k5Var;
        }

        public final void run() {
            Integer rawInitPos = this.f37784d.getRawInitPos();
            int intValue = rawInitPos != null ? rawInitPos.intValue() : -1;
            if (intValue >= 0) {
                FinderLinearLayoutManager finderLinearLayoutManager = this.f37785e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(Integer.valueOf(intValue));
                C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$attach$1$2$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoNewFormUIC$attach$1$2$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                this.f37786f.getClass();
                WxRecyclerAdapter<?> wxRecyclerAdapter = this.f37786f.f37748r;
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyItemChanged(intValue + wxRecyclerAdapter.mo85796c6());
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            }
        }
    }

    public C13315l5(C13298k5 k5Var, FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader) {
        this.f37782a = k5Var;
        this.f37783b = finderFeedShareRelativeListLoader;
    }

    public void call(int i) {
        RecyclerView recyclerView = this.f37782a.mo12750i3().getRecyclerView();
        C13298k5 k5Var = this.f37782a;
        FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f37783b;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        k5Var.mo12753l3(false);
        C13298k5.m12652c3(k5Var, false);
        recyclerView.post(new C13316a(finderFeedShareRelativeListLoader, (FinderLinearLayoutManager) layoutManager, k5Var));
    }
}
