package p1042u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: u.h */
public abstract class C118556h<K, V> {

    /* renamed from: a */
    public C118556h<K, V>.b f354819a;

    /* renamed from: b */
    public C118556h<K, V>.c f354820b;

    /* renamed from: c */
    public C118556h<K, V>.e f354821c;

    /* renamed from: u.h$a */
    public final class C118557a<T> implements Iterator<T> {

        /* renamed from: d */
        public final int f354822d;

        /* renamed from: e */
        public int f354823e;

        /* renamed from: f */
        public int f354824f;

        /* renamed from: g */
        public boolean f354825g = false;

        public C118557a(int i) {
            this.f354822d = i;
            this.f354823e = C118556h.this.mo124725d();
        }

        public boolean hasNext() {
            return this.f354824f < this.f354823e;
        }

        public T next() {
            if (hasNext()) {
                T b = C118556h.this.mo124723b(this.f354824f, this.f354822d);
                this.f354824f++;
                this.f354825g = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f354825g) {
                int i = this.f354824f - 1;
                this.f354824f = i;
                this.f354823e--;
                this.f354825g = false;
                C118556h.this.mo124729h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: u.h$b */
    public final class C118558b implements Set<Map.Entry<K, V>> {
        public C118558b() {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = C118556h.this.mo124725d();
            for (Map.Entry entry : collection) {
                C118556h.this.mo124728g(entry.getKey(), entry.getValue());
            }
            return d != C118556h.this.mo124725d();
        }

        public void clear() {
            C118556h.this.mo124722a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = C118556h.this.mo124726e(entry.getKey());
            if (e < 0) {
                return false;
            }
            Object b = C118556h.this.mo124723b(e, 1);
            Object value = entry.getValue();
            return b == value || (b != null && b.equals(value));
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C118556h.m167217j(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = C118556h.this.mo124725d() - 1; d >= 0; d--) {
                Object b = C118556h.this.mo124723b(d, 0);
                Object b2 = C118556h.this.mo124723b(d, 1);
                i += (b == null ? 0 : b.hashCode()) ^ (b2 == null ? 0 : b2.hashCode());
            }
            return i;
        }

        public boolean isEmpty() {
            return C118556h.this.mo124725d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C118560d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return C118556h.this.mo124725d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: u.h$d */
    public final class C118560d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: d */
        public int f354829d;

        /* renamed from: e */
        public int f354830e;

        /* renamed from: f */
        public boolean f354831f = false;

        public C118560d() {
            this.f354829d = C118556h.this.mo124725d() - 1;
            this.f354830e = -1;
        }

        public boolean equals(Object obj) {
            if (!this.f354831f) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object b = C118556h.this.mo124723b(this.f354830e, 0);
                if (!(key == b || (key != null && key.equals(b)))) {
                    return false;
                }
                Object value = entry.getValue();
                Object b2 = C118556h.this.mo124723b(this.f354830e, 1);
                return value == b2 || (value != null && value.equals(b2));
            }
        }

        public K getKey() {
            if (this.f354831f) {
                return C118556h.this.mo124723b(this.f354830e, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f354831f) {
                return C118556h.this.mo124723b(this.f354830e, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f354830e < this.f354829d;
        }

        public int hashCode() {
            if (this.f354831f) {
                int i = 0;
                Object b = C118556h.this.mo124723b(this.f354830e, 0);
                Object b2 = C118556h.this.mo124723b(this.f354830e, 1);
                int hashCode = b == null ? 0 : b.hashCode();
                if (b2 != null) {
                    i = b2.hashCode();
                }
                return hashCode ^ i;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object next() {
            if (hasNext()) {
                this.f354830e++;
                this.f354831f = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f354831f) {
                C118556h.this.mo124729h(this.f354830e);
                this.f354830e--;
                this.f354829d--;
                this.f354831f = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v) {
            if (this.f354831f) {
                return C118556h.this.mo124730i(this.f354830e, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: j */
    public static <T> boolean m167217j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: k */
    public static <K, V> boolean m167218k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: a */
    public abstract void mo124722a();

    /* renamed from: b */
    public abstract Object mo124723b(int i, int i2);

    /* renamed from: c */
    public abstract Map<K, V> mo124724c();

    /* renamed from: d */
    public abstract int mo124725d();

    /* renamed from: e */
    public abstract int mo124726e(Object obj);

    /* renamed from: f */
    public abstract int mo124727f(Object obj);

    /* renamed from: g */
    public abstract void mo124728g(K k, V v);

    /* renamed from: h */
    public abstract void mo124729h(int i);

    /* renamed from: i */
    public abstract V mo124730i(int i, V v);

    /* renamed from: l */
    public <T> T[] mo183271l(T[] tArr, int i) {
        int d = mo124725d();
        if (tArr.length < d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            tArr[i2] = mo124723b(i2, i);
        }
        if (tArr.length > d) {
            tArr[d] = null;
        }
        return tArr;
    }

    /* renamed from: u.h$c */
    public final class C118559c implements Set<K> {
        public C118559c() {
        }

        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C118556h.this.mo124722a();
        }

        public boolean contains(Object obj) {
            return C118556h.this.mo124726e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            Map c = C118556h.this.mo124724c();
            for (Object containsKey : collection) {
                if (!c.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return C118556h.m167217j(this, obj);
        }

        public int hashCode() {
            int i = 0;
            for (int d = C118556h.this.mo124725d() - 1; d >= 0; d--) {
                Object b = C118556h.this.mo124723b(d, 0);
                i += b == null ? 0 : b.hashCode();
            }
            return i;
        }

        public boolean isEmpty() {
            return C118556h.this.mo124725d() == 0;
        }

        public Iterator<K> iterator() {
            return new C118557a(0);
        }

        public boolean remove(Object obj) {
            int e = C118556h.this.mo124726e(obj);
            if (e < 0) {
                return false;
            }
            C118556h.this.mo124729h(e);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            Map c = C118556h.this.mo124724c();
            int size = c.size();
            for (Object remove : collection) {
                c.remove(remove);
            }
            return size != c.size();
        }

        public boolean retainAll(Collection<?> collection) {
            return C118556h.m167218k(C118556h.this.mo124724c(), collection);
        }

        public int size() {
            return C118556h.this.mo124725d();
        }

        public Object[] toArray() {
            C118556h hVar = C118556h.this;
            int d = hVar.mo124725d();
            Object[] objArr = new Object[d];
            for (int i = 0; i < d; i++) {
                objArr[i] = hVar.mo124723b(i, 0);
            }
            return objArr;
        }

        public <T> T[] toArray(T[] tArr) {
            return C118556h.this.mo183271l(tArr, 0);
        }
    }

    /* renamed from: u.h$e */
    public final class C118561e implements Collection<V> {
        public C118561e() {
        }

        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            C118556h.this.mo124722a();
        }

        public boolean contains(Object obj) {
            return C118556h.this.mo124727f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return C118556h.this.mo124725d() == 0;
        }

        public Iterator<V> iterator() {
            return new C118557a(1);
        }

        public boolean remove(Object obj) {
            int f = C118556h.this.mo124727f(obj);
            if (f < 0) {
                return false;
            }
            C118556h.this.mo124729h(f);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d = C118556h.this.mo124725d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(C118556h.this.mo124723b(i, 1))) {
                    C118556h.this.mo124729h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public boolean retainAll(Collection<?> collection) {
            int d = C118556h.this.mo124725d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(C118556h.this.mo124723b(i, 1))) {
                    C118556h.this.mo124729h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public int size() {
            return C118556h.this.mo124725d();
        }

        public Object[] toArray() {
            C118556h hVar = C118556h.this;
            int d = hVar.mo124725d();
            Object[] objArr = new Object[d];
            for (int i = 0; i < d; i++) {
                objArr[i] = hVar.mo124723b(i, 1);
            }
            return objArr;
        }

        public <T> T[] toArray(T[] tArr) {
            return C118556h.this.mo183271l(tArr, 1);
        }
    }
}
