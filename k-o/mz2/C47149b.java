package mz2;

import android.util.Base64;
import az2.C39674e;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import rz2.C48201c;
import su0.C13781a;
import uz2.C52673c1;
import uz2.C52718u;

/* renamed from: mz2.b */
public final class C47149b {
    /* renamed from: a */
    public static final C48201c m52432a(C52673c1 c1Var) {
        C87412m.m108594g(c1Var, "<this>");
        C48201c cVar = new C48201c();
        cVar.field_UserName = C13781a.m13082a();
        cVar.field_StatusID = c1Var.f147067d;
        cVar.field_referenceCount = c1Var.f147072i;
        cVar.field_LikeCount = c1Var.f147070g;
        C52718u uVar = new C52718u();
        try {
            uVar.parseFrom(Base64.decode(c1Var.f147069f, 0));
            C39674e.f106452d.mo62237B(cVar, uVar);
        } catch (Throwable th) {
            Log.printErrStackTrace("TextStatusHistory", th, "parse TextStatusHistory err id" + c1Var.f147067d, new Object[0]);
        }
        return cVar;
    }
}
