package db3;

import bb3.C92230i;

/* renamed from: db3.n */
public class C97470n extends C92230i {

    /* renamed from: f */
    public final boolean f286085f;

    /* renamed from: g */
    public final boolean f286086g;

    public C97470n(int i, int i2, boolean z, boolean z2) {
        super(i, i2);
        this.f286085f = z;
        this.f286086g = z2;
    }

    /* renamed from: b */
    public int mo136735b() {
        return Math.abs(this.f263990e - this.f263989d);
    }

    /* renamed from: c */
    public boolean mo136736c(C92230i iVar) {
        if (iVar == null) {
            return false;
        }
        if (!iVar.mo126227a()) {
            return Math.max(this.f263989d, iVar.f263989d) < Math.min(this.f263990e, iVar.f263990e);
        }
        int i = iVar.f263989d;
        int i2 = this.f263989d;
        return (i >= i2 && iVar.f263990e < this.f263990e) || ((i >= i2 && iVar.f263990e <= this.f263990e) && this.f286086g);
    }
}
