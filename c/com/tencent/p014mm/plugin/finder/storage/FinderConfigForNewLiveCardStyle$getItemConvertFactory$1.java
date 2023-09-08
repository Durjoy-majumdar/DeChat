package com.tencent.p014mm.plugin.finder.storage;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import fy3.C32226l;
import fy3.C32228q;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import kotlin.Metadata;
import rx3.C13598b0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/storage/FinderConfigForNewLiveCardStyle$getItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.storage.FinderConfigForNewLiveCardStyle$getItemConvertFactory$1 */
public final class FinderConfigForNewLiveCardStyle$getItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ C32226l<Integer, C60896i<?>> $extraMap;
    public final /* synthetic */ FinderConfigForNewLiveCardStyle this$0;

    public FinderConfigForNewLiveCardStyle$getItemConvertFactory$1(FinderConfigForNewLiveCardStyle finderConfigForNewLiveCardStyle, C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        this.this$0 = finderConfigForNewLiveCardStyle;
        this.$extraMap = lVar;
    }

    public C60896i<?> getItemConvert(int i) {
        return this.this$0.mo4003g(i, this.$extraMap, (C32228q<? super C60905o, ? super BaseFinderFeed, ? super Integer, C13598b0>) null);
    }
}
