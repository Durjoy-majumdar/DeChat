package com.google.protobuf;

import com.tencent.p014mm.plugin.appbrand.jsapi.C1883v2;
import java.util.Arrays;

/* renamed from: com.google.protobuf.t2 */
public final class C24046t2 {

    /* renamed from: f */
    public static final C24046t2 f69159f = new C24046t2(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f69160a;

    /* renamed from: b */
    public int[] f69161b;

    /* renamed from: c */
    public Object[] f69162c;

    /* renamed from: d */
    public int f69163d;

    /* renamed from: e */
    public boolean f69164e;

    public C24046t2() {
        this(0, new int[8], new Object[8], true);
    }

    /* renamed from: c */
    public static C24046t2 m29897c(C24046t2 t2Var, C24046t2 t2Var2) {
        int i = t2Var.f69160a + t2Var2.f69160a;
        int[] copyOf = Arrays.copyOf(t2Var.f69161b, i);
        System.arraycopy(t2Var2.f69161b, 0, copyOf, t2Var.f69160a, t2Var2.f69160a);
        Object[] copyOf2 = Arrays.copyOf(t2Var.f69162c, i);
        System.arraycopy(t2Var2.f69162c, 0, copyOf2, t2Var.f69160a, t2Var2.f69160a);
        return new C24046t2(i, copyOf, copyOf2, true);
    }

    /* renamed from: a */
    public int mo38359a() {
        int i;
        int i2 = this.f69163d;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f69160a; i4++) {
            int i5 = this.f69161b[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = C23897n.m29280y(i6, ((Long) this.f69162c[i4]).longValue());
            } else if (i7 == 1) {
                i = C23897n.m29263h(i6, ((Long) this.f69162c[i4]).longValue());
            } else if (i7 == 2) {
                i = C23897n.m29258c(i6, (C16994k) this.f69162c[i4]);
            } else if (i7 == 3) {
                i = (C23897n.m29277v(i6) * 2) + ((C24046t2) this.f69162c[i4]).mo38359a();
            } else if (i7 == 5) {
                i = C23897n.m29262g(i6, ((Integer) this.f69162c[i4]).intValue());
            } else {
                throw new IllegalStateException(C23922p0.m29479d());
            }
            i3 += i;
        }
        this.f69163d = i3;
        return i3;
    }

    /* renamed from: b */
    public boolean mo38360b(int i, C23856l lVar) {
        int F;
        if (this.f69164e) {
            int i2 = i >>> 3;
            int i3 = i & 7;
            if (i3 == 0) {
                mo38361d(i, Long.valueOf(lVar.mo37776u()));
                return true;
            } else if (i3 == 1) {
                mo38361d(i, Long.valueOf(lVar.mo37772q()));
                return true;
            } else if (i3 == 2) {
                mo38361d(i, lVar.mo37768m());
                return true;
            } else if (i3 == 3) {
                C24046t2 t2Var = new C24046t2();
                do {
                    F = lVar.mo37757F();
                    if (F == 0 || !t2Var.mo38360b(F, lVar)) {
                        lVar.mo37761a((i2 << 3) | 4);
                        mo38361d(i, t2Var);
                    }
                    F = lVar.mo37757F();
                    break;
                } while (!t2Var.mo38360b(F, lVar));
                lVar.mo37761a((i2 << 3) | 4);
                mo38361d(i, t2Var);
                return true;
            } else if (i3 == 4) {
                return false;
            } else {
                if (i3 == 5) {
                    mo38361d(i, Integer.valueOf(lVar.mo37771p()));
                    return true;
                }
                throw C23922p0.m29479d();
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: d */
    public void mo38361d(int i, Object obj) {
        if (this.f69164e) {
            int i2 = this.f69160a;
            int[] iArr = this.f69161b;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.f69161b = Arrays.copyOf(iArr, i3);
                this.f69162c = Arrays.copyOf(this.f69162c, i3);
            }
            int[] iArr2 = this.f69161b;
            int i4 = this.f69160a;
            iArr2[i4] = i;
            this.f69162c[i4] = obj;
            this.f69160a = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public void mo38362e(C23809a3 a3Var) {
        if (this.f69160a != 0) {
            a3Var.getClass();
            for (int i = 0; i < this.f69160a; i++) {
                int i2 = this.f69161b[i];
                Object obj = this.f69162c[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    ((C23907o) a3Var).mo37966n(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    ((C23907o) a3Var).mo37961i(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    ((C23907o) a3Var).mo37954b(i3, (C16994k) obj);
                } else if (i4 == 3) {
                    C23907o oVar = (C23907o) a3Var;
                    oVar.mo37974v(i3);
                    ((C24046t2) obj).mo38362e(a3Var);
                    oVar.mo37957e(i3);
                } else if (i4 == 5) {
                    ((C23907o) a3Var).mo37959g(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(C23922p0.m29479d());
                }
            }
        }
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C24046t2)) {
            return false;
        }
        C24046t2 t2Var = (C24046t2) obj;
        int i = this.f69160a;
        if (i == t2Var.f69160a) {
            int[] iArr = this.f69161b;
            int[] iArr2 = t2Var.f69161b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.f69162c;
                Object[] objArr2 = t2Var.f69162c;
                int i3 = this.f69160a;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public int hashCode() {
        int i = this.f69160a;
        int i2 = (C1883v2.CTRL_INDEX + i) * 31;
        int[] iArr = this.f69161b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f69162c;
        int i7 = this.f69160a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public C24046t2(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f69163d = -1;
        this.f69160a = i;
        this.f69161b = iArr;
        this.f69162c = objArr;
        this.f69164e = z;
    }
}
