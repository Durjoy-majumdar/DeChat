package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0748l0;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderFollowListContract;
import com.tencent.p014mm.view.TouchableLayout;
import fe1.C58969q;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;
import uo3.C78253a;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$initView$3", "Ljq3/l$c;", "Ljq3/o;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$3 */
public final class FinderFollowListContract$FollowListViewCallback$initView$3 implements C60898l.C9503c<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderFollowListContract.FollowListViewCallback f15958d;

    public FinderFollowListContract$FollowListViewCallback$initView$3(FinderFollowListContract.FollowListViewCallback followListViewCallback) {
        this.f15958d = followListViewCallback;
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        ArrayList<C0748l0> arrayList = this.f15958d.f15937f.f15930g;
        if (C66785b.f191882e.mo90677q1(arrayList.get(i).f1766d.getUsername())) {
            return true;
        }
        FinderFollowListContract.FollowListViewCallback followListViewCallback = this.f15958d;
        C0748l0 l0Var = arrayList.get(i);
        C87412m.m108593f(l0Var, "data[position]");
        C0748l0 l0Var2 = l0Var;
        followListViewCallback.getClass();
        C58969q qVar = l0Var2.f1766d;
        C78253a aVar = followListViewCallback.f15942n;
        if (aVar != null) {
            aVar.mo108266a();
            C78253a aVar2 = followListViewCallback.f15942n;
            if (aVar2 != null) {
                aVar2.mo108273h(view, new FinderFollowListContract$FollowListViewCallback$showPopupMenu$1(followListViewCallback), new FinderFollowListContract$FollowListViewCallback$showPopupMenu$2(followListViewCallback, qVar, l0Var2), TouchableLayout.f24959d, TouchableLayout.f24960e);
                return true;
            }
            C87412m.m108603p("popupMenu");
            throw null;
        }
        C87412m.m108603p("popupMenu");
        throw null;
    }
}
