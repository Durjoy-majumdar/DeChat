package com.tencent.p014mm.plugin.appbrand.launching;

import android.os.Parcelable;
import com.tencent.luggage.sdk.launching.C80243d;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.plugin.appbrand.launching.WeAppOpenUICallbackIPCProxy;
import di0.C86300q;
import java.util.concurrent.atomic.AtomicReference;
import o40.C61926c;

/* renamed from: com.tencent.mm.plugin.appbrand.launching.o4 */
public final class C83401o4<R extends Parcelable> implements C80243d {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference<C86300q> f243691a;

    /* renamed from: b */
    public final /* synthetic */ String f243692b;

    /* renamed from: c */
    public final /* synthetic */ C83455r4 f243693c;

    public C83401o4(AtomicReference<C86300q> atomicReference, String str, C83455r4 r4Var) {
        this.f243691a = atomicReference;
        this.f243692b = str;
        this.f243693c = r4Var;
    }

    /* renamed from: a */
    public void mo111348a(Parcelable parcelable) {
        IPCBoolean iPCBoolean = (IPCBoolean) parcelable;
        C86300q qVar = this.f243691a.get();
        if (qVar == null || WeAppOpenUICallbackIPCProxy.C83284b.f243391a.mo115581a(qVar)) {
            this.f243691a.set((Object) null);
        } else {
            C61926c.m72668M(new C83394n4(qVar, iPCBoolean));
            this.f243691a.set((Object) null);
        }
        C80907o.m98786i(this.f243692b, this.f243693c);
    }
}
