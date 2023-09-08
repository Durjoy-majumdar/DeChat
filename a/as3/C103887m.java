package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.m */
public final class C103887m extends C108421e {

    /* renamed from: b */
    public String f307074b = "";

    /* renamed from: c */
    public int f307075c = 0;

    /* renamed from: d */
    public long f307076d = 0;

    /* renamed from: e */
    public int f307077e = -1;

    /* renamed from: f */
    public int f307078f = 0;

    /* renamed from: g */
    public int f307079g = 0;

    /* renamed from: h */
    public int f307080h = 0;

    public C103887m() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        if (!this.f307074b.equals("")) {
            i = 0 + C108418b.m146887g(1, this.f307074b);
        }
        int i2 = this.f307075c;
        if (i2 != 0) {
            i += C108418b.m146882b(2, i2);
        }
        long j = this.f307076d;
        if (j != 0) {
            i += C108418b.m146883c(3, j);
        }
        int i3 = this.f307077e;
        if (i3 != -1) {
            i += C108418b.m146882b(4, i3);
        }
        int i4 = this.f307078f;
        if (i4 != 0) {
            i += C108418b.m146890j(5, i4);
        }
        int i5 = this.f307079g;
        if (i5 != 0) {
            i += C108418b.m146890j(6, i5);
        }
        int i6 = this.f307080h;
        return i6 != 0 ? i + C108418b.m146882b(7, i6) : i;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                this.f307074b = aVar.mo158948j();
            } else if (k == 16) {
                this.f307075c = aVar.mo158946h();
            } else if (k == 24) {
                this.f307076d = aVar.mo158947i();
            } else if (k == 32) {
                this.f307077e = aVar.mo158946h();
            } else if (k == 40) {
                this.f307078f = aVar.mo158946h();
            } else if (k == 48) {
                this.f307079g = aVar.mo158946h();
            } else if (k == 56) {
                int h = aVar.mo158946h();
                if (h == 0 || h == 1) {
                    this.f307080h = h;
                }
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f307074b.equals("")) {
            bVar.mo158961t(1, this.f307074b);
        }
        int i = this.f307075c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f307076d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
        int i2 = this.f307077e;
        if (i2 != -1) {
            bVar.mo158954m(4, i2);
        }
        int i3 = this.f307078f;
        if (i3 != 0) {
            bVar.mo158963v(5, i3);
        }
        int i4 = this.f307079g;
        if (i4 != 0) {
            bVar.mo158963v(6, i4);
        }
        int i5 = this.f307080h;
        if (i5 != 0) {
            bVar.mo158954m(7, i5);
        }
    }
}
