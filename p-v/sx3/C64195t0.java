package sx3;

import gy3.C87412m;
import java.util.List;
import my3.C61594j;

/* renamed from: sx3.t0 */
public final class C64195t0<T> extends C64185f<T> {

    /* renamed from: d */
    public final List<T> f181918d;

    public C64195t0(List<T> list) {
        C87412m.m108594g(list, "delegate");
        this.f181918d = list;
    }

    public void add(int i, T t) {
        List<T> list = this.f181918d;
        if (new C61594j(0, size()).mo86532k(i)) {
            list.add(size() - i, t);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i + " must be in range [" + new C61594j(0, size()) + "].");
    }

    public void clear() {
        this.f181918d.clear();
    }

    /* renamed from: f */
    public int mo53207f() {
        return this.f181918d.size();
    }

    public T get(int i) {
        return this.f181918d.get(C64176b0.m75517y(this, i));
    }

    /* renamed from: i */
    public T mo53210i(int i) {
        return this.f181918d.remove(C64176b0.m75517y(this, i));
    }

    public T set(int i, T t) {
        return this.f181918d.set(C64176b0.m75517y(this, i), t);
    }
}
