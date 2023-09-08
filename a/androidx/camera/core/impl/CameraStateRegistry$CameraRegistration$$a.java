package androidx.camera.core.impl;

import androidx.camera.core.impl.CameraStateRegistry;

public final /* synthetic */ class CameraStateRegistry$CameraRegistration$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraStateRegistry.OnOpenAvailableListener f44334d;

    public /* synthetic */ CameraStateRegistry$CameraRegistration$$a(CameraStateRegistry.OnOpenAvailableListener onOpenAvailableListener) {
        this.f44334d = onOpenAvailableListener;
    }

    public final void run() {
        this.f44334d.onOpenAvailable();
    }
}
