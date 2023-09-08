package com.tencent.mapsdk.internal;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.tencent.mapsdk.internal.ku */
public class C104555ku<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f309936a;

    /* renamed from: b */
    private int f309937b;

    /* renamed from: c */
    private int f309938c;

    /* renamed from: d */
    private int f309939d;

    /* renamed from: e */
    private int f309940e;

    /* renamed from: f */
    private int f309941f;

    /* renamed from: g */
    private int f309942g;

    /* renamed from: h */
    private int f309943h;

    public C104555ku(int i) {
        if (i > 0) {
            this.f309938c = i;
            this.f309936a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    private void m140012a(int i) {
        if (i > 0) {
            synchronized (this) {
                this.f309938c = i;
            }
            m140014b(i);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: e */
    private static V m140015e() {
        return null;
    }

    /* renamed from: f */
    private synchronized int m140016f() {
        return this.f309942g;
    }

    /* renamed from: g */
    private synchronized int m140017g() {
        return this.f309943h;
    }

    /* renamed from: h */
    private synchronized int m140018h() {
        return this.f309940e;
    }

    /* renamed from: i */
    private synchronized int m140019i() {
        return this.f309939d;
    }

    /* renamed from: j */
    private synchronized int m140020j() {
        return this.f309941f;
    }

    /* renamed from: a */
    public int mo147868a(V v) {
        return 1;
    }

    /* renamed from: a */
    public void mo147871a(boolean z, V v) {
    }

    /* renamed from: b */
    public final V mo147873b(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.f309936a.get(k);
                if (v != null) {
                    this.f309942g++;
                    return v;
                }
                this.f309943h++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: c */
    public final V mo147875c(K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.f309936a.remove(k);
                if (remove != null) {
                    this.f309937b -= m140013b(k, remove);
                }
            }
            if (remove != null) {
                mo147871a(false, remove);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: d */
    public final synchronized Map<K, V> mo147876d() {
        return new LinkedHashMap(this.f309936a);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f309942g;
        i2 = this.f309943h + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f309938c), Integer.valueOf(this.f309942g), Integer.valueOf(this.f309943h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }

    /* renamed from: a */
    public final V mo147869a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f309939d++;
            this.f309937b += m140013b(k, v);
            put = this.f309936a.put(k, v);
            if (put != null) {
                this.f309937b -= m140013b(k, put);
            }
        }
        if (put != null) {
            mo147871a(false, put);
        }
        m140014b(this.f309938c);
        return put;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m140014b(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f309937b     // Catch:{ all -> 0x0070 }
            if (r0 < 0) goto L_0x0051
            java.util.LinkedHashMap<K, V> r0 = r3.f309936a     // Catch:{ all -> 0x0070 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f309937b     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x0051
        L_0x0011:
            int r0 = r3.f309937b     // Catch:{ all -> 0x0070 }
            if (r0 <= r4) goto L_0x004f
            java.util.LinkedHashMap<K, V> r0 = r3.f309936a     // Catch:{ all -> 0x0070 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x001e
            goto L_0x004f
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r3.f309936a     // Catch:{ all -> 0x0070 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0070 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0070 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0070 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0070 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0070 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0070 }
            java.util.LinkedHashMap<K, V> r2 = r3.f309936a     // Catch:{ all -> 0x0070 }
            r2.remove(r1)     // Catch:{ all -> 0x0070 }
            int r2 = r3.f309937b     // Catch:{ all -> 0x0070 }
            int r1 = r3.m140013b(r1, r0)     // Catch:{ all -> 0x0070 }
            int r2 = r2 - r1
            r3.f309937b = r2     // Catch:{ all -> 0x0070 }
            int r1 = r3.f309941f     // Catch:{ all -> 0x0070 }
            r2 = 1
            int r1 = r1 + r2
            r3.f309941f = r1     // Catch:{ all -> 0x0070 }
            monitor-exit(r3)     // Catch:{ all -> 0x0070 }
            r3.mo147871a((boolean) r2, r0)
            goto L_0x0000
        L_0x004f:
            monitor-exit(r3)     // Catch:{ all -> 0x0070 }
            return
        L_0x0051:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0070 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r0.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0070 }
            r0.append(r1)     // Catch:{ all -> 0x0070 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0070 }
            r4.<init>(r0)     // Catch:{ all -> 0x0070 }
            throw r4     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0070 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.C104555ku.m140014b(int):void");
    }

    /* renamed from: c */
    public final synchronized int mo147874c() {
        return this.f309938c;
    }

    /* renamed from: a */
    public final void mo147870a() {
        m140014b(-1);
    }

    /* renamed from: b */
    private int m140013b(K k, V v) {
        int a = mo147868a(v);
        if (a >= 0) {
            return a;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* renamed from: b */
    public final synchronized int mo147872b() {
        return this.f309937b;
    }
}
