package androidx.camera.core.impl;

import java.util.concurrent.Executor;
import p1167z8.C112608f;

public interface Observable<T> {

    public interface Observer<T> {
        void onError(Throwable th);

        void onNewData(T t);
    }

    void addObserver(Executor executor, Observer<? super T> observer);

    C112608f<T> fetchData();

    void removeObserver(Observer<? super T> observer);
}
