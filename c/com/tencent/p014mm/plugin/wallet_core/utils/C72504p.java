package com.tencent.p014mm.plugin.wallet_core.utils;

import com.tencent.kinda.gen.ITransmitKvData;
import com.tencent.kinda.gen.UseCaseCallback;
import com.tencent.p014mm.plugin.wallet_core.utils.C72502o;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32227p;
import gy3.C87412m;
import java.util.NoSuchElementException;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.wallet_core.utils.p */
public final class C72504p implements UseCaseCallback {

    /* renamed from: a */
    public final /* synthetic */ C32227p<C72502o.C72503a, Long, C13598b0> f210914a;

    public C72504p(C32227p<? super C72502o.C72503a, ? super Long, C13598b0> pVar) {
        this.f210914a = pVar;
    }

    public void call(ITransmitKvData iTransmitKvData) {
        C87412m.m108594g(iTransmitKvData, "data");
        int i = iTransmitKvData.getInt("compliance_half_page_action");
        long j = iTransmitKvData.getLong("usecase_platform_session");
        Log.m105924i("MicroMsg.WCPayComplianceHalfPage", "closed with action: " + i);
        C32227p<C72502o.C72503a, Long, C13598b0> pVar = this.f210914a;
        if (pVar != null) {
            for (C72502o.C72503a aVar : C72502o.C72503a.values()) {
                if (aVar.f210913d == i) {
                    pVar.invoke(aVar, Long.valueOf(j));
                    return;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }
}
