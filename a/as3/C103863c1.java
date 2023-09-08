package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108419c;
import p978i9.C108421e;

/* renamed from: as3.c1 */
public final class C103863c1 extends C108421e {

    /* renamed from: h */
    public static volatile C103863c1[] f306939h;

    /* renamed from: b */
    public int f306940b = 0;

    /* renamed from: c */
    public String f306941c = "";

    /* renamed from: d */
    public String f306942d = "";

    /* renamed from: e */
    public long f306943e = 0;

    /* renamed from: f */
    public String f306944f = "";

    /* renamed from: g */
    public String f306945g = "";

    public C103863c1() {
        this.f324643a = -1;
    }

    /* renamed from: f */
    public static C103863c1[] m138446f() {
        if (f306939h == null) {
            synchronized (C108419c.f324642a) {
                if (f306939h == null) {
                    f306939h = new C103863c1[0];
                }
            }
        }
        return f306939h;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = this.f306940b;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + C108418b.m146890j(1, i);
        }
        if (!this.f306941c.equals("")) {
            i2 += C108418b.m146887g(2, this.f306941c);
        }
        if (!this.f306942d.equals("")) {
            i2 += C108418b.m146887g(3, this.f306942d);
        }
        long j = this.f306943e;
        if (j != 0) {
            i2 += C108418b.m146891k(4, j);
        }
        if (!this.f306944f.equals("")) {
            i2 += C108418b.m146887g(5, this.f306944f);
        }
        return !this.f306945g.equals("") ? i2 + C108418b.m146887g(6, this.f306945g) : i2;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f306940b = aVar.mo158946h();
            } else if (k == 18) {
                this.f306941c = aVar.mo158948j();
            } else if (k == 26) {
                this.f306942d = aVar.mo158948j();
            } else if (k == 32) {
                this.f306943e = aVar.mo158947i();
            } else if (k == 42) {
                this.f306944f = aVar.mo158948j();
            } else if (k == 50) {
                this.f306945g = aVar.mo158948j();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        int i = this.f306940b;
        if (i != 0) {
            bVar.mo158963v(1, i);
        }
        if (!this.f306941c.equals("")) {
            bVar.mo158961t(2, this.f306941c);
        }
        if (!this.f306942d.equals("")) {
            bVar.mo158961t(3, this.f306942d);
        }
        long j = this.f306943e;
        if (j != 0) {
            bVar.mo158964w(4, j);
        }
        if (!this.f306944f.equals("")) {
            bVar.mo158961t(5, this.f306944f);
        }
        if (!this.f306945g.equals("")) {
            bVar.mo158961t(6, this.f306945g);
        }
    }
}
