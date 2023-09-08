package xq1;

import gy3.C87412m;
import java.util.Iterator;
import java.util.Vector;
import u60.C65220d;
import u60.C65222f;
import u60.C65231j;
import u60.C65234n;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;
import xq1.C66406d;

/* renamed from: xq1.b */
public final class C66403b {

    /* renamed from: a */
    public final C65222f<C66406d.C66407a> f191148a;

    /* renamed from: b */
    public final C65231j<C66406d.C66407a> f191149b;

    /* renamed from: c */
    public final Vector<C66408e> f191150c = new Vector<>();

    /* renamed from: xq1.b$a */
    public static final class C66404a implements C65231j<C66406d.C66407a> {

        /* renamed from: a */
        public final /* synthetic */ C66403b f191151a;

        public C66404a(C66403b bVar) {
            this.f191151a = bVar;
        }

        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C66406d.C66407a aVar = (C66406d.C66407a) dVar;
            C87412m.m108594g(aVar, "task");
            C87412m.m108594g(nVar, "status");
            this.f191151a.f191150c.remove(aVar.f191153f);
        }
    }

    public C66403b(String str, int i) {
        C87412m.m108594g(str, "id");
        C65222f<C66406d.C66407a> fVar = new C65222f<>(new C102156f(new C102152a(100, Integer.MAX_VALUE), new C102157g(i, 5), i, str));
        this.f191148a = fVar;
        C66404a aVar = new C66404a(this);
        this.f191149b = aVar;
        fVar.mo89353f(aVar);
    }

    /* renamed from: a */
    public final void mo90503a(C66406d.C66407a aVar) {
        C87412m.m108594g(aVar, "pipelineTask");
        Iterator<C66408e> it = this.f191150c.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (C87412m.m108589b(it.next().mo90502b(), aVar.f191153f.mo90502b())) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            this.f191150c.add(aVar.f191153f);
        }
        this.f191148a.mo89348b(aVar);
    }
}
