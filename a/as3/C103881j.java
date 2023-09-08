package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108419c;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.j */
public final class C103881j extends C108421e {

    /* renamed from: b */
    public int f307030b = 0;

    /* renamed from: c */
    public long f307031c = 0;

    /* renamed from: d */
    public String f307032d = "";

    /* renamed from: e */
    public C103898r0[] f307033e;

    /* renamed from: f */
    public long f307034f;

    public C103881j() {
        if (C103898r0.f307151c == null) {
            synchronized (C108419c.f324642a) {
                if (C103898r0.f307151c == null) {
                    C103898r0.f307151c = new C103898r0[0];
                }
            }
        }
        this.f307033e = C103898r0.f307151c;
        this.f307034f = 0;
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        int b = C108418b.m146882b(1, this.f307030b) + 0 + C108418b.m146883c(2, this.f307031c);
        if (!this.f307032d.equals("")) {
            b += C108418b.m146887g(3, this.f307032d);
        }
        C103898r0[] r0VarArr = this.f307033e;
        if (r0VarArr != null && r0VarArr.length > 0) {
            while (true) {
                C103898r0[] r0VarArr2 = this.f307033e;
                if (i >= r0VarArr2.length) {
                    break;
                }
                C103898r0 r0Var = r0VarArr2[i];
                if (r0Var != null) {
                    b += C108418b.m146884d(4, r0Var);
                }
                i++;
            }
        }
        long j = this.f307034f;
        return j != 0 ? b + C108418b.m146891k(5, j) : b;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307030b = aVar.mo158946h();
            } else if (k == 16) {
                this.f307031c = aVar.mo158947i();
            } else if (k == 26) {
                this.f307032d = aVar.mo158948j();
            } else if (k == 34) {
                int a = C108422g.m146910a(aVar, 34);
                C103898r0[] r0VarArr = this.f307033e;
                int length = r0VarArr == null ? 0 : r0VarArr.length;
                int i = a + length;
                C103898r0[] r0VarArr2 = new C103898r0[i];
                if (length != 0) {
                    System.arraycopy(r0VarArr, 0, r0VarArr2, 0, length);
                }
                while (length < i - 1) {
                    C103898r0 r0Var = new C103898r0();
                    r0VarArr2[length] = r0Var;
                    aVar.mo158943e(r0Var);
                    aVar.mo158949k();
                    length++;
                }
                C103898r0 r0Var2 = new C103898r0();
                r0VarArr2[length] = r0Var2;
                aVar.mo158943e(r0Var2);
                this.f307033e = r0VarArr2;
            } else if (k == 40) {
                this.f307034f = aVar.mo158947i();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        bVar.mo158954m(1, this.f307030b);
        bVar.mo158955n(2, this.f307031c);
        if (!this.f307032d.equals("")) {
            bVar.mo158961t(3, this.f307032d);
        }
        C103898r0[] r0VarArr = this.f307033e;
        if (r0VarArr != null && r0VarArr.length > 0) {
            int i = 0;
            while (true) {
                C103898r0[] r0VarArr2 = this.f307033e;
                if (i >= r0VarArr2.length) {
                    break;
                }
                C103898r0 r0Var = r0VarArr2[i];
                if (r0Var != null) {
                    bVar.mo158956o(4, r0Var);
                }
                i++;
            }
        }
        long j = this.f307034f;
        if (j != 0) {
            bVar.mo158964w(5, j);
        }
    }
}
