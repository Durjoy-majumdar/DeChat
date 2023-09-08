package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108419c;
import p978i9.C108421e;

/* renamed from: as3.q */
public final class C103895q extends C108421e {

    /* renamed from: e */
    public static volatile C103895q[] f307126e;

    /* renamed from: b */
    public int f307127b = 0;

    /* renamed from: c */
    public int f307128c = 0;

    /* renamed from: d */
    public String f307129d = "";

    public C103895q() {
        this.f324643a = -1;
    }

    /* renamed from: f */
    public static C103895q[] m138543f() {
        if (f307126e == null) {
            synchronized (C108419c.f324642a) {
                if (f307126e == null) {
                    f307126e = new C103895q[0];
                }
            }
        }
        return f307126e;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = this.f307127b;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + C108418b.m146890j(1, i);
        }
        int i3 = this.f307128c;
        if (i3 != 0) {
            i2 += C108418b.m146882b(2, i3);
        }
        return !this.f307129d.equals("") ? i2 + C108418b.m146887g(3, this.f307129d) : i2;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307127b = aVar.mo158946h();
            } else if (k == 16) {
                this.f307128c = aVar.mo158946h();
            } else if (k == 26) {
                this.f307129d = aVar.mo158948j();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        int i = this.f307127b;
        if (i != 0) {
            bVar.mo158963v(1, i);
        }
        int i2 = this.f307128c;
        if (i2 != 0) {
            bVar.mo158954m(2, i2);
        }
        if (!this.f307129d.equals("")) {
            bVar.mo158961t(3, this.f307129d);
        }
    }
}
