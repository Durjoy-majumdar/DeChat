package l04;

import fy3.C32224a;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;
import m04.C21480i;
import m04.C24979m;
import m04.C24980n;
import ny3.C89104m;
import vz3.C22826c;
import xy3.C26566c;
import xy3.C26571h;

/* renamed from: l04.a */
public class C24871a implements C26571h {

    /* renamed from: e */
    public static final /* synthetic */ C89104m<Object>[] f70878e = {C24560g0.m30727c(new C24575y(C24560g0.m30725a(C24871a.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* renamed from: d */
    public final C21480i f70879d;

    public C24871a(C24980n nVar, C32224a<? extends List<? extends C26566c>> aVar) {
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(aVar, "compute");
        this.f70879d = nVar.mo52006g(aVar);
    }

    /* renamed from: b */
    public C26566c mo51476b(C22826c cVar) {
        return C26571h.C26574b.m34370a(this, cVar);
    }

    public boolean isEmpty() {
        return ((List) C24979m.m31587a(this.f70879d, this, f70878e[0])).isEmpty();
    }

    public Iterator<C26566c> iterator() {
        return ((List) C24979m.m31587a(this.f70879d, this, f70878e[0])).iterator();
    }

    /* renamed from: q */
    public boolean mo51479q(C22826c cVar) {
        return C26571h.C26574b.m34371b(this, cVar);
    }
}
