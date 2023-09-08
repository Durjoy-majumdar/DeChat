package com.tencent.luggage.sdk.processes;

import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import gy3.C87412m;
import kotlin.Metadata;
import p488dc.C31103b;
import p963fc.C86812g;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo182094d2 = {"Lcom/tencent/luggage/sdk/processes/q;", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/luggage/sdk/processes/client/LuggageClientProcessMessage;", "Lfc/g;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "luggage-wechat-full-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.luggage.sdk.processes.q */
final class C28642q implements C80916r<LuggageClientProcessMessage<? extends C86812g>, IPCVoid> {
    public Object invoke(Object obj) {
        LuggageClientProcessMessage luggageClientProcessMessage = (LuggageClientProcessMessage) obj;
        C31103b bVar = C31103b.f83392a;
        C87412m.m108592e(luggageClientProcessMessage, "null cannot be cast to non-null type com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage<in com.tencent.luggage.sdk.runtime.AppBrandRuntimeLU>");
        bVar.mo57981a(luggageClientProcessMessage);
        IPCVoid iPCVoid = IPCVoid.f10316d;
        C87412m.m108593f(iPCVoid, "VOID");
        return iPCVoid;
    }
}
