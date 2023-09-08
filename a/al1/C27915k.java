package al1;

import gy3.C87412m;
import te3.C48770aw0;

/* renamed from: al1.k */
public final class C27915k {

    /* renamed from: a */
    public final int f77102a;

    /* renamed from: b */
    public C48770aw0 f77103b;

    public C27915k() {
        this(0, (C48770aw0) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27915k)) {
            return false;
        }
        C27915k kVar = (C27915k) obj;
        return this.f77102a == kVar.f77102a && C87412m.m108589b(this.f77103b, kVar.f77103b);
    }

    public int hashCode() {
        int i = this.f77102a * 31;
        C48770aw0 aw02 = this.f77103b;
        return i + (aw02 == null ? 0 : aw02.hashCode());
    }

    public String toString() {
        return "FinderLiveLinkMicUserDesc(descType=" + this.f77102a + ", badgeInfo=" + this.f77103b + ')';
    }

    public C27915k(int i, C48770aw0 aw02) {
        this.f77102a = i;
        this.f77103b = aw02;
    }
}
