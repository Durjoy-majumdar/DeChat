package kf1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0793y;
import com.tencent.p014mm.plugin.finder.feed.FinderLikeDrawerPresenter;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx3.C13598b0;
import te3.C50581nr0;
import u60.C14121l;
import u60.C65234n;
import ur1.C14378f;

/* renamed from: kf1.r3 */
public final class C9952r3<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ FinderLikeDrawerPresenter f30596a;

    /* renamed from: b */
    public final /* synthetic */ C14121l f30597b;

    public C9952r3(FinderLikeDrawerPresenter finderLikeDrawerPresenter, C14121l lVar) {
        this.f30596a = finderLikeDrawerPresenter;
        this.f30597b = lVar;
    }

    public Object call(Object obj) {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        List<C50581nr0> list = (List) obj;
        C87412m.m108593f(list, LocaleUtil.ITALIAN);
        if (!list.isEmpty()) {
            int size = this.f30596a.f13103g.size();
            for (C50581nr0 nr02 : list) {
                Iterator<C0793y> it = this.f30596a.f13103g.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (C87412m.m108589b(it.next().f1851d.f138729i, nr02.f138729i)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (!(i >= 0)) {
                    ArrayList<C0793y> arrayList = this.f30596a.f13103g;
                    C0793y yVar = new C0793y(nr02);
                    if (this.f30596a.f13101e != null && yVar.f1851d.f138731n == 1) {
                        yVar.f1852e = true;
                    }
                    arrayList.add(yVar);
                }
            }
            C14378f fVar = this.f30596a.f13106j;
            if (!(fVar == null || (recyclerView = fVar.mo13681i().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
                adapter.notifyItemRangeInserted(size, this.f30596a.f13103g.size() - size);
            }
        } else {
            Log.m105928w("Finder.DrawerPresenter", "[loadMoreData] empty!");
        }
        RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
        cVar.f24951f = this.f30596a.f13108o;
        int size2 = list.size();
        cVar.f24953h = size2;
        if (size2 > 0) {
            cVar.f24952g = false;
        }
        C14378f fVar2 = this.f30596a.f13106j;
        if (fVar2 != null) {
            fVar2.mo13681i().onPreFinishLoadMoreSmooth(cVar);
        }
        this.f30597b.mo11853b(C65234n.OK);
        return C13598b0.f38549a;
    }
}
