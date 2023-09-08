package ve1;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bd1.C39758f;
import bd1.C39759i;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C86312j;
import gy3.C87412m;
import ht1.C8788n3;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C60898l;
import jq3.C60905o;
import kf1.C10008v1;
import kf1.C9847lb;
import kf1.C9878n9;
import nj3.C76912y0;
import sx3.C64197v;
import te3.C50295lp1;
import zc1.C66785b;

/* renamed from: ve1.d3 */
public final class C14491d3 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C14477c3 f40180d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40181e;

    public C14491d3(C14477c3 c3Var, C60905o oVar) {
        this.f40180d = c3Var;
        this.f40181e = oVar;
    }

    public final void onClick(View view) {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        RefreshLoadMoreLayout c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C10008v1 v1Var = this.f40180d.f40124f;
        FinderTimelinePresenter finderTimelinePresenter = v1Var instanceof FinderTimelinePresenter ? (FinderTimelinePresenter) v1Var : null;
        if (finderTimelinePresenter != null) {
            C60905o oVar = this.f40181e;
            C87412m.m108594g(oVar, "holder");
            C66785b bVar = C66785b.f191882e;
            C50295lp1 lp12 = bVar.mo90673n0().mo62397b().f140479w;
            if (lp12 != null ? lp12.f137574d : true) {
                Iterator it = finderTimelinePresenter.f13285z.getDataListJustForAdapter().iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((C0740i2) it.next()).mo75c() == 15) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    finderTimelinePresenter.f13285z.getDataListJustForAdapter().remove(i);
                    ((FinderTimelinePresenter.C2559a) finderTimelinePresenter.f13243C).onItemRangeRemoved(i, 1);
                    C76912y0.makeText((Context) finderTimelinePresenter.f13266g, (int) C0966R.string.f360730nb3, 0).show();
                }
                Log.m105920e(finderTimelinePresenter.f13249I, "openPersonalizedSetting: personalized recommend video is opened");
            } else {
                ((C8788n3) C86312j.m106911c(C8788n3.class)).Xu0(true, 1);
                C39758f fVar = new C39758f();
                if (fVar.mo62397b().f140479w == null) {
                    fVar.mo62397b().f140479w = new C50295lp1();
                }
                C50295lp1 lp13 = fVar.mo62397b().f140479w;
                if (lp13 != null) {
                    lp13.f137574d = true;
                }
                bVar.mo90665S0(fVar, C39759i.FINDER_SETTING_PERSONALIZED);
                C9878n9 n9Var = finderTimelinePresenter.f13269j;
                if (!(n9Var == null || (recyclerView = n9Var.getRecyclerView()) == null || (adapter = recyclerView.getAdapter()) == null)) {
                    int j = oVar.mo17363j() - ((C60898l) adapter).mo85796c6();
                    DataBuffer dataListJustForAdapter = finderTimelinePresenter.f13285z.getDataListJustForAdapter();
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it4 = dataListJustForAdapter.iterator();
                    int i2 = 0;
                    while (it4.hasNext()) {
                        Object next = it4.next();
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            C0740i2 i2Var = (C0740i2) next;
                            if (i2 > j) {
                                arrayList2.add(next);
                            }
                            i2 = i3;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    String str = finderTimelinePresenter.f13249I;
                    Log.m105924i(str, "openPersonalizedSetting: adapterPosition=" + oVar.mo17363j() + ", currentPos=" + j + ", removeSize=" + arrayList2.size());
                    finderTimelinePresenter.f13285z.getDataListJustForAdapter().removeAll(arrayList2);
                    adapter.notifyItemRangeRemoved(oVar.mo17363j() + 1, arrayList2.size());
                    C9878n9 n9Var2 = finderTimelinePresenter.f13269j;
                    if (!(n9Var2 == null || (c = n9Var2.mo10416c()) == null)) {
                        c.getRecyclerView().post(new C9847lb(oVar, c, finderTimelinePresenter));
                    }
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
