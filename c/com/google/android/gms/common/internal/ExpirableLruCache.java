package com.google.android.gms.common.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p1042u.C111058g;

public class ExpirableLruCache<K, V> {
    public static int TIME_UNSET = -1;
    /* access modifiers changed from: private */
    public final Object mLock = new Object();
    private final C111058g<K, V> zzsn;
    private final long zzso;
    private final long zzsp;
    /* access modifiers changed from: private */
    public HashMap<K, Long> zzsq;
    /* access modifiers changed from: private */
    public HashMap<K, Long> zzsr;

    public ExpirableLruCache(int i, long j, long j2, TimeUnit timeUnit) {
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        this.zzso = timeUnit2.convert(j, timeUnit);
        this.zzsp = timeUnit2.convert(j2, timeUnit);
        Preconditions.checkArgument(zzct() || zzcu(), "ExpirableLruCache has both access and write expiration negative");
        this.zzsn = new zze(this, i);
        if (zzct()) {
            this.zzsq = new HashMap<>();
        }
        if (zzcu()) {
            this.zzsr = new HashMap<>();
        }
    }

    private final boolean zza(K k) {
        long nanoTime = System.nanoTime();
        if (!zzct() || !this.zzsq.containsKey(k) || nanoTime - this.zzsq.get(k).longValue() <= this.zzso) {
            return zzcu() && this.zzsr.containsKey(k) && nanoTime - this.zzsr.get(k).longValue() > this.zzsp;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final boolean zzct() {
        return this.zzso >= 0;
    }

    /* access modifiers changed from: private */
    public final boolean zzcu() {
        return this.zzsp >= 0;
    }

    public V create(K k) {
        return null;
    }

    public void entryRemoved(boolean z, K k, V v, V v2) {
    }

    public void evictAll() {
        this.zzsn.evictAll();
    }

    public V get(K k) {
        V v;
        synchronized (this.mLock) {
            if (zza(k)) {
                this.zzsn.remove(k);
            }
            v = this.zzsn.get(k);
            if (v != null && this.zzso > 0) {
                this.zzsq.put(k, Long.valueOf(System.nanoTime()));
            }
        }
        return v;
    }

    public V put(K k, V v) {
        if (zzcu()) {
            long nanoTime = System.nanoTime();
            synchronized (this.mLock) {
                this.zzsr.put(k, Long.valueOf(nanoTime));
            }
        }
        return this.zzsn.put(k, v);
    }

    public V remove(K k) {
        return this.zzsn.remove(k);
    }

    public void removeExpired() {
        for (K next : this.zzsn.snapshot().keySet()) {
            synchronized (this.mLock) {
                if (zza(next)) {
                    this.zzsn.remove(next);
                }
            }
        }
    }

    public int sizeOf(K k, V v) {
        return 1;
    }

    public Map<K, V> snapshot() {
        removeExpired();
        return this.zzsn.snapshot();
    }
}
