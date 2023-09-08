package vf1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderInteractionSearchUIContract$ViewCallback;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import rx3.C36570n;

/* renamed from: vf1.e1 */
public final class C14753e1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback f40727d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14753e1(FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback) {
        super(0);
        this.f40727d = finderInteractionSearchUIContract$ViewCallback;
    }

    public Object invoke() {
        RecyclerView.C16613e adapter = ((WxRecyclerView) ((C36570n) this.f40727d.f14449h).getValue()).getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        if (!this.f40727d.mo3008x()) {
            this.f40727d.mo3007v().setVisibility(8);
        } else {
            this.f40727d.mo3007v().setVisibility(0);
        }
        return C13598b0.f38549a;
    }
}
