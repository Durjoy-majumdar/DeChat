package ku3;

import java.util.concurrent.atomic.AtomicBoolean;
import lu3.C117479j;
import lu3.C34379c;
import zt3.C119146d;

/* renamed from: ku3.a */
public abstract class C117409a implements C117419d {

    /* renamed from: d */
    public final AtomicBoolean f351449d = new AtomicBoolean(false);

    /* renamed from: ku3.a$a */
    public interface C117410a {
        /* renamed from: a */
        void mo182102a(C117479j<?> jVar);
    }

    /* renamed from: b */
    public abstract C117410a mo182100b();

    /* renamed from: c */
    public <V> C34379c<V> mo182101c(C117479j<V> jVar) {
        if (this.f351449d.get()) {
            C119146d.f356849a.mo174286d(jVar.getKey(), jVar.f351582s, getName(), true);
            return null;
        } else if (!jVar.isCancelled()) {
            mo182100b().mo182102a(jVar);
            return jVar;
        } else {
            C119146d.C91936b bVar = C119146d.f356851c;
            String name = getName();
            bVar.mo125766w(name, "[BasePool#input] task=%s pool=%s", jVar.getKey() + "#" + jVar.f351582s, getName());
            return null;
        }
    }
}
