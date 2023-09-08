package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;

class CameraDeviceCompatApi28Impl extends CameraDeviceCompatApi24Impl {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraDeviceCompatApi28Impl(CameraDevice cameraDevice) {
        super(cameraDevice, (Object) null);
        cameraDevice.getClass();
    }

    public void createCaptureSession(SessionConfigurationCompat sessionConfigurationCompat) {
        SessionConfiguration sessionConfiguration = (SessionConfiguration) sessionConfigurationCompat.unwrap();
        sessionConfiguration.getClass();
        try {
            this.mCameraDevice.createCaptureSession(sessionConfiguration);
        } catch (CameraAccessException e) {
            throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
        }
    }
}
