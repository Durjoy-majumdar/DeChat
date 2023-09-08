package androidx.camera.camera2.internal;

public final /* synthetic */ class SynchronizedCaptureSessionBaseImpl$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SynchronizedCaptureSessionBaseImpl f44093d;

    /* renamed from: e */
    public final /* synthetic */ SynchronizedCaptureSession f44094e;

    public /* synthetic */ SynchronizedCaptureSessionBaseImpl$$d(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, SynchronizedCaptureSession synchronizedCaptureSession) {
        this.f44093d = synchronizedCaptureSessionBaseImpl;
        this.f44094e = synchronizedCaptureSession;
    }

    public final void run() {
        this.f44093d.lambda$onClosed$3(this.f44094e);
    }
}
