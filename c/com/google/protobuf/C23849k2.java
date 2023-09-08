package com.google.protobuf;

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

/* renamed from: com.google.protobuf.k2 */
public class C23849k2<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: j */
    public static final /* synthetic */ int f68342j = 0;

    /* renamed from: d */
    public final int f68343d;

    /* renamed from: e */
    public List<C23849k2<K, V>.b> f68344e = Collections.emptyList();

    /* renamed from: f */
    public Map<K, V> f68345f = Collections.emptyMap();

    /* renamed from: g */
    public boolean f68346g;

    /* renamed from: h */
    public volatile C23849k2<K, V>.d f68347h;

    /* renamed from: i */
    public Map<K, V> f68348i = Collections.emptyMap();

    /* renamed from: com.google.protobuf.k2$b */
    public class C23850b implements Map.Entry<K, V>, Comparable<C23849k2<K, V>.b> {

        /* renamed from: d */
        public final K f68349d;

        /* renamed from: e */
        public V f68350e;

        public C23850b(K k, V v) {
            this.f68349d = k;
            this.f68350e = v;
        }

        public int compareTo(Object obj) {
            return this.f68349d.compareTo(((C23850b) obj).f68349d);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f68349d;
            Object key = entry.getKey();
            if (k == null ? key == null : k.equals(key)) {
                V v = this.f68350e;
                Object value = entry.getValue();
                if (v == null ? value == null : v.equals(value)) {
                    return true;
                }
            }
            return false;
        }

        public Object getKey() {
            return this.f68349d;
        }

        public V getValue() {
            return this.f68350e;
        }

        public int hashCode() {
            K k = this.f68349d;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f68350e;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            C23849k2 k2Var = C23849k2.this;
            int i = C23849k2.f68342j;
            k2Var.mo37716b();
            V v2 = this.f68350e;
            this.f68350e = v;
            return v2;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f68349d);
            String valueOf2 = String.valueOf(this.f68350e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 1 + valueOf2.length());
            sb.append(valueOf);
            sb.append("=");
            sb.append(valueOf2);
            return sb.toString();
        }
    }

    /* renamed from: com.google.protobuf.k2$c */
    public class C23851c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: d */
        public int f68352d = -1;

        /* renamed from: e */
        public boolean f68353e;

        /* renamed from: f */
        public Iterator<Map.Entry<K, V>> f68354f;

        public C23851c(C23847j2 j2Var) {
        }

        /* renamed from: a */
        public final Iterator<Map.Entry<K, V>> mo37738a() {
            if (this.f68354f == null) {
                this.f68354f = C23849k2.this.f68345f.entrySet().iterator();
            }
            return this.f68354f;
        }

        public boolean hasNext() {
            if (this.f68352d + 1 >= C23849k2.this.f68344e.size()) {
                return !C23849k2.this.f68345f.isEmpty() && mo37738a().hasNext();
            }
            return true;
        }

        public Object next() {
            this.f68353e = true;
            int i = this.f68352d + 1;
            this.f68352d = i;
            return i < C23849k2.this.f68344e.size() ? C23849k2.this.f68344e.get(this.f68352d) : (Map.Entry) mo37738a().next();
        }

        public void remove() {
            if (this.f68353e) {
                this.f68353e = false;
                C23849k2 k2Var = C23849k2.this;
                int i = C23849k2.f68342j;
                k2Var.mo37716b();
                if (this.f68352d < C23849k2.this.f68344e.size()) {
                    C23849k2 k2Var2 = C23849k2.this;
                    int i2 = this.f68352d;
                    this.f68352d = i2 - 1;
                    k2Var2.mo37728k(i2);
                    return;
                }
                mo37738a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: com.google.protobuf.k2$d */
    public class C23852d extends AbstractSet<Map.Entry<K, V>> {
        public C23852d(C23847j2 j2Var) {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C23849k2.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C23849k2.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C23849k2.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C23851c((C23847j2) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C23849k2.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C23849k2.this.size();
        }
    }

    /* renamed from: com.google.protobuf.k2$a */
    public static class C23853a {

        /* renamed from: a */
        public static final Iterator<Object> f68357a = new C23854a();

        /* renamed from: b */
        public static final Iterable<Object> f68358b = new C23855b();

        /* renamed from: com.google.protobuf.k2$a$a */
        public class C23854a implements Iterator<Object> {
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

        /* renamed from: com.google.protobuf.k2$a$b */
        public class C23855b implements Iterable<Object> {
            public Iterator<Object> iterator() {
                return C23853a.f68357a;
            }
        }
    }

    public C23849k2(int i, C23847j2 j2Var) {
        this.f68343d = i;
    }

    /* renamed from: a */
    public final int mo37715a(K k) {
        int size = this.f68344e.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f68344e.get(size).f68349d);
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
            int compareTo2 = k.compareTo(this.f68344e.get(i2).f68349d);
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
    public final void mo37716b() {
        if (this.f68346g) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public Map.Entry<K, V> mo37717c(int i) {
        return this.f68344e.get(i);
    }

    public void clear() {
        mo37716b();
        if (!this.f68344e.isEmpty()) {
            this.f68344e.clear();
        }
        if (!this.f68345f.isEmpty()) {
            this.f68345f.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return mo37715a(comparable) >= 0 || this.f68345f.containsKey(comparable);
    }

    /* renamed from: e */
    public int mo37720e() {
        return this.f68344e.size();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f68347h == null) {
            this.f68347h = new C23852d((C23847j2) null);
        }
        return this.f68347h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23849k2)) {
            return super.equals(obj);
        }
        C23849k2 k2Var = (C23849k2) obj;
        int size = size();
        if (size != k2Var.size()) {
            return false;
        }
        int e = mo37720e();
        if (e != k2Var.mo37720e()) {
            return entrySet().equals(k2Var.entrySet());
        }
        for (int i = 0; i < e; i++) {
            if (!mo37717c(i).equals(k2Var.mo37717c(i))) {
                return false;
            }
        }
        if (e != size) {
            return this.f68345f.equals(k2Var.f68345f);
        }
        return true;
    }

    /* renamed from: f */
    public Iterable<Map.Entry<K, V>> mo37723f() {
        return this.f68345f.isEmpty() ? C23853a.f68358b : this.f68345f.entrySet();
    }

    /* renamed from: g */
    public final SortedMap<K, V> mo37724g() {
        mo37716b();
        if (this.f68345f.isEmpty() && !(this.f68345f instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f68345f = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f68348i = treeMap.descendingMap();
        }
        return (SortedMap) this.f68345f;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo37715a(comparable);
        return a >= 0 ? this.f68344e.get(a).f68350e : this.f68345f.get(comparable);
    }

    public int hashCode() {
        int e = mo37720e();
        int i = 0;
        for (int i2 = 0; i2 < e; i2++) {
            i += this.f68344e.get(i2).hashCode();
        }
        return this.f68345f.size() > 0 ? i + this.f68345f.hashCode() : i;
    }

    /* renamed from: i */
    public void mo37712i() {
        if (!this.f68346g) {
            this.f68345f = this.f68345f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f68345f);
            this.f68348i = this.f68348i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f68348i);
            this.f68346g = true;
        }
    }

    /* renamed from: j */
    public V put(K k, V v) {
        mo37716b();
        int a = mo37715a(k);
        if (a >= 0) {
            return this.f68344e.get(a).setValue(v);
        }
        mo37716b();
        if (this.f68344e.isEmpty() && !(this.f68344e instanceof ArrayList)) {
            this.f68344e = new ArrayList(this.f68343d);
        }
        int i = -(a + 1);
        if (i >= this.f68343d) {
            return mo37724g().put(k, v);
        }
        int size = this.f68344e.size();
        int i2 = this.f68343d;
        if (size == i2) {
            C23850b remove = this.f68344e.remove(i2 - 1);
            mo37724g().put(remove.f68349d, remove.f68350e);
        }
        this.f68344e.add(i, new C23850b(k, v));
        return null;
    }

    /* renamed from: k */
    public final V mo37728k(int i) {
        mo37716b();
        V v = this.f68344e.remove(i).f68350e;
        if (!this.f68345f.isEmpty()) {
            Iterator it = mo37724g().entrySet().iterator();
            List<C23849k2<K, V>.b> list = this.f68344e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C23850b((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    public V remove(Object obj) {
        mo37716b();
        Comparable comparable = (Comparable) obj;
        int a = mo37715a(comparable);
        if (a >= 0) {
            return mo37728k(a);
        }
        if (this.f68345f.isEmpty()) {
            return null;
        }
        return this.f68345f.remove(comparable);
    }

    public int size() {
        return this.f68344e.size() + this.f68345f.size();
    }
}
