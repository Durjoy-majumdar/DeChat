package zo1;

import a14.C53973z1;
import androidx.lifecycle.C0120a0;
import fy3.C32224a;
import java.util.concurrent.CancellationException;
import rx3.C13598b0;

/* renamed from: zo1.l0 */
public final class C66931l0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C32224a<C13598b0> f192309d;

    /* renamed from: e */
    public final /* synthetic */ C66925j0 f192310e;

    public C66931l0(C32224a<C13598b0> aVar, C66925j0 j0Var) {
        this.f192309d = aVar;
        this.f192310e = j0Var;
    }

    public void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        this.f192309d.invoke();
        C53973z1 z1Var = this.f192310e.f192302s;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }
}
