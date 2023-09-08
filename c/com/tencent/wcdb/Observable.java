package com.tencent.wcdb;

import java.util.ArrayList;

public abstract class Observable<T> {
    public final ArrayList<T> mObservers = new ArrayList<>();

    public void registerObserver(T t) {
        if (t != null) {
            synchronized (this.mObservers) {
                if (!this.mObservers.contains(t)) {
                    this.mObservers.add(t);
                } else {
                    throw new IllegalStateException("Observer " + t + " is already registered.");
                }
            }
            return;
        }
        throw new IllegalArgumentException("The observer is null.");
    }

    public void unregisterAll() {
        synchronized (this.mObservers) {
            this.mObservers.clear();
        }
    }

    public void unregisterObserver(T t) {
        if (t != null) {
            synchronized (this.mObservers) {
                int indexOf = this.mObservers.indexOf(t);
                if (indexOf != -1) {
                    this.mObservers.remove(indexOf);
                } else {
                    throw new IllegalStateException("Observer " + t + " was not registered.");
                }
            }
            return;
        }
        throw new IllegalArgumentException("The observer is null.");
    }
}
