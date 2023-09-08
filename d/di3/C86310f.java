package di3;

import di3.C86301e;
import java.util.concurrent.Callable;

/* renamed from: di3.f */
public class C86310f implements Callable<Void> {

    /* renamed from: d */
    public final /* synthetic */ C86301e.C86307f f250981d;

    public C86310f(C86301e.C86307f fVar) {
        this.f250981d = fVar;
    }

    public Object call() {
        boolean z;
        synchronized (this.f250981d) {
            z = this.f250981d.f250976n != null;
        }
        if (z) {
            this.f250981d.join();
            return null;
        }
        this.f250981d.invoke();
        return null;
    }
}
