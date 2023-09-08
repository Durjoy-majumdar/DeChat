package com.tencent.p014mm.plugin.appbrand.jsruntime;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.f */
public final class C83161f extends C83148d {

    /* renamed from: f */
    public final IJSRuntime f242976f;

    /* renamed from: g */
    public final C80669j f242977g;

    /* renamed from: h */
    public final int f242978h;

    public C83161f(C80669j jVar, int i) {
        this.f242976f = jVar.f236041b;
        this.f242977g = jVar;
        this.f242978h = i;
    }

    public int getContextId() {
        return this.f242978h;
    }

    public void pause() {
        Log.m105928w("MicroMsg.AppBrandJ2V8SubContext", "AppBrandJ2V8SubContext can not pause");
    }

    public void resume() {
        Log.m105928w("MicroMsg.AppBrandJ2V8SubContext", "AppBrandJ2V8SubContext can not resume");
    }

    public void setJsExceptionHandler(C83164h hVar) {
        C80669j jVar = this.f242977g;
        jVar.f236041b.mo112430A(this.f242978h, hVar);
    }

    /* renamed from: t1 */
    public IJSRuntime mo115380t1() {
        return this.f242976f;
    }

    /* renamed from: u1 */
    public C80669j mo115381u1() {
        return this.f242977g;
    }

    /* renamed from: w */
    public boolean mo63262w() {
        return false;
    }
}
