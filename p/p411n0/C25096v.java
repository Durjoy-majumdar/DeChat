package p411n0;

import java.util.Map;

/* renamed from: n0.v */
public final class C25096v<K, V> extends C25095u<K, V, Map.Entry<? extends K, ? extends V>> {
    public Object next() {
        int i = this.f71531f + 2;
        this.f71531f = i;
        Object[] objArr = this.f71529d;
        return new C34705b(objArr[i - 2], objArr[i - 1]);
    }
}
