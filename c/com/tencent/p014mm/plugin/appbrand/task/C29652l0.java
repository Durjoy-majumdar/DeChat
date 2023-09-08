package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.luggage.sdk.processes.LuggageServiceType;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.appbrand.task.l0 */
public final class C29652l0 extends IllegalStateException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29652l0(LuggageServiceType luggageServiceType) {
        super("unexpected service type:" + luggageServiceType.name());
        C87412m.m108594g(luggageServiceType, "type");
    }
}
