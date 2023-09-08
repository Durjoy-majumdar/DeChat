package org.webrtc;

import android.os.Looper;

public final /* synthetic */ class EglRenderer$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EglRenderer f61812d;

    /* renamed from: e */
    public final /* synthetic */ Looper f61813e;

    public /* synthetic */ EglRenderer$$d(EglRenderer eglRenderer, Looper looper) {
        this.f61812d = eglRenderer;
        this.f61813e = looper;
    }

    public final void run() {
        this.f61812d.lambda$release$2(this.f61813e);
    }
}
