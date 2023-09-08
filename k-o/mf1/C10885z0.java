package mf1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C60905o;
import pf1.C11920q;
import rf1.C12982a;
import rf1.C12992d;
import rx3.C13598b0;

/* renamed from: mf1.z0 */
public final class C10885z0 extends C87413o implements C32226l<C12982a, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C10846o0 f32495d;

    /* renamed from: e */
    public final /* synthetic */ C60905o f32496e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10885z0(C10846o0 o0Var, C60905o oVar) {
        super(1);
        this.f32495d = o0Var;
        this.f32496e = oVar;
    }

    public Object invoke(Object obj) {
        C12982a aVar = (C12982a) obj;
        C87412m.m108594g(aVar, "observer");
        C11920q qVar = aVar.f37015d;
        View view = aVar.f37012a;
        C10846o0 o0Var = this.f32495d;
        C60905o oVar = this.f32496e;
        if (!(qVar == null || view == null)) {
            if (qVar.f34845s) {
                C10817f1 f1Var = qVar.f34823A;
                boolean z = true;
                if (f1Var == null || !f1Var.f32317a) {
                    z = false;
                }
                if (!z) {
                    Log.m105924i("Finder.BaseAdFeedJumperUIC", "onVideoFinish show and remove delay appear message");
                    qVar.f34846t = false;
                    o0Var.f32391e.removeCallbacksAndMessages(qVar.f34829c);
                    C12992d.C12993a.m12459b(aVar, oVar, view, qVar, true, (C32224a) null, 16, (Object) null);
                }
            }
            aVar.mo11082q(oVar, view, qVar);
        }
        return C13598b0.f38549a;
    }
}
