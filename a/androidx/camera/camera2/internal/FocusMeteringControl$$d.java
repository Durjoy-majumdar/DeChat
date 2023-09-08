package androidx.camera.camera2.internal;

import androidx.camera.core.FocusMeteringAction;
import p202m2.C117512b;

public final /* synthetic */ class FocusMeteringControl$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FocusMeteringControl f44058d;

    /* renamed from: e */
    public final /* synthetic */ C117512b.C117513a f44059e;

    /* renamed from: f */
    public final /* synthetic */ FocusMeteringAction f44060f;

    public /* synthetic */ FocusMeteringControl$$d(FocusMeteringControl focusMeteringControl, C117512b.C117513a aVar, FocusMeteringAction focusMeteringAction) {
        this.f44058d = focusMeteringControl;
        this.f44059e = aVar;
        this.f44060f = focusMeteringAction;
    }

    public final void run() {
        this.f44058d.lambda$startFocusAndMetering$0(this.f44059e, this.f44060f);
    }
}
