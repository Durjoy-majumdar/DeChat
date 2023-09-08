package com.tencent.p014mm.sdk;

import com.tencent.p014mm.sdk.platformtools.SimpleObjectPool;

/* renamed from: com.tencent.mm.sdk.SynchronizedPool */
public class SynchronizedPool<T> extends SimpleObjectPool<T> {
    private final Object mLock = new Object();

    public SynchronizedPool(int i) {
        super(i);
    }

    public T acquire() {
        T acquire;
        synchronized (this.mLock) {
            acquire = super.acquire();
        }
        return acquire;
    }

    public boolean release(T t) {
        boolean release;
        synchronized (this.mLock) {
            release = super.release(t);
        }
        return release;
    }
}
