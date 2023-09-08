package zz3;

import java.util.Comparator;
import wy3.C26443c1;
import wy3.C26447e;
import wy3.C26467j;
import wy3.C26469k;
import wy3.C26504r0;
import wy3.C26516w;

/* renamed from: zz3.k */
public class C26799k implements Comparator<C26469k> {

    /* renamed from: d */
    public static final C26799k f74532d = new C26799k();

    /* renamed from: a */
    public static int m35243a(C26469k kVar) {
        if (C26794h.m35226n(kVar)) {
            return 8;
        }
        if (kVar instanceof C26467j) {
            return 7;
        }
        if (kVar instanceof C26504r0) {
            return ((C26504r0) kVar).mo52627I() == null ? 6 : 5;
        }
        if (kVar instanceof C26516w) {
            return ((C26516w) kVar).mo52627I() == null ? 4 : 3;
        }
        if (kVar instanceof C26447e) {
            return 2;
        }
        return kVar instanceof C26443c1 ? 1 : 0;
    }

    public int compare(Object obj, Object obj2) {
        Integer num;
        C26469k kVar = (C26469k) obj;
        C26469k kVar2 = (C26469k) obj2;
        int a = m35243a(kVar2) - m35243a(kVar);
        if (a != 0) {
            num = Integer.valueOf(a);
        } else if (!C26794h.m35226n(kVar) || !C26794h.m35226n(kVar2)) {
            int compareTo = kVar.getName().f65637d.compareTo(kVar2.getName().f65637d);
            num = compareTo != 0 ? Integer.valueOf(compareTo) : null;
        } else {
            num = 0;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }
}
