package com.tencent.p014mm.plugin.appbrand.headless;

import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.ipcinvoker.C80924w;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86297n;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.plugin.appbrand.headless.d */
public final class C81907d implements C80924w {

    /* renamed from: a */
    public final /* synthetic */ String f240248a;

    /* renamed from: b */
    public final /* synthetic */ int f240249b;

    /* renamed from: c */
    public final /* synthetic */ AtomicBoolean f240250c;

    /* renamed from: d */
    public final /* synthetic */ C86297n f240251d;

    public C81907d(String str, int i, AtomicBoolean atomicBoolean, C86297n nVar) {
        this.f240248a = str;
        this.f240249b = i;
        this.f240250c = atomicBoolean;
        this.f240251d = nVar;
    }

    /* renamed from: a */
    public void mo111377a() {
        C86297n nVar;
        Log.m105920e("MicroMsg.AppBrandHeadlessStartService", "bindRemoteService onRemoteProcessDied(" + this.f240248a + "), id:" + this.f240249b);
        if (!this.f240250c.getAndSet(true) && (nVar = this.f240251d) != null) {
            C86297n.C86298a.m106900a(nVar, -5, (String) null, 2, (Object) null);
        }
        C80907o.m98786i(this.f240248a, this);
    }
}
