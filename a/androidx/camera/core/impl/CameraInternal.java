package androidx.camera.core.impl;

import androidx.camera.core.Camera;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.UseCase;
import java.util.Collection;
import java.util.LinkedHashSet;
import p1167z8.C112608f;

public interface CameraInternal extends Camera, UseCase.StateChangeCallback {

    public enum State {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);
        
        private final boolean mHoldsCameraSlot;

        private State(boolean z) {
            this.mHoldsCameraSlot = z;
        }

        public boolean holdsCameraSlot() {
            return this.mHoldsCameraSlot;
        }
    }

    void attachUseCases(Collection<UseCase> collection);

    void close();

    void detachUseCases(Collection<UseCase> collection);

    CameraControl getCameraControl();

    CameraControlInternal getCameraControlInternal();

    CameraInfo getCameraInfo();

    CameraInfoInternal getCameraInfoInternal();

    LinkedHashSet<CameraInternal> getCameraInternals();

    Observable<State> getCameraState();

    CameraConfig getExtendedConfig();

    void open();

    C112608f<Void> release();

    void setActiveResumingMode(boolean z);

    void setExtendedConfig(CameraConfig cameraConfig);
}
