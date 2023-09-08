package nz3;

import d04.C24442a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import n04.C25198y1;
import vy3.C26384c;
import vz3.C22826c;
import vz3.C22830f;
import wy3.C22935h;

/* renamed from: nz3.n */
public final class C21721n extends C87413o implements C32226l<C25198y1, Boolean> {

    /* renamed from: d */
    public static final C21721n f61496d = new C21721n();

    public C21721n() {
        super(1);
    }

    public Object invoke(Object obj) {
        C22935h o = ((C25198y1) obj).mo37081K0().mo37094o();
        if (o == null) {
            return Boolean.FALSE;
        }
        C22830f name = o.getName();
        C22826c cVar = C26384c.f73591g;
        return Boolean.valueOf(C87412m.m108589b(name, cVar.mo35978f()) && C87412m.m108589b(C24442a.m30536c(o), cVar));
    }
}
