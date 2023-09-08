package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.h0 */
public final class C103877h0 extends C108421e {

    /* renamed from: b */
    public int f307011b = 0;

    /* renamed from: c */
    public long f307012c = 0;

    public C103877h0() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = this.f307011b;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + C108418b.m146882b(1, i);
        }
        long j = this.f307012c;
        return j != 0 ? i2 + C108418b.m146883c(2, j) : i2;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307011b = aVar.mo158946h();
            } else if (k == 16) {
                this.f307012c = aVar.mo158947i();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        int i = this.f307011b;
        if (i != 0) {
            bVar.mo158954m(1, i);
        }
        long j = this.f307012c;
        if (j != 0) {
            bVar.mo158955n(2, j);
        }
    }
}
