package p291aa;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: aa.d */
public class C23620d<K, V> extends C23632k<K> implements Map<K, V> {

    /* renamed from: p */
    public transient V[] f67804p;

    /* renamed from: aa.d$a */
    public final class C16451a implements Map.Entry<K, V> {

        /* renamed from: d */
        public final K f43915d;

        /* renamed from: e */
        public V f43916e;

        /* renamed from: f */
        public final int f43917f;

        public C16451a(K k, V v, int i) {
            this.f43915d = k;
            this.f43916e = v;
            this.f43917f = i;
        }

        public final K getKey() {
            return this.f43915d;
        }

        public final V getValue() {
            return this.f43916e;
        }

        public final V setValue(V v) {
            V[] vArr = C23620d.this.f67804p;
            int i = this.f43917f;
            V v2 = vArr[i];
            V v3 = this.f43916e;
            if (v2 == v3) {
                vArr[i] = v;
                this.f43916e = v;
                return v3;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: aa.d$b */
    public class C23621b extends C16452d {

        /* renamed from: aa.d$b$a */
        public final class C23622a extends C23619c<Map.Entry<K, V>> {
            public C23622a(C23620d<K, V> dVar) {
                super(dVar);
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ Object mo37135a(int i) {
                C23620d dVar = C23620d.this;
                return new C16451a(dVar.f67821i[i], dVar.f67804p[i], i);
            }
        }

        public C23621b() {
            super();
        }

        /* renamed from: f */
        public final /* bridge */ /* synthetic */ boolean mo14911f(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C23620d.this.get(entry.getKey());
            Object value = entry.getValue();
            if (value != obj2) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        /* renamed from: h */
        public final /* bridge */ /* synthetic */ boolean mo14912h(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            int v = C23620d.this.mo37178v(entry.getKey());
            if (v < 0) {
                return false;
            }
            V value = entry.getValue();
            V v2 = C23620d.this.f67804p[v];
            if (value != v2 && (value == null || !value.equals(v2))) {
                return false;
            }
            C23620d.this.mo37132p(v);
            return true;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C23622a(C23620d.this);
        }
    }

    /* renamed from: aa.d$c */
    public class C23623c extends C16452d {
        public C23623c() {
            super();
        }

        /* renamed from: f */
        public final boolean mo14911f(K k) {
            return C23620d.this.contains(k);
        }

        /* renamed from: h */
        public final boolean mo14912h(K k) {
            return C23620d.this.remove(k) != null;
        }

        public final Iterator<K> iterator() {
            return new C23634l(C23620d.this);
        }
    }

    /* renamed from: aa.d$e */
    public class C23624e extends C16452d {

        /* renamed from: aa.d$e$a */
        public class C23625a extends C23619c<V> {
            public C23625a(C23632k kVar) {
                super(kVar);
            }

            /* renamed from: a */
            public final V mo37135a(int i) {
                return C23620d.this.f67804p[i];
            }
        }

        public C23624e() {
            super();
        }

        /* renamed from: f */
        public final boolean mo14911f(V v) {
            return C23620d.this.containsValue(v);
        }

        /* renamed from: h */
        public final boolean mo14912h(V v) {
            V v2;
            C23620d dVar = C23620d.this;
            V[] vArr = dVar.f67804p;
            Object[] objArr = dVar.f67821i;
            int length = vArr.length;
            boolean z = false;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    return z;
                }
                Object obj = objArr[i];
                if (!(obj == null || obj == C23632k.f67819n || v != vArr[i]) || ((v2 = vArr[i]) != null && v2.equals(v))) {
                    C23620d.this.mo37132p(i);
                    z = true;
                }
                length = i;
            }
        }

        public final Iterator<V> iterator() {
            return new C23625a(C23620d.this);
        }
    }

    public void clear() {
        if (this.f67798d != 0) {
            super.clear();
            Object[] objArr = this.f67821i;
            V[] vArr = this.f67804p;
            int length = objArr.length;
            while (true) {
                int i = length - 1;
                if (length > 0) {
                    objArr[i] = null;
                    vArr[i] = null;
                    length = i;
                } else {
                    return;
                }
            }
        }
    }

    public Object clone() {
        C23620d dVar = (C23620d) super.clone();
        dVar.f67804p = (Object[]) this.f67804p.clone();
        return dVar;
    }

    public boolean containsKey(Object obj) {
        return contains(obj);
    }

    public boolean containsValue(Object obj) {
        V v;
        Object[] objArr = this.f67821i;
        V[] vArr = this.f67804p;
        if (obj == null) {
            int length = vArr.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    return false;
                }
                Object obj2 = objArr[i];
                if (obj2 != null && obj2 != C23632k.f67819n && obj == vArr[i]) {
                    return true;
                }
                length = i;
            }
        } else {
            int length2 = vArr.length;
            while (true) {
                int i2 = length2 - 1;
                if (length2 <= 0) {
                    return false;
                }
                Object obj3 = objArr[i2];
                if (obj3 == null || obj3 == C23632k.f67819n || (obj != (v = vArr[i2]) && !obj.equals(v))) {
                    length2 = i2;
                }
            }
            return true;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return new C23621b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != this.f67798d) {
            return false;
        }
        Object[] objArr = this.f67821i;
        V[] vArr = this.f67804p;
        int length = objArr.length;
        while (true) {
            int i = length - 1;
            boolean z = true;
            if (length <= 0) {
                return true;
            }
            Object obj2 = objArr[i];
            if (!(obj2 == null || obj2 == C23632k.f67819n)) {
                V v = vArr[i];
                V v2 = map.get(obj2);
                if (v2 != v && (v2 == null || !v2.equals(v))) {
                    z = false;
                }
                if (!z) {
                    return false;
                }
            }
            length = i;
        }
    }

    public V get(Object obj) {
        int v = mo37178v(obj);
        if (v < 0) {
            return null;
        }
        return this.f67804p[v];
    }

    public int hashCode() {
        Object[] objArr = this.f67821i;
        V[] vArr = this.f67804p;
        int length = objArr.length;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return i;
            }
            Object obj = objArr[i2];
            if (!(obj == null || obj == C23632k.f67819n)) {
                V v = vArr[i2];
                i += ((C23632k) this.f67822j).mo37176t(obj) ^ (v == null ? 0 : v.hashCode());
            }
            length = i2;
        }
    }

    public Set<K> keySet() {
        return new C23623c();
    }

    /* renamed from: o */
    public void mo37131o(int i) {
        Object[] objArr = this.f67821i;
        int length = objArr.length;
        V[] vArr = this.f67804p;
        this.f67821i = new Object[i];
        this.f67804p = new Object[i];
        while (true) {
            int i2 = length - 1;
            if (length > 0) {
                Object obj = objArr[i2];
                if (!(obj == null || obj == C23632k.f67819n)) {
                    int w = mo37179w(obj);
                    if (w >= 0) {
                        this.f67821i[w] = obj;
                        this.f67804p[w] = vArr[i2];
                    } else {
                        mo37180x(this.f67821i[(-w) - 1], obj);
                        throw null;
                    }
                }
                length = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    public void mo37132p(int i) {
        this.f67804p[i] = null;
        super.mo37132p(i);
    }

    public V put(K k, V v) {
        if (k != null) {
            V v2 = null;
            int w = mo37179w(k);
            boolean z = false;
            boolean z2 = w < 0;
            if (z2) {
                w = (-w) - 1;
                v2 = this.f67804p[w];
            }
            Object[] objArr = this.f67821i;
            Object obj = objArr[w];
            objArr[w] = k;
            this.f67804p[w] = v;
            if (!z2) {
                if (obj == null) {
                    z = true;
                }
                mo37130n(z);
            }
            return v2;
        }
        throw new NullPointerException("null keys not supported");
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo37129m(map.size());
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    /* renamed from: r */
    public int mo37133r(int i) {
        int r = super.mo37133r(i);
        this.f67804p = new Object[r];
        return r;
    }

    public V remove(Object obj) {
        int v = mo37178v(obj);
        if (v < 0) {
            return null;
        }
        V v2 = this.f67804p[v];
        mo37132p(v);
        return v2;
    }

    /* renamed from: s */
    public C23632k mo37148s() {
        C23620d dVar = (C23620d) super.clone();
        dVar.f67804p = (Object[]) this.f67804p.clone();
        return dVar;
    }

    public Collection<V> values() {
        return new C23624e();
    }

    /* renamed from: aa.d$d */
    public abstract class C16452d<E> implements Set<E> {
        public C16452d() {
        }

        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C23620d.this.clear();
        }

        public boolean contains(Object obj) {
            return mo14911f(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object f : collection) {
                if (!mo14911f(f)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public abstract boolean mo14911f(E e);

        /* renamed from: h */
        public abstract boolean mo14912h(E e);

        public boolean isEmpty() {
            return C23620d.this.isEmpty();
        }

        public abstract Iterator<E> iterator();

        public boolean remove(Object obj) {
            return mo14912h(obj);
        }

        public boolean removeAll(Collection<?> collection) {
            boolean z = false;
            for (Object h : collection) {
                if (mo14912h(h)) {
                    z = true;
                }
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            Iterator it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public int size() {
            return C23620d.this.f67798d;
        }

        public Object[] toArray() {
            Object[] objArr = new Object[C23620d.this.f67798d];
            Iterator it = iterator();
            int i = 0;
            while (it.hasNext()) {
                objArr[i] = it.next();
                i++;
            }
            return objArr;
        }

        public <T> T[] toArray(T[] tArr) {
            int i = C23620d.this.f67798d;
            if (tArr.length < i) {
                tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
            }
            Iterator it = iterator();
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = it.next();
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }
    }
}
