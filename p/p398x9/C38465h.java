package p398x9;

import java.io.Serializable;

/* renamed from: x9.h */
public final class C38465h<K, V> extends C38464d<K, V> implements Serializable {

    /* renamed from: d */
    public K f101451d;

    /* renamed from: e */
    public V f101452e;

    public C38465h(K k, V v) {
        this.f101451d = k;
        this.f101452e = v;
    }

    public final K getKey() {
        return this.f101451d;
    }

    public final V getValue() {
        return this.f101452e;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
