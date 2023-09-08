package androidx.camera.core;

import androidx.camera.core.impl.ImageReaderProxy;

public final /* synthetic */ class AndroidImageReaderProxy$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AndroidImageReaderProxy f44181d;

    /* renamed from: e */
    public final /* synthetic */ ImageReaderProxy.OnImageAvailableListener f44182e;

    public /* synthetic */ AndroidImageReaderProxy$$a(AndroidImageReaderProxy androidImageReaderProxy, ImageReaderProxy.OnImageAvailableListener onImageAvailableListener) {
        this.f44181d = androidImageReaderProxy;
        this.f44182e = onImageAvailableListener;
    }

    public final void run() {
        this.f44181d.lambda$setOnImageAvailableListener$0(this.f44182e);
    }
}
