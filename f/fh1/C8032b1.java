package fh1;

import al1.C54129i;
import cj1.C54738b1;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import eb0.C75592q0;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import pe3.C89349b;
import te3.C48742ao0;
import te3.C49765hx0;
import te3.C52013xs0;
import te3.C64347eq2;
import yg1.C39014a;
import yg1.C66639f;

/* renamed from: fh1.b1 */
public final class C8032b1 extends C66639f {

    /* renamed from: a */
    public final C45795b f26732a;

    public C8032b1(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f26732a = bVar;
    }

    /* renamed from: b */
    public boolean mo49b(C39014a.C39015a aVar) {
        C89349b bVar;
        C54738b1 b1Var;
        LinkedList<C52013xs0> linkedList;
        C87412m.m108594g(aVar, "respWrapper");
        FinderLiveService.f159376d.getClass();
        C54129i iVar = FinderLiveService.f159398z;
        if (iVar == null) {
            return true;
        }
        C54738b1 b1Var2 = iVar.f151991f;
        C64347eq2 eq22 = b1Var2 != null ? b1Var2.f153411A : null;
        if (eq22 == null || (bVar = eq22.f183027r) == null) {
            return true;
        }
        C48742ao0 ao02 = aVar.f105072a;
        if (!(ao02 == null || (linkedList = ao02.f130689t) == null)) {
            C52013xs0 xs02 = new C52013xs0();
            xs02.f144903e = 20009;
            xs02.f144906h = bVar;
            xs02.f144904f = C75592q0.m90789s() + System.currentTimeMillis();
            C49765hx0 hx02 = new C49765hx0();
            FinderContact finderContact = new FinderContact();
            finderContact.username = ((C54991o) this.f26732a.mo71262a(C54991o.class)).f154345o;
            hx02.f134919d = finderContact;
            xs02.f144902d = hx02;
            linkedList.add(xs02);
        }
        C54129i iVar2 = FinderLiveService.f159398z;
        C64347eq2 eq23 = (iVar2 == null || (b1Var = iVar2.f151991f) == null) ? null : b1Var.f153411A;
        if (eq23 == null) {
            return true;
        }
        eq23.f183027r = null;
        return true;
    }
}
