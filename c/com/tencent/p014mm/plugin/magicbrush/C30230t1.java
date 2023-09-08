package com.tencent.p014mm.plugin.magicbrush;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import d42.C31066c0;
import gy3.C87412m;
import i52.C87661e;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/magicbrush/t1;", "Lcom/tencent/mm/ipcinvoker/r;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "mb-impl_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.magicbrush.t1 */
final class C30230t1 implements C80916r<Bundle, IPCBoolean> {
    public Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        C87412m.m108594g(bundle, "data");
        return new IPCBoolean(C87661e.m109006d().mo122080b(bundle.getString("pkgId"), bundle.getString("baseId"), bundle.getBoolean("isAutoCheck"), (C31066c0) null));
    }
}
