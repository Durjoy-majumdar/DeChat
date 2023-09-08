package p1042u;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: u.i */
public class C111059i<K, V> {

    /* renamed from: g */
    public static Object[] f332577g;

    /* renamed from: h */
    public static int f332578h;

    /* renamed from: i */
    public static Object[] f332579i;

    /* renamed from: j */
    public static int f332580j;

    /* renamed from: d */
    public int[] f332581d;

    /* renamed from: e */
    public Object[] f332582e;

    /* renamed from: f */
    public int f332583f;

    public C111059i() {
        this.f332581d = C111056e.f332570a;
        this.f332582e = C111056e.f332571b;
        this.f332583f = 0;
    }

    /* renamed from: a */
    private void m151438a(int i) {
        Class<C111059i> cls = C111059i.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f332579i;
                if (objArr != null) {
                    this.f332582e = objArr;
                    f332579i = (Object[]) objArr[0];
                    this.f332581d = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f332580j--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f332577g;
                if (objArr2 != null) {
                    this.f332582e = objArr2;
                    f332577g = (Object[]) objArr2[0];
                    this.f332581d = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f332578h--;
                    return;
                }
            }
        }
        this.f332581d = new int[i];
        this.f332582e = new Object[(i << 1)];
    }

    /* renamed from: c */
    public static void m151439c(int[] iArr, Object[] objArr, int i) {
        Class<C111059i> cls = C111059i.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f332580j < 10) {
                    objArr[0] = f332579i;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f332579i = objArr;
                    f332580j++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f332578h < 10) {
                    objArr[0] = f332577g;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f332577g = objArr;
                    f332578h++;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo162776b(int i) {
        int i2 = this.f332583f;
        int[] iArr = this.f332581d;
        if (iArr.length < i) {
            Object[] objArr = this.f332582e;
            m151438a(i);
            if (this.f332583f > 0) {
                System.arraycopy(iArr, 0, this.f332581d, 0, i2);
                System.arraycopy(objArr, 0, this.f332582e, 0, i2 << 1);
            }
            m151439c(iArr, objArr, i2);
        }
        if (this.f332583f != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f332583f;
        if (i > 0) {
            int[] iArr = this.f332581d;
            Object[] objArr = this.f332582e;
            this.f332581d = C111056e.f332570a;
            this.f332582e = C111056e.f332571b;
            this.f332583f = 0;
            m151439c(iArr, objArr, i);
        }
        if (this.f332583f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo162782f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo162787i(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo162780e(Object obj, int i) {
        int i2 = this.f332583f;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a = C111056e.m151429a(this.f332581d, i2, i);
            if (a < 0 || obj.equals(this.f332582e[a << 1])) {
                return a;
            }
            int i3 = a + 1;
            while (i3 < i2 && this.f332581d[i3] == i) {
                if (obj.equals(this.f332582e[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            int i4 = a - 1;
            while (i4 >= 0 && this.f332581d[i4] == i) {
                if (obj.equals(this.f332582e[i4 << 1])) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C111059i) {
            C111059i iVar = (C111059i) obj;
            if (this.f332583f != iVar.f332583f) {
                return false;
            }
            int i = 0;
            while (i < this.f332583f) {
                try {
                    Object j = mo162789j(i);
                    Object l = mo162791l(i);
                    Object orDefault = iVar.getOrDefault(j, (Object) null);
                    if (l == null) {
                        if (orDefault != null || !iVar.containsKey(j)) {
                            return false;
                        }
                    } else if (!l.equals(orDefault)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f332583f != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f332583f) {
                try {
                    Object j2 = mo162789j(i2);
                    Object l2 = mo162791l(i2);
                    Object obj2 = map.get(j2);
                    if (l2 == null) {
                        if (obj2 != null || !map.containsKey(j2)) {
                            return false;
                        }
                    } else if (!l2.equals(obj2)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo162782f(Object obj) {
        return obj == null ? mo162783g() : mo162780e(obj, obj.hashCode());
    }

    /* renamed from: g */
    public int mo162783g() {
        int i = this.f332583f;
        if (i == 0) {
            return -1;
        }
        try {
            int a = C111056e.m151429a(this.f332581d, i, 0);
            if (a < 0 || this.f332582e[a << 1] == null) {
                return a;
            }
            int i2 = a + 1;
            while (i2 < i && this.f332581d[i2] == 0) {
                if (this.f332582e[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            int i3 = a - 1;
            while (i3 >= 0 && this.f332581d[i3] == 0) {
                if (this.f332582e[i3 << 1] == null) {
                    return i3;
                }
                i3--;
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int f = mo162782f(obj);
        return f >= 0 ? this.f332582e[(f << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f332581d;
        Object[] objArr = this.f332582e;
        int i = this.f332583f;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo162787i(Object obj) {
        int i = this.f332583f * 2;
        Object[] objArr = this.f332582e;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f332583f <= 0;
    }

    /* renamed from: j */
    public K mo162789j(int i) {
        return this.f332582e[i << 1];
    }

    /* renamed from: k */
    public V mo162790k(int i) {
        V[] vArr = this.f332582e;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f332583f;
        int i4 = 0;
        if (i3 <= 1) {
            m151439c(this.f332581d, vArr, i3);
            this.f332581d = C111056e.f332570a;
            this.f332582e = C111056e.f332571b;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f332581d;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f332582e;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f332582e;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m151438a(i6);
                if (i3 == this.f332583f) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f332581d, 0, i);
                        System.arraycopy(vArr, 0, this.f332582e, 0, i2);
                    }
                    if (i < i5) {
                        int i15 = i + 1;
                        int i16 = i5 - i;
                        System.arraycopy(iArr, i15, this.f332581d, i, i16);
                        System.arraycopy(vArr, i15 << 1, this.f332582e, i2, i16 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f332583f) {
            this.f332583f = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: l */
    public V mo162791l(int i) {
        return this.f332582e[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f332583f;
        if (k == null) {
            i2 = mo162783g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo162780e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f332582e;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f332581d;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f332582e;
            m151438a(i6);
            if (i3 == this.f332583f) {
                int[] iArr2 = this.f332581d;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f332582e, 0, objArr.length);
                }
                m151439c(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f332581d;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f332582e;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f332583f - i5) << 1);
        }
        int i8 = this.f332583f;
        if (i3 == i8) {
            int[] iArr4 = this.f332581d;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f332582e;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f332583f = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, (Object) null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int f = mo162782f(obj);
        if (f >= 0) {
            return mo162790k(f);
        }
        return null;
    }

    public V replace(K k, V v) {
        int f = mo162782f(k);
        if (f < 0) {
            return null;
        }
        int i = (f << 1) + 1;
        V[] vArr = this.f332582e;
        V v2 = vArr[i];
        vArr[i] = v;
        return v2;
    }

    public int size() {
        return this.f332583f;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f332583f * 28);
        sb.append('{');
        for (int i = 0; i < this.f332583f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object j = mo162789j(i);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object l = mo162791l(i);
            if (l != this) {
                sb.append(l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f = mo162782f(obj);
        if (f < 0) {
            return false;
        }
        Object l = mo162791l(f);
        if (obj2 != l && (obj2 == null || !obj2.equals(l))) {
            return false;
        }
        mo162790k(f);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int f = mo162782f(k);
        if (f < 0) {
            return false;
        }
        V l = mo162791l(f);
        if (l != v && (v == null || !v.equals(l))) {
            return false;
        }
        int i = (f << 1) + 1;
        Object[] objArr = this.f332582e;
        Object obj = objArr[i];
        objArr[i] = v2;
        return true;
    }

    public C111059i(int i) {
        if (i == 0) {
            this.f332581d = C111056e.f332570a;
            this.f332582e = C111056e.f332571b;
        } else {
            m151438a(i);
        }
        this.f332583f = 0;
    }
}
