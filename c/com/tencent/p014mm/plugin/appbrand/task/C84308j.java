package com.tencent.p014mm.plugin.appbrand.task;

import com.tencent.p014mm.ipcinvoker.C80905h;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.task.j */
public final class C84308j implements C80905h<IPCVoid> {

    /* renamed from: d */
    public final /* synthetic */ C84310k f246192d;

    public C84308j(C84310k kVar) {
        this.f246192d = kVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        IPCVoid iPCVoid = (IPCVoid) obj;
        Log.m105925i("MicroMsg.AppBrandMiniProgramProcess", "preLoad by ipc invoke, callback received, targetProcess[%s]", this.f246192d.mo111363h());
    }

    /* renamed from: b */
    public void mo56805b() {
        Log.m105929w("MicroMsg.AppBrandMiniProgramProcess", "onBridgeNotFound: proc [%s]", this.f246192d.mo111363h());
    }

    /* renamed from: c */
    public void mo56806c(Exception exc) {
        Log.m105921e("MicroMsg.AppBrandMiniProgramProcess", "onCaughtInvokeException: %s, process %s", android.util.Log.getStackTraceString(exc), this.f246192d.mo111363h());
    }
}
