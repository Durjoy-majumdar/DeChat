package androidx.camera.core;

import android.os.HandlerThread;

public final /* synthetic */ class Preview$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ HandlerThread f305884d;

    public /* synthetic */ Preview$$a(HandlerThread handlerThread) {
        this.f305884d = handlerThread;
    }

    public final void run() {
        this.f305884d.quitSafely();
    }
}
