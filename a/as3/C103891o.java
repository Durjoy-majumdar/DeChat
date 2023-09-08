package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.o */
public final class C103891o extends C108421e {

    /* renamed from: e */
    public static volatile C103891o[] f307113e;

    /* renamed from: b */
    public int f307114b = 0;

    /* renamed from: c */
    public String f307115c = "";

    /* renamed from: d */
    public String f307116d = "";

    public C103891o() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = this.f307114b;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + C108418b.m146890j(1, i);
        }
        if (!this.f307115c.equals("")) {
            i2 += C108418b.m146887g(2, this.f307115c);
        }
        return !this.f307116d.equals("") ? i2 + C108418b.m146887g(3, this.f307116d) : i2;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307114b = aVar.mo158946h();
            } else if (k == 18) {
                this.f307115c = aVar.mo158948j();
            } else if (k == 26) {
                this.f307116d = aVar.mo158948j();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        int i = this.f307114b;
        if (i != 0) {
            bVar.mo158963v(1, i);
        }
        if (!this.f307115c.equals("")) {
            bVar.mo158961t(2, this.f307115c);
        }
        if (!this.f307116d.equals("")) {
            bVar.mo158961t(3, this.f307116d);
        }
    }
}
