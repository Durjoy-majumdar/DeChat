package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraCaptureSessionCompat;
import java.util.List;
import java.util.concurrent.Executor;
import p1167z8.C112608f;

public interface SynchronizedCaptureSession {

    public static abstract class StateCallback {
        public void onActive(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onCaptureQueueEmpty(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onClosed(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onConfigureFailed(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onConfigured(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onReady(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onSessionFinished(SynchronizedCaptureSession synchronizedCaptureSession) {
        }

        public void onSurfacePrepared(SynchronizedCaptureSession synchronizedCaptureSession, Surface surface) {
        }
    }

    void abortCaptures();

    int captureBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    int captureBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

    int captureSingleRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    int captureSingleRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

    void close();

    void finishClose();

    CameraDevice getDevice();

    Surface getInputSurface();

    C112608f<Void> getOpeningBlocker();

    StateCallback getStateCallback();

    int setRepeatingBurstRequests(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback);

    int setRepeatingBurstRequests(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

    int setSingleRepeatingRequest(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    int setSingleRepeatingRequest(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

    void stopRepeating();

    CameraCaptureSessionCompat toCameraCaptureSessionCompat();
}
