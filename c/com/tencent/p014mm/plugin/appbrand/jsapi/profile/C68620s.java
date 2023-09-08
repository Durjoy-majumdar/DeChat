package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import di3.C86312j;
import gy3.C87412m;
import p239sv.C13782a;
import p239sv.C77792p;
import p239sv.C77793t;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.s */
public final class C68620s extends C82904p {
    /* renamed from: a */
    public C13782a mo94300a(Context context, AppBrandProxyUIProcessTask.ProcessRequest processRequest, C77793t tVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(processRequest, "request");
        C87412m.m108594g(tVar, "callback");
        C77792p pVar = (C77792p) C86312j.m106911c(C77792p.class);
        if (pVar == null) {
            return null;
        }
        UrlJumpToProfileRequest urlJumpToProfileRequest = processRequest instanceof UrlJumpToProfileRequest ? (UrlJumpToProfileRequest) processRequest : null;
        return pVar.mo107726AB(context, urlJumpToProfileRequest != null ? urlJumpToProfileRequest.f242339d : null, 3, (byte[]) null, tVar);
    }
}
