package androidx.camera.core;

import android.view.Surface;

public final /* synthetic */ class VideoCapture$$i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Surface f337886d;

    public /* synthetic */ VideoCapture$$i(Surface surface) {
        this.f337886d = surface;
    }

    public final void run() {
        this.f337886d.release();
    }
}
