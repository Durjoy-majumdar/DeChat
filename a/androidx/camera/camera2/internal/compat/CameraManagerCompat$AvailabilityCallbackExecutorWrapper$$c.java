package androidx.camera.camera2.internal.compat;

import androidx.camera.camera2.internal.compat.CameraManagerCompat;

public final /* synthetic */ class CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraManagerCompat.AvailabilityCallbackExecutorWrapper f44174d;

    /* renamed from: e */
    public final /* synthetic */ String f44175e;

    public /* synthetic */ CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$c(CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper, String str) {
        this.f44174d = availabilityCallbackExecutorWrapper;
        this.f44175e = str;
    }

    public final void run() {
        this.f44174d.lambda$onCameraAvailable$1(this.f44175e);
    }
}
