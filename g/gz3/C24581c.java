package gz3;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import fz3.C24503f0;
import gy3.C87412m;
import iz3.C24651h;
import java.util.Map;
import jz3.C24799e;
import mz3.C25048a;
import mz3.C25052d;
import rx3.C13604l;
import sx3.C90364q0;
import ty3.C26343l;
import vz3.C22826c;
import vz3.C22830f;
import vz3.C26408b;
import xy3.C26566c;

/* renamed from: gz3.c */
public final class C24581c {

    /* renamed from: a */
    public static final C24581c f70171a = new C24581c();

    /* renamed from: b */
    public static final C22830f f70172b = C22830f.m26794f(StateEvent.Name.MESSAGE);

    /* renamed from: c */
    public static final C22830f f70173c = C22830f.m26794f("allowedTargets");

    /* renamed from: d */
    public static final C22830f f70174d = C22830f.m26794f("value");

    /* renamed from: e */
    public static final Map<C22826c, C22826c> f70175e = C90364q0.m113147f(new C13604l(C26343l.C26344a.f73431u, C24503f0.f70032c), new C13604l(C26343l.C26344a.f73434x, C24503f0.f70033d), new C13604l(C26343l.C26344a.f73435y, C24503f0.f70035f));

    /* renamed from: a */
    public final C26566c mo51301a(C22826c cVar, C25052d dVar, C24651h hVar) {
        C25048a b;
        C87412m.m108594g(cVar, "kotlinName");
        C87412m.m108594g(dVar, "annotationOwner");
        C87412m.m108594g(hVar, "c");
        if (C87412m.m108589b(cVar, C26343l.C26344a.f73424n)) {
            C22826c cVar2 = C24503f0.f70034e;
            C87412m.m108593f(cVar2, "DEPRECATED_ANNOTATION");
            C25048a b2 = dVar.mo51023b(cVar2);
            if (b2 != null || dVar.mo51018B()) {
                return new C24584e(b2, hVar);
            }
        }
        C22826c cVar3 = f70175e.get(cVar);
        if (cVar3 == null || (b = dVar.mo51023b(cVar3)) == null) {
            return null;
        }
        return f70171a.mo51302b(b, hVar, false);
    }

    /* renamed from: b */
    public final C26566c mo51302b(C25048a aVar, C24651h hVar, boolean z) {
        C87412m.m108594g(aVar, "annotation");
        C87412m.m108594g(hVar, "c");
        C26408b f = aVar.mo51043f();
        if (C87412m.m108589b(f, C26408b.m33992l(C24503f0.f70032c))) {
            return new C24592i(aVar, hVar);
        }
        if (C87412m.m108589b(f, C26408b.m33992l(C24503f0.f70033d))) {
            return new C24590h(aVar, hVar);
        }
        if (C87412m.m108589b(f, C26408b.m33992l(C24503f0.f70035f))) {
            return new C24579b(hVar, aVar, C26343l.C26344a.f73435y);
        }
        if (C87412m.m108589b(f, C26408b.m33992l(C24503f0.f70034e))) {
            return null;
        }
        return new C24799e(hVar, aVar, z);
    }
}
