package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import java.util.List;
import p1167z8.C112608f;

public final /* synthetic */ class ProcessingCaptureSession$$c implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ ProcessingCaptureSession f44074a;

    /* renamed from: b */
    public final /* synthetic */ SessionConfig f44075b;

    /* renamed from: c */
    public final /* synthetic */ CameraDevice f44076c;

    /* renamed from: d */
    public final /* synthetic */ SynchronizedCaptureSessionOpener f44077d;

    public /* synthetic */ ProcessingCaptureSession$$c(ProcessingCaptureSession processingCaptureSession, SessionConfig sessionConfig, CameraDevice cameraDevice, SynchronizedCaptureSessionOpener synchronizedCaptureSessionOpener) {
        this.f44074a = processingCaptureSession;
        this.f44075b = sessionConfig;
        this.f44076c = cameraDevice;
        this.f44077d = synchronizedCaptureSessionOpener;
    }

    public final C112608f apply(Object obj) {
        return this.f44074a.lambda$open$2(this.f44075b, this.f44076c, this.f44077d, (List) obj);
    }
}
