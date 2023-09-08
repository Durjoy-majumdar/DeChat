package androidx.camera.camera2.internal.compat.workaround;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.camera2.internal.compat.workaround.WaitForRepeatingRequestStart;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import java.util.List;
import p1167z8.C112608f;

public final /* synthetic */ class WaitForRepeatingRequestStart$$b implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ WaitForRepeatingRequestStart.OpenCaptureSession f44177a;

    /* renamed from: b */
    public final /* synthetic */ CameraDevice f44178b;

    /* renamed from: c */
    public final /* synthetic */ SessionConfigurationCompat f44179c;

    /* renamed from: d */
    public final /* synthetic */ List f44180d;

    public /* synthetic */ WaitForRepeatingRequestStart$$b(WaitForRepeatingRequestStart.OpenCaptureSession openCaptureSession, CameraDevice cameraDevice, SessionConfigurationCompat sessionConfigurationCompat, List list) {
        this.f44177a = openCaptureSession;
        this.f44178b = cameraDevice;
        this.f44179c = sessionConfigurationCompat;
        this.f44180d = list;
    }

    public final C112608f apply(Object obj) {
        return this.f44177a.run(this.f44178b, this.f44179c, this.f44180d);
    }
}
