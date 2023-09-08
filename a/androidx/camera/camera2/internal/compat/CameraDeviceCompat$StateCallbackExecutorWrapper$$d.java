package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.CameraDeviceCompat;

public final /* synthetic */ class CameraDeviceCompat$StateCallbackExecutorWrapper$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CameraDeviceCompat.StateCallbackExecutorWrapper f44168d;

    /* renamed from: e */
    public final /* synthetic */ CameraDevice f44169e;

    /* renamed from: f */
    public final /* synthetic */ int f44170f;

    public /* synthetic */ CameraDeviceCompat$StateCallbackExecutorWrapper$$d(CameraDeviceCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper, CameraDevice cameraDevice, int i) {
        this.f44168d = stateCallbackExecutorWrapper;
        this.f44169e = cameraDevice;
        this.f44170f = i;
    }

    public final void run() {
        this.f44168d.lambda$onError$2(this.f44169e, this.f44170f);
    }
}
