package androidx.camera.core;

import java.util.concurrent.atomic.AtomicReference;
import p202m2.C117512b;

public final /* synthetic */ class SurfaceRequest$$c implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f44294a;

    /* renamed from: b */
    public final /* synthetic */ String f44295b;

    public /* synthetic */ SurfaceRequest$$c(AtomicReference atomicReference, String str) {
        this.f44294a = atomicReference;
        this.f44295b = str;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return this.f44294a.set(aVar);
    }
}
