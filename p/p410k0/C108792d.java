package p410k0;

import gy3.C87412m;
import java.util.Arrays;
import sx3.C110821n;

/* renamed from: k0.d */
public final class C108792d<T> {

    /* renamed from: a */
    public int[] f325780a;

    /* renamed from: b */
    public Object[] f325781b;

    /* renamed from: c */
    public C60926c<T>[] f325782c;

    /* renamed from: d */
    public int f325783d;

    public C108792d() {
        int[] iArr = new int[50];
        for (int i = 0; i < 50; i++) {
            iArr[i] = i;
        }
        this.f325780a = iArr;
        this.f325781b = new Object[50];
        this.f325782c = new C60926c[50];
    }

    /* renamed from: a */
    public final boolean mo159855a(Object obj, T t) {
        C60926c<T> cVar;
        int i;
        C87412m.m108594g(obj, "value");
        C87412m.m108594g(t, "scope");
        if (this.f325783d > 0) {
            i = mo159856b(obj);
            if (i >= 0) {
                cVar = mo159858d(i);
                return cVar.add(t);
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int i3 = this.f325783d;
        int[] iArr = this.f325780a;
        if (i3 < iArr.length) {
            int i4 = iArr[i3];
            this.f325781b[i4] = obj;
            cVar = this.f325782c[i4];
            if (cVar == null) {
                cVar = new C60926c<>();
                this.f325782c[i4] = cVar;
            }
            int i5 = this.f325783d;
            if (i2 < i5) {
                int[] iArr2 = this.f325780a;
                C110821n.m150962i(iArr2, iArr2, i2 + 1, i2, i5);
            }
            this.f325780a[i2] = i4;
            this.f325783d++;
        } else {
            int length = iArr.length * 2;
            Object[] copyOf = Arrays.copyOf(this.f325782c, length);
            C87412m.m108593f(copyOf, "copyOf(this, newSize)");
            this.f325782c = (C60926c[]) copyOf;
            C60926c<T> cVar2 = new C60926c<>();
            this.f325782c[i3] = cVar2;
            Object[] copyOf2 = Arrays.copyOf(this.f325781b, length);
            C87412m.m108593f(copyOf2, "copyOf(this, newSize)");
            this.f325781b = copyOf2;
            copyOf2[i3] = obj;
            int[] iArr3 = new int[length];
            int i6 = this.f325783d;
            while (true) {
                i6++;
                if (i6 >= length) {
                    break;
                }
                iArr3[i6] = i6;
            }
            int i7 = this.f325783d;
            if (i2 < i7) {
                C110821n.m150962i(this.f325780a, iArr3, i2 + 1, i2, i7);
            }
            iArr3[i2] = i3;
            if (i2 > 0) {
                C110821n.m150965l(this.f325780a, iArr3, 0, 0, i2, 6, (Object) null);
            }
            this.f325780a = iArr3;
            this.f325783d++;
            cVar = cVar2;
        }
        return cVar.add(t);
    }

    /* renamed from: b */
    public final int mo159856b(Object obj) {
        int identityHashCode = System.identityHashCode(obj);
        int i = 0;
        int i2 = this.f325783d - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            Object obj2 = this.f325781b[this.f325780a[i3]];
            C87412m.m108591d(obj2);
            int identityHashCode2 = System.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i = i3 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i2 = i3 - 1;
            } else if (obj == obj2) {
                return i3;
            } else {
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    Object obj3 = this.f325781b[this.f325780a[i4]];
                    C87412m.m108591d(obj3);
                    if (obj3 == obj) {
                        return i4;
                    }
                    if (System.identityHashCode(obj3) != identityHashCode) {
                        break;
                    }
                }
                int i5 = i3 + 1;
                int i6 = this.f325783d;
                while (true) {
                    if (i5 >= i6) {
                        i5 = this.f325783d;
                        break;
                    }
                    Object obj4 = this.f325781b[this.f325780a[i5]];
                    C87412m.m108591d(obj4);
                    if (obj4 == obj) {
                        return i5;
                    }
                    if (System.identityHashCode(obj4) != identityHashCode) {
                        break;
                    }
                    i5++;
                }
                return -(i5 + 1);
            }
        }
        return -(i + 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r4.f325780a[r5];
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo159857c(java.lang.Object r5, T r6) {
        /*
            r4 = this;
            java.lang.String r0 = "value"
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "scope"
            gy3.C87412m.m108594g(r6, r0)
            int r5 = r4.mo159856b(r5)
            r0 = 0
            if (r5 < 0) goto L_0x0041
            int[] r1 = r4.f325780a
            r1 = r1[r5]
            k0.c<T>[] r2 = r4.f325782c
            r2 = r2[r1]
            if (r2 != 0) goto L_0x001c
            return r0
        L_0x001c:
            boolean r6 = r2.remove(r6)
            int r0 = r2.f173545d
            if (r0 != 0) goto L_0x0040
            int r0 = r5 + 1
            int r2 = r4.f325783d
            if (r0 >= r2) goto L_0x002f
            int[] r3 = r4.f325780a
            sx3.C110821n.m150962i(r3, r3, r5, r0, r2)
        L_0x002f:
            int[] r5 = r4.f325780a
            int r0 = r4.f325783d
            int r2 = r0 + -1
            r5[r2] = r1
            java.lang.Object[] r5 = r4.f325781b
            r2 = 0
            r5[r1] = r2
            int r0 = r0 + -1
            r4.f325783d = r0
        L_0x0040:
            return r6
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410k0.C108792d.mo159857c(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: d */
    public final C60926c<T> mo159858d(int i) {
        C60926c<T> cVar = this.f325782c[this.f325780a[i]];
        C87412m.m108591d(cVar);
        return cVar;
    }
}
