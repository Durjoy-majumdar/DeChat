package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Parcelable;
import com.tencent.luggage.sdk.launching.C80243d;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy;
import di0.C86300q;
import java.util.concurrent.atomic.AtomicReference;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.m4 */
public final class C83386m4<R extends Parcelable> implements C80243d {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference<C86300q> f243639a;

    public C83386m4(AtomicReference<C86300q> atomicReference) {
        this.f243639a = atomicReference;
    }

    /* renamed from: a */
    public void mo111348a(Parcelable parcelable) {
        IPCVoid iPCVoid = (IPCVoid) parcelable;
        C86300q qVar = this.f243639a.get();
        if (qVar == null || WeAppOpenUICallbackIPCProxy.C83284b.f243391a.mo115581a(qVar)) {
            this.f243639a.set((Object) null);
        } else {
            C61926c.m72668M(new C83365l4(qVar));
        }
    }
}
