package iz3;

import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import gz3.C24581c;
import java.util.Iterator;
import m04.C21479h;
import mz3.C25048a;
import mz3.C25052d;
import sx3.C110818d0;
import ty3.C26343l;
import vz3.C22826c;
import xy3.C26566c;
import xy3.C26571h;
import y04.C112354s;
import y04.C15926r;
import y04.C26620e;

/* renamed from: iz3.e */
public final class C24646e implements C26571h {

    /* renamed from: d */
    public final C24651h f70281d;

    /* renamed from: e */
    public final C25052d f70282e;

    /* renamed from: f */
    public final boolean f70283f;

    /* renamed from: g */
    public final C21479h<C25048a, C26566c> f70284g;

    /* renamed from: iz3.e$a */
    public static final class C24647a extends C87413o implements C32226l<C25048a, C26566c> {

        /* renamed from: d */
        public final /* synthetic */ C24646e f70285d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24647a(C24646e eVar) {
            super(1);
            this.f70285d = eVar;
        }

        public Object invoke(Object obj) {
            C25048a aVar = (C25048a) obj;
            C87412m.m108594g(aVar, "annotation");
            C24581c cVar = C24581c.f70171a;
            C24646e eVar = this.f70285d;
            return cVar.mo51302b(aVar, eVar.f70281d, eVar.f70283f);
        }
    }

    public C24646e(C24651h hVar, C25052d dVar, boolean z) {
        C87412m.m108594g(hVar, "c");
        C87412m.m108594g(dVar, "annotationOwner");
        this.f70281d = hVar;
        this.f70282e = dVar;
        this.f70283f = z;
        this.f70284g = hVar.f70290a.f70256a.mo52004e(new C24647a(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = r3.f70284g.invoke(r0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xy3.C26566c mo51476b(vz3.C22826c r4) {
        /*
            r3 = this;
            java.lang.String r0 = "fqName"
            gy3.C87412m.m108594g(r4, r0)
            mz3.d r0 = r3.f70282e
            mz3.a r0 = r0.mo51023b(r4)
            if (r0 == 0) goto L_0x0017
            m04.h<mz3.a, xy3.c> r1 = r3.f70284g
            java.lang.Object r0 = r1.invoke(r0)
            xy3.c r0 = (xy3.C26566c) r0
            if (r0 != 0) goto L_0x0021
        L_0x0017:
            gz3.c r0 = gz3.C24581c.f70171a
            mz3.d r1 = r3.f70282e
            iz3.h r2 = r3.f70281d
            xy3.c r0 = r0.mo51301a(r4, r1, r2)
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iz3.C24646e.mo51476b(vz3.c):xy3.c");
    }

    public boolean isEmpty() {
        return this.f70282e.getAnnotations().isEmpty() && !this.f70282e.mo51018B();
    }

    public Iterator<C26566c> iterator() {
        return new C26620e.C26621a((C26620e) C112354s.m153286i(C112354s.m153294q(C112354s.m153290m(C110818d0.m150897A(this.f70282e.getAnnotations()), this.f70284g), C24581c.f70171a.mo51301a(C26343l.C26344a.f73424n, this.f70282e, this.f70281d)), C15926r.f42793d));
    }

    /* renamed from: q */
    public boolean mo51479q(C22826c cVar) {
        return C26571h.C26574b.m34371b(this, cVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24646e(C24651h hVar, C25052d dVar, boolean z, int i, C8480h hVar2) {
        this(hVar, dVar, (i & 4) != 0 ? false : z);
    }
}
