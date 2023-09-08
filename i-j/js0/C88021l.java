package js0;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p1042u.C111055b;
import p1042u.C111059i;
import p1042u.C118556h;
import p329d3.C86165a;

/* renamed from: js0.l */
public class C88021l<K, V> {

    /* renamed from: a */
    public final Map<K, Set<V>> f254632a = new C111055b();

    /* renamed from: a */
    public void mo122460a() {
        synchronized (this.f254632a) {
            Iterator it = ((C118556h.C118561e) ((C111055b) this.f254632a).values()).iterator();
            while (it.hasNext()) {
                ((Set) it.next()).clear();
            }
            ((C111059i) this.f254632a).clear();
        }
    }

    /* renamed from: b */
    public void mo122461b(K k, C86165a<V> aVar) {
        if (k != null && aVar != null) {
            for (Object accept : mo122463d(k)) {
                aVar.accept(accept);
            }
        }
    }

    /* renamed from: c */
    public final Set<V> mo122462c(K k, boolean z) {
        Set<V> set;
        synchronized (this.f254632a) {
            set = (Set) ((C111059i) this.f254632a).getOrDefault(k, null);
            if (set == null && z) {
                set = new HashSet<>();
                ((C111059i) this.f254632a).put(k, set);
            }
        }
        return set;
    }

    /* renamed from: d */
    public Set<V> mo122463d(K k) {
        HashSet hashSet;
        if (k == null) {
            return null;
        }
        Set c = mo122462c(k, false);
        if (c == null) {
            return Collections.emptySet();
        }
        synchronized (c) {
            hashSet = new HashSet(c);
        }
        return hashSet;
    }

    /* renamed from: e */
    public boolean mo122464e(K k, V v) {
        boolean add;
        if (k == null || v == null) {
            return false;
        }
        Set c = mo122462c(k, true);
        synchronized (c) {
            add = c.add(v);
        }
        return add;
    }

    /* renamed from: f */
    public boolean mo122465f(K k, V v) {
        Set c;
        boolean remove;
        if (v == null || (c = mo122462c(k, false)) == null) {
            return false;
        }
        synchronized (c) {
            remove = c.remove(v);
        }
        return remove;
    }

    /* renamed from: g */
    public Set<V> mo122466g(K k) {
        Set<V> set;
        if (k == null) {
            return null;
        }
        synchronized (this.f254632a) {
            set = (Set) ((C111059i) this.f254632a).remove(k);
        }
        return set;
    }
}
