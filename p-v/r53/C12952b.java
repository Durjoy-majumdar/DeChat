package r53;

import androidx.lifecycle.C54219z;
import gy3.C8480h;

/* renamed from: r53.b */
public final class C12952b<T> implements Runnable {

    /* renamed from: d */
    public final C54219z<T> f36967d;

    /* renamed from: e */
    public final T f36968e;

    public C12952b(C54219z zVar, Object obj, C8480h hVar) {
        this.f36967d = zVar;
        this.f36968e = obj;
    }

    public void run() {
        this.f36967d.setValue(this.f36968e);
    }
}
