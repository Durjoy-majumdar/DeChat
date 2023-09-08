package com.google.protobuf;

import com.google.protobuf.C24074y0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.protobuf.a1 */
public class C16976a1<K, V> implements C17012q1 {

    /* renamed from: a */
    public volatile boolean f45972a;

    /* renamed from: b */
    public volatile C16983d f45973b;

    /* renamed from: c */
    public C16979c<K, V> f45974c;

    /* renamed from: d */
    public List<C23836g1> f45975d;

    /* renamed from: e */
    public final C16977a<K, V> f45976e;

    /* renamed from: com.google.protobuf.a1$a */
    public interface C16977a<K, V> {
    }

    /* renamed from: com.google.protobuf.a1$b */
    public static class C16978b<K, V> implements C16977a<K, V> {

        /* renamed from: a */
        public final C24074y0<K, V> f45977a;

        public C16978b(C24074y0<K, V> y0Var) {
            this.f45977a = y0Var;
        }
    }

    /* renamed from: com.google.protobuf.a1$c */
    public static class C16979c<K, V> implements Map<K, V> {

        /* renamed from: d */
        public final C17012q1 f45978d;

        /* renamed from: e */
        public final Map<K, V> f45979e;

        /* renamed from: com.google.protobuf.a1$c$a */
        public static class C16980a<E> implements Collection<E> {

            /* renamed from: d */
            public final C17012q1 f45980d;

            /* renamed from: e */
            public final Collection<E> f45981e;

            public C16980a(C17012q1 q1Var, Collection<E> collection) {
                this.f45980d = q1Var;
                this.f45981e = collection;
            }

            public boolean add(E e) {
                throw new UnsupportedOperationException();
            }

            public boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }

            public void clear() {
                ((C16976a1) this.f45980d).mo18653c();
                this.f45981e.clear();
            }

            public boolean contains(Object obj) {
                return this.f45981e.contains(obj);
            }

            public boolean containsAll(Collection<?> collection) {
                return this.f45981e.containsAll(collection);
            }

            public boolean equals(Object obj) {
                return this.f45981e.equals(obj);
            }

            public int hashCode() {
                return this.f45981e.hashCode();
            }

            public boolean isEmpty() {
                return this.f45981e.isEmpty();
            }

            public Iterator<E> iterator() {
                return new C16981b(this.f45980d, this.f45981e.iterator());
            }

            public boolean remove(Object obj) {
                ((C16976a1) this.f45980d).mo18653c();
                return this.f45981e.remove(obj);
            }

            public boolean removeAll(Collection<?> collection) {
                ((C16976a1) this.f45980d).mo18653c();
                return this.f45981e.removeAll(collection);
            }

            public boolean retainAll(Collection<?> collection) {
                ((C16976a1) this.f45980d).mo18653c();
                return this.f45981e.retainAll(collection);
            }

            public int size() {
                return this.f45981e.size();
            }

            public Object[] toArray() {
                return this.f45981e.toArray();
            }

            public String toString() {
                return this.f45981e.toString();
            }

            public <T> T[] toArray(T[] tArr) {
                return this.f45981e.toArray(tArr);
            }
        }

        /* renamed from: com.google.protobuf.a1$c$b */
        public static class C16981b<E> implements Iterator<E> {

            /* renamed from: d */
            public final C17012q1 f45982d;

            /* renamed from: e */
            public final Iterator<E> f45983e;

            public C16981b(C17012q1 q1Var, Iterator<E> it) {
                this.f45982d = q1Var;
                this.f45983e = it;
            }

            public boolean equals(Object obj) {
                return this.f45983e.equals(obj);
            }

            public boolean hasNext() {
                return this.f45983e.hasNext();
            }

            public int hashCode() {
                return this.f45983e.hashCode();
            }

            public E next() {
                return this.f45983e.next();
            }

            public void remove() {
                ((C16976a1) this.f45982d).mo18653c();
                this.f45983e.remove();
            }

            public String toString() {
                return this.f45983e.toString();
            }
        }

        /* renamed from: com.google.protobuf.a1$c$c */
        public static class C16982c<E> implements Set<E> {

            /* renamed from: d */
            public final C17012q1 f45984d;

            /* renamed from: e */
            public final Set<E> f45985e;

            public C16982c(C17012q1 q1Var, Set<E> set) {
                this.f45984d = q1Var;
                this.f45985e = set;
            }

            public boolean add(E e) {
                ((C16976a1) this.f45984d).mo18653c();
                return this.f45985e.add(e);
            }

            public boolean addAll(Collection<? extends E> collection) {
                ((C16976a1) this.f45984d).mo18653c();
                return this.f45985e.addAll(collection);
            }

            public void clear() {
                ((C16976a1) this.f45984d).mo18653c();
                this.f45985e.clear();
            }

            public boolean contains(Object obj) {
                return this.f45985e.contains(obj);
            }

            public boolean containsAll(Collection<?> collection) {
                return this.f45985e.containsAll(collection);
            }

            public boolean equals(Object obj) {
                return this.f45985e.equals(obj);
            }

            public int hashCode() {
                return this.f45985e.hashCode();
            }

            public boolean isEmpty() {
                return this.f45985e.isEmpty();
            }

            public Iterator<E> iterator() {
                return new C16981b(this.f45984d, this.f45985e.iterator());
            }

            public boolean remove(Object obj) {
                ((C16976a1) this.f45984d).mo18653c();
                return this.f45985e.remove(obj);
            }

            public boolean removeAll(Collection<?> collection) {
                ((C16976a1) this.f45984d).mo18653c();
                return this.f45985e.removeAll(collection);
            }

            public boolean retainAll(Collection<?> collection) {
                ((C16976a1) this.f45984d).mo18653c();
                return this.f45985e.retainAll(collection);
            }

            public int size() {
                return this.f45985e.size();
            }

            public Object[] toArray() {
                return this.f45985e.toArray();
            }

            public String toString() {
                return this.f45985e.toString();
            }

            public <T> T[] toArray(T[] tArr) {
                return this.f45985e.toArray(tArr);
            }
        }

        public C16979c(C17012q1 q1Var, Map<K, V> map) {
            this.f45978d = q1Var;
            this.f45979e = map;
        }

        public void clear() {
            ((C16976a1) this.f45978d).mo18653c();
            this.f45979e.clear();
        }

        public boolean containsKey(Object obj) {
            return this.f45979e.containsKey(obj);
        }

        public boolean containsValue(Object obj) {
            return this.f45979e.containsValue(obj);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            return new C16982c(this.f45978d, this.f45979e.entrySet());
        }

        public boolean equals(Object obj) {
            return this.f45979e.equals(obj);
        }

        public V get(Object obj) {
            return this.f45979e.get(obj);
        }

        public int hashCode() {
            return this.f45979e.hashCode();
        }

        public boolean isEmpty() {
            return this.f45979e.isEmpty();
        }

        public Set<K> keySet() {
            return new C16982c(this.f45978d, this.f45979e.keySet());
        }

        public V put(K k, V v) {
            ((C16976a1) this.f45978d).mo18653c();
            Charset charset = C23908o0.f68505a;
            k.getClass();
            v.getClass();
            return this.f45979e.put(k, v);
        }

        public void putAll(Map<? extends K, ? extends V> map) {
            ((C16976a1) this.f45978d).mo18653c();
            for (Object next : map.keySet()) {
                Charset charset = C23908o0.f68505a;
                next.getClass();
                map.get(next).getClass();
            }
            this.f45979e.putAll(map);
        }

        public V remove(Object obj) {
            ((C16976a1) this.f45978d).mo18653c();
            return this.f45979e.remove(obj);
        }

        public int size() {
            return this.f45979e.size();
        }

        public String toString() {
            return this.f45979e.toString();
        }

        public Collection<V> values() {
            return new C16980a(this.f45978d, this.f45979e.values());
        }
    }

    /* renamed from: com.google.protobuf.a1$d */
    public enum C16983d {
        MAP,
        LIST,
        BOTH
    }

    public C16976a1(C16977a<K, V> aVar, C16983d dVar, Map<K, V> map) {
        this.f45976e = aVar;
        this.f45972a = true;
        this.f45973b = dVar;
        this.f45974c = new C16979c<>(this, map);
        this.f45975d = null;
    }

    /* renamed from: a */
    public final C16979c<K, V> mo18651a(List<C23836g1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<C23836g1> it = list.iterator();
        while (it.hasNext()) {
            ((C16978b) this.f45976e).getClass();
            C24074y0 y0Var = (C24074y0) it.next();
            linkedHashMap.put(y0Var.f69205d, y0Var.f69206e);
        }
        return new C16979c<>(this, linkedHashMap);
    }

    /* renamed from: b */
    public final List<C23836g1> mo18652b(C16979c<K, V> cVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C16979c.C16982c) cVar.entrySet()).iterator();
        while (true) {
            C16979c.C16981b bVar = (C16979c.C16981b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            Map.Entry entry = (Map.Entry) bVar.next();
            K key = entry.getKey();
            V value = entry.getValue();
            C24074y0.C24075b<K, V> b = ((C16978b) this.f45976e).f45977a.newBuilderForType();
            b.f69210e = key;
            b.f69212g = true;
            b.f69211f = value;
            b.f69213h = true;
            arrayList.add(new C24074y0(b.f69209d, key, value));
        }
    }

    /* renamed from: c */
    public void mo18653c() {
        if (!this.f45972a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: d */
    public List<C23836g1> mo18654d() {
        C16983d dVar = this.f45973b;
        C16983d dVar2 = C16983d.MAP;
        if (dVar == dVar2) {
            synchronized (this) {
                if (this.f45973b == dVar2) {
                    this.f45975d = mo18652b(this.f45974c);
                    this.f45973b = C16983d.BOTH;
                }
            }
        }
        return Collections.unmodifiableList(this.f45975d);
    }

    /* renamed from: e */
    public Map<K, V> mo18655e() {
        C16983d dVar = this.f45973b;
        C16983d dVar2 = C16983d.LIST;
        if (dVar == dVar2) {
            synchronized (this) {
                if (this.f45973b == dVar2) {
                    this.f45974c = mo18651a(this.f45975d);
                    this.f45973b = C16983d.BOTH;
                }
            }
        }
        return Collections.unmodifiableMap(this.f45974c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C16976a1)) {
            return false;
        }
        return C16985b1.m16767f(mo18655e(), ((C16976a1) obj).mo18655e());
    }

    /* renamed from: f */
    public List<C23836g1> mo18657f() {
        C16983d dVar = this.f45973b;
        C16983d dVar2 = C16983d.LIST;
        if (dVar != dVar2) {
            if (this.f45973b == C16983d.MAP) {
                this.f45975d = mo18652b(this.f45974c);
            }
            this.f45974c = null;
            this.f45973b = dVar2;
        }
        return this.f45975d;
    }

    /* renamed from: g */
    public Map<K, V> mo18658g() {
        C16983d dVar = this.f45973b;
        C16983d dVar2 = C16983d.MAP;
        if (dVar != dVar2) {
            if (this.f45973b == C16983d.LIST) {
                this.f45974c = mo18651a(this.f45975d);
            }
            this.f45975d = null;
            this.f45973b = dVar2;
        }
        return this.f45974c;
    }

    public int hashCode() {
        return C16985b1.m16764a(mo18655e());
    }

    public C16976a1(C24074y0<K, V> y0Var, C16983d dVar, Map<K, V> map) {
        this(new C16978b(y0Var), dVar, map);
    }
}
