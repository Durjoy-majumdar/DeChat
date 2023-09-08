package androidx.camera.core.impl;

import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraSelector;
import java.util.concurrent.Executor;

public interface CameraInfoInternal extends CameraInfo {
    void addSessionCaptureCallback(Executor executor, CameraCaptureCallback cameraCaptureCallback);

    CamcorderProfileProvider getCamcorderProfileProvider();

    String getCameraId();

    Quirks getCameraQuirks();

    CameraSelector getCameraSelector();

    Integer getLensFacing();

    void removeSessionCaptureCallback(CameraCaptureCallback cameraCaptureCallback);
}
