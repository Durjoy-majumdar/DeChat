package lu3;

import e20.C97587e;
import java.util.concurrent.Future;

/* renamed from: lu3.b */
public abstract class C88654b implements Runnable, C117478d, C88655f, C109426i {

    /* renamed from: d */
    public Future f255969d;

    /* renamed from: a */
    public boolean mo97819a() {
        Future future = this.f255969d;
        if (future == null || future.isDone()) {
            return false;
        }
        return this.f255969d.cancel(false);
    }

    /* renamed from: b */
    public boolean mo123097b(boolean z) {
        Future future = this.f255969d;
        if (future == null || future.isDone()) {
            return false;
        }
        return this.f255969d.cancel(z);
    }

    /* renamed from: g */
    public void mo121152g(Future future) {
        this.f255969d = future;
    }

    public boolean isLogging() {
        return !(this instanceof C97587e);
    }
}
