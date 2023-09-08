package as3;

import java.util.Arrays;
import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108419c;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.b1 */
public final class C103860b1 extends C108421e {

    /* renamed from: F */
    public static volatile C103860b1[] f306883F;

    /* renamed from: A */
    public int f306884A;

    /* renamed from: B */
    public int f306885B;

    /* renamed from: C */
    public int f306886C;

    /* renamed from: D */
    public int f306887D;

    /* renamed from: E */
    public int f306888E;

    /* renamed from: b */
    public int f306889b = 0;

    /* renamed from: c */
    public int f306890c = 0;

    /* renamed from: d */
    public int f306891d = 0;

    /* renamed from: e */
    public int f306892e = 0;

    /* renamed from: f */
    public int f306893f = -1;

    /* renamed from: g */
    public int f306894g = 0;

    /* renamed from: h */
    public C103908w0 f306895h = null;

    /* renamed from: i */
    public int f306896i = 0;

    /* renamed from: j */
    public String f306897j = "";

    /* renamed from: k */
    public C103910x0[] f306898k;

    /* renamed from: l */
    public int f306899l;

    /* renamed from: m */
    public int[] f306900m;

    /* renamed from: n */
    public int f306901n;

    /* renamed from: o */
    public int f306902o;

    /* renamed from: p */
    public int f306903p;

    /* renamed from: q */
    public int f306904q;

    /* renamed from: r */
    public C103902t0 f306905r;

    /* renamed from: s */
    public String f306906s;

    /* renamed from: t */
    public String f306907t;

    /* renamed from: u */
    public int f306908u;

    /* renamed from: v */
    public byte[] f306909v;

    /* renamed from: w */
    public C103903u f306910w;

    /* renamed from: x */
    public int f306911x;

    /* renamed from: y */
    public String f306912y;

    /* renamed from: z */
    public int f306913z;

    public C103860b1() {
        if (C103910x0.f307215e == null) {
            synchronized (C108419c.f324642a) {
                if (C103910x0.f307215e == null) {
                    C103910x0.f307215e = new C103910x0[0];
                }
            }
        }
        this.f306898k = C103910x0.f307215e;
        this.f306899l = 0;
        this.f306900m = C108422g.f324644a;
        this.f306901n = 0;
        this.f306902o = 0;
        this.f306903p = 0;
        this.f306904q = 0;
        this.f306905r = null;
        this.f306906s = "";
        this.f306907t = "";
        this.f306908u = 0;
        this.f306909v = C108422g.f324646c;
        this.f306910w = null;
        this.f306911x = -1;
        this.f306912y = "";
        this.f306913z = 0;
        this.f306884A = 0;
        this.f306885B = 0;
        this.f306886C = 0;
        this.f306887D = 0;
        this.f306888E = 0;
        this.f324643a = -1;
    }

    /* renamed from: f */
    public static C103860b1[] m138436f() {
        if (f306883F == null) {
            synchronized (C108419c.f324642a) {
                if (f306883F == null) {
                    f306883F = new C103860b1[0];
                }
            }
        }
        return f306883F;
    }

    /* renamed from: a */
    public int mo145537a() {
        int[] iArr;
        int i = this.f306889b;
        int i2 = 0;
        int j = i != 0 ? C108418b.m146890j(1, i) + 0 : 0;
        int i3 = this.f306890c;
        if (i3 != 0) {
            j += C108418b.m146890j(2, i3);
        }
        int i4 = this.f306891d;
        if (i4 != 0) {
            j += C108418b.m146890j(3, i4);
        }
        int i5 = this.f306892e;
        if (i5 != 0) {
            j += C108418b.m146890j(4, i5);
        }
        int i6 = this.f306893f;
        if (i6 != -1) {
            j += C108418b.m146882b(5, i6);
        }
        int i7 = this.f306894g;
        if (i7 != 0) {
            j += C108418b.m146890j(6, i7);
        }
        C103908w0 w0Var = this.f306895h;
        if (w0Var != null) {
            j += C108418b.m146884d(7, w0Var);
        }
        int i8 = this.f306896i;
        if (i8 != 0) {
            j += C108418b.m146890j(8, i8);
        }
        if (!this.f306897j.equals("")) {
            j += C108418b.m146887g(9, this.f306897j);
        }
        C103910x0[] x0VarArr = this.f306898k;
        if (x0VarArr != null && x0VarArr.length > 0) {
            int i9 = 0;
            while (true) {
                C103910x0[] x0VarArr2 = this.f306898k;
                if (i9 >= x0VarArr2.length) {
                    break;
                }
                C103910x0 x0Var = x0VarArr2[i9];
                if (x0Var != null) {
                    j += C108418b.m146884d(10, x0Var);
                }
                i9++;
            }
        }
        int i15 = this.f306899l;
        if (i15 != 0) {
            j += C108418b.m146890j(11, i15);
        }
        int[] iArr2 = this.f306900m;
        if (iArr2 != null && iArr2.length > 0) {
            int i16 = 0;
            while (true) {
                iArr = this.f306900m;
                if (i2 >= iArr.length) {
                    break;
                }
                i16 += C108418b.m146885e(iArr[i2]);
                i2++;
            }
            j = j + i16 + (iArr.length * 1);
        }
        int i17 = this.f306901n;
        if (i17 != 0) {
            j += C108418b.m146890j(13, i17);
        }
        int i18 = this.f306902o;
        if (i18 != 0) {
            j += C108418b.m146890j(14, i18);
        }
        int i19 = this.f306903p;
        if (i19 != 0) {
            j += C108418b.m146890j(15, i19);
        }
        int i25 = this.f306904q;
        if (i25 != 0) {
            j += C108418b.m146890j(16, i25);
        }
        C103902t0 t0Var = this.f306905r;
        if (t0Var != null) {
            j += C108418b.m146884d(17, t0Var);
        }
        if (!this.f306906s.equals("")) {
            j += C108418b.m146887g(100, this.f306906s);
        }
        if (!this.f306907t.equals("")) {
            j += C108418b.m146887g(101, this.f306907t);
        }
        int i26 = this.f306908u;
        if (i26 != 0) {
            j += C108418b.m146890j(102, i26);
        }
        if (!Arrays.equals(this.f306909v, C108422g.f324646c)) {
            j += C108418b.m146881a(200, this.f306909v);
        }
        C103903u uVar = this.f306910w;
        if (uVar != null) {
            j += C108418b.m146884d(201, uVar);
        }
        int i27 = this.f306911x;
        if (i27 != -1) {
            j += C108418b.m146882b(202, i27);
        }
        if (!this.f306912y.equals("")) {
            j += C108418b.m146887g(203, this.f306912y);
        }
        int i28 = this.f306913z;
        if (i28 != 0) {
            j += C108418b.m146882b(204, i28);
        }
        int i29 = this.f306884A;
        if (i29 != 0) {
            j += C108418b.m146890j(205, i29);
        }
        int i35 = this.f306885B;
        if (i35 != 0) {
            j += C108418b.m146890j(206, i35);
        }
        int i36 = this.f306886C;
        if (i36 != 0) {
            j += C108418b.m146890j(207, i36);
        }
        int i37 = this.f306887D;
        if (i37 != 0) {
            j += C108418b.m146890j(208, i37);
        }
        int i38 = this.f306888E;
        return i38 != 0 ? j + C108418b.m146890j(240, i38) : j;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            switch (k) {
                case 0:
                    break;
                case 8:
                    this.f306889b = aVar.mo158946h();
                    continue;
                case 16:
                    this.f306890c = aVar.mo158946h();
                    continue;
                case 24:
                    this.f306891d = aVar.mo158946h();
                    continue;
                case 32:
                    this.f306892e = aVar.mo158946h();
                    continue;
                case 40:
                    this.f306893f = aVar.mo158946h();
                    continue;
                case 48:
                    this.f306894g = aVar.mo158946h();
                    continue;
                case 58:
                    if (this.f306895h == null) {
                        this.f306895h = new C103908w0();
                    }
                    aVar.mo158943e(this.f306895h);
                    continue;
                case 64:
                    this.f306896i = aVar.mo158946h();
                    continue;
                case 74:
                    this.f306897j = aVar.mo158948j();
                    continue;
                case 82:
                    int a = C108422g.m146910a(aVar, 82);
                    C103910x0[] x0VarArr = this.f306898k;
                    int length = x0VarArr == null ? 0 : x0VarArr.length;
                    int i = a + length;
                    C103910x0[] x0VarArr2 = new C103910x0[i];
                    if (length != 0) {
                        System.arraycopy(x0VarArr, 0, x0VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C103910x0 x0Var = new C103910x0();
                        x0VarArr2[length] = x0Var;
                        aVar.mo158943e(x0Var);
                        aVar.mo158949k();
                        length++;
                    }
                    C103910x0 x0Var2 = new C103910x0();
                    x0VarArr2[length] = x0Var2;
                    aVar.mo158943e(x0Var2);
                    this.f306898k = x0VarArr2;
                    continue;
                case 88:
                    this.f306899l = aVar.mo158946h();
                    continue;
                case 96:
                    int a2 = C108422g.m146910a(aVar, 96);
                    int[] iArr = this.f306900m;
                    int length2 = iArr == null ? 0 : iArr.length;
                    int i2 = a2 + length2;
                    int[] iArr2 = new int[i2];
                    if (length2 != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        iArr2[length2] = aVar.mo158946h();
                        aVar.mo158949k();
                        length2++;
                    }
                    iArr2[length2] = aVar.mo158946h();
                    this.f306900m = iArr2;
                    continue;
                case 98:
                    int c = aVar.mo158941c(aVar.mo158946h());
                    int i3 = aVar.f324635e - aVar.f324632b;
                    int i4 = 0;
                    while (aVar.mo158939a() > 0) {
                        aVar.mo158946h();
                        i4++;
                    }
                    aVar.mo158950l(i3);
                    int[] iArr3 = this.f306900m;
                    int length3 = iArr3 == null ? 0 : iArr3.length;
                    int i5 = i4 + length3;
                    int[] iArr4 = new int[i5];
                    if (length3 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length3);
                    }
                    while (length3 < i5) {
                        iArr4[length3] = aVar.mo158946h();
                        length3++;
                    }
                    this.f306900m = iArr4;
                    aVar.mo158940b(c);
                    continue;
                case 104:
                    this.f306901n = aVar.mo158946h();
                    continue;
                case 112:
                    this.f306902o = aVar.mo158946h();
                    continue;
                case 120:
                    this.f306903p = aVar.mo158946h();
                    continue;
                case 128:
                    this.f306904q = aVar.mo158946h();
                    continue;
                case 138:
                    if (this.f306905r == null) {
                        this.f306905r = new C103902t0();
                    }
                    aVar.mo158943e(this.f306905r);
                    continue;
                case 802:
                    this.f306906s = aVar.mo158948j();
                    continue;
                case 810:
                    this.f306907t = aVar.mo158948j();
                    continue;
                case 816:
                    this.f306908u = aVar.mo158946h();
                    continue;
                case TingScene_FinderProfileSinger_VALUE:
                    this.f306909v = aVar.mo158942d();
                    continue;
                case 1610:
                    if (this.f306910w == null) {
                        this.f306910w = new C103903u();
                    }
                    aVar.mo158943e(this.f306910w);
                    continue;
                case 1616:
                    this.f306911x = aVar.mo158946h();
                    continue;
                case 1626:
                    this.f306912y = aVar.mo158948j();
                    continue;
                case 1632:
                    this.f306913z = aVar.mo158946h();
                    continue;
                case 1640:
                    this.f306884A = aVar.mo158946h();
                    continue;
                case 1648:
                    this.f306885B = aVar.mo158946h();
                    continue;
                case 1656:
                    this.f306886C = aVar.mo158946h();
                    continue;
                case 1664:
                    this.f306887D = aVar.mo158946h();
                    continue;
                case 1920:
                    this.f306888E = aVar.mo158946h();
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
        int i = this.f306889b;
        if (i != 0) {
            bVar.mo158963v(1, i);
        }
        int i2 = this.f306890c;
        if (i2 != 0) {
            bVar.mo158963v(2, i2);
        }
        int i3 = this.f306891d;
        if (i3 != 0) {
            bVar.mo158963v(3, i3);
        }
        int i4 = this.f306892e;
        if (i4 != 0) {
            bVar.mo158963v(4, i4);
        }
        int i5 = this.f306893f;
        if (i5 != -1) {
            bVar.mo158954m(5, i5);
        }
        int i6 = this.f306894g;
        if (i6 != 0) {
            bVar.mo158963v(6, i6);
        }
        C103908w0 w0Var = this.f306895h;
        if (w0Var != null) {
            bVar.mo158956o(7, w0Var);
        }
        int i7 = this.f306896i;
        if (i7 != 0) {
            bVar.mo158963v(8, i7);
        }
        if (!this.f306897j.equals("")) {
            bVar.mo158961t(9, this.f306897j);
        }
        C103910x0[] x0VarArr = this.f306898k;
        int i8 = 0;
        if (x0VarArr != null && x0VarArr.length > 0) {
            int i9 = 0;
            while (true) {
                C103910x0[] x0VarArr2 = this.f306898k;
                if (i9 >= x0VarArr2.length) {
                    break;
                }
                C103910x0 x0Var = x0VarArr2[i9];
                if (x0Var != null) {
                    bVar.mo158956o(10, x0Var);
                }
                i9++;
            }
        }
        int i15 = this.f306899l;
        if (i15 != 0) {
            bVar.mo158963v(11, i15);
        }
        int[] iArr = this.f306900m;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.f306900m;
                if (i8 >= iArr2.length) {
                    break;
                }
                bVar.mo158963v(12, iArr2[i8]);
                i8++;
            }
        }
        int i16 = this.f306901n;
        if (i16 != 0) {
            bVar.mo158963v(13, i16);
        }
        int i17 = this.f306902o;
        if (i17 != 0) {
            bVar.mo158963v(14, i17);
        }
        int i18 = this.f306903p;
        if (i18 != 0) {
            bVar.mo158963v(15, i18);
        }
        int i19 = this.f306904q;
        if (i19 != 0) {
            bVar.mo158963v(16, i19);
        }
        C103902t0 t0Var = this.f306905r;
        if (t0Var != null) {
            bVar.mo158956o(17, t0Var);
        }
        if (!this.f306906s.equals("")) {
            bVar.mo158961t(100, this.f306906s);
        }
        if (!this.f306907t.equals("")) {
            bVar.mo158961t(101, this.f306907t);
        }
        int i25 = this.f306908u;
        if (i25 != 0) {
            bVar.mo158963v(102, i25);
        }
        if (!Arrays.equals(this.f306909v, C108422g.f324646c)) {
            bVar.mo158953l(200, this.f306909v);
        }
        C103903u uVar = this.f306910w;
        if (uVar != null) {
            bVar.mo158956o(201, uVar);
        }
        int i26 = this.f306911x;
        if (i26 != -1) {
            bVar.mo158954m(202, i26);
        }
        if (!this.f306912y.equals("")) {
            bVar.mo158961t(203, this.f306912y);
        }
        int i27 = this.f306913z;
        if (i27 != 0) {
            bVar.mo158954m(204, i27);
        }
        int i28 = this.f306884A;
        if (i28 != 0) {
            bVar.mo158963v(205, i28);
        }
        int i29 = this.f306885B;
        if (i29 != 0) {
            bVar.mo158963v(206, i29);
        }
        int i35 = this.f306886C;
        if (i35 != 0) {
            bVar.mo158963v(207, i35);
        }
        int i36 = this.f306887D;
        if (i36 != 0) {
            bVar.mo158963v(208, i36);
        }
        int i37 = this.f306888E;
        if (i37 != 0) {
            bVar.mo158963v(240, i37);
        }
    }
}
