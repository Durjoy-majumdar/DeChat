package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.ImmediateFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import p1167z8.C112608f;
import p202m2.C117512b;
import p202m2.C117518e;
import p210o.C11323a;
import p329d3.C20434g;

public final class Futures {
    private static final C11323a<?, ?> IDENTITY_FUNCTION = new C11323a<Object, Object>() {
        public Object apply(Object obj) {
            return obj;
        }
    };

    public static final class CallbackListener<V> implements Runnable {
        public final FutureCallback<? super V> mCallback;
        public final Future<V> mFuture;

        public CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.mFuture = future;
            this.mCallback = futureCallback;
        }

        public void run() {
            try {
                this.mCallback.onSuccess(Futures.getDone(this.mFuture));
            } catch (ExecutionException e) {
                this.mCallback.onFailure(e.getCause());
            } catch (Error | RuntimeException e2) {
                this.mCallback.onFailure(e2);
            }
        }

        public String toString() {
            return CallbackListener.class.getSimpleName() + "," + this.mCallback;
        }
    }

    private Futures() {
    }

    public static <V> void addCallback(C112608f<V> fVar, FutureCallback<? super V> futureCallback, Executor executor) {
        futureCallback.getClass();
        fVar.addListener(new CallbackListener(fVar, futureCallback), executor);
    }

    public static <V> C112608f<List<V>> allAsList(Collection<? extends C112608f<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), true, CameraXExecutors.directExecutor());
    }

    public static <V> V getDone(Future<V> future) {
        boolean isDone = future.isDone();
        C20434g.m22021e(isDone, "Future was expected to be done, " + future);
        return getUninterruptibly(future);
    }

    public static <V> V getUninterruptibly(Future<V> future) {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    public static <V> C112608f<V> immediateFailedFuture(Throwable th) {
        return new ImmediateFuture.ImmediateFailedFuture(th);
    }

    public static <V> ScheduledFuture<V> immediateFailedScheduledFuture(Throwable th) {
        return new ImmediateFuture.ImmediateFailedScheduledFuture(th);
    }

    public static <V> C112608f<V> immediateFuture(V v) {
        return v == null ? ImmediateFuture.nullFuture() : new ImmediateFuture.ImmediateSuccessfulFuture(v);
    }

    public static <V> C112608f<V> nonCancellationPropagating(C112608f<V> fVar) {
        fVar.getClass();
        return fVar.isDone() ? fVar : C117512b.m165760a(new Futures$$a(fVar));
    }

    public static <V> void propagate(C112608f<V> fVar, C117512b.C117513a<V> aVar) {
        propagateTransform(fVar, IDENTITY_FUNCTION, aVar, CameraXExecutors.directExecutor());
    }

    /* access modifiers changed from: private */
    public static <I, O> void propagateTransform(boolean z, final C112608f<I> fVar, final C11323a<? super I, ? extends O> aVar, final C117512b.C117513a<O> aVar2, Executor executor) {
        fVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        executor.getClass();
        addCallback(fVar, new FutureCallback<I>() {
            public void onFailure(Throwable th) {
                C117512b.C117513a.this.mo182232b(th);
            }

            public void onSuccess(I i) {
                try {
                    C117512b.C117513a.this.mo182231a(aVar.apply(i));
                } catch (Throwable th) {
                    C117512b.C117513a.this.mo182232b(th);
                }
            }
        }, executor);
        if (z) {
            C165544 r1 = new Runnable() {
                public void run() {
                    C112608f.this.cancel(true);
                }
            };
            Executor directExecutor = CameraXExecutors.directExecutor();
            C117518e<Void> eVar = aVar2.f351636c;
            if (eVar != null) {
                eVar.addListener(r1, directExecutor);
            }
        }
    }

    public static <V> C112608f<List<V>> successfulAsList(Collection<? extends C112608f<? extends V>> collection) {
        return new ListFuture(new ArrayList(collection), false, CameraXExecutors.directExecutor());
    }

    public static <I, O> C112608f<O> transform(C112608f<I> fVar, final C11323a<? super I, ? extends O> aVar, Executor executor) {
        aVar.getClass();
        return transformAsync(fVar, new AsyncFunction<I, O>() {
            public C112608f<O> apply(I i) {
                return Futures.immediateFuture(C11323a.this.apply(i));
            }
        }, executor);
    }

    public static <I, O> C112608f<O> transformAsync(C112608f<I> fVar, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(asyncFunction, fVar);
        fVar.addListener(chainingListenableFuture, executor);
        return chainingListenableFuture;
    }

    public static <I, O> void propagateTransform(C112608f<I> fVar, C11323a<? super I, ? extends O> aVar, C117512b.C117513a<O> aVar2, Executor executor) {
        propagateTransform(true, fVar, aVar, aVar2, executor);
    }
}
