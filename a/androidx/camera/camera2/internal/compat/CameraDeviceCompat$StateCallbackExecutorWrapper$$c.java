package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

public final /* synthetic */ class CameraDeviceCompat$StateCallbackExecutorWrapper$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraDeviceCompat.StateCallbackExecutorWrapper f44166d;

    /* renamed from: e */
    public final /* synthetic */ CameraDevice f44167e;

    public /* synthetic */ CameraDeviceCompat$StateCallbackExecutorWrapper$$c(CameraDeviceCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraDevice cameraDevice) {
        this.f44166d = stateCallbackExecutorWrapper;
        this.f44167e = cameraDevice;
    }

    public final void run() {
        this.f44166d.lambda$onOpened$0(this.f44167e);
    }
}
