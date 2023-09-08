package com.tencent.p014mm.plugin.finder.storage;

import er1.C58784w3;
import fy3.C32226l;
import gy3.C8480h;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import up1.C14353j0;
import ve1.C14524f7;
import ve1.C14548j3;
import ve1.C14590p;
import ve1.C14706z2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/storage/FinderProfileGridLayoutConfig$getItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.storage.FinderProfileGridLayoutConfig$getItemConvertFactory$1 */
public final class FinderProfileGridLayoutConfig$getItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ C32226l<Integer, C60896i<?>> $extraMap;
    public final /* synthetic */ C14353j0 this$0;

    public FinderProfileGridLayoutConfig$getItemConvertFactory$1(C14353j0 j0Var, C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        this.this$0 = j0Var;
        this.$extraMap = lVar;
    }

    public C60896i<?> getItemConvert(int i) {
        C60896i<?> invoke;
        int i2 = i;
        if (i2 == -5) {
            return new C14706z2();
        }
        if (i2 == -3) {
            return new C14548j3();
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 3001) {
                    if (i2 != 3002) {
                        C32226l<Integer, C60896i<?>> lVar = this.$extraMap;
                        if (lVar != null && (invoke = lVar.invoke(Integer.valueOf(i))) != null) {
                            return invoke;
                        }
                        this.this$0.getClass();
                        C58784w3.f168295a.mo83916b("FinderProfileGridLayoutConfig", i2);
                        return new C14590p();
                    }
                }
            }
            C14353j0 j0Var = this.this$0;
            return new C14524f7(j0Var.f39903b, j0Var.f39905d, j0Var.f39904c, false, 8, (C8480h) null);
        }
        C14353j0 j0Var2 = this.this$0;
        return new C14524f7(j0Var2.f39903b, j0Var2.f39905d, j0Var2.f39904c, false, 8, (C8480h) null);
    }
}
