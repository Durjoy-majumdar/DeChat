package mf1;

import android.view.View;
import df1.C58259c;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import pf1.C11920q;
import rf1.C12982a;
import rx3.C13598b0;

/* renamed from: mf1.w0 */
public final class C10878w0 extends C87413o implements C32226l<C12982a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60905o f32477d;

    /* renamed from: e */
    public final /* synthetic */ C58259c.C58260a f32478e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10878w0(C60905o oVar, C58259c.C58260a aVar) {
        super(1);
        this.f32477d = oVar;
        this.f32478e = aVar;
    }

    public Object invoke(Object obj) {
        C12982a aVar = (C12982a) obj;
        C87412m.m108594g(aVar, "observer");
        C11920q qVar = aVar.f37015d;
        View view = aVar.f37012a;
        C60905o oVar = this.f32477d;
        C58259c.C58260a aVar2 = this.f32478e;
        if (!(qVar == null || view == null)) {
            aVar.mo11052o(oVar, view, qVar, aVar2);
        }
        return C13598b0.f38549a;
    }
}
