package p398x9;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import p394w9.C111783b;
import p398x9.C23056k;

/* renamed from: x9.c */
public abstract class C23035c<K, V> extends C23051e<K, V> implements Serializable {

    /* renamed from: g */
    public transient Map<K, Collection<V>> f66232g;

    /* renamed from: h */
    public transient int f66233h;

    /* renamed from: x9.c$a */
    public class C23036a extends C23056k.C23060c<K, Collection<V>> {

        /* renamed from: f */
        public final transient Map<K, Collection<V>> f66234f;

        /* renamed from: x9.c$a$a */
        public class C23037a extends C23056k.C23059b<K, Collection<V>> {
            public C23037a() {
            }

            public final boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = C23036a.this.f66234f.entrySet();
                int i = C23054g.f66269a;
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C23038b();
            }

            public final boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                C23035c cVar = C23035c.this;
                Object key = ((Map.Entry) obj).getKey();
                Map<K, Collection<V>> map = cVar.f66232g;
                int i = C23056k.f66271a;
                map.getClass();
                Collection<V> collection = null;
                try {
                    collection = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                }
                Collection collection2 = collection;
                if (collection2 == null) {
                    return true;
                }
                int size = collection2.size();
                collection2.clear();
                cVar.f66233h -= size;
                return true;
            }
        }

        /* renamed from: x9.c$a$b */
        public class C23038b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: d */
            public Iterator<Map.Entry<K, Collection<V>>> f66237d;

            /* renamed from: e */
            public Collection<V> f66238e;

            public C23038b() {
                this.f66237d = C23036a.this.f66234f.entrySet().iterator();
            }

            public final boolean hasNext() {
                return this.f66237d.hasNext();
            }

            public final Object next() {
                Map.Entry next = this.f66237d.next();
                this.f66238e = (Collection) next.getValue();
                C23036a aVar = C23036a.this;
                Object key = next.getKey();
                Collection c = C23035c.this.mo36353c(key, (Collection) next.getValue());
                int i = C23056k.f66271a;
                return new C38465h(key, c);
            }

            public final void remove() {
                this.f66237d.remove();
                C23035c.this.f66233h -= this.f66238e.size();
                this.f66238e.clear();
            }
        }

        public C23036a(Map<K, Collection<V>> map) {
            this.f66234f = map;
        }

        public void clear() {
            Map<K, Collection<V>> map = this.f66234f;
            C23035c cVar = C23035c.this;
            if (map == cVar.f66232g) {
                cVar.mo36352b();
                return;
            }
            C23038b bVar = new C23038b();
            while (bVar.hasNext()) {
                bVar.next();
                bVar.remove();
            }
        }

        public boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f66234f;
            int i = C23056k.f66271a;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public boolean equals(Object obj) {
            return this == obj || this.f66234f.equals(obj);
        }

        public Object get(Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.f66234f;
            int i = C23056k.f66271a;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            return C23035c.this.mo36353c(obj, collection2);
        }

        public int hashCode() {
            return this.f66234f.hashCode();
        }

        public Set<K> keySet() {
            C23035c cVar = C23035c.this;
            Set<K> set = cVar.f66264d;
            if (set == null) {
                set = cVar.f66232g instanceof SortedMap ? new C23043f((SortedMap) cVar.f66232g) : new C23039c(cVar.f66232g);
                cVar.f66264d = set;
            }
            return set;
        }

        public Object remove(Object obj) {
            Collection remove = this.f66234f.remove(obj);
            if (remove == null) {
                return null;
            }
            C23053f fVar = (C23053f) C23035c.this;
            fVar.getClass();
            ArrayList arrayList = new ArrayList(fVar.f66268i);
            arrayList.addAll(remove);
            C23035c.this.f66233h -= remove.size();
            remove.clear();
            return arrayList;
        }

        public int size() {
            return this.f66234f.size();
        }

        public String toString() {
            return this.f66234f.toString();
        }
    }

    /* renamed from: x9.c$c */
    public class C23039c extends C23056k.C23061d<K, Collection<V>> {

        /* renamed from: x9.c$c$a */
        public class C23040a implements Iterator<K> {

            /* renamed from: d */
            public Map.Entry<K, Collection<V>> f66241d;

            /* renamed from: e */
            public /* synthetic */ Iterator f66242e;

            public C23040a(Iterator it) {
                this.f66242e = it;
            }

            public final boolean hasNext() {
                return this.f66242e.hasNext();
            }

            public final K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f66242e.next();
                this.f66241d = entry;
                return entry.getKey();
            }

            public final void remove() {
                Map.Entry<K, Collection<V>> entry = this.f66241d;
                if (entry != null) {
                    Collection value = entry.getValue();
                    this.f66242e.remove();
                    C23035c.this.f66233h -= value.size();
                    value.clear();
                    return;
                }
                throw new IllegalStateException("no calls to next() since the last call to remove()");
            }
        }

        public C23039c(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            Iterator it = iterator();
            while (true) {
                C23040a aVar = (C23040a) it;
                if (aVar.hasNext()) {
                    aVar.next();
                    aVar.remove();
                } else {
                    return;
                }
            }
        }

        public boolean containsAll(Collection<?> collection) {
            return this.f66275d.keySet().containsAll(collection);
        }

        public boolean equals(Object obj) {
            return this == obj || this.f66275d.keySet().equals(obj);
        }

        public int hashCode() {
            return this.f66275d.keySet().hashCode();
        }

        public Iterator<K> iterator() {
            return new C23040a(this.f66275d.entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i;
            Collection collection = (Collection) this.f66275d.remove(obj);
            if (collection != null) {
                i = collection.size();
                collection.clear();
                C23035c.this.f66233h -= i;
            } else {
                i = 0;
            }
            return i > 0;
        }
    }

    /* renamed from: x9.c$d */
    public class C23041d extends C23046h implements RandomAccess {
        public C23041d(C23035c cVar, Object obj, List list, C23044g gVar) {
            super(obj, list, gVar);
        }
    }

    /* renamed from: x9.c$e */
    public class C23042e extends C23036a implements SortedMap {

        /* renamed from: h */
        public SortedSet<K> f66244h;

        public C23042e(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public final Comparator<? super K> comparator() {
            return ((SortedMap) this.f66234f).comparator();
        }

        public final K firstKey() {
            return ((SortedMap) this.f66234f).firstKey();
        }

        public final SortedMap<K, Collection<V>> headMap(K k) {
            return new C23042e(((SortedMap) this.f66234f).headMap(k));
        }

        public final Set keySet() {
            SortedSet<K> sortedSet = this.f66244h;
            if (sortedSet != null) {
                return sortedSet;
            }
            C23043f fVar = new C23043f((SortedMap) this.f66234f);
            this.f66244h = fVar;
            return fVar;
        }

        public final K lastKey() {
            return ((SortedMap) this.f66234f).lastKey();
        }

        public final SortedMap<K, Collection<V>> subMap(K k, K k2) {
            return new C23042e(((SortedMap) this.f66234f).subMap(k, k2));
        }

        public final SortedMap<K, Collection<V>> tailMap(K k) {
            return new C23042e(((SortedMap) this.f66234f).tailMap(k));
        }
    }

    /* renamed from: x9.c$f */
    public class C23043f extends C23039c implements SortedSet {
        public C23043f(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public final Comparator<? super K> comparator() {
            return ((SortedMap) this.f66275d).comparator();
        }

        public final K first() {
            return ((SortedMap) this.f66275d).firstKey();
        }

        public final SortedSet<K> headSet(K k) {
            return new C23043f(((SortedMap) this.f66275d).headMap(k));
        }

        public final K last() {
            return ((SortedMap) this.f66275d).lastKey();
        }

        public final SortedSet<K> subSet(K k, K k2) {
            return new C23043f(((SortedMap) this.f66275d).subMap(k, k2));
        }

        public final SortedSet<K> tailSet(K k) {
            return new C23043f(((SortedMap) this.f66275d).tailMap(k));
        }
    }

    /* renamed from: x9.c$i */
    public class C23048i extends C23044g implements Set {
        public C23048i(K k, Set<V> set) {
            super(k, set, (C23044g) null);
        }

        public final boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean a = C111783b.m152398a((Set) this.f66248e, collection);
            if (a) {
                int size2 = this.f66248e.size();
                C23035c.this.f66233h += size2 - size;
                mo36399i();
            }
            return a;
        }
    }

    /* renamed from: x9.c$j */
    public class C23049j extends C23044g implements SortedSet {
        public C23049j(Object obj, SortedSet sortedSet, C23044g gVar) {
            super(obj, sortedSet, gVar);
        }

        public final Comparator<? super V> comparator() {
            return ((SortedSet) this.f66248e).comparator();
        }

        public final V first() {
            mo36397h();
            return ((SortedSet) this.f66248e).first();
        }

        public final SortedSet<V> headSet(V v) {
            mo36397h();
            C23035c cVar = C23035c.this;
            K k = this.f66247d;
            SortedSet headSet = ((SortedSet) this.f66248e).headSet(v);
            C23044g gVar = this.f66249f;
            if (gVar == null) {
                gVar = this;
            }
            return new C23049j(k, headSet, gVar);
        }

        public final V last() {
            mo36397h();
            return ((SortedSet) this.f66248e).last();
        }

        public final SortedSet<V> subSet(V v, V v2) {
            mo36397h();
            C23035c cVar = C23035c.this;
            K k = this.f66247d;
            SortedSet subSet = ((SortedSet) this.f66248e).subSet(v, v2);
            C23044g gVar = this.f66249f;
            if (gVar == null) {
                gVar = this;
            }
            return new C23049j(k, subSet, gVar);
        }

        public final SortedSet<V> tailSet(V v) {
            mo36397h();
            C23035c cVar = C23035c.this;
            K k = this.f66247d;
            SortedSet tailSet = ((SortedSet) this.f66248e).tailSet(v);
            C23044g gVar = this.f66249f;
            if (gVar == null) {
                gVar = this;
            }
            return new C23049j(k, tailSet, gVar);
        }
    }

    /* renamed from: x9.c$b */
    public abstract class C23050b<T> implements Iterator<T> {

        /* renamed from: d */
        public Iterator<Map.Entry<K, Collection<V>>> f66259d;

        /* renamed from: e */
        public K f66260e = null;

        /* renamed from: f */
        public Collection<V> f66261f = null;

        /* renamed from: g */
        public Iterator<V> f66262g = C38466i.f101453a;

        public C23050b() {
            this.f66259d = C23035c.this.f66232g.entrySet().iterator();
        }

        public boolean hasNext() {
            return this.f66259d.hasNext() || this.f66262g.hasNext();
        }

        public T next() {
            if (!this.f66262g.hasNext()) {
                Map.Entry next = this.f66259d.next();
                this.f66260e = next.getKey();
                Collection<V> collection = (Collection) next.getValue();
                this.f66261f = collection;
                this.f66262g = collection.iterator();
            }
            return this.f66262g.next();
        }

        public void remove() {
            this.f66262g.remove();
            if (this.f66261f.isEmpty()) {
                this.f66259d.remove();
            }
            C23035c cVar = C23035c.this;
            cVar.f66233h--;
        }
    }

    public C23035c(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f66232g = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public void mo36352b() {
        for (Collection<V> clear : this.f66232g.values()) {
            clear.clear();
        }
        this.f66232g.clear();
        this.f66233h = 0;
    }

    /* renamed from: c */
    public final Collection<V> mo36353c(K k, Collection<V> collection) {
        if (collection instanceof SortedSet) {
            return new C23049j(k, (SortedSet) collection, (C23044g) null);
        }
        if (collection instanceof Set) {
            return new C23048i(k, (Set) collection);
        }
        if (!(collection instanceof List)) {
            return new C23044g(k, collection, (C23044g) null);
        }
        List list = (List) collection;
        return list instanceof RandomAccess ? new C23041d(this, k, list, (C23044g) null) : new C23046h(k, list, (C23044g) null);
    }

    /* renamed from: x9.c$h */
    public class C23046h extends C23044g implements List {

        /* renamed from: x9.c$h$a */
        public class C23047a extends C23044g.C23045a implements ListIterator {
            public C23047a() {
                super();
            }

            public final void add(V v) {
                boolean isEmpty = C23046h.this.isEmpty();
                mo36421b().add(v);
                C23046h hVar = C23046h.this;
                C23035c.this.f66233h++;
                if (isEmpty) {
                    hVar.mo36396f();
                }
            }

            /* renamed from: b */
            public final ListIterator<V> mo36421b() {
                mo36406a();
                return (ListIterator) this.f66252d;
            }

            public final boolean hasPrevious() {
                return mo36421b().hasPrevious();
            }

            public final int nextIndex() {
                return mo36421b().nextIndex();
            }

            public final V previous() {
                return mo36421b().previous();
            }

            public final int previousIndex() {
                return mo36421b().previousIndex();
            }

            public final void set(V v) {
                mo36421b().set(v);
            }

            public C23047a(int i) {
                super(((List) C23046h.this.f66248e).listIterator(i));
            }
        }

        public C23046h(Object obj, List list, C23044g gVar) {
            super(obj, list, gVar);
        }

        public void add(int i, V v) {
            mo36397h();
            boolean isEmpty = this.f66248e.isEmpty();
            ((List) this.f66248e).add(i, v);
            C23035c.this.f66233h++;
            if (isEmpty) {
                mo36396f();
            }
        }

        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f66248e).addAll(i, collection);
            if (addAll) {
                int size2 = this.f66248e.size();
                C23035c.this.f66233h += size2 - size;
                if (size == 0) {
                    mo36396f();
                }
            }
            return addAll;
        }

        public V get(int i) {
            mo36397h();
            return ((List) this.f66248e).get(i);
        }

        public int indexOf(Object obj) {
            mo36397h();
            return ((List) this.f66248e).indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            mo36397h();
            return ((List) this.f66248e).lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            mo36397h();
            return new C23047a();
        }

        public V remove(int i) {
            mo36397h();
            V remove = ((List) this.f66248e).remove(i);
            C23035c cVar = C23035c.this;
            cVar.f66233h--;
            mo36399i();
            return remove;
        }

        public V set(int i, V v) {
            mo36397h();
            return ((List) this.f66248e).set(i, v);
        }

        public List<V> subList(int i, int i2) {
            mo36397h();
            C23035c cVar = C23035c.this;
            K k = this.f66247d;
            List subList = ((List) this.f66248e).subList(i, i2);
            C23044g gVar = this.f66249f;
            if (gVar == null) {
                gVar = this;
            }
            cVar.getClass();
            return subList instanceof RandomAccess ? new C23041d(cVar, k, subList, gVar) : new C23046h(k, subList, gVar);
        }

        public ListIterator<V> listIterator(int i) {
            mo36397h();
            return new C23047a(i);
        }
    }

    /* renamed from: x9.c$g */
    public class C23044g extends AbstractCollection<V> {

        /* renamed from: d */
        public final K f66247d;

        /* renamed from: e */
        public Collection<V> f66248e;

        /* renamed from: f */
        public final C23044g f66249f;

        /* renamed from: g */
        public Collection<V> f66250g;

        public C23044g(Object obj, Collection collection, C23044g gVar) {
            this.f66247d = obj;
            this.f66248e = collection;
            this.f66249f = gVar;
            this.f66250g = gVar == null ? null : gVar.f66248e;
        }

        public boolean add(V v) {
            mo36397h();
            boolean isEmpty = this.f66248e.isEmpty();
            boolean add = this.f66248e.add(v);
            if (add) {
                C23035c.this.f66233h++;
                if (isEmpty) {
                    mo36396f();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f66248e.addAll(collection);
            if (addAll) {
                int size2 = this.f66248e.size();
                C23035c.this.f66233h += size2 - size;
                if (size == 0) {
                    mo36396f();
                }
            }
            return addAll;
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f66248e.clear();
                C23035c.this.f66233h -= size;
                mo36399i();
            }
        }

        public boolean contains(Object obj) {
            mo36397h();
            return this.f66248e.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            mo36397h();
            return this.f66248e.containsAll(collection);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            mo36397h();
            return this.f66248e.equals(obj);
        }

        /* renamed from: f */
        public final void mo36396f() {
            C23044g gVar = this.f66249f;
            if (gVar != null) {
                gVar.mo36396f();
            } else {
                C23035c.this.f66232g.put(this.f66247d, this.f66248e);
            }
        }

        /* renamed from: h */
        public final void mo36397h() {
            Collection<V> collection;
            C23044g gVar = this.f66249f;
            if (gVar != null) {
                gVar.mo36397h();
                if (this.f66249f.f66248e != this.f66250g) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f66248e.isEmpty() && (collection = C23035c.this.f66232g.get(this.f66247d)) != null) {
                this.f66248e = collection;
            }
        }

        public int hashCode() {
            mo36397h();
            return this.f66248e.hashCode();
        }

        /* renamed from: i */
        public final void mo36399i() {
            C23044g gVar = this.f66249f;
            if (gVar != null) {
                gVar.mo36399i();
            } else if (this.f66248e.isEmpty()) {
                C23035c.this.f66232g.remove(this.f66247d);
            }
        }

        public Iterator<V> iterator() {
            mo36397h();
            return new C23045a();
        }

        public boolean remove(Object obj) {
            mo36397h();
            boolean remove = this.f66248e.remove(obj);
            if (remove) {
                C23035c cVar = C23035c.this;
                cVar.f66233h--;
                mo36399i();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f66248e.removeAll(collection);
            if (removeAll) {
                int size2 = this.f66248e.size();
                C23035c.this.f66233h += size2 - size;
                mo36399i();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean retainAll = this.f66248e.retainAll(collection);
            if (retainAll) {
                int size2 = this.f66248e.size();
                C23035c.this.f66233h += size2 - size;
                mo36399i();
            }
            return retainAll;
        }

        public int size() {
            mo36397h();
            return this.f66248e.size();
        }

        public String toString() {
            mo36397h();
            return this.f66248e.toString();
        }

        /* renamed from: x9.c$g$a */
        public class C23045a implements Iterator<V> {

            /* renamed from: d */
            public final Iterator<V> f66252d;

            /* renamed from: e */
            public Collection<V> f66253e;

            public C23045a() {
                Collection<V> collection = C23044g.this.f66248e;
                this.f66253e = collection;
                C23035c cVar = C23035c.this;
                this.f66252d = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
            }

            /* renamed from: a */
            public final void mo36406a() {
                C23044g.this.mo36397h();
                if (C23044g.this.f66248e != this.f66253e) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                mo36406a();
                return this.f66252d.hasNext();
            }

            public V next() {
                mo36406a();
                return this.f66252d.next();
            }

            public void remove() {
                this.f66252d.remove();
                C23044g gVar = C23044g.this;
                C23035c cVar = C23035c.this;
                cVar.f66233h--;
                gVar.mo36399i();
            }

            public C23045a(Iterator<V> it) {
                this.f66253e = C23044g.this.f66248e;
                this.f66252d = it;
            }
        }
    }
}
