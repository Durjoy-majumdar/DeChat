package p398x9;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p394w9.C111783b;
import p394w9.C22878a;
import p398x9.C23035c;

/* renamed from: x9.k */
public final class C23056k {

    /* renamed from: a */
    public static final /* synthetic */ int f66271a = 0;

    /* renamed from: x9.k$a */
    public enum C23057a implements C22878a<Map.Entry<?, ?>, Object> {
        VALUE {
            public final /* bridge */ /* synthetic */ Object apply(Object obj) {
                return ((Map.Entry) obj).getValue();
            }
        };

        /* access modifiers changed from: public */
        static {
            VALUE = new C23058a("VALUE", 1);
        }

        /* access modifiers changed from: public */
        C23057a(byte b) {
        }
    }

    /* renamed from: x9.k$b */
    public static abstract class C23059b<K, V> extends C23064n<Map.Entry<K, V>> {
        public void clear() {
            C23035c.C23036a.this.clear();
        }

        public abstract boolean contains(Object obj);

        public boolean isEmpty() {
            return C23035c.C23036a.this.isEmpty();
        }

        public boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return C111783b.m152398a(this, collection);
            } catch (UnsupportedOperationException unused) {
                boolean z = false;
                for (Object remove : collection) {
                    z |= ((C23035c.C23036a.C23037a) this).remove(remove);
                }
                return z;
            }
        }

        public boolean retainAll(Collection<?> collection) {
            int i;
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                int size = collection.size();
                int i2 = C23056k.f66271a;
                if (size >= 3) {
                    i = size < 1073741824 ? size + (size / 3) : Integer.MAX_VALUE;
                } else if (size >= 0) {
                    i = size + 1;
                } else {
                    throw new IllegalArgumentException("expectedSize" + " cannot be negative but was: " + size);
                }
                HashSet hashSet = new HashSet(i);
                for (Object next : collection) {
                    if (contains(next)) {
                        hashSet.add(((Map.Entry) next).getKey());
                    }
                }
                return C23035c.C23036a.this.keySet().retainAll(hashSet);
            }
        }

        public int size() {
            return C23035c.C23036a.this.size();
        }
    }

    /* renamed from: x9.k$c */
    public static abstract class C23060c<K, V> extends AbstractMap<K, V> {

        /* renamed from: d */
        public transient Set<Map.Entry<K, V>> f66273d;

        /* renamed from: e */
        public transient Collection<V> f66274e;

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f66273d;
            if (set != null) {
                return set;
            }
            C23035c.C23036a.C23037a aVar = new C23035c.C23036a.C23037a();
            this.f66273d = aVar;
            return aVar;
        }

        public Collection<V> values() {
            Collection<V> collection = this.f66274e;
            if (collection != null) {
                return collection;
            }
            C23062e eVar = new C23062e(this);
            this.f66274e = eVar;
            return eVar;
        }
    }

    /* renamed from: x9.k$d */
    public static class C23061d<K, V> extends C23064n<K> {

        /* renamed from: d */
        public final Map<K, V> f66275d;

        public C23061d(Map<K, V> map) {
            map.getClass();
            this.f66275d = map;
        }

        public boolean contains(Object obj) {
            return this.f66275d.containsKey(obj);
        }

        public boolean isEmpty() {
            return this.f66275d.isEmpty();
        }

        public int size() {
            return this.f66275d.size();
        }
    }

    /* renamed from: x9.k$e */
    public static class C23062e<K, V> extends AbstractCollection<V> {

        /* renamed from: d */
        public Map<K, V> f66276d;

        public C23062e(Map<K, V> map) {
            map.getClass();
            this.f66276d = map;
        }

        public final void clear() {
            this.f66276d.clear();
        }

        public final boolean contains(Object obj) {
            return this.f66276d.containsValue(obj);
        }

        public final boolean isEmpty() {
            return this.f66276d.isEmpty();
        }

        public final Iterator<V> iterator() {
            Iterator<Map.Entry<K, V>> it = this.f66276d.entrySet().iterator();
            int i = C23056k.f66271a;
            return new C23055j(it, C23057a.VALUE);
        }

        public final boolean remove(Object obj) {
            boolean z;
            Map.Entry next;
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                Iterator<Map.Entry<K, V>> it = this.f66276d.entrySet().iterator();
                do {
                    z = false;
                    if (!it.hasNext()) {
                        return false;
                    }
                    next = it.next();
                    Object value = next.getValue();
                    if (obj == value || (obj != null && obj.equals(value))) {
                        z = true;
                        continue;
                    }
                } while (!z);
                this.f66276d.remove(next.getKey());
                return true;
            }
        }

        public final boolean removeAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.removeAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry next : this.f66276d.entrySet()) {
                    if (collection.contains(next.getValue())) {
                        hashSet.add(next.getKey());
                    }
                }
                return this.f66276d.keySet().removeAll(hashSet);
            }
        }

        public final boolean retainAll(Collection<?> collection) {
            try {
                collection.getClass();
                return super.retainAll(collection);
            } catch (UnsupportedOperationException unused) {
                HashSet hashSet = new HashSet();
                for (Map.Entry next : this.f66276d.entrySet()) {
                    if (collection.contains(next.getValue())) {
                        hashSet.add(next.getKey());
                    }
                }
                return this.f66276d.keySet().retainAll(hashSet);
            }
        }

        public final int size() {
            return this.f66276d.size();
        }
    }

    static {
        int i = C23054g.f66269a;
    }
}
