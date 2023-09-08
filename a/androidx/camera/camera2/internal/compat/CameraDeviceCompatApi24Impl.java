package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import androidx.camera.camera2.internal.compat.CameraDeviceCompatBaseImpl;
import androidx.camera.camera2.internal.compat.params.InputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.OutputConfigurationCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import java.util.List;

class CameraDeviceCompatApi24Impl extends CameraDeviceCompatApi23Impl {
    public CameraDeviceCompatApi24Impl(CameraDevice cameraDevice, Object obj) {
        super(cameraDevice, obj);
    }

    public static CameraDeviceCompatApi24Impl create(CameraDevice cameraDevice, Handler handler) {
        return new CameraDeviceCompatApi24Impl(cameraDevice, new CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21(handler));
    }

    public void createCaptureSession(SessionConfigurationCompat sessionConfigurationCompat) {
        CameraDeviceCompatBaseImpl.checkPreconditions(this.mCameraDevice, sessionConfigurationCompat);
        CameraCaptureSessionCompat.StateCallbackExecutorWrapper stateCallbackExecutorWrapper = new CameraCaptureSessionCompat.StateCallbackExecutorWrapper(sessionConfigurationCompat.getExecutor(), sessionConfigurationCompat.getStateCallback());
        List<OutputConfigurationCompat> outputConfigurations = sessionConfigurationCompat.getOutputConfigurations();
        CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21 cameraDeviceCompatParamsApi21 = (CameraDeviceCompatBaseImpl.CameraDeviceCompatParamsApi21) this.mImplParams;
        cameraDeviceCompatParamsApi21.getClass();
        Handler handler = cameraDeviceCompatParamsApi21.mCompatHandler;
        InputConfigurationCompat inputConfiguration = sessionConfigurationCompat.getInputConfiguration();
        if (inputConfiguration != null) {
            try {
                InputConfiguration inputConfiguration2 = (InputConfiguration) inputConfiguration.unwrap();
                inputConfiguration2.getClass();
                this.mCameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration2, SessionConfigurationCompat.transformFromCompat(outputConfigurations), stateCallbackExecutorWrapper, handler);
            } catch (CameraAccessException e) {
                throw CameraAccessExceptionCompat.toCameraAccessExceptionCompat(e);
            }
        } else if (sessionConfigurationCompat.getSessionType() == 1) {
            this.mCameraDevice.createConstrainedHighSpeedCaptureSession(CameraDeviceCompatBaseImpl.unpackSurfaces(outputConfigurations), stateCallbackExecutorWrapper, handler);
        } else {
            this.mCameraDevice.createCaptureSessionByOutputConfigurations(SessionConfigurationCompat.transformFromCompat(outputConfigurations), stateCallbackExecutorWrapper, handler);
        }
    }
}
