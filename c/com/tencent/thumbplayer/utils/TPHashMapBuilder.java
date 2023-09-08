package com.tencent.thumbplayer.utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TPHashMapBuilder<K, V> {
    private Map<K, V> map = new HashMap();

    public Map<K, V> build() {
        return this.map;
    }

    public TPHashMapBuilder<K, V> put(K k, V v) {
        this.map.put(k, v);
        return this;
    }

    public Map<K, V> readOnly() {
        return Collections.unmodifiableMap(this.map);
    }
}
