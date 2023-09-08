package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.k */
public final class C103883k extends C108421e {

    /* renamed from: b */
    public int f307047b = 0;

    /* renamed from: c */
    public int f307048c = 0;

    /* renamed from: d */
    public long f307049d = 0;

    /* renamed from: e */
    public String f307050e = "";

    /* renamed from: f */
    public long f307051f = 0;

    /* renamed from: g */
    public String f307052g = "";

    /* renamed from: h */
    public int f307053h = 0;

    /* renamed from: i */
    public String f307054i = "";

    /* renamed from: j */
    public String f307055j = "";

    public C103883k() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int j = 0 + C108418b.m146890j(1, this.f307047b) + C108418b.m146882b(2, this.f307048c) + C108418b.m146883c(3, this.f307049d);
        if (!this.f307050e.equals("")) {
            j += C108418b.m146887g(4, this.f307050e);
        }
        long j2 = this.f307051f;
        if (j2 != 0) {
            j += C108418b.m146891k(5, j2);
        }
        if (!this.f307052g.equals("")) {
            j += C108418b.m146887g(6, this.f307052g);
        }
        int i = this.f307053h;
        if (i != 0) {
            j += C108418b.m146890j(7, i);
        }
        if (!this.f307054i.equals("")) {
            j += C108418b.m146887g(8, this.f307054i);
        }
        return !this.f307055j.equals("") ? j + C108418b.m146887g(9, this.f307055j) : j;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307047b = aVar.mo158946h();
            } else if (k == 16) {
                this.f307048c = aVar.mo158946h();
            } else if (k == 24) {
                this.f307049d = aVar.mo158947i();
            } else if (k == 34) {
                this.f307050e = aVar.mo158948j();
            } else if (k == 40) {
                this.f307051f = aVar.mo158947i();
            } else if (k == 50) {
                this.f307052g = aVar.mo158948j();
            } else if (k == 56) {
                this.f307053h = aVar.mo158946h();
            } else if (k == 66) {
                this.f307054i = aVar.mo158948j();
            } else if (k == 74) {
                this.f307055j = aVar.mo158948j();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        bVar.mo158963v(1, this.f307047b);
        bVar.mo158954m(2, this.f307048c);
        bVar.mo158955n(3, this.f307049d);
        if (!this.f307050e.equals("")) {
            bVar.mo158961t(4, this.f307050e);
        }
        long j = this.f307051f;
        if (j != 0) {
            bVar.mo158964w(5, j);
        }
        if (!this.f307052g.equals("")) {
            bVar.mo158961t(6, this.f307052g);
        }
        int i = this.f307053h;
        if (i != 0) {
            bVar.mo158963v(7, i);
        }
        if (!this.f307054i.equals("")) {
            bVar.mo158961t(8, this.f307054i);
        }
        if (!this.f307055j.equals("")) {
            bVar.mo158961t(9, this.f307055j);
        }
    }
}
