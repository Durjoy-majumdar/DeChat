package androidx.camera.core.impl;

import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p1167z8.C112608f;

public final class ConstantObservable<T> implements Observable<T> {
    private static final ConstantObservable<Object> NULL_OBSERVABLE = new ConstantObservable<>((Object) null);
    private static final String TAG = "ConstantObservable";
    private final C112608f<T> mValueFuture;

    private ConstantObservable(T t) {
        this.mValueFuture = Futures.immediateFuture(t);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addObserver$0(Observable.Observer observer) {
        try {
            observer.onNewData(this.mValueFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            observer.onError(e);
        }
    }

    public static <U> Observable<U> withValue(U u) {
        return u == null ? NULL_OBSERVABLE : new ConstantObservable(u);
    }

    public void addObserver(Executor executor, Observable.Observer<? super T> observer) {
        this.mValueFuture.addListener(new ConstantObservable$$a(this, observer), executor);
    }

    public C112608f<T> fetchData() {
        return this.mValueFuture;
    }

    public void removeObserver(Observable.Observer<? super T> observer) {
    }
}
