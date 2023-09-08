package p558i0;

/* renamed from: i0.g */
public final class C108300g {

    /* renamed from: a */
    public final float f324275a;

    /* renamed from: b */
    public final float f324276b;

    /* renamed from: c */
    public final float f324277c;

    /* renamed from: d */
    public final float f324278d;

    public C108300g(float f, float f2, float f3, float f4) {
        this.f324275a = f;
        this.f324276b = f2;
        this.f324277c = f3;
        this.f324278d = f4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C108300g)) {
            return false;
        }
        C108300g gVar = (C108300g) obj;
        if (!(this.f324275a == gVar.f324275a)) {
            return false;
        }
        if (!(this.f324276b == gVar.f324276b)) {
            return false;
        }
        if (!(this.f324277c == gVar.f324277c)) {
            return false;
        }
        return (this.f324278d > gVar.f324278d ? 1 : (this.f324278d == gVar.f324278d ? 0 : -1)) == 0;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f324275a) * 31) + Float.floatToIntBits(this.f324276b)) * 31) + Float.floatToIntBits(this.f324277c)) * 31) + Float.floatToIntBits(this.f324278d);
    }

    public String toString() {
        return "RippleAlpha(draggedAlpha=" + this.f324275a + ", focusedAlpha=" + this.f324276b + ", hoveredAlpha=" + this.f324277c + ", pressedAlpha=" + this.f324278d + ')';
    }
}
