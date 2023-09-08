package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.h */
public final class C103876h extends C108421e {

    /* renamed from: b */
    public int f307006b = 0;

    /* renamed from: c */
    public long f307007c = 0;

    /* renamed from: d */
    public String f307008d = "";

    /* renamed from: e */
    public String f307009e = "";

    /* renamed from: f */
    public long f307010f = 0;

    public C103876h() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int b = 0 + C108418b.m146882b(1, this.f307006b) + C108418b.m146883c(2, this.f307007c) + C108418b.m146887g(3, this.f307008d);
        if (!this.f307009e.equals("")) {
            b += C108418b.m146887g(4, this.f307009e);
        }
        long j = this.f307010f;
        return j != 0 ? b + C108418b.m146891k(5, j) : b;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307006b = aVar.mo158946h();
            } else if (k == 16) {
                this.f307007c = aVar.mo158947i();
            } else if (k == 26) {
                this.f307008d = aVar.mo158948j();
            } else if (k == 34) {
                this.f307009e = aVar.mo158948j();
            } else if (k == 40) {
                this.f307010f = aVar.mo158947i();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        bVar.mo158954m(1, this.f307006b);
        bVar.mo158955n(2, this.f307007c);
        bVar.mo158961t(3, this.f307008d);
        if (!this.f307009e.equals("")) {
            bVar.mo158961t(4, this.f307009e);
        }
        long j = this.f307010f;
        if (j != 0) {
            bVar.mo158964w(5, j);
        }
    }
}
