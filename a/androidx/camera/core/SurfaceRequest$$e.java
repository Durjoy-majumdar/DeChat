package androidx.camera.core;

import java.util.concurrent.atomic.AtomicReference;
import p202m2.C117512b;

public final /* synthetic */ class SurfaceRequest$$e implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f44298a;

    /* renamed from: b */
    public final /* synthetic */ String f44299b;

    public /* synthetic */ SurfaceRequest$$e(AtomicReference atomicReference, String str) {
        this.f44298a = atomicReference;
        this.f44299b = str;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return this.f44298a.set(aVar);
    }
}
