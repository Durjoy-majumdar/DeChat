package androidx.camera.core;

import androidx.camera.core.ProcessingImageReader;
import androidx.camera.core.impl.ImageReaderProxy;

public final /* synthetic */ class ProcessingImageReader$2$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ProcessingImageReader.C165122 f44281d;

    /* renamed from: e */
    public final /* synthetic */ ImageReaderProxy.OnImageAvailableListener f44282e;

    public /* synthetic */ ProcessingImageReader$2$$a(ProcessingImageReader.C165122 r1, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        this.f44281d = r1;
        this.f44282e = onImageAvailableListener;
    }

    public final void run() {
        this.f44281d.lambda$onImageAvailable$0(this.f44282e);
    }
}
