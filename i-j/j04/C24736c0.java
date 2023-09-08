package j04;

import gy3.C8480h;
import gy3.C87412m;
import qz3.C26019c;
import sz3.C26238b;
import sz3.C26243c;
import sz3.C26247g;
import vz3.C22826c;
import vz3.C26408b;
import wy3.C26521y0;

/* renamed from: j04.c0 */
public abstract class C24736c0 {

    /* renamed from: a */
    public final C26243c f70576a;

    /* renamed from: b */
    public final C26247g f70577b;

    /* renamed from: c */
    public final C26521y0 f70578c;

    /* renamed from: j04.c0$a */
    public static final class C24737a extends C24736c0 {

        /* renamed from: d */
        public final C26019c f70579d;

        /* renamed from: e */
        public final C24737a f70580e;

        /* renamed from: f */
        public final C26408b f70581f;

        /* renamed from: g */
        public final C26019c.C26022c f70582g;

        /* renamed from: h */
        public final boolean f70583h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24737a(C26019c cVar, C26243c cVar2, C26247g gVar, C26521y0 y0Var, C24737a aVar) {
            super(cVar2, gVar, y0Var, (C8480h) null);
            C87412m.m108594g(cVar, "classProto");
            C87412m.m108594g(cVar2, "nameResolver");
            C87412m.m108594g(gVar, "typeTable");
            this.f70579d = cVar;
            this.f70580e = aVar;
            this.f70581f = C24732a0.m31109a(cVar2, cVar.f72491h);
            C26019c.C26022c c = C26238b.f73156f.mo53140c(cVar.f72490g);
            this.f70582g = c == null ? C26019c.C26022c.CLASS : c;
            Boolean d = C26238b.f73157g.mo53140c(cVar.f72490g);
            C87412m.m108593f(d, "IS_INNER.get(classProto.flags)");
            this.f70583h = d.booleanValue();
        }

        /* renamed from: a */
        public C22826c mo51713a() {
            C22826c b = this.f70581f.mo53387b();
            C87412m.m108593f(b, "classId.asSingleFqName()");
            return b;
        }
    }

    /* renamed from: j04.c0$b */
    public static final class C24738b extends C24736c0 {

        /* renamed from: d */
        public final C22826c f70584d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24738b(C22826c cVar, C26243c cVar2, C26247g gVar, C26521y0 y0Var) {
            super(cVar2, gVar, y0Var, (C8480h) null);
            C87412m.m108594g(cVar, "fqName");
            C87412m.m108594g(cVar2, "nameResolver");
            C87412m.m108594g(gVar, "typeTable");
            this.f70584d = cVar;
        }

        /* renamed from: a */
        public C22826c mo51713a() {
            return this.f70584d;
        }
    }

    public C24736c0(C26243c cVar, C26247g gVar, C26521y0 y0Var, C8480h hVar) {
        this.f70576a = cVar;
        this.f70577b = gVar;
        this.f70578c = y0Var;
    }

    /* renamed from: a */
    public abstract C22826c mo51713a();

    public String toString() {
        return getClass().getSimpleName() + ": " + mo51713a();
    }
}
