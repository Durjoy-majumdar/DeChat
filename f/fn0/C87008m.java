package fn0;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: fn0.m */
public class C87008m {

    /* renamed from: fn0.m$a */
    public static class C87009a<T> extends FutureTask<T> implements Comparable<C87009a<T>> {

        /* renamed from: d */
        public volatile long f252491d = 0;

        public C87009a(Runnable runnable, T t, long j) {
            super(runnable, t);
            this.f252491d = j;
        }

        public int compareTo(Object obj) {
            return Long.valueOf(this.f252491d).compareTo(Long.valueOf(((C87009a) obj).f252491d));
        }
    }

    /* renamed from: fn0.m$c */
    public static class C87011c extends ThreadPoolExecutor {
        public C87011c(int i) {
            super(i, i, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue());
        }

        public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return (RunnableFuture) runnable;
        }

        public <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
            return (RunnableFuture) callable;
        }
    }

    /* renamed from: a */
    public static Object m108034a(Callable<?> callable, int i, boolean z, String str, String str2) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future<T> submit = newSingleThreadExecutor.submit(callable);
        newSingleThreadExecutor.shutdown();
        String str3 = "job " + str + " ";
        try {
            return submit.get((long) i, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            if (z) {
                C87002g.m108023q(4, str2, str3 + "cancelled", (Throwable) null);
                submit.cancel(true);
            }
            return null;
        }
    }

    /* renamed from: b */
    public static Future<?> m108035b(Runnable runnable, String str) {
        C87010b bVar = new C87010b("job " + str + " ");
        Future<?> submit = bVar.submit(runnable);
        bVar.shutdown();
        return submit;
    }

    /* renamed from: fn0.m$b */
    public static class C87010b extends ThreadPoolExecutor {

        /* renamed from: d */
        public String f252492d;

        public C87010b(String str) {
            super(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
            this.f252492d = str;
        }

        public void afterExecute(Runnable runnable, Throwable th) {
            super.afterExecute(runnable, th);
            if (th == null && (runnable instanceof Future)) {
                try {
                    Future future = (Future) runnable;
                    if (future.isDone() && !future.isCancelled()) {
                        C87002g.m108023q(3, "ThreadUtils", "before future.get()", (Throwable) null);
                        future.get();
                        C87002g.m108023q(3, "ThreadUtils", "after future.get()", (Throwable) null);
                    }
                } catch (CancellationException e) {
                    th = e;
                    C87002g.m108023q(5, "ThreadUtils", "CancellationException", (Throwable) null);
                } catch (ExecutionException e2) {
                    C87002g.m108023q(5, "ThreadUtils", "ExecutionException", (Throwable) null);
                    th = e2.getCause();
                } catch (InterruptedException unused) {
                    C87002g.m108023q(5, "ThreadUtils", "InterruptedException", (Throwable) null);
                    Thread.currentThread().interrupt();
                }
            }
            if (th != null) {
                C87002g.m108023q(6, "ThreadUtils", this.f252492d + " error occurred during processing request:" + C87002g.m108014h(th, false), (Throwable) null);
            }
        }

        public void beforeExecute(Thread thread, Runnable runnable) {
            super.beforeExecute(thread, runnable);
            C87002g.m108023q(4, "ThreadUtils", "beforeExecute: thread=" + thread.toString() + " thread.state=" + thread.getState() + " runnable=" + runnable.toString(), (Throwable) null);
        }

        public <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
            return super.newTaskFor(runnable, t);
        }

        public C87010b(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue) {
            super(i, i2, j, timeUnit, blockingQueue);
            this.f252492d = "";
        }
    }
}
