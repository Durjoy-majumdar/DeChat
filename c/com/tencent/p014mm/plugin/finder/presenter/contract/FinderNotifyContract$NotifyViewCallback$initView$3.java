package com.tencent.p014mm.plugin.finder.presenter.contract;

import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderNotifyContract;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jq3.C33631s;
import jq3.C60906r;
import jq3.C60907t;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderNotifyContract$NotifyViewCallback$initView$3", "Ljq3/t;", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract$NotifyViewCallback$initView$3 */
public final class FinderNotifyContract$NotifyViewCallback$initView$3 implements C60907t {

    /* renamed from: a */
    public final /* synthetic */ FinderNotifyContract.NotifyViewCallback f160499a;

    public FinderNotifyContract$NotifyViewCallback$initView$3(FinderNotifyContract.NotifyViewCallback notifyViewCallback) {
        this.f160499a = notifyViewCallback;
    }

    /* renamed from: a */
    public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(rVar, "data");
        for (C33631s sVar : rVar.f173513i) {
        }
        String str = this.f160499a.f160453e;
        Log.m105924i(str, "index " + this.f160499a.f160452d + " last firstVisibleItemPosition " + rVar.f173508d + "  lastVisibleItemPosition :" + rVar.f173509e + "    lastFirstVisibleItemPosition   " + rVar.f173506b + " lastLastVisibleItemPosition  " + rVar.f173507c + "  diffVisibleDataList.size:" + rVar.f173513i.size() + " acrossDataList " + rVar.f173511g.size() + "   visibleDataList:" + rVar.f173510f.size());
    }
}
