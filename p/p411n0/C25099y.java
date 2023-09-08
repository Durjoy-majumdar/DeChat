package p411n0;

import gy3.C87412m;
import java.util.Map;

/* renamed from: n0.y */
public final class C25099y<K, V> extends C25095u<K, V, Map.Entry<K, V>> {

    /* renamed from: g */
    public final C25082i<K, V> f71532g;

    public C25099y(C25082i<K, V> iVar) {
        C87412m.m108594g(iVar, "parentIterator");
        this.f71532g = iVar;
    }

    public Object next() {
        int i = this.f71531f + 2;
        this.f71531f = i;
        C25082i<K, V> iVar = this.f71532g;
        Object[] objArr = this.f71529d;
        return new C25076c(iVar, objArr[i - 2], objArr[i - 1]);
    }
}
