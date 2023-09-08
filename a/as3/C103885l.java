package as3;

import java.util.Arrays;
import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;
import p978i9.C108422g;

/* renamed from: as3.l */
public final class C103885l extends C108421e {

    /* renamed from: b */
    public String f307067b = "";

    /* renamed from: c */
    public int f307068c = 0;

    /* renamed from: d */
    public long f307069d = 0;

    /* renamed from: e */
    public C103875g1 f307070e = null;

    /* renamed from: f */
    public int f307071f = 0;

    /* renamed from: g */
    public byte[] f307072g = C108422g.f324646c;

    public C103885l() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        if (!this.f307067b.equals("")) {
            i = 0 + C108418b.m146887g(1, this.f307067b);
        }
        int i2 = this.f307068c;
        if (i2 != 0) {
            i += C108418b.m146882b(2, i2);
        }
        long j = this.f307069d;
        if (j != 0) {
            i += C108418b.m146883c(3, j);
        }
        C103875g1 g1Var = this.f307070e;
        if (g1Var != null) {
            i += C108418b.m146884d(4, g1Var);
        }
        int i3 = this.f307071f;
        if (i3 != 0) {
            i += C108418b.m146890j(5, i3);
        }
        return !Arrays.equals(this.f307072g, C108422g.f324646c) ? i + C108418b.m146881a(200, this.f307072g) : i;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 10) {
                this.f307067b = aVar.mo158948j();
            } else if (k == 16) {
                this.f307068c = aVar.mo158946h();
            } else if (k == 24) {
                this.f307069d = aVar.mo158947i();
            } else if (k == 34) {
                if (this.f307070e == null) {
                    this.f307070e = new C103875g1();
                }
                aVar.mo158943e(this.f307070e);
            } else if (k == 40) {
                this.f307071f = aVar.mo158946h();
            } else if (k == 1602) {
                this.f307072g = aVar.mo158942d();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f307067b.equals("")) {
            bVar.mo158961t(1, this.f307067b);
        }
        int i = this.f307068c;
        if (i != 0) {
            bVar.mo158954m(2, i);
        }
        long j = this.f307069d;
        if (j != 0) {
            bVar.mo158955n(3, j);
        }
        C103875g1 g1Var = this.f307070e;
        if (g1Var != null) {
            bVar.mo158956o(4, g1Var);
        }
        int i2 = this.f307071f;
        if (i2 != 0) {
            bVar.mo158963v(5, i2);
        }
        if (!Arrays.equals(this.f307072g, C108422g.f324646c)) {
            bVar.mo158953l(200, this.f307072g);
        }
    }
}
