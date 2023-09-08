package p398x9;

import java.util.Map;

/* renamed from: x9.d */
public abstract class C38464d<K, V> implements Map.Entry<K, V> {
    public boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            C38465h hVar = (C38465h) this;
            K k = hVar.f101451d;
            K key = entry.getKey();
            if (k == key || (k != null && k.equals(key))) {
                V v = hVar.f101452e;
                V value = entry.getValue();
                if (v == value || (v != null && v.equals(value))) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        C38465h hVar = (C38465h) this;
        K k = hVar.f101451d;
        V v = hVar.f101452e;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        C38465h hVar = (C38465h) this;
        sb.append(hVar.f101451d);
        sb.append("=");
        sb.append(hVar.f101452e);
        return sb.toString();
    }
}
