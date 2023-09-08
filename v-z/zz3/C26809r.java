package zz3;

import gy3.C87412m;
import n04.C25134i1;
import n04.C25143j0;
import o04.C25320d;
import o04.C25323e;
import q04.C25526i;

/* renamed from: zz3.r */
public final class C26809r extends C25134i1 {

    /* renamed from: i */
    public final /* synthetic */ C26810s f74549i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26809r(boolean z, boolean z2, C26810s sVar, C25320d dVar, C25323e eVar) {
        super(z, z2, true, sVar, dVar, eVar);
        this.f74549i = sVar;
    }

    /* renamed from: b */
    public boolean mo52282b(C25526i iVar, C25526i iVar2) {
        C87412m.m108594g(iVar, "subType");
        C87412m.m108594g(iVar2, "superType");
        if (!(iVar instanceof C25143j0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (iVar2 instanceof C25143j0) {
            return this.f74549i.f74554e.invoke(iVar, iVar2).booleanValue();
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
