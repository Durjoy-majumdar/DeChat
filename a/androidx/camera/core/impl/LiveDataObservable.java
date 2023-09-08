package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C54219z;
import androidx.lifecycle.LiveData;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p1167z8.C112608f;
import p202m2.C117512b;

public final class LiveDataObservable<T> implements Observable<T> {
    public final C54219z<Result<T>> mLiveData = new C54219z<>();
    private final Map<Observable.Observer<? super T>, LiveDataObserverAdapter<T>> mObservers = new HashMap();

    public static final class LiveDataObserverAdapter<T> implements C0120a0<Result<T>> {
        public final AtomicBoolean mActive = new AtomicBoolean(true);
        public final Executor mExecutor;
        public final Observable.Observer<? super T> mObserver;

        public LiveDataObserverAdapter(Executor executor, Observable.Observer<? super T> observer) {
            this.mExecutor = executor;
            this.mObserver = observer;
        }

        /* access modifiers changed from: private */
        public void lambda$onChanged$0(Result result) {
            if (this.mActive.get()) {
                if (result.completedSuccessfully()) {
                    this.mObserver.onNewData(result.getValue());
                    return;
                }
                result.getError().getClass();
                this.mObserver.onError(result.getError());
            }
        }

        public void disable() {
            this.mActive.set(false);
        }

        public void onChanged(Result<T> result) {
            this.mExecutor.execute(new LiveDataObservable$LiveDataObserverAdapter$$a(this, result));
        }
    }

    public static final class Result<T> {
        private final Throwable mError;
        private final T mValue;

        private Result(T t, Throwable th) {
            this.mValue = t;
            this.mError = th;
        }

        public static <T> Result<T> fromError(Throwable th) {
            th.getClass();
            return new Result<>((Object) null, th);
        }

        public static <T> Result<T> fromValue(T t) {
            return new Result<>(t, (Throwable) null);
        }

        public boolean completedSuccessfully() {
            return this.mError == null;
        }

        public Throwable getError() {
            return this.mError;
        }

        public T getValue() {
            if (completedSuccessfully()) {
                return this.mValue;
            }
            throw new IllegalStateException("Result contains an error. Does not contain a value.");
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[Result: <");
            if (completedSuccessfully()) {
                str = "Value: " + this.mValue;
            } else {
                str = "Error: " + this.mError;
            }
            sb.append(str);
            sb.append(">]");
            return sb.toString();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$addObserver$2(LiveDataObserverAdapter liveDataObserverAdapter, LiveDataObserverAdapter liveDataObserverAdapter2) {
        if (liveDataObserverAdapter != null) {
            this.mLiveData.removeObserver(liveDataObserverAdapter);
        }
        this.mLiveData.observeForever(liveDataObserverAdapter2);
    }

    /* access modifiers changed from: private */
    public void lambda$fetchData$0(C117512b.C117513a aVar) {
        Result value = this.mLiveData.getValue();
        if (value == null) {
            aVar.mo182232b(new IllegalStateException("Observable has not yet been initialized with a value."));
        } else if (value.completedSuccessfully()) {
            aVar.mo182231a(value.getValue());
        } else {
            value.getError().getClass();
            aVar.mo182232b(value.getError());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$fetchData$1(C117512b.C117513a aVar) {
        CameraXExecutors.mainThreadExecutor().execute(new LiveDataObservable$$b(this, aVar));
        return this + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$removeObserver$3(LiveDataObserverAdapter liveDataObserverAdapter) {
        this.mLiveData.removeObserver(liveDataObserverAdapter);
    }

    public void addObserver(Executor executor, Observable.Observer<? super T> observer) {
        synchronized (this.mObservers) {
            LiveDataObserverAdapter liveDataObserverAdapter = this.mObservers.get(observer);
            if (liveDataObserverAdapter != null) {
                liveDataObserverAdapter.disable();
            }
            LiveDataObserverAdapter liveDataObserverAdapter2 = new LiveDataObserverAdapter(executor, observer);
            this.mObservers.put(observer, liveDataObserverAdapter2);
            CameraXExecutors.mainThreadExecutor().execute(new LiveDataObservable$$d(this, liveDataObserverAdapter, liveDataObserverAdapter2));
        }
    }

    public C112608f<T> fetchData() {
        return C117512b.m165760a(new LiveDataObservable$$a(this));
    }

    public LiveData<Result<T>> getLiveData() {
        return this.mLiveData;
    }

    public void postError(Throwable th) {
        this.mLiveData.postValue(Result.fromError(th));
    }

    public void postValue(T t) {
        this.mLiveData.postValue(Result.fromValue(t));
    }

    public void removeObserver(Observable.Observer<? super T> observer) {
        synchronized (this.mObservers) {
            LiveDataObserverAdapter remove = this.mObservers.remove(observer);
            if (remove != null) {
                remove.disable();
                CameraXExecutors.mainThreadExecutor().execute(new LiveDataObservable$$c(this, remove));
            }
        }
    }
}
