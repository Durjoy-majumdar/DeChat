package androidx.camera.camera2.internal;

import androidx.camera.core.impl.SessionConfig;

public final /* synthetic */ class Camera2CameraImpl$$n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ SessionConfig.ErrorListener f44016d;

    /* renamed from: e */
    public final /* synthetic */ SessionConfig f44017e;

    public /* synthetic */ Camera2CameraImpl$$n(SessionConfig.ErrorListener errorListener, SessionConfig sessionConfig) {
        this.f44016d = errorListener;
        this.f44017e = sessionConfig;
    }

    public final void run() {
        this.f44016d.onError(this.f44017e, SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }
}
