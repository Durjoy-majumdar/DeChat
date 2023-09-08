package com.tencent.p014mm.plugin.finder.service;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60187m5;
import ht1.C60208v1;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.service.y */
public final class C56302y extends C87413o implements C32226l<C60187m5, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60208v1.C60209a f160910d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56302y(C60208v1.C60209a aVar) {
        super(1);
        this.f160910d = aVar;
    }

    public Object invoke(Object obj) {
        C60187m5 m5Var = (C60187m5) obj;
        C87412m.m108594g(m5Var, LocaleUtil.ITALIAN);
        Log.m105924i("Finder.ContactService", "[getFinderMsgStrangerContact] completed! result=" + m5Var.getUsername() + '=' + m5Var.getNickname());
        C60208v1.C60209a aVar = this.f160910d;
        if (aVar != null) {
            aVar.mo78737a(m5Var);
        }
        return C13598b0.f38549a;
    }
}
