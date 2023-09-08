package com.tencent.thumbplayer.core.drm.reuse;

import com.tencent.thumbplayer.core.common.TPNativeLog;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TPDoubleQueueCachedPool<T> {
    private static final int DEFAULT_CORE_POOL_SIZE = 2;
    private static final String TAG = "[PlayerCore][TPDoubleQueueCachedPool]";
    private final List<T> mBusyCacheList = new ArrayList();
    private final int mCorePoolSize;
    private final List<T> mIdleCacheList = new ArrayList();
    private ITPObjectLifecycleMgr<T> mObjectLifecycleMgr;

    public interface ITPObjectLifecycleMgr<T> {
        T create(TPDoubleQueueCachedPool<T> tPDoubleQueueCachedPool);

        void release(TPDoubleQueueCachedPool<T> tPDoubleQueueCachedPool, T t);

        boolean reset(TPDoubleQueueCachedPool<T> tPDoubleQueueCachedPool, T t);
    }

    public TPDoubleQueueCachedPool(int i, int i2, ITPObjectLifecycleMgr<T> iTPObjectLifecycleMgr) {
        this.mCorePoolSize = i2 <= 0 ? 2 : i2;
        i = i <= 0 ? 2 : i;
        this.mObjectLifecycleMgr = iTPObjectLifecycleMgr;
        for (int i3 = 0; i3 < i; i3++) {
            T create = iTPObjectLifecycleMgr.create(this);
            if (create == null) {
                TPNativeLog.printLog(3, TAG, "TPDoubleQueueCachedPool, createObject failed.");
            } else {
                this.mIdleCacheList.add(create);
            }
        }
        TPNativeLog.printLog(2, TAG, "TPDoubleQueueCachedPool init size:" + this.mIdleCacheList.size());
    }

    public synchronized T allocObject() {
        T t;
        if (this.mIdleCacheList.isEmpty()) {
            t = this.mObjectLifecycleMgr.create(this);
            if (t == null) {
                return null;
            }
        } else {
            t = this.mIdleCacheList.remove(0);
        }
        this.mBusyCacheList.add(t);
        return t;
    }

    public synchronized void freeObject(T t) {
        this.mBusyCacheList.remove(t);
        this.mObjectLifecycleMgr.release(this, t);
    }

    public synchronized void recycleObject(T t) {
        if (!this.mBusyCacheList.remove(t) || this.mIdleCacheList.size() >= this.mCorePoolSize || !this.mObjectLifecycleMgr.reset(this, t)) {
            this.mObjectLifecycleMgr.release(this, t);
        } else {
            this.mIdleCacheList.add(t);
        }
    }

    public synchronized void release() {
        ListIterator<T> listIterator = this.mBusyCacheList.listIterator();
        while (listIterator.hasNext()) {
            this.mObjectLifecycleMgr.release(this, listIterator.next());
            listIterator.remove();
        }
        ListIterator<T> listIterator2 = this.mIdleCacheList.listIterator();
        while (listIterator2.hasNext()) {
            this.mObjectLifecycleMgr.release(this, listIterator2.next());
            listIterator2.remove();
        }
        this.mObjectLifecycleMgr = null;
    }
}
