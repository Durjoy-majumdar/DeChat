package com.tencent.p014mm.plugin.appbrand.headless;

import com.tencent.p014mm.ipcinvoker.C80905h;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86297n;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.plugin.appbrand.headless.c */
public final class C81906c implements C80905h<BindRemoteServiceResult> {

    /* renamed from: d */
    public final /* synthetic */ AtomicBoolean f240243d;

    /* renamed from: e */
    public final /* synthetic */ C86297n f240244e;

    /* renamed from: f */
    public final /* synthetic */ String f240245f;

    /* renamed from: g */
    public final /* synthetic */ C81907d f240246g;

    /* renamed from: h */
    public final /* synthetic */ int f240247h;

    public C81906c(AtomicBoolean atomicBoolean, C86297n nVar, String str, C81907d dVar, int i) {
        this.f240243d = atomicBoolean;
        this.f240244e = nVar;
        this.f240245f = str;
        this.f240246g = dVar;
        this.f240247h = i;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        BindRemoteServiceResult bindRemoteServiceResult = (BindRemoteServiceResult) obj;
        if (bindRemoteServiceResult == null) {
            int i = this.f240247h;
            C86297n nVar = this.f240244e;
            Log.m105920e("MicroMsg.AppBrandHeadlessStartService", "bindRemoteService onCallback with NULL data, id:" + i);
            if (nVar != null) {
                C86297n.C86298a.m106900a(nVar, -4, (String) null, 2, (Object) null);
                return;
            }
            return;
        }
        int i2 = bindRemoteServiceResult.f240239d;
        String str = bindRemoteServiceResult.f240240e;
        this.f240243d.set(true);
        if (i2 == 0) {
            C86297n nVar2 = this.f240244e;
            if (nVar2 != null) {
                nVar2.onSuccess();
            }
        } else {
            C86297n nVar3 = this.f240244e;
            if (nVar3 != null) {
                nVar3.mo1541a(i2, str);
            }
        }
        C80907o.m98786i(this.f240245f, this.f240246g);
    }

    /* renamed from: b */
    public void mo56805b() {
        Log.m105920e("MicroMsg.AppBrandHeadlessStartService", "bindRemoteService onBridgeNotFound, id:" + this.f240247h);
        C86297n nVar = this.f240244e;
        if (nVar != null) {
            C86297n.C86298a.m106900a(nVar, -4, (String) null, 2, (Object) null);
        }
    }

    /* renamed from: c */
    public void mo56806c(Exception exc) {
        Log.m105920e("MicroMsg.AppBrandHeadlessStartService", "bindRemoteService onCaughtInvokeException, id:" + this.f240247h + ", exception:" + exc);
        C86297n nVar = this.f240244e;
        if (nVar != null) {
            C86297n.C86298a.m106900a(nVar, -4, (String) null, 2, (Object) null);
        }
    }
}
