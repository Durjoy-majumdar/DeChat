package com.tencent.p014mm.plugin.finder.storage;

import cm1.C0716c;
import er1.C58784w3;
import fy3.C32226l;
import jq3.C60896i;
import jq3.C9500j;
import kf1.C9930p9;
import kotlin.Metadata;
import up1.C14359r;
import ve1.C14470b5;
import ve1.C14590p;
import ve1.C14700y4;
import ve1.C14706z2;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/finder/storage/FinderLbsConfig$getItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.storage.FinderLbsConfig$getItemConvertFactory$1 */
public final class FinderLbsConfig$getItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ C32226l<Integer, C60896i<?>> $extraMap;
    public final /* synthetic */ C9930p9<C0716c> $presenter;
    public final /* synthetic */ C14359r this$0;

    public FinderLbsConfig$getItemConvertFactory$1(C9930p9<C0716c> p9Var, C32226l<? super Integer, ? extends C60896i<?>> lVar, C14359r rVar) {
        this.$presenter = p9Var;
        this.$extraMap = lVar;
        this.this$0 = rVar;
    }

    public C60896i<?> getItemConvert(int i) {
        C60896i<?> invoke;
        if (i == -5) {
            return new C14706z2();
        }
        if (i == 1001) {
            return new C14470b5(this.$presenter);
        }
        if (i == 1002) {
            return new C14700y4();
        }
        C32226l<Integer, C60896i<?>> lVar = this.$extraMap;
        if (lVar != null && (invoke = lVar.invoke(Integer.valueOf(i))) != null) {
            return invoke;
        }
        this.this$0.getClass();
        C58784w3.f168295a.mo83916b("FinderLbsConfig", i);
        return new C14590p();
    }
}
