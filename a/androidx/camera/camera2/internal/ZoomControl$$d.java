package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import p202m2.C117512b;

public final /* synthetic */ class ZoomControl$$d implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ ZoomControl f44114a;

    /* renamed from: b */
    public final /* synthetic */ ZoomState f44115b;

    public /* synthetic */ ZoomControl$$d(ZoomControl zoomControl, ZoomState zoomState) {
        this.f44114a = zoomControl;
        this.f44115b = zoomState;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return this.f44114a.lambda$setLinearZoom$3(this.f44115b, aVar);
    }
}
