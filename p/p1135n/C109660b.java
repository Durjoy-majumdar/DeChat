package p1135n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: n.b */
public class C109660b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: d */
    public C109663c<K, V> f328279d;

    /* renamed from: e */
    public C109663c<K, V> f328280e;

    /* renamed from: f */
    public WeakHashMap<C109666f<K, V>, Boolean> f328281f = new WeakHashMap<>();

    /* renamed from: g */
    public int f328282g = 0;

    /* renamed from: n.b$a */
    public static class C109661a<K, V> extends C109665e<K, V> {
        public C109661a(C109663c<K, V> cVar, C109663c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public C109663c<K, V> mo160878b(C109663c<K, V> cVar) {
            return cVar.f328286g;
        }

        /* renamed from: c */
        public C109663c<K, V> mo160879c(C109663c<K, V> cVar) {
            return cVar.f328285f;
        }
    }

    /* renamed from: n.b$b */
    public static class C109662b<K, V> extends C109665e<K, V> {
        public C109662b(C109663c<K, V> cVar, C109663c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        /* renamed from: b */
        public C109663c<K, V> mo160878b(C109663c<K, V> cVar) {
            return cVar.f328285f;
        }

        /* renamed from: c */
        public C109663c<K, V> mo160879c(C109663c<K, V> cVar) {
            return cVar.f328286g;
        }
    }

    /* renamed from: n.b$c */
    public static class C109663c<K, V> implements Map.Entry<K, V> {

        /* renamed from: d */
        public final K f328283d;

        /* renamed from: e */
        public final V f328284e;

        /* renamed from: f */
        public C109663c<K, V> f328285f;

        /* renamed from: g */
        public C109663c<K, V> f328286g;

        public C109663c(K k, V v) {
            this.f328283d = k;
            this.f328284e = v;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C109663c)) {
                return false;
            }
            C109663c cVar = (C109663c) obj;
            return this.f328283d.equals(cVar.f328283d) && this.f328284e.equals(cVar.f328284e);
        }

        public K getKey() {
            return this.f328283d;
        }

        public V getValue() {
            return this.f328284e;
        }

        public int hashCode() {
            return this.f328283d.hashCode() ^ this.f328284e.hashCode();
        }

        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f328283d + "=" + this.f328284e;
        }
    }

    /* renamed from: n.b$d */
    public class C109664d implements Iterator<Map.Entry<K, V>>, C109666f<K, V> {

        /* renamed from: d */
        public C109663c<K, V> f328287d;

        /* renamed from: e */
        public boolean f328288e = true;

        public C109664d() {
        }

        /* renamed from: a */
        public void mo160886a(C109663c<K, V> cVar) {
            C109663c<K, V> cVar2 = this.f328287d;
            if (cVar == cVar2) {
                C109663c<K, V> cVar3 = cVar2.f328286g;
                this.f328287d = cVar3;
                this.f328288e = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (this.f328288e) {
                return C109660b.this.f328279d != null;
            }
            C109663c<K, V> cVar = this.f328287d;
            return (cVar == null || cVar.f328285f == null) ? false : true;
        }

        public Object next() {
            if (this.f328288e) {
                this.f328288e = false;
                this.f328287d = C109660b.this.f328279d;
            } else {
                C109663c<K, V> cVar = this.f328287d;
                this.f328287d = cVar != null ? cVar.f328285f : null;
            }
            return this.f328287d;
        }
    }

    /* renamed from: n.b$e */
    public static abstract class C109665e<K, V> implements Iterator<Map.Entry<K, V>>, C109666f<K, V> {

        /* renamed from: d */
        public C109663c<K, V> f328290d;

        /* renamed from: e */
        public C109663c<K, V> f328291e;

        public C109665e(C109663c<K, V> cVar, C109663c<K, V> cVar2) {
            this.f328290d = cVar2;
            this.f328291e = cVar;
        }

        /* renamed from: a */
        public void mo160886a(C109663c<K, V> cVar) {
            C109663c<K, V> cVar2 = null;
            if (this.f328290d == cVar && cVar == this.f328291e) {
                this.f328291e = null;
                this.f328290d = null;
            }
            C109663c<K, V> cVar3 = this.f328290d;
            if (cVar3 == cVar) {
                this.f328290d = mo160878b(cVar3);
            }
            C109663c<K, V> cVar4 = this.f328291e;
            if (cVar4 == cVar) {
                C109663c<K, V> cVar5 = this.f328290d;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = mo160879c(cVar4);
                }
                this.f328291e = cVar2;
            }
        }

        /* renamed from: b */
        public abstract C109663c<K, V> mo160878b(C109663c<K, V> cVar);

        /* renamed from: c */
        public abstract C109663c<K, V> mo160879c(C109663c<K, V> cVar);

        public boolean hasNext() {
            return this.f328291e != null;
        }

        public Object next() {
            C109663c<K, V> cVar = this.f328291e;
            C109663c<K, V> cVar2 = this.f328290d;
            this.f328291e = (cVar == cVar2 || cVar2 == null) ? null : mo160879c(cVar);
            return cVar;
        }
    }

    /* renamed from: n.b$f */
    public interface C109666f<K, V> {
        /* renamed from: a */
        void mo160886a(C109663c<K, V> cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((p1135n.C109660b.C109665e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof p1135n.C109660b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            n.b r7 = (p1135n.C109660b) r7
            int r1 = r6.f328282g
            int r3 = r7.f328282g
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            n.b$e r3 = (p1135n.C109660b.C109665e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            n.b$e r4 = (p1135n.C109660b.C109665e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            n.b$e r7 = (p1135n.C109660b.C109665e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1135n.C109660b.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public C109663c<K, V> mo160871f(K k) {
        C109663c<K, V> cVar = this.f328279d;
        while (cVar != null && !cVar.f328283d.equals(k)) {
            cVar = cVar.f328285f;
        }
        return cVar;
    }

    /* renamed from: h */
    public V mo160872h(K k, V v) {
        C109663c f = mo160871f(k);
        if (f != null) {
            return f.f328284e;
        }
        C109663c<K, V> cVar = new C109663c<>(k, v);
        this.f328282g++;
        C109663c<K, V> cVar2 = this.f328280e;
        if (cVar2 == null) {
            this.f328279d = cVar;
            this.f328280e = cVar;
            return null;
        }
        cVar2.f328285f = cVar;
        cVar.f328286g = cVar2;
        this.f328280e = cVar;
        return null;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            C109665e eVar = (C109665e) it;
            if (!eVar.hasNext()) {
                return i;
            }
            i += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    /* renamed from: i */
    public V mo160873i(K k) {
        C109663c f = mo160871f(k);
        if (f == null) {
            return null;
        }
        this.f328282g--;
        if (!this.f328281f.isEmpty()) {
            for (C109666f<K, V> a : this.f328281f.keySet()) {
                a.mo160886a(f);
            }
        }
        C109663c<K, V> cVar = f.f328286g;
        if (cVar != null) {
            cVar.f328285f = f.f328285f;
        } else {
            this.f328279d = f.f328285f;
        }
        C109663c<K, V> cVar2 = f.f328285f;
        if (cVar2 != null) {
            cVar2.f328286g = cVar;
        } else {
            this.f328280e = cVar;
        }
        f.f328285f = null;
        f.f328286g = null;
        return f.f328284e;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        C109661a aVar = new C109661a(this.f328279d, this.f328280e);
        this.f328281f.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (true) {
            C109665e eVar = (C109665e) it;
            if (eVar.hasNext()) {
                sb.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
