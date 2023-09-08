package androidx.camera.core;

import p1167z8.C112608f;

public final /* synthetic */ class ImageCapture$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C112608f f44229d;

    public /* synthetic */ ImageCapture$$c(C112608f fVar) {
        this.f44229d = fVar;
    }

    public final void run() {
        this.f44229d.cancel(true);
    }
}
