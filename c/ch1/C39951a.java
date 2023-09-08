package ch1;

import al1.C39611s;
import cl1.C39981t0;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import ok1.C62042e;
import te3.C48742ao0;
import te3.C49592gp2;
import te3.C49765hx0;
import te3.C50135ki2;
import yg1.C39014a;
import yg1.C66639f;

/* renamed from: ch1.a */
public final class C39951a extends C66639f {

    /* renamed from: a */
    public final C45795b f107099a;

    public C39951a(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f107099a = bVar;
    }

    /* renamed from: b */
    public boolean mo49b(C39014a.C39015a aVar) {
        FinderContact finderContact;
        FinderContact finderContact2;
        FinderContact finderContact3;
        FinderContact finderContact4;
        C87412m.m108594g(aVar, "respWrapper");
        C48742ao0 ao02 = aVar.f105072a;
        C49592gp2 gp22 = ao02 != null ? ao02.f130672J : null;
        if (gp22 == null) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("handleMicIntercomHeartInfo heartList: ");
        StringBuilder sb4 = new StringBuilder();
        LinkedList<C50135ki2> linkedList = gp22.f134189d;
        C87412m.m108593f(linkedList, "heart_broken_contacts");
        for (C50135ki2 ki22 : linkedList) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("heartUser: ");
            sb5.append(ki22.f136808e);
            sb5.append(" session: ");
            sb5.append(ki22.f136809f);
            sb5.append(" nickname: ");
            C49765hx0 hx02 = ki22.f136807d;
            sb5.append((hx02 == null || (finderContact4 = hx02.f134919d) == null) ? null : finderContact4.nickname);
            sb5.append(10);
            sb4.append(sb5.toString());
        }
        String sb6 = sb4.toString();
        C87412m.m108593f(sb6, "sb.toString()");
        sb.append(sb6);
        Log.m105924i("MicIntercomLiveMsgInter", sb.toString());
        if (!C62042e.f176370a.mo87027N0()) {
            return true;
        }
        LinkedList<C50135ki2> linkedList2 = gp22.f134189d;
        C87412m.m108593f(linkedList2, "it.heart_broken_contacts");
        for (C50135ki2 ki23 : linkedList2) {
            LiveMutableData<C39611s> liveMutableData = ((C39981t0) this.f107099a.mo71262a(C39981t0.class)).f107202q;
            String str = ki23.f136808e;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            C49765hx0 hx03 = ki23.f136807d;
            liveMutableData.postValue(new C39611s(str2, (hx03 == null || (finderContact3 = hx03.f134919d) == null) ? null : finderContact3.headUrl, (hx03 == null || (finderContact2 = hx03.f134919d) == null) ? null : finderContact2.username, (hx03 == null || (finderContact = hx03.f134919d) == null) ? null : finderContact.nickname, ki23.f136809f, false));
        }
        return true;
    }
}
