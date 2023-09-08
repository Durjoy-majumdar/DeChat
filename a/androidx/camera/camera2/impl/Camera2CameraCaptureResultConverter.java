package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureResult;
import androidx.camera.camera2.internal.Camera2CameraCaptureFailure;
import androidx.camera.camera2.internal.Camera2CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;

public final class Camera2CameraCaptureResultConverter {
    private Camera2CameraCaptureResultConverter() {
    }

    public static CaptureFailure getCaptureFailure(CameraCaptureFailure cameraCaptureFailure) {
        if (cameraCaptureFailure instanceof Camera2CameraCaptureFailure) {
            return ((Camera2CameraCaptureFailure) cameraCaptureFailure).getCaptureFailure();
        }
        return null;
    }

    public static CaptureResult getCaptureResult(CameraCaptureResult cameraCaptureResult) {
        if (cameraCaptureResult instanceof Camera2CameraCaptureResult) {
            return ((Camera2CameraCaptureResult) cameraCaptureResult).getCaptureResult();
        }
        return null;
    }
}