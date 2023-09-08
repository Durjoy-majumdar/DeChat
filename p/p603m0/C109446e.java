package p603m0;

import fy3.C32226l;
import gy3.C87412m;
import java.util.Arrays;
import java.util.ListIterator;
import p414p0.C110092c;
import p854l0.C109072c;
import sx3.C110821n;

/* renamed from: m0.e */
public final class C109446e<E> extends C109442b<E> {

    /* renamed from: e */
    public final Object[] f327590e;

    /* renamed from: f */
    public final Object[] f327591f;

    /* renamed from: g */
    public final int f327592g;

    /* renamed from: h */
    public final int f327593h;

    public C109446e(Object[] objArr, Object[] objArr2, int i, int i2) {
        C87412m.m108594g(objArr, "root");
        C87412m.m108594g(objArr2, "tail");
        this.f327590e = objArr;
        this.f327591f = objArr2;
        this.f327592g = i;
        this.f327593h = i2;
        if (!(mo52189f() > 32)) {
            throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + mo52189f()).toString());
        }
    }

    /* renamed from: H0 */
    public C109072c<E> mo160315H0(C32226l<? super E, Boolean> lVar) {
        C87412m.m108594g(lVar, "predicate");
        C109447f fVar = new C109447f(this, this.f327590e, this.f327591f, this.f327593h);
        fVar.mo160646H(lVar);
        return fVar.build();
    }

    public C109072c<E> add(int i, E e) {
        C110092c.m149676b(i, mo52189f());
        if (i == mo52189f()) {
            return add(e);
        }
        int r = mo160638r();
        if (i >= r) {
            return mo160632k(this.f327590e, i - r, e);
        }
        C109445d dVar = new C109445d((Object) null);
        return mo160632k(mo160631i(this.f327590e, this.f327593h, i, e, dVar), 0, dVar.f327589a);
    }

    /* renamed from: d */
    public C109072c.C109073a mo160319d() {
        return new C109447f(this, this.f327590e, this.f327591f, this.f327593h);
    }

    /* renamed from: f */
    public int mo52189f() {
        return this.f327592g;
    }

    public E get(int i) {
        E[] eArr;
        C110092c.m149675a(i, mo52189f());
        if (mo160638r() <= i) {
            eArr = this.f327591f;
        } else {
            eArr = this.f327590e;
            int i2 = this.f327593h;
            while (i2 > 0) {
                E e = eArr[(i >> i2) & 31];
                if (e != null) {
                    eArr = (Object[]) e;
                    i2 -= 5;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        return eArr[i & 31];
    }

    /* renamed from: i */
    public final Object[] mo160631i(Object[] objArr, int i, int i2, Object obj, C109445d dVar) {
        Object[] objArr2;
        Object[] objArr3 = objArr;
        C109445d dVar2 = dVar;
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            if (i3 == 0) {
                objArr2 = new Object[32];
            } else {
                Object[] copyOf = Arrays.copyOf(objArr, 32);
                C87412m.m108593f(copyOf, "copyOf(this, newSize)");
                objArr2 = copyOf;
            }
            C110821n.m150963j(objArr, objArr2, i3 + 1, i3, 31);
            dVar2.f327589a = objArr3[31];
            objArr2[i3] = obj;
            return objArr2;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        C87412m.m108593f(copyOf2, "copyOf(this, newSize)");
        int i4 = i - 5;
        Object obj2 = objArr3[i3];
        if (obj2 != null) {
            copyOf2[i3] = mo160631i((Object[]) obj2, i4, i2, obj, dVar);
            while (true) {
                i3++;
                if (i3 >= 32 || copyOf2[i3] == null) {
                    return copyOf2;
                }
                Object obj3 = objArr3[i3];
                if (obj3 != null) {
                    copyOf2[i3] = mo160631i((Object[]) obj3, i4, 0, dVar2.f327589a, dVar);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
            return copyOf2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* renamed from: k */
    public final C109446e<E> mo160632k(Object[] objArr, int i, Object obj) {
        int r = this.f327592g - mo160638r();
        Object[] copyOf = Arrays.copyOf(this.f327591f, 32);
        C87412m.m108593f(copyOf, "copyOf(this, newSize)");
        if (r < 32) {
            C110821n.m150963j(this.f327591f, copyOf, i + 1, i, r);
            copyOf[i] = obj;
            return new C109446e<>(objArr, copyOf, this.f327592g + 1, this.f327593h);
        }
        Object[] objArr2 = this.f327591f;
        Object obj2 = objArr2[31];
        C110821n.m150963j(objArr2, copyOf, i + 1, i, r - 1);
        copyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return mo160634m(objArr, copyOf, objArr3);
    }

    /* renamed from: l */
    public final Object[] mo160633l(Object[] objArr, int i, int i2, C109445d dVar) {
        Object[] objArr2;
        int i3 = (i2 >> i) & 31;
        if (i == 5) {
            dVar.f327589a = objArr[i3];
            objArr2 = null;
        } else {
            Object[] objArr3 = objArr[i3];
            if (objArr3 != null) {
                objArr2 = mo160633l(objArr3, i - 5, i2, dVar);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
        }
        if (objArr2 == null && i3 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C87412m.m108593f(copyOf, "copyOf(this, newSize)");
        copyOf[i3] = objArr2;
        return copyOf;
    }

    public ListIterator<E> listIterator(int i) {
        C110092c.m149676b(i, mo52189f());
        return new C109448g(this.f327590e, this.f327591f, i, mo52189f(), (this.f327593h / 5) + 1);
    }

    /* renamed from: m */
    public final C109446e<E> mo160634m(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f327592g >> 5;
        int i2 = this.f327593h;
        if (i <= (1 << i2)) {
            return new C109446e<>(mo160635n(objArr, i2, objArr2), objArr3, this.f327592g + 1, this.f327593h);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i3 = i2 + 5;
        return new C109446e<>(mo160635n(objArr4, i3, objArr2), objArr3, this.f327592g + 1, i3);
    }

    /* renamed from: n */
    public final Object[] mo160635n(Object[] objArr, int i, Object[] objArr2) {
        Object[] objArr3;
        int f = ((mo52189f() - 1) >> i) & 31;
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            C87412m.m108593f(objArr3, "copyOf(this, newSize)");
        } else {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[f] = objArr2;
        } else {
            objArr3[f] = mo160635n((Object[]) objArr3[f], i - 5, objArr2);
        }
        return objArr3;
    }

    /* renamed from: n0 */
    public C109072c<E> mo160320n0(int i) {
        C110092c.m149675a(i, mo52189f());
        int r = mo160638r();
        return i >= r ? mo160637p(this.f327590e, r, this.f327593h, i - r) : mo160637p(mo160636o(this.f327590e, this.f327593h, i, new C109445d(this.f327591f[0])), r, this.f327593h, 0);
    }

    /* renamed from: o */
    public final Object[] mo160636o(Object[] objArr, int i, int i2, C109445d dVar) {
        Object[] objArr2;
        int i3 = 31;
        int i4 = (i2 >> i) & 31;
        if (i == 0) {
            if (i4 == 0) {
                objArr2 = new Object[32];
            } else {
                objArr2 = Arrays.copyOf(objArr, 32);
                C87412m.m108593f(objArr2, "copyOf(this, newSize)");
            }
            C110821n.m150963j(objArr, objArr2, i4, i4 + 1, 32);
            objArr2[31] = dVar.f327589a;
            dVar.f327589a = objArr[i4];
            return objArr2;
        }
        if (objArr[31] == null) {
            i3 = 31 & ((mo160638r() - 1) >> i);
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C87412m.m108593f(copyOf, "copyOf(this, newSize)");
        int i5 = i - 5;
        int i6 = i4 + 1;
        if (i6 <= i3) {
            while (true) {
                Object obj = copyOf[i3];
                if (obj != null) {
                    copyOf[i3] = mo160636o((Object[]) obj, i5, 0, dVar);
                    if (i3 == i6) {
                        break;
                    }
                    i3--;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
            }
        }
        Object obj2 = copyOf[i4];
        if (obj2 != null) {
            copyOf[i4] = mo160636o((Object[]) obj2, i5, i2, dVar);
            return copyOf;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
    }

    /* renamed from: p */
    public final C109072c<E> mo160637p(Object[] objArr, int i, int i2, int i3) {
        C109446e eVar;
        int f = mo52189f() - i;
        if (f != 1) {
            Object[] copyOf = Arrays.copyOf(this.f327591f, 32);
            C87412m.m108593f(copyOf, "copyOf(this, newSize)");
            int i4 = f - 1;
            if (i3 < i4) {
                C110821n.m150963j(this.f327591f, copyOf, i3, i3 + 1, f);
            }
            copyOf[i4] = null;
            return new C109446e(objArr, copyOf, (i + f) - 1, i2);
        } else if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                C87412m.m108593f(objArr, "copyOf(this, newSize)");
            }
            return new C109451j(objArr);
        } else {
            C109445d dVar = new C109445d((Object) null);
            Object[] l = mo160633l(objArr, i2, i - 1, dVar);
            C87412m.m108591d(l);
            Object obj = dVar.f327589a;
            if (obj != null) {
                Object[] objArr2 = (Object[]) obj;
                if (l[1] == null) {
                    Object obj2 = l[0];
                    if (obj2 != null) {
                        eVar = new C109446e((Object[]) obj2, objArr2, i, i2 - 5);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    }
                } else {
                    eVar = new C109446e(l, objArr2, i, i2);
                }
                return eVar;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
    }

    /* renamed from: r */
    public final int mo160638r() {
        return (mo52189f() - 1) & -32;
    }

    /* renamed from: s */
    public final Object[] mo160639s(Object[] objArr, int i, int i2, Object obj) {
        int i3 = (i2 >> i) & 31;
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        C87412m.m108593f(copyOf, "copyOf(this, newSize)");
        if (i == 0) {
            copyOf[i3] = obj;
        } else {
            Object obj2 = copyOf[i3];
            if (obj2 != null) {
                copyOf[i3] = mo160639s((Object[]) obj2, i - 5, i2, obj);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
        }
        return copyOf;
    }

    public C109072c<E> set(int i, E e) {
        C110092c.m149675a(i, mo52189f());
        if (mo160638r() > i) {
            return new C109446e(mo160639s(this.f327590e, this.f327593h, i, e), this.f327591f, mo52189f(), this.f327593h);
        }
        Object[] copyOf = Arrays.copyOf(this.f327591f, 32);
        C87412m.m108593f(copyOf, "copyOf(this, newSize)");
        copyOf[i & 31] = e;
        return new C109446e(this.f327590e, copyOf, mo52189f(), this.f327593h);
    }

    public C109072c<E> add(E e) {
        int r = this.f327592g - mo160638r();
        if (r < 32) {
            Object[] copyOf = Arrays.copyOf(this.f327591f, 32);
            C87412m.m108593f(copyOf, "copyOf(this, newSize)");
            copyOf[r] = e;
            return new C109446e(this.f327590e, copyOf, this.f327592g + 1, this.f327593h);
        }
        Object[] objArr = new Object[32];
        objArr[0] = e;
        return mo160634m(this.f327590e, this.f327591f, objArr);
    }
}
