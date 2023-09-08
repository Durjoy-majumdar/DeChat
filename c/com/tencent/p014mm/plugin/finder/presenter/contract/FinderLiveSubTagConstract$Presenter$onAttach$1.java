package com.tencent.p014mm.plugin.finder.presenter.contract;

import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import ve1.C65666s4;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderLiveSubTagConstract$Presenter$onAttach$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderLiveSubTagConstract$Presenter$onAttach$1 */
public final class FinderLiveSubTagConstract$Presenter$onAttach$1 implements C9500j {
    public final /* synthetic */ FinderLiveSubTagConstract.Presenter this$0;

    public FinderLiveSubTagConstract$Presenter$onAttach$1(FinderLiveSubTagConstract.Presenter presenter) {
        this.this$0 = presenter;
    }

    public C60896i<?> getItemConvert(int i) {
        C65666s4 s4Var = this.this$0.f160345j;
        if (s4Var != null) {
            return s4Var;
        }
        C87412m.m108603p("convert");
        throw null;
    }
}
