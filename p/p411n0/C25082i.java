package p411n0;

import gy3.C87412m;
import hy3.C33145a;
import java.util.Iterator;
import java.util.Map;

/* renamed from: n0.i */
public final class C25082i<K, V> implements Iterator<Map.Entry<K, V>>, C33145a {

    /* renamed from: d */
    public final C25080g<K, V, Map.Entry<K, V>> f71516d;

    public C25082i(C25079f<K, V> fVar) {
        C87412m.m108594g(fVar, "builder");
        C25095u[] uVarArr = new C25095u[8];
        for (int i = 0; i < 8; i++) {
            uVarArr[i] = new C25099y(this);
        }
        this.f71516d = new C25080g<>(fVar, uVarArr);
    }

    public boolean hasNext() {
        return this.f71516d.f71504f;
    }

    public Object next() {
        return this.f71516d.next();
    }

    public void remove() {
        this.f71516d.remove();
    }
}
