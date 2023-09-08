package sx3;

import gy3.C87412m;
import hy3.C33145a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: sx3.g0 */
public final class C36903g0 implements Map, Serializable, C33145a {

    /* renamed from: d */
    public static final C36903g0 f97931d = new C36903g0();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        C87412m.m108594g((Void) obj, "value");
        return false;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return C64187h0.f181908d;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return C64187h0.f181908d;
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return C64186f0.f181907d;
    }
}
