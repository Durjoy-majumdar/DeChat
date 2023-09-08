package ka0;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: ka0.e */
public final class C33846e {

    /* renamed from: a */
    public final LinkedList<C33845d> f91482a = new LinkedList<>();

    /* renamed from: a */
    public final int mo59320a() {
        T t;
        Iterator<T> it = this.f91482a.iterator();
        if (!it.hasNext()) {
            t = null;
        } else {
            T next = it.next();
            if (!it.hasNext()) {
                t = next;
            } else {
                int i = ((C33845d) next).f91477b;
                do {
                    T next2 = it.next();
                    int i2 = ((C33845d) next2).f91477b;
                    if (i < i2) {
                        next = next2;
                        i = i2;
                    }
                } while (it.hasNext());
            }
            t = next;
        }
        C33845d dVar = (C33845d) t;
        if (dVar != null) {
            return dVar.f91477b;
        }
        return 0;
    }
}
