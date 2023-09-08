package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108419c;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.i */
public final class C103879i extends C108421e {

    /* renamed from: b */
    public int f307023b = 0;

    /* renamed from: c */
    public long f307024c = 0;

    /* renamed from: d */
    public String f307025d = "";

    /* renamed from: e */
    public C103896q0[] f307026e;

    /* renamed from: f */
    public long f307027f;

    public C103879i() {
        if (C103896q0.f307130c == null) {
            synchronized (C108419c.f324642a) {
                if (C103896q0.f307130c == null) {
                    C103896q0.f307130c = new C103896q0[0];
                }
            }
        }
        this.f307026e = C103896q0.f307130c;
        this.f307027f = 0;
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        int b = C108418b.m146882b(1, this.f307023b) + 0 + C108418b.m146883c(2, this.f307024c);
        if (!this.f307025d.equals("")) {
            b += C108418b.m146887g(3, this.f307025d);
        }
        C103896q0[] q0VarArr = this.f307026e;
        if (q0VarArr != null && q0VarArr.length > 0) {
            while (true) {
                C103896q0[] q0VarArr2 = this.f307026e;
                if (i >= q0VarArr2.length) {
                    break;
                }
                C103896q0 q0Var = q0VarArr2[i];
                if (q0Var != null) {
                    b += C108418b.m146884d(4, q0Var);
                }
                i++;
            }
        }
        long j = this.f307027f;
        return j != 0 ? b + C108418b.m146891k(5, j) : b;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307023b = aVar.mo158946h();
            } else if (k == 16) {
                this.f307024c = aVar.mo158947i();
            } else if (k == 26) {
                this.f307025d = aVar.mo158948j();
            } else if (k == 34) {
                int a = C108422g.m146910a(aVar, 34);
                C103896q0[] q0VarArr = this.f307026e;
                int length = q0VarArr == null ? 0 : q0VarArr.length;
                int i = a + length;
                C103896q0[] q0VarArr2 = new C103896q0[i];
                if (length != 0) {
                    System.arraycopy(q0VarArr, 0, q0VarArr2, 0, length);
                }
                while (length < i - 1) {
                    C103896q0 q0Var = new C103896q0();
                    q0VarArr2[length] = q0Var;
                    aVar.mo158943e(q0Var);
                    aVar.mo158949k();
                    length++;
                }
                C103896q0 q0Var2 = new C103896q0();
                q0VarArr2[length] = q0Var2;
                aVar.mo158943e(q0Var2);
                this.f307026e = q0VarArr2;
            } else if (k == 40) {
                this.f307027f = aVar.mo158947i();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        bVar.mo158954m(1, this.f307023b);
        bVar.mo158955n(2, this.f307024c);
        if (!this.f307025d.equals("")) {
            bVar.mo158961t(3, this.f307025d);
        }
        C103896q0[] q0VarArr = this.f307026e;
        if (q0VarArr != null && q0VarArr.length > 0) {
            int i = 0;
            while (true) {
                C103896q0[] q0VarArr2 = this.f307026e;
                if (i >= q0VarArr2.length) {
                    break;
                }
                C103896q0 q0Var = q0VarArr2[i];
                if (q0Var != null) {
                    bVar.mo158956o(4, q0Var);
                }
                i++;
            }
        }
        long j = this.f307027f;
        if (j != 0) {
            bVar.mo158964w(5, j);
        }
    }
}
