package org.webrtc;

public final /* synthetic */ class SurfaceViewRenderer$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SurfaceViewRenderer f61847d;

    /* renamed from: e */
    public final /* synthetic */ int f61848e;

    /* renamed from: f */
    public final /* synthetic */ int f61849f;

    public /* synthetic */ SurfaceViewRenderer$$a(SurfaceViewRenderer surfaceViewRenderer, int i, int i2) {
        this.f61847d = surfaceViewRenderer;
        this.f61848e = i;
        this.f61849f = i2;
    }

    public final void run() {
        this.f61847d.lambda$onFrameResolutionChanged$0(this.f61848e, this.f61849f);
    }
}
