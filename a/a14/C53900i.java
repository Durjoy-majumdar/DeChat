package a14;

import java.util.concurrent.Future;
import rx3.C13598b0;

/* renamed from: a14.i */
public final class C53900i extends C53904j {

    /* renamed from: d */
    public final Future<?> f151152d;

    public C53900i(Future<?> future) {
        this.f151152d = future;
    }

    /* renamed from: a */
    public void mo74490a(Throwable th) {
        if (th != null) {
            this.f151152d.cancel(false);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74490a((Throwable) obj);
        return C13598b0.f38549a;
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f151152d + ']';
    }
}
