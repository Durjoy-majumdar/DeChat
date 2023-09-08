package xz3;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: xz3.u */
public class C23172u<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: i */
    public static final /* synthetic */ int f66558i = 0;

    /* renamed from: d */
    public final int f66559d;

    /* renamed from: e */
    public List<C23172u<K, V>.b> f66560e = Collections.emptyList();

    /* renamed from: f */
    public Map<K, V> f66561f = Collections.emptyMap();

    /* renamed from: g */
    public boolean f66562g;

    /* renamed from: h */
    public volatile C23172u<K, V>.d f66563h;

    /* renamed from: xz3.u$b */
    public class C23173b implements Comparable<C23172u<K, V>.b>, Map.Entry<K, V> {

        /* renamed from: d */
        public final K f66564d;

        /* renamed from: e */
        public V f66565e;

        public C23173b(K k, V v) {
            this.f66564d = k;
            this.f66565e = v;
        }

        public int compareTo(Object obj) {
            return this.f66564d.compareTo(((C23173b) obj).f66564d);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f66564d;
            Object key = entry.getKey();
            if (k == null ? key == null : k.equals(key)) {
                V v = this.f66565e;
                Object value = entry.getValue();
                if (v == null ? value == null : v.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        public Object getKey() {
            return this.f66564d;
        }

        public V getValue() {
            return this.f66565e;
        }

        public int hashCode() {
            K k = this.f66564d;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f66565e;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            C23172u uVar = C23172u.this;
            int i = C23172u.f66558i;
            uVar.mo36596b();
            V v2 = this.f66565e;
            this.f66565e = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f66564d);
            String valueOf2 = String.valueOf(this.f66565e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }
    }

    /* renamed from: xz3.u$c */
    public class C23174c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: d */
        public int f66567d = -1;

        /* renamed from: e */
        public boolean f66568e;

        /* renamed from: f */
        public Iterator<Map.Entry<K, V>> f66569f;

        public C23174c(C23171t tVar) {
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo36614a() {
            if (this.f66569f == null) {
                this.f66569f = C23172u.this.f66561f.entrySet().iterator();
            }
            return this.f66569f;
        }

        public boolean hasNext() {
            return this.f66567d + 1 < C23172u.this.f66560e.size() || mo36614a().hasNext();
        }

        public Object next() {
            this.f66568e = true;
            int i = this.f66567d + 1;
            this.f66567d = i;
            return i < C23172u.this.f66560e.size() ? C23172u.this.f66560e.get(this.f66567d) : (Map.Entry) mo36614a().next();
        }

        public void remove() {
            if (this.f66568e) {
                this.f66568e = false;
                C23172u uVar = C23172u.this;
                int i = C23172u.f66558i;
                uVar.mo36596b();
                if (this.f66567d < C23172u.this.f66560e.size()) {
                    C23172u uVar2 = C23172u.this;
                    int i2 = this.f66567d;
                    this.f66567d = i2 - 1;
                    uVar2.mo36603g(i2);
                    return;
                }
                mo36614a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: xz3.u$d */
    public class C23175d extends AbstractSet<Map.Entry<K, V>> {
        public C23175d(C23171t tVar) {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C23172u.this.mo36602f((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C23172u.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C23172u.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C23174c((C23171t) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C23172u.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C23172u.this.size();
        }
    }

    /* renamed from: xz3.u$a */
    public static class C23176a {

        /* renamed from: a */
        public static final Iterator<Object> f66572a = new C23177a();

        /* renamed from: b */
        public static final Iterable<Object> f66573b = new C23178b();

        /* renamed from: xz3.u$a$a */
        public static class C23177a implements Iterator<Object> {
            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: xz3.u$a$b */
        public static class C23178b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return C23176a.f66572a;
            }
        }
    }

    public C23172u(int i, C23171t tVar) {
        this.f66559d = i;
    }

    /* renamed from: a */
    public final int mo36595a(K k) {
        int size = this.f66560e.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f66560e.get(size).f66564d);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f66560e.get(i2).f66564d);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: b */
    public final void mo36596b() {
        if (this.f66562g) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public Iterable<Map.Entry<K, V>> mo36597c() {
        return this.f66561f.isEmpty() ? C23176a.f66573b : this.f66561f.entrySet();
    }

    public void clear() {
        mo36596b();
        if (!this.f66560e.isEmpty()) {
            this.f66560e.clear();
        }
        if (!this.f66561f.isEmpty()) {
            this.f66561f.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo36595a(comparable) >= 0 || this.f66561f.containsKey(comparable);
    }

    /* renamed from: e */
    public final SortedMap<K, V> mo36600e() {
        mo36596b();
        if (this.f66561f.isEmpty() && !(this.f66561f instanceof TreeMap)) {
            this.f66561f = new TreeMap();
        }
        return (SortedMap) this.f66561f;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f66563h == null) {
            this.f66563h = new C23175d((C23171t) null);
        }
        return this.f66563h;
    }

    /* renamed from: f */
    public V mo36602f(K k, V v) {
        mo36596b();
        int a = mo36595a(k);
        if (a >= 0) {
            return this.f66560e.get(a).setValue(v);
        }
        mo36596b();
        if (this.f66560e.isEmpty() && !(this.f66560e instanceof ArrayList)) {
            this.f66560e = new ArrayList(this.f66559d);
        }
        int i = -(a + 1);
        if (i >= this.f66559d) {
            return mo36600e().put(k, v);
        }
        int size = this.f66560e.size();
        int i2 = this.f66559d;
        if (size == i2) {
            C23173b remove = this.f66560e.remove(i2 - 1);
            mo36600e().put(remove.f66564d, remove.f66565e);
        }
        this.f66560e.add(i, new C23173b(k, v));
        return null;
    }

    /* renamed from: g */
    public final V mo36603g(int i) {
        mo36596b();
        V v = this.f66560e.remove(i).f66565e;
        if (!this.f66561f.isEmpty()) {
            Iterator it = mo36600e().entrySet().iterator();
            List<C23172u<K, V>.b> list = this.f66560e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C23173b((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo36595a(comparable);
        return a >= 0 ? this.f66560e.get(a).f66565e : this.f66561f.get(comparable);
    }

    public V remove(Object obj) {
        mo36596b();
        Comparable comparable = (Comparable) obj;
        int a = mo36595a(comparable);
        if (a >= 0) {
            return mo36603g(a);
        }
        if (this.f66561f.isEmpty()) {
            return null;
        }
        return this.f66561f.remove(comparable);
    }

    public int size() {
        return this.f66560e.size() + this.f66561f.size();
    }
}
