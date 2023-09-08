package h43;

import b43.C104031a;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d43.C106987a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p156gj.C107835h0;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: h43.l0 */
public final class C108097l0 extends C87413o implements C32226l<C108115u, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C108077f0 f323697d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108097l0(C108077f0 f0Var) {
        super(1);
        this.f323697d = f0Var;
    }

    public Object invoke(Object obj) {
        C108115u uVar = (C108115u) obj;
        C87412m.m108594g(uVar, LocaleUtil.ITALIAN);
        if (C107835h0.f322845b.f322806e == 0 || this.f323697d.f323641a) {
            C108077f0 f0Var = this.f323697d;
            C104031a aVar = f0Var.f323642b;
            boolean z = true;
            if (aVar != null && !((C106987a) aVar).f320236a) {
                z = false;
            }
            f0Var.mo158489d(uVar, z);
        }
        ((C119157j) C119157j.f356862d).mo183895z(new C108095k0(this.f323697d));
        C108077f0.m146404a(this.f323697d);
        return C13598b0.f38549a;
    }
}
