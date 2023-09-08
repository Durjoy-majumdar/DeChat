package as3;

import java.util.Arrays;
import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.p0 */
public final class C103894p0 extends C108421e {

    /* renamed from: b */
    public int f307124b = 0;

    /* renamed from: c */
    public byte[] f307125c = C108422g.f324646c;

    public C103894p0() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int j = 0 + C108418b.m146890j(1, this.f307124b);
        return !Arrays.equals(this.f307125c, C108422g.f324646c) ? j + C108418b.m146881a(2, this.f307125c) : j;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307124b = aVar.mo158946h();
            } else if (k == 18) {
                this.f307125c = aVar.mo158942d();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        bVar.mo158963v(1, this.f307124b);
        if (!Arrays.equals(this.f307125c, C108422g.f324646c)) {
            bVar.mo158953l(2, this.f307125c);
        }
    }
}
