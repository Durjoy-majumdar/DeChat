package org.webrtc;

import org.webrtc.Camera1Session;

public final /* synthetic */ class Camera1Session$2$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Camera1Session.C218202 f61800d;

    /* renamed from: e */
    public final /* synthetic */ byte[] f61801e;

    public /* synthetic */ Camera1Session$2$$a(Camera1Session.C218202 r1, byte[] bArr) {
        this.f61800d = r1;
        this.f61801e = bArr;
    }

    public final void run() {
        this.f61800d.lambda$onPreviewFrame$0(this.f61801e);
    }
}
