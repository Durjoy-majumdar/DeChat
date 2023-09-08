package androidx.camera.core;

import java.util.concurrent.atomic.AtomicReference;
import p202m2.C117512b;

public final /* synthetic */ class VideoCapture$$b implements C117512b.C117515c {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f44309a;

    public /* synthetic */ VideoCapture$$b(AtomicReference atomicReference) {
        this.f44309a = atomicReference;
    }

    public final Object attachCompleter(C117512b.C117513a aVar) {
        return this.f44309a.set(aVar);
    }
}
