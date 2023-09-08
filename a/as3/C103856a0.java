package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.a0 */
public final class C103856a0 extends C108421e {

    /* renamed from: b */
    public String f306848b = "";

    public C103856a0() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        if (!this.f306848b.equals("")) {
            return 0 + C108418b.m146887g(1, this.f306848b);
        }
        return 0;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                this.f306848b = aVar.mo158948j();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f306848b.equals("")) {
            bVar.mo158961t(1, this.f306848b);
        }
    }
}
