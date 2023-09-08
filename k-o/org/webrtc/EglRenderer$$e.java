package org.webrtc;

import org.webrtc.EglRenderer;
import org.webrtc.RendererCommon;

public final /* synthetic */ class EglRenderer$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EglRenderer f61814d;

    /* renamed from: e */
    public final /* synthetic */ RendererCommon.GlDrawer f61815e;

    /* renamed from: f */
    public final /* synthetic */ EglRenderer.FrameListener f61816f;

    /* renamed from: g */
    public final /* synthetic */ float f61817g;

    /* renamed from: h */
    public final /* synthetic */ boolean f61818h;

    public /* synthetic */ EglRenderer$$e(EglRenderer eglRenderer, RendererCommon.GlDrawer glDrawer, EglRenderer.FrameListener frameListener, float f, boolean z) {
        this.f61814d = eglRenderer;
        this.f61815e = glDrawer;
        this.f61816f = frameListener;
        this.f61817g = f;
        this.f61818h = z;
    }

    public final void run() {
        this.f61814d.lambda$addFrameListener$3(this.f61815e, this.f61816f, this.f61817g, this.f61818h);
    }
}
