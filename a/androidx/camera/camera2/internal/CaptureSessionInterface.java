package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.SessionConfig;
import java.util.List;
import p1167z8.C112608f;

interface CaptureSessionInterface {
    void cancelIssuedCaptureRequests();

    void close();

    List<CaptureConfig> getCaptureConfigs();

    SessionConfig getSessionConfig();

    void issueCaptureRequests(List<CaptureConfig> list);

    C112608f<Void> open(SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener);

    C112608f<Void> release(boolean z);

    void setSessionConfig(SessionConfig sessionConfig);
}
