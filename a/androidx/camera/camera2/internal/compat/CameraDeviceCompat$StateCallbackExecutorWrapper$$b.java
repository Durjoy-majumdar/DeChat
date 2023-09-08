package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

public final /* synthetic */ class CameraDeviceCompat$StateCallbackExecutorWrapper$$b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraDeviceCompat.StateCallbackExecutorWrapper f44164d;

    /* renamed from: e */
    public final /* synthetic */ CameraDevice f44165e;

    public /* synthetic */ CameraDeviceCompat$StateCallbackExecutorWrapper$$b(CameraDeviceCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraDevice cameraDevice) {
        this.f44164d = stateCallbackExecutorWrapper;
        this.f44165e = cameraDevice;
    }

    public final void run() {
        this.f44164d.lambda$onDisconnected$1(this.f44165e);
    }
}
