package org.webrtc;

import org.webrtc.EglBase;

public final /* synthetic */ class EglRenderer$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EglRenderer f61826d;

    /* renamed from: e */
    public final /* synthetic */ EglBase.Context f61827e;

    /* renamed from: f */
    public final /* synthetic */ int[] f61828f;

    public /* synthetic */ EglRenderer$$h(EglRenderer eglRenderer, EglBase.Context context, int[] iArr) {
        this.f61826d = eglRenderer;
        this.f61827e = context;
        this.f61828f = iArr;
    }

    public final void run() {
        this.f61826d.lambda$init$0(this.f61827e, this.f61828f);
    }
}
