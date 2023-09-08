package androidx.camera.camera2.internal;

import androidx.camera.core.FocusMeteringAction;
import p202m2.C117512b;

public final /* synthetic */ class FocusMeteringControl$$a implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ FocusMeteringControl f44053a;

    /* renamed from: b */
    public final /* synthetic */ FocusMeteringAction f44054b;

    public /* synthetic */ FocusMeteringControl$$a(FocusMeteringControl focusMeteringControl, FocusMeteringAction focusMeteringAction) {
        this.f44053a = focusMeteringControl;
        this.f44054b = focusMeteringAction;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return this.f44053a.lambda$startFocusAndMetering$1(this.f44054b, aVar);
    }
}
