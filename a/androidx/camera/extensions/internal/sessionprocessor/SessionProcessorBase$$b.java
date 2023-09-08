package androidx.camera.extensions.internal.sessionprocessor;

import android.media.ImageReader;

public final /* synthetic */ class SessionProcessorBase$$b implements ImageReader.OnImageAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ ImageProcessor f44379d;

    /* renamed from: e */
    public final /* synthetic */ int f44380e;

    public /* synthetic */ SessionProcessorBase$$b(ImageProcessor imageProcessor, int i) {
        this.f44379d = imageProcessor;
        this.f44380e = i;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        SessionProcessorBase.lambda$setImageProcessor$1(this.f44379d, this.f44380e, imageReader);
    }
}
