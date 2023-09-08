package nz3;

import gy3.C87412m;

/* renamed from: nz3.k */
public final class C25270k {

    /* renamed from: a */
    public final C25269j f71752a;

    /* renamed from: b */
    public final boolean f71753b;

    public C25270k(C25269j jVar, boolean z) {
        C87412m.m108594g(jVar, "qualifier");
        this.f71752a = jVar;
        this.f71753b = z;
    }

    /* renamed from: a */
    public static C25270k m32202a(C25270k kVar, C25269j jVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            jVar = kVar.f71752a;
        }
        if ((i & 2) != 0) {
            z = kVar.f71753b;
        }
        kVar.getClass();
        C87412m.m108594g(jVar, "qualifier");
        return new C25270k(jVar, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25270k)) {
            return false;
        }
        C25270k kVar = (C25270k) obj;
        return this.f71752a == kVar.f71752a && this.f71753b == kVar.f71753b;
    }

    public int hashCode() {
        int hashCode = this.f71752a.hashCode() * 31;
        boolean z = this.f71753b;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f71752a + ", isForWarningOnly=" + this.f71753b + ')';
    }
}
