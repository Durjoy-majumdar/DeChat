package androidx.camera.camera2.internal;

public final /* synthetic */ class SynchronizedCaptureSessionBaseImpl$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SynchronizedCaptureSessionBaseImpl f44095d;

    public /* synthetic */ SynchronizedCaptureSessionBaseImpl$$e(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl) {
        this.f44095d = synchronizedCaptureSessionBaseImpl;
    }

    public final void run() {
        this.f44095d.lambda$close$2();
    }
}
