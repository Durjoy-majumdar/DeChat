package yz3;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import sx3.C64195t0;
import vz3.C22827d;
import vz3.C22830f;
import wy3.C22935h;
import wy3.C26446d1;
import wy3.C26447e;
import wy3.C26465i0;
import wy3.C26469k;
import zz3.C26794h;

/* renamed from: yz3.b */
public interface C23389b {

    /* renamed from: yz3.b$a */
    public static final class C23390a implements C23389b {

        /* renamed from: a */
        public static final C23390a f67149a = new C23390a();

        /* renamed from: a */
        public String mo36856a(C22935h hVar, C23393c cVar) {
            C87412m.m108594g(hVar, "classifier");
            C87412m.m108594g(cVar, "renderer");
            if (hVar instanceof C26446d1) {
                C22830f name = ((C26446d1) hVar).getName();
                C87412m.m108593f(name, "classifier.name");
                return cVar.mo36862t(name, false);
            }
            C22827d g = C26794h.m35219g(hVar);
            C87412m.m108593f(g, "getFqName(classifier)");
            return cVar.mo36861s(g);
        }
    }

    /* renamed from: yz3.b$b */
    public static final class C23391b implements C23389b {

        /* renamed from: a */
        public static final C23391b f67150a = new C23391b();

        /* renamed from: a */
        public String mo36856a(C22935h hVar, C23393c cVar) {
            boolean z;
            C87412m.m108594g(hVar, "classifier");
            C87412m.m108594g(cVar, "renderer");
            if (hVar instanceof C26446d1) {
                C22830f name = ((C26446d1) hVar).getName();
                C87412m.m108593f(name, "classifier.name");
                return cVar.mo36862t(name, false);
            }
            ArrayList arrayList = new ArrayList();
            C26469k kVar = hVar;
            do {
                arrayList.add(kVar.getName());
                C26469k b = kVar.mo51892b();
                z = b instanceof C26447e;
                kVar = b;
            } while (z);
            return C119026s.m167775b(new C64195t0(arrayList));
        }
    }

    /* renamed from: yz3.b$c */
    public static final class C23392c implements C23389b {

        /* renamed from: a */
        public static final C23392c f67151a = new C23392c();

        /* renamed from: a */
        public String mo36856a(C22935h hVar, C23393c cVar) {
            C87412m.m108594g(hVar, "classifier");
            C87412m.m108594g(cVar, "renderer");
            return mo36857b(hVar);
        }

        /* renamed from: b */
        public final String mo36857b(C22935h hVar) {
            String str;
            C22830f name = hVar.getName();
            C87412m.m108593f(name, "descriptor.name");
            String a = C119026s.m167774a(name);
            if (hVar instanceof C26446d1) {
                return a;
            }
            C26469k b = hVar.mo51892b();
            C87412m.m108593f(b, "descriptor.containingDeclaration");
            if (b instanceof C26447e) {
                str = mo36857b((C22935h) b);
            } else if (b instanceof C26465i0) {
                C22827d i = ((C26465i0) b).mo53444d().mo35982i();
                C87412m.m108593f(i, "descriptor.fqName.toUnsafe()");
                List<C22830f> g = i.mo35990g();
                C87412m.m108593f(g, "pathSegments()");
                str = C119026s.m167775b(g);
            } else {
                str = null;
            }
            if (str == null || C87412m.m108589b(str, "")) {
                return a;
            }
            return str + '.' + a;
        }
    }

    /* renamed from: a */
    String mo36856a(C22935h hVar, C23393c cVar);
}
