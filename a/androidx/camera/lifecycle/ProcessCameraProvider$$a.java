package androidx.camera.lifecycle;

import androidx.camera.core.CameraX;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import p1167z8.C112608f;

public final /* synthetic */ class ProcessCameraProvider$$a implements AsyncFunction {

    /* renamed from: a */
    public final /* synthetic */ CameraX f44381a;

    public /* synthetic */ ProcessCameraProvider$$a(CameraX cameraX) {
        this.f44381a = cameraX;
    }

    public final C112608f apply(Object obj) {
        return this.f44381a.getInitializeFuture();
    }
}
