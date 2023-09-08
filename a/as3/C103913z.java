package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.z */
public final class C103913z extends C108421e {

    /* renamed from: b */
    public String f307234b = "";

    /* renamed from: c */
    public int f307235c = 0;

    /* renamed from: d */
    public long f307236d = 0;

    /* renamed from: e */
    public C103860b1[] f307237e = C103860b1.m138436f();

    /* renamed from: f */
    public C103914z0 f307238f = null;

    public C103913z() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        int g = !this.f307234b.equals("") ? C108418b.m146887g(1, this.f307234b) + 0 : 0;
        int i2 = this.f307235c;
        if (i2 != 0) {
            g += C108418b.m146882b(2, i2);
        }
        long j = this.f307236d;
        if (j != 0) {
            g += C108418b.m146883c(3, j);
        }
        C103860b1[] b1VarArr = this.f307237e;
        if (b1VarArr != null && b1VarArr.length > 0) {
            while (true) {
                C103860b1[] b1VarArr2 = this.f307237e;
                if (i >= b1VarArr2.length) {
                    break;
                }
                C103860b1 b1Var = b1VarArr2[i];
                if (b1Var != null) {
                    g += C108418b.m146884d(4, b1Var);
                }
                i++;
            }
        }
        C103914z0 z0Var = this.f307238f;
        return z0Var != null ? g + C108418b.m146884d(5, z0Var) : g;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                this.f307234b = aVar.mo158948j();
            } else if (k == 16) {
                this.f307235c = aVar.mo158946h();
            } else if (k == 24) {
                this.f307236d = aVar.mo158947i();
            } else if (k == 34) {
                int a = C108422g.m146910a(aVar, 34);
                C103860b1[] b1VarArr = this.f307237e;
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
                this.f307237e = b1VarArr2;
            } else if (k == 42) {
                if (this.f307238f == null) {
                    this.f307238f = new C103914z0();
                }
                aVar.mo158943e(this.f307238f);
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f307234b.equals("")) {
            bVar.mo158961t(1, this.f307234b);
        }
        int i = this.f307235c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f307236d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
        C103860b1[] b1VarArr = this.f307237e;
        if (b1VarArr != null && b1VarArr.length > 0) {
            int i2 = 0;
            while (true) {
                C103860b1[] b1VarArr2 = this.f307237e;
                if (i2 >= b1VarArr2.length) {
                    break;
                }
                C103860b1 b1Var = b1VarArr2[i2];
                if (b1Var != null) {
                    bVar.mo158956o(4, b1Var);
                }
                i2++;
            }
        }
        C103914z0 z0Var = this.f307238f;
        if (z0Var != null) {
            bVar.mo158956o(5, z0Var);
        }
    }
}
