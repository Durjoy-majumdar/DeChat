package as3;

import com.tencent.xweb.util.WXWebReporter;
import java.util.Arrays;
import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.b0 */
public final class C103859b0 extends C108421e {

    /* renamed from: b */
    public String f306858b = "";

    /* renamed from: c */
    public int f306859c = 0;

    /* renamed from: d */
    public long f306860d = 0;

    /* renamed from: e */
    public int f306861e = 0;

    /* renamed from: f */
    public C103895q[] f306862f = C103895q.m138543f();

    /* renamed from: g */
    public C103863c1[] f306863g = C103863c1.m138446f();

    /* renamed from: h */
    public C103912y0 f306864h = null;

    /* renamed from: i */
    public String f306865i = "";

    /* renamed from: j */
    public C103860b1[] f306866j = C103860b1.m138436f();

    /* renamed from: k */
    public int f306867k = 0;

    /* renamed from: l */
    public int[] f306868l;

    /* renamed from: m */
    public C103914z0 f306869m;

    /* renamed from: n */
    public int f306870n;

    /* renamed from: o */
    public C103895q[] f306871o;

    /* renamed from: p */
    public int f306872p;

    /* renamed from: q */
    public int f306873q;

    /* renamed from: r */
    public C103860b1[] f306874r;

    /* renamed from: s */
    public C103895q[] f306875s;

    /* renamed from: t */
    public int f306876t;

    /* renamed from: u */
    public int f306877u;

    /* renamed from: v */
    public int f306878v;

    /* renamed from: w */
    public byte[] f306879w;

    /* renamed from: x */
    public int f306880x;

    /* renamed from: y */
    public int[] f306881y;

    /* renamed from: z */
    public int f306882z;

    public C103859b0() {
        int[] iArr = C108422g.f324644a;
        this.f306868l = iArr;
        this.f306869m = null;
        this.f306870n = 0;
        this.f306871o = C103895q.m138543f();
        this.f306872p = 0;
        this.f306873q = 0;
        this.f306874r = C103860b1.m138436f();
        this.f306875s = C103895q.m138543f();
        this.f306876t = 0;
        this.f306877u = 0;
        this.f306878v = 0;
        this.f306879w = C108422g.f324646c;
        this.f306880x = -1;
        this.f306881y = iArr;
        this.f306882z = 0;
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int[] iArr;
        int[] iArr2;
        int i = 0;
        int g = !this.f306858b.equals("") ? C108418b.m146887g(1, this.f306858b) + 0 : 0;
        int i2 = this.f306859c;
        if (i2 != 0) {
            g += C108418b.m146882b(2, i2);
        }
        long j = this.f306860d;
        if (j != 0) {
            g += C108418b.m146883c(3, j);
        }
        int i3 = this.f306861e;
        if (i3 != 0) {
            g += C108418b.m146890j(4, i3);
        }
        C103895q[] qVarArr = this.f306862f;
        if (qVarArr != null && qVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C103895q[] qVarArr2 = this.f306862f;
                if (i4 >= qVarArr2.length) {
                    break;
                }
                C103895q qVar = qVarArr2[i4];
                if (qVar != null) {
                    g += C108418b.m146884d(5, qVar);
                }
                i4++;
            }
        }
        C103863c1[] c1VarArr = this.f306863g;
        if (c1VarArr != null && c1VarArr.length > 0) {
            int i5 = 0;
            while (true) {
                C103863c1[] c1VarArr2 = this.f306863g;
                if (i5 >= c1VarArr2.length) {
                    break;
                }
                C103863c1 c1Var = c1VarArr2[i5];
                if (c1Var != null) {
                    g += C108418b.m146884d(6, c1Var);
                }
                i5++;
            }
        }
        C103912y0 y0Var = this.f306864h;
        if (y0Var != null) {
            g += C108418b.m146884d(7, y0Var);
        }
        if (!this.f306865i.equals("")) {
            g += C108418b.m146887g(8, this.f306865i);
        }
        C103860b1[] b1VarArr = this.f306866j;
        if (b1VarArr != null && b1VarArr.length > 0) {
            int i6 = 0;
            while (true) {
                C103860b1[] b1VarArr2 = this.f306866j;
                if (i6 >= b1VarArr2.length) {
                    break;
                }
                C103860b1 b1Var = b1VarArr2[i6];
                if (b1Var != null) {
                    g += C108418b.m146884d(9, b1Var);
                }
                i6++;
            }
        }
        int i7 = this.f306867k;
        if (i7 != 0) {
            g += C108418b.m146882b(10, i7);
        }
        int[] iArr3 = this.f306868l;
        if (iArr3 != null && iArr3.length > 0) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                iArr2 = this.f306868l;
                if (i8 >= iArr2.length) {
                    break;
                }
                int i15 = iArr2[i8];
                i9 += i15 >= 0 ? C108418b.m146885e(i15) : 10;
                i8++;
            }
            g = g + i9 + (iArr2.length * 1);
        }
        C103914z0 z0Var = this.f306869m;
        if (z0Var != null) {
            g += C108418b.m146884d(12, z0Var);
        }
        int i16 = this.f306870n;
        if (i16 != 0) {
            g += C108418b.m146890j(13, i16);
        }
        C103895q[] qVarArr3 = this.f306871o;
        if (qVarArr3 != null && qVarArr3.length > 0) {
            int i17 = 0;
            while (true) {
                C103895q[] qVarArr4 = this.f306871o;
                if (i17 >= qVarArr4.length) {
                    break;
                }
                C103895q qVar2 = qVarArr4[i17];
                if (qVar2 != null) {
                    g += C108418b.m146884d(14, qVar2);
                }
                i17++;
            }
        }
        int i18 = this.f306872p;
        if (i18 != 0) {
            g += C108418b.m146890j(15, i18);
        }
        int i19 = this.f306873q;
        if (i19 != 0) {
            g += C108418b.m146890j(16, i19);
        }
        C103860b1[] b1VarArr3 = this.f306874r;
        if (b1VarArr3 != null && b1VarArr3.length > 0) {
            int i25 = 0;
            while (true) {
                C103860b1[] b1VarArr4 = this.f306874r;
                if (i25 >= b1VarArr4.length) {
                    break;
                }
                C103860b1 b1Var2 = b1VarArr4[i25];
                if (b1Var2 != null) {
                    g += C108418b.m146884d(17, b1Var2);
                }
                i25++;
            }
        }
        C103895q[] qVarArr5 = this.f306875s;
        if (qVarArr5 != null && qVarArr5.length > 0) {
            int i26 = 0;
            while (true) {
                C103895q[] qVarArr6 = this.f306875s;
                if (i26 >= qVarArr6.length) {
                    break;
                }
                C103895q qVar3 = qVarArr6[i26];
                if (qVar3 != null) {
                    g += C108418b.m146884d(18, qVar3);
                }
                i26++;
            }
        }
        int i27 = this.f306876t;
        if (i27 != 0) {
            g += C108418b.m146882b(19, i27);
        }
        int i28 = this.f306877u;
        if (i28 != 0) {
            g += C108418b.m146882b(20, i28);
        }
        int i29 = this.f306878v;
        if (i29 != 0) {
            g += C108418b.m146882b(21, i29);
        }
        if (!Arrays.equals(this.f306879w, C108422g.f324646c)) {
            g += C108418b.m146881a(22, this.f306879w);
        }
        int i35 = this.f306880x;
        if (i35 != -1) {
            g += C108418b.m146882b(23, i35);
        }
        int[] iArr4 = this.f306881y;
        if (iArr4 != null && iArr4.length > 0) {
            int i36 = 0;
            while (true) {
                iArr = this.f306881y;
                if (i >= iArr.length) {
                    break;
                }
                i36 += C108418b.m146885e(iArr[i]);
                i++;
            }
            g = g + i36 + (iArr.length * 2);
        }
        int i37 = this.f306882z;
        return i37 != 0 ? g + C108418b.m146890j(25, i37) : g;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            switch (k) {
                case 0:
                    break;
                case 10:
                    this.f306858b = aVar.mo158948j();
                    continue;
                case 16:
                    this.f306859c = aVar.mo158946h();
                    continue;
                case 24:
                    this.f306860d = aVar.mo158947i();
                    continue;
                case 32:
                    this.f306861e = aVar.mo158946h();
                    continue;
                case 42:
                    int a = C108422g.m146910a(aVar, 42);
                    C103895q[] qVarArr = this.f306862f;
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
                    this.f306862f = qVarArr2;
                    continue;
                case 50:
                    int a2 = C108422g.m146910a(aVar, 50);
                    C103863c1[] c1VarArr = this.f306863g;
                    int length2 = c1VarArr == null ? 0 : c1VarArr.length;
                    int i2 = a2 + length2;
                    C103863c1[] c1VarArr2 = new C103863c1[i2];
                    if (length2 != 0) {
                        System.arraycopy(c1VarArr, 0, c1VarArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        C103863c1 c1Var = new C103863c1();
                        c1VarArr2[length2] = c1Var;
                        aVar.mo158943e(c1Var);
                        aVar.mo158949k();
                        length2++;
                    }
                    C103863c1 c1Var2 = new C103863c1();
                    c1VarArr2[length2] = c1Var2;
                    aVar.mo158943e(c1Var2);
                    this.f306863g = c1VarArr2;
                    continue;
                case 58:
                    if (this.f306864h == null) {
                        this.f306864h = new C103912y0();
                    }
                    aVar.mo158943e(this.f306864h);
                    continue;
                case 66:
                    this.f306865i = aVar.mo158948j();
                    continue;
                case 74:
                    int a3 = C108422g.m146910a(aVar, 74);
                    C103860b1[] b1VarArr = this.f306866j;
                    int length3 = b1VarArr == null ? 0 : b1VarArr.length;
                    int i3 = a3 + length3;
                    C103860b1[] b1VarArr2 = new C103860b1[i3];
                    if (length3 != 0) {
                        System.arraycopy(b1VarArr, 0, b1VarArr2, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        C103860b1 b1Var = new C103860b1();
                        b1VarArr2[length3] = b1Var;
                        aVar.mo158943e(b1Var);
                        aVar.mo158949k();
                        length3++;
                    }
                    C103860b1 b1Var2 = new C103860b1();
                    b1VarArr2[length3] = b1Var2;
                    aVar.mo158943e(b1Var2);
                    this.f306866j = b1VarArr2;
                    continue;
                case 80:
                    this.f306867k = aVar.mo158946h();
                    continue;
                case 88:
                    int a4 = C108422g.m146910a(aVar, 88);
                    int[] iArr = this.f306868l;
                    int length4 = iArr == null ? 0 : iArr.length;
                    int i4 = a4 + length4;
                    int[] iArr2 = new int[i4];
                    if (length4 != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length4);
                    }
                    while (length4 < i4 - 1) {
                        iArr2[length4] = aVar.mo158946h();
                        aVar.mo158949k();
                        length4++;
                    }
                    iArr2[length4] = aVar.mo158946h();
                    this.f306868l = iArr2;
                    continue;
                case 90:
                    int c = aVar.mo158941c(aVar.mo158946h());
                    int i5 = aVar.f324635e - aVar.f324632b;
                    int i6 = 0;
                    while (aVar.mo158939a() > 0) {
                        aVar.mo158946h();
                        i6++;
                    }
                    aVar.mo158950l(i5);
                    int[] iArr3 = this.f306868l;
                    int length5 = iArr3 == null ? 0 : iArr3.length;
                    int i7 = i6 + length5;
                    int[] iArr4 = new int[i7];
                    if (length5 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length5);
                    }
                    while (length5 < i7) {
                        iArr4[length5] = aVar.mo158946h();
                        length5++;
                    }
                    this.f306868l = iArr4;
                    aVar.mo158940b(c);
                    continue;
                case 98:
                    if (this.f306869m == null) {
                        this.f306869m = new C103914z0();
                    }
                    aVar.mo158943e(this.f306869m);
                    continue;
                case 104:
                    this.f306870n = aVar.mo158946h();
                    continue;
                case 114:
                    int a5 = C108422g.m146910a(aVar, 114);
                    C103895q[] qVarArr3 = this.f306871o;
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
                    this.f306871o = qVarArr4;
                    continue;
                case 120:
                    this.f306872p = aVar.mo158946h();
                    continue;
                case 128:
                    this.f306873q = aVar.mo158946h();
                    continue;
                case 138:
                    int a6 = C108422g.m146910a(aVar, 138);
                    C103860b1[] b1VarArr3 = this.f306874r;
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
                    this.f306874r = b1VarArr4;
                    continue;
                case 146:
                    int a7 = C108422g.m146910a(aVar, 146);
                    C103895q[] qVarArr5 = this.f306875s;
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
                    this.f306875s = qVarArr6;
                    continue;
                case 152:
                    this.f306876t = aVar.mo158946h();
                    continue;
                case 160:
                    this.f306877u = aVar.mo158946h();
                    continue;
                case 168:
                    this.f306878v = aVar.mo158946h();
                    continue;
                case WXWebReporter.WXWEB_GET_REFLECT_MMKV_METHED_FAILED:
                    this.f306879w = aVar.mo158942d();
                    continue;
                case WXWebReporter.WXWEB_IDKEY_PLUGIN_CONFIG_PARSE_FAILED:
                    this.f306880x = aVar.mo158946h();
                    continue;
                case 192:
                    int a8 = C108422g.m146910a(aVar, 192);
                    int[] iArr5 = this.f306881y;
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
                    this.f306881y = iArr6;
                    continue;
                case 194:
                    int c2 = aVar.mo158941c(aVar.mo158946h());
                    int i17 = aVar.f324635e - aVar.f324632b;
                    int i18 = 0;
                    while (aVar.mo158939a() > 0) {
                        aVar.mo158946h();
                        i18++;
                    }
                    aVar.mo158950l(i17);
                    int[] iArr7 = this.f306881y;
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
                    this.f306881y = iArr8;
                    aVar.mo158940b(c2);
                    continue;
                case 200:
                    this.f306882z = aVar.mo158946h();
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
        if (!this.f306858b.equals("")) {
            bVar.mo158961t(1, this.f306858b);
        }
        int i = this.f306859c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f306860d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
        int i2 = this.f306861e;
        if (i2 != 0) {
            bVar.mo158963v(4, i2);
        }
        C103895q[] qVarArr = this.f306862f;
        int i3 = 0;
        if (qVarArr != null && qVarArr.length > 0) {
            int i4 = 0;
            while (true) {
                C103895q[] qVarArr2 = this.f306862f;
                if (i4 >= qVarArr2.length) {
                    break;
                }
                C103895q qVar = qVarArr2[i4];
                if (qVar != null) {
                    bVar.mo158956o(5, qVar);
                }
                i4++;
            }
        }
        C103863c1[] c1VarArr = this.f306863g;
        if (c1VarArr != null && c1VarArr.length > 0) {
            int i5 = 0;
            while (true) {
                C103863c1[] c1VarArr2 = this.f306863g;
                if (i5 >= c1VarArr2.length) {
                    break;
                }
                C103863c1 c1Var = c1VarArr2[i5];
                if (c1Var != null) {
                    bVar.mo158956o(6, c1Var);
                }
                i5++;
            }
        }
        C103912y0 y0Var = this.f306864h;
        if (y0Var != null) {
            bVar.mo158956o(7, y0Var);
        }
        if (!this.f306865i.equals("")) {
            bVar.mo158961t(8, this.f306865i);
        }
        C103860b1[] b1VarArr = this.f306866j;
        if (b1VarArr != null && b1VarArr.length > 0) {
            int i6 = 0;
            while (true) {
                C103860b1[] b1VarArr2 = this.f306866j;
                if (i6 >= b1VarArr2.length) {
                    break;
                }
                C103860b1 b1Var = b1VarArr2[i6];
                if (b1Var != null) {
                    bVar.mo158956o(9, b1Var);
                }
                i6++;
            }
        }
        int i7 = this.f306867k;
        if (i7 != 0) {
            bVar.mo158954m(10, i7);
        }
        int[] iArr = this.f306868l;
        if (iArr != null && iArr.length > 0) {
            int i8 = 0;
            while (true) {
                int[] iArr2 = this.f306868l;
                if (i8 >= iArr2.length) {
                    break;
                }
                bVar.mo158954m(11, iArr2[i8]);
                i8++;
            }
        }
        C103914z0 z0Var = this.f306869m;
        if (z0Var != null) {
            bVar.mo158956o(12, z0Var);
        }
        int i9 = this.f306870n;
        if (i9 != 0) {
            bVar.mo158963v(13, i9);
        }
        C103895q[] qVarArr3 = this.f306871o;
        if (qVarArr3 != null && qVarArr3.length > 0) {
            int i15 = 0;
            while (true) {
                C103895q[] qVarArr4 = this.f306871o;
                if (i15 >= qVarArr4.length) {
                    break;
                }
                C103895q qVar2 = qVarArr4[i15];
                if (qVar2 != null) {
                    bVar.mo158956o(14, qVar2);
                }
                i15++;
            }
        }
        int i16 = this.f306872p;
        if (i16 != 0) {
            bVar.mo158963v(15, i16);
        }
        int i17 = this.f306873q;
        if (i17 != 0) {
            bVar.mo158963v(16, i17);
        }
        C103860b1[] b1VarArr3 = this.f306874r;
        if (b1VarArr3 != null && b1VarArr3.length > 0) {
            int i18 = 0;
            while (true) {
                C103860b1[] b1VarArr4 = this.f306874r;
                if (i18 >= b1VarArr4.length) {
                    break;
                }
                C103860b1 b1Var2 = b1VarArr4[i18];
                if (b1Var2 != null) {
                    bVar.mo158956o(17, b1Var2);
                }
                i18++;
            }
        }
        C103895q[] qVarArr5 = this.f306875s;
        if (qVarArr5 != null && qVarArr5.length > 0) {
            int i19 = 0;
            while (true) {
                C103895q[] qVarArr6 = this.f306875s;
                if (i19 >= qVarArr6.length) {
                    break;
                }
                C103895q qVar3 = qVarArr6[i19];
                if (qVar3 != null) {
                    bVar.mo158956o(18, qVar3);
                }
                i19++;
            }
        }
        int i25 = this.f306876t;
        if (i25 != 0) {
            bVar.mo158954m(19, i25);
        }
        int i26 = this.f306877u;
        if (i26 != 0) {
            bVar.mo158954m(20, i26);
        }
        int i27 = this.f306878v;
        if (i27 != 0) {
            bVar.mo158954m(21, i27);
        }
        if (!Arrays.equals(this.f306879w, C108422g.f324646c)) {
            bVar.mo158953l(22, this.f306879w);
        }
        int i28 = this.f306880x;
        if (i28 != -1) {
            bVar.mo158954m(23, i28);
        }
        int[] iArr3 = this.f306881y;
        if (iArr3 != null && iArr3.length > 0) {
            while (true) {
                int[] iArr4 = this.f306881y;
                if (i3 >= iArr4.length) {
                    break;
                }
                bVar.mo158963v(24, iArr4[i3]);
                i3++;
            }
        }
        int i29 = this.f306882z;
        if (i29 != 0) {
            bVar.mo158963v(25, i29);
        }
    }
}
