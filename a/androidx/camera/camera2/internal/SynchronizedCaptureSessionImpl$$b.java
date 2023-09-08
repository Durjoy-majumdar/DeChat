package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart;
import java.util.List;
import p1167z8.C112608f;

public final /* synthetic */ class SynchronizedCaptureSessionImpl$$b implements WaitForRepeatingRequestStart.OpenCaptureSession {

    /* renamed from: a */
    public final /* synthetic */ SynchronizedCaptureSessionImpl f44097a;

    public /* synthetic */ SynchronizedCaptureSessionImpl$$b(SynchronizedCaptureSessionImpl synchronizedCaptureSessionImpl) {
        this.f44097a = synchronizedCaptureSessionImpl;
    }

    public final C112608f run(CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        return this.f44097a.lambda$openCaptureSession$0(cameraDevice, sessionConfigurationCompat, list);
    }
}
