package as3;

import p978i9.C108417a;
import p978i9.C108418b;
import p978i9.C108421e;

/* renamed from: as3.w */
public final class C103907w extends C108421e {

    /* renamed from: b */
    public String f307205b = "";

    /* renamed from: c */
    public int f307206c = 0;

    /* renamed from: d */
    public int f307207d = 0;

    /* renamed from: e */
    public int f307208e = 0;

    /* renamed from: f */
    public int f307209f = 0;

    /* renamed from: g */
    public int f307210g = 0;

    /* renamed from: h */
    public int f307211h = 0;

    public C103907w() {
        this.f324643a = -1;
    }

    /* renamed from: a */
    public int mo145537a() {
        int i = 0;
        if (!this.f307205b.equals("")) {
            i = 0 + C108418b.m146887g(2, this.f307205b);
        }
        int i2 = this.f307206c;
        if (i2 != 0) {
            i += C108418b.m146882b(3, i2);
        }
        int i3 = this.f307207d;
        if (i3 != 0) {
            i += C108418b.m146890j(4, i3);
        }
        int i4 = this.f307208e;
        if (i4 != 0) {
            i += C108418b.m146882b(5, i4);
        }
        int i5 = this.f307209f;
        if (i5 != 0) {
            i += C108418b.m146882b(6, i5);
        }
        int i6 = this.f307210g;
        if (i6 != 0) {
            i += C108418b.m146890j(7, i6);
        }
        int i7 = this.f307211h;
        return i7 != 0 ? i + C108418b.m146890j(8, i7) : i;
    }

    /* renamed from: b */
    public C108421e mo145538b(C108417a aVar) {
        while (true) {
            int k = aVar.mo158949k();
            if (k == 0) {
                break;
            } else if (k == 18) {
                this.f307205b = aVar.mo158948j();
            } else if (k == 24) {
                this.f307206c = aVar.mo158946h();
            } else if (k == 32) {
                this.f307207d = aVar.mo158946h();
            } else if (k == 40) {
                this.f307208e = aVar.mo158946h();
            } else if (k == 48) {
                this.f307209f = aVar.mo158946h();
            } else if (k == 56) {
                this.f307210g = aVar.mo158946h();
            } else if (k == 64) {
                this.f307211h = aVar.mo158946h();
            } else if (!aVar.mo158951m(k)) {
                break;
            }
        }
        return this;
    }

    /* renamed from: e */
    public void mo145539e(C108418b bVar) {
        if (!this.f307205b.equals("")) {
            bVar.mo158961t(2, this.f307205b);
        }
        int i = this.f307206c;
        if (i != 0) {
            bVar.mo158954m(3, i);
        }
        int i2 = this.f307207d;
        if (i2 != 0) {
            bVar.mo158963v(4, i2);
        }
        int i3 = this.f307208e;
        if (i3 != 0) {
            bVar.mo158954m(5, i3);
        }
        int i4 = this.f307209f;
        if (i4 != 0) {
            bVar.mo158954m(6, i4);
        }
        int i5 = this.f307210g;
        if (i5 != 0) {
            bVar.mo158963v(7, i5);
        }
        int i6 = this.f307211h;
        if (i6 != 0) {
            bVar.mo158963v(8, i6);
        }
    }
}
