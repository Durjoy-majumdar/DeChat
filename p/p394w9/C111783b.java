package p394w9;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p398x9.C112138m;

/* renamed from: w9.b */
public class C111783b {
    /* renamed from: a */
    public static boolean m152398a(Set<?> set, Collection<?> collection) {
        boolean z;
        collection.getClass();
        if (collection instanceof C112138m) {
            collection = ((C112138m) collection).mo163921t0();
        }
        boolean z2 = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            for (Object remove : collection) {
                z2 |= set.remove(remove);
            }
            return z2;
        }
        Iterator<?> it = set.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            try {
                z = collection.contains(it.next());
            } catch (ClassCastException | NullPointerException unused) {
                z = false;
            }
            if (z) {
                it.remove();
                z3 = true;
            }
        }
        return z3;
    }
}
