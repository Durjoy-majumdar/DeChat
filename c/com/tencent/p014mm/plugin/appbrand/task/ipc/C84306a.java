package com.tencent.p014mm.plugin.appbrand.task.ipc;

import com.tencent.luggage.sdk.processes.C80264l;
import com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.appbrand.task.ipc.a */
public final class C84306a extends C87413o implements C32226l<C80264l, LuggageClientProcessMessage<?>> {

    /* renamed from: d */
    public final /* synthetic */ String f246191d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84306a(String str) {
        super(1);
        this.f246191d = str;
    }

    public Object invoke(Object obj) {
        C80264l lVar = (C80264l) obj;
        C87412m.m108594g(lVar, LocaleUtil.ITALIAN);
        if (C87412m.m108589b(this.f246191d, lVar.f234965a)) {
            return new AppBrandRuntimeCheckResetToTopOfStackMessage(this.f246191d);
        }
        return null;
    }
}
