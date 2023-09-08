package ve1;

import android.content.Context;
import android.widget.FrameLayout;
import cm1.C55034v;
import df1.C7322a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import jq3.C60905o;
import rs1.C13442s8;
import rx3.C13598b0;
import ur1.C65468g;

/* renamed from: ve1.b0 */
public final class C14464b0 extends C87413o implements C32226l<Boolean, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C55034v f40104d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f40105e;

    /* renamed from: f */
    public final /* synthetic */ C14680x f40106f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14464b0(C55034v vVar, C60905o oVar, C14680x xVar) {
        super(1);
        this.f40104d = vVar;
        this.f40105e = oVar;
        this.f40106f = xVar;
    }

    public Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.f40104d.f154509x = booleanValue;
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        Context context = this.f40105e.f173499A;
        C87412m.m108593f(context, "holder.context");
        C13442s8 f = aVar.mo12873f(context);
        if (f != null) {
            C14680x xVar = this.f40106f;
            C55034v vVar = this.f40104d;
            if (!booleanValue) {
                C65468g gVar = xVar.f40601e.f158622n;
                FrameLayout m = gVar != null ? gVar.mo89588m() : null;
                if (m != null) {
                    m.setVisibility(8);
                }
                C7322a b = C60172g4.C60173a.m70190b(f, 0, 1, (Object) null);
                if (b != null) {
                    b.mo8766a(new C7322a.C7323a(5, vVar.f154508w.field_id));
                }
            } else {
                C65468g gVar2 = xVar.f40601e.f158622n;
                FrameLayout m2 = gVar2 != null ? gVar2.mo89588m() : null;
                if (m2 != null) {
                    m2.setVisibility(0);
                }
                C7322a b2 = C60172g4.C60173a.m70190b(f, 0, 1, (Object) null);
                if (b2 != null) {
                    b2.mo8766a(new C7322a.C7323a(13, vVar.f154508w.field_id));
                }
            }
        }
        return C13598b0.f38549a;
    }
}
