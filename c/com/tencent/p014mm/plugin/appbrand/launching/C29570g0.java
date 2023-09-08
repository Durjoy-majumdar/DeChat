package com.tencent.p014mm.plugin.appbrand.launching;

import a14.C53916l;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import kotlin.Result;
import kr0.C33994g0;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.g0 */
public final class C29570g0 implements C33994g0.C33996b {

    /* renamed from: a */
    public final /* synthetic */ C29573h0 f80487a;

    /* renamed from: b */
    public final /* synthetic */ C53916l<C13598b0> f80488b;

    public C29570g0(C29573h0 h0Var, C53916l<? super C13598b0> lVar) {
        this.f80487a = h0Var;
        this.f80488b = lVar;
    }

    /* renamed from: a */
    public void mo56819a() {
        Log.m105924i("MicroMsg.AppLaunchFileCleanBlockingRunner", "suspendedAwaitFileCleanCompleted, appId:" + this.f80487a.f80493b);
        if (this.f80488b.mo74597a()) {
            C53916l<C13598b0> lVar = this.f80488b;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
        }
        ((C33994g0) C86312j.m106911c(C33994g0.class)).mo56492ST(this.f80487a.f80493b, this);
    }
}
