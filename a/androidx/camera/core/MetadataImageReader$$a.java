package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;

public final /* synthetic */ class MetadataImageReader$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ MetadataImageReader f44269d;

    /* renamed from: e */
    public final /* synthetic */ ImageReaderProxy.OnImageAvailableListener f44270e;

    public /* synthetic */ MetadataImageReader$$a(MetadataImageReader metadataImageReader, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        this.f44269d = metadataImageReader;
        this.f44270e = onImageAvailableListener;
    }

    public final void run() {
        this.f44269d.lambda$enqueueImageProxy$1(this.f44270e);
    }
}
