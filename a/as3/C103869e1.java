package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.e1 */
public final class C103869e1 extends C108421e {

    /* renamed from: b */
    public int f306979b = 0;

    /* renamed from: c */
    public long f306980c = 0;

    /* renamed from: d */
    public int f306981d = 0;

    public C103869e1() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = this.f306979b;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + C108418b.m146882b(1, i);
        }
        long j = this.f306980c;
        if (j != 0) {
            i2 += C108418b.m146883c(2, j);
        }
        int i3 = this.f306981d;
        return i3 != 0 ? i2 + C108418b.m146890j(3, i3) : i2;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f306979b = aVar.mo158946h();
            } else if (k == 16) {
                this.f306980c = aVar.mo158947i();
            } else if (k == 24) {
                this.f306981d = aVar.mo158946h();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        int i = this.f306979b;
        if (i != 0) {
            bVar.mo158954m(1, i);
        }
        long j = this.f306980c;
        if (j != 0) {
            bVar.mo158955n(2, j);
        }
        int i2 = this.f306981d;
        if (i2 != 0) {
            bVar.mo158963v(3, i2);
        }
    }
}
