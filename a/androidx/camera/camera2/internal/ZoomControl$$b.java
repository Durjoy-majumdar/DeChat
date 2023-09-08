package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import p202m2.C117512b;

public final /* synthetic */ class ZoomControl$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ZoomControl f44108d;

    /* renamed from: e */
    public final /* synthetic */ C117512b.C117513a f44109e;

    /* renamed from: f */
    public final /* synthetic */ ZoomState f44110f;

    public /* synthetic */ ZoomControl$$b(ZoomControl zoomControl, C117512b.C117513a aVar, ZoomState zoomState) {
        this.f44108d = zoomControl;
        this.f44109e = aVar;
        this.f44110f = zoomState;
    }

    public final void run() {
        this.f44108d.lambda$setLinearZoom$2(this.f44109e, this.f44110f);
    }
}
