package as3;

import java.util.Arrays;
import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108419c;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.n */
public final class C103889n extends C108421e {

    /* renamed from: b */
    public String f307082b = "";

    /* renamed from: c */
    public int f307083c = 0;

    /* renamed from: d */
    public long f307084d = 0;

    /* renamed from: e */
    public int f307085e = -1;

    /* renamed from: f */
    public int f307086f = 0;

    /* renamed from: g */
    public byte[] f307087g = C108422g.f324646c;

    /* renamed from: h */
    public C103872f1[] f307088h;

    /* renamed from: i */
    public C103904u0[] f307089i;

    /* renamed from: j */
    public int f307090j;

    /* renamed from: k */
    public int f307091k;

    /* renamed from: l */
    public int f307092l;

    public C103889n() {
        if (C103872f1.f306991g == null) {
            synchronized (C108419c.f324642a) {
                if (C103872f1.f306991g == null) {
                    C103872f1.f306991g = new C103872f1[0];
                }
            }
        }
        this.f307088h = C103872f1.f306991g;
        if (C103904u0.f307178f == null) {
            synchronized (C108419c.f324642a) {
                if (C103904u0.f307178f == null) {
                    C103904u0.f307178f = new C103904u0[0];
                }
            }
        }
        this.f307089i = C103904u0.f307178f;
        this.f307090j = 0;
        this.f307091k = 0;
        this.f307092l = 0;
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        int g = !this.f307082b.equals("") ? C108418b.m146887g(1, this.f307082b) + 0 : 0;
        int i2 = this.f307083c;
        if (i2 != 0) {
            g += C108418b.m146882b(2, i2);
        }
        long j = this.f307084d;
        if (j != 0) {
            g += C108418b.m146883c(3, j);
        }
        int i3 = this.f307085e;
        if (i3 != -1) {
            g += C108418b.m146882b(4, i3);
        }
        int i4 = this.f307086f;
        if (i4 != 0) {
            g += C108418b.m146882b(5, i4);
        }
        if (!Arrays.equals(this.f307087g, C108422g.f324646c)) {
            g += C108418b.m146881a(6, this.f307087g);
        }
        C103872f1[] f1VarArr = this.f307088h;
        if (f1VarArr != null && f1VarArr.length > 0) {
            int i5 = 0;
            while (true) {
                C103872f1[] f1VarArr2 = this.f307088h;
                if (i5 >= f1VarArr2.length) {
                    break;
                }
                C103872f1 f1Var = f1VarArr2[i5];
                if (f1Var != null) {
                    g += C108418b.m146884d(7, f1Var);
                }
                i5++;
            }
        }
        C103904u0[] u0VarArr = this.f307089i;
        if (u0VarArr != null && u0VarArr.length > 0) {
            while (true) {
                C103904u0[] u0VarArr2 = this.f307089i;
                if (i >= u0VarArr2.length) {
                    break;
                }
                C103904u0 u0Var = u0VarArr2[i];
                if (u0Var != null) {
                    g += C108418b.m146884d(8, u0Var);
                }
                i++;
            }
        }
        int i6 = this.f307090j;
        if (i6 != 0) {
            g += C108418b.m146882b(9, i6);
        }
        int i7 = this.f307091k;
        if (i7 != 0) {
            g += C108418b.m146882b(10, i7);
        }
        int i8 = this.f307092l;
        return i8 != 0 ? g + C108418b.m146882b(11, i8) : g;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            switch (k) {
                case 0:
                    break;
                case 10:
                    this.f307082b = aVar.mo158948j();
                    continue;
                case 16:
                    this.f307083c = aVar.mo158946h();
                    continue;
                case 24:
                    this.f307084d = aVar.mo158947i();
                    continue;
                case 32:
                    this.f307085e = aVar.mo158946h();
                    continue;
                case 40:
                    this.f307086f = aVar.mo158946h();
                    continue;
                case 50:
                    this.f307087g = aVar.mo158942d();
                    continue;
                case 58:
                    int a = C108422g.m146910a(aVar, 58);
                    C103872f1[] f1VarArr = this.f307088h;
                    int length = f1VarArr == null ? 0 : f1VarArr.length;
                    int i = a + length;
                    C103872f1[] f1VarArr2 = new C103872f1[i];
                    if (length != 0) {
                        System.arraycopy(f1VarArr, 0, f1VarArr2, 0, length);
                    }
                    while (length < i - 1) {
                        C103872f1 f1Var = new C103872f1();
                        f1VarArr2[length] = f1Var;
                        aVar.mo158943e(f1Var);
                        aVar.mo158949k();
                        length++;
                    }
                    C103872f1 f1Var2 = new C103872f1();
                    f1VarArr2[length] = f1Var2;
                    aVar.mo158943e(f1Var2);
                    this.f307088h = f1VarArr2;
                    continue;
                case 66:
                    int a2 = C108422g.m146910a(aVar, 66);
                    C103904u0[] u0VarArr = this.f307089i;
                    int length2 = u0VarArr == null ? 0 : u0VarArr.length;
                    int i2 = a2 + length2;
                    C103904u0[] u0VarArr2 = new C103904u0[i2];
                    if (length2 != 0) {
                        System.arraycopy(u0VarArr, 0, u0VarArr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        C103904u0 u0Var = new C103904u0();
                        u0VarArr2[length2] = u0Var;
                        aVar.mo158943e(u0Var);
                        aVar.mo158949k();
                        length2++;
                    }
                    C103904u0 u0Var2 = new C103904u0();
                    u0VarArr2[length2] = u0Var2;
                    aVar.mo158943e(u0Var2);
                    this.f307089i = u0VarArr2;
                    continue;
                case 72:
                    this.f307090j = aVar.mo158946h();
                    continue;
                case 80:
                    this.f307091k = aVar.mo158946h();
                    continue;
                case 88:
                    this.f307092l = aVar.mo158946h();
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
        if (!this.f307082b.equals("")) {
            bVar.mo158961t(1, this.f307082b);
        }
        int i = this.f307083c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f307084d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
        int i2 = this.f307085e;
        if (i2 != -1) {
            bVar.mo158954m(4, i2);
        }
        int i3 = this.f307086f;
        if (i3 != 0) {
            bVar.mo158954m(5, i3);
        }
        if (!Arrays.equals(this.f307087g, C108422g.f324646c)) {
            bVar.mo158953l(6, this.f307087g);
        }
        C103872f1[] f1VarArr = this.f307088h;
        int i4 = 0;
        if (f1VarArr != null && f1VarArr.length > 0) {
            int i5 = 0;
            while (true) {
                C103872f1[] f1VarArr2 = this.f307088h;
                if (i5 >= f1VarArr2.length) {
                    break;
                }
                C103872f1 f1Var = f1VarArr2[i5];
                if (f1Var != null) {
                    bVar.mo158956o(7, f1Var);
                }
                i5++;
            }
        }
        C103904u0[] u0VarArr = this.f307089i;
        if (u0VarArr != null && u0VarArr.length > 0) {
            while (true) {
                C103904u0[] u0VarArr2 = this.f307089i;
                if (i4 >= u0VarArr2.length) {
                    break;
                }
                C103904u0 u0Var = u0VarArr2[i4];
                if (u0Var != null) {
                    bVar.mo158956o(8, u0Var);
                }
                i4++;
            }
        }
        int i6 = this.f307090j;
        if (i6 != 0) {
            bVar.mo158954m(9, i6);
        }
        int i7 = this.f307091k;
        if (i7 != 0) {
            bVar.mo158954m(10, i7);
        }
        int i8 = this.f307092l;
        if (i8 != 0) {
            bVar.mo158954m(11, i8);
        }
    }
}
