package zh3;

import java.util.concurrent.Callable;

public final /* synthetic */ class e$$a implements Callable {

    /* renamed from: d */
    public final /* synthetic */ Throwable f337294d;

    public /* synthetic */ e$$a(Throwable th) {
        this.f337294d = th;
    }

    public final Object call() {
        Throwable th = this.f337294d;
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        throw new RuntimeException(th);
    }
}
