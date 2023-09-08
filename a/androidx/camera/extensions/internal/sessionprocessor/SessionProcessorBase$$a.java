package androidx.camera.extensions.internal.sessionprocessor;

import android.media.ImageReader;

public final /* synthetic */ class SessionProcessorBase$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImageReader f44378d;

    public /* synthetic */ SessionProcessorBase$$a(ImageReader imageReader) {
        this.f44378d = imageReader;
    }

    public final void run() {
        this.f44378d.close();
    }
}
