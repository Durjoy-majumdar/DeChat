package com.tencent.p014mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.p014mm.ipcinvoker.C1256g;
import kotlin.Result;
import rx3.C13604l;
import wx3.C15601d;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.u */
public final class C82823u<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C15601d<C13604l<Boolean, Boolean>> f242217d;

    public C82823u(C15601d<? super C13604l<Boolean, Boolean>> dVar) {
        this.f242217d = dVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        NavigatorInterceptor$CheckIsActiveMiniGameIPCResult navigatorInterceptor$CheckIsActiveMiniGameIPCResult = (NavigatorInterceptor$CheckIsActiveMiniGameIPCResult) obj;
        boolean z = navigatorInterceptor$CheckIsActiveMiniGameIPCResult.f242150d;
        boolean z2 = navigatorInterceptor$CheckIsActiveMiniGameIPCResult.f242151e;
        C15601d<C13604l<Boolean, Boolean>> dVar = this.f242217d;
        Result.Companion companion = Result.Companion;
        dVar.resumeWith(Result.m168114constructorimpl(new C13604l(Boolean.valueOf(z), Boolean.valueOf(z2))));
    }
}
