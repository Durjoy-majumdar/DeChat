package h40;

import bp3.C79753e;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C31887k0;
import f40.C31892l0;
import f40.C86744o;
import g40.C87135g;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import nr3.C89055a;
import p261wl.C38166b;
import p261wl.C38174i;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: h40.c */
public class C87424c implements C87135g {

    /* renamed from: g */
    public static final C87424c f253334g = new C87424c();

    /* renamed from: d */
    public final C87426b f253335d = new C87426b((C87425a) null);

    /* renamed from: e */
    public volatile boolean f253336e = false;

    /* renamed from: f */
    public AtomicBoolean f253337f = new AtomicBoolean(false);

    /* renamed from: h40.c$b */
    public static class C87426b extends C89055a<C87135g> implements C87135g {

        /* renamed from: h40.c$b$a */
        public class C87427a implements C89055a.C89056a<C87135g> {

            /* renamed from: a */
            public final /* synthetic */ C86744o.C75680f f253338a;

            public C87427a(C87426b bVar, C86744o.C75680f fVar) {
                this.f253338a = fVar;
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((C87135g) obj).mo113297j(this.f253338a);
            }
        }

        /* renamed from: h40.c$b$b */
        public class C87428b implements C89055a.C89056a<C87135g> {
            public C87428b(C87426b bVar) {
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((C87135g) obj).mo113298l();
            }
        }

        public C87426b(C87425a aVar) {
        }

        /* renamed from: j */
        public void mo113297j(C86744o.C75680f fVar) {
            mo123416n(new C87427a(this, fVar));
        }

        /* renamed from: l */
        public void mo113298l() {
            mo123416n(new C87428b(this));
        }
    }

    /* renamed from: a */
    public void mo121845a() {
        C31887k0 k0Var = C31887k0.INSTANCE;
        MMApplicationContext.getContext();
        k0Var.getClass();
        ArrayList arrayList = new ArrayList();
        C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C31887k0.C31891d.class);
        C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
        while (bVar.hasNext()) {
            C119179t tVar = C119157j.f356862d;
            C31892l0 l0Var = new C31892l0(k0Var, (C38174i) bVar.next());
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            arrayList.add(jVar.mo183878i(l0Var, 0));
        }
        C79753e.m96889a(arrayList);
    }

    /* renamed from: j */
    public void mo113297j(C86744o.C75680f fVar) {
        this.f253335d.mo113297j(fVar);
    }

    /* renamed from: l */
    public void mo113298l() {
        this.f253335d.mo113298l();
    }
}
