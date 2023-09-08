package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;

public final /* synthetic */ class ProcessingSurface$$a implements ImageReaderProxy.OnImageAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ ProcessingSurface f44285a;

    public /* synthetic */ ProcessingSurface$$a(ProcessingSurface processingSurface) {
        this.f44285a = processingSurface;
    }

    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        this.f44285a.lambda$new$0(imageReaderProxy);
    }
}
