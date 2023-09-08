package com.google.protobuf;

import com.google.protobuf.C23908o0;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.protobuf.b1 */
public final class C16985b1<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: e */
    public static final C16985b1 f45991e;

    /* renamed from: d */
    public boolean f45992d = true;

    static {
        C16985b1 b1Var = new C16985b1();
        f45991e = b1Var;
        b1Var.f45992d = false;
    }

    public C16985b1() {
    }

    /* renamed from: a */
    public static <K, V> int m16764a(Map<K, V> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            i += m16765b(next.getValue()) ^ m16765b(next.getKey());
        }
        return i;
    }

    /* renamed from: b */
    public static int m16765b(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = C23908o0.f68505a;
            int length = bArr.length;
            int i = length;
            for (int i2 = 0; i2 < 0 + length; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof C23908o0.C23911c)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public static <K, V> Map<K, V> m16766c(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            Object key = next.getKey();
            Object value = next.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                value = Arrays.copyOf(bArr, bArr.length);
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    /* renamed from: f */
    public static <K, V> boolean m16767f(Map<K, V> map, Map<K, V> map2) {
        boolean z;
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry next : map.entrySet()) {
            if (!map2.containsKey(next.getKey())) {
                return false;
            }
            Object value = next.getValue();
            V v = map2.get(next.getKey());
            if (!(value instanceof byte[]) || !(v instanceof byte[])) {
                z = value.equals(v);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) v);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        mo18718e();
        super.clear();
    }

    /* renamed from: e */
    public final void mo18718e() {
        if (!this.f45992d) {
            throw new UnsupportedOperationException();
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && m16767f(this, (Map) obj);
    }

    public int hashCode() {
        return m16764a(this);
    }

    public V put(K k, V v) {
        mo18718e();
        Charset charset = C23908o0.f68505a;
        k.getClass();
        v.getClass();
        return super.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo18718e();
        for (Object next : map.keySet()) {
            Charset charset = C23908o0.f68505a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public V remove(Object obj) {
        mo18718e();
        return super.remove(obj);
    }

    public C16985b1(Map<K, V> map) {
        super(map);
    }
}
