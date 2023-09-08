package wo1;

import android.content.Context;
import fj1.C45795b;
import fy3.C32224a;
import gr1.C59673q2;
import gy3.C87412m;
import gy3.C87413o;
import mr1.C61575s;
import mr1.C61576t;
import o40.C61926c;
import qt1.C12931a;
import rx3.C13598b0;
import te3.C64689rq2;

/* renamed from: wo1.d */
public final class C66146d implements C66162t {

    /* renamed from: a */
    public final Context f190129a;

    /* renamed from: b */
    public final C45795b f190130b;

    /* renamed from: c */
    public final C66154f f190131c;

    /* renamed from: wo1.d$a */
    public static final class C66147a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66146d f190132d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66147a(C66146d dVar) {
            super(0);
            this.f190132d = dVar;
        }

        public Object invoke() {
            C66154f fVar = this.f190132d.f190131c;
            if (fVar != null) {
                fVar.pause();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wo1.d$b */
    public static final class C66148b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66146d f190133d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66148b(C66146d dVar) {
            super(0);
            this.f190133d = dVar;
        }

        public Object invoke() {
            C66154f fVar = this.f190133d.f190131c;
            if (fVar != null) {
                fVar.resume();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wo1.d$c */
    public static final class C66149c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66146d f190134d;

        /* renamed from: e */
        public final /* synthetic */ int f190135e;

        /* renamed from: f */
        public final /* synthetic */ int f190136f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66149c(C66146d dVar, int i, int i2) {
            super(0);
            this.f190134d = dVar;
            this.f190135e = i;
            this.f190136f = i2;
        }

        public Object invoke() {
            C66154f fVar = this.f190134d.f190131c;
            if (fVar != null) {
                fVar.mo90197d(((long) this.f190135e) * 1000, ((long) this.f190136f) * 1000);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wo1.d$d */
    public static final class C66150d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66146d f190137d;

        /* renamed from: e */
        public final /* synthetic */ float f190138e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66150d(C66146d dVar, float f) {
            super(0);
            this.f190137d = dVar;
            this.f190138e = f;
        }

        public Object invoke() {
            C66146d dVar = this.f190137d;
            C66154f fVar = dVar.f190131c;
            if (fVar != null) {
                fVar.mo90196c(this.f190138e, dVar.f190129a.getResources().getConfiguration().orientation == 2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wo1.d$e */
    public static final class C66151e extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66146d f190139d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66151e(C66146d dVar) {
            super(0);
            this.f190139d = dVar;
        }

        public Object invoke() {
            C66154f fVar = this.f190139d.f190131c;
            if (fVar != null) {
                fVar.stop();
            }
            C61926c.m72666K(200, new C66153e(this.f190139d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: wo1.d$f */
    public static final class C66152f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C66146d f190140d;

        /* renamed from: e */
        public final /* synthetic */ int f190141e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66152f(C66146d dVar, int i) {
            super(0);
            this.f190140d = dVar;
            this.f190141e = i;
        }

        public Object invoke() {
            C66154f fVar = this.f190140d.f190131c;
            if (fVar != null) {
                fVar.seek(this.f190141e);
            }
            return C13598b0.f38549a;
        }
    }

    public C66146d(Context context, C45795b bVar, C66154f fVar) {
        C87412m.m108594g(context, "context");
        C87412m.m108594g(bVar, "buContext");
        this.f190129a = context;
        this.f190130b = bVar;
        this.f190131c = fVar;
    }

    /* renamed from: a */
    public void mo90212a(int i) {
        C61926c.m72668M(new C66152f(this, i));
    }

    /* renamed from: b */
    public void mo78295b(float f) {
        C61926c.m72668M(new C66150d(this, f));
    }

    /* renamed from: c */
    public void mo78294c(C64689rq2 rq22, int i, int i2) {
        C61926c.m72668M(new C66149c(this, i, i2));
    }

    /* renamed from: d */
    public void mo78296d(C64689rq2 rq22, long j, long j2) {
    }

    /* renamed from: e */
    public void mo77475e(C64689rq2 rq22) {
        C61926c.m72668M(new C66148b(this));
    }

    /* renamed from: f */
    public void mo78297f(C64689rq2 rq22, long j, C12931a aVar) {
    }

    /* renamed from: g */
    public void mo78298g(C64689rq2 rq22, C59673q2 q2Var, int i) {
    }

    /* renamed from: h */
    public void mo78299h(C64689rq2 rq22) {
        C61926c.m72668M(new C66151e(this));
    }

    /* renamed from: i */
    public void mo78300i(C64689rq2 rq22, C61576t tVar) {
    }

    /* renamed from: j */
    public void mo78301j(C64689rq2 rq22, C61575s sVar) {
        C61926c.m72668M(new C66147a(this));
    }

    /* renamed from: k */
    public void mo78302k(C64689rq2 rq22) {
    }

    /* renamed from: l */
    public void mo78303l(C64689rq2 rq22, C59673q2 q2Var, int i) {
    }

    /* renamed from: m */
    public void mo78304m(C64689rq2 rq22, long j) {
    }

    /* renamed from: n */
    public void mo78305n(C64689rq2 rq22, C59673q2 q2Var, int i) {
    }

    /* renamed from: o */
    public void mo78306o(C59673q2 q2Var, C61575s sVar) {
    }
}
