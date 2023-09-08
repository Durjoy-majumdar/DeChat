package com.tencent.p014mm.plugin.finder.storage;

import er1.C58784w3;
import fy3.C32226l;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import ve1.C14459a7;
import ve1.C14548j3;
import ve1.C14590p;
import ve1.C14706z2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/storage/FinderAtFeedManagerLayoutConfig$getItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.storage.FinderAtFeedManagerLayoutConfig$getItemConvertFactory$1 */
public final class FinderAtFeedManagerLayoutConfig$getItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ C32226l<Integer, C60896i<?>> $extraMap;
    public final /* synthetic */ FinderAtFeedManagerLayoutConfig this$0;

    public FinderAtFeedManagerLayoutConfig$getItemConvertFactory$1(FinderAtFeedManagerLayoutConfig finderAtFeedManagerLayoutConfig, C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        this.this$0 = finderAtFeedManagerLayoutConfig;
        this.$extraMap = lVar;
    }

    public C60896i<?> getItemConvert(int i) {
        C60896i<?> invoke;
        if (i == -5) {
            return new C14706z2();
        }
        if (i == -3) {
            return new C14548j3();
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 3001) {
                    if (i != 3002) {
                        C32226l<Integer, C60896i<?>> lVar = this.$extraMap;
                        if (lVar != null && (invoke = lVar.invoke(Integer.valueOf(i))) != null) {
                            return invoke;
                        }
                        this.this$0.getClass();
                        C58784w3.f168295a.mo83916b("FinderProfileGridLayoutConfig", i);
                        return new C14590p();
                    }
                }
            }
            FinderAtFeedManagerLayoutConfig finderAtFeedManagerLayoutConfig = this.this$0;
            return new C14459a7(finderAtFeedManagerLayoutConfig.f39903b, finderAtFeedManagerLayoutConfig.f16705f, finderAtFeedManagerLayoutConfig.f16704e, finderAtFeedManagerLayoutConfig.f16706g);
        }
        FinderAtFeedManagerLayoutConfig finderAtFeedManagerLayoutConfig2 = this.this$0;
        return new C14459a7(finderAtFeedManagerLayoutConfig2.f39903b, finderAtFeedManagerLayoutConfig2.f16705f, finderAtFeedManagerLayoutConfig2.f16704e, finderAtFeedManagerLayoutConfig2.f16706g);
    }
}
