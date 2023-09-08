package vj2;

import android.util.Base64;
import gy3.C87412m;
import ob0.C47350c;
import ob0.C89132b;
import ve3.C52854t0;
import ve3.C52863y;
import ve3.C52865z;

/* renamed from: vj2.h */
public final class C52938h extends C89132b<C52865z> {
    public C52938h(int i, int i2, String str, int i3) {
        C87412m.m108594g(str, "sessionId");
        C52863y yVar = new C52863y();
        yVar.f147656f = i;
        yVar.f147657g = 0;
        yVar.f147654d = i2;
        yVar.f147655e = str;
        C52854t0 t0Var = new C52854t0();
        t0Var.f147631e = i2;
        t0Var.f147630d = i3;
        yVar.f147659i = Base64.encodeToString(t0Var.toByteArray(), 2);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = yVar;
        bVar.f127067b = new C52865z();
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getrecommendringback";
        bVar.f127069d = 4215;
        mo123453j(bVar.mo72403a());
    }
}
