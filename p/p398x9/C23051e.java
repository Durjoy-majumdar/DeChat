package p398x9;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p398x9.C23035c;
import p398x9.C23056k;

/* renamed from: x9.e */
public abstract class C23051e<K, V> implements C23063l<K, V> {

    /* renamed from: d */
    public transient Set<K> f66264d;

    /* renamed from: e */
    public transient Collection<V> f66265e;

    /* renamed from: f */
    public transient Map<K, Collection<V>> f66266f;

    /* renamed from: x9.e$a */
    public class C23052a extends AbstractCollection<V> {
        public C23052a() {
        }

        public final void clear() {
            ((C23035c) C23051e.this).mo36352b();
        }

        public final boolean contains(Object obj) {
            for (Collection contains : ((C23056k.C23060c) C23051e.this.mo36350a()).values()) {
                if (contains.contains(obj)) {
                    return true;
                }
            }
            return false;
        }

        public final Iterator<V> iterator() {
            C23035c cVar = (C23035c) C23051e.this;
            cVar.getClass();
            return new C38463b(cVar);
        }

        public final int size() {
            return ((C23035c) C23051e.this).f66233h;
        }
    }

    /* renamed from: a */
    public abstract Map<K, Collection<V>> mo36350a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23063l)) {
            return false;
        }
        return ((C23035c.C23036a) ((C23034a) this).mo36350a()).equals(((C23063l) obj).mo36350a());
    }

    public int hashCode() {
        return ((C23035c.C23036a) mo36350a()).hashCode();
    }

    public String toString() {
        return mo36350a().toString();
    }
}
