package kf1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import rx3.C13598b0;
import tf1.C13913l;

/* renamed from: kf1.k8 */
public final class C9831k8 implements C13913l {

    /* renamed from: a */
    public final /* synthetic */ C9745g8 f30384a;

    /* renamed from: kf1.k8$a */
    public static final class C9832a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9745g8 f30385d;

        /* renamed from: e */
        public final /* synthetic */ int f30386e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9832a(C9745g8 g8Var, int i) {
            super(0);
            this.f30385d = g8Var;
            this.f30386e = i;
        }

        public Object invoke() {
            RecyclerView recyclerView = this.f30385d.f30201h;
            if (recyclerView != null) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
                int i = this.f30386e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(Integer.valueOf(i));
                C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelineViewCallback$initView$2$1$call$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelineViewCallback$initView$2$1$call$1", "invoke", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                C9745g8 g8Var = this.f30385d;
                RecyclerView recyclerView2 = g8Var.f30201h;
                if (recyclerView2 != null) {
                    recyclerView2.post(new C9812j8(g8Var, this.f30386e));
                    return C13598b0.f38549a;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }

    public C9831k8(C9745g8 g8Var) {
        this.f30384a = g8Var;
    }

    public void call(int i) {
        int initPos = this.f30384a.f30199f.mo2583x().getInitPos();
        String str = this.f30384a.f30198e;
        Log.m105924i(str, "onRefreshEnd firstLoadMore " + this.f30384a.f30202i + " initPos " + initPos);
        C9745g8 g8Var = this.f30384a;
        if (g8Var.f30202i && initPos >= 0) {
            g8Var.f30202i = false;
            C61926c.m72668M(new C9832a(g8Var, initPos));
        }
    }
}
