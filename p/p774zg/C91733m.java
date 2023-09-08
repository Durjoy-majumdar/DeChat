package p774zg;

import gy3.C59742g;
import gy3.C87412m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import sx3.C64197v;

/* renamed from: zg.m */
public final class C91733m<T> implements Queue<T> {

    /* renamed from: d */
    public final Queue<T> f262761d;

    /* renamed from: e */
    public int f262762e = -1;

    public C91733m(Queue<T> queue) {
        C87412m.m108594g(queue, "q");
        this.f262761d = queue;
    }

    public boolean add(T t) {
        return this.f262761d.add(t);
    }

    public boolean addAll(Collection<? extends T> collection) {
        C87412m.m108594g(collection, "elements");
        return this.f262761d.addAll(collection);
    }

    public void clear() {
        this.f262761d.clear();
    }

    public boolean contains(Object obj) {
        return this.f262761d.contains(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        return this.f262761d.containsAll(collection);
    }

    public T element() {
        return this.f262761d.element();
    }

    /* renamed from: f */
    public final void mo125577f(Queue<T> queue, boolean z) {
        C87412m.m108594g(queue, "anotherQueue");
        int size = z ? this.f262762e : this.f262761d.size();
        this.f262762e = -1;
        int i = 0;
        int i2 = 0;
        for (T next : this.f262761d) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (i2 <= size) {
                    queue.offer(next);
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        if (size >= 0) {
            while (true) {
                this.f262761d.poll();
                if (i != size) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean isEmpty() {
        return this.f262761d.isEmpty();
    }

    public Iterator<T> iterator() {
        return this.f262761d.iterator();
    }

    public boolean offer(T t) {
        return this.f262761d.offer(t);
    }

    public T peek() {
        return this.f262761d.peek();
    }

    public T poll() {
        return this.f262761d.poll();
    }

    public T remove() {
        return this.f262761d.remove();
    }

    public boolean remove(Object obj) {
        return this.f262761d.remove(obj);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        return this.f262761d.removeAll(collection);
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C87412m.m108594g(collection, "elements");
        return this.f262761d.retainAll(collection);
    }

    public final int size() {
        return this.f262761d.size();
    }

    public Object[] toArray() {
        return C59742g.m69648a(this);
    }

    public <T> T[] toArray(T[] tArr) {
        C87412m.m108594g(tArr, "array");
        return C59742g.m69649b(this, tArr);
    }
}
