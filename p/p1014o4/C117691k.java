package p1014o4;

import fy3.C32226l;
import gy3.C87413o;
import java.util.concurrent.CancellationException;
import p283z4.C119060c;
import rx3.C13598b0;

/* renamed from: o4.k */
public final class C117691k extends C87413o implements C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C117692l<Object> f352012d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117691k(C117692l<Object> lVar) {
        super(1);
        this.f352012d = lVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th == null) {
            if (!this.f352012d.f352014e.isDone()) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (th instanceof CancellationException) {
            this.f352012d.f352014e.cancel(true);
        } else {
            C119060c<R> cVar = this.f352012d.f352014e;
            Throwable cause = th.getCause();
            if (cause != null) {
                th = cause;
            }
            cVar.mo183733j(th);
        }
        return C13598b0.f38549a;
    }
}
