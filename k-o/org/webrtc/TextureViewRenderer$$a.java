package org.webrtc;

import org.webrtc.IRenderer;

public final /* synthetic */ class TextureViewRenderer$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextureViewRenderer f61857d;

    /* renamed from: e */
    public final /* synthetic */ IRenderer.OnCaptureListener f61858e;

    public /* synthetic */ TextureViewRenderer$$a(TextureViewRenderer textureViewRenderer, IRenderer.OnCaptureListener onCaptureListener) {
        this.f61857d = textureViewRenderer;
        this.f61858e = onCaptureListener;
    }

    public final void run() {
        this.f61857d.lambda$requestCaptureOnce$1(this.f61858e);
    }
}
