package com.tencent.p014mm.plugin.finder.storage;

import bl3.C39818r;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedLiveListConvert;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import dq1.C7461a;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32229r;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import jq3.C60896i;
import jq3.C60905o;
import jq3.C9500j;
import kf1.C10008v1;
import kotlin.Metadata;
import rs1.C13442s8;
import ve1.C14548j3;
import ve1.C14590p;
import ve1.C14632t2;
import ve1.C14648u3;
import ve1.C14706z2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/storage/FinderLbsStaggeredConfig$getItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.storage.FinderLbsStaggeredConfig$getItemConvertFactory$1 */
public final class FinderLbsStaggeredConfig$getItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ C32226l<Integer, C60896i<?>> $extraMap;
    public final /* synthetic */ FinderLbsStaggeredConfig this$0;

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderLbsStaggeredConfig$getItemConvertFactory$1$a */
    public static final class C3628a extends C14648u3 {

        /* renamed from: s */
        public final /* synthetic */ FinderLbsStaggeredConfig f16721s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3628a(FinderLbsStaggeredConfig finderLbsStaggeredConfig) {
            super(0, (C7461a) null, (C32229r) null, (C32224a) null, 15, (C8480h) null);
            this.f16721s = finderLbsStaggeredConfig;
        }

        /* renamed from: l */
        public void mo44e(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(baseFinderFeed, "item");
            super.mo3149l(oVar, baseFinderFeed, i, i2, z, list);
            FinderLbsStaggeredConfig.m3799f(this.f16721s, oVar, baseFinderFeed);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.storage.FinderLbsStaggeredConfig$getItemConvertFactory$1$b */
    public static final class C3629b extends C14632t2 {

        /* renamed from: s */
        public final /* synthetic */ FinderLbsStaggeredConfig f16722s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3629b(FinderLbsStaggeredConfig finderLbsStaggeredConfig) {
            super(0, (C7461a) null, (C32229r) null, (C32224a) null, 15, (C8480h) null);
            this.f16722s = finderLbsStaggeredConfig;
        }

        /* renamed from: l */
        public void mo44e(C60905o oVar, BaseFinderFeed baseFinderFeed, int i, int i2, boolean z, List<Object> list) {
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(baseFinderFeed, "item");
            super.mo3149l(oVar, baseFinderFeed, i, i2, z, list);
            FinderLbsStaggeredConfig.m3799f(this.f16722s, oVar, baseFinderFeed);
        }
    }

    public FinderLbsStaggeredConfig$getItemConvertFactory$1(FinderLbsStaggeredConfig finderLbsStaggeredConfig, C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        this.this$0 = finderLbsStaggeredConfig;
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
            if (!(i == 4 || i == 9)) {
                if (i == 2003) {
                    return new FinderFeedLiveListConvert((C10008v1) null, ((C13442s8) C39818r.f106831a.mo62444c(this.this$0.f16719a).mo75002a(C13442s8.class)).mo12861q3(), 2);
                }
                if (i != 3001) {
                    if (i != 3002) {
                        C32226l<Integer, C60896i<?>> lVar = this.$extraMap;
                        if (lVar != null && (invoke = lVar.invoke(Integer.valueOf(i))) != null) {
                            return invoke;
                        }
                        this.this$0.getClass();
                        C58784w3.f168295a.mo83916b("FinderLbsStaggeredConfig", i);
                        return new C14590p();
                    }
                }
            }
            return new C3628a(this.this$0);
        }
        return new C3629b(this.this$0);
    }
}
