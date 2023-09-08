package xy3;

import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import sx3.C64184e0;
import vz3.C22826c;

/* renamed from: xy3.h */
public interface C26571h extends Iterable<C26566c>, C33145a {

    /* renamed from: P0 */
    public static final /* synthetic */ int f73936P0 = 0;

    /* renamed from: xy3.h$a */
    public static final class C26572a {

        /* renamed from: a */
        public static final C26571h f73937a = new C26573a();

        /* renamed from: xy3.h$a$a */
        public static final class C26573a implements C26571h {
            /* renamed from: b */
            public C26566c mo51476b(C22826c cVar) {
                C87412m.m108594g(cVar, "fqName");
                return null;
            }

            public boolean isEmpty() {
                return true;
            }

            public Iterator<C26566c> iterator() {
                return C64184e0.f181906d;
            }

            /* renamed from: q */
            public boolean mo51479q(C22826c cVar) {
                return C26574b.m34371b(this, cVar);
            }

            public String toString() {
                return "EMPTY";
            }
        }
    }

    /* renamed from: xy3.h$b */
    public static final class C26574b {
        /* renamed from: a */
        public static C26566c m34370a(C26571h hVar, C22826c cVar) {
            Object obj;
            C87412m.m108594g(cVar, "fqName");
            Iterator it = hVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C87412m.m108589b(((C26566c) obj).mo51298d(), cVar)) {
                    break;
                }
            }
            return (C26566c) obj;
        }

        /* renamed from: b */
        public static boolean m34371b(C26571h hVar, C22826c cVar) {
            C87412m.m108594g(cVar, "fqName");
            return hVar.mo51476b(cVar) != null;
        }
    }

    /* renamed from: b */
    C26566c mo51476b(C22826c cVar);

    boolean isEmpty();

    /* renamed from: q */
    boolean mo51479q(C22826c cVar);
}
