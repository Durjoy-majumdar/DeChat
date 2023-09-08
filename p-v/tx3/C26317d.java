package tx3;

import gy3.C8480h;
import gy3.C87412m;
import hy3.C108274e;
import hy3.C33145a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import my3.C34690i;
import my3.C61594j;
import sx3.C36904l0;

/* renamed from: tx3.d */
public final class C26317d<K, V> implements Map<K, V>, Serializable, C108274e {

    /* renamed from: d */
    public K[] f73328d;

    /* renamed from: e */
    public V[] f73329e = null;

    /* renamed from: f */
    public int[] f73330f = new int[8];

    /* renamed from: g */
    public int[] f73331g;

    /* renamed from: h */
    public int f73332h;

    /* renamed from: i */
    public int f73333i;

    /* renamed from: j */
    public int f73334j;

    /* renamed from: n */
    public int f73335n;

    /* renamed from: o */
    public C26325f<K> f73336o;

    /* renamed from: p */
    public C26326g<V> f73337p;

    /* renamed from: q */
    public C26324e<K, V> f73338q;

    /* renamed from: r */
    public boolean f73339r;

    /* renamed from: tx3.d$b */
    public static final class C26318b<K, V> extends C26320d<K, V> implements Iterator<Map.Entry<K, V>>, C33145a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26318b(C26317d<K, V> dVar) {
            super(dVar);
            C87412m.m108594g(dVar, "map");
        }

        public Object next() {
            int i = this.f73343e;
            C26317d<K, V> dVar = this.f73342d;
            if (i < dVar.f73333i) {
                this.f73343e = i + 1;
                this.f73344f = i;
                C26319c cVar = new C26319c(dVar, i);
                mo53272a();
                return cVar;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: tx3.d$c */
    public static final class C26319c<K, V> implements Map.Entry<K, V>, C108274e.C108275a {

        /* renamed from: d */
        public final C26317d<K, V> f73340d;

        /* renamed from: e */
        public final int f73341e;

        public C26319c(C26317d<K, V> dVar, int i) {
            C87412m.m108594g(dVar, "map");
            this.f73340d = dVar;
            this.f73341e = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return C87412m.m108589b(entry.getKey(), getKey()) && C87412m.m108589b(entry.getValue(), getValue());
            }
        }

        public K getKey() {
            return this.f73340d.f73328d[this.f73341e];
        }

        public V getValue() {
            V[] vArr = this.f73340d.f73329e;
            C87412m.m108591d(vArr);
            return vArr[this.f73341e];
        }

        public int hashCode() {
            Object key = getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            this.f73340d.mo53242c();
            C26317d<K, V> dVar = this.f73340d;
            V[] vArr = dVar.f73329e;
            if (vArr == null) {
                vArr = C26316c.m33797a(dVar.f73328d.length);
                dVar.f73329e = vArr;
            }
            int i = this.f73341e;
            V v2 = vArr[i];
            vArr[i] = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* renamed from: tx3.d$d */
    public static class C26320d<K, V> {

        /* renamed from: d */
        public final C26317d<K, V> f73342d;

        /* renamed from: e */
        public int f73343e;

        /* renamed from: f */
        public int f73344f = -1;

        public C26320d(C26317d<K, V> dVar) {
            C87412m.m108594g(dVar, "map");
            this.f73342d = dVar;
            mo53272a();
        }

        /* renamed from: a */
        public final void mo53272a() {
            while (true) {
                int i = this.f73343e;
                C26317d<K, V> dVar = this.f73342d;
                if (i < dVar.f73333i && dVar.f73330f[i] < 0) {
                    this.f73343e = i + 1;
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            return this.f73343e < this.f73342d.f73333i;
        }

        public final void remove() {
            if (this.f73344f != -1) {
                this.f73342d.mo53242c();
                this.f73342d.mo53258l(this.f73344f);
                this.f73344f = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* renamed from: tx3.d$e */
    public static final class C26321e<K, V> extends C26320d<K, V> implements Iterator<K>, C33145a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26321e(C26317d<K, V> dVar) {
            super(dVar);
            C87412m.m108594g(dVar, "map");
        }

        public K next() {
            int i = this.f73343e;
            C26317d<K, V> dVar = this.f73342d;
            if (i < dVar.f73333i) {
                this.f73343e = i + 1;
                this.f73344f = i;
                K k = dVar.f73328d[i];
                mo53272a();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: tx3.d$f */
    public static final class C26322f<K, V> extends C26320d<K, V> implements Iterator<V>, C33145a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26322f(C26317d<K, V> dVar) {
            super(dVar);
            C87412m.m108594g(dVar, "map");
        }

        public V next() {
            int i = this.f73343e;
            C26317d<K, V> dVar = this.f73342d;
            if (i < dVar.f73333i) {
                this.f73343e = i + 1;
                this.f73344f = i;
                V[] vArr = dVar.f73329e;
                C87412m.m108591d(vArr);
                V v = vArr[this.f73344f];
                mo53272a();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    /* renamed from: tx3.d$a */
    public static final class C26323a {
        public C26323a(C8480h hVar) {
        }
    }

    static {
        new C26323a((C8480h) null);
    }

    public C26317d() {
        K[] a = C26316c.m33797a(8);
        int highestOneBit = Integer.highestOneBit(24);
        this.f73328d = a;
        this.f73331g = new int[highestOneBit];
        this.f73332h = 2;
        this.f73333i = 0;
        this.f73334j = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    /* renamed from: a */
    public final int mo53241a(K k) {
        mo53242c();
        while (true) {
            int j = mo53255j(k);
            int i = this.f73332h * 2;
            int length = this.f73331g.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f73331g;
                int i3 = iArr[j];
                if (i3 <= 0) {
                    int i4 = this.f73333i;
                    K[] kArr = this.f73328d;
                    if (i4 >= kArr.length) {
                        mo53250g(1);
                    } else {
                        int i5 = i4 + 1;
                        this.f73333i = i5;
                        kArr[i4] = k;
                        this.f73330f[i4] = j;
                        iArr[j] = i5;
                        this.f73335n++;
                        if (i2 > this.f73332h) {
                            this.f73332h = i2;
                        }
                        return i4;
                    }
                } else if (C87412m.m108589b(this.f73328d[i3 - 1], k)) {
                    return -i3;
                } else {
                    i2++;
                    if (i2 > i) {
                        mo53256k(this.f73331g.length * 2);
                        break;
                    }
                    j = j == 0 ? this.f73331g.length - 1 : j - 1;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo53242c() {
        if (this.f73339r) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo53242c();
        C36904l0 i = new C61594j(0, this.f73333i - 1).iterator();
        while (((C34690i) i).f93287f) {
            int a = i.mo59695a();
            int[] iArr = this.f73330f;
            int i2 = iArr[a];
            if (i2 >= 0) {
                this.f73331g[i2] = 0;
                iArr[a] = -1;
            }
        }
        C26316c.m33798b(this.f73328d, 0, this.f73333i);
        V[] vArr = this.f73329e;
        if (vArr != null) {
            C26316c.m33798b(vArr, 0, this.f73333i);
        }
        this.f73335n = 0;
        this.f73333i = 0;
    }

    public boolean containsKey(Object obj) {
        return mo53253i(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        int i;
        int i2 = this.f73333i;
        while (true) {
            i = -1;
            i2--;
            if (i2 < 0) {
                break;
            } else if (this.f73330f[i2] >= 0) {
                V[] vArr = this.f73329e;
                C87412m.m108591d(vArr);
                if (C87412m.m108589b(vArr[i2], obj)) {
                    i = i2;
                    break;
                }
            }
        }
        return i >= 0;
    }

    /* renamed from: e */
    public final boolean mo53246e(Collection<?> collection) {
        C87412m.m108594g(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!mo53249f((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        C26324e<K, V> eVar = this.f73338q;
        if (eVar != null) {
            return eVar;
        }
        C26324e<K, V> eVar2 = new C26324e<>(this);
        this.f73338q = eVar2;
        return eVar2;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            return this.f73335n == map.size() && mo53246e(map.entrySet());
        }
    }

    /* renamed from: f */
    public final boolean mo53249f(Map.Entry<? extends K, ? extends V> entry) {
        C87412m.m108594g(entry, "entry");
        int i = mo53253i(entry.getKey());
        if (i < 0) {
            return false;
        }
        V[] vArr = this.f73329e;
        C87412m.m108591d(vArr);
        return C87412m.m108589b(vArr[i], entry.getValue());
    }

    /* renamed from: g */
    public final void mo53250g(int i) {
        V[] vArr;
        int i2 = this.f73333i;
        int i3 = i + i2;
        if (i3 >= 0) {
            K[] kArr = this.f73328d;
            if (i3 > kArr.length) {
                int length = (kArr.length * 3) / 2;
                if (i3 <= length) {
                    i3 = length;
                }
                K[] copyOf = Arrays.copyOf(kArr, i3);
                C87412m.m108593f(copyOf, "copyOf(this, newSize)");
                this.f73328d = copyOf;
                V[] vArr2 = this.f73329e;
                if (vArr2 != null) {
                    vArr = Arrays.copyOf(vArr2, i3);
                    C87412m.m108593f(vArr, "copyOf(this, newSize)");
                } else {
                    vArr = null;
                }
                this.f73329e = vArr;
                int[] copyOf2 = Arrays.copyOf(this.f73330f, i3);
                C87412m.m108593f(copyOf2, "copyOf(this, newSize)");
                this.f73330f = copyOf2;
                if (i3 < 1) {
                    i3 = 1;
                }
                int highestOneBit = Integer.highestOneBit(i3 * 3);
                if (highestOneBit > this.f73331g.length) {
                    mo53256k(highestOneBit);
                }
            } else if ((i2 + i3) - this.f73335n > kArr.length) {
                mo53256k(this.f73331g.length);
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    public V get(Object obj) {
        int i = mo53253i(obj);
        if (i < 0) {
            return null;
        }
        V[] vArr = this.f73329e;
        C87412m.m108591d(vArr);
        return vArr[i];
    }

    public int hashCode() {
        C26318b bVar = new C26318b(this);
        int i = 0;
        while (bVar.hasNext()) {
            int i2 = bVar.f73343e;
            C26317d<K, V> dVar = bVar.f73342d;
            if (i2 < dVar.f73333i) {
                bVar.f73343e = i2 + 1;
                bVar.f73344f = i2;
                K k = dVar.f73328d[i2];
                int hashCode = k != null ? k.hashCode() : 0;
                V[] vArr = bVar.f73342d.f73329e;
                C87412m.m108591d(vArr);
                V v = vArr[bVar.f73344f];
                int hashCode2 = v != null ? v.hashCode() : 0;
                bVar.mo53272a();
                i += hashCode ^ hashCode2;
            } else {
                throw new NoSuchElementException();
            }
        }
        return i;
    }

    /* renamed from: i */
    public final int mo53253i(K k) {
        int j = mo53255j(k);
        int i = this.f73332h;
        while (true) {
            int i2 = this.f73331g[j];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (C87412m.m108589b(this.f73328d[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            j = j == 0 ? this.f73331g.length - 1 : j - 1;
        }
    }

    public boolean isEmpty() {
        return this.f73335n == 0;
    }

    /* renamed from: j */
    public final int mo53255j(K k) {
        return ((k != null ? k.hashCode() : 0) * -1640531527) >>> this.f73334j;
    }

    /* renamed from: k */
    public final void mo53256k(int i) {
        boolean z;
        int i2;
        if (this.f73333i > this.f73335n) {
            V[] vArr = this.f73329e;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i2 = this.f73333i;
                if (i3 >= i2) {
                    break;
                }
                if (this.f73330f[i3] >= 0) {
                    K[] kArr = this.f73328d;
                    kArr[i4] = kArr[i3];
                    if (vArr != null) {
                        vArr[i4] = vArr[i3];
                    }
                    i4++;
                }
                i3++;
            }
            C26316c.m33798b(this.f73328d, i4, i2);
            if (vArr != null) {
                C26316c.m33798b(vArr, i4, this.f73333i);
            }
            this.f73333i = i4;
        }
        int[] iArr = this.f73331g;
        if (i != iArr.length) {
            this.f73331g = new int[i];
            this.f73334j = Integer.numberOfLeadingZeros(i) + 1;
        } else {
            Arrays.fill(iArr, 0, iArr.length, 0);
        }
        int i5 = 0;
        while (i5 < this.f73333i) {
            int i6 = i5 + 1;
            int j = mo53255j(this.f73328d[i5]);
            int i7 = this.f73332h;
            while (true) {
                int[] iArr2 = this.f73331g;
                if (iArr2[j] == 0) {
                    iArr2[j] = i6;
                    this.f73330f[i5] = j;
                    z = true;
                    break;
                }
                i7--;
                if (i7 < 0) {
                    z = false;
                    break;
                }
                j = j == 0 ? iArr2.length - 1 : j - 1;
            }
            if (z) {
                i5 = i6;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    public final Set<K> keySet() {
        C26325f<K> fVar = this.f73336o;
        if (fVar != null) {
            return fVar;
        }
        C26325f<K> fVar2 = new C26325f<>(this);
        this.f73336o = fVar2;
        return fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x005f A[SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53258l(int r12) {
        /*
            r11 = this;
            K[] r0 = r11.f73328d
            java.lang.String r1 = "<this>"
            gy3.C87412m.m108594g(r0, r1)
            r1 = 0
            r0[r12] = r1
            int[] r0 = r11.f73330f
            r0 = r0[r12]
            int r1 = r11.f73332h
            int r1 = r1 * 2
            int[] r2 = r11.f73331g
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L_0x001a
            r1 = r2
        L_0x001a:
            r2 = 0
            r3 = r1
            r4 = 0
            r1 = r0
        L_0x001e:
            int r5 = r0 + -1
            r6 = -1
            if (r0 != 0) goto L_0x0028
            int[] r0 = r11.f73331g
            int r0 = r0.length
            int r0 = r0 + r6
            goto L_0x0029
        L_0x0028:
            r0 = r5
        L_0x0029:
            int r4 = r4 + 1
            int r5 = r11.f73332h
            if (r4 <= r5) goto L_0x0034
            int[] r0 = r11.f73331g
            r0[r1] = r2
            goto L_0x0063
        L_0x0034:
            int[] r5 = r11.f73331g
            r7 = r5[r0]
            if (r7 != 0) goto L_0x003d
            r5[r1] = r2
            goto L_0x0063
        L_0x003d:
            if (r7 >= 0) goto L_0x0042
            r5[r1] = r6
            goto L_0x005a
        L_0x0042:
            K[] r5 = r11.f73328d
            int r8 = r7 + -1
            r5 = r5[r8]
            int r5 = r11.mo53255j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f73331g
            int r10 = r9.length
            int r10 = r10 + r6
            r5 = r5 & r10
            if (r5 < r4) goto L_0x005c
            r9[r1] = r7
            int[] r4 = r11.f73330f
            r4[r8] = r1
        L_0x005a:
            r1 = r0
            r4 = 0
        L_0x005c:
            int r3 = r3 + r6
            if (r3 >= 0) goto L_0x001e
            int[] r0 = r11.f73331g
            r0[r1] = r6
        L_0x0063:
            int[] r0 = r11.f73330f
            r0[r12] = r6
            int r12 = r11.f73335n
            int r12 = r12 + r6
            r11.f73335n = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tx3.C26317d.mo53258l(int):void");
    }

    public V put(K k, V v) {
        mo53242c();
        int a = mo53241a(k);
        V[] vArr = this.f73329e;
        if (vArr == null) {
            vArr = C26316c.m33797a(this.f73328d.length);
            this.f73329e = vArr;
        }
        if (a < 0) {
            int i = (-a) - 1;
            V v2 = vArr[i];
            vArr[i] = v;
            return v2;
        }
        vArr[a] = v;
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        C87412m.m108594g(map, "from");
        mo53242c();
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        if (!entrySet.isEmpty()) {
            mo53250g(entrySet.size());
            for (Map.Entry next : entrySet) {
                int a = mo53241a(next.getKey());
                V[] vArr = this.f73329e;
                if (vArr == null) {
                    vArr = C26316c.m33797a(this.f73328d.length);
                    this.f73329e = vArr;
                }
                if (a >= 0) {
                    vArr[a] = next.getValue();
                } else {
                    int i = (-a) - 1;
                    if (!C87412m.m108589b(next.getValue(), vArr[i])) {
                        vArr[i] = next.getValue();
                    }
                }
            }
        }
    }

    public V remove(Object obj) {
        mo53242c();
        int i = mo53253i(obj);
        if (i < 0) {
            i = -1;
        } else {
            mo53258l(i);
        }
        if (i < 0) {
            return null;
        }
        V[] vArr = this.f73329e;
        C87412m.m108591d(vArr);
        V v = vArr[i];
        vArr[i] = null;
        return v;
    }

    public final int size() {
        return this.f73335n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f73335n * 3) + 2);
        sb.append("{");
        int i = 0;
        C26318b bVar = new C26318b(this);
        while (bVar.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = bVar.f73343e;
            C26317d<K, V> dVar = bVar.f73342d;
            if (i2 < dVar.f73333i) {
                bVar.f73343e = i2 + 1;
                bVar.f73344f = i2;
                K k = dVar.f73328d[i2];
                if (C87412m.m108589b(k, dVar)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(k);
                }
                sb.append('=');
                V[] vArr = bVar.f73342d.f73329e;
                C87412m.m108591d(vArr);
                V v = vArr[bVar.f73344f];
                if (C87412m.m108589b(v, bVar.f73342d)) {
                    sb.append("(this Map)");
                } else {
                    sb.append(v);
                }
                bVar.mo53272a();
                i++;
            } else {
                throw new NoSuchElementException();
            }
        }
        sb.append("}");
        String sb4 = sb.toString();
        C87412m.m108593f(sb4, "sb.toString()");
        return sb4;
    }

    public final Collection<V> values() {
        C26326g<V> gVar = this.f73337p;
        if (gVar != null) {
            return gVar;
        }
        C26326g<V> gVar2 = new C26326g<>(this);
        this.f73337p = gVar2;
        return gVar2;
    }
}
