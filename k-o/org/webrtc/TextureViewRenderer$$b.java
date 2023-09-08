package org.webrtc;

public final /* synthetic */ class TextureViewRenderer$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextureViewRenderer f61859d;

    /* renamed from: e */
    public final /* synthetic */ int f61860e;

    /* renamed from: f */
    public final /* synthetic */ int f61861f;

    public /* synthetic */ TextureViewRenderer$$b(TextureViewRenderer textureViewRenderer, int i, int i2) {
        this.f61859d = textureViewRenderer;
        this.f61860e = i;
        this.f61861f = i2;
    }

    public final void run() {
        this.f61859d.lambda$onFrameResolutionChanged$0(this.f61860e, this.f61861f);
    }
}
