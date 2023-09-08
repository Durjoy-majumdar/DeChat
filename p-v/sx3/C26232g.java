package sx3;

import hy3.C108274e;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p411n0.C25079f;
import p411n0.C25081h;
import p411n0.C25083j;
import p411n0.C25085l;

/* renamed from: sx3.g */
public abstract class C26232g<K, V> extends AbstractMap<K, V> implements C108274e {
    public final Set<Map.Entry<K, V>> entrySet() {
        return new C25081h((C25079f) this);
    }

    public final Set<K> keySet() {
        return new C25083j((C25079f) this);
    }

    public final int size() {
        return ((C25079f) this).f71510i;
    }

    public final Collection<V> values() {
        return new C25085l((C25079f) this);
    }
}
