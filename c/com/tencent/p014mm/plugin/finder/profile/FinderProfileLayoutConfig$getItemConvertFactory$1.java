package com.tencent.p014mm.plugin.finder.profile;

import cm1.C0728e2;
import cm1.C0782u0;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import ve1.C14483c7;
import ve1.C14506e7;
import ve1.C14590p;
import ve1.C14604p7;
import ve1.C14614q7;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/profile/FinderProfileLayoutConfig$getItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.profile.FinderProfileLayoutConfig$getItemConvertFactory$1 */
public final class FinderProfileLayoutConfig$getItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ C32226l<Integer, C60896i<?>> $extraMap;
    public final /* synthetic */ FinderProfileLayoutConfig this$0;

    public FinderProfileLayoutConfig$getItemConvertFactory$1(FinderProfileLayoutConfig finderProfileLayoutConfig, C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        this.this$0 = finderProfileLayoutConfig;
        this.$extraMap = lVar;
    }

    public C60896i<?> getItemConvert(int i) {
        C60896i<?> invoke;
        boolean z = true;
        if (!(i == 4 || i == 9 || i == 2)) {
            z = false;
        }
        if (z) {
            FinderProfileLayoutConfig finderProfileLayoutConfig = this.this$0;
            if (finderProfileLayoutConfig.f16113d) {
                C14483c7 c7Var = new C14483c7(finderProfileLayoutConfig.f16112c);
                c7Var.f40139C = Boolean.valueOf(this.this$0.f16111b);
                return c7Var;
            }
            C14506e7 e7Var = new C14506e7();
            e7Var.f40203A = Boolean.valueOf(this.this$0.f16111b);
            return e7Var;
        } else if (i == C0728e2.class.hashCode()) {
            return new C14614q7();
        } else {
            if (i == C0782u0.class.hashCode()) {
                return new C14604p7();
            }
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
