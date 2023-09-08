package oq1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fe1.C58960c;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import sq1.C64151e;
import te3.C64284cg;

/* renamed from: oq1.o */
public final class C62141o extends C87413o implements C32226l<String, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C64151e f176692d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62141o(C64151e eVar, C62137n nVar) {
        super(1);
        this.f176692d = eVar;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((String) obj, "username");
        FinderContact finderContact = this.f176692d.f181868d.mo88876n2().reply_contact;
        C64284cg cgVar = null;
        if (finderContact != null) {
            cgVar = C58960c.m68830b(C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null), false);
        }
        if (cgVar != null) {
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return C13598b0.f38549a;
    }
}
