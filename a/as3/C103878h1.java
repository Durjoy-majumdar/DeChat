package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.h1 */
public final class C103878h1 extends C108421e {

    /* renamed from: b */
    public String f307013b = "";

    /* renamed from: c */
    public int f307014c = 0;

    /* renamed from: d */
    public long f307015d = 0;

    /* renamed from: e */
    public int f307016e = 0;

    /* renamed from: f */
    public int f307017f = 0;

    /* renamed from: g */
    public String f307018g = "";

    /* renamed from: h */
    public C103860b1[] f307019h = C103860b1.m138436f();

    /* renamed from: i */
    public String f307020i = "";

    /* renamed from: j */
    public String[] f307021j = C108422g.f324645b;

    /* renamed from: k */
    public long f307022k = 0;

    public C103878h1() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        int g = !this.f307013b.equals("") ? C108418b.m146887g(1, this.f307013b) + 0 : 0;
        int i2 = this.f307014c;
        if (i2 != 0) {
            g += C108418b.m146882b(2, i2);
        }
        long j = this.f307015d;
        if (j != 0) {
            g += C108418b.m146883c(3, j);
        }
        int i3 = this.f307016e;
        if (i3 != 0) {
            g += C108418b.m146890j(4, i3);
        }
        int i4 = this.f307017f;
        if (i4 != 0) {
            g += C108418b.m146882b(5, i4);
        }
        if (!this.f307018g.equals("")) {
            g += C108418b.m146887g(6, this.f307018g);
        }
        C103860b1[] b1VarArr = this.f307019h;
        if (b1VarArr != null && b1VarArr.length > 0) {
            int i5 = 0;
            while (true) {
                C103860b1[] b1VarArr2 = this.f307019h;
                if (i5 >= b1VarArr2.length) {
                    break;
                }
                C103860b1 b1Var = b1VarArr2[i5];
                if (b1Var != null) {
                    g += C108418b.m146884d(7, b1Var);
                }
                i5++;
            }
        }
        if (!this.f307020i.equals("")) {
            g += C108418b.m146887g(8, this.f307020i);
        }
        String[] strArr = this.f307021j;
        if (strArr != null && strArr.length > 0) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr2 = this.f307021j;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    i7++;
                    i6 += C108418b.m146888h(str);
                }
                i++;
            }
            g = g + i6 + (i7 * 1);
        }
        long j2 = this.f307022k;
        return j2 != 0 ? g + C108418b.m146891k(10, j2) : g;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            switch (k) {
                case 0:
                    break;
                case 10:
                    this.f307013b = aVar.mo158948j();
                    continue;
                case 16:
                    this.f307014c = aVar.mo158946h();
                    continue;
                case 24:
                    this.f307015d = aVar.mo158947i();
                    continue;
                case 32:
                    this.f307016e = aVar.mo158946h();
                    continue;
                case 40:
                    this.f307017f = aVar.mo158946h();
                    continue;
                case 50:
                    this.f307018g = aVar.mo158948j();
                    continue;
                case 58:
                    int a = C108422g.m146910a(aVar, 58);
                    C103860b1[] b1VarArr = this.f307019h;
                    int length = b1VarArr == null ? 0 : b1VarArr.length;
                    int i = a + length;
                    C103860b1[] b1VarArr2 = new C103860b1[i];
                    if (length != 0) {
                        System.arraycopy(b1VarArr, 0, b1VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C103860b1 b1Var = new C103860b1();
                        b1VarArr2[length] = b1Var;
                        aVar.mo158943e(b1Var);
                        aVar.mo158949k();
                        length++;
                    }
                    C103860b1 b1Var2 = new C103860b1();
                    b1VarArr2[length] = b1Var2;
                    aVar.mo158943e(b1Var2);
                    this.f307019h = b1VarArr2;
                    continue;
                case 66:
                    this.f307020i = aVar.mo158948j();
                    continue;
                case 74:
                    int a2 = C108422g.m146910a(aVar, 74);
                    String[] strArr = this.f307021j;
                    int length2 = strArr == null ? 0 : strArr.length;
                    int i2 = a2 + length2;
                    String[] strArr2 = new String[i2];
                    if (length2 != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        strArr2[length2] = aVar.mo158948j();
                        aVar.mo158949k();
                        length2++;
                    }
                    strArr2[length2] = aVar.mo158948j();
                    this.f307021j = strArr2;
                    continue;
                case 80:
                    this.f307022k = aVar.mo158947i();
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
        if (!this.f307013b.equals("")) {
            bVar.mo158961t(1, this.f307013b);
        }
        int i = this.f307014c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f307015d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
        int i2 = this.f307016e;
        if (i2 != 0) {
            bVar.mo158963v(4, i2);
        }
        int i3 = this.f307017f;
        if (i3 != 0) {
            bVar.mo158954m(5, i3);
        }
        if (!this.f307018g.equals("")) {
            bVar.mo158961t(6, this.f307018g);
        }
        C103860b1[] b1VarArr = this.f307019h;
        int i4 = 0;
        if (b1VarArr != null && b1VarArr.length > 0) {
            int i5 = 0;
            while (true) {
                C103860b1[] b1VarArr2 = this.f307019h;
                if (i5 >= b1VarArr2.length) {
                    break;
                }
                C103860b1 b1Var = b1VarArr2[i5];
                if (b1Var != null) {
                    bVar.mo158956o(7, b1Var);
                }
                i5++;
            }
        }
        if (!this.f307020i.equals("")) {
            bVar.mo158961t(8, this.f307020i);
        }
        String[] strArr = this.f307021j;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f307021j;
                if (i4 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i4];
                if (str != null) {
                    bVar.mo158961t(9, str);
                }
                i4++;
            }
        }
        long j2 = this.f307022k;
        if (j2 != 0) {
            bVar.mo158964w(10, j2);
        }
    }
}
