package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.o0 */
public final class C103892o0 extends C108421e {

    /* renamed from: b */
    public String f307117b = "";

    /* renamed from: c */
    public int f307118c = 0;

    /* renamed from: d */
    public long f307119d = 0;

    public C103892o0() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        if (!this.f307117b.equals("")) {
            i = 0 + C108418b.m146887g(1, this.f307117b);
        }
        int i2 = this.f307118c;
        if (i2 != 0) {
            i += C108418b.m146882b(2, i2);
        }
        long j = this.f307119d;
        return j != 0 ? i + C108418b.m146883c(3, j) : i;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                this.f307117b = aVar.mo158948j();
            } else if (k == 16) {
                this.f307118c = aVar.mo158946h();
            } else if (k == 24) {
                this.f307119d = aVar.mo158947i();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f307117b.equals("")) {
            bVar.mo158961t(1, this.f307117b);
        }
        int i = this.f307118c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f307119d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
    }
}
