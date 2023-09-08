package androidx.camera.core.impl.utils.executor;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p1167z8.C112608f;
import p202m2.C117512b;
import p202m2.C117518e;

final class HandlerScheduledExecutorService extends AbstractExecutorService implements ScheduledExecutorService {
    private static ThreadLocal<ScheduledExecutorService> sThreadLocalInstance = new ThreadLocal<ScheduledExecutorService>() {
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return CameraXExecutors.mainThreadExecutor();
            }
            if (Looper.myLooper() != null) {
                return new HandlerScheduledExecutorService(new Handler(Looper.myLooper()));
            }
            return null;
        }
    };
    private final Handler mHandler;

    public static class HandlerScheduledFuture<V> implements RunnableScheduledFuture<V> {
        public final AtomicReference<C117512b.C117513a<V>> mCompleter = new AtomicReference<>((Object) null);
        private final C112608f<V> mDelegate;
        private final long mRunAtMillis;
        private final Callable<V> mTask;

        public HandlerScheduledFuture(final Handler handler, long j, final Callable<V> callable) {
            this.mRunAtMillis = j;
            this.mTask = callable;
            this.mDelegate = C117512b.m165760a(new C117512b.C117515c<V>() {
                public Object attachCompleter(C117512b.C117513a<V> aVar) {
                    C1128611 r0 = new Runnable() {
                        public void run() {
                            if (HandlerScheduledFuture.this.mCompleter.getAndSet((Object) null) != null) {
                                C1128601 r0 = C1128601.this;
                                handler.removeCallbacks(HandlerScheduledFuture.this);
                            }
                        }
                    };
                    Executor directExecutor = CameraXExecutors.directExecutor();
                    C117518e<Void> eVar = aVar.f351636c;
                    if (eVar != null) {
                        eVar.addListener(r0, directExecutor);
                    }
                    HandlerScheduledFuture.this.mCompleter.set(aVar);
                    return "HandlerScheduledFuture-" + callable.toString();
                }
            });
        }

        public boolean cancel(boolean z) {
            return this.mDelegate.cancel(z);
        }

        public V get() {
            return this.mDelegate.get();
        }

        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.mRunAtMillis - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public boolean isCancelled() {
            return this.mDelegate.isCancelled();
        }

        public boolean isDone() {
            return this.mDelegate.isDone();
        }

        public boolean isPeriodic() {
            return false;
        }

        public void run() {
            C117512b.C117513a andSet = this.mCompleter.getAndSet((Object) null);
            if (andSet != null) {
                try {
                    andSet.mo182231a(this.mTask.call());
                } catch (Exception e) {
                    andSet.mo182232b(e);
                }
            }
        }

        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        public V get(long j, TimeUnit timeUnit) {
            return this.mDelegate.get(j, timeUnit);
        }
    }

    public HandlerScheduledExecutorService(Handler handler) {
        this.mHandler = handler;
    }

    private RejectedExecutionException createPostFailedException() {
        return new RejectedExecutionException(this.mHandler + " is shutting down");
    }

    public static ScheduledExecutorService currentThreadExecutor() {
        ScheduledExecutorService scheduledExecutorService = sThreadLocalInstance.get();
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            HandlerScheduledExecutorService handlerScheduledExecutorService = new HandlerScheduledExecutorService(new Handler(myLooper));
            sThreadLocalInstance.set(handlerScheduledExecutorService);
            return handlerScheduledExecutorService;
        }
        throw new IllegalStateException("Current thread has no looper!");
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        Class<HandlerScheduledExecutorService> cls = HandlerScheduledExecutorService.class;
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    public void execute(Runnable runnable) {
        if (!this.mHandler.post(runnable)) {
            throw createPostFailedException();
        }
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public ScheduledFuture<?> schedule(final Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new Callable<Void>() {
            public Void call() {
                runnable.run();
                return null;
            }
        }, j, timeUnit);
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Class<HandlerScheduledExecutorService> cls = HandlerScheduledExecutorService.class;
        throw new UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-rate scheduling.");
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Class<HandlerScheduledExecutorService> cls = HandlerScheduledExecutorService.class;
        throw new UnsupportedOperationException("HandlerScheduledExecutorService does not yet support fixed-delay scheduling.");
    }

    public void shutdown() {
        Class<HandlerScheduledExecutorService> cls = HandlerScheduledExecutorService.class;
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    public List<Runnable> shutdownNow() {
        Class<HandlerScheduledExecutorService> cls = HandlerScheduledExecutorService.class;
        throw new UnsupportedOperationException("HandlerScheduledExecutorService cannot be shut down. Use Looper.quitSafely().");
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
        HandlerScheduledFuture handlerScheduledFuture = new HandlerScheduledFuture(this.mHandler, uptimeMillis, callable);
        if (this.mHandler.postAtTime(handlerScheduledFuture, uptimeMillis)) {
            return handlerScheduledFuture;
        }
        return Futures.immediateFailedScheduledFuture(createPostFailedException());
    }
}
