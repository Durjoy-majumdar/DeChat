package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.t0 */
public final class C103902t0 extends C108421e {

    /* renamed from: b */
    public long f307162b = 0;

    /* renamed from: c */
    public int f307163c = 0;

    /* renamed from: d */
    public int f307164d = 0;

    public C103902t0() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        long j = this.f307162b;
        int i = 0;
        if (j != 0) {
            i = 0 + C108418b.m146891k(1, j);
        }
        int i2 = this.f307163c;
        if (i2 != 0) {
            i += C108418b.m146890j(2, i2);
        }
        int i3 = this.f307164d;
        return i3 != 0 ? i + C108418b.m146890j(3, i3) : i;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307162b = aVar.mo158947i();
            } else if (k == 16) {
                this.f307163c = aVar.mo158946h();
            } else if (k == 24) {
                this.f307164d = aVar.mo158946h();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        long j = this.f307162b;
        if (j != 0) {
            bVar.mo158964w(1, j);
        }
        int i = this.f307163c;
        if (i != 0) {
            bVar.mo158963v(2, i);
        }
        int i2 = this.f307164d;
        if (i2 != 0) {
            bVar.mo158963v(3, i2);
        }
    }
}
