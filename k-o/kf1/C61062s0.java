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

/* renamed from: kf1.s0 */
public final class C61062s0<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderCommentDrawerPresenter f173900a;

    /* renamed from: b */
    public final /* synthetic */ C14121l f173901b;

    public C61062s0(FinderCommentDrawerPresenter finderCommentDrawerPresenter, C14121l lVar) {
        this.f173900a = finderCommentDrawerPresenter;
        this.f173901b = lVar;
    }

    public Object call(Object obj) {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        List list = (List) obj;
        this.f173900a.f158601D = true;
        C87412m.m108593f(list, LocaleUtil.ITALIAN);
        if (!list.isEmpty()) {
            int g = this.f173900a.f158618g.mo77387g();
            this.f173900a.f158618g.mo77382b(list, false, true);
            C65468g gVar = this.f173900a.f158622n;
            if (!(gVar == null || (recyclerView = gVar.mo89591p().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
                adapter.notifyItemRangeInserted(g, this.f173900a.f158618g.mo77387g() - g);
            }
        } else {
            Log.m105928w("Finder.DrawerPresenter", "[preloadNextPage] empty!");
            this.f173900a.f158601D = false;
        }
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
        cVar.f24951f = this.f173900a.f158628t;
        cVar.f24953h = list.size();
        cVar.f24952g = false;
        C65468g gVar2 = this.f173900a.f158622n;
        if (gVar2 != null) {
            gVar2.mo89591p().onPreFinishLoadMoreSmooth(cVar);
        }
        this.f173901b.mo11853b(C65234n.OK);
        return C13598b0.f38549a;
    }
}
