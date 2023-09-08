package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.f1 */
public final class C103872f1 extends C108421e {

    /* renamed from: g */
    public static volatile C103872f1[] f306991g;

    /* renamed from: b */
    public int f306992b = 0;

    /* renamed from: c */
    public int f306993c = 0;

    /* renamed from: d */
    public int f306994d = 0;

    /* renamed from: e */
    public int f306995e = 0;

    /* renamed from: f */
    public int f306996f = 0;

    public C103872f1() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = this.f306992b;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + C108418b.m146882b(1, i);
        }
        int i3 = this.f306993c;
        if (i3 != 0) {
            i2 += C108418b.m146882b(2, i3);
        }
        int i4 = this.f306994d;
        if (i4 != 0) {
            i2 += C108418b.m146882b(3, i4);
        }
        int i5 = this.f306995e;
        if (i5 != 0) {
            i2 += C108418b.m146882b(4, i5);
        }
        int i6 = this.f306996f;
        return i6 != 0 ? i2 + C108418b.m146882b(5, i6) : i2;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f306992b = aVar.mo158946h();
            } else if (k == 16) {
                this.f306993c = aVar.mo158946h();
            } else if (k == 24) {
                this.f306994d = aVar.mo158946h();
            } else if (k == 32) {
                this.f306995e = aVar.mo158946h();
            } else if (k == 40) {
                this.f306996f = aVar.mo158946h();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        int i = this.f306992b;
        if (i != 0) {
            bVar.mo158954m(1, i);
        }
        int i2 = this.f306993c;
        if (i2 != 0) {
            bVar.mo158954m(2, i2);
        }
        int i3 = this.f306994d;
        if (i3 != 0) {
            bVar.mo158954m(3, i3);
        }
        int i4 = this.f306995e;
        if (i4 != 0) {
            bVar.mo158954m(4, i4);
        }
        int i5 = this.f306996f;
        if (i5 != 0) {
            bVar.mo158954m(5, i5);
        }
    }
}
