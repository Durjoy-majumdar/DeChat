package com.tencent.p014mm.plugin.finder.nearby.video;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import dq1.C7461a;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import kotlin.Metadata;
import nm1.C11231g;
import ve1.C14590p;
import ve1.C14632t2;
import ve1.C14669v8;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/nearby/video/NearbyVideoStaggeredConfig$getItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder-nearby_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoStaggeredConfig$getItemConvertFactory$1 */
public final class NearbyVideoStaggeredConfig$getItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ C32226l<Integer, C60896i<?>> $extraMap;
    public final /* synthetic */ NearbyVideoStaggeredConfig this$0;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoStaggeredConfig$getItemConvertFactory$1$a */
    public static final class C3340a extends C14669v8 {

        /* renamed from: s */
        public final /* synthetic */ NearbyVideoStaggeredConfig f15780s;

        public C3340a(NearbyVideoStaggeredConfig nearbyVideoStaggeredConfig) {
            this.f15780s = nearbyVideoStaggeredConfig;
        }

        /* renamed from: l */
        public void mo3149l(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(baseFinderFeed, "item");
            super.mo3149l(oVar, baseFinderFeed, i, i2, z, list);
            NearbyVideoStaggeredConfig.m3392f(this.f15780s, oVar, baseFinderFeed);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.NearbyVideoStaggeredConfig$getItemConvertFactory$1$b */
    public static final class C3341b extends C14632t2 {

        /* renamed from: s */
        public final /* synthetic */ NearbyVideoStaggeredConfig f15781s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3341b(NearbyVideoStaggeredConfig nearbyVideoStaggeredConfig) {
            super(0, (C7461a) null, (C32229r) null, (C32224a) null, 15, (C8480h) null);
            this.f15781s = nearbyVideoStaggeredConfig;
        }

        /* renamed from: l */
        public void mo44e(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(baseFinderFeed, "item");
            super.mo3149l(oVar, baseFinderFeed, i, i2, z, list);
            NearbyVideoStaggeredConfig.m3392f(this.f15781s, oVar, baseFinderFeed);
        }
    }

    public NearbyVideoStaggeredConfig$getItemConvertFactory$1(NearbyVideoStaggeredConfig nearbyVideoStaggeredConfig, C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        this.this$0 = nearbyVideoStaggeredConfig;
        this.$extraMap = lVar;
    }

    public C60896i<?> getItemConvert(int i) {
        C60896i<?> invoke;
        if (i != 2) {
            if (i != 4) {
                if (i == 9) {
                    return new C11231g(this.this$0.f15778a);
                }
                if (i != 3001) {
                    if (i != 3002) {
                        C32226l<Integer, C60896i<?>> lVar = this.$extraMap;
                        if (lVar != null && (invoke = lVar.invoke(Integer.valueOf(i))) != null) {
                            return invoke;
                        }
                        this.this$0.getClass();
                        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
                            throw new RuntimeException("type invalid");
                        }
                        Log.printInfoStack("FinderGridLayoutConfig", "type invalid", new Object[0]);
                        return new C14590p();
                    }
                }
            }
            return new C3340a(this.this$0);
        }
        return new C3341b(this.this$0);
    }
}
