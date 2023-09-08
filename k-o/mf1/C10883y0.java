package mf1;

import android.view.View;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import pf1.C11920q;
import rf1.C12982a;
import rf1.C12992d;
import rx3.C13598b0;

/* renamed from: mf1.y0 */
public final class C10883y0 extends C87413o implements C32226l<C12982a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C10846o0 f32493d;

    /* renamed from: e */
    public final /* synthetic */ int f32494e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10883y0(C10846o0 o0Var, int i) {
        super(1);
        this.f32493d = o0Var;
        this.f32494e = i;
    }

    public Object invoke(Object obj) {
        View view;
        C60905o oVar;
        C12982a aVar = (C12982a) obj;
        C87412m.m108594g(aVar, "observer");
        C10846o0 o0Var = this.f32493d;
        int i = this.f32494e;
        o0Var.getClass();
        C11920q qVar = aVar.f37015d;
        if (!(qVar == null || (view = aVar.f37012a) == null || (oVar = aVar.f37016e) == null)) {
            aVar.mo11053p(oVar, view, qVar, i);
            if (qVar.f34847u && !aVar.f37023l) {
                if (i < qVar.f34850x || i >= qVar.f34851y) {
                    if (view.getVisibility() == 0) {
                        C12982a aVar2 = qVar.f34828b;
                        if (i == qVar.f34851y) {
                            aVar.mo12507a(oVar, view, qVar, true, new C10881x0(aVar2, o0Var, oVar));
                        } else {
                            C12992d.C12993a.m12458a(aVar, oVar, view, qVar, false, (C32224a) null, 16, (Object) null);
                        }
                    }
                } else if (view.getVisibility() == 8) {
                    if (i != qVar.f34850x) {
                        C12992d.C12993a.m12459b(aVar, oVar, view, qVar, false, (C32224a) null, 16, (Object) null);
                        C32226l<? super C60905o, C13598b0> lVar = o0Var.f32397n;
                        if (lVar != null) {
                            lVar.invoke(oVar);
                        }
                    } else if (!qVar.f34849w) {
                        C12992d.C12993a.m12459b(aVar, oVar, view, qVar, true, (C32224a) null, 16, (Object) null);
                        C32226l<? super C60905o, C13598b0> lVar2 = o0Var.f32397n;
                        if (lVar2 != null) {
                            lVar2.invoke(oVar);
                        }
                    }
                }
            }
        }
        return C13598b0.f38549a;
    }
}
