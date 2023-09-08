package com.tencent.p014mm.plugin.appbrand.launching;

import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80924w;
import com.tencent.p014mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy;
import di0.C86300q;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.r4 */
public final class C83455r4 implements C80924w {

    /* renamed from: a */
    public final /* synthetic */ String f243873a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference<C86300q> f243874b;

    public C83455r4(String str, AtomicReference<C86300q> atomicReference) {
        this.f243873a = str;
        this.f243874b = atomicReference;
    }

    /* renamed from: a */
    public void mo111377a() {
        C80907o.m98786i(this.f243873a, this);
        C86300q qVar = this.f243874b.get();
        if (qVar == null || WeAppOpenUICallbackIPCProxy.C83284b.f243391a.mo115581a(qVar)) {
            this.f243874b.set((Object) null);
            return;
        }
        qVar.mo63853a();
        this.f243874b.set((Object) null);
    }
}
