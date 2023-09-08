package p175j0;

import d14.C58052j1;
import fy3.C32226l;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import p175j0.C60661k1;
import rx3.C13598b0;
import rx3.C90107a;

/* renamed from: j0.l1 */
public final class C60669l1 extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60661k1 f172811d;

    /* renamed from: e */
    public final /* synthetic */ Throwable f172812e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60669l1(C60661k1 k1Var, Throwable th) {
        super(1);
        this.f172811d = k1Var;
        this.f172812e = th;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        C60661k1 k1Var = this.f172811d;
        Object obj2 = k1Var.f172787d;
        Throwable th4 = this.f172812e;
        synchronized (obj2) {
            if (th4 == null) {
                th4 = null;
            } else if (th != null) {
                if (!(!(th instanceof CancellationException))) {
                    th = null;
                }
                if (th != null) {
                    C90107a.m112735a(th4, th);
                }
            }
            k1Var.f172789f = th4;
            ((C58052j1) k1Var.f172798o).setValue(C60661k1.C60664c.ShutDown);
        }
        return C13598b0.f38549a;
    }
}
