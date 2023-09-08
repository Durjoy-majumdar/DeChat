package androidx.camera.lifecycle;

import androidx.camera.core.CameraX;
import p202m2.C117512b;

public final /* synthetic */ class ProcessCameraProvider$$d implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ ProcessCameraProvider f44384a;

    /* renamed from: b */
    public final /* synthetic */ CameraX f44385b;

    public /* synthetic */ ProcessCameraProvider$$d(ProcessCameraProvider processCameraProvider, CameraX cameraX) {
        this.f44384a = processCameraProvider;
        this.f44385b = cameraX;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return this.f44384a.lambda$getOrCreateCameraXInstance$2(this.f44385b, aVar);
    }
}
