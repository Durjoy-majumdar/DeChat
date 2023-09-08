package p41;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: p41.b */
public class C117985b<T> {

    /* renamed from: a */
    public static Collection<C117986c> f352647a = new Vector();

    /* renamed from: a */
    public void mo182750a(Object obj, T t, C117984a aVar) {
        if (obj != null && aVar != null) {
            Iterator it = ((Vector) f352647a).iterator();
            if (it != null) {
                while (it.hasNext()) {
                    C117986c cVar = (C117986c) it.next();
                    if (cVar != null && cVar.get() == null) {
                        it.remove();
                        cVar.f352648a.mo175200a(cVar.f352649b);
                    }
                }
            }
            Iterator it4 = ((Vector) f352647a).iterator();
            if (it4 != null) {
                while (it4.hasNext()) {
                    C117986c cVar2 = (C117986c) it4.next();
                    if (cVar2 != null && cVar2.get() == obj) {
                        return;
                    }
                }
            }
            ((Vector) f352647a).add(new C117986c(obj, t, aVar));
        }
    }
}
