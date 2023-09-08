package il1;

import bl3.C39818r;
import dd3.C58256b;
import di3.C86312j;
import fe1.C8014g;
import fy3.C32224a;
import gy3.C87413o;
import ht1.C60200t1;
import rx3.C13598b0;
import rx3.C13604l;
import te3.C64234an2;
import zt3.C119157j;

/* renamed from: il1.z5 */
public final class C60566z5 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60349b6 f172641d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60566z5(C60349b6 b6Var) {
        super(0);
        this.f172641d = b6Var;
    }

    public Object invoke() {
        Class cls = C8014g.class;
        Class<C60200t1> cls2 = C60200t1.class;
        if (!this.f172641d.f172014d.getIntent().getBooleanExtra("saveLocation", false)) {
            C39818r rVar = C39818r.f106831a;
            if (((C8014g) rVar.mo62446e(cls2).mo62447c(cls)).mo9103H()) {
                C13604l<Float, Float> X0 = ((C8014g) rVar.mo62446e(cls2).mo62447c(cls)).mo9104X0();
                C64234an2 an22 = new C64234an2();
                an22.f182094d = ((Number) X0.f38555d).floatValue();
                an22.f182095e = ((Number) X0.f38556e).floatValue();
                an22.f182099i = 0;
                an22.f182096f = 1;
                ((C58256b) C86312j.m106911c(C58256b.class)).L00(6, an22, false, this.f172641d);
                ((C119157j) C119157j.f356862d).mo183895z(new C60554y5(this.f172641d));
            }
        }
        return C13598b0.f38549a;
    }
}
