package cz3;

import gy3.C87412m;
import java.lang.reflect.Type;
import java.util.Iterator;
import mz3.C25048a;
import mz3.C25071w;
import vz3.C22826c;
import vz3.C26408b;

/* renamed from: cz3.h0 */
public abstract class C24423h0 implements C25071w {
    /* renamed from: P */
    public abstract Type mo51055P();

    /* renamed from: b */
    public C25048a mo51023b(C22826c cVar) {
        T t;
        C87412m.m108594g(cVar, "fqName");
        Iterator<T> it = getAnnotations().iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            C26408b f = ((C25048a) next).mo51043f();
            if (f != null) {
                t = f.mo53387b();
            }
            if (C87412m.m108589b(t, cVar)) {
                t = next;
                break;
            }
        }
        return (C25048a) t;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C24423h0) && C87412m.m108589b(mo51055P(), ((C24423h0) obj).mo51055P());
    }

    public int hashCode() {
        return mo51055P().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + mo51055P();
    }
}
