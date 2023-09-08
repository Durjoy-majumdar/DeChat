package h43;

import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: h43.s0 */
public final class C108112s0 extends C87413o implements C32226l<C108115u, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108126x0 f323733d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<C108115u, C13598b0> f323734e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108112s0(C108126x0 x0Var, C32226l<? super C108115u, C13598b0> lVar) {
        super(1);
        this.f323733d = x0Var;
        this.f323734e = lVar;
    }

    public Object invoke(Object obj) {
        C108115u uVar = (C108115u) obj;
        C87412m.m108594g(uVar, LocaleUtil.ITALIAN);
        C108126x0 x0Var = this.f323733d;
        C108128y0 y0Var = x0Var.f323775b;
        if (y0Var != null) {
            C108073f.m146393c(y0Var, (C32226l) null, uVar, true, 1, (Object) null);
        }
        C108128y0 y0Var2 = x0Var.f323775b;
        if (y0Var2 != null) {
            y0Var2.mo158486i();
        }
        C108126x0 x0Var2 = this.f323733d;
        C108117v vVar = x0Var2.f323776c;
        if (vVar != null) {
            vVar.mo158463b(C108116u0.f323755d, (C108115u) null, false);
        }
        C108117v vVar2 = x0Var2.f323776c;
        if (vVar2 != null) {
            vVar2.mo158486i();
        }
        C108126x0 x0Var3 = this.f323733d;
        C108061b bVar = x0Var3.f323777d;
        if (bVar != null) {
            C108073f.m146393c(bVar, (C32226l) null, uVar, true, 1, (Object) null);
        }
        C108061b bVar2 = x0Var3.f323777d;
        if (bVar2 != null) {
            bVar2.mo158486i();
        }
        v2protocal.f317543d2 = new C108114t0(x0Var3);
        C32226l<C108115u, C13598b0> lVar = this.f323734e;
        if (lVar != null) {
            lVar.invoke(uVar);
        }
        return C13598b0.f38549a;
    }
}
