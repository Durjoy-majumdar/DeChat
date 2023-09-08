package as3;

import java.util.Arrays;
import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.c0 */
public final class C103862c0 extends C108421e {

    /* renamed from: b */
    public String f306915b = "";

    /* renamed from: c */
    public int f306916c = 0;

    /* renamed from: d */
    public long f306917d = 0;

    /* renamed from: e */
    public C103895q[] f306918e = C103895q.m138543f();

    /* renamed from: f */
    public C103860b1[] f306919f = C103860b1.m138436f();

    /* renamed from: g */
    public C103912y0 f306920g = null;

    /* renamed from: h */
    public int f306921h = 0;

    /* renamed from: i */
    public int[] f306922i;

    /* renamed from: j */
    public int f306923j;

    /* renamed from: k */
    public C103863c1[] f306924k;

    /* renamed from: l */
    public C103914z0 f306925l;

    /* renamed from: m */
    public int f306926m;

    /* renamed from: n */
    public C103895q[] f306927n;

    /* renamed from: o */
    public C103895q[] f306928o;

    /* renamed from: p */
    public int f306929p;

    /* renamed from: q */
    public int f306930q;

    /* renamed from: r */
    public int f306931r;

    /* renamed from: s */
    public byte[] f306932s;

    /* renamed from: t */
    public int f306933t;

    /* renamed from: u */
    public int[] f306934u;

    /* renamed from: v */
    public int f306935v;

    /* renamed from: w */
    public int f306936w;

    /* renamed from: x */
    public int f306937x;

    /* renamed from: y */
    public C103860b1[] f306938y;

    public C103862c0() {
        int[] iArr = C108422g.f324644a;
        this.f306922i = iArr;
        this.f306923j = 0;
        this.f306924k = C103863c1.m138446f();
        this.f306925l = null;
        this.f306926m = 0;
        this.f306927n = C103895q.m138543f();
        this.f306928o = C103895q.m138543f();
        this.f306929p = 0;
        this.f306930q = 0;
        this.f306931r = 0;
        this.f306932s = C108422g.f324646c;
        this.f306933t = -1;
        this.f306934u = iArr;
        this.f306935v = 0;
        this.f306936w = 0;
        this.f306937x = 0;
        this.f306938y = C103860b1.m138436f();
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int[] iArr;
        int[] iArr2;
        int i = 0;
        int g = !this.f306915b.equals("") ? C108418b.m146887g(1, this.f306915b) + 0 : 0;
        int i2 = this.f306916c;
        if (i2 != 0) {
            g += C108418b.m146882b(2, i2);
        }
        long j = this.f306917d;
        if (j != 0) {
            g += C108418b.m146883c(3, j);
        }
        C103895q[] qVarArr = this.f306918e;
        if (qVarArr != null && qVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C103895q[] qVarArr2 = this.f306918e;
                if (i3 >= qVarArr2.length) {
                    break;
                }
                C103895q qVar = qVarArr2[i3];
                if (qVar != null) {
                    g += C108418b.m146884d(4, qVar);
                }
                i3++;
            }
        }
        C103860b1[] b1VarArr = this.f306919f;
        if (b1VarArr != null && b1VarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C103860b1[] b1VarArr2 = this.f306919f;
                if (i4 >= b1VarArr2.length) {
                    break;
                }
                C103860b1 b1Var = b1VarArr2[i4];
                if (b1Var != null) {
                    g += C108418b.m146884d(5, b1Var);
                }
                i4++;
            }
        }
        C103912y0 y0Var = this.f306920g;
        if (y0Var != null) {
            g += C108418b.m146884d(6, y0Var);
        }
        int i5 = this.f306921h;
        if (i5 != 0) {
            g += C108418b.m146882b(7, i5);
        }
        int[] iArr3 = this.f306922i;
        if (iArr3 != null && iArr3.length > 0) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                iArr2 = this.f306922i;
                if (i6 >= iArr2.length) {
                    break;
                }
                int i8 = iArr2[i6];
                i7 += i8 >= 0 ? C108418b.m146885e(i8) : 10;
                i6++;
            }
            g = g + i7 + (iArr2.length * 1);
        }
        int i9 = this.f306923j;
        if (i9 != 0) {
            g += C108418b.m146882b(9, i9);
        }
        C103863c1[] c1VarArr = this.f306924k;
        if (c1VarArr != null && c1VarArr.length > 0) {
            int i15 = 0;
            while (true) {
                C103863c1[] c1VarArr2 = this.f306924k;
                if (i15 >= c1VarArr2.length) {
                    break;
                }
                C103863c1 c1Var = c1VarArr2[i15];
                if (c1Var != null) {
                    g += C108418b.m146884d(10, c1Var);
                }
                i15++;
            }
        }
        C103914z0 z0Var = this.f306925l;
        if (z0Var != null) {
            g += C108418b.m146884d(11, z0Var);
        }
        int i16 = this.f306926m;
        if (i16 != 0) {
            g += C108418b.m146890j(12, i16);
        }
        C103895q[] qVarArr3 = this.f306927n;
        if (qVarArr3 != null && qVarArr3.length > 0) {
            int i17 = 0;
            while (true) {
                C103895q[] qVarArr4 = this.f306927n;
                if (i17 >= qVarArr4.length) {
                    break;
                }
                C103895q qVar2 = qVarArr4[i17];
                if (qVar2 != null) {
                    g += C108418b.m146884d(13, qVar2);
                }
                i17++;
            }
        }
        C103895q[] qVarArr5 = this.f306928o;
        if (qVarArr5 != null && qVarArr5.length > 0) {
            int i18 = 0;
            while (true) {
                C103895q[] qVarArr6 = this.f306928o;
                if (i18 >= qVarArr6.length) {
                    break;
                }
                C103895q qVar3 = qVarArr6[i18];
                if (qVar3 != null) {
                    g += C108418b.m146884d(14, qVar3);
                }
                i18++;
            }
        }
        int i19 = this.f306929p;
        if (i19 != 0) {
            g += C108418b.m146882b(15, i19);
        }
        int i25 = this.f306930q;
        if (i25 != 0) {
            g += C108418b.m146882b(16, i25);
        }
        int i26 = this.f306931r;
        if (i26 != 0) {
            g += C108418b.m146882b(17, i26);
        }
        if (!Arrays.equals(this.f306932s, C108422g.f324646c)) {
            g += C108418b.m146881a(18, this.f306932s);
        }
        int i27 = this.f306933t;
        if (i27 != -1) {
            g += C108418b.m146882b(19, i27);
        }
        int[] iArr4 = this.f306934u;
        if (iArr4 != null && iArr4.length > 0) {
            int i28 = 0;
            int i29 = 0;
            while (true) {
                iArr = this.f306934u;
                if (i28 >= iArr.length) {
                    break;
                }
                i29 += C108418b.m146885e(iArr[i28]);
                i28++;
            }
            g = g + i29 + (iArr.length * 2);
        }
        int i35 = this.f306935v;
        if (i35 != 0) {
            g += C108418b.m146890j(21, i35);
        }
        int i36 = this.f306936w;
        if (i36 != 0) {
            g += C108418b.m146890j(100, i36);
        }
        int i37 = this.f306937x;
        if (i37 != 0) {
            g += C108418b.m146890j(101, i37);
        }
        C103860b1[] b1VarArr3 = this.f306938y;
        if (b1VarArr3 != null && b1VarArr3.length > 0) {
            while (true) {
                C103860b1[] b1VarArr4 = this.f306938y;
                if (i >= b1VarArr4.length) {
                    break;
                }
                C103860b1 b1Var2 = b1VarArr4[i];
                if (b1Var2 != null) {
                    g += C108418b.m146884d(102, b1Var2);
                }
                i++;
            }
        }
        return g;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            switch (k) {
                case 0:
                    break;
                case 10:
                    this.f306915b = aVar.mo158948j();
                    continue;
                case 16:
                    this.f306916c = aVar.mo158946h();
                    continue;
                case 24:
                    this.f306917d = aVar.mo158947i();
                    continue;
                case 34:
                    int a = C108422g.m146910a(aVar, 34);
                    C103895q[] qVarArr = this.f306918e;
                    int length = qVarArr == null ? 0 : qVarArr.length;
                    int i = a + length;
                    C103895q[] qVarArr2 = new C103895q[i];
                    if (length != 0) {
                        System.arraycopy(qVarArr, 0, qVarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C103895q qVar = new C103895q();
                        qVarArr2[length] = qVar;
                        aVar.mo158943e(qVar);
                        aVar.mo158949k();
                        length++;
                    }
                    C103895q qVar2 = new C103895q();
                    qVarArr2[length] = qVar2;
                    aVar.mo158943e(qVar2);
                    this.f306918e = qVarArr2;
                    continue;
                case 42:
                    int a2 = C108422g.m146910a(aVar, 42);
                    C103860b1[] b1VarArr = this.f306919f;
                    int length2 = b1VarArr == null ? 0 : b1VarArr.length;
                    int i2 = a2 + length2;
                    C103860b1[] b1VarArr2 = new C103860b1[i2];
                    if (length2 != 0) {
                        System.arraycopy(b1VarArr, 0, b1VarArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        C103860b1 b1Var = new C103860b1();
                        b1VarArr2[length2] = b1Var;
                        aVar.mo158943e(b1Var);
                        aVar.mo158949k();
                        length2++;
                    }
                    C103860b1 b1Var2 = new C103860b1();
                    b1VarArr2[length2] = b1Var2;
                    aVar.mo158943e(b1Var2);
                    this.f306919f = b1VarArr2;
                    continue;
                case 50:
                    if (this.f306920g == null) {
                        this.f306920g = new C103912y0();
                    }
                    aVar.mo158943e(this.f306920g);
                    continue;
                case 56:
                    this.f306921h = aVar.mo158946h();
                    continue;
                case 64:
                    int a3 = C108422g.m146910a(aVar, 64);
                    int[] iArr = this.f306922i;
                    int length3 = iArr == null ? 0 : iArr.length;
                    int i3 = a3 + length3;
                    int[] iArr2 = new int[i3];
                    if (length3 != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        iArr2[length3] = aVar.mo158946h();
                        aVar.mo158949k();
                        length3++;
                    }
                    iArr2[length3] = aVar.mo158946h();
                    this.f306922i = iArr2;
                    continue;
                case 66:
                    int c = aVar.mo158941c(aVar.mo158946h());
                    int i4 = aVar.f324635e - aVar.f324632b;
                    int i5 = 0;
                    while (aVar.mo158939a() > 0) {
                        aVar.mo158946h();
                        i5++;
                    }
                    aVar.mo158950l(i4);
                    int[] iArr3 = this.f306922i;
                    int length4 = iArr3 == null ? 0 : iArr3.length;
                    int i6 = i5 + length4;
                    int[] iArr4 = new int[i6];
                    if (length4 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length4);
                    }
                    while (length4 < i6) {
                        iArr4[length4] = aVar.mo158946h();
                        length4++;
                    }
                    this.f306922i = iArr4;
                    aVar.mo158940b(c);
                    continue;
                case 72:
                    this.f306923j = aVar.mo158946h();
                    continue;
                case 82:
                    int a4 = C108422g.m146910a(aVar, 82);
                    C103863c1[] c1VarArr = this.f306924k;
                    int length5 = c1VarArr == null ? 0 : c1VarArr.length;
                    int i7 = a4 + length5;
                    C103863c1[] c1VarArr2 = new C103863c1[i7];
                    if (length5 != 0) {
                        System.arraycopy(c1VarArr, 0, c1VarArr2, 0, length5);
                    }
                    while (length5 < i7 - 1) {
                        C103863c1 c1Var = new C103863c1();
                        c1VarArr2[length5] = c1Var;
                        aVar.mo158943e(c1Var);
                        aVar.mo158949k();
                        length5++;
                    }
                    C103863c1 c1Var2 = new C103863c1();
                    c1VarArr2[length5] = c1Var2;
                    aVar.mo158943e(c1Var2);
                    this.f306924k = c1VarArr2;
                    continue;
                case 90:
                    if (this.f306925l == null) {
                        this.f306925l = new C103914z0();
                    }
                    aVar.mo158943e(this.f306925l);
                    continue;
                case 96:
                    this.f306926m = aVar.mo158946h();
                    continue;
                case 106:
                    int a5 = C108422g.m146910a(aVar, 106);
                    C103895q[] qVarArr3 = this.f306927n;
                    int length6 = qVarArr3 == null ? 0 : qVarArr3.length;
                    int i8 = a5 + length6;
                    C103895q[] qVarArr4 = new C103895q[i8];
                    if (length6 != 0) {
                        System.arraycopy(qVarArr3, 0, qVarArr4, 0, length6);
                    }
                    while (length6 < i8 - 1) {
                        C103895q qVar3 = new C103895q();
                        qVarArr4[length6] = qVar3;
                        aVar.mo158943e(qVar3);
                        aVar.mo158949k();
                        length6++;
                    }
                    C103895q qVar4 = new C103895q();
                    qVarArr4[length6] = qVar4;
                    aVar.mo158943e(qVar4);
                    this.f306927n = qVarArr4;
                    continue;
                case 114:
                    int a6 = C108422g.m146910a(aVar, 114);
                    C103895q[] qVarArr5 = this.f306928o;
                    int length7 = qVarArr5 == null ? 0 : qVarArr5.length;
                    int i9 = a6 + length7;
                    C103895q[] qVarArr6 = new C103895q[i9];
                    if (length7 != 0) {
                        System.arraycopy(qVarArr5, 0, qVarArr6, 0, length7);
                    }
                    while (length7 < i9 - 1) {
                        C103895q qVar5 = new C103895q();
                        qVarArr6[length7] = qVar5;
                        aVar.mo158943e(qVar5);
                        aVar.mo158949k();
                        length7++;
                    }
                    C103895q qVar6 = new C103895q();
                    qVarArr6[length7] = qVar6;
                    aVar.mo158943e(qVar6);
                    this.f306928o = qVarArr6;
                    continue;
                case 120:
                    this.f306929p = aVar.mo158946h();
                    continue;
                case 128:
                    this.f306930q = aVar.mo158946h();
                    continue;
                case 136:
                    this.f306931r = aVar.mo158946h();
                    continue;
                case 146:
                    this.f306932s = aVar.mo158942d();
                    continue;
                case 152:
                    this.f306933t = aVar.mo158946h();
                    continue;
                case 160:
                    int a7 = C108422g.m146910a(aVar, 160);
                    int[] iArr5 = this.f306934u;
                    int length8 = iArr5 == null ? 0 : iArr5.length;
                    int i15 = a7 + length8;
                    int[] iArr6 = new int[i15];
                    if (length8 != 0) {
                        System.arraycopy(iArr5, 0, iArr6, 0, length8);
                    }
                    while (length8 < i15 - 1) {
                        iArr6[length8] = aVar.mo158946h();
                        aVar.mo158949k();
                        length8++;
                    }
                    iArr6[length8] = aVar.mo158946h();
                    this.f306934u = iArr6;
                    continue;
                case 162:
                    int c2 = aVar.mo158941c(aVar.mo158946h());
                    int i16 = aVar.f324635e - aVar.f324632b;
                    int i17 = 0;
                    while (aVar.mo158939a() > 0) {
                        aVar.mo158946h();
                        i17++;
                    }
                    aVar.mo158950l(i16);
                    int[] iArr7 = this.f306934u;
                    int length9 = iArr7 == null ? 0 : iArr7.length;
                    int i18 = i17 + length9;
                    int[] iArr8 = new int[i18];
                    if (length9 != 0) {
                        System.arraycopy(iArr7, 0, iArr8, 0, length9);
                    }
                    while (length9 < i18) {
                        iArr8[length9] = aVar.mo158946h();
                        length9++;
                    }
                    this.f306934u = iArr8;
                    aVar.mo158940b(c2);
                    continue;
                case 168:
                    this.f306935v = aVar.mo158946h();
                    continue;
                case 800:
                    this.f306936w = aVar.mo158946h();
                    continue;
                case 808:
                    this.f306937x = aVar.mo158946h();
                    continue;
                case 818:
                    int a8 = C108422g.m146910a(aVar, 818);
                    C103860b1[] b1VarArr3 = this.f306938y;
                    int length10 = b1VarArr3 == null ? 0 : b1VarArr3.length;
                    int i19 = a8 + length10;
                    C103860b1[] b1VarArr4 = new C103860b1[i19];
                    if (length10 != 0) {
                        System.arraycopy(b1VarArr3, 0, b1VarArr4, 0, length10);
                    }
                    while (length10 < i19 - 1) {
                        C103860b1 b1Var3 = new C103860b1();
                        b1VarArr4[length10] = b1Var3;
                        aVar.mo158943e(b1Var3);
                        aVar.mo158949k();
                        length10++;
                    }
                    C103860b1 b1Var4 = new C103860b1();
                    b1VarArr4[length10] = b1Var4;
                    aVar.mo158943e(b1Var4);
                    this.f306938y = b1VarArr4;
                    continue;
                default:
                    if (!aVar.mo158951m(k)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f306915b.equals("")) {
            bVar.mo158961t(1, this.f306915b);
        }
        int i = this.f306916c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f306917d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
        C103895q[] qVarArr = this.f306918e;
        int i2 = 0;
        if (qVarArr != null && qVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C103895q[] qVarArr2 = this.f306918e;
                if (i3 >= qVarArr2.length) {
                    break;
                }
                C103895q qVar = qVarArr2[i3];
                if (qVar != null) {
                    bVar.mo158956o(4, qVar);
                }
                i3++;
            }
        }
        C103860b1[] b1VarArr = this.f306919f;
        if (b1VarArr != null && b1VarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C103860b1[] b1VarArr2 = this.f306919f;
                if (i4 >= b1VarArr2.length) {
                    break;
                }
                C103860b1 b1Var = b1VarArr2[i4];
                if (b1Var != null) {
                    bVar.mo158956o(5, b1Var);
                }
                i4++;
            }
        }
        C103912y0 y0Var = this.f306920g;
        if (y0Var != null) {
            bVar.mo158956o(6, y0Var);
        }
        int i5 = this.f306921h;
        if (i5 != 0) {
            bVar.mo158954m(7, i5);
        }
        int[] iArr = this.f306922i;
        if (iArr != null && iArr.length > 0) {
            int i6 = 0;
            while (true) {
                int[] iArr2 = this.f306922i;
                if (i6 >= iArr2.length) {
                    break;
                }
                bVar.mo158954m(8, iArr2[i6]);
                i6++;
            }
        }
        int i7 = this.f306923j;
        if (i7 != 0) {
            bVar.mo158954m(9, i7);
        }
        C103863c1[] c1VarArr = this.f306924k;
        if (c1VarArr != null && c1VarArr.length > 0) {
            int i8 = 0;
            while (true) {
                C103863c1[] c1VarArr2 = this.f306924k;
                if (i8 >= c1VarArr2.length) {
                    break;
                }
                C103863c1 c1Var = c1VarArr2[i8];
                if (c1Var != null) {
                    bVar.mo158956o(10, c1Var);
                }
                i8++;
            }
        }
        C103914z0 z0Var = this.f306925l;
        if (z0Var != null) {
            bVar.mo158956o(11, z0Var);
        }
        int i9 = this.f306926m;
        if (i9 != 0) {
            bVar.mo158963v(12, i9);
        }
        C103895q[] qVarArr3 = this.f306927n;
        if (qVarArr3 != null && qVarArr3.length > 0) {
            int i15 = 0;
            while (true) {
                C103895q[] qVarArr4 = this.f306927n;
                if (i15 >= qVarArr4.length) {
                    break;
                }
                C103895q qVar2 = qVarArr4[i15];
                if (qVar2 != null) {
                    bVar.mo158956o(13, qVar2);
                }
                i15++;
            }
        }
        C103895q[] qVarArr5 = this.f306928o;
        if (qVarArr5 != null && qVarArr5.length > 0) {
            int i16 = 0;
            while (true) {
                C103895q[] qVarArr6 = this.f306928o;
                if (i16 >= qVarArr6.length) {
                    break;
                }
                C103895q qVar3 = qVarArr6[i16];
                if (qVar3 != null) {
                    bVar.mo158956o(14, qVar3);
                }
                i16++;
            }
        }
        int i17 = this.f306929p;
        if (i17 != 0) {
            bVar.mo158954m(15, i17);
        }
        int i18 = this.f306930q;
        if (i18 != 0) {
            bVar.mo158954m(16, i18);
        }
        int i19 = this.f306931r;
        if (i19 != 0) {
            bVar.mo158954m(17, i19);
        }
        if (!Arrays.equals(this.f306932s, C108422g.f324646c)) {
            bVar.mo158953l(18, this.f306932s);
        }
        int i25 = this.f306933t;
        if (i25 != -1) {
            bVar.mo158954m(19, i25);
        }
        int[] iArr3 = this.f306934u;
        if (iArr3 != null && iArr3.length > 0) {
            int i26 = 0;
            while (true) {
                int[] iArr4 = this.f306934u;
                if (i26 >= iArr4.length) {
                    break;
                }
                bVar.mo158963v(20, iArr4[i26]);
                i26++;
            }
        }
        int i27 = this.f306935v;
        if (i27 != 0) {
            bVar.mo158963v(21, i27);
        }
        int i28 = this.f306936w;
        if (i28 != 0) {
            bVar.mo158963v(100, i28);
        }
        int i29 = this.f306937x;
        if (i29 != 0) {
            bVar.mo158963v(101, i29);
        }
        C103860b1[] b1VarArr3 = this.f306938y;
        if (b1VarArr3 != null && b1VarArr3.length > 0) {
            while (true) {
                C103860b1[] b1VarArr4 = this.f306938y;
                if (i2 < b1VarArr4.length) {
                    C103860b1 b1Var2 = b1VarArr4[i2];
                    if (b1Var2 != null) {
                        bVar.mo158956o(102, b1Var2);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
