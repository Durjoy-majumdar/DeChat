package androidx.camera.lifecycle;

import androidx.camera.core.CameraXConfig;

public final /* synthetic */ class ProcessCameraProvider$$b implements CameraXConfig.Provider {

    /* renamed from: a */
    public final /* synthetic */ CameraXConfig f44382a;

    public /* synthetic */ ProcessCameraProvider$$b(CameraXConfig cameraXConfig) {
        this.f44382a = cameraXConfig;
    }

    public final CameraXConfig getCameraXConfig() {
        return ProcessCameraProvider.lambda$configureInstanceInternal$3(this.f44382a);
    }
}
