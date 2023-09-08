package com.tencent.p014mm.sdk.platformtools;

/* renamed from: com.tencent.mm.sdk.platformtools.SimpleObjectPool */
public class SimpleObjectPool<T> {
    private static final String TAG = "MicroMsg.SimpleObjectPool";
    private Object[] mPool;
    private int mPoolSize;

    public SimpleObjectPool(int i) {
        if (i <= 0) {
            Log.m105920e(TAG, "The max pool size must be > 0");
        } else {
            this.mPool = new Object[i];
        }
    }

    private boolean isInPool(T t) {
        if (this.mPool == null) {
            return false;
        }
        for (int i = 0; i < this.mPoolSize; i++) {
            if (this.mPool[i] == t) {
                return true;
            }
        }
        return false;
    }

    public T acquire() {
        int i;
        T[] tArr = this.mPool;
        if (tArr == null || (i = this.mPoolSize) <= 0) {
            return null;
        }
        int i2 = i - 1;
        T t = tArr[i2];
        tArr[i2] = null;
        this.mPoolSize = i - 1;
        return t;
    }

    public void put(T t) {
        if (this.mPool != null && !isInPool(t)) {
            int i = this.mPoolSize;
            Object[] objArr = this.mPool;
            if (i < objArr.length) {
                objArr[i] = t;
                this.mPoolSize = i + 1;
            }
        }
    }

    public void putWithoutCheck(T t) {
        int i;
        Object[] objArr = this.mPool;
        if (objArr != null && (i = this.mPoolSize) < objArr.length) {
            objArr[i] = t;
            this.mPoolSize = i + 1;
        }
    }

    public boolean release(T t) {
        if (this.mPool == null || isInPool(t)) {
            return false;
        }
        int i = this.mPoolSize;
        Object[] objArr = this.mPool;
        if (i >= objArr.length || i < 0) {
            Log.m105921e(TAG, "error index %d %d", Integer.valueOf(i), Integer.valueOf(this.mPool.length));
            return false;
        }
        objArr[i] = t;
        this.mPoolSize = i + 1;
        return true;
    }
}
