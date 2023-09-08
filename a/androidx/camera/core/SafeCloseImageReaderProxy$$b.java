package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;

public final /* synthetic */ class SafeCloseImageReaderProxy$$b implements ImageReaderProxy.OnImageAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ SafeCloseImageReaderProxy f44288a;

    /* renamed from: b */
    public final /* synthetic */ ImageReaderProxy.OnImageAvailableListener f44289b;

    public /* synthetic */ SafeCloseImageReaderProxy$$b(SafeCloseImageReaderProxy safeCloseImageReaderProxy, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        this.f44288a = safeCloseImageReaderProxy;
        this.f44289b = onImageAvailableListener;
    }

    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        this.f44288a.lambda$setOnImageAvailableListener$1(this.f44289b, imageReaderProxy);
    }
}
