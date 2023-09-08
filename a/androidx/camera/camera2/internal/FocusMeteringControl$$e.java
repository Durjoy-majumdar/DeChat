package androidx.camera.camera2.internal;

public final /* synthetic */ class FocusMeteringControl$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FocusMeteringControl f44061d;

    /* renamed from: e */
    public final /* synthetic */ long f44062e;

    public /* synthetic */ FocusMeteringControl$$e(FocusMeteringControl focusMeteringControl, long j) {
        this.f44061d = focusMeteringControl;
        this.f44062e = j;
    }

    public final void run() {
        this.f44061d.lambda$executeMeteringAction$3(this.f44062e);
    }
}
