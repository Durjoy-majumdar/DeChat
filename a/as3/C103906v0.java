package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.v0 */
public final class C103906v0 extends C108421e {

    /* renamed from: b */
    public int f307203b = 0;

    /* renamed from: c */
    public int f307204c = 0;

    public C103906v0() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = this.f307203b;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + C108418b.m146882b(1, i);
        }
        int i3 = this.f307204c;
        return i3 != 0 ? i2 + C108418b.m146882b(2, i3) : i2;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307203b = aVar.mo158946h();
            } else if (k == 16) {
                this.f307204c = aVar.mo158946h();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        int i = this.f307203b;
        if (i != 0) {
            bVar.mo158954m(1, i);
        }
        int i2 = this.f307204c;
        if (i2 != 0) {
            bVar.mo158954m(2, i2);
        }
    }
}
