package p860p3;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: p3.c */
public abstract class C117914c<Params, Progress, Result> {

    /* renamed from: i */
    public static final Executor f352437i;

    /* renamed from: j */
    public static C117918e f352438j;

    /* renamed from: d */
    public final C117920g<Params, Result> f352439d;

    /* renamed from: e */
    public final FutureTask<Result> f352440e;

    /* renamed from: f */
    public volatile C117919f f352441f = C117919f.PENDING;

    /* renamed from: g */
    public final AtomicBoolean f352442g = new AtomicBoolean();

    /* renamed from: h */
    public final AtomicBoolean f352443h = new AtomicBoolean();

    /* renamed from: p3.c$a */
    public static class C62191a implements ThreadFactory {

        /* renamed from: d */
        public final AtomicInteger f176815d = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.f176815d.getAndIncrement());
        }
    }

    /* renamed from: p3.c$b */
    public class C117915b extends C117920g<Params, Result> {
        public C117915b() {
        }

        public Result call() {
            C117914c.this.f352443h.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = C117914c.this.mo182668a(this.f352452d);
                Binder.flushPendingCommands();
                C117914c.this.mo182699d(result);
                return result;
            } catch (Throwable th) {
                C117914c.this.mo182699d(result);
                throw th;
            }
        }
    }

    /* renamed from: p3.c$c */
    public class C117916c extends FutureTask<Result> {
        public C117916c(Callable callable) {
            super(callable);
        }

        public void done() {
            try {
                Object obj = get();
                C117914c cVar = C117914c.this;
                if (!cVar.f352443h.get()) {
                    cVar.mo182699d(obj);
                }
            } catch (InterruptedException unused) {
            } catch (ExecutionException e) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
            } catch (CancellationException unused2) {
                C117914c cVar2 = C117914c.this;
                if (!cVar2.f352443h.get()) {
                    cVar2.mo182699d(null);
                }
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* renamed from: p3.c$d */
    public static class C117917d<Data> {

        /* renamed from: a */
        public final C117914c f352446a;

        /* renamed from: b */
        public final Data[] f352447b;

        public C117917d(C117914c cVar, Data... dataArr) {
            this.f352446a = cVar;
            this.f352447b = dataArr;
        }
    }

    /* renamed from: p3.c$e */
    public static class C117918e extends Handler {
        public C117918e() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message message) {
            C117917d dVar = (C117917d) message.obj;
            int i = message.what;
            if (i == 1) {
                C117914c cVar = dVar.f352446a;
                Data data = dVar.f352447b[0];
                if (cVar.f352442g.get()) {
                    cVar.mo182669b(data);
                } else {
                    cVar.mo182670c(data);
                }
                cVar.f352441f = C117919f.FINISHED;
            } else if (i == 2) {
                dVar.f352446a.getClass();
            }
        }
    }

    /* renamed from: p3.c$f */
    public enum C117919f {
        PENDING,
        RUNNING,
        FINISHED
    }

    /* renamed from: p3.c$g */
    public static abstract class C117920g<Params, Result> implements Callable<Result> {

        /* renamed from: d */
        public Params[] f352452d;
    }

    static {
        C62191a aVar = new C62191a();
        f352437i = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(10), aVar);
    }

    public C117914c() {
        C117915b bVar = new C117915b();
        this.f352439d = bVar;
        this.f352440e = new C117916c(bVar);
    }

    /* renamed from: a */
    public abstract Result mo182668a(Params... paramsArr);

    /* renamed from: b */
    public void mo182669b(Result result) {
    }

    /* renamed from: c */
    public void mo182670c(Result result) {
    }

    /* renamed from: d */
    public Result mo182699d(Result result) {
        C117918e eVar;
        synchronized (C117914c.class) {
            if (f352438j == null) {
                f352438j = new C117918e();
            }
            eVar = f352438j;
        }
        eVar.obtainMessage(1, new C117917d(this, result)).sendToTarget();
        return result;
    }
}
