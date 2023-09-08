package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.Logger;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p1167z8.C112608f;

abstract class ImmediateFuture<V> implements C112608f<V> {
    private static final String TAG = "ImmediateFuture";

    public static class ImmediateFailedFuture<V> extends ImmediateFuture<V> {
        private final Throwable mCause;

        public ImmediateFailedFuture(Throwable th) {
            this.mCause = th;
        }

        public V get() {
            throw new ExecutionException(this.mCause);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.mCause + "]]";
        }
    }

    public static final class ImmediateFailedScheduledFuture<V> extends ImmediateFailedFuture<V> implements ScheduledFuture<V> {
        public ImmediateFailedScheduledFuture(Throwable th) {
            super(th);
        }

        public int compareTo(Delayed delayed) {
            return -1;
        }

        public long getDelay(TimeUnit timeUnit) {
            return 0;
        }
    }

    public static final class ImmediateSuccessfulFuture<V> extends ImmediateFuture<V> {
        public static final ImmediateFuture<Object> NULL_FUTURE = new ImmediateSuccessfulFuture((Object) null);
        private final V mValue;

        public ImmediateSuccessfulFuture(V v) {
            this.mValue = v;
        }

        public V get() {
            return this.mValue;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.mValue + "]]";
        }
    }

    public static <V> C112608f<V> nullFuture() {
        return ImmediateSuccessfulFuture.NULL_FUTURE;
    }

    public void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger.m15474e(TAG, "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    public boolean cancel(boolean z) {
        return false;
    }

    public abstract V get();

    public V get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return true;
    }
}
