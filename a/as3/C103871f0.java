package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.f0 */
public final class C103871f0 extends C108421e {

    /* renamed from: b */
    public String f306987b = "";

    /* renamed from: c */
    public int f306988c = 0;

    /* renamed from: d */
    public long f306989d = 0;

    /* renamed from: e */
    public String f306990e = "";

    public C103871f0() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        if (!this.f306987b.equals("")) {
            i = 0 + C108418b.m146887g(1, this.f306987b);
        }
        int i2 = this.f306988c;
        if (i2 != 0) {
            i += C108418b.m146882b(2, i2);
        }
        long j = this.f306989d;
        if (j != 0) {
            i += C108418b.m146883c(3, j);
        }
        return !this.f306990e.equals("") ? i + C108418b.m146887g(4, this.f306990e) : i;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                this.f306987b = aVar.mo158948j();
            } else if (k == 16) {
                this.f306988c = aVar.mo158946h();
            } else if (k == 24) {
                this.f306989d = aVar.mo158947i();
            } else if (k == 34) {
                this.f306990e = aVar.mo158948j();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f306987b.equals("")) {
            bVar.mo158961t(1, this.f306987b);
        }
        int i = this.f306988c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f306989d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
        if (!this.f306990e.equals("")) {
            bVar.mo158961t(4, this.f306990e);
        }
    }
}
