package p631o1;

import gy3.C59742g;
import gy3.C8480h;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: o1.y0 */
public interface C109897y0 {

    /* renamed from: o1.y0$a */
    public static final class C109898a implements Collection<Object>, C33145a {

        /* renamed from: d */
        public final Set<Object> f328844d;

        public C109898a(Set<Object> set, int i, C8480h hVar) {
            set = (i & 1) != 0 ? new LinkedHashSet<>() : set;
            C87412m.m108594g(set, "set");
            this.f328844d = set;
        }

        public boolean add(Object obj) {
            return this.f328844d.add(obj);
        }

        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void clear() {
            this.f328844d.clear();
        }

        public boolean contains(Object obj) {
            return this.f328844d.contains(obj);
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            C87412m.m108594g(collection, "elements");
            return this.f328844d.containsAll(collection);
        }

        public boolean isEmpty() {
            return this.f328844d.isEmpty();
        }

        public Iterator<Object> iterator() {
            return this.f328844d.iterator();
        }

        public final boolean remove(Object obj) {
            return this.f328844d.remove(obj);
        }

        public final boolean removeAll(Collection<? extends Object> collection) {
            C87412m.m108594g(collection, "slotIds");
            return this.f328844d.remove(collection);
        }

        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean retainAll(Collection<? extends Object> collection) {
            C87412m.m108594g(collection, "slotIds");
            return this.f328844d.retainAll(collection);
        }

        public final int size() {
            return this.f328844d.size();
        }

        public Object[] toArray() {
            return C59742g.m69648a(this);
        }

        public <T> T[] toArray(T[] tArr) {
            C87412m.m108594g(tArr, "array");
            return C59742g.m69649b(this, tArr);
        }
    }

    /* renamed from: a */
    void mo144569a(C109898a aVar);

    /* renamed from: b */
    boolean mo144570b(Object obj, Object obj2);
}
