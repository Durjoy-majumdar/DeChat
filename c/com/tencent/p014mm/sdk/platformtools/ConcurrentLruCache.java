package com.tencent.p014mm.sdk.platformtools;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00110\u0010J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u000fJ\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0015R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018¨\u0006$"}, mo182094d2 = {"Lcom/tencent/mm/sdk/platformtools/ConcurrentLruCache;", "K", "V", "", "key", "value", "Lrx3/b0;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "contains", "(Ljava/lang/Object;)Z", "", "", "iterator", "remove", "clear", "", "size", "sizeLimit", "I", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "queue", "Ljava/util/concurrent/ConcurrentLinkedDeque;", "Ljava/util/concurrent/locks/ReadWriteLock;", "lock", "Ljava/util/concurrent/locks/ReadWriteLock;", "<init>", "(I)V", "wechat-sdk_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.sdk.platformtools.ConcurrentLruCache */
public final class ConcurrentLruCache<K, V> {
    private final ConcurrentHashMap<K, V> cache = new ConcurrentHashMap<>();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final ConcurrentLinkedDeque<K> queue = new ConcurrentLinkedDeque<>();
    private volatile int size;
    private final int sizeLimit;

    public ConcurrentLruCache(int i) {
        if (i > 0) {
            this.sizeLimit = i;
            return;
        }
        throw new IllegalArgumentException("sizeLimit <= 0".toString());
    }

    public final void clear() {
        this.lock.writeLock().lock();
        try {
            this.cache.clear();
            this.queue.clear();
            this.size = 0;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public final boolean contains(K k) {
        return this.cache.containsKey(k);
    }

    public final V get(K k) {
        return this.cache.get(k);
    }

    public final Iterator<Map.Entry<K, V>> iterator() {
        return this.cache.entrySet().iterator();
    }

    public final V put(K k, V v) {
        K poll;
        this.lock.writeLock().lock();
        try {
            V v2 = this.cache.get(k);
            if (this.size == this.sizeLimit && (poll = this.queue.poll()) != null) {
                this.cache.remove(poll);
            }
            this.queue.offer(k);
            this.cache.put(k, v);
            this.size = this.cache.size();
            return v2;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public final boolean remove(K k) {
        this.lock.writeLock().lock();
        try {
            boolean z = this.cache.remove(k) != null;
            this.queue.remove(k);
            this.size = this.cache.size();
            return z;
        } finally {
            this.lock.writeLock().unlock();
        }
    }

    public final void set(K k, V v) {
        put(k, v);
    }

    public final int size() {
        return this.size;
    }

    public final int sizeLimit() {
        return this.sizeLimit;
    }
}
