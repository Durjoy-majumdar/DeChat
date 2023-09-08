package com.tencent.p014mm.plugin.finder.feed.p052ui;

import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import ve1.C14558k3;
import ve1.C14561l3;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/feed/ui/FinderInteractionSearchUIContract$ViewCallback$config$1$getItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderInteractionSearchUIContract$ViewCallback$config$1$getItemConvertFactory$1 */
public final class C2948xebad5f88 implements C9500j {
    public final /* synthetic */ C9500j $superFactory;
    public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback this$0;
    public final /* synthetic */ FinderInteractionSearchUIContract$ViewCallback$config$1 this$1;

    public C2948xebad5f88(FinderInteractionSearchUIContract$ViewCallback finderInteractionSearchUIContract$ViewCallback, FinderInteractionSearchUIContract$ViewCallback$config$1 finderInteractionSearchUIContract$ViewCallback$config$1, C9500j jVar) {
        this.this$0 = finderInteractionSearchUIContract$ViewCallback;
        this.this$1 = finderInteractionSearchUIContract$ViewCallback$config$1;
        this.$superFactory = jVar;
    }

    public C60896i<?> getItemConvert(int i) {
        if (i != 2) {
            if (i != 4) {
                if (i != 3001) {
                    if (i != 3002) {
                        return this.$superFactory.getItemConvert(i);
                    }
                }
            }
            return new C14561l3(this.this$0.f14446e.f40850n, this.this$1.f16724b);
        }
        return new C14558k3(this.this$0.f14446e.f40850n, this.this$1.f16724b);
    }
}
