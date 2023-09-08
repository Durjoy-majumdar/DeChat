package kz3;

import gy3.C8480h;
import gy3.C87412m;
import gz3.C24597k;
import java.util.Set;
import n04.C25176s0;
import wy3.C26446d1;

/* renamed from: kz3.a */
public final class C24859a {

    /* renamed from: a */
    public final C24597k f70844a;

    /* renamed from: b */
    public final C24860b f70845b;

    /* renamed from: c */
    public final boolean f70846c;

    /* renamed from: d */
    public final Set<C26446d1> f70847d;

    /* renamed from: e */
    public final C25176s0 f70848e;

    public C24859a(C24597k kVar, C24860b bVar, boolean z, Set<? extends C26446d1> set, C25176s0 s0Var) {
        C87412m.m108594g(kVar, "howThisTypeIsUsed");
        C87412m.m108594g(bVar, "flexibility");
        this.f70844a = kVar;
        this.f70845b = bVar;
        this.f70846c = z;
        this.f70847d = set;
        this.f70848e = s0Var;
    }

    /* renamed from: a */
    public static C24859a m31338a(C24859a aVar, C24597k kVar, C24860b bVar, boolean z, Set<C26446d1> set, C25176s0 s0Var, int i, Object obj) {
        if ((i & 1) != 0) {
            kVar = aVar.f70844a;
        }
        if ((i & 2) != 0) {
            bVar = aVar.f70845b;
        }
        C24860b bVar2 = bVar;
        if ((i & 4) != 0) {
            z = aVar.f70846c;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            set = aVar.f70847d;
        }
        Set<C26446d1> set2 = set;
        if ((i & 16) != 0) {
            s0Var = aVar.f70848e;
        }
        C25176s0 s0Var2 = s0Var;
        aVar.getClass();
        C87412m.m108594g(kVar, "howThisTypeIsUsed");
        C87412m.m108594g(bVar2, "flexibility");
        return new C24859a(kVar, bVar2, z2, set2, s0Var2);
    }

    /* renamed from: b */
    public final C24859a mo51862b(C24860b bVar) {
        C87412m.m108594g(bVar, "flexibility");
        return m31338a(this, (C24597k) null, bVar, false, (Set) null, (C25176s0) null, 29, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24859a)) {
            return false;
        }
        C24859a aVar = (C24859a) obj;
        return this.f70844a == aVar.f70844a && this.f70845b == aVar.f70845b && this.f70846c == aVar.f70846c && C87412m.m108589b(this.f70847d, aVar.f70847d) && C87412m.m108589b(this.f70848e, aVar.f70848e);
    }

    public int hashCode() {
        int hashCode = ((this.f70844a.hashCode() * 31) + this.f70845b.hashCode()) * 31;
        boolean z = this.f70846c;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        Set<C26446d1> set = this.f70847d;
        int i2 = 0;
        int hashCode2 = (i + (set == null ? 0 : set.hashCode())) * 31;
        C25176s0 s0Var = this.f70848e;
        if (s0Var != null) {
            i2 = s0Var.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f70844a + ", flexibility=" + this.f70845b + ", isForAnnotationParameter=" + this.f70846c + ", visitedTypeParameters=" + this.f70847d + ", defaultType=" + this.f70848e + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C24859a(C24597k kVar, C24860b bVar, boolean z, Set set, C25176s0 s0Var, int i, C8480h hVar) {
        this(kVar, (i & 2) != 0 ? C24860b.INFLEXIBLE : bVar, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : set, (i & 16) != 0 ? null : s0Var);
    }
}
