package com.eclipsesource.mmv8.utils;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

class V8PropertyMap<V> implements Map<String, V> {
    private Hashtable<String, V> map = new Hashtable<>();
    private Set<String> nulls = new HashSet();

    public void clear() {
        this.map.clear();
        this.nulls.clear();
    }

    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj) || this.nulls.contains(obj);
    }

    public boolean containsValue(Object obj) {
        if (obj == null && !this.nulls.isEmpty()) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return this.map.containsValue(obj);
    }

    public Set<Map.Entry<String, V>> entrySet() {
        HashSet hashSet = new HashSet(this.map.entrySet());
        for (String simpleEntry : this.nulls) {
            hashSet.add(new AbstractMap.SimpleEntry(simpleEntry, (Object) null));
        }
        return hashSet;
    }

    public V get(Object obj) {
        if (this.nulls.contains(obj)) {
            return null;
        }
        return this.map.get(obj);
    }

    public boolean isEmpty() {
        return this.map.isEmpty() && this.nulls.isEmpty();
    }

    public Set<String> keySet() {
        HashSet hashSet = new HashSet(this.map.keySet());
        hashSet.addAll(this.nulls);
        return hashSet;
    }

    public void putAll(Map<? extends String, ? extends V> map2) {
        for (Map.Entry next : map2.entrySet()) {
            put((String) next.getKey(), next.getValue());
        }
    }

    public V remove(Object obj) {
        if (!this.nulls.contains(obj)) {
            return this.map.remove(obj);
        }
        this.nulls.remove(obj);
        return null;
    }

    public int size() {
        return this.map.size() + this.nulls.size();
    }

    public Collection<V> values() {
        ArrayList arrayList = new ArrayList(this.map.values());
        for (int i = 0; i < this.nulls.size(); i++) {
            arrayList.add((Object) null);
        }
        return arrayList;
    }

    public V put(String str, V v) {
        if (v == null) {
            if (this.map.containsKey(str)) {
                this.map.remove(str);
            }
            this.nulls.add(str);
            return null;
        }
        if (this.nulls.contains(str)) {
            this.nulls.remove(str);
        }
        return this.map.put(str, v);
    }
}
