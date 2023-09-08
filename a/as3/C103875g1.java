package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.g1 */
public final class C103875g1 extends C108421e {

    /* renamed from: b */
    public int f307004b = 0;

    /* renamed from: c */
    public C103894p0 f307005c = null;

    public C103875g1() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = this.f307004b;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + C108418b.m146882b(1, i);
        }
        C103894p0 p0Var = this.f307005c;
        return p0Var != null ? i2 + C108418b.m146884d(2, p0Var) : i2;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307004b = aVar.mo158946h();
            } else if (k == 18) {
                if (this.f307005c == null) {
                    this.f307005c = new C103894p0();
                }
                aVar.mo158943e(this.f307005c);
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        int i = this.f307004b;
        if (i != 0) {
            bVar.mo158954m(1, i);
        }
        C103894p0 p0Var = this.f307005c;
        if (p0Var != null) {
            bVar.mo158956o(2, p0Var);
        }
    }
}
