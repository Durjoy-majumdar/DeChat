package kf1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import dp1.C7432d2;
import ef1.C58553c;
import gy3.C87412m;
import ht1.C60172g4;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rs1.C13442s8;

/* renamed from: kf1.j8 */
public final class C9812j8 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C9745g8 f30348d;

    /* renamed from: e */
    public final /* synthetic */ int f30349e;

    public C9812j8(C9745g8 g8Var, int i) {
        this.f30348d = g8Var;
        this.f30349e = i;
    }

    public final void run() {
        C58553c a;
        RecyclerView recyclerView = this.f30348d.f30201h;
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
            FinderLinearLayoutManager finderLinearLayoutManager = (FinderLinearLayoutManager) layoutManager;
            int i = this.f30349e;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            aVar.mo10233c(Integer.valueOf(i));
            C117292a.m165358d(finderLinearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelineViewCallback$initView$2$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            finderLinearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
            C117292a.m165359e(finderLinearLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderProfileTimelineContract$ProfileTimelineViewCallback$initView$2$1$call$1$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f30348d.f30197d);
            if (f != null && (a = C60172g4.C60173a.m70189a(f, 0, 1, (Object) null)) != null) {
                a.mo83451b(new C7432d2(this.f30349e));
                return;
            }
            return;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }
}
