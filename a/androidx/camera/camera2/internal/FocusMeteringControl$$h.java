package androidx.camera.camera2.internal;

public final /* synthetic */ class FocusMeteringControl$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FocusMeteringControl f44069d;

    /* renamed from: e */
    public final /* synthetic */ long f44070e;

    public /* synthetic */ FocusMeteringControl$$h(FocusMeteringControl focusMeteringControl, long j) {
        this.f44069d = focusMeteringControl;
        this.f44070e = j;
    }

    public final void run() {
        this.f44069d.lambda$executeMeteringAction$4(this.f44070e);
    }
}
