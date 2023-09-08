package kf1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.feed.C2829n;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.u5 */
public final class C10000u5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C2829n f30693d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10000u5(C2829n nVar) {
        super(0);
        this.f30693d = nVar;
    }

    public Object invoke() {
        C2829n nVar = this.f30693d;
        C9743g6 g6Var = new C9743g6(400, nVar.f14111d);
        g6Var.f44872a = nVar.f14123s + 1;
        RecyclerView.LayoutManager layoutManager = nVar.mo2932g().f30451c.getRecyclerView().getLayoutManager();
        if (layoutManager != null) {
            layoutManager.startSmoothScroll(g6Var);
        }
        return C13598b0.f38549a;
    }
}
