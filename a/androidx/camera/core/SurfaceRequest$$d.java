package androidx.camera.core;

import java.util.concurrent.atomic.AtomicReference;
import p202m2.C117512b;

public final /* synthetic */ class SurfaceRequest$$d implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f44296a;

    /* renamed from: b */
    public final /* synthetic */ String f44297b;

    public /* synthetic */ SurfaceRequest$$d(AtomicReference atomicReference, String str) {
        this.f44296a = atomicReference;
        this.f44297b = str;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return this.f44296a.set(aVar);
    }
}
