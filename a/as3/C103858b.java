package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.b */
public final class C103858b extends C108421e {

    /* renamed from: b */
    public String f306856b = "";

    /* renamed from: c */
    public int f306857c = 0;

    public C103858b() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        if (!this.f306856b.equals("")) {
            i = 0 + C108418b.m146887g(1, this.f306856b);
        }
        int i2 = this.f306857c;
        return i2 != 0 ? i + C108418b.m146882b(2, i2) : i;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                this.f306856b = aVar.mo158948j();
            } else if (k == 16) {
                this.f306857c = aVar.mo158946h();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f306856b.equals("")) {
            bVar.mo158961t(1, this.f306856b);
        }
        int i = this.f306857c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
    }
}
