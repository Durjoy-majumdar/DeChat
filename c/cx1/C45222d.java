package cx1;

/* renamed from: cx1.d */
public final class C45222d {

    /* renamed from: a */
    public boolean f122552a;

    /* renamed from: b */
    public boolean f122553b;

    /* renamed from: c */
    public boolean f122554c;

    public C45222d() {
        this(true, false, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45222d)) {
            return false;
        }
        C45222d dVar = (C45222d) obj;
        return this.f122552a == dVar.f122552a && this.f122553b == dVar.f122553b && this.f122554c == dVar.f122554c;
    }

    public int hashCode() {
        boolean z = this.f122552a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f122553b;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f122554c;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "MyRoomFooterDataWrapper(isShowFooter=" + this.f122552a + ", isExpanded=" + this.f122553b + ", hasUnreadMsg=" + this.f122554c + ')';
    }

    public C45222d(boolean z, boolean z2, boolean z3) {
        this.f122552a = z;
        this.f122553b = z2;
        this.f122554c = z3;
    }
}
