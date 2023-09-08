package kf1;

import androidx.recyclerview.widget.RecyclerView;
import bo1.C54505r;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.sdk.platformtools.Log;
import wp1.C15585f;

/* renamed from: kf1.mb */
public final class C9863mb implements C54505r.C54506a {

    /* renamed from: a */
    public final /* synthetic */ FinderTimelinePresenter f30441a;

    public C9863mb(FinderTimelinePresenter finderTimelinePresenter) {
        this.f30441a = finderTimelinePresenter;
    }

    /* renamed from: a */
    public void mo10406a(FinderItem finderItem, int i) {
        RecyclerView recyclerView;
        RecyclerView.C16613e adapter;
        C9878n9 n9Var;
        if (finderItem != null) {
            FinderTimelinePresenter finderTimelinePresenter = this.f30441a;
            if (finderItem.getFinderObject().place_holder_info == null && (n9Var = finderTimelinePresenter.f13269j) != null) {
                n9Var.mo10414C0(false);
            }
            if (finderTimelinePresenter.f13285z.getDataList().size() == 0) {
                String str = finderTimelinePresenter.f13249I;
                Log.m105924i(str, "preloadCallback data list size = 0 feedId=" + finderItem.getId());
                finderTimelinePresenter.f13285z.getDataList().add(C15585f.f42211a.mo14348k(finderItem));
                C9878n9 n9Var2 = finderTimelinePresenter.f13269j;
                if (n9Var2 != null && (recyclerView = n9Var2.getRecyclerView()) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.notifyDataSetChanged();
                }
            }
        }
    }
}
