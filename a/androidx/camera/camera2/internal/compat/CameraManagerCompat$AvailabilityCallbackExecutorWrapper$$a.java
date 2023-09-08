package androidx.camera.camera2.internal.compat;

import androidx.camera.camera2.internal.compat.CameraManagerCompat;

public final /* synthetic */ class CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraManagerCompat.AvailabilityCallbackExecutorWrapper f44171d;

    public /* synthetic */ CameraManagerCompat$AvailabilityCallbackExecutorWrapper$$a(CameraManagerCompat.AvailabilityCallbackExecutorWrapper availabilityCallbackExecutorWrapper) {
        this.f44171d = availabilityCallbackExecutorWrapper;
    }

    public final void run() {
        this.f44171d.lambda$onCameraAccessPrioritiesChanged$0();
    }
}
