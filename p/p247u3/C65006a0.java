package p247u3;

import gy3.C87412m;
import java.util.List;
import sx3.C64177c;

/* renamed from: u3.a0 */
public final class C65006a0<T> extends C64177c<T> {

    /* renamed from: e */
    public final int f187135e;

    /* renamed from: f */
    public final int f187136f;

    /* renamed from: g */
    public final List<T> f187137g;

    public C65006a0(int i, int i2, List<? extends T> list) {
        C87412m.m108594g(list, "items");
        this.f187135e = i;
        this.f187136f = i2;
        this.f187137g = list;
    }

    /* renamed from: f */
    public int mo52189f() {
        return this.f187135e + this.f187137g.size() + this.f187136f;
    }

    public T get(int i) {
        int i2 = this.f187135e;
        if (i >= 0 && i2 > i) {
            return null;
        }
        int size = this.f187137g.size() + i2;
        if (i2 <= i && size > i) {
            return this.f187137g.get(i - this.f187135e);
        }
        int size2 = this.f187135e + this.f187137g.size();
        int f = mo52189f();
        if (size2 <= i && f > i) {
            return null;
        }
        throw new IndexOutOfBoundsException("Illegal attempt to access index " + i + " in ItemSnapshotList of size " + mo52189f());
    }
}
