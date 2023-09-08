package vj2;

import gy3.C87412m;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C89349b;
import ve3.C52852s0;
import ve3.C52858v0;
import ve3.C52860w0;

/* renamed from: vj2.j */
public final class C52940j extends C89132b<C52860w0> {
    public C52940j(String str, int i, String str2, long j, int i2) {
        C87412m.m108594g(str, "queryContent");
        C87412m.m108594g(str2, "sessionId");
        C52858v0 v0Var = new C52858v0();
        v0Var.f147636d = str;
        v0Var.f147637e = i;
        v0Var.f147638f = str2;
        v0Var.f147639g = j;
        C52852s0 s0Var = new C52852s0();
        s0Var.f147628d = i2;
        v0Var.f147640h = new C89349b(s0Var.toByteArray());
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = v0Var;
        bVar.f127067b = new C52860w0();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127068c = "/cgi-bin/micromsg-bin/searchringback";
        bVar.f127069d = 6442;
        mo123453j(bVar.mo72403a());
    }
}
