package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.compat.CameraDeviceCompat;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import java.util.List;
import p202m2.C117512b;

public final /* synthetic */ class SynchronizedCaptureSessionBaseImpl$$c implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ SynchronizedCaptureSessionBaseImpl f44089a;

    /* renamed from: b */
    public final /* synthetic */ List f44090b;

    /* renamed from: c */
    public final /* synthetic */ CameraDeviceCompat f44091c;

    /* renamed from: d */
    public final /* synthetic */ SessionConfigurationCompat f44092d;

    public /* synthetic */ SynchronizedCaptureSessionBaseImpl$$c(SynchronizedCaptureSessionBaseImpl synchronizedCaptureSessionBaseImpl, List list, CameraDeviceCompat cameraDeviceCompat, SessionConfigurationCompat sessionConfigurationCompat) {
        this.f44089a = synchronizedCaptureSessionBaseImpl;
        this.f44090b = list;
        this.f44091c = cameraDeviceCompat;
        this.f44092d = sessionConfigurationCompat;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return this.f44089a.lambda$openCaptureSession$0(this.f44090b, this.f44091c, this.f44092d, aVar);
    }
}
