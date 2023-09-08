package com.tencent.p014mm.plugin.appbrand.jsapi.profile;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import di3.C86312j;
import gy3.C87412m;
import p239sv.C13782a;
import p239sv.C77792p;
import p239sv.C77793t;
import rx3.C13598b0;
import te3.C64352ey3;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.profile.r */
public final class C68619r extends C82904p {
    /* renamed from: a */
    public C13782a mo94300a(Context context, AppBrandProxyUIProcessTask.ProcessRequest processRequest, C77793t tVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(processRequest, "request");
        C87412m.m108594g(tVar, "callback");
        C77792p pVar = (C77792p) C86312j.m106911c(C77792p.class);
        String str = null;
        if (pVar == null) {
            return null;
        }
        C64352ey3 ey32 = new C64352ey3();
        ReqJumpToProfileRequest reqJumpToProfileRequest = processRequest instanceof ReqJumpToProfileRequest ? (ReqJumpToProfileRequest) processRequest : null;
        if (reqJumpToProfileRequest != null) {
            str = reqJumpToProfileRequest.f242338d;
        }
        ey32.toPb(str);
        C13598b0 b0Var = C13598b0.f38549a;
        return pVar.Jq0(context, ey32, tVar);
    }
}
