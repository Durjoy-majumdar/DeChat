package com.tencent.p014mm.plugin.finder.presenter.contract;

import cm1.C0748l0;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderFollowListContract;
import er1.C58784w3;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import ve1.C14456a4;
import ve1.C14590p;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/presenter/contract/FinderFollowListContract$FollowListViewCallback$initView$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderFollowListContract$FollowListViewCallback$initView$1 */
public final class FinderFollowListContract$FollowListViewCallback$initView$1 implements C9500j {
    public final /* synthetic */ FinderFollowListContract.FollowListViewCallback this$0;

    public FinderFollowListContract$FollowListViewCallback$initView$1(FinderFollowListContract.FollowListViewCallback followListViewCallback) {
        this.this$0 = followListViewCallback;
    }

    public C60896i<?> getItemConvert(int i) {
        if (i == C0748l0.class.getName().hashCode()) {
            return new C14456a4();
        }
        C58784w3.f168295a.mo83916b(this.this$0.f15939h, i);
        return new C14590p();
    }
}
