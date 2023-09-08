package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import p202m2.C117512b;

public final /* synthetic */ class ZoomControl$$a implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ ZoomControl f44106a;

    /* renamed from: b */
    public final /* synthetic */ ZoomState f44107b;

    public /* synthetic */ ZoomControl$$a(ZoomControl zoomControl, ZoomState zoomState) {
        this.f44106a = zoomControl;
        this.f44107b = zoomState;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return this.f44106a.lambda$setZoomRatio$1(this.f44107b, aVar);
    }
}
