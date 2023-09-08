package org.webrtc;

import org.webrtc.Camera1Session;

public final /* synthetic */ class Camera1Session$2$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera1Session.C218202 f61802d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f61803e;

    public /* synthetic */ Camera1Session$2$$b(Camera1Session.C218202 r1, byte[] bArr) {
        this.f61802d = r1;
        this.f61803e = bArr;
    }

    public final void run() {
        this.f61802d.lambda$onPreviewFrame$1(this.f61803e);
    }
}
