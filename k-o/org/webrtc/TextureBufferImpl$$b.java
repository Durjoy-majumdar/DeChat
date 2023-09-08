package org.webrtc;

import org.webrtc.TextureBufferImpl;

public final /* synthetic */ class TextureBufferImpl$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TextureBufferImpl f61855d;

    /* renamed from: e */
    public final /* synthetic */ TextureBufferImpl.RefCountMonitor f61856e;

    public /* synthetic */ TextureBufferImpl$$b(TextureBufferImpl textureBufferImpl, TextureBufferImpl.RefCountMonitor refCountMonitor) {
        this.f61855d = textureBufferImpl;
        this.f61856e = refCountMonitor;
    }

    public final void run() {
        this.f61855d.lambda$new$0(this.f61856e);
    }
}
