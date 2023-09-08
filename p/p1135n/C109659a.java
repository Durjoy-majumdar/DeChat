package p1135n;

import java.util.HashMap;
import p1135n.C109660b;

/* renamed from: n.a */
public class C109659a<K, V> extends C109660b<K, V> {

    /* renamed from: h */
    public HashMap<K, C109660b.C109663c<K, V>> f328278h = new HashMap<>();

    /* renamed from: f */
    public C109660b.C109663c<K, V> mo160871f(K k) {
        return this.f328278h.get(k);
    }

    /* renamed from: h */
    public V mo160872h(K k, V v) {
        C109660b.C109663c f = mo160871f(k);
        if (f != null) {
            return f.f328284e;
        }
        HashMap<K, C109660b.C109663c<K, V>> hashMap = this.f328278h;
        C109660b.C109663c<K, V> cVar = new C109660b.C109663c<>(k, v);
        this.f328282g++;
        C109660b.C109663c<K, V> cVar2 = this.f328280e;
        if (cVar2 == null) {
            this.f328279d = cVar;
            this.f328280e = cVar;
        } else {
            cVar2.f328285f = cVar;
            cVar.f328286g = cVar2;
            this.f328280e = cVar;
        }
        hashMap.put(k, cVar);
        return null;
    }

    /* renamed from: i */
    public V mo160873i(K k) {
        V i = super.mo160873i(k);
        this.f328278h.remove(k);
        return i;
    }
}
