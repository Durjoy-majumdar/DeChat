package com.tencent.p014mm.plugin.appbrand.ipc;

import f40.C86709a0;
import g40.C87134f;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: com.tencent.mm.plugin.appbrand.ipc.b */
public final class C1536b implements C87134f {

    /* renamed from: d */
    public final /* synthetic */ C15601d<C13598b0> f10908d;

    public C1536b(C15601d<? super C13598b0> dVar) {
        this.f10908d = dVar;
    }

    /* renamed from: e */
    public void mo1180e() {
        C15601d<C13598b0> dVar = this.f10908d;
        Result.Companion companion = Result.Companion;
        dVar.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
    }

    /* renamed from: g */
    public void mo1181g(boolean z) {
        C86709a0.m107528h().mo121101p(this);
    }
}
