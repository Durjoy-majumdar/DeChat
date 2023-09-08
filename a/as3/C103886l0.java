package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108419c;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.l0 */
public final class C103886l0 extends C108421e {

    /* renamed from: b */
    public C103857a1[] f307073b;

    public C103886l0() {
        if (C103857a1.f306849h == null) {
            synchronized (C108419c.f324642a) {
                if (C103857a1.f306849h == null) {
                    C103857a1.f306849h = new C103857a1[0];
                }
            }
        }
        this.f307073b = C103857a1.f306849h;
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        C103857a1[] a1VarArr = this.f307073b;
        int i = 0;
        if (a1VarArr == null || a1VarArr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            C103857a1[] a1VarArr2 = this.f307073b;
            if (i >= a1VarArr2.length) {
                return i2;
            }
            C103857a1 a1Var = a1VarArr2[i];
            if (a1Var != null) {
                i2 += C108418b.m146884d(1, a1Var);
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
                C103857a1[] a1VarArr = this.f307073b;
                int length = a1VarArr == null ? 0 : a1VarArr.length;
                int i = a + length;
                C103857a1[] a1VarArr2 = new C103857a1[i];
                if (length != 0) {
                    System.arraycopy(a1VarArr, 0, a1VarArr2, 0, length);
                }
                while (length < i - 1) {
                    C103857a1 a1Var = new C103857a1();
                    a1VarArr2[length] = a1Var;
                    aVar.mo158943e(a1Var);
                    aVar.mo158949k();
                    length++;
                }
                C103857a1 a1Var2 = new C103857a1();
                a1VarArr2[length] = a1Var2;
                aVar.mo158943e(a1Var2);
                this.f307073b = a1VarArr2;
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        C103857a1[] a1VarArr = this.f307073b;
        if (a1VarArr != null && a1VarArr.length > 0) {
            int i = 0;
            while (true) {
                C103857a1[] a1VarArr2 = this.f307073b;
                if (i < a1VarArr2.length) {
                    C103857a1 a1Var = a1VarArr2[i];
                    if (a1Var != null) {
                        bVar.mo158956o(1, a1Var);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
