package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.g */
public final class C103873g extends C108421e {

    /* renamed from: b */
    public String f306997b = "";

    /* renamed from: c */
    public int f306998c = 0;

    /* renamed from: d */
    public long f306999d = 0;

    /* renamed from: e */
    public int f307000e = 0;

    /* renamed from: f */
    public String f307001f = "";

    public C103873g() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        if (!this.f306997b.equals("")) {
            i = 0 + C108418b.m146887g(1, this.f306997b);
        }
        int i2 = this.f306998c;
        if (i2 != 0) {
            i += C108418b.m146882b(2, i2);
        }
        long j = this.f306999d;
        if (j != 0) {
            i += C108418b.m146883c(3, j);
        }
        int i3 = this.f307000e;
        if (i3 != 0) {
            i += C108418b.m146882b(4, i3);
        }
        return !this.f307001f.equals("") ? i + C108418b.m146887g(5, this.f307001f) : i;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                this.f306997b = aVar.mo158948j();
            } else if (k == 16) {
                this.f306998c = aVar.mo158946h();
            } else if (k == 24) {
                this.f306999d = aVar.mo158947i();
            } else if (k == 32) {
                this.f307000e = aVar.mo158946h();
            } else if (k == 42) {
                this.f307001f = aVar.mo158948j();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f306997b.equals("")) {
            bVar.mo158961t(1, this.f306997b);
        }
        int i = this.f306998c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f306999d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
        int i2 = this.f307000e;
        if (i2 != 0) {
            bVar.mo158954m(4, i2);
        }
        if (!this.f307001f.equals("")) {
            bVar.mo158961t(5, this.f307001f);
        }
    }
}
