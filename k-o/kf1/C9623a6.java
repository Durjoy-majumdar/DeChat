package kf1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import tf1.C13913l;

/* renamed from: kf1.a6 */
public final class C9623a6 implements C13913l {

    /* renamed from: a */
    public final /* synthetic */ C9868n5 f29936a;

    /* renamed from: b */
    public final /* synthetic */ C2829n f29937b;

    /* renamed from: c */
    public final /* synthetic */ FinderFeedShareRelativeListLoader f29938c;

    /* renamed from: kf1.a6$a */
    public static final class C9624a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFeedShareRelativeListLoader f29939d;

        /* renamed from: e */
        public final /* synthetic */ FinderLinearLayoutManager f29940e;

        /* renamed from: f */
        public final /* synthetic */ C2829n f29941f;

        /* renamed from: g */
        public final /* synthetic */ C9868n5 f29942g;

        public C9624a(FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader, FinderLinearLayoutManager finderLinearLayoutManager, C2829n nVar, C9868n5 n5Var) {
            this.f29939d = finderFeedShareRelativeListLoader;
            this.f29940e = finderLinearLayoutManager;
            this.f29941f = nVar;
            this.f29942g = n5Var;
        }

        public final void run() {
            Integer rawInitPos = this.f29939d.getRawInitPos();
            int intValue = rawInitPos != null ? rawInitPos.intValue() : -1;
            if (intValue >= 0) {
                FinderLinearLayoutManager finderLinearLayoutManager = this.f29940e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(Integer.valueOf(intValue));
                C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$onAttach$2$2$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$onAttach$2$2$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                this.f29941f.f14123s = intValue;
                this.f29942g.mo10408b(intValue);
            }
        }
    }

    public C9623a6(C9868n5 n5Var, C2829n nVar, FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader) {
        this.f29936a = n5Var;
        this.f29937b = nVar;
        this.f29938c = finderFeedShareRelativeListLoader;
    }

    public void call(int i) {
        RecyclerView recyclerView = this.f29936a.f30451c.getRecyclerView();
        C2829n nVar = this.f29937b;
        FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader = this.f29938c;
        C9868n5 n5Var = this.f29936a;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        nVar.mo2934i(false);
        C2829n.m2662a(nVar, false);
        recyclerView.post(new C9624a(finderFeedShareRelativeListLoader, (FinderLinearLayoutManager) layoutManager, nVar, n5Var));
    }
}
