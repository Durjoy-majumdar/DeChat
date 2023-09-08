package j04;

import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import vz3.C22826c;
import vz3.C26408b;
import wy3.C22936j0;
import wy3.C22940l0;
import wy3.C26465i0;

/* renamed from: j04.o */
public final class C24769o implements C24755h {

    /* renamed from: a */
    public final C22936j0 f70654a;

    public C24769o(C22936j0 j0Var) {
        C87412m.m108594g(j0Var, "packageFragmentProvider");
        this.f70654a = j0Var;
    }

    /* renamed from: a */
    public C24747g mo51710a(C26408b bVar) {
        C24747g a;
        C87412m.m108594g(bVar, "classId");
        C22936j0 j0Var = this.f70654a;
        C22826c h = bVar.mo53392h();
        C87412m.m108593f(h, "classId.packageFqName");
        Iterator it = ((ArrayList) C22940l0.m26961c(j0Var, h)).iterator();
        while (it.hasNext()) {
            C26465i0 i0Var = (C26465i0) it.next();
            if ((i0Var instanceof C24770p) && (a = ((C24770p) i0Var).mo51751I0().mo51710a(bVar)) != null) {
                return a;
            }
        }
        return null;
    }
}
