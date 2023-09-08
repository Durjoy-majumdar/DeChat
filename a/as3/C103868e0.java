package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.e0 */
public final class C103868e0 extends C108421e {

    /* renamed from: b */
    public String f306976b = "";

    /* renamed from: c */
    public C103914z0 f306977c = null;

    /* renamed from: d */
    public int f306978d = 0;

    public C103868e0() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        if (!this.f306976b.equals("")) {
            i = 0 + C108418b.m146887g(1, this.f306976b);
        }
        C103914z0 z0Var = this.f306977c;
        if (z0Var != null) {
            i += C108418b.m146884d(2, z0Var);
        }
        int i2 = this.f306978d;
        return i2 != 0 ? i + C108418b.m146882b(3, i2) : i;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                this.f306976b = aVar.mo158948j();
            } else if (k == 18) {
                if (this.f306977c == null) {
                    this.f306977c = new C103914z0();
                }
                aVar.mo158943e(this.f306977c);
            } else if (k == 24) {
                this.f306978d = aVar.mo158946h();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f306976b.equals("")) {
            bVar.mo158961t(1, this.f306976b);
        }
        C103914z0 z0Var = this.f306977c;
        if (z0Var != null) {
            bVar.mo158956o(2, z0Var);
        }
        int i = this.f306978d;
        if (i != 0) {
            bVar.mo158954m(3, i);
        }
    }
}
