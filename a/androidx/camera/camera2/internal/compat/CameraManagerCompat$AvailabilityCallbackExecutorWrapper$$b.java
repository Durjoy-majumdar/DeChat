package androidx.camera.camera2.internal.compat;

import androidx.camera.camera2.internal.compat.CameraManagerCompat;

public final /* synthetic */ class CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraManagerCompat.AvailabilityCallbackExecutorWrapper f44172d;

    /* renamed from: e */
    public final /* synthetic */ String f44173e;

    public /* synthetic */ CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$b(CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper, String str) {
        this.f44172d = availabilityCallbackExecutorWrapper;
        this.f44173e = str;
    }

    public final void run() {
        this.f44172d.lambda$onCameraUnavailable$2(this.f44173e);
    }
}
