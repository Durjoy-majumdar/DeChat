package as3;

import java.util.Arrays;
import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.r */
public final class C103897r extends C108421e {

    /* renamed from: b */
    public int f307132b = 0;

    /* renamed from: c */
    public String f307133c = "";

    /* renamed from: d */
    public int f307134d = 0;

    /* renamed from: e */
    public long f307135e = 0;

    /* renamed from: f */
    public int f307136f = 0;

    /* renamed from: g */
    public C103914z0 f307137g = null;

    /* renamed from: h */
    public C103863c1[] f307138h = C103863c1.m138446f();

    /* renamed from: i */
    public C103860b1[] f307139i = C103860b1.m138436f();

    /* renamed from: j */
    public C103912y0 f307140j = null;

    /* renamed from: k */
    public C103869e1 f307141k = null;

    /* renamed from: l */
    public int f307142l = 0;

    /* renamed from: m */
    public int f307143m = 0;

    /* renamed from: n */
    public int f307144n = 0;

    /* renamed from: o */
    public long f307145o = 0;

    /* renamed from: p */
    public int f307146p = 0;

    /* renamed from: q */
    public byte[] f307147q;

    /* renamed from: r */
    public byte[] f307148r;

    /* renamed from: s */
    public C103860b1[] f307149s;

    /* renamed from: t */
    public int f307150t;

    public C103897r() {
        byte[] bArr = C108422g.f324646c;
        this.f307147q = bArr;
        this.f307148r = bArr;
        this.f307149s = C103860b1.m138436f();
        this.f307150t = 0;
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = this.f307132b;
        int i2 = 0;
        int b = i != 0 ? C108418b.m146882b(1, i) + 0 : 0;
        if (!this.f307133c.equals("")) {
            b += C108418b.m146887g(2, this.f307133c);
        }
        int i3 = this.f307134d;
        if (i3 != 0) {
            b += C108418b.m146882b(3, i3);
        }
        long j = this.f307135e;
        if (j != 0) {
            b += C108418b.m146883c(4, j);
        }
        int i4 = this.f307136f;
        if (i4 != 0) {
            b += C108418b.m146890j(5, i4);
        }
        C103914z0 z0Var = this.f307137g;
        if (z0Var != null) {
            b += C108418b.m146884d(6, z0Var);
        }
        C103863c1[] c1VarArr = this.f307138h;
        if (c1VarArr != null && c1VarArr.length > 0) {
            int i5 = 0;
            while (true) {
                C103863c1[] c1VarArr2 = this.f307138h;
                if (i5 >= c1VarArr2.length) {
                    break;
                }
                C103863c1 c1Var = c1VarArr2[i5];
                if (c1Var != null) {
                    b += C108418b.m146884d(7, c1Var);
                }
                i5++;
            }
        }
        C103860b1[] b1VarArr = this.f307139i;
        if (b1VarArr != null && b1VarArr.length > 0) {
            int i6 = 0;
            while (true) {
                C103860b1[] b1VarArr2 = this.f307139i;
                if (i6 >= b1VarArr2.length) {
                    break;
                }
                C103860b1 b1Var = b1VarArr2[i6];
                if (b1Var != null) {
                    b += C108418b.m146884d(8, b1Var);
                }
                i6++;
            }
        }
        C103912y0 y0Var = this.f307140j;
        if (y0Var != null) {
            b += C108418b.m146884d(9, y0Var);
        }
        C103869e1 e1Var = this.f307141k;
        if (e1Var != null) {
            b += C108418b.m146884d(10, e1Var);
        }
        int i7 = this.f307142l;
        if (i7 != 0) {
            b += C108418b.m146890j(11, i7);
        }
        int i8 = this.f307143m;
        if (i8 != 0) {
            b += C108418b.m146890j(12, i8);
        }
        int i9 = this.f307144n;
        if (i9 != 0) {
            b += C108418b.m146890j(13, i9);
        }
        long j2 = this.f307145o;
        if (j2 != 0) {
            b += C108418b.m146891k(101, j2);
        }
        int i15 = this.f307146p;
        if (i15 != 0) {
            b += C108418b.m146890j(102, i15);
        }
        byte[] bArr = this.f307147q;
        byte[] bArr2 = C108422g.f324646c;
        if (!Arrays.equals(bArr, bArr2)) {
            b += C108418b.m146881a(103, this.f307147q);
        }
        if (!Arrays.equals(this.f307148r, bArr2)) {
            b += C108418b.m146881a(200, this.f307148r);
        }
        C103860b1[] b1VarArr3 = this.f307149s;
        if (b1VarArr3 != null && b1VarArr3.length > 0) {
            while (true) {
                C103860b1[] b1VarArr4 = this.f307149s;
                if (i2 >= b1VarArr4.length) {
                    break;
                }
                C103860b1 b1Var2 = b1VarArr4[i2];
                if (b1Var2 != null) {
                    b += C108418b.m146884d(201, b1Var2);
                }
                i2++;
            }
        }
        int i16 = this.f307150t;
        return i16 != 0 ? b + C108418b.m146882b(202, i16) : b;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            switch (k) {
                case 0:
                    break;
                case 8:
                    this.f307132b = aVar.mo158946h();
                    continue;
                case 18:
                    this.f307133c = aVar.mo158948j();
                    continue;
                case 24:
                    this.f307134d = aVar.mo158946h();
                    continue;
                case 32:
                    this.f307135e = aVar.mo158947i();
                    continue;
                case 40:
                    this.f307136f = aVar.mo158946h();
                    continue;
                case 50:
                    if (this.f307137g == null) {
                        this.f307137g = new C103914z0();
                    }
                    aVar.mo158943e(this.f307137g);
                    continue;
                case 58:
                    int a = C108422g.m146910a(aVar, 58);
                    C103863c1[] c1VarArr = this.f307138h;
                    int length = c1VarArr == null ? 0 : c1VarArr.length;
                    int i = a + length;
                    C103863c1[] c1VarArr2 = new C103863c1[i];
                    if (length != 0) {
                        System.arraycopy(c1VarArr, 0, c1VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C103863c1 c1Var = new C103863c1();
                        c1VarArr2[length] = c1Var;
                        aVar.mo158943e(c1Var);
                        aVar.mo158949k();
                        length++;
                    }
                    C103863c1 c1Var2 = new C103863c1();
                    c1VarArr2[length] = c1Var2;
                    aVar.mo158943e(c1Var2);
                    this.f307138h = c1VarArr2;
                    continue;
                case 66:
                    int a2 = C108422g.m146910a(aVar, 66);
                    C103860b1[] b1VarArr = this.f307139i;
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
                    this.f307139i = b1VarArr2;
                    continue;
                case 74:
                    if (this.f307140j == null) {
                        this.f307140j = new C103912y0();
                    }
                    aVar.mo158943e(this.f307140j);
                    continue;
                case 82:
                    if (this.f307141k == null) {
                        this.f307141k = new C103869e1();
                    }
                    aVar.mo158943e(this.f307141k);
                    continue;
                case 88:
                    this.f307142l = aVar.mo158946h();
                    continue;
                case 96:
                    this.f307143m = aVar.mo158946h();
                    continue;
                case 104:
                    this.f307144n = aVar.mo158946h();
                    continue;
                case 808:
                    this.f307145o = aVar.mo158947i();
                    continue;
                case 816:
                    this.f307146p = aVar.mo158946h();
                    continue;
                case 826:
                    this.f307147q = aVar.mo158942d();
                    continue;
                case TingScene_FinderProfileSinger_VALUE:
                    this.f307148r = aVar.mo158942d();
                    continue;
                case 1610:
                    int a3 = C108422g.m146910a(aVar, 1610);
                    C103860b1[] b1VarArr3 = this.f307149s;
                    int length3 = b1VarArr3 == null ? 0 : b1VarArr3.length;
                    int i3 = a3 + length3;
                    C103860b1[] b1VarArr4 = new C103860b1[i3];
                    if (length3 != 0) {
                        System.arraycopy(b1VarArr3, 0, b1VarArr4, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        C103860b1 b1Var3 = new C103860b1();
                        b1VarArr4[length3] = b1Var3;
                        aVar.mo158943e(b1Var3);
                        aVar.mo158949k();
                        length3++;
                    }
                    C103860b1 b1Var4 = new C103860b1();
                    b1VarArr4[length3] = b1Var4;
                    aVar.mo158943e(b1Var4);
                    this.f307149s = b1VarArr4;
                    continue;
                case 1616:
                    this.f307150t = aVar.mo158946h();
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
        int i = this.f307132b;
        if (i != 0) {
            bVar.mo158954m(1, i);
        }
        if (!this.f307133c.equals("")) {
            bVar.mo158961t(2, this.f307133c);
        }
        int i2 = this.f307134d;
        if (i2 != 0) {
            bVar.mo158954m(3, i2);
        }
        long j = this.f307135e;
        if (j != 0) {
            bVar.mo158955n(4, j);
        }
        int i3 = this.f307136f;
        if (i3 != 0) {
            bVar.mo158963v(5, i3);
        }
        C103914z0 z0Var = this.f307137g;
        if (z0Var != null) {
            bVar.mo158956o(6, z0Var);
        }
        C103863c1[] c1VarArr = this.f307138h;
        int i4 = 0;
        if (c1VarArr != null && c1VarArr.length > 0) {
            int i5 = 0;
            while (true) {
                C103863c1[] c1VarArr2 = this.f307138h;
                if (i5 >= c1VarArr2.length) {
                    break;
                }
                C103863c1 c1Var = c1VarArr2[i5];
                if (c1Var != null) {
                    bVar.mo158956o(7, c1Var);
                }
                i5++;
            }
        }
        C103860b1[] b1VarArr = this.f307139i;
        if (b1VarArr != null && b1VarArr.length > 0) {
            int i6 = 0;
            while (true) {
                C103860b1[] b1VarArr2 = this.f307139i;
                if (i6 >= b1VarArr2.length) {
                    break;
                }
                C103860b1 b1Var = b1VarArr2[i6];
                if (b1Var != null) {
                    bVar.mo158956o(8, b1Var);
                }
                i6++;
            }
        }
        C103912y0 y0Var = this.f307140j;
        if (y0Var != null) {
            bVar.mo158956o(9, y0Var);
        }
        C103869e1 e1Var = this.f307141k;
        if (e1Var != null) {
            bVar.mo158956o(10, e1Var);
        }
        int i7 = this.f307142l;
        if (i7 != 0) {
            bVar.mo158963v(11, i7);
        }
        int i8 = this.f307143m;
        if (i8 != 0) {
            bVar.mo158963v(12, i8);
        }
        int i9 = this.f307144n;
        if (i9 != 0) {
            bVar.mo158963v(13, i9);
        }
        long j2 = this.f307145o;
        if (j2 != 0) {
            bVar.mo158964w(101, j2);
        }
        int i15 = this.f307146p;
        if (i15 != 0) {
            bVar.mo158963v(102, i15);
        }
        byte[] bArr = this.f307147q;
        byte[] bArr2 = C108422g.f324646c;
        if (!Arrays.equals(bArr, bArr2)) {
            bVar.mo158953l(103, this.f307147q);
        }
        if (!Arrays.equals(this.f307148r, bArr2)) {
            bVar.mo158953l(200, this.f307148r);
        }
        C103860b1[] b1VarArr3 = this.f307149s;
        if (b1VarArr3 != null && b1VarArr3.length > 0) {
            while (true) {
                C103860b1[] b1VarArr4 = this.f307149s;
                if (i4 >= b1VarArr4.length) {
                    break;
                }
                C103860b1 b1Var2 = b1VarArr4[i4];
                if (b1Var2 != null) {
                    bVar.mo158956o(201, b1Var2);
                }
                i4++;
            }
        }
        int i16 = this.f307150t;
        if (i16 != 0) {
            bVar.mo158954m(202, i16);
        }
    }
}
