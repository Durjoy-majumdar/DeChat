package b14;

import fy3.C32226l;
import gy3.C87413o;
import rx3.C13598b0;

public final class a$$c extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54392a f152599d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f152600e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a$$c(C54392a aVar, Runnable runnable) {
        super(1);
        this.f152599d = aVar;
        this.f152600e = runnable;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.f152599d.f152591e.removeCallbacks(this.f152600e);
        return C13598b0.f38549a;
    }
}
