package androidx.camera.core;

import android.media.ImageReader;
import androidx.camera.core.impl.ImageReaderProxy;
import java.util.concurrent.Executor;

public final /* synthetic */ class AndroidImageReaderProxy$$b implements ImageReader.OnImageAvailableListener {

    /* renamed from: d */
    public final /* synthetic */ AndroidImageReaderProxy f44183d;

    /* renamed from: e */
    public final /* synthetic */ Executor f44184e;

    /* renamed from: f */
    public final /* synthetic */ ImageReaderProxy.OnImageAvailableListener f44185f;

    public /* synthetic */ AndroidImageReaderProxy$$b(AndroidImageReaderProxy androidImageReaderProxy, Executor executor, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        this.f44183d = androidImageReaderProxy;
        this.f44184e = executor;
        this.f44185f = onImageAvailableListener;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        this.f44183d.lambda$setOnImageAvailableListener$1(this.f44184e, this.f44185f, imageReader);
    }
}
