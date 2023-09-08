package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108419c;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.t */
public final class C103901t extends C108421e {

    /* renamed from: b */
    public C103900s0[] f307161b;

    public C103901t() {
        if (C103900s0.f307154h == null) {
            synchronized (C108419c.f324642a) {
                if (C103900s0.f307154h == null) {
                    C103900s0.f307154h = new C103900s0[0];
                }
            }
        }
        this.f307161b = C103900s0.f307154h;
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        C103900s0[] s0VarArr = this.f307161b;
        int i = 0;
        if (s0VarArr == null || s0VarArr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            C103900s0[] s0VarArr2 = this.f307161b;
            if (i >= s0VarArr2.length) {
                return i2;
            }
            C103900s0 s0Var = s0VarArr2[i];
            if (s0Var != null) {
                i2 += C108418b.m146884d(1, s0Var);
            }
            i++;
        }
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                int a = C108422g.m146910a(aVar, 10);
                C103900s0[] s0VarArr = this.f307161b;
                int length = s0VarArr == null ? 0 : s0VarArr.length;
                int i = a + length;
                C103900s0[] s0VarArr2 = new C103900s0[i];
                if (length != 0) {
                    System.arraycopy(s0VarArr, 0, s0VarArr2, 0, length);
                }
                while (length < i - 1) {
                    C103900s0 s0Var = new C103900s0();
                    s0VarArr2[length] = s0Var;
                    aVar.mo158943e(s0Var);
                    aVar.mo158949k();
                    length++;
                }
                C103900s0 s0Var2 = new C103900s0();
                s0VarArr2[length] = s0Var2;
                aVar.mo158943e(s0Var2);
                this.f307161b = s0VarArr2;
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        C103900s0[] s0VarArr = this.f307161b;
        if (s0VarArr != null && s0VarArr.length > 0) {
            int i = 0;
            while (true) {
                C103900s0[] s0VarArr2 = this.f307161b;
                if (i < s0VarArr2.length) {
                    C103900s0 s0Var = s0VarArr2[i];
                    if (s0Var != null) {
                        bVar.mo158956o(1, s0Var);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
