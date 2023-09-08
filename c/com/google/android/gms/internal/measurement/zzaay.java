package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzaay<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private boolean zzbls;
    private final int zzbtx;
    /* access modifiers changed from: private */
    public List<zzabd> zzbty;
    /* access modifiers changed from: private */
    public Map<K, V> zzbtz;
    private volatile zzabf zzbua;
    private Map<K, V> zzbub;

    private zzaay(int i) {
        this.zzbtx = i;
        this.zzbty = Collections.emptyList();
        this.zzbtz = Collections.emptyMap();
        this.zzbub = Collections.emptyMap();
    }

    public /* synthetic */ zzaay(int i, zzaaz zzaaz) {
        this(i);
    }

    private final int zza(K k) {
        int size = this.zzbty.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.zzbty.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) this.zzbty.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public static <FieldDescriptorType extends zzzo<FieldDescriptorType>> zzaay<FieldDescriptorType, Object> zzag(int i) {
        return new zzaaz(i);
    }

    /* access modifiers changed from: private */
    public final V zzai(int i) {
        zzul();
        V value = this.zzbty.remove(i).getValue();
        if (!this.zzbtz.isEmpty()) {
            Iterator it = zzum().entrySet().iterator();
            this.zzbty.add(new zzabd(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* access modifiers changed from: private */
    public final void zzul() {
        if (this.zzbls) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> zzum() {
        zzul();
        if (this.zzbtz.isEmpty() && !(this.zzbtz instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzbtz = treeMap;
            TreeMap treeMap2 = treeMap;
            this.zzbub = treeMap.descendingMap();
        }
        return (SortedMap) this.zzbtz;
    }

    public void clear() {
        zzul();
        if (!this.zzbty.isEmpty()) {
            this.zzbty.clear();
        }
        if (!this.zzbtz.isEmpty()) {
            this.zzbtz.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzbtz.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzbua == null) {
            this.zzbua = new zzabf(this, (zzaaz) null);
        }
        return this.zzbua;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaay)) {
            return super.equals(obj);
        }
        zzaay zzaay = (zzaay) obj;
        int size = size();
        if (size != zzaay.size()) {
            return false;
        }
        int zzuj = zzuj();
        if (zzuj != zzaay.zzuj()) {
            return entrySet().equals(zzaay.entrySet());
        }
        for (int i = 0; i < zzuj; i++) {
            if (!zzah(i).equals(zzaay.zzah(i))) {
                return false;
            }
        }
        if (zzuj != size) {
            return this.zzbtz.equals(zzaay.zzbtz);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        return zza >= 0 ? this.zzbty.get(zza).getValue() : this.zzbtz.get(comparable);
    }

    public int hashCode() {
        int zzuj = zzuj();
        int i = 0;
        for (int i2 = 0; i2 < zzuj; i2++) {
            i += this.zzbty.get(i2).hashCode();
        }
        return this.zzbtz.size() > 0 ? i + this.zzbtz.hashCode() : i;
    }

    public final boolean isImmutable() {
        return this.zzbls;
    }

    public V remove(Object obj) {
        zzul();
        Comparable comparable = (Comparable) obj;
        int zza = zza(comparable);
        if (zza >= 0) {
            return zzai(zza);
        }
        if (this.zzbtz.isEmpty()) {
            return null;
        }
        return this.zzbtz.remove(comparable);
    }

    public int size() {
        return this.zzbty.size() + this.zzbtz.size();
    }

    /* renamed from: zza */
    public final V put(K k, V v) {
        zzul();
        int zza = zza(k);
        if (zza >= 0) {
            return this.zzbty.get(zza).setValue(v);
        }
        zzul();
        if (this.zzbty.isEmpty() && !(this.zzbty instanceof ArrayList)) {
            this.zzbty = new ArrayList(this.zzbtx);
        }
        int i = -(zza + 1);
        if (i >= this.zzbtx) {
            return zzum().put(k, v);
        }
        int size = this.zzbty.size();
        int i2 = this.zzbtx;
        if (size == i2) {
            zzabd remove = this.zzbty.remove(i2 - 1);
            zzum().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.zzbty.add(i, new zzabd(this, k, v));
        return null;
    }

    public final Map.Entry<K, V> zzah(int i) {
        return this.zzbty.get(i);
    }

    public void zzrg() {
        if (!this.zzbls) {
            this.zzbtz = this.zzbtz.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzbtz);
            this.zzbub = this.zzbub.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzbub);
            this.zzbls = true;
        }
    }

    public final int zzuj() {
        return this.zzbty.size();
    }

    public final Iterable<Map.Entry<K, V>> zzuk() {
        return this.zzbtz.isEmpty() ? zzaba.zzun() : this.zzbtz.entrySet();
    }
}
