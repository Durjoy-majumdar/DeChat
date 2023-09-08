package sx3;

import gy3.C87412m;
import java.util.List;

/* renamed from: sx3.u0 */
public class C64196u0<T> extends C64177c<T> {

    /* renamed from: e */
    public final List<T> f181919e;

    public C64196u0(List<? extends T> list) {
        C87412m.m108594g(list, "delegate");
        this.f181919e = list;
    }

    /* renamed from: f */
    public int mo52189f() {
        return this.f181919e.size();
    }

    public T get(int i) {
        return this.f181919e.get(C64176b0.m75517y(this, i));
    }
}
