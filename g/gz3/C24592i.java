package gz3;

import b04.C23649g;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import iz3.C24651h;
import java.util.Map;
import m04.C21480i;
import m04.C24979m;
import mz3.C25048a;
import mz3.C25050b;
import mz3.C25053e;
import mz3.C25061m;
import ny3.C89104m;
import rx3.C13604l;
import sx3.C26236u;
import sx3.C36903g0;
import sx3.C90363p0;
import ty3.C26343l;
import vz3.C22830f;

/* renamed from: gz3.i */
public final class C24592i extends C24579b {

    /* renamed from: h */
    public static final /* synthetic */ C89104m<Object>[] f70188h = {C24560g0.m30727c(new C24575y(C24560g0.m30725a(C24592i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    public final C21480i f70189g;

    /* renamed from: gz3.i$a */
    public static final class C24593a extends C87413o implements C32224a<Map<C22830f, ? extends C23649g<? extends Object>>> {

        /* renamed from: d */
        public final /* synthetic */ C24592i f70190d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24593a(C24592i iVar) {
            super(0);
            this.f70190d = iVar;
        }

        public Object invoke() {
            C25050b bVar = this.f70190d.f70167d;
            Map map = null;
            C23649g<?> a = bVar instanceof C25053e ? C24582d.f70176a.mo51303a(((C25053e) bVar).mo51067b()) : bVar instanceof C25061m ? C24582d.f70176a.mo51303a(C26236u.m33719b(bVar)) : null;
            if (a != null) {
                map = C90363p0.m113143b(new C13604l(C24581c.f70173c, a));
            }
            return map == null ? C36903g0.f97931d : map;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24592i(C25048a aVar, C24651h hVar) {
        super(hVar, aVar, C26343l.C26344a.f73431u);
        C87412m.m108594g(aVar, "annotation");
        C87412m.m108594g(hVar, "c");
        this.f70189g = hVar.f70290a.f70256a.mo52006g(new C24593a(this));
    }

    /* renamed from: a */
    public Map<C22830f, C23649g<Object>> mo51296a() {
        return (Map) C24979m.m31587a(this.f70189g, this, f70188h[0]);
    }
}
