package com.tencent.p014mm.plugin.finder.presenter.contract;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderBlockListContract;
import com.tencent.p014mm.view.TouchableLayout;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;
import uo3.C78253a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderBlockListContract$BlockListViewCallback$initView$4", "Ljq3/l$c;", "Ljq3/o;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderBlockListContract$BlockListViewCallback$initView$4 */
public final class FinderBlockListContract$BlockListViewCallback$initView$4 implements C60898l.C9503c<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderBlockListContract.BlockListViewCallback f15917d;

    public FinderBlockListContract$BlockListViewCallback$initView$4(FinderBlockListContract.BlockListViewCallback blockListViewCallback) {
        this.f15917d = blockListViewCallback;
    }

    /* renamed from: n */
    public boolean mo759n(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g((C60905o) zVar, "holder");
        C78253a aVar = new C78253a(this.f15917d.f15900e);
        int c6 = i - ((C60898l) eVar).mo85796c6();
        FinderBlockListContract.BlockListViewCallback blockListViewCallback = this.f15917d;
        aVar.mo108272g(view, c6, 0, new C3379x179a03a4(blockListViewCallback), new C3380x179a03a5(c6, blockListViewCallback, eVar), TouchableLayout.f24959d, TouchableLayout.f24960e);
        aVar.mo70679m();
        return true;
    }
}
