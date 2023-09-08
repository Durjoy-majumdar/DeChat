package w21;

import u21.C101955g;

/* renamed from: w21.l */
public class C102314l extends C101955g {

    /* renamed from: f */
    public final boolean f301331f;

    /* renamed from: g */
    public final boolean f301332g;

    public C102314l(int i, int i2, boolean z, boolean z2) {
        super(i, i2);
        this.f301331f = z;
        this.f301332g = z2;
    }

    /* renamed from: b */
    public int mo141863b() {
        return Math.abs(this.f300152e - this.f300151d);
    }

    /* renamed from: c */
    public boolean mo141864c(C101955g gVar) {
        if (gVar == null) {
            return false;
        }
        if (!gVar.mo141479a()) {
            return Math.max(this.f300151d, gVar.f300151d) < Math.min(this.f300152e, gVar.f300152e);
        }
        int i = gVar.f300151d;
        int i2 = this.f300151d;
        return (i >= i2 && gVar.f300152e < this.f300152e) || ((i >= i2 && gVar.f300152e <= this.f300152e) && this.f301332g);
    }
}
