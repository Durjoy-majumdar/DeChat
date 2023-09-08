package com.tencent.p014mm.sdk.platformtools;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tencent.mm.sdk.platformtools.LruCache */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i) {
        if (i > 0) {
            this.maxSize = i;
            this.map = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int safeSizeOf(K k, V v) {
        int sizeOf = sizeOf(k, v);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public synchronized boolean check(K k) {
        return this.map.containsKey(k);
    }

    public synchronized boolean checkAndUpTime(K k) {
        return get(k) != null;
    }

    public V create(K k) {
        return null;
    }

    public final synchronized int createCount() {
        return this.createCount;
    }

    public void entryRemoved(boolean z, K k, V v, V v2) {
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return this.map.entrySet();
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final synchronized int evictionCount() {
        return this.evictionCount;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r3 = create(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r3 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.createCount++;
        r0 = r5.map.put(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r0 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        r5.map.put(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r5.size += safeSizeOf(r6, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r0 == null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        entryRemoved(false, r6, r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        trimToSize(r5.maxSize);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V get(K r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            if (r6 != 0) goto L_0x001a
            java.lang.String r6 = "MicroMsg.LruMap"
            java.lang.String r3 = "key == null %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.tencent.mm.sdk.platformtools.MMStack r4 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            java.lang.String r4 = r4.toString()
            r2[r1] = r4
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r3, r2)
            return r0
        L_0x001a:
            monitor-enter(r5)
            java.util.LinkedHashMap<K, V> r3 = r5.map     // Catch:{ all -> 0x0064 }
            java.lang.Object r3 = r3.get(r6)     // Catch:{ all -> 0x0064 }
            if (r3 == 0) goto L_0x002a
            int r6 = r5.hitCount     // Catch:{ all -> 0x0064 }
            int r6 = r6 + r2
            r5.hitCount = r6     // Catch:{ all -> 0x0064 }
            monitor-exit(r5)     // Catch:{ all -> 0x0064 }
            return r3
        L_0x002a:
            int r3 = r5.missCount     // Catch:{ all -> 0x0064 }
            int r3 = r3 + r2
            r5.missCount = r3     // Catch:{ all -> 0x0064 }
            monitor-exit(r5)     // Catch:{ all -> 0x0064 }
            java.lang.Object r3 = r5.create(r6)
            if (r3 != 0) goto L_0x0037
            return r0
        L_0x0037:
            monitor-enter(r5)
            int r0 = r5.createCount     // Catch:{ all -> 0x0061 }
            int r0 = r0 + r2
            r5.createCount = r0     // Catch:{ all -> 0x0061 }
            java.util.LinkedHashMap<K, V> r0 = r5.map     // Catch:{ all -> 0x0061 }
            java.lang.Object r0 = r0.put(r6, r3)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x004b
            java.util.LinkedHashMap<K, V> r2 = r5.map     // Catch:{ all -> 0x0061 }
            r2.put(r6, r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0054
        L_0x004b:
            int r2 = r5.size     // Catch:{ all -> 0x0061 }
            int r4 = r5.safeSizeOf(r6, r3)     // Catch:{ all -> 0x0061 }
            int r2 = r2 + r4
            r5.size = r2     // Catch:{ all -> 0x0061 }
        L_0x0054:
            monitor-exit(r5)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x005b
            r5.entryRemoved(r1, r6, r3, r0)
            return r0
        L_0x005b:
            int r6 = r5.maxSize
            r5.trimToSize(r6)
            return r3
        L_0x0061:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0061 }
            throw r6
        L_0x0064:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0064 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.LruCache.get(java.lang.Object):java.lang.Object");
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public Set<K> keySet() {
        return this.map.keySet();
    }

    public final synchronized int maxSize() {
        return this.maxSize;
    }

    public final synchronized int missCount() {
        return this.missCount;
    }

    public final V put(K k, V v) {
        V put;
        if (k == null || v == null) {
            Log.m105921e("MicroMsg.LruMap", "put key == null or value == null [%s, %s], %s", k, v, Util.getStack().toString());
        }
        synchronized (this) {
            this.putCount++;
            this.size += safeSizeOf(k, v);
            put = this.map.put(k, v);
            if (put != null) {
                this.size -= safeSizeOf(k, put);
            }
        }
        if (put != null) {
            entryRemoved(false, k, put, v);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final synchronized int putCount() {
        return this.putCount;
    }

    public final V remove(K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.map.remove(k);
                if (remove != null) {
                    this.size -= safeSizeOf(k, remove);
                }
            }
            if (remove != null) {
                entryRemoved(false, k, remove, (V) null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    public synchronized void setMaxSize(int i) {
        if (i > 0) {
            Log.m105925i("LruCache", "setMaxSize %s", Integer.valueOf(i));
            this.maxSize = i;
        } else {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    public final synchronized int size() {
        return this.size;
    }

    public int sizeOf(K k, V v) {
        return 1;
    }

    public final synchronized Map<K, V> snapshot() {
        return new LinkedHashMap(this.map);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.hitCount;
        i2 = this.missCount + i;
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.maxSize), Integer.valueOf(this.hitCount), Integer.valueOf(this.missCount), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void trimToSize(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.size     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r4.size     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r4.size     // Catch:{ all -> 0x0071 }
            if (r0 <= r5) goto L_0x0050
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r4.map     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<K, V> r2 = r4.map     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r2 = r4.size     // Catch:{ all -> 0x0071 }
            int r3 = r4.safeSizeOf(r1, r0)     // Catch:{ all -> 0x0071 }
            int r2 = r2 - r3
            r4.size = r2     // Catch:{ all -> 0x0071 }
            int r2 = r4.evictionCount     // Catch:{ all -> 0x0071 }
            r3 = 1
            int r2 = r2 + r3
            r4.evictionCount = r2     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            r2 = 0
            r4.entryRemoved(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0050:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r5.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r5     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.LruCache.trimToSize(int):void");
    }

    public Collection<V> values() {
        return this.map.values();
    }
}
