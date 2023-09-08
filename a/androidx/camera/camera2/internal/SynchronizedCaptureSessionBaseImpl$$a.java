package androidx.camera.camera2.internal;

public final /* synthetic */ class SynchronizedCaptureSessionBaseImpl$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SynchronizedCaptureSessionBaseImpl f44085d;

    /* renamed from: e */
    public final /* synthetic */ SynchronizedCaptureSession f44086e;

    public /* synthetic */ SynchronizedCaptureSessionBaseImpl$$a(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, SynchronizedCaptureSession synchronizedCaptureSession) {
        this.f44085d = synchronizedCaptureSessionBaseImpl;
        this.f44086e = synchronizedCaptureSession;
    }

    public final void run() {
        this.f44085d.lambda$onSessionFinished$4(this.f44086e);
    }
}
