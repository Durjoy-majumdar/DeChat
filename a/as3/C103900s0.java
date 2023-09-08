package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.s0 */
public final class C103900s0 extends C108421e {

    /* renamed from: h */
    public static volatile C103900s0[] f307154h;

    /* renamed from: b */
    public int f307155b = 0;

    /* renamed from: c */
    public String f307156c = "";

    /* renamed from: d */
    public int f307157d = 0;

    /* renamed from: e */
    public int f307158e = 0;

    /* renamed from: f */
    public int f307159f = 0;

    /* renamed from: g */
    public int f307160g = 0;

    public C103900s0() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = this.f307155b;
        int i2 = 0;
        if (i != 0) {
            i2 = 0 + C108418b.m146890j(1, i);
        }
        if (!this.f307156c.equals("")) {
            i2 += C108418b.m146887g(2, this.f307156c);
        }
        int i3 = this.f307157d;
        if (i3 != 0) {
            i2 += C108418b.m146890j(3, i3);
        }
        int i4 = this.f307158e;
        if (i4 != 0) {
            i2 += C108418b.m146890j(4, i4);
        }
        int i5 = this.f307159f;
        if (i5 != 0) {
            i2 += C108418b.m146890j(5, i5);
        }
        int i6 = this.f307160g;
        return i6 != 0 ? i2 + C108418b.m146890j(6, i6) : i2;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 8) {
                this.f307155b = aVar.mo158946h();
            } else if (k == 18) {
                this.f307156c = aVar.mo158948j();
            } else if (k == 24) {
                this.f307157d = aVar.mo158946h();
            } else if (k == 32) {
                this.f307158e = aVar.mo158946h();
            } else if (k == 40) {
                this.f307159f = aVar.mo158946h();
            } else if (k == 48) {
                this.f307160g = aVar.mo158946h();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        int i = this.f307155b;
        if (i != 0) {
            bVar.mo158963v(1, i);
        }
        if (!this.f307156c.equals("")) {
            bVar.mo158961t(2, this.f307156c);
        }
        int i2 = this.f307157d;
        if (i2 != 0) {
            bVar.mo158963v(3, i2);
        }
        int i3 = this.f307158e;
        if (i3 != 0) {
            bVar.mo158963v(4, i3);
        }
        int i4 = this.f307159f;
        if (i4 != 0) {
            bVar.mo158963v(5, i4);
        }
        int i5 = this.f307160g;
        if (i5 != 0) {
            bVar.mo158963v(6, i5);
        }
    }
}
