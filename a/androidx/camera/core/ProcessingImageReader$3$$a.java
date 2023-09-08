package androidx.camera.core;

import androidx.camera.core.ProcessingImageReader;

public final /* synthetic */ class ProcessingImageReader$3$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ProcessingImageReader.OnProcessingErrorCallback f44283d;

    /* renamed from: e */
    public final /* synthetic */ Exception f44284e;

    public /* synthetic */ ProcessingImageReader$3$$a(ProcessingImageReader.OnProcessingErrorCallback onProcessingErrorCallback, Exception exc) {
        this.f44283d = onProcessingErrorCallback;
        this.f44284e = exc;
    }

    public final void run() {
        this.f44283d.notifyProcessingError(this.f44284e.getMessage(), this.f44284e.getCause());
    }
}
