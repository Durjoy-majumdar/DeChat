package as3;

import java.util.Arrays;
import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.n0 */
public final class C103890n0 extends C108421e {

    /* renamed from: b */
    public String f307093b = "";

    /* renamed from: c */
    public int f307094c = 0;

    /* renamed from: d */
    public long f307095d = 0;

    /* renamed from: e */
    public C103895q[] f307096e = C103895q.m138543f();

    /* renamed from: f */
    public C103860b1[] f307097f = C103860b1.m138436f();

    /* renamed from: g */
    public C103912y0 f307098g = null;

    /* renamed from: h */
    public int f307099h = 0;

    /* renamed from: i */
    public int[] f307100i;

    /* renamed from: j */
    public C103863c1[] f307101j;

    /* renamed from: k */
    public C103914z0 f307102k;

    /* renamed from: l */
    public C103895q[] f307103l;

    /* renamed from: m */
    public C103860b1[] f307104m;

    /* renamed from: n */
    public C103895q[] f307105n;

    /* renamed from: o */
    public int f307106o;

    /* renamed from: p */
    public int f307107p;

    /* renamed from: q */
    public int f307108q;

    /* renamed from: r */
    public byte[] f307109r;

    /* renamed from: s */
    public int f307110s;

    /* renamed from: t */
    public int[] f307111t;

    /* renamed from: u */
    public int f307112u;

    public C103890n0() {
        int[] iArr = C108422g.f324644a;
        this.f307100i = iArr;
        this.f307101j = C103863c1.m138446f();
        this.f307102k = null;
        this.f307103l = C103895q.m138543f();
        this.f307104m = C103860b1.m138436f();
        this.f307105n = C103895q.m138543f();
        this.f307106o = 0;
        this.f307107p = 0;
        this.f307108q = 0;
        this.f307109r = C108422g.f324646c;
        this.f307110s = -1;
        this.f307111t = iArr;
        this.f307112u = 0;
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int[] iArr;
        int[] iArr2;
        int i = 0;
        int g = !this.f307093b.equals("") ? C108418b.m146887g(1, this.f307093b) + 0 : 0;
        int i2 = this.f307094c;
        if (i2 != 0) {
            g += C108418b.m146882b(2, i2);
        }
        long j = this.f307095d;
        if (j != 0) {
            g += C108418b.m146883c(3, j);
        }
        C103895q[] qVarArr = this.f307096e;
        if (qVarArr != null && qVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C103895q[] qVarArr2 = this.f307096e;
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
        C103860b1[] b1VarArr = this.f307097f;
        if (b1VarArr != null && b1VarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C103860b1[] b1VarArr2 = this.f307097f;
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
        C103912y0 y0Var = this.f307098g;
        if (y0Var != null) {
            g += C108418b.m146884d(6, y0Var);
        }
        int i5 = this.f307099h;
        if (i5 != 0) {
            g += C108418b.m146882b(7, i5);
        }
        int[] iArr3 = this.f307100i;
        if (iArr3 != null && iArr3.length > 0) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                iArr2 = this.f307100i;
                if (i6 >= iArr2.length) {
                    break;
                }
                int i8 = iArr2[i6];
                i7 += i8 >= 0 ? C108418b.m146885e(i8) : 10;
                i6++;
            }
            g = g + i7 + (iArr2.length * 1);
        }
        C103863c1[] c1VarArr = this.f307101j;
        if (c1VarArr != null && c1VarArr.length > 0) {
            int i9 = 0;
            while (true) {
                C103863c1[] c1VarArr2 = this.f307101j;
                if (i9 >= c1VarArr2.length) {
                    break;
                }
                C103863c1 c1Var = c1VarArr2[i9];
                if (c1Var != null) {
                    g += C108418b.m146884d(9, c1Var);
                }
                i9++;
            }
        }
        C103914z0 z0Var = this.f307102k;
        if (z0Var != null) {
            g += C108418b.m146884d(10, z0Var);
        }
        C103895q[] qVarArr3 = this.f307103l;
        if (qVarArr3 != null && qVarArr3.length > 0) {
            int i15 = 0;
            while (true) {
                C103895q[] qVarArr4 = this.f307103l;
                if (i15 >= qVarArr4.length) {
                    break;
                }
                C103895q qVar2 = qVarArr4[i15];
                if (qVar2 != null) {
                    g += C108418b.m146884d(11, qVar2);
                }
                i15++;
            }
        }
        C103860b1[] b1VarArr3 = this.f307104m;
        if (b1VarArr3 != null && b1VarArr3.length > 0) {
            int i16 = 0;
            while (true) {
                C103860b1[] b1VarArr4 = this.f307104m;
                if (i16 >= b1VarArr4.length) {
                    break;
                }
                C103860b1 b1Var2 = b1VarArr4[i16];
                if (b1Var2 != null) {
                    g += C108418b.m146884d(12, b1Var2);
                }
                i16++;
            }
        }
        C103895q[] qVarArr5 = this.f307105n;
        if (qVarArr5 != null && qVarArr5.length > 0) {
            int i17 = 0;
            while (true) {
                C103895q[] qVarArr6 = this.f307105n;
                if (i17 >= qVarArr6.length) {
                    break;
                }
                C103895q qVar3 = qVarArr6[i17];
                if (qVar3 != null) {
                    g += C108418b.m146884d(13, qVar3);
                }
                i17++;
            }
        }
        int i18 = this.f307106o;
        if (i18 != 0) {
            g += C108418b.m146882b(14, i18);
        }
        int i19 = this.f307107p;
        if (i19 != 0) {
            g += C108418b.m146882b(15, i19);
        }
        int i25 = this.f307108q;
        if (i25 != 0) {
            g += C108418b.m146882b(16, i25);
        }
        if (!Arrays.equals(this.f307109r, C108422g.f324646c)) {
            g += C108418b.m146881a(17, this.f307109r);
        }
        int i26 = this.f307110s;
        if (i26 != -1) {
            g += C108418b.m146882b(18, i26);
        }
        int[] iArr4 = this.f307111t;
        if (iArr4 != null && iArr4.length > 0) {
            int i27 = 0;
            while (true) {
                iArr = this.f307111t;
                if (i >= iArr.length) {
                    break;
                }
                i27 += C108418b.m146885e(iArr[i]);
                i++;
            }
            g = g + i27 + (iArr.length * 2);
        }
        int i28 = this.f307112u;
        return i28 != 0 ? g + C108418b.m146890j(20, i28) : g;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            switch (k) {
                case 0:
                    break;
                case 10:
                    this.f307093b = aVar.mo158948j();
                    continue;
                case 16:
                    this.f307094c = aVar.mo158946h();
                    continue;
                case 24:
                    this.f307095d = aVar.mo158947i();
                    continue;
                case 34:
                    int a = C108422g.m146910a(aVar, 34);
                    C103895q[] qVarArr = this.f307096e;
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
                    this.f307096e = qVarArr2;
                    continue;
                case 42:
                    int a2 = C108422g.m146910a(aVar, 42);
                    C103860b1[] b1VarArr = this.f307097f;
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
                    this.f307097f = b1VarArr2;
                    continue;
                case 50:
                    if (this.f307098g == null) {
                        this.f307098g = new C103912y0();
                    }
                    aVar.mo158943e(this.f307098g);
                    continue;
                case 56:
                    this.f307099h = aVar.mo158946h();
                    continue;
                case 64:
                    int a3 = C108422g.m146910a(aVar, 64);
                    int[] iArr = this.f307100i;
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
                    this.f307100i = iArr2;
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
                    int[] iArr3 = this.f307100i;
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
                    this.f307100i = iArr4;
                    aVar.mo158940b(c);
                    continue;
                case 74:
                    int a4 = C108422g.m146910a(aVar, 74);
                    C103863c1[] c1VarArr = this.f307101j;
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
                    this.f307101j = c1VarArr2;
                    continue;
                case 82:
                    if (this.f307102k == null) {
                        this.f307102k = new C103914z0();
                    }
                    aVar.mo158943e(this.f307102k);
                    continue;
                case 90:
                    int a5 = C108422g.m146910a(aVar, 90);
                    C103895q[] qVarArr3 = this.f307103l;
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
                    this.f307103l = qVarArr4;
                    continue;
                case 98:
                    int a6 = C108422g.m146910a(aVar, 98);
                    C103860b1[] b1VarArr3 = this.f307104m;
                    int length7 = b1VarArr3 == null ? 0 : b1VarArr3.length;
                    int i9 = a6 + length7;
                    C103860b1[] b1VarArr4 = new C103860b1[i9];
                    if (length7 != 0) {
                        System.arraycopy(b1VarArr3, 0, b1VarArr4, 0, length7);
                    }
                    while (length7 < i9 - 1) {
                        C103860b1 b1Var3 = new C103860b1();
                        b1VarArr4[length7] = b1Var3;
                        aVar.mo158943e(b1Var3);
                        aVar.mo158949k();
                        length7++;
                    }
                    C103860b1 b1Var4 = new C103860b1();
                    b1VarArr4[length7] = b1Var4;
                    aVar.mo158943e(b1Var4);
                    this.f307104m = b1VarArr4;
                    continue;
                case 106:
                    int a7 = C108422g.m146910a(aVar, 106);
                    C103895q[] qVarArr5 = this.f307105n;
                    int length8 = qVarArr5 == null ? 0 : qVarArr5.length;
                    int i15 = a7 + length8;
                    C103895q[] qVarArr6 = new C103895q[i15];
                    if (length8 != 0) {
                        System.arraycopy(qVarArr5, 0, qVarArr6, 0, length8);
                    }
                    while (length8 < i15 - 1) {
                        C103895q qVar5 = new C103895q();
                        qVarArr6[length8] = qVar5;
                        aVar.mo158943e(qVar5);
                        aVar.mo158949k();
                        length8++;
                    }
                    C103895q qVar6 = new C103895q();
                    qVarArr6[length8] = qVar6;
                    aVar.mo158943e(qVar6);
                    this.f307105n = qVarArr6;
                    continue;
                case 112:
                    this.f307106o = aVar.mo158946h();
                    continue;
                case 120:
                    this.f307107p = aVar.mo158946h();
                    continue;
                case 128:
                    this.f307108q = aVar.mo158946h();
                    continue;
                case 138:
                    this.f307109r = aVar.mo158942d();
                    continue;
                case 144:
                    this.f307110s = aVar.mo158946h();
                    continue;
                case 152:
                    int a8 = C108422g.m146910a(aVar, 152);
                    int[] iArr5 = this.f307111t;
                    int length9 = iArr5 == null ? 0 : iArr5.length;
                    int i16 = a8 + length9;
                    int[] iArr6 = new int[i16];
                    if (length9 != 0) {
                        System.arraycopy(iArr5, 0, iArr6, 0, length9);
                    }
                    while (length9 < i16 - 1) {
                        iArr6[length9] = aVar.mo158946h();
                        aVar.mo158949k();
                        length9++;
                    }
                    iArr6[length9] = aVar.mo158946h();
                    this.f307111t = iArr6;
                    continue;
                case 154:
                    int c2 = aVar.mo158941c(aVar.mo158946h());
                    int i17 = aVar.f324635e - aVar.f324632b;
                    int i18 = 0;
                    while (aVar.mo158939a() > 0) {
                        aVar.mo158946h();
                        i18++;
                    }
                    aVar.mo158950l(i17);
                    int[] iArr7 = this.f307111t;
                    int length10 = iArr7 == null ? 0 : iArr7.length;
                    int i19 = i18 + length10;
                    int[] iArr8 = new int[i19];
                    if (length10 != 0) {
                        System.arraycopy(iArr7, 0, iArr8, 0, length10);
                    }
                    while (length10 < i19) {
                        iArr8[length10] = aVar.mo158946h();
                        length10++;
                    }
                    this.f307111t = iArr8;
                    aVar.mo158940b(c2);
                    continue;
                case 160:
                    this.f307112u = aVar.mo158946h();
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
        if (!this.f307093b.equals("")) {
            bVar.mo158961t(1, this.f307093b);
        }
        int i = this.f307094c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f307095d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
        C103895q[] qVarArr = this.f307096e;
        int i2 = 0;
        if (qVarArr != null && qVarArr.length > 0) {
            int i3 = 0;
            while (true) {
                C103895q[] qVarArr2 = this.f307096e;
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
        C103860b1[] b1VarArr = this.f307097f;
        if (b1VarArr != null && b1VarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C103860b1[] b1VarArr2 = this.f307097f;
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
        C103912y0 y0Var = this.f307098g;
        if (y0Var != null) {
            bVar.mo158956o(6, y0Var);
        }
        int i5 = this.f307099h;
        if (i5 != 0) {
            bVar.mo158954m(7, i5);
        }
        int[] iArr = this.f307100i;
        if (iArr != null && iArr.length > 0) {
            int i6 = 0;
            while (true) {
                int[] iArr2 = this.f307100i;
                if (i6 >= iArr2.length) {
                    break;
                }
                bVar.mo158954m(8, iArr2[i6]);
                i6++;
            }
        }
        C103863c1[] c1VarArr = this.f307101j;
        if (c1VarArr != null && c1VarArr.length > 0) {
            int i7 = 0;
            while (true) {
                C103863c1[] c1VarArr2 = this.f307101j;
                if (i7 >= c1VarArr2.length) {
                    break;
                }
                C103863c1 c1Var = c1VarArr2[i7];
                if (c1Var != null) {
                    bVar.mo158956o(9, c1Var);
                }
                i7++;
            }
        }
        C103914z0 z0Var = this.f307102k;
        if (z0Var != null) {
            bVar.mo158956o(10, z0Var);
        }
        C103895q[] qVarArr3 = this.f307103l;
        if (qVarArr3 != null && qVarArr3.length > 0) {
            int i8 = 0;
            while (true) {
                C103895q[] qVarArr4 = this.f307103l;
                if (i8 >= qVarArr4.length) {
                    break;
                }
                C103895q qVar2 = qVarArr4[i8];
                if (qVar2 != null) {
                    bVar.mo158956o(11, qVar2);
                }
                i8++;
            }
        }
        C103860b1[] b1VarArr3 = this.f307104m;
        if (b1VarArr3 != null && b1VarArr3.length > 0) {
            int i9 = 0;
            while (true) {
                C103860b1[] b1VarArr4 = this.f307104m;
                if (i9 >= b1VarArr4.length) {
                    break;
                }
                C103860b1 b1Var2 = b1VarArr4[i9];
                if (b1Var2 != null) {
                    bVar.mo158956o(12, b1Var2);
                }
                i9++;
            }
        }
        C103895q[] qVarArr5 = this.f307105n;
        if (qVarArr5 != null && qVarArr5.length > 0) {
            int i15 = 0;
            while (true) {
                C103895q[] qVarArr6 = this.f307105n;
                if (i15 >= qVarArr6.length) {
                    break;
                }
                C103895q qVar3 = qVarArr6[i15];
                if (qVar3 != null) {
                    bVar.mo158956o(13, qVar3);
                }
                i15++;
            }
        }
        int i16 = this.f307106o;
        if (i16 != 0) {
            bVar.mo158954m(14, i16);
        }
        int i17 = this.f307107p;
        if (i17 != 0) {
            bVar.mo158954m(15, i17);
        }
        int i18 = this.f307108q;
        if (i18 != 0) {
            bVar.mo158954m(16, i18);
        }
        if (!Arrays.equals(this.f307109r, C108422g.f324646c)) {
            bVar.mo158953l(17, this.f307109r);
        }
        int i19 = this.f307110s;
        if (i19 != -1) {
            bVar.mo158954m(18, i19);
        }
        int[] iArr3 = this.f307111t;
        if (iArr3 != null && iArr3.length > 0) {
            while (true) {
                int[] iArr4 = this.f307111t;
                if (i2 >= iArr4.length) {
                    break;
                }
                bVar.mo158963v(19, iArr4[i2]);
                i2++;
            }
        }
        int i25 = this.f307112u;
        if (i25 != 0) {
            bVar.mo158963v(20, i25);
        }
    }
}
