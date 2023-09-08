package com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.algo;

import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.Cluster;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.clustering.ClusterItem;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p1042u.C111058g;

public class PreCachingAlgorithmDecorator<T extends ClusterItem> implements Algorithm<T> {

    /* renamed from: a */
    private final Algorithm<T> f349263a;

    /* renamed from: b */
    private final C111058g<Integer, Set<? extends Cluster<T>>> f349264b = new C111058g<>(5);

    /* renamed from: c */
    private final ReadWriteLock f349265c = new ReentrantReadWriteLock();

    public class PrecacheRunnable implements Runnable {

        /* renamed from: b */
        private final int f349267b;

        public PrecacheRunnable(int i) {
            this.f349267b = i;
        }

        public void run() {
            try {
                Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
            } catch (InterruptedException unused) {
            }
            Set unused2 = PreCachingAlgorithmDecorator.this.m164069a(this.f349267b);
        }
    }

    public PreCachingAlgorithmDecorator(Algorithm<T> algorithm) {
        this.f349263a = algorithm;
    }

    public void addItem(T t) {
        this.f349263a.addItem(t);
        m164071a();
    }

    public void addItems(Collection<T> collection) {
        this.f349263a.addItems(collection);
        m164071a();
    }

    public void clearItems() {
        this.f349263a.clearItems();
        m164071a();
    }

    public Algorithm getAlgorithm() {
        return this.f349263a;
    }

    public Set<? extends Cluster<T>> getClusters(double d) {
        int i = (int) d;
        Set<? extends Cluster<T>> a = m164069a(i);
        int i2 = i + 1;
        if (this.f349264b.get(Integer.valueOf(i2)) == null) {
            new Thread(new PrecacheRunnable(i2)).start();
        }
        int i3 = i - 1;
        if (this.f349264b.get(Integer.valueOf(i3)) == null) {
            new Thread(new PrecacheRunnable(i3)).start();
        }
        return a;
    }

    public Collection<T> getItems() {
        return this.f349263a.getItems();
    }

    public void removeItem(T t) {
        this.f349263a.removeItem(t);
        m164071a();
    }

    /* renamed from: a */
    private void m164071a() {
        this.f349264b.evictAll();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Set<? extends Cluster<T>> m164069a(int i) {
        this.f349265c.readLock().lock();
        Set<? extends Cluster<T>> set = this.f349264b.get(Integer.valueOf(i));
        this.f349265c.readLock().unlock();
        if (set == null) {
            this.f349265c.writeLock().lock();
            set = this.f349264b.get(Integer.valueOf(i));
            if (set == null) {
                set = this.f349263a.getClusters((double) i);
                this.f349264b.put(Integer.valueOf(i), set);
            }
            this.f349265c.writeLock().unlock();
        }
        return set;
    }
}
