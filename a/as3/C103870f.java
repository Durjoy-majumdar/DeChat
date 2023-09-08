package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.f */
public final class C103870f extends C108421e {

    /* renamed from: b */
    public String f306982b = "";

    /* renamed from: c */
    public int f306983c = 0;

    /* renamed from: d */
    public long f306984d = 0;

    /* renamed from: e */
    public int f306985e = 0;

    /* renamed from: f */
    public int f306986f = 0;

    public C103870f() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        if (!this.f306982b.equals("")) {
            i = 0 + C108418b.m146887g(1, this.f306982b);
        }
        int i2 = this.f306983c;
        if (i2 != 0) {
            i += C108418b.m146882b(2, i2);
        }
        long j = this.f306984d;
        if (j != 0) {
            i += C108418b.m146883c(3, j);
        }
        int i3 = this.f306985e;
        if (i3 != 0) {
            i += C108418b.m146882b(4, i3);
        }
        int i4 = this.f306986f;
        return i4 != 0 ? i + C108418b.m146882b(5, i4) : i;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                this.f306982b = aVar.mo158948j();
            } else if (k == 16) {
                this.f306983c = aVar.mo158946h();
            } else if (k == 24) {
                this.f306984d = aVar.mo158947i();
            } else if (k == 32) {
                this.f306985e = aVar.mo158946h();
            } else if (k == 40) {
                this.f306986f = aVar.mo158946h();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f306982b.equals("")) {
            bVar.mo158961t(1, this.f306982b);
        }
        int i = this.f306983c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f306984d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
        int i2 = this.f306985e;
        if (i2 != 0) {
            bVar.mo158954m(4, i2);
        }
        int i3 = this.f306986f;
        if (i3 != 0) {
            bVar.mo158954m(5, i3);
        }
    }
}
