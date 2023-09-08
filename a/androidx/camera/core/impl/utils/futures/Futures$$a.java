package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import p1167z8.C112608f;
import p202m2.C117512b;

public final /* synthetic */ class Futures$$a implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ C112608f f44365a;

    public /* synthetic */ Futures$$a(C112608f fVar) {
        this.f44365a = fVar;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return Futures.propagateTransform(false, this.f44365a, Futures.IDENTITY_FUNCTION, aVar, CameraXExecutors.directExecutor());
    }
}
