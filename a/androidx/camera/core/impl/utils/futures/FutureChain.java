package androidx.camera.core.impl.utils.futures;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p1167z8.C112608f;
import p202m2.C117512b;
import p210o.C11323a;
import p329d3.C20434g;

public class FutureChain<V> implements C112608f<V> {
    public C117512b.C117513a<V> mCompleter;
    private final C112608f<V> mDelegate;

    public FutureChain(C112608f<V> fVar) {
        fVar.getClass();
        this.mDelegate = fVar;
    }

    public static <V> FutureChain<V> from(C112608f<V> fVar) {
        return fVar instanceof FutureChain ? (FutureChain) fVar : new FutureChain<>(fVar);
    }

    public final void addCallback(FutureCallback<? super V> futureCallback, Executor executor) {
        Futures.addCallback(this, futureCallback, executor);
    }

    public void addListener(Runnable runnable, Executor executor) {
        this.mDelegate.addListener(runnable, executor);
    }

    public boolean cancel(boolean z) {
        return this.mDelegate.cancel(z);
    }

    public V get() {
        return this.mDelegate.get();
    }

    public boolean isCancelled() {
        return this.mDelegate.isCancelled();
    }

    public boolean isDone() {
        return this.mDelegate.isDone();
    }

    /* access modifiers changed from: package-private */
    public boolean set(V v) {
        C117512b.C117513a<V> aVar = this.mCompleter;
        if (aVar != null) {
            return aVar.mo182231a(v);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean setException(Throwable th) {
        C117512b.C117513a<V> aVar = this.mCompleter;
        if (aVar != null) {
            return aVar.mo182232b(th);
        }
        return false;
    }

    public final <T> FutureChain<T> transform(C11323a<? super V, T> aVar, Executor executor) {
        return (FutureChain) Futures.transform(this, aVar, executor);
    }

    public final <T> FutureChain<T> transformAsync(AsyncFunction<? super V, T> asyncFunction, Executor executor) {
        return (FutureChain) Futures.transformAsync(this, asyncFunction, executor);
    }

    public V get(long j, TimeUnit timeUnit) {
        return this.mDelegate.get(j, timeUnit);
    }

    public FutureChain() {
        this.mDelegate = C117512b.m165760a(new C117512b.C117515c<V>() {
            public Object attachCompleter(C117512b.C117513a<V> aVar) {
                C20434g.m22021e(FutureChain.this.mCompleter == null, "The result can only set once!");
                FutureChain.this.mCompleter = aVar;
                return "FutureChain[" + FutureChain.this + "]";
            }
        });
    }
}
