package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.ipcinvoker.C80905h;
import com.tencent.p014mm.ipcinvoker.C80907o;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86297n;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.tencent.mm.plugin.appbrand.r */
public final class C84088r implements C80905h<BindRemoteServiceResult> {

    /* renamed from: d */
    public final /* synthetic */ int f245498d;

    /* renamed from: e */
    public final /* synthetic */ C86297n f245499e;

    /* renamed from: f */
    public final /* synthetic */ AtomicBoolean f245500f;

    /* renamed from: g */
    public final /* synthetic */ String f245501g;

    /* renamed from: h */
    public final /* synthetic */ C84247s f245502h;

    public C84088r(int i, C86297n nVar, AtomicBoolean atomicBoolean, String str, C84247s sVar) {
        this.f245498d = i;
        this.f245499e = nVar;
        this.f245500f = atomicBoolean;
        this.f245501g = str;
        this.f245502h = sVar;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        BindRemoteServiceResult bindRemoteServiceResult = (BindRemoteServiceResult) obj;
        if (bindRemoteServiceResult == null) {
            Log.m105920e("MicroMsg.AppBrandPreRenderColdStartService", "bindRemoteService onCallback with NULL data, id:" + this.f245498d);
            C86297n nVar = this.f245499e;
            if (nVar != null) {
                C86297n.C86298a.m106900a(nVar, -4, (String) null, 2, (Object) null);
                return;
            }
            return;
        }
        int i = bindRemoteServiceResult.f238358d;
        String str = bindRemoteServiceResult.f238359e;
        this.f245500f.set(true);
        if (i == 0) {
            C86297n nVar2 = this.f245499e;
            if (nVar2 != null) {
                nVar2.onSuccess();
            }
        } else {
            C86297n nVar3 = this.f245499e;
            if (nVar3 != null) {
                nVar3.mo1541a(i, str);
            }
        }
        C80907o.m98786i(this.f245501g, this.f245502h);
    }

    /* renamed from: b */
    public void mo56805b() {
        Log.m105920e("MicroMsg.AppBrandPreRenderColdStartService", "bindRemoteService onBridgeNotFound, id:" + this.f245498d);
        C86297n nVar = this.f245499e;
        if (nVar != null) {
            C86297n.C86298a.m106900a(nVar, -4, (String) null, 2, (Object) null);
        }
    }

    /* renamed from: c */
    public void mo56806c(Exception exc) {
        Log.m105920e("MicroMsg.AppBrandPreRenderColdStartService", "bindRemoteService onCaughtInvokeException, id:" + this.f245498d + ", exception:" + exc);
        C86297n nVar = this.f245499e;
        if (nVar != null) {
            C86297n.C86298a.m106900a(nVar, -4, (String) null, 2, (Object) null);
        }
    }
}
