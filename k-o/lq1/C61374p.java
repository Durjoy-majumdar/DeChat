package lq1;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.uniComments.UniCommentDrawerPresenter;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import hp3.C87581a;
import java.util.List;
import rx3.C13598b0;
import u60.C14121l;
import u60.C65234n;

/* renamed from: lq1.p */
public final class C61374p<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ UniCommentDrawerPresenter f174571a;

    /* renamed from: b */
    public final /* synthetic */ C14121l f174572b;

    public C61374p(UniCommentDrawerPresenter uniCommentDrawerPresenter, C14121l lVar) {
        this.f174571a = uniCommentDrawerPresenter;
        this.f174572b = lVar;
    }

    public Object call(Object obj) {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        List list = (List) obj;
        C87412m.m108593f(list, LocaleUtil.ITALIAN);
        if (!list.isEmpty()) {
            int f = this.f174571a.f161378f.mo86301f();
            this.f174571a.f161378f.mo86297b(list, false, true);
            C61356g0 g0Var = this.f174571a.f161382j;
            if (!(g0Var == null || (recyclerView = g0Var.mo86320q().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
                adapter.notifyItemRangeInserted(f, this.f174571a.f161378f.mo86301f() - f);
            }
        } else {
            Log.m105928w("MicroMsg.MusicUni.DrawerPresenter", "[loadMoreData] empty!");
        }
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
        cVar.f24951f = this.f174571a.f161387r;
        int size = list.size();
        cVar.f24953h = size;
        if (size > 0) {
            cVar.f24952g = false;
        }
        C61356g0 g0Var2 = this.f174571a.f161382j;
        if (g0Var2 != null) {
            g0Var2.mo86320q().onPreFinishLoadMoreSmooth(cVar);
        }
        this.f174572b.mo11853b(C65234n.OK);
        return C13598b0.f38549a;
    }
}
