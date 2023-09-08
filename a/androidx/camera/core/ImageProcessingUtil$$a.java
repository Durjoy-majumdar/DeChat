package androidx.camera.core;

import androidx.camera.core.ForwardingImageProxy;

public final /* synthetic */ class ImageProcessingUtil$$a implements ForwardingImageProxy.OnImageCloseListener {

    /* renamed from: a */
    public final /* synthetic */ ImageProxy f44255a;

    /* renamed from: b */
    public final /* synthetic */ ImageProxy f44256b;

    public /* synthetic */ ImageProcessingUtil$$a(ImageProxy imageProxy, ImageProxy imageProxy2) {
        this.f44255a = imageProxy;
        this.f44256b = imageProxy2;
    }

    public final void onImageClose(ImageProxy imageProxy) {
        ImageProcessingUtil.lambda$convertYUVToRGB$0(this.f44255a, this.f44256b, imageProxy);
    }
}
