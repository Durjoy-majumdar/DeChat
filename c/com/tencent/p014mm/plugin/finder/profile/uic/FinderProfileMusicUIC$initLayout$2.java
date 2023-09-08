package com.tencent.p014mm.plugin.finder.profile.uic;

import cm1.C55032t1;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import rx3.C13600d;
import ve1.C65617k7;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/profile/uic/FinderProfileMusicUIC$initLayout$2", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileMusicUIC$initLayout$2 */
public final class FinderProfileMusicUIC$initLayout$2 implements C9500j {
    public final /* synthetic */ FinderProfileMusicUIC this$0;

    public FinderProfileMusicUIC$initLayout$2(FinderProfileMusicUIC finderProfileMusicUIC) {
        this.this$0 = finderProfileMusicUIC;
    }

    public C60896i<?> getItemConvert(int i) {
        if (i == C55032t1.class.getName().hashCode()) {
            C65617k7 k7Var = new C65617k7();
            k7Var.f188815e = Boolean.valueOf(this.this$0.isSelfFlag());
            return k7Var;
        }
        C87412m.m108591d((Object) null);
        throw new C13600d();
    }
}
