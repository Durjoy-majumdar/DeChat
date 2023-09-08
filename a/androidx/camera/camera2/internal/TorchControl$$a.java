package androidx.camera.camera2.internal;

import p202m2.C117512b;

public final /* synthetic */ class TorchControl$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ TorchControl f44100d;

    /* renamed from: e */
    public final /* synthetic */ C117512b.C117513a f44101e;

    /* renamed from: f */
    public final /* synthetic */ boolean f44102f;

    public /* synthetic */ TorchControl$$a(TorchControl torchControl, C117512b.C117513a aVar, boolean z) {
        this.f44100d = torchControl;
        this.f44101e = aVar;
        this.f44102f = z;
    }

    public final void run() {
        this.f44100d.lambda$enableTorch$1(this.f44101e, this.f44102f);
    }
}
