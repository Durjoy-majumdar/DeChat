package com.tencent.p014mm.plugin.multitalk.model;

import android.graphics.SurfaceTexture;

/* renamed from: com.tencent.mm.plugin.multitalk.model.n0 */
public final class C105822n0 implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ C105834r0 f314733d;

    /* renamed from: e */
    public final /* synthetic */ SurfaceTexture f314734e;

    public C105822n0(C105834r0 r0Var, SurfaceTexture surfaceTexture) {
        this.f314733d = r0Var;
        this.f314734e = surfaceTexture;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C105834r0 r0Var = this.f314733d;
        r0Var.getClass();
        r0Var.mo150816a(new C105832q0(r0Var));
        this.f314734e.updateTexImage();
    }
}
