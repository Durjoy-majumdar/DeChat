package com.tencent.p014mm.plugin.appbrand.jsapi.wccoin;

import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import f40.C86709a0;
import gy3.C87412m;
import kotlin.Metadata;
import m53.C10756c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/wccoin/e;", "Lcom/tencent/mm/ipcinvoker/d;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCLong;", "<init>", "()V", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.wccoin.e */
final class C1893e implements C1255d<Bundle, IPCLong> {

    /* renamed from: d */
    public final String f11736d = "MicroMsg.JsApiGetWCCoinBalance";

    public void invoke(Object obj, C1256g gVar) {
        C87412m.m108594g((Bundle) obj, "data");
        C87412m.m108594g(gVar, "callback");
        ((C10756c) C86709a0.m107533q(C10756c.class)).mo11000qy(new C1892d(this, gVar));
    }
}
