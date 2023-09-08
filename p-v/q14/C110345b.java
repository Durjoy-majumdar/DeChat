package q14;

import fy3.C32226l;
import gy3.C59742g;
import gy3.C87412m;
import hy3.C33145a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import sx3.C110818d0;

/* renamed from: q14.b */
public final class C110345b extends C110346e implements List<C110346e>, C33145a {

    /* renamed from: d */
    public final List<C110346e> f330084d;

    public C110345b(List<? extends C110346e> list) {
        C87412m.m108594g(list, "content");
        this.f330084d = list;
    }

    public /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends C110346e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C110346e> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof C110346e)) {
            return false;
        }
        C110346e eVar = (C110346e) obj;
        C87412m.m108594g(eVar, "element");
        return this.f330084d.contains(eVar);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        return this.f330084d.containsAll(collection);
    }

    public boolean equals(Object obj) {
        return C87412m.m108589b(this.f330084d, obj);
    }

    public Object get(int i) {
        C110346e eVar = this.f330084d.get(i);
        C87412m.m108593f(eVar, "get(...)");
        return eVar;
    }

    public int hashCode() {
        return this.f330084d.hashCode();
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof C110346e)) {
            return -1;
        }
        C110346e eVar = (C110346e) obj;
        C87412m.m108594g(eVar, "element");
        return this.f330084d.indexOf(eVar);
    }

    public boolean isEmpty() {
        return this.f330084d.isEmpty();
    }

    public Iterator<C110346e> iterator() {
        return this.f330084d.iterator();
    }

    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof C110346e)) {
            return -1;
        }
        C110346e eVar = (C110346e) obj;
        C87412m.m108594g(eVar, "element");
        return this.f330084d.lastIndexOf(eVar);
    }

    public ListIterator<C110346e> listIterator() {
        return this.f330084d.listIterator();
    }

    public ListIterator<C110346e> listIterator(int i) {
        return this.f330084d.listIterator(i);
    }

    public /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<C110346e> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final int size() {
        return this.f330084d.size();
    }

    public void sort(Comparator<? super C110346e> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<C110346e> subList(int i, int i2) {
        return this.f330084d.subList(i, i2);
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        return C59742g.m69649b(this, tArr);
    }

    public String toString() {
        return C110818d0.m150921S(this.f330084d, ",", "[", "]", 0, (CharSequence) null, (C32226l) null, 56, (Object) null);
    }
}
