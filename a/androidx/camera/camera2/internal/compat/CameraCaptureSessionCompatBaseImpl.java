package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import java.util.List;
import java.util.concurrent.Executor;

class CameraCaptureSessionCompatBaseImpl implements CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl {
    public final CameraCaptureSession mCameraCaptureSession;
    public final Object mObject;

    public static class CameraCaptureSessionCompatParamsApi21 {
        public final Handler mCompatHandler;

        public CameraCaptureSessionCompatParamsApi21(Handler handler) {
            this.mCompatHandler = handler;
        }
    }

    public CameraCaptureSessionCompatBaseImpl(CameraCaptureSession cameraCaptureSession, Object obj) {
        cameraCaptureSession.getClass();
        this.mCameraCaptureSession = cameraCaptureSession;
        this.mObject = obj;
    }

    public static CameraCaptureSessionCompat.CameraCaptureSessionCompatImpl create(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new CameraCaptureSessionCompatBaseImpl(cameraCaptureSession, new CameraCaptureSessionCompatParamsApi21(handler));
    }

    public int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mCameraCaptureSession.captureBurst(list, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), ((CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    public int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mCameraCaptureSession.capture(captureRequest, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), ((CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    public int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mCameraCaptureSession.setRepeatingBurst(list, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), ((CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    public int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.mCameraCaptureSession.setRepeatingRequest(captureRequest, new CameraCaptureSessionCompat.CaptureCallbackExecutorWrapper(executor, captureCallback), ((CameraCaptureSessionCompatParamsApi21) this.mObject).mCompatHandler);
    }

    public CameraCaptureSession unwrap() {
        return this.mCameraCaptureSession;
    }
}
