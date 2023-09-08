package p603m0;

import fy3.C32226l;
import gy3.C87412m;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import p414p0.C110092c;
import p854l0.C109070a;
import p854l0.C109072c;
import sx3.C110821n;
import sx3.C110823p;

/* renamed from: m0.j */
public final class C109451j<E> extends C109442b<E> implements C109070a<E> {

    /* renamed from: f */
    public static final C109451j f327609f = new C109451j(new Object[0]);

    /* renamed from: e */
    public final Object[] f327610e;

    public C109451j(Object[] objArr) {
        C87412m.m108594g(objArr, "buffer");
        this.f327610e = objArr;
    }

    /* renamed from: H0 */
    public C109072c<E> mo160315H0(C32226l<? super E, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        Object[] objArr = this.f327610e;
        int f = mo52189f();
        int f2 = mo52189f();
        boolean z = false;
        for (int i = 0; i < f2; i++) {
            Object obj = this.f327610e[i];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z) {
                    Object[] objArr2 = this.f327610e;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    C87412m.m108593f(objArr, "copyOf(this, size)");
                    z = true;
                    f = i;
                }
            } else if (z) {
                objArr[f] = obj;
                f++;
            }
        }
        return f == mo52189f() ? this : f == 0 ? f327609f : new C109451j(C110821n.m150967n(objArr, 0, f));
    }

    public C109072c<E> add(int i, E e) {
        C110092c.m149676b(i, this.f327610e.length);
        Object[] objArr = this.f327610e;
        if (i == objArr.length) {
            return add(e);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[(objArr.length + 1)];
            C110821n.m150966m(objArr, objArr2, 0, 0, i, 6, (Object) null);
            Object[] objArr3 = this.f327610e;
            C110821n.m150963j(objArr3, objArr2, i + 1, i, objArr3.length);
            objArr2[i] = e;
            return new C109451j(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C87412m.m108593f(copyOf, "copyOf(this, size)");
        Object[] objArr4 = this.f327610e;
        C110821n.m150963j(objArr4, copyOf, i + 1, i, objArr4.length - 1);
        copyOf[i] = e;
        Object[] objArr5 = this.f327610e;
        Object[] objArr6 = new Object[32];
        objArr6[0] = objArr5[31];
        return new C109446e(copyOf, objArr6, objArr5.length + 1, 0);
    }

    public C109072c<E> addAll(Collection<? extends E> collection) {
        C87412m.m108594g(collection, "elements");
        if (mo52189f() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.f327610e, mo52189f() + collection.size());
            C87412m.m108593f(copyOf, "copyOf(this, newSize)");
            int f = mo52189f();
            for (Object obj : collection) {
                copyOf[f] = obj;
                f++;
            }
            return new C109451j(copyOf);
        }
        C109072c.C109073a d = mo160319d();
        d.addAll(collection);
        return d.build();
    }

    /* renamed from: d */
    public C109072c.C109073a<E> mo160319d() {
        return new C109447f(this, (Object[]) null, this.f327610e, 0);
    }

    /* renamed from: f */
    public int mo52189f() {
        return this.f327610e.length;
    }

    public E get(int i) {
        C110092c.m149675a(i, mo52189f());
        return this.f327610e[i];
    }

    public int indexOf(Object obj) {
        return C110823p.m150984J(this.f327610e, obj);
    }

    public int lastIndexOf(Object obj) {
        Object[] objArr = this.f327610e;
        C87412m.m108594g(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length < 0) {
                return -1;
            }
            while (true) {
                int i = length - 1;
                if (objArr[length] == null) {
                    return length;
                }
                if (i < 0) {
                    return -1;
                }
                length = i;
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 < 0) {
                return -1;
            }
            while (true) {
                int i2 = length2 - 1;
                if (C87412m.m108589b(obj, objArr[length2])) {
                    return length2;
                }
                if (i2 < 0) {
                    return -1;
                }
                length2 = i2;
            }
        }
    }

    public ListIterator<E> listIterator(int i) {
        C110092c.m149676b(i, mo52189f());
        return new C109444c(this.f327610e, i, mo52189f());
    }

    /* renamed from: n0 */
    public C109072c<E> mo160320n0(int i) {
        C110092c.m149675a(i, mo52189f());
        if (mo52189f() == 1) {
            return f327609f;
        }
        Object[] copyOf = Arrays.copyOf(this.f327610e, mo52189f() - 1);
        C87412m.m108593f(copyOf, "copyOf(this, newSize)");
        C110821n.m150963j(this.f327610e, copyOf, i, i + 1, mo52189f());
        return new C109451j(copyOf);
    }

    public C109072c<E> set(int i, E e) {
        C110092c.m149675a(i, mo52189f());
        Object[] objArr = this.f327610e;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        C87412m.m108593f(copyOf, "copyOf(this, size)");
        copyOf[i] = e;
        return new C109451j(copyOf);
    }

    public C109072c<E> add(E e) {
        Object[] objArr = this.f327610e;
        if (objArr.length < 32) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
            C87412m.m108593f(copyOf, "copyOf(this, newSize)");
            copyOf[this.f327610e.length] = e;
            return new C109451j(copyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = e;
        return new C109446e(objArr, objArr2, objArr.length + 1, 0);
    }
}
