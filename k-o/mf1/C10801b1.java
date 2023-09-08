package mf1;

import android.view.View;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import pf1.C11917o0;
import pf1.C11920q;
import rf1.C12982a;
import rx3.C13598b0;

/* renamed from: mf1.b1 */
public final class C10801b1 extends C87413o implements C32226l<C12982a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ String f32285d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10801b1(String str) {
        super(1);
        this.f32285d = str;
    }

    public Object invoke(Object obj) {
        C12982a aVar = (C12982a) obj;
        C87412m.m108594g(aVar, "observer");
        C11920q qVar = aVar.f37015d;
        View view = aVar.f37012a;
        String str = this.f32285d;
        if (!(qVar == null || view == null)) {
            C87412m.m108594g(str, "activityName");
            C11917o0 o0Var = aVar.f37020i;
            if (o0Var != null) {
                o0Var.mo11771g(str, qVar, view);
            }
        }
        return C13598b0.f38549a;
    }
}
