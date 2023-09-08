package n14;

import fy3.C32226l;
import gy3.C87412m;
import java.util.ArrayList;
import n14.C25226j;
import rx3.C13598b0;
import sx3.C110823p;
import z04.C112551y;

/* renamed from: n14.h */
public final class C25222h {
    /* renamed from: a */
    public static final C25217e m32168a(String str, C25223i iVar, C25217e[] eVarArr, C32226l<? super C25203a, C13598b0> lVar) {
        C87412m.m108594g(str, "serialName");
        C87412m.m108594g(iVar, "kind");
        C87412m.m108594g(eVarArr, "typeParameters");
        C87412m.m108594g(lVar, "builder");
        if (!(!C112551y.m153811k(str))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        } else if (!C87412m.m108589b(iVar, C25226j.C25227a.f71696a)) {
            C25203a aVar = new C25203a(str);
            lVar.invoke(aVar);
            return new C25218f(str, iVar, ((ArrayList) aVar.f71663b).size(), C110823p.m151001a0(eVarArr), aVar);
        } else {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
    }
}
