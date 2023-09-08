package p411n0;

import gy3.C87412m;
import hy3.C33145a;
import java.util.Map;

/* renamed from: n0.b */
public class C34705b<K, V> implements Map.Entry<K, V>, C33145a {

    /* renamed from: d */
    public final K f93321d;

    /* renamed from: e */
    public final V f93322e;

    public C34705b(K k, V v) {
        this.f93321d = k;
        this.f93322e = v;
    }

    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && C87412m.m108589b(entry.getKey(), this.f93321d) && C87412m.m108589b(entry.getValue(), getValue());
    }

    public K getKey() {
        return this.f93321d;
    }

    public V getValue() {
        return this.f93322e;
    }

    public int hashCode() {
        K k = this.f93321d;
        int i = 0;
        int hashCode = k != null ? k.hashCode() : 0;
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f93321d);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
