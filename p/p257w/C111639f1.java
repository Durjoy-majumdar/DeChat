package p257w;

import gy3.C87412m;
import p175j0.C60647d0;
import p257w.C111629c1;

/* renamed from: w.f1 */
public final class C111639f1 implements C60647d0 {

    /* renamed from: a */
    public final /* synthetic */ C111629c1 f334215a;

    /* renamed from: b */
    public final /* synthetic */ C111629c1.C111630a f334216b;

    public C111639f1(C111629c1 c1Var, C111629c1.C111630a aVar) {
        this.f334215a = c1Var;
        this.f334216b = aVar;
    }

    public void dispose() {
        C111629c1<S>.d<T, V> dVar;
        C111629c1 c1Var = this.f334215a;
        C111629c1.C111630a aVar = this.f334216b;
        c1Var.getClass();
        C87412m.m108594g(aVar, "deferredAnimation");
        C111629c1<S>.a<T, V>.a<T, V> aVar2 = aVar.f334191c;
        if (aVar2 != null && (dVar = aVar2.f334193d) != null) {
            c1Var.f334184h.remove((Object) dVar);
        }
    }
}
