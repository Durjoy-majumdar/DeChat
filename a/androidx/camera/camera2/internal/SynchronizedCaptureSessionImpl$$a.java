package androidx.camera.camera2.internal;

public final /* synthetic */ class SynchronizedCaptureSessionImpl$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SynchronizedCaptureSessionImpl f44096d;

    public /* synthetic */ SynchronizedCaptureSessionImpl$$a(SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl) {
        this.f44096d = synchronizedCaptureSessionImpl;
    }

    public final void run() {
        this.f44096d.lambda$close$3();
    }
}
