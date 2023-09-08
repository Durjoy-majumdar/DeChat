package kf1;

import androidx.recyclerview.widget.RecyclerView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: kf1.w1 */
public final class C10022w1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C10037x1 f30723d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10022w1(C10037x1 x1Var) {
        super(0);
        this.f30723d = x1Var;
    }

    public Object invoke() {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        C9707f fVar = this.f30723d.f29964g;
        if (!(fVar == null || (recyclerView = fVar.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
            adapter.notifyItemChanged(0, new C13604l(12, null));
        }
        return C13598b0.f38549a;
    }
}
