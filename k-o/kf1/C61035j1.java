package kf1;

import androidx.recyclerview.widget.RecyclerView;
import cm1.C0787w;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import hp3.C87581a;
import java.util.Iterator;
import java.util.LinkedList;
import rx3.C13598b0;
import te3.C50557nk0;
import u60.C14121l;
import u60.C65234n;
import ur1.C65467c;

/* renamed from: kf1.j1 */
public final class C61035j1<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C61028h1 f173817a;

    /* renamed from: b */
    public final /* synthetic */ C14121l f173818b;

    public C61035j1(C61028h1 h1Var, C14121l lVar) {
        this.f173817a = h1Var;
        this.f173818b = lVar;
    }

    public Object call(Object obj) {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        LinkedList linkedList = (LinkedList) obj;
        C87412m.m108593f(linkedList, LocaleUtil.ITALIAN);
        if (!linkedList.isEmpty()) {
            int size = this.f173817a.f173804j.size();
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                C50557nk0 nk02 = (C50557nk0) it.next();
                Iterator<C0787w> it4 = this.f173817a.f173804j.iterator();
                int i = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        i = -1;
                        break;
                    } else if (C87412m.m108589b(it4.next().f1843d.f138637f, nk02.f138637f)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (!(i >= 0)) {
                    this.f173817a.f173804j.add(new C0787w(new C50557nk0()));
                }
            }
            C65467c cVar = this.f173817a.f173805n;
            if (!(cVar == null || (recyclerView = cVar.mo89582h().getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
                adapter.notifyItemRangeInserted(size, this.f173817a.f173804j.size() - size);
            }
        } else {
            Log.m105928w("Finder.FavListDrawerPresenter", "[loadMoreData] empty!");
        }
        RefreshLoadMoreLayout.C7080c cVar2 = new RefreshLoadMoreLayout.C7080c(0);
        cVar2.f24951f = this.f173817a.f173809r;
        int size2 = linkedList.size();
        cVar2.f24953h = size2;
        if (size2 > 0) {
            cVar2.f24952g = false;
        }
        C65467c cVar3 = this.f173817a.f173805n;
        if (cVar3 != null) {
            cVar3.mo89582h().onPreFinishLoadMoreSmooth(cVar2);
        }
        this.f173818b.mo11853b(C65234n.OK);
        return C13598b0.f38549a;
    }
}
