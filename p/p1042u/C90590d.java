package p1042u;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p1042u.C118556h;

/* renamed from: u.d */
public final class C90590d<E> implements Collection<E>, Set<E> {

    /* renamed from: h */
    public static final int[] f260287h = new int[0];

    /* renamed from: i */
    public static final Object[] f260288i = new Object[0];

    /* renamed from: j */
    public static Object[] f260289j;

    /* renamed from: n */
    public static int f260290n;

    /* renamed from: o */
    public static Object[] f260291o;

    /* renamed from: p */
    public static int f260292p;

    /* renamed from: d */
    public int[] f260293d;

    /* renamed from: e */
    public Object[] f260294e;

    /* renamed from: f */
    public int f260295f;

    /* renamed from: g */
    public C118556h<E, E> f260296g;

    public C90590d() {
        this(0);
    }

    /* renamed from: h */
    public static void m113482h(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C90590d.class) {
                if (f260292p < 10) {
                    objArr[0] = f260291o;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f260291o = objArr;
                    f260292p++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C90590d.class) {
                if (f260290n < 10) {
                    objArr[0] = f260289j;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f260289j = objArr;
                    f260290n++;
                }
            }
        }
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = mo124743k();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = mo124739i(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f260295f;
        int[] iArr = this.f260293d;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f260294e;
            mo124737f(i5);
            int[] iArr2 = this.f260293d;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f260294e, 0, objArr.length);
            }
            m113482h(iArr, objArr, this.f260295f);
        }
        int i6 = this.f260295f;
        if (i3 < i6) {
            int[] iArr3 = this.f260293d;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f260294e;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f260295f - i3);
        }
        this.f260293d[i3] = i;
        this.f260294e[i3] = e;
        this.f260295f++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        int size = this.f260295f + collection.size();
        int[] iArr = this.f260293d;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f260294e;
            mo124737f(size);
            int i = this.f260295f;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f260293d, 0, i);
                System.arraycopy(objArr, 0, this.f260294e, 0, this.f260295f);
            }
            m113482h(iArr, objArr, this.f260295f);
        }
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i = this.f260295f;
        if (i != 0) {
            m113482h(this.f260293d, this.f260294e, i);
            this.f260293d = f260287h;
            this.f260294e = f260288i;
            this.f260295f = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f260295f != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f260295f) {
                try {
                    if (!set.contains(this.f260294e[i])) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo124737f(int i) {
        if (i == 8) {
            synchronized (C90590d.class) {
                Object[] objArr = f260291o;
                if (objArr != null) {
                    this.f260294e = objArr;
                    f260291o = (Object[]) objArr[0];
                    this.f260293d = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f260292p--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C90590d.class) {
                Object[] objArr2 = f260289j;
                if (objArr2 != null) {
                    this.f260294e = objArr2;
                    f260289j = (Object[]) objArr2[0];
                    this.f260293d = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f260290n--;
                    return;
                }
            }
        }
        this.f260293d = new int[i];
        this.f260294e = new Object[i];
    }

    public int hashCode() {
        int[] iArr = this.f260293d;
        int i = this.f260295f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public final int mo124739i(Object obj, int i) {
        int i2 = this.f260295f;
        if (i2 == 0) {
            return -1;
        }
        int a = C111056e.m151429a(this.f260293d, i2, i);
        if (a < 0 || obj.equals(this.f260294e[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f260293d[i3] == i) {
            if (obj.equals(this.f260294e[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f260293d[i4] == i) {
            if (obj.equals(this.f260294e[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? mo124743k() : mo124739i(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f260295f <= 0;
    }

    public Iterator<E> iterator() {
        if (this.f260296g == null) {
            this.f260296g = new C90589c(this);
        }
        C118556h<E, E> hVar = this.f260296g;
        if (hVar.f354820b == null) {
            hVar.f354820b = new C118556h.C118559c();
        }
        return hVar.f354820b.iterator();
    }

    /* renamed from: k */
    public final int mo124743k() {
        int i = this.f260295f;
        if (i == 0) {
            return -1;
        }
        int a = C111056e.m151429a(this.f260293d, i, 0);
        if (a < 0 || this.f260294e[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f260293d[i2] == 0) {
            if (this.f260294e[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f260293d[i3] == 0) {
            if (this.f260294e[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: l */
    public E mo124744l(int i) {
        E[] eArr = this.f260294e;
        E e = eArr[i];
        int i2 = this.f260295f;
        if (i2 <= 1) {
            m113482h(this.f260293d, eArr, i2);
            this.f260293d = f260287h;
            this.f260294e = f260288i;
            this.f260295f = 0;
        } else {
            int[] iArr = this.f260293d;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f260295f = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr = this.f260294e;
                    System.arraycopy(objArr, i5, objArr, i, this.f260295f - i);
                }
                this.f260294e[this.f260295f] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                mo124737f(i3);
                this.f260295f--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f260293d, 0, i);
                    System.arraycopy(eArr, 0, this.f260294e, 0, i);
                }
                int i6 = this.f260295f;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f260293d, i, i6 - i);
                    System.arraycopy(eArr, i7, this.f260294e, i, this.f260295f - i);
                }
            }
        }
        return e;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo124744l(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f260295f - 1; i >= 0; i--) {
            if (!collection.contains(this.f260294e[i])) {
                mo124744l(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f260295f;
    }

    public Object[] toArray() {
        int i = this.f260295f;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f260294e, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f260295f * 14);
        sb.append('{');
        for (int i = 0; i < this.f260295f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f260294e[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C90590d(int i) {
        if (i == 0) {
            this.f260293d = f260287h;
            this.f260294e = f260288i;
        } else {
            mo124737f(i);
        }
        this.f260295f = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f260295f) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f260295f);
        }
        System.arraycopy(this.f260294e, 0, tArr, 0, this.f260295f);
        int length = tArr.length;
        int i = this.f260295f;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
