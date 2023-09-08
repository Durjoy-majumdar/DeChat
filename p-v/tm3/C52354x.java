package tm3;

import eb0.C45612m0;
import eb0.C45628s0;
import eb0.C75592q0;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import sx3.C36907w;

/* renamed from: tm3.x */
public final class C52354x {

    /* renamed from: a */
    public static final C52355a f146330a = new C52355a((C8480h) null);

    /* renamed from: tm3.x$a */
    public static final class C52355a {
        public C52355a(C8480h hVar) {
        }

        /* renamed from: a */
        public final List<String> mo73368a(List<String> list, Set<String> set, boolean z) {
            C87412m.m108594g(list, "selectUserSet");
            C87412m.m108594g(set, "alwaysSelectUserSet");
            HashSet<String> hashSet = new HashSet<>();
            if (!z) {
                for (String str : list) {
                    if (C45628s0.m50743H(str)) {
                        hashSet.addAll(C45612m0.m50696m(str));
                    } else {
                        hashSet.add(str);
                    }
                }
                for (String str2 : set) {
                    if (C45628s0.m50743H(str2)) {
                        hashSet.addAll(C45612m0.m50696m(str2));
                    } else {
                        hashSet.add(str2);
                    }
                }
            } else {
                hashSet.addAll(list);
                hashSet.addAll(set);
            }
            ArrayList arrayList = new ArrayList(C36907w.m41090l(hashSet, 10));
            for (String add : hashSet) {
                arrayList.add(add);
            }
            return arrayList;
        }

        /* renamed from: b */
        public final List<String> mo73369b(List<String> list, Set<String> set, boolean z) {
            C87412m.m108594g(list, "selectUserSet");
            C87412m.m108594g(set, "alwaysSelectUserSet");
            String s = C75592q0.m90789s();
            List<String> a = mo73368a(list, set, z);
            ArrayList arrayList = new ArrayList();
            for (T next : a) {
                if (!C87412m.m108589b((String) next, s)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }
}
