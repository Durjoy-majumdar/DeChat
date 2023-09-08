package sz3;

import gy3.C87412m;
import qz3.C26041i;
import qz3.C26052n;
import qz3.C26065q;
import qz3.C26082u;

/* renamed from: sz3.f */
public final class C26246f {
    /* renamed from: a */
    public static final C26065q m33735a(C26065q qVar, C26247g gVar) {
        C87412m.m108594g(qVar, "<this>");
        C87412m.m108594g(gVar, "typeTable");
        int i = qVar.f72765f;
        boolean z = true;
        if ((i & 256) == 256) {
            return qVar.f72775s;
        }
        if ((i & 512) != 512) {
            z = false;
        }
        if (z) {
            return gVar.mo53147a(qVar.f72776t);
        }
        return null;
    }

    /* renamed from: b */
    public static final C26065q m33736b(C26041i iVar, C26247g gVar) {
        C87412m.m108594g(iVar, "<this>");
        C87412m.m108594g(gVar, "typeTable");
        int i = iVar.f72623f;
        boolean z = true;
        if ((i & 32) == 32) {
            return iVar.f72630p;
        }
        if ((i & 64) != 64) {
            z = false;
        }
        if (z) {
            return gVar.mo53147a(iVar.f72631q);
        }
        return null;
    }

    /* renamed from: c */
    public static final C26065q m33737c(C26041i iVar, C26247g gVar) {
        C87412m.m108594g(iVar, "<this>");
        C87412m.m108594g(gVar, "typeTable");
        int i = iVar.f72623f;
        boolean z = true;
        if ((i & 8) == 8) {
            C26065q qVar = iVar.f72627j;
            C87412m.m108593f(qVar, "returnType");
            return qVar;
        }
        if ((i & 16) != 16) {
            z = false;
        }
        if (z) {
            return gVar.mo53147a(iVar.f72628n);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
    }

    /* renamed from: d */
    public static final C26065q m33738d(C26052n nVar, C26247g gVar) {
        C87412m.m108594g(nVar, "<this>");
        C87412m.m108594g(gVar, "typeTable");
        int i = nVar.f72695f;
        boolean z = true;
        if ((i & 8) == 8) {
            C26065q qVar = nVar.f72699j;
            C87412m.m108593f(qVar, "returnType");
            return qVar;
        }
        if ((i & 16) != 16) {
            z = false;
        }
        if (z) {
            return gVar.mo53147a(nVar.f72700n);
        }
        throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
    }

    /* renamed from: e */
    public static final C26065q m33739e(C26082u uVar, C26247g gVar) {
        C87412m.m108594g(uVar, "<this>");
        C87412m.m108594g(gVar, "typeTable");
        int i = uVar.f72880f;
        boolean z = true;
        if ((i & 4) == 4) {
            C26065q qVar = uVar.f72883i;
            C87412m.m108593f(qVar, "type");
            return qVar;
        }
        if ((i & 8) != 8) {
            z = false;
        }
        if (z) {
            return gVar.mo53147a(uVar.f72884j);
        }
        throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
    }
}
