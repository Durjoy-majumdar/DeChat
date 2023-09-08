package p869y0;

import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p1140p1.C110097c;
import p1140p1.C110100f;
import p658q1.C110282c0;
import p658q1.C110292f0;
import p658q1.C110311s;
import rx3.C13598b0;

/* renamed from: y0.u */
public final class C112335u {

    /* renamed from: a */
    public static final C110100f<C112338v> f336362a = C110097c.m149686a(C112336a.f336363d);

    /* renamed from: y0.u$a */
    public static final class C112336a extends C87413o implements C32224a<C112338v> {

        /* renamed from: d */
        public static final C112336a f336363d = new C112336a();

        public C112336a() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* renamed from: y0.u$b */
    public static final class C112337b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112321l f336364d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112337b(C112321l lVar) {
            super(0);
            this.f336364d = lVar;
        }

        public Object invoke() {
            C112321l lVar = this.f336364d;
            C112338v vVar = lVar.f336338o;
            if (vVar != null) {
                vVar.mo164062b(lVar.f336339p);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final void m153257a(C112321l lVar) {
        C110292f0 snapshotObserver;
        C87412m.m108594g(lVar, "<this>");
        C110311s sVar = lVar.f336341r;
        if (sVar != null) {
            C112333s sVar2 = lVar.f336339p;
            C87412m.m108594g(sVar2, "<this>");
            C112334t tVar = (C112334t) sVar2;
            tVar.mo164052a(true);
            C112339w wVar = C112339w.f336368b;
            tVar.mo164057f(wVar);
            tVar.mo164058g(wVar);
            tVar.mo164061j(wVar);
            tVar.mo164054c(wVar);
            tVar.mo164056e(wVar);
            tVar.mo164059h(wVar);
            tVar.mo164060i(wVar);
            tVar.mo164055d(wVar);
            C110282c0 c0Var = sVar.f329972h.f329918j;
            if (!(c0Var == null || (snapshotObserver = c0Var.getSnapshotObserver()) == null)) {
                C32226l<C112321l, C13598b0> lVar2 = C112321l.f336330v;
                snapshotObserver.mo161693a(lVar, C112321l.f336330v, new C112337b(lVar));
            }
            C112333s sVar3 = lVar.f336339p;
            C87412m.m108594g(sVar3, "properties");
            if (((C112334t) sVar3).mo164053b()) {
                C112308c0.m153187a(lVar);
            } else {
                C112308c0.m153190d(lVar);
            }
        }
    }
}
