package p748xd;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p416qd.C89598h;

/* renamed from: xd.f */
public class C91174f implements Runnable {

    /* renamed from: d */
    public final FutureTask<?> f261412d;

    public C91174f(Runnable runnable) {
        this.f261412d = new FutureTask<>(runnable, 0);
    }

    /* renamed from: a */
    public boolean mo125235a(long j) {
        try {
            this.f261412d.get(j, TimeUnit.MILLISECONDS);
            return true;
        } catch (InterruptedException e) {
            C89598h.m112046c("MagicBrush.SyncTask", e, "await failed", new Object[0]);
            return false;
        } catch (ExecutionException e2) {
            C89598h.m112046c("MagicBrush.SyncTask", e2, "execute failed", new Object[0]);
            return false;
        } catch (TimeoutException e3) {
            C89598h.m112046c("MagicBrush.SyncTask", e3, "execute timeout", new Object[0]);
            return false;
        }
    }

    /* renamed from: b */
    public <T> T mo125236b() {
        try {
            return this.f261412d.get();
        } catch (InterruptedException e) {
            C89598h.m112046c("MagicBrush.SyncTask", e, "await failed", new Object[0]);
            return null;
        } catch (ExecutionException e2) {
            C89598h.m112046c("MagicBrush.SyncTask", e2, "execute failed", new Object[0]);
            return null;
        }
    }

    public void run() {
        this.f261412d.run();
    }

    public <T> C91174f(Callable<T> callable) {
        this.f261412d = new FutureTask<>(callable);
    }
}
