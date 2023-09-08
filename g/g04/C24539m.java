package g04;

import com.google.firebase.analytics.FirebaseAnalytics;
import ez3.C24473b;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.List;
import m04.C21480i;
import m04.C24979m;
import m04.C24980n;
import ny3.C89104m;
import sx3.C64197v;
import vz3.C22830f;
import w04.C26413e;
import wy3.C22935h;
import wy3.C26447e;
import wy3.C26520x0;
import zz3.C26792g;

/* renamed from: g04.m */
public final class C24539m extends C24538j {

    /* renamed from: d */
    public static final /* synthetic */ C89104m<Object>[] f70122d = {C24560g0.m30727c(new C24575y(C24560g0.m30725a(C24539m.class), "functions", "getFunctions()Ljava/util/List;"))};

    /* renamed from: b */
    public final C26447e f70123b;

    /* renamed from: c */
    public final C21480i f70124c;

    /* renamed from: g04.m$a */
    public static final class C24540a extends C87413o implements C32224a<List<? extends C26520x0>> {

        /* renamed from: d */
        public final /* synthetic */ C24539m f70125d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24540a(C24539m mVar) {
            super(0);
            this.f70125d = mVar;
        }

        public Object invoke() {
            return C64197v.m75537f(C26792g.m35206e(this.f70125d.f70123b), C26792g.m35207f(this.f70125d.f70123b));
        }
    }

    public C24539m(C24980n nVar, C26447e eVar) {
        C87412m.m108594g(nVar, "storageManager");
        C87412m.m108594g(eVar, "containingClass");
        this.f70123b = eVar;
        eVar.mo51796f();
        this.f70124c = nVar.mo52006g(new C24540a(this));
    }

    /* renamed from: a */
    public Collection mo32456a(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        C26413e eVar = new C26413e();
        for (Object next : (List) C24979m.m31587a(this.f70124c, this, f70122d[0])) {
            if (C87412m.m108589b(((C26520x0) next).getName(), fVar)) {
                eVar.add(next);
            }
        }
        return eVar;
    }

    /* renamed from: e */
    public Collection mo32460e(C24531d dVar, C32226l lVar) {
        C87412m.m108594g(dVar, "kindFilter");
        C87412m.m108594g(lVar, "nameFilter");
        return (List) C24979m.m31587a(this.f70124c, this, f70122d[0]);
    }

    /* renamed from: g */
    public C22935h mo32462g(C22830f fVar, C24473b bVar) {
        C87412m.m108594g(fVar, "name");
        C87412m.m108594g(bVar, FirebaseAnalytics.C113379b.LOCATION);
        return null;
    }
}
