package xz3;

import java.util.Iterator;
import java.util.Map;

/* renamed from: xz3.k */
public class C26602k extends C26606l {

    /* renamed from: xz3.k$b */
    public static class C26604b<K> implements Map.Entry<K, Object> {

        /* renamed from: d */
        public Map.Entry<K, C26602k> f74024d;

        public C26604b(Map.Entry entry, C26603a aVar) {
            this.f74024d = entry;
        }

        public K getKey() {
            return this.f74024d.getKey();
        }

        public Object getValue() {
            C26602k value = this.f74024d.getValue();
            if (value == null) {
                return null;
            }
            return value.mo53582a();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C26607p) {
                C26602k value = this.f74024d.getValue();
                C26607p pVar = value.f74027b;
                value.f74027b = (C26607p) obj;
                value.f74026a = true;
                return pVar;
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* renamed from: xz3.k$c */
    public static class C26605c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: d */
        public Iterator<Map.Entry<K, Object>> f74025d;

        public C26605c(Iterator<Map.Entry<K, Object>> it) {
            this.f74025d = it;
        }

        public boolean hasNext() {
            return this.f74025d.hasNext();
        }

        public Object next() {
            Map.Entry next = this.f74025d.next();
            return next.getValue() instanceof C26602k ? new C26604b(next, (C26603a) null) : next;
        }

        public void remove() {
            this.f74025d.remove();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x000f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public xz3.C26607p mo53582a() {
        /*
            r1 = this;
            xz3.p r0 = r1.f74027b
            if (r0 == 0) goto L_0x0005
            goto L_0x0010
        L_0x0005:
            monitor-enter(r1)
            xz3.p r0 = r1.f74027b     // Catch:{ all -> 0x0013 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x0010
        L_0x000c:
            r0 = 0
            r1.f74027b = r0     // Catch:{ IOException -> 0x000f }
        L_0x000f:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
        L_0x0010:
            xz3.p r0 = r1.f74027b
            return r0
        L_0x0013:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xz3.C26602k.mo53582a():xz3.p");
    }

    public boolean equals(Object obj) {
        return mo53582a().equals(obj);
    }

    public int hashCode() {
        return mo53582a().hashCode();
    }

    public String toString() {
        return mo53582a().toString();
    }
}
