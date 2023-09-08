package com.tencent.p014mm.sdk.platformtools;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tencent.mm.sdk.platformtools.RWCache */
public class RWCache<K, V> {
    private static final int DEFAULT_MAX_HOLDER_THRESHOLD = 40;
    private static final long DEFAULT_MAX_SYNC_TIME = 60000;
    private static final long DEFAULT_MAX_TIME_OUT = 60000;
    private static final String TAG = "MicroMsg.RWCache";
    private final IRWCacheAppender<K, V> appender;
    private final LruCache<K, CacheItem<V>> cache;
    private final LinkedHashMap<K, Holder<K, V>> holderMap;
    /* access modifiers changed from: private */
    public volatile boolean isTimeout;
    private final long maxSyncTime;
    public Object tag;
    private final long threshold;
    private final MTimerHandler timeoutChecker;
    private final long timeoutMillis;
    private final MTimerHandler timer;
    private boolean trigger;

    /* renamed from: com.tencent.mm.sdk.platformtools.RWCache$CacheItem */
    public static class CacheItem<V> {
        public final V val;

        public CacheItem(V v) {
            this.val = v;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof CacheItem)) {
                return false;
            }
            CacheItem cacheItem = (CacheItem) obj;
            V v = this.val;
            return v == null ? cacheItem.val == null : v.equals(cacheItem.val);
        }
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.RWCache$Holder */
    public static class Holder<K, V> {
        public static final int FUNC_DELETE = 2;
        public static final int FUNC_UPDATE = 1;
        public int funcType;
        public K key;
        public V values;
    }

    /* renamed from: com.tencent.mm.sdk.platformtools.RWCache$IRWCacheAppender */
    public interface IRWCacheAppender<K, V> {
        void append(RWCache<K, V> rWCache, Holder<K, V> holder);

        void postAppend();

        boolean preAppend();
    }

    public RWCache(IRWCacheAppender<K, V> iRWCacheAppender, Looper looper, int i) {
        this(iRWCacheAppender, looper, i, 40, 60000, 60000);
    }

    private void put(K k, Holder<K, V> holder) {
        synchronized (this) {
            this.holderMap.put(k, holder);
            if (this.trigger && ((long) this.holderMap.size()) > this.threshold) {
                this.timer.startTimer(0);
                this.trigger = false;
            } else if (this.timer.stopped()) {
                this.timer.startTimer(this.maxSyncTime);
            }
        }
    }

    public void appendAll(boolean z) {
        Log.m105924i(TAG, "summer appendAll force: " + z + " tid: " + Thread.currentThread().getId() + " holderMap size: " + this.holderMap.size());
        synchronized (this) {
            this.trigger = true;
            if (!this.holderMap.isEmpty()) {
                if (this.appender.preAppend()) {
                    Iterator<Map.Entry<K, Holder<K, V>>> it = this.holderMap.entrySet().iterator();
                    if (z) {
                        while (it.hasNext()) {
                            this.appender.append(this, (Holder) it.next().getValue());
                            it.remove();
                        }
                    } else {
                        this.isTimeout = false;
                        this.timeoutChecker.startTimer(this.timeoutMillis);
                        while (!this.isTimeout && it.hasNext()) {
                            this.appender.append(this, (Holder) it.next().getValue());
                            it.remove();
                        }
                        if (this.isTimeout) {
                            Log.m105925i(TAG, "summer appendAll timeout size[%d] hasNext[%b] end", Integer.valueOf(this.holderMap.size()), Boolean.valueOf(it.hasNext()));
                        }
                        this.timeoutChecker.stopTimer();
                    }
                    this.appender.postAppend();
                }
            }
        }
    }

    public void clear() {
        synchronized (this) {
            this.cache.evictAll();
            this.holderMap.clear();
            this.timer.stopTimer();
            this.timeoutChecker.stopTimer();
            this.isTimeout = true;
        }
    }

    public V get(K k) {
        if (k != null) {
            CacheItem cacheItem = this.cache.get(k);
            if (cacheItem != null) {
                return cacheItem.val;
            }
            this.cache.put(k, new CacheItem(null));
            return null;
        }
        throw new NullPointerException("key == null");
    }

    public Object getTag() {
        return this.tag;
    }

    public boolean remove(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        } else if (get(k) != null) {
            return set(k, (Object) null);
        } else {
            return false;
        }
    }

    public boolean set(K k, V v) {
        if (k != null) {
            CacheItem cacheItem = new CacheItem(v);
            if (cacheItem.equals(this.cache.get(k))) {
                return false;
            }
            this.cache.put(k, cacheItem);
            Holder holder = new Holder();
            holder.key = k;
            holder.values = v;
            holder.funcType = v == null ? 2 : 1;
            put(k, holder);
            return true;
        }
        throw new NullPointerException("key == null");
    }

    public void setTag(Object obj) {
        this.tag = obj;
    }

    public RWCache(IRWCacheAppender<K, V> iRWCacheAppender, Looper looper, int i, int i2, long j, long j2) {
        this.holderMap = new LinkedHashMap<>();
        this.trigger = true;
        this.isTimeout = false;
        if (iRWCacheAppender == null) {
            throw new IllegalArgumentException("arg appender can not be null!");
        } else if (looper == null) {
            throw new IllegalArgumentException("arg looper can not be null!");
        } else if (i > 0) {
            this.appender = iRWCacheAppender;
            this.cache = new LruCache<>(i);
            this.threshold = i2 > 0 ? (long) i2 : 40;
            this.maxSyncTime = j <= 0 ? 60000 : j;
            this.timeoutMillis = j2 <= 0 ? 60000 : j2;
            this.timer = new MTimerHandler(looper, (MTimerHandler.CallBack) new MTimerHandler.CallBack() {
                public boolean onTimerExpired() {
                    long currentTimeMillis = System.currentTimeMillis();
                    RWCache.this.appendAll(false);
                    Log.m105924i(RWCache.TAG, "summer timer onTimerExpired e appendAll takes: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
                    return false;
                }
            }, false);
            this.timeoutChecker = new MTimerHandler("RWCache_timeoutChecker", (MTimerHandler.CallBack) new MTimerHandler.CallBack() {
                public boolean onTimerExpired() {
                    boolean unused = RWCache.this.isTimeout = true;
                    return false;
                }
            }, false);
        } else {
            throw new IllegalArgumentException("arg size can not be <= 0!");
        }
    }
}
