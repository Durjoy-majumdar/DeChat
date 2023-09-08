package com.eclipsesource.mmv8.utils;

import com.eclipsesource.mmv8.Releasable;
import com.eclipsesource.mmv8.V8Value;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class V8Map<V> implements Map<V8Value, V>, Releasable {
    private Map<V8Value, V> map = new HashMap();
    private Map<V8Value, V8Value> twinMap = new HashMap();

    public void clear() {
        this.map.clear();
        for (V8Value release : this.twinMap.keySet()) {
            release.release();
        }
        this.twinMap.clear();
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    public Set<Map.Entry<V8Value, V>> entrySet() {
        return this.map.entrySet();
    }

    public V get(Object obj) {
        return this.map.get(obj);
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public Set<V8Value> keySet() {
        return this.map.keySet();
    }

    public void putAll(Map<? extends V8Value, ? extends V> map2) {
        for (Map.Entry next : map2.entrySet()) {
            put((V8Value) next.getKey(), next.getValue());
        }
    }

    public void release() {
        clear();
    }

    public V remove(Object obj) {
        V remove = this.map.remove(obj);
        V8Value remove2 = this.twinMap.remove(obj);
        if (remove2 != null) {
            remove2.release();
        }
        return remove;
    }

    public int size() {
        return this.map.size();
    }

    public Collection<V> values() {
        return this.map.values();
    }

    public V put(V8Value v8Value, V v) {
        remove(v8Value);
        V8Value twin = v8Value.twin();
        this.twinMap.put(twin, twin);
        return this.map.put(twin, v);
    }
}
