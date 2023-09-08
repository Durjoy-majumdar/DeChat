package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;

public final /* synthetic */ class ImageProcessingUtil$$b implements ForwardingImageProxy.OnImageCloseListener {

    /* renamed from: a */
    public final /* synthetic */ ImageProxy f44257a;

    /* renamed from: b */
    public final /* synthetic */ ImageProxy f44258b;

    public /* synthetic */ ImageProcessingUtil$$b(ImageProxy imageProxy, ImageProxy imageProxy2) {
        this.f44257a = imageProxy;
        this.f44258b = imageProxy2;
    }

    public final void onImageClose(ImageProxy imageProxy) {
        ImageProcessingUtil.lambda$rotateYUV$1(this.f44257a, this.f44258b, imageProxy);
    }
}
