package hi1;

import cj1.C54795n5;
import cl1.C54963d0;
import cl1.C55001u;
import fy3.C32226l;
import gy3.C87413o;
import qj1.C62665c2;
import qj1.C63068w1;
import rx3.C13598b0;

/* renamed from: hi1.c */
public final class C59911c extends C87413o implements C32226l<Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C59912d f171007d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59911c(C59912d dVar) {
        super(1);
        this.f171007d = dVar;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        C63068w1 w1Var = this.f171007d.f171010j;
        Class cls = C55001u.class;
        Class cls2 = C54963d0.class;
        int i = (int) ((C54963d0) w1Var.mo87696x0(cls2)).f154048B.f144323d;
        long j = (long) (intValue == 2 ? i | 16 : i & -17);
        if (((C54963d0) w1Var.mo87696x0(cls2)).f154048B.f144323d != j) {
            ((C54963d0) w1Var.mo87696x0(cls2)).f154048B.f144323d = j;
        }
        w1Var.f178983G.mo88125F4(j);
        C54795n5 D0 = w1Var.mo14476D0();
        if (D0 != null) {
            D0.mo75728c0(((C55001u) w1Var.mo87696x0(cls)).f154420q.f182392d, ((C55001u) w1Var.mo87696x0(cls)).f154416j, j, ((C54963d0) w1Var.mo87696x0(cls2)).f154048B.f144325f, new C62665c2(w1Var));
        }
        w1Var.f178982F.mo3431p();
        return C13598b0.f38549a;
    }
}
