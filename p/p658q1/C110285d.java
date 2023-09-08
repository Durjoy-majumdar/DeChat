package p658q1;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p436a1.C103262s;
import p560i2.C108322d;
import p560i2.C108329n;
import p560i2.C33183o;
import p631o1.C109827a0;
import p835c1.C104225a;
import p868x0.C111977b;
import p868x0.C111980f;
import p868x0.C111982h;
import rx3.C13598b0;

/* renamed from: q1.d */
public final class C110285d extends C110309q<C110285d, C111982h> implements C110289d0 {

    /* renamed from: o */
    public static final C32226l<C110285d, C13598b0> f329858o = C110286a.f329863d;

    /* renamed from: h */
    public C111980f f329859h;

    /* renamed from: i */
    public final C111977b f329860i;

    /* renamed from: j */
    public boolean f329861j;

    /* renamed from: n */
    public final C32224a<C13598b0> f329862n;

    /* renamed from: q1.d$a */
    public static final class C110286a extends C87413o implements C32226l<C110285d, C13598b0> {

        /* renamed from: d */
        public static final C110286a f329863d = new C110286a();

        public C110286a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C110285d dVar = (C110285d) obj;
            C87412m.m108594g(dVar, "drawEntity");
            if (dVar.isValid()) {
                dVar.f329861j = true;
                dVar.f329961d.mo161748P0();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: q1.d$b */
    public static final class C110287b implements C111977b {

        /* renamed from: a */
        public final C108322d f329864a;

        /* renamed from: b */
        public final /* synthetic */ C110285d f329865b;

        /* renamed from: c */
        public final /* synthetic */ C110311s f329866c;

        public C110287b(C110285d dVar, C110311s sVar) {
            this.f329865b = dVar;
            this.f329866c = sVar;
            this.f329864a = dVar.f329961d.f329972h.f329927v;
        }

        /* renamed from: e */
        public long mo161690e() {
            return C108329n.m146744b(this.f329866c.f328781f);
        }

        public C108322d getDensity() {
            return this.f329864a;
        }

        public C33183o getLayoutDirection() {
            return this.f329865b.f329961d.f329972h.f329929x;
        }
    }

    /* renamed from: q1.d$c */
    public static final class C110288c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C110285d f329867d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110288c(C110285d dVar) {
            super(0);
            this.f329867d = dVar;
        }

        public Object invoke() {
            C110285d dVar = this.f329867d;
            C111980f fVar = dVar.f329859h;
            if (fVar != null) {
                fVar.mo163643n0(dVar.f329860i);
            }
            this.f329867d.f329861j = false;
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110285d(C110311s sVar, C111982h hVar) {
        super(sVar, hVar);
        C87412m.m108594g(sVar, "layoutNodeWrapper");
        C87412m.m108594g(hVar, "modifier");
        C111982h hVar2 = (C111982h) this.f329962e;
        this.f329859h = hVar2 instanceof C111980f ? (C111980f) hVar2 : null;
        this.f329860i = new C110287b(this, sVar);
        this.f329861j = true;
        this.f329862n = new C110288c(this);
    }

    /* renamed from: a */
    public void mo161688a() {
        C111982h hVar = (C111982h) this.f329962e;
        this.f329859h = hVar instanceof C111980f ? (C111980f) hVar : null;
        this.f329861j = true;
        this.f329964g = true;
    }

    /* renamed from: c */
    public final void mo161689c(C103262s sVar) {
        C87412m.m108594g(sVar, "canvas");
        long b = C108329n.m146744b(this.f329961d.f328781f);
        if (this.f329859h != null && this.f329861j) {
            C110310r.m150081a(this.f329961d.f329972h).getSnapshotObserver().mo161693a(this, f329858o, this.f329862n);
        }
        C110301j jVar = this.f329961d.f329972h;
        jVar.getClass();
        C110308p sharedDrawScope = C110310r.m150081a(jVar).getSharedDrawScope();
        C110311s sVar2 = this.f329961d;
        C110285d dVar = sharedDrawScope.f329960e;
        sharedDrawScope.f329960e = this;
        C104225a aVar = sharedDrawScope.f329959d;
        C109827a0 H0 = sVar2.mo161696H0();
        C33183o layoutDirection = sVar2.mo161696H0().getLayoutDirection();
        C104225a.C104226a aVar2 = aVar.f308517d;
        C108322d dVar2 = aVar2.f308521a;
        C33183o oVar = aVar2.f308522b;
        C103262s sVar3 = aVar2.f308523c;
        long j = aVar2.f308524d;
        C87412m.m108594g(H0, "<set-?>");
        aVar2.f308521a = H0;
        C87412m.m108594g(layoutDirection, "<set-?>");
        aVar2.f308522b = layoutDirection;
        aVar2.f308523c = sVar;
        aVar2.f308524d = b;
        sVar.mo142944c();
        ((C111982h) this.f329962e).mo90316V(sharedDrawScope);
        sVar.mo142943b();
        C104225a.C104226a aVar3 = aVar.f308517d;
        aVar3.getClass();
        C87412m.m108594g(dVar2, "<set-?>");
        aVar3.f308521a = dVar2;
        C87412m.m108594g(oVar, "<set-?>");
        aVar3.f308522b = oVar;
        C87412m.m108594g(sVar3, "<set-?>");
        aVar3.f308523c = sVar3;
        aVar3.f308524d = j;
        sharedDrawScope.f329960e = dVar;
    }

    public boolean isValid() {
        return this.f329961d.mo161183y();
    }
}
