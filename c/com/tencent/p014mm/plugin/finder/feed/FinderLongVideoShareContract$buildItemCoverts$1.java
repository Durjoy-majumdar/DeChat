package com.tencent.p014mm.plugin.finder.feed;

import bl3.C39818r;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import rs1.C13354o6;
import ve1.C14612q6;
import ve1.C14677w4;
import ve1.C14692x4;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/FinderLongVideoShareContract$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.FinderLongVideoShareContract$buildItemCoverts$1 */
public final class FinderLongVideoShareContract$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ C2829n this$0;

    public FinderLongVideoShareContract$buildItemCoverts$1(C2829n nVar) {
        this.this$0 = nVar;
    }

    public C60896i<?> getItemConvert(int i) {
        return i == -1 ? new C14677w4() : ((C13354o6) C39818r.f106831a.mo62444c(this.this$0.f14111d).mo75002a(C13354o6.class)).mo12778c3() ? new C14612q6(this.this$0) : new C14692x4(this.this$0);
    }
}
