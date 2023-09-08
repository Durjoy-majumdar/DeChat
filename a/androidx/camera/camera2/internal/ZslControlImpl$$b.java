package androidx.camera.camera2.internal;

import androidx.camera.core.impl.ImageReaderProxy;

public final /* synthetic */ class ZslControlImpl$$b implements ImageReaderProxy.OnImageAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ ZslControlImpl f44117a;

    public /* synthetic */ ZslControlImpl$$b(ZslControlImpl zslControlImpl) {
        this.f44117a = zslControlImpl;
    }

    public final void onImageAvailable(ImageReaderProxy imageReaderProxy) {
        this.f44117a.lambda$addZslConfig$0(imageReaderProxy);
    }
}
