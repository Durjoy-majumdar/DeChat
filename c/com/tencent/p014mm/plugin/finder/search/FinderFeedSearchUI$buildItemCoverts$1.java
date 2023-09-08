package com.tencent.p014mm.plugin.finder.search;

import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullLiveConvert;
import gy3.C8480h;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import ve1.C14445a2;
import ve1.C14590p;
import ve1.C14592p2;
import ve1.C14702y7;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/search/FinderFeedSearchUI$buildItemCoverts$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.search.FinderFeedSearchUI$buildItemCoverts$1 */
public final class FinderFeedSearchUI$buildItemCoverts$1 implements C9500j {
    public final /* synthetic */ FinderFeedSearchUI this$0;

    public FinderFeedSearchUI$buildItemCoverts$1(FinderFeedSearchUI finderFeedSearchUI) {
        this.this$0 = finderFeedSearchUI;
    }

    public C60896i<?> getItemConvert(int i) {
        int i2 = i;
        if (i2 == -11) {
            return new C14702y7();
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 == 9) {
                    FinderFeedSearchUI finderFeedSearchUI = this.this$0;
                    return new FinderFeedFullLiveConvert(finderFeedSearchUI.f16473L, finderFeedSearchUI, false, 0, 0, 28, (C8480h) null);
                } else if (i2 != 3001) {
                    if (i2 != 3002) {
                        return new C14590p();
                    }
                }
            }
            FinderFeedSearchUI finderFeedSearchUI2 = this.this$0;
            return new C14592p2(finderFeedSearchUI2.f16473L, finderFeedSearchUI2, false, 0, false, 28, (C8480h) null);
        }
        return new C14445a2(this.this$0, false, 0, false, 14, (C8480h) null);
    }
}
