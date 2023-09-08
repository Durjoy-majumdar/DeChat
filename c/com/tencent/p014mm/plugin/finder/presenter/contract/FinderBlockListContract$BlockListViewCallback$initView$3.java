package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderBlockListContract;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import er1.C58684b;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback$initView$3", "Ljq3/l$b;", "Ljq3/o;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$3 */
public final class FinderBlockListContract$BlockListViewCallback$initView$3 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderBlockListContract.BlockListViewCallback f15916d;

    public FinderBlockListContract$BlockListViewCallback$initView$3(FinderBlockListContract.BlockListViewCallback blockListViewCallback) {
        this.f15916d = blockListViewCallback;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C60905o oVar = (C60905o) zVar;
        Class cls = C58684b.class;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        if (i == 0) {
            FinderBlockListContract.BlockListViewCallback blockListViewCallback = this.f15916d;
            blockListViewCallback.f15899d.f15895d.mo13654p(blockListViewCallback.f15900e);
            return;
        }
        int c6 = i - ((C60898l) eVar).mo85796c6();
        if (c6 >= 0 && c6 < this.f15916d.f15899d.f15897f.size()) {
            FinderContact finderContact = this.f15916d.f15899d.f15897f.get(c6).f1809d;
            if (C72996z1.m85817T4(finderContact.username)) {
                Intent intent = new Intent();
                intent.putExtra("finder_username", finderContact.username);
                Context context = oVar.f173499A;
                C87412m.m108593f(context, "holder.context");
                ((C58684b) C86312j.m106911c(cls)).mo13272V1(context, intent);
                return;
            }
            ((C58684b) C86312j.m106911c(cls)).fy0(finderContact.username, this.f15916d.f15900e);
        }
    }
}
