package androidx.camera.camera2.internal;

import androidx.camera.core.SafeCloseImageReaderProxy;

public final /* synthetic */ class ZslControlImpl$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SafeCloseImageReaderProxy f44116d;

    public /* synthetic */ ZslControlImpl$$a(SafeCloseImageReaderProxy safeCloseImageReaderProxy) {
        this.f44116d = safeCloseImageReaderProxy;
    }

    public final void run() {
        this.f44116d.safeClose();
    }
}
