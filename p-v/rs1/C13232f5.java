package rs1;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC;
import fy3.C32224a;
import gy3.C87413o;

/* renamed from: rs1.f5 */
public final class C13232f5 extends C87413o implements C32224a<Boolean> {

    /* renamed from: d */
    public final /* synthetic */ FinderHorizontalVideoDrawerUIC f37581d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13232f5(FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC) {
        super(0);
        this.f37581d = finderHorizontalVideoDrawerUIC;
    }

    public Object invoke() {
        RecyclerView.LayoutManager layoutManager = ((C13298k5) C39818r.f106831a.mo62444c(this.f37581d.getActivity()).mo75002a(C13298k5.class)).mo12750i3().getRecyclerView().getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        boolean z = true;
        if (!(linearLayoutManager == null || linearLayoutManager.mo17004z() == 0)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
