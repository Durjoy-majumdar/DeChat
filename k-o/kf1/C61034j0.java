package kf1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import hp3.C87581a;
import java.util.List;
import rx3.C13598b0;
import u60.C14121l;
import u60.C65234n;
import ur1.C65468g;

/* renamed from: kf1.j0 */
public final class C61034j0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderCommentDrawerPresenter f173815a;

    /* renamed from: b */
    public final /* synthetic */ C14121l f173816b;

    public C61034j0(FinderCommentDrawerPresenter finderCommentDrawerPresenter, C14121l lVar) {
        this.f173815a = finderCommentDrawerPresenter;
        this.f173816b = lVar;
    }

    public Object call(Object obj) {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        List list = (List) obj;
        C87412m.m108593f(list, LocaleUtil.ITALIAN);
        if (!list.isEmpty()) {
            int g = this.f173815a.f158618g.mo77387g();
            this.f173815a.f158618g.mo77382b(list, false, true);
            C65468g gVar = this.f173815a.f158622n;
            if (!(gVar == null || (recyclerView = gVar.mo89591p().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
                adapter.notifyItemRangeInserted(g, this.f173815a.f158618g.mo77387g() - g);
            }
        } else {
            Log.m105928w("Finder.DrawerPresenter", "[loadMoreData] empty!");
        }
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
        cVar.f24951f = this.f173815a.f158628t;
        int size = list.size();
        cVar.f24953h = size;
        if (size > 0) {
            cVar.f24952g = false;
        }
        C65468g gVar2 = this.f173815a.f158622n;
        if (gVar2 != null) {
            gVar2.mo89591p().onPreFinishLoadMoreSmooth(cVar);
        }
        this.f173816b.mo11853b(C65234n.OK);
        return C13598b0.f38549a;
    }
}
