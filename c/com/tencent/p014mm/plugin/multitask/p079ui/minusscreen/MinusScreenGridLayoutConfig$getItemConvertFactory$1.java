package com.tencent.p014mm.plugin.multitask.p079ui.minusscreen;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import jq3.C60896i;
import jq3.C9500j;
import kotlin.Metadata;
import t92.C13868b;
import t92.C64215d;
import y92.C66584a;
import y92.C66585b;
import y92.C66586c;
import y92.C66592f;
import y92.C66593g;
import y92.C66594h;
import y92.C66596k;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, mo182094d2 = {"com/tencent/mm/plugin/multitask/ui/minusscreen/MinusScreenGridLayoutConfig$getItemConvertFactory$1", "Ljq3/j;", "", "type", "Ljq3/i;", "getItemConvert", "ui-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.ui.minusscreen.MinusScreenGridLayoutConfig$getItemConvertFactory$1 */
public final class MinusScreenGridLayoutConfig$getItemConvertFactory$1 implements C9500j {
    public final /* synthetic */ C32226l<Integer, C60896i<?>> $extraMap;
    public final /* synthetic */ C64215d this$0;

    public MinusScreenGridLayoutConfig$getItemConvertFactory$1(C64215d dVar, C32226l<? super Integer, ? extends C60896i<?>> lVar) {
        this.this$0 = dVar;
        this.$extraMap = lVar;
    }

    public C60896i<?> getItemConvert(int i) {
        C60896i<?> invoke;
        if (i == 1) {
            return new C66584a(this.this$0.f181996d);
        }
        if (i == 2) {
            return new C66596k(this.this$0.f181996d);
        }
        if (i == 3) {
            return new C66592f(this.this$0.f181996d);
        }
        if (i == 4) {
            return new C66585b(this.this$0.f181996d);
        }
        if (i == 5) {
            return new C66586c(this.this$0.f181996d);
        }
        if (i == 8) {
            return new C66593g(this.this$0.f181996d);
        }
        if (i == 22) {
            return new C66594h(this.this$0.f181996d);
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
        return new C13868b();
    }
}
