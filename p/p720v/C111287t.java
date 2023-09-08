package p720v;

import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import p175j0.C108504h;
import p257w.C111629c1;
import p257w.C37892b0;
import p257w.C37944w0;

/* renamed from: v.t */
public final class C111287t extends C87413o implements C32228q<C111629c1.C111632b<C111277n>, C108504h, Integer, C37892b0<Float>> {

    /* renamed from: d */
    public final /* synthetic */ C111292y f333205d;

    /* renamed from: e */
    public final /* synthetic */ C111239a0 f333206e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111287t(C111292y yVar, C111239a0 a0Var) {
        super(3);
        this.f333205d = yVar;
        this.f333206e = a0Var;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        C37944w0<Float> w0Var;
        C111629c1.C111632b bVar = (C111629c1.C111632b) obj;
        C108504h hVar = (C108504h) obj2;
        ((Number) obj3).intValue();
        C87412m.m108594g(bVar, "$this$animateFloat");
        hVar.mo51557H(-53984035);
        C111277n nVar = C111277n.PreEnter;
        C111277n nVar2 = C111277n.Visible;
        if (bVar.mo163307a(nVar, nVar2)) {
            this.f333205d.mo163000a().getClass();
            w0Var = C111278o.f333189c;
        } else if (bVar.mo163307a(nVar2, C111277n.PostExit)) {
            this.f333206e.mo162991a().getClass();
            w0Var = C111278o.f333189c;
        } else {
            w0Var = C111278o.f333189c;
        }
        hVar.mo51565P();
        return w0Var;
    }
}
