package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

public final /* synthetic */ class CameraDeviceCompat$StateCallbackExecutorWrapper$$a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraDeviceCompat.StateCallbackExecutorWrapper f44162d;

    /* renamed from: e */
    public final /* synthetic */ CameraDevice f44163e;

    public /* synthetic */ CameraDeviceCompat$StateCallbackExecutorWrapper$$a(CameraDeviceCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraDevice cameraDevice) {
        this.f44162d = stateCallbackExecutorWrapper;
        this.f44163e = cameraDevice;
    }

    public final void run() {
        this.f44162d.lambda$onClosed$3(this.f44163e);
    }
}
