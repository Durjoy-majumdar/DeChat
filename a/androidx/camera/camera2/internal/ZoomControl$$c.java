package androidx.camera.camera2.internal;

import androidx.camera.core.ZoomState;
import p202m2.C117512b;

public final /* synthetic */ class ZoomControl$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ZoomControl f44111d;

    /* renamed from: e */
    public final /* synthetic */ C117512b.C117513a f44112e;

    /* renamed from: f */
    public final /* synthetic */ ZoomState f44113f;

    public /* synthetic */ ZoomControl$$c(ZoomControl zoomControl, C117512b.C117513a aVar, ZoomState zoomState) {
        this.f44111d = zoomControl;
        this.f44112e = aVar;
        this.f44113f = zoomState;
    }

    public final void run() {
        this.f44111d.lambda$setZoomRatio$0(this.f44112e, this.f44113f);
    }
}
