package h43;

import b43.C104031a;
import d43.C106987a;
import p156gj.C107835h0;

/* renamed from: h43.p0 */
public final class C108105p0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C108077f0 f323710d;

    public C108105p0(C108077f0 f0Var) {
        this.f323710d = f0Var;
    }

    public final void run() {
        C108115u uVar;
        if (C107835h0.f322845b.f322806e == 0 || this.f323710d.f323641a) {
            C108077f0 f0Var = this.f323710d;
            C104031a aVar = f0Var.f323642b;
            boolean z = true;
            if (aVar != null) {
                if (!(aVar != null ? ((C106987a) aVar).f320236a : true)) {
                    z = false;
                }
            }
            C108126x0 x0Var = f0Var.f323646f;
            if (x0Var != null && (uVar = x0Var.f323774a) != null) {
                f0Var.mo158489d(uVar, z);
            }
        }
    }
}
