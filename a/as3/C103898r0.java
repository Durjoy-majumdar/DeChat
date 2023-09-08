package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.r0 */
public final class C103898r0 extends C108421e {

    /* renamed from: c */
    public static volatile C103898r0[] f307151c;

    /* renamed from: b */
    public int f307152b = 0;

    public C103898r0() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = this.f307152b;
        if (i != 0) {
            return 0 + C108418b.m146890j(1, i);
        }
        return 0;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307152b = aVar.mo158946h();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        int i = this.f307152b;
        if (i != 0) {
            bVar.mo158963v(1, i);
        }
    }
}
