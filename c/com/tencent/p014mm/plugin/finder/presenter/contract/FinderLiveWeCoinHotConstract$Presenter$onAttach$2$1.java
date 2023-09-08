package com.tencent.p014mm.plugin.finder.presenter.contract;

import ak1.C54067f0;
import ak1.C54108o;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0791x0;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveMemebrProfileWidget;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract;
import di3.C86312j;
import gy3.C87412m;
import jq3.C60898l;
import jq3.C60905o;
import kotlin.Metadata;
import te3.C49712hj1;
import te3.C49765hx0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderLiveWeCoinHotConstract$Presenter$onAttach$2$1", "Ljq3/l$b;", "Ljq3/o;", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveWeCoinHotConstract$Presenter$onAttach$2$1 */
public final class FinderLiveWeCoinHotConstract$Presenter$onAttach$2$1 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveWeCoinHotConstract.Presenter f16101d;

    public FinderLiveWeCoinHotConstract$Presenter$onAttach$2$1(FinderLiveWeCoinHotConstract.Presenter presenter) {
        this.f16101d = presenter;
    }

    /* renamed from: q */
    public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
        FinderLiveMemebrProfileWidget finderLiveMemebrProfileWidget;
        C60905o oVar = (C60905o) zVar;
        Class cls = C54108o.class;
        C87412m.m108594g(eVar, "adapter");
        C87412m.m108594g(view, "view");
        C87412m.m108594g(oVar, "holder");
        C49765hx0 hx02 = ((C0791x0) oVar.f173503E).f1849f.f138455d;
        if (hx02 != null) {
            FinderLiveWeCoinHotConstract.Presenter presenter = this.f16101d;
            ((C54108o) C86312j.m106911c(cls)).Qx0(C54067f0.C0058h.CLICK_LIST_ITEM_USER);
            FinderLiveWeCoinHotConstract.ViewCallback viewCallback = presenter.f16087f;
            if (!(viewCallback == null || (finderLiveMemebrProfileWidget = viewCallback.f16100r) == null)) {
                FinderLiveMemebrProfileWidget.m3151B(finderLiveMemebrProfileWidget, hx02, 0, (C49712hj1) null, false, (String) null, 16, (Object) null);
            }
            ((C54108o) C86312j.m106911c(cls)).Qx0(C54067f0.C0058h.EXPOSE_USER_FINDER_HALF_BOARD);
        }
    }
}
