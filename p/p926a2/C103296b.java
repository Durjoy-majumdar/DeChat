package p926a2;

import java.util.HashMap;
import java.util.LinkedHashSet;
import p146e2.C107163g;
import rx3.C13598b0;

/* renamed from: a2.b */
public class C103296b<K, V> {

    /* renamed from: a */
    public final C107163g f304575a = new C107163g();

    /* renamed from: b */
    public final HashMap<K, V> f304576b;

    /* renamed from: c */
    public final LinkedHashSet<K> f304577c;

    /* renamed from: d */
    public int f304578d;

    /* renamed from: e */
    public int f304579e;

    /* renamed from: f */
    public int f304580f;

    public C103296b(int i) {
        if (i > 0) {
            this.f304576b = new HashMap<>(0, 0.75f);
            this.f304577c = new LinkedHashSet<>();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    /* renamed from: a */
    public final V mo143069a(K k) {
        synchronized (this.f304575a) {
            V v = this.f304576b.get(k);
            if (v != null) {
                this.f304577c.remove(k);
                this.f304577c.add(k);
                this.f304579e++;
                return v;
            }
            this.f304580f++;
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b4, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo143070b(K r6, V r7) {
        /*
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L_0x00bb
            if (r7 == 0) goto L_0x00bb
            e2.g r1 = r5.f304575a
            monitor-enter(r1)
            int r2 = r5.mo143072d()     // Catch:{ all -> 0x00b8 }
            int r2 = r2 + 1
            r5.f304578d = r2     // Catch:{ all -> 0x00b8 }
            java.util.HashMap<K, V> r2 = r5.f304576b     // Catch:{ all -> 0x00b8 }
            java.lang.Object r7 = r2.put(r6, r7)     // Catch:{ all -> 0x00b8 }
            if (r7 == 0) goto L_0x0020
            int r2 = r5.mo143072d()     // Catch:{ all -> 0x00b8 }
            int r2 = r2 + -1
            r5.f304578d = r2     // Catch:{ all -> 0x00b8 }
        L_0x0020:
            java.util.LinkedHashSet<K> r2 = r5.f304577c     // Catch:{ all -> 0x00b8 }
            boolean r2 = r2.contains(r6)     // Catch:{ all -> 0x00b8 }
            if (r2 == 0) goto L_0x002d
            java.util.LinkedHashSet<K> r2 = r5.f304577c     // Catch:{ all -> 0x00b8 }
            r2.remove(r6)     // Catch:{ all -> 0x00b8 }
        L_0x002d:
            java.util.LinkedHashSet<K> r2 = r5.f304577c     // Catch:{ all -> 0x00b8 }
            r2.add(r6)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r1)
            r6 = 16
        L_0x0035:
            e2.g r1 = r5.f304575a
            monitor-enter(r1)
            int r2 = r5.mo143072d()     // Catch:{ all -> 0x00b5 }
            if (r2 < 0) goto L_0x00ad
            java.util.HashMap<K, V> r2 = r5.f304576b     // Catch:{ all -> 0x00b5 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x004c
            int r2 = r5.mo143072d()     // Catch:{ all -> 0x00b5 }
            if (r2 != 0) goto L_0x00ad
        L_0x004c:
            java.util.HashMap<K, V> r2 = r5.f304576b     // Catch:{ all -> 0x00b5 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00b5 }
            java.util.LinkedHashSet<K> r3 = r5.f304577c     // Catch:{ all -> 0x00b5 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00b5 }
            if (r2 != r3) goto L_0x00ad
            int r2 = r5.mo143072d()     // Catch:{ all -> 0x00b5 }
            if (r2 <= r6) goto L_0x009c
            java.util.HashMap<K, V> r2 = r5.f304576b     // Catch:{ all -> 0x00b5 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x00b5 }
            if (r2 != 0) goto L_0x009c
            java.util.LinkedHashSet<K> r2 = r5.f304577c     // Catch:{ all -> 0x00b5 }
            java.lang.Object r2 = sx3.C110818d0.m150913K(r2)     // Catch:{ all -> 0x00b5 }
            java.util.HashMap<K, V> r3 = r5.f304576b     // Catch:{ all -> 0x00b5 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x00b5 }
            if (r3 == 0) goto L_0x0094
            java.util.HashMap<K, V> r4 = r5.f304576b     // Catch:{ all -> 0x00b5 }
            java.util.Map r4 = gy3.C24564k0.m30739c(r4)     // Catch:{ all -> 0x00b5 }
            r4.remove(r2)     // Catch:{ all -> 0x00b5 }
            java.util.LinkedHashSet<K> r4 = r5.f304577c     // Catch:{ all -> 0x00b5 }
            java.util.Collection r4 = gy3.C24564k0.m30737a(r4)     // Catch:{ all -> 0x00b5 }
            r4.remove(r2)     // Catch:{ all -> 0x00b5 }
            int r4 = r5.mo143072d()     // Catch:{ all -> 0x00b5 }
            gy3.C87412m.m108591d(r2)     // Catch:{ all -> 0x00b5 }
            int r4 = r4 + -1
            r5.f304578d = r4     // Catch:{ all -> 0x00b5 }
            goto L_0x009e
        L_0x0094:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b5 }
            java.lang.String r7 = "inconsistent state"
            r6.<init>(r7)     // Catch:{ all -> 0x00b5 }
            throw r6     // Catch:{ all -> 0x00b5 }
        L_0x009c:
            r2 = r0
            r3 = r2
        L_0x009e:
            rx3.b0 r4 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00b5 }
            monitor-exit(r1)
            if (r2 != 0) goto L_0x00a6
            if (r3 != 0) goto L_0x00a6
            return r7
        L_0x00a6:
            gy3.C87412m.m108591d(r2)
            gy3.C87412m.m108591d(r3)
            goto L_0x0035
        L_0x00ad:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b5 }
            java.lang.String r7 = "map/keySet size inconsistency"
            r6.<init>(r7)     // Catch:{ all -> 0x00b5 }
            throw r6     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L_0x00b8:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        L_0x00bb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p926a2.C103296b.mo143070b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final V mo143071c(K k) {
        V remove;
        k.getClass();
        synchronized (this.f304575a) {
            remove = this.f304576b.remove(k);
            this.f304577c.remove(k);
            if (remove != null) {
                this.f304578d = mo143072d() - 1;
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return remove;
    }

    /* renamed from: d */
    public final int mo143072d() {
        int i;
        synchronized (this.f304575a) {
            i = this.f304578d;
        }
        return i;
    }

    public String toString() {
        String str;
        synchronized (this.f304575a) {
            int i = this.f304579e;
            int i2 = this.f304580f + i;
            str = "LruCache[maxSize=" + 16 + ",hits=" + this.f304579e + ",misses=" + this.f304580f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }
}
