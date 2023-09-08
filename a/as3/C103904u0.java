package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.u0 */
public final class C103904u0 extends C108421e {

    /* renamed from: f */
    public static volatile C103904u0[] f307178f;

    /* renamed from: b */
    public int f307179b = 0;

    /* renamed from: c */
    public int f307180c = 0;

    /* renamed from: d */
    public int f307181d = 0;

    /* renamed from: e */
    public int f307182e = 0;

    public C103904u0() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = this.f307179b;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + C108418b.m146882b(1, i);
        }
        int i3 = this.f307180c;
        if (i3 != 0) {
            i2 += C108418b.m146882b(2, i3);
        }
        int i4 = this.f307181d;
        if (i4 != 0) {
            i2 += C108418b.m146882b(3, i4);
        }
        int i5 = this.f307182e;
        return i5 != 0 ? i2 + C108418b.m146882b(4, i5) : i2;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307179b = aVar.mo158946h();
            } else if (k == 16) {
                this.f307180c = aVar.mo158946h();
            } else if (k == 24) {
                this.f307181d = aVar.mo158946h();
            } else if (k == 32) {
                this.f307182e = aVar.mo158946h();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        int i = this.f307179b;
        if (i != 0) {
            bVar.mo158954m(1, i);
        }
        int i2 = this.f307180c;
        if (i2 != 0) {
            bVar.mo158954m(2, i2);
        }
        int i3 = this.f307181d;
        if (i3 != 0) {
            bVar.mo158954m(3, i3);
        }
        int i4 = this.f307182e;
        if (i4 != 0) {
            bVar.mo158954m(4, i4);
        }
    }
}
