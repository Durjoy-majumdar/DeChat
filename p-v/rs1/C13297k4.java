package rs1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p206nj.C11171e;
import rx3.C13598b0;

/* renamed from: rs1.k4 */
public final class C13297k4 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13539y3 f37736d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13297k4(C13539y3 y3Var) {
        super(0);
        this.f37736d = y3Var;
    }

    public Object invoke() {
        C13354o6 o6Var = (C13354o6) C39818r.f106831a.mo62444c(this.f37736d.getActivity()).mo62449e(C13354o6.class);
        if (o6Var != null) {
            o6Var.f37856d.mo2933h("resetToPortrait");
            if (o6Var.mo12778c3()) {
                C2829n nVar = o6Var.f37856d;
                if (nVar.f14123s >= 0) {
                    RecyclerView recyclerView = nVar.mo2932g().f30451c.getRecyclerView();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(nVar.f14123s + 1));
                    RecyclerView recyclerView2 = recyclerView;
                    C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "scrollToSelectPos", "()V", "Undefined", "scrollToPosition", "(I)V");
                    recyclerView.mo17115r1(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract", "scrollToSelectPos", "()V", "Undefined", "scrollToPosition", "(I)V");
                }
            }
        }
        if (C11171e.m11046c(30)) {
            this.f37736d.getActivity().getWindow().setDecorFitsSystemWindows(true);
        }
        this.f37736d.getActivity().getWindow().getDecorView().setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        this.f37736d.getActivity().getWindow().getDecorView().requestApplyInsets();
        return C13598b0.f38549a;
    }
}
