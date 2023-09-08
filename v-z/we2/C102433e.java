package we2;

import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import ke2.C99129c;
import p556hw.C76247e;
import te2.C101746c;
import te2.C101750g;
import xe2.C102630a;

@C86522b
/* renamed from: we2.e */
public final class C102433e extends C86301e implements C76247e {
    /* renamed from: Eq */
    public void mo106498Eq(long j) {
        vx0(j, 4);
    }

    /* renamed from: Gn */
    public void mo106499Gn(long j) {
        vx0(j, 2);
    }

    /* renamed from: S9 */
    public boolean mo106500S9(long j) {
        return wx0(j, 4);
    }

    /* renamed from: sh */
    public void mo106501sh(long j) {
        vx0(j, 1);
    }

    public final void vx0(long j, int i) {
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
        if (b002.getMsgId() > 0 && C101750g.f297828a.mo141183c(i, b002.mo108768t()) != 0) {
            C99129c cVar = (C99129c) C86312j.m106911c(C99129c.class);
            cVar.requireAccountInitialized();
            cVar.f290655A.mo129636e(j, i, b002.mo108774y2());
        }
    }

    /* renamed from: wR */
    public boolean mo106502wR(long j) {
        return wx0(j, 3);
    }

    public final boolean wx0(long j, int i) {
        Class cls = C99129c.class;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
        if (b002.getMsgId() <= 0 || C101750g.f297828a.mo141183c(i, b002.mo108768t()) == 0) {
            return false;
        }
        C101746c Bx0 = ((C99129c) C86312j.m106911c(cls)).Bx0();
        StringBuilder sb = new StringBuilder();
        sb.append(b002.mo108774y2());
        sb.append('_');
        sb.append(i);
        String sb4 = sb.toString();
        Bx0.getClass();
        C87412m.m108594g(sb4, "msgItemId");
        C99129c cVar = (C99129c) C86312j.m106911c(cls);
        cVar.requireAccountInitialized();
        C102630a d3 = cVar.f290673z.mo142287d3(sb4);
        if (d3 != null) {
            return d3.getStatus() == 2 || (d3.getStatus() == 1 && d3.mo142481v2() != d3.mo142475q2()) || (d3.getStatus() == 4 && d3.mo142481v2() != d3.mo142475q2());
        }
        return false;
    }
}
