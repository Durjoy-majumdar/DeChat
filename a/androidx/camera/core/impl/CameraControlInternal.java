package androidx.camera.core.impl;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.CameraControl;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.FocusMeteringResult;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.Collections;
import java.util.List;
import p1167z8.C112608f;

public interface CameraControlInternal extends CameraControl {
    public static final CameraControlInternal DEFAULT_EMPTY_INSTANCE = new CameraControlInternal() {
        public void addInteropConfig(Config config) {
        }

        public void addZslConfig(Size size, SessionConfig.Builder builder) {
        }

        public C112608f<Void> cancelFocusAndMetering() {
            return Futures.immediateFuture(null);
        }

        public void clearInteropConfig() {
        }

        public C112608f<Void> enableTorch(boolean z) {
            return Futures.immediateFuture(null);
        }

        public int getFlashMode() {
            return 2;
        }

        public Config getInteropConfig() {
            return null;
        }

        public Rect getSensorRect() {
            return new Rect();
        }

        public SessionConfig getSessionConfig() {
            return SessionConfig.defaultEmptySessionConfig();
        }

        public C112608f<Integer> setExposureCompensationIndex(int i) {
            return Futures.immediateFuture(0);
        }

        public void setFlashMode(int i) {
        }

        public C112608f<Void> setLinearZoom(float f) {
            return Futures.immediateFuture(null);
        }

        public C112608f<Void> setZoomRatio(float f) {
            return Futures.immediateFuture(null);
        }

        public void setZslDisabled(boolean z) {
        }

        public C112608f<FocusMeteringResult> startFocusAndMetering(FocusMeteringAction focusMeteringAction) {
            return Futures.immediateFuture(FocusMeteringResult.emptyInstance());
        }

        public C112608f<List<Void>> submitStillCaptureRequests(List<CaptureConfig> list, int i, int i2) {
            return Futures.immediateFuture(Collections.emptyList());
        }
    };

    public interface ControlUpdateCallback {
        void onCameraControlCaptureRequests(List<CaptureConfig> list);

        void onCameraControlUpdateSessionConfig();
    }

    void addInteropConfig(Config config);

    void addZslConfig(Size size, SessionConfig.Builder builder);

    void clearInteropConfig();

    int getFlashMode();

    Config getInteropConfig();

    Rect getSensorRect();

    SessionConfig getSessionConfig();

    void setFlashMode(int i);

    void setZslDisabled(boolean z);

    C112608f<List<Void>> submitStillCaptureRequests(List<CaptureConfig> list, int i, int i2);

    public static final class CameraControlException extends Exception {
        private CameraCaptureFailure mCameraCaptureFailure;

        public CameraControlException(CameraCaptureFailure cameraCaptureFailure) {
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }

        public CameraCaptureFailure getCameraCaptureFailure() {
            return this.mCameraCaptureFailure;
        }

        public CameraControlException(CameraCaptureFailure cameraCaptureFailure, Throwable th) {
            super(th);
            this.mCameraCaptureFailure = cameraCaptureFailure;
        }
    }
}
