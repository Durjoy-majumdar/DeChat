package cz3;

import az3.C23637a;
import az3.C23638b;
import az3.C23639c;
import java.lang.reflect.Modifier;
import mz3.C25066r;
import wy3.C26470k1;
import wy3.C26481l1;

/* renamed from: cz3.d0 */
public interface C24413d0 extends C25066r {

    /* renamed from: cz3.d0$a */
    public static final class C24414a {
        /* renamed from: a */
        public static C26481l1 m30461a(C24413d0 d0Var) {
            int o = d0Var.mo51032o();
            return Modifier.isPublic(o) ? C26470k1.C26478h.f73770c : Modifier.isPrivate(o) ? C26470k1.C26475e.f73767c : Modifier.isProtected(o) ? Modifier.isStatic(o) ? C23639c.f67835c : C23638b.f67834c : C23637a.f67833c;
        }
    }

    /* renamed from: o */
    int mo51032o();
}
