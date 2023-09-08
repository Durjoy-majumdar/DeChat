package kf1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0731g;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: kf1.ga */
public final class C9749ga extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f30209d;

    /* renamed from: e */
    public final /* synthetic */ C9720fa f30210e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9749ga(RefreshLoadMoreLayout.C7080c<Object> cVar, C9720fa faVar) {
        super(0);
        this.f30209d = cVar;
        this.f30210e = faVar;
    }

    public Object invoke() {
        RefreshLoadMoreLayout.C7080c<Object> cVar = this.f30209d;
        boolean z = false;
        if (cVar == null) {
            cVar = new RefreshLoadMoreLayout.C7080c<>(0);
            cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.eey);
        }
        RecyclerView recyclerView = this.f30210e.mo10325q().getRecyclerView();
        WxRecyclerAdapter wxRecyclerAdapter = null;
        RecyclerView.C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter instanceof WxRecyclerAdapter) {
            wxRecyclerAdapter = (WxRecyclerAdapter) adapter;
        }
        boolean z2 = (wxRecyclerAdapter != null ? wxRecyclerAdapter.mo82597F4() : 0) <= 0;
        Log.m105924i("Finder.TimelineLbsPresenter", "[checkEmptyHeader] isEmpty=" + z2 + " reason=" + cVar);
        boolean z3 = cVar.f24946a != 2 && cVar.f24947b == -2;
        if (z2 || z3) {
            if (z3) {
                this.f30210e.f30152i.getDataList().clear();
                if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.notifyDataSetChanged();
                }
                this.f30210e.f30155o = true;
            }
            RefreshLoadMoreLayout c = this.f30210e.mo10325q().mo10293c();
            if (c != null) {
                c.setEnableLoadMore(false);
            }
            C0731g gVar = this.f30210e.f30156p;
            String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.eey);
            C87412m.m108593f(string, "getContext().resources.g…g.finder_no_more_content)");
            gVar.getClass();
            gVar.f1744d = string;
            C0731g gVar2 = this.f30210e.f30156p;
            gVar2.f1745e = cVar.f24947b;
            gVar2.f1746f = 2;
            if (wxRecyclerAdapter != null && !wxRecyclerAdapter.mo85795Y5(gVar2)) {
                wxRecyclerAdapter.mo85793T5(this.f30210e.f30156p, false);
            } else if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.mo85798e6((long) this.f30210e.f30156p.hashCode());
            }
        } else if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.mo85802j6((long) this.f30210e.f30156p.hashCode(), false);
        }
        RefreshLoadMoreLayout c2 = this.f30210e.mo10325q().mo10293c();
        if (c2 != null) {
            if (cVar.f24947b != -1 || !z2) {
                z = true;
            }
            c2.setEnableNestedScroll(z);
        }
        return C13598b0.f38549a;
    }
}
