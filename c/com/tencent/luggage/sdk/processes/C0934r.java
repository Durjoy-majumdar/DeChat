package com.tencent.luggage.sdk.processes;

import com.tencent.p014mm.ipcinvoker.C1255d;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import gy3.C87412m;
import kotlin.Metadata;
import q20.C89449a;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/processes/r;", "Lcom/tencent/mm/ipcinvoker/d;", "Lcom/tencent/luggage/sdk/processes/LuggageClientProcessMessage2;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C89449a
/* renamed from: com.tencent.luggage.sdk.processes.r */
final class C0934r implements C1255d<LuggageClientProcessMessage2, IPCVoid> {
    public void invoke(Object obj, C1256g gVar) {
        LuggageClientProcessMessage2 luggageClientProcessMessage2 = (LuggageClientProcessMessage2) obj;
        C87412m.m108594g(luggageClientProcessMessage2, "data");
        C87412m.m108594g(gVar, "callback");
        luggageClientProcessMessage2.mo886a();
        gVar.mo894a(IPCVoid.f10316d);
    }
}
