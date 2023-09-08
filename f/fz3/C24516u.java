package fz3;

import gy3.C8480h;
import gy3.C87412m;
import java.util.Collection;
import nz3.C25269j;
import nz3.C25270k;

/* renamed from: fz3.u */
public final class C24516u {

    /* renamed from: a */
    public final C25270k f70073a;

    /* renamed from: b */
    public final Collection<C24498c> f70074b;

    /* renamed from: c */
    public final boolean f70075c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C24516u(C25270k kVar, Collection collection, boolean z, int i, C8480h hVar) {
        this(kVar, collection, (i & 4) != 0 ? kVar.f71752a == C25269j.NOT_NULL : z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24516u)) {
            return false;
        }
        C24516u uVar = (C24516u) obj;
        return C87412m.m108589b(this.f70073a, uVar.f70073a) && C87412m.m108589b(this.f70074b, uVar.f70074b) && this.f70075c == uVar.f70075c;
    }

    public int hashCode() {
        int hashCode = ((this.f70073a.hashCode() * 31) + this.f70074b.hashCode()) * 31;
        boolean z = this.f70075c;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f70073a + ", qualifierApplicabilityTypes=" + this.f70074b + ", definitelyNotNull=" + this.f70075c + ')';
    }

    public C24516u(C25270k kVar, Collection<? extends C24498c> collection, boolean z) {
        C87412m.m108594g(kVar, "nullabilityQualifier");
        C87412m.m108594g(collection, "qualifierApplicabilityTypes");
        this.f70073a = kVar;
        this.f70074b = collection;
        this.f70075c = z;
    }
}
