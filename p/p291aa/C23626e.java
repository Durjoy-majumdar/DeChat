package p291aa;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: aa.e */
public class C23626e<E> extends C23632k<E> implements Set<E> {
    public boolean add(E e) {
        int w = mo37179w(e);
        boolean z = false;
        if (w < 0) {
            return false;
        }
        Object[] objArr = this.f67821i;
        Object obj = objArr[w];
        objArr[w] = e;
        if (obj == null) {
            z = true;
        }
        mo37130n(z);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        mo37129m(size);
        Iterator<? extends E> it = collection.iterator();
        boolean z = false;
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return z;
            }
            if (add(it.next())) {
                z = true;
            }
            size = i;
        }
    }

    public void clear() {
        super.clear();
        Object[] objArr = this.f67821i;
        int length = objArr.length;
        while (true) {
            int i = length - 1;
            if (length > 0) {
                objArr[i] = null;
                length = i;
            } else {
                return;
            }
        }
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
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (set.size() != this.f67798d) {
            return false;
        }
        return containsAll(set);
    }

    public int hashCode() {
        Object[] objArr = this.f67821i;
        int length = objArr.length;
        int i = 0;
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return i;
            }
            Object obj = objArr[i2];
            if (!(obj == null || obj == C23632k.f67819n)) {
                i += ((C23632k) this.f67822j).mo37176t(obj);
            }
            length = i2;
        }
    }

    public Iterator<E> iterator() {
        return new C23634l(this);
    }

    /* renamed from: o */
    public void mo37131o(int i) {
        Object[] objArr = this.f67821i;
        int length = objArr.length;
        this.f67821i = new Object[i];
        while (true) {
            int i2 = length - 1;
            if (length > 0) {
                Object obj = objArr[i2];
                if (!(obj == null || obj == C23632k.f67819n)) {
                    int w = mo37179w(obj);
                    if (w >= 0) {
                        this.f67821i[w] = obj;
                    } else {
                        mo37180x(this.f67821i[(-w) - 1], obj);
                        throw null;
                    }
                }
                length = i2;
            } else {
                return;
            }
        }
    }

    public boolean remove(Object obj) {
        int v = mo37178v(obj);
        if (v < 0) {
            return false;
        }
        mo37132p(v);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        int size = collection.size();
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (true) {
            int i = size - 1;
            if (size <= 0) {
                return z;
            }
            if (remove(it.next())) {
                z = true;
            }
            size = i;
        }
    }

    public boolean retainAll(Collection<?> collection) {
        int i = this.f67798d;
        C23634l lVar = new C23634l(this);
        boolean z = false;
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return z;
            }
            if (!collection.contains(lVar.next())) {
                lVar.remove();
                z = true;
            }
            i = i2;
        }
    }

    public Object[] toArray() {
        Object[] objArr = new Object[this.f67798d];
        int i = 0;
        Object[] objArr2 = this.f67821i;
        int length = objArr2.length;
        while (true) {
            int i2 = length - 1;
            if (length <= 0) {
                return objArr;
            }
            Object obj = objArr2[i2];
            if (!(obj == null || obj == C23632k.f67819n)) {
                objArr[i] = obj;
                i++;
            }
            length = i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033 A[LOOP:0: B:4:0x001a->B:16:0x0033, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T[] toArray(T[] r8) {
        /*
            r7 = this;
            int r0 = r7.f67798d
            int r1 = r8.length
            if (r1 >= r0) goto L_0x0013
            java.lang.Class r8 = r8.getClass()
            java.lang.Class r8 = r8.getComponentType()
            java.lang.Object r8 = java.lang.reflect.Array.newInstance(r8, r0)
            java.lang.Object[] r8 = (java.lang.Object[]) r8
        L_0x0013:
            int r1 = r7.f67798d
            int r2 = r7.mo37125f()
            r3 = 0
        L_0x001a:
            if (r3 >= r0) goto L_0x0049
            int r4 = r7.f67798d
            if (r1 != r4) goto L_0x0043
            java.lang.Object[] r4 = r7.f67821i
        L_0x0022:
            int r5 = r2 + -1
            if (r2 <= 0) goto L_0x0031
            r2 = r4[r5]
            if (r2 == 0) goto L_0x002f
            java.lang.Object r6 = p291aa.C23632k.f67819n
            if (r2 == r6) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r2 = r5
            goto L_0x0022
        L_0x0031:
            if (r5 < 0) goto L_0x003d
            java.lang.Object[] r2 = r7.f67821i
            r2 = r2[r5]
            r8[r3] = r2
            int r3 = r3 + 1
            r2 = r5
            goto L_0x001a
        L_0x003d:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x0043:
            java.util.ConcurrentModificationException r8 = new java.util.ConcurrentModificationException
            r8.<init>()
            throw r8
        L_0x0049:
            int r1 = r8.length
            if (r1 <= r0) goto L_0x004f
            r1 = 0
            r8[r0] = r1
        L_0x004f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p291aa.C23626e.toArray(java.lang.Object[]):java.lang.Object[]");
    }
}
