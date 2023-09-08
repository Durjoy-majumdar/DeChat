package ku3;

import android.os.SystemClock;
import du3.C116630c;
import eu3.C86698f;
import java.util.concurrent.TimeUnit;
import lu3.C117479j;
import lu3.C34379c;
import mu3.C117577e;
import zt3.C119140a;

/* renamed from: ku3.e */
public class C117420e {

    /* renamed from: a */
    public final C117411b f351463a;

    /* renamed from: b */
    public final C117415c f351464b;

    /* renamed from: c */
    public final C117421f f351465c = new C117421f();

    public C117420e(C119140a aVar) {
        this.f351463a = new C117411b(aVar.f356823b, aVar.f356822a);
        this.f351464b = new C117415c(aVar.f356824c);
    }

    /* renamed from: a */
    public <V> C34379c<V> mo182116a(C117479j<V> jVar, boolean z) {
        C117419d dVar;
        C116630c cVar = C86698f.f251708a;
        if (cVar != null) {
            dVar = cVar.mo180613c(jVar.getKey()) ? this.f351463a : this.f351464b;
        } else {
            dVar = this.f351464b.f351458e.getQueue().size() > 0 ? this.f351463a : this.f351464b;
        }
        mo182117b(jVar, z, dVar);
        return jVar;
    }

    /* renamed from: b */
    public final <V> C34379c<V> mo182117b(C117479j<V> jVar, boolean z, C117419d dVar) {
        jVar.f351581r = dVar;
        SystemClock.uptimeMillis();
        if (jVar instanceof C117577e) {
            C117577e eVar = (C117577e) jVar;
            eVar.f351735y.f328238b.mo182311d(z ? -2147483648L : jVar.getDelay(TimeUnit.MILLISECONDS), eVar);
        } else {
            ((C117409a) jVar.f351581r).mo182101c(jVar);
        }
        return jVar;
    }
}
