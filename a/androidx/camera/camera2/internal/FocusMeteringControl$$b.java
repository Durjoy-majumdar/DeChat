package androidx.camera.camera2.internal;

import p202m2.C117512b;

public final /* synthetic */ class FocusMeteringControl$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FocusMeteringControl f44055d;

    /* renamed from: e */
    public final /* synthetic */ C117512b.C117513a f44056e;

    public /* synthetic */ FocusMeteringControl$$b(FocusMeteringControl focusMeteringControl, C117512b.C117513a aVar) {
        this.f44055d = focusMeteringControl;
        this.f44056e = aVar;
    }

    public final void run() {
        this.f44055d.lambda$cancelFocusAndMetering$5(this.f44056e);
    }
}
