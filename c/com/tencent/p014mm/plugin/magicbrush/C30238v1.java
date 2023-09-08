package com.tencent.p014mm.plugin.magicbrush;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import gy3.C87412m;
import i52.C87661e;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/v1;", "Lcom/tencent/mm/ipcinvoker/r;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "mb-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.magicbrush.v1 */
final class C30238v1 implements C80916r<Bundle, IPCVoid> {
    public Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        C87412m.m108594g(bundle, "data");
        C87661e.m109006d().mo122084g(bundle.getString("pkgId"), bundle.getString("url"), bundle.getString("signature"), bundle.getString("op"));
        return new IPCVoid();
    }
}
