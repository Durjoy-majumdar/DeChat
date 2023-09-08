package androidx.camera.core;

import androidx.camera.core.ImageCapture;

public final /* synthetic */ class ImageCapture$ImageCaptureRequest$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageCapture.ImageCaptureRequest f44249d;

    /* renamed from: e */
    public final /* synthetic */ int f44250e;

    /* renamed from: f */
    public final /* synthetic */ String f44251f;

    /* renamed from: g */
    public final /* synthetic */ Throwable f44252g;

    public /* synthetic */ ImageCapture$ImageCaptureRequest$$a(ImageCapture.ImageCaptureRequest imageCaptureRequest, int i, String str, Throwable th) {
        this.f44249d = imageCaptureRequest;
        this.f44250e = i;
        this.f44251f = str;
        this.f44252g = th;
    }

    public final void run() {
        this.f44249d.lambda$notifyCallbackError$1(this.f44250e, this.f44251f, this.f44252g);
    }
}
