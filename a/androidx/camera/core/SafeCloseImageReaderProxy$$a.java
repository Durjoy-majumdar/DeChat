package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;

public final /* synthetic */ class SafeCloseImageReaderProxy$$a implements ForwardingImageProxy.OnImageCloseListener {

    /* renamed from: a */
    public final /* synthetic */ SafeCloseImageReaderProxy f44287a;

    public /* synthetic */ SafeCloseImageReaderProxy$$a(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        this.f44287a = safeCloseImageReaderProxy;
    }

    public final void onImageClose(ImageProxy imageProxy) {
        this.f44287a.lambda$new$0(imageProxy);
    }
}
