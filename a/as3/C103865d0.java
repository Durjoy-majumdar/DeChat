package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.d0 */
public final class C103865d0 extends C108421e {

    /* renamed from: b */
    public String f306958b = "";

    /* renamed from: c */
    public int f306959c = 0;

    /* renamed from: d */
    public long f306960d = 0;

    public C103865d0() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        if (!this.f306958b.equals("")) {
            i = 0 + C108418b.m146887g(1, this.f306958b);
        }
        int i2 = this.f306959c;
        if (i2 != 0) {
            i += C108418b.m146882b(2, i2);
        }
        long j = this.f306960d;
        return j != 0 ? i + C108418b.m146883c(3, j) : i;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                this.f306958b = aVar.mo158948j();
            } else if (k == 16) {
                this.f306959c = aVar.mo158946h();
            } else if (k == 24) {
                this.f306960d = aVar.mo158947i();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f306958b.equals("")) {
            bVar.mo158961t(1, this.f306958b);
        }
        int i = this.f306959c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f306960d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
    }
}
