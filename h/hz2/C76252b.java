package hz2;

import gy3.C87412m;
import uz2.C52718u;

/* renamed from: hz2.b */
public final class C76252b {
    /* renamed from: a */
    public static final boolean m91657a(C52718u uVar) {
        C87412m.m108594g(uVar, "<this>");
        return (uVar.f147249u & 1) != 0;
    }

    /* renamed from: b */
    public static final boolean m91658b(C52718u uVar) {
        C87412m.m108594g(uVar, "<this>");
        return (((uVar.f147249u & 8) > 0 ? 1 : ((uVar.f147249u & 8) == 0 ? 0 : -1)) != 0) && m91657a(uVar);
    }

    /* renamed from: c */
    public static final void m91659c(C52718u uVar) {
        C87412m.m108594g(uVar, "<this>");
        uVar.f147237f = 0;
        uVar.f147239h = "";
        uVar.f147241j = "";
        uVar.f147240i = "";
        uVar.f147242n = "";
        uVar.f147250v = 0;
        uVar.f147251w = 0;
    }

    /* renamed from: d */
    public static final void m91660d(C52718u uVar, boolean z) {
        C87412m.m108594g(uVar, "<this>");
        if (z) {
            uVar.f147249u |= 8;
        } else {
            uVar.f147249u &= -9;
        }
    }
}
