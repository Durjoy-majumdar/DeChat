package p835c1;

import gy3.C8480h;
import gy3.C87412m;
import p436a1.C103244k0;
import p436a1.C103275x0;
import p436a1.C103277y0;

/* renamed from: c1.k */
public final class C104237k extends C104233g {

    /* renamed from: a */
    public final float f308531a;

    /* renamed from: b */
    public final float f308532b;

    /* renamed from: c */
    public final int f308533c;

    /* renamed from: d */
    public final int f308534d;

    /* renamed from: e */
    public final C103244k0 f308535e;

    public C104237k(float f, float f2, int i, int i2, C103244k0 k0Var, int i3, C8480h hVar) {
        f = (i3 & 1) != 0 ? 0.0f : f;
        f2 = (i3 & 2) != 0 ? 4.0f : f2;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        k0Var = (i3 & 16) != 0 ? null : k0Var;
        this.f308531a = f;
        this.f308532b = f2;
        this.f308533c = i;
        this.f308534d = i2;
        this.f308535e = k0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C104237k)) {
            return false;
        }
        C104237k kVar = (C104237k) obj;
        if (!(this.f308531a == kVar.f308531a)) {
            return false;
        }
        if (!(this.f308532b == kVar.f308532b)) {
            return false;
        }
        if (!(this.f308533c == kVar.f308533c)) {
            return false;
        }
        return (this.f308534d == kVar.f308534d) && C87412m.m108589b(this.f308535e, kVar.f308535e);
    }

    public int hashCode() {
        int floatToIntBits = ((((((Float.floatToIntBits(this.f308531a) * 31) + Float.floatToIntBits(this.f308532b)) * 31) + this.f308533c) * 31) + this.f308534d) * 31;
        C103244k0 k0Var = this.f308535e;
        return floatToIntBits + (k0Var != null ? k0Var.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.f308531a + ", miter=" + this.f308532b + ", cap=" + C103275x0.m136789a(this.f308533c) + ", join=" + C103277y0.m136797a(this.f308534d) + ", pathEffect=" + this.f308535e + ')';
    }
}
