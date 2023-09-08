package kf1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.feed.FinderHalfScreenContract$Presenter;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C13604l;

/* renamed from: kf1.f3 */
public final class C9714f3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderHalfScreenContract$Presenter f30138d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9714f3(FinderHalfScreenContract$Presenter finderHalfScreenContract$Presenter) {
        super(0);
        this.f30138d = finderHalfScreenContract$Presenter;
    }

    public Object invoke() {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        C9707f fVar = this.f30138d.f29964g;
        if (!(fVar == null || (recyclerView = fVar.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
            adapter.notifyItemChanged(0, new C13604l(12, null));
        }
        return C13598b0.f38549a;
    }
}
