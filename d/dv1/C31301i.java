package dv1;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import eb0.C31543z5;
import fv1.C32183a;
import g62.C45882k;
import g62.C75880o;
import gy3.C87412m;
import p687sr.C64156g;
import pe3.C47465a;
import te3.C49790i3;
import te3.C51482u20;
import te3.C52085y83;

/* renamed from: dv1.i */
public final class C31301i implements C45882k.C45885c {
    /* renamed from: u1 */
    public void mo58057u1(int i, C52085y83 y832, C75880o oVar) {
        boolean z;
        C87412m.m108594g(oVar, "option");
        C58435m mVar = (C58435m) C86312j.m106911c(C58435m.class);
        mVar.getClass();
        Class cls = C64156g.class;
        Log.m105925i(mVar.f167403f, "[onOpLogResult] ret:%s %s", Integer.valueOf(i), oVar);
        if (oVar.mo58568b() == 213) {
            C47465a aVar = oVar.f222536j;
            C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.AddForcePush");
            C49790i3 i3Var = (C49790i3) aVar;
            Log.m105925i(mVar.f167403f, "[onOpLogResult] AddForcePush ForcePushId:%s", i3Var.f135070d);
            if (i != 0 || mVar.f167401d) {
                C32183a aVar2 = C32183a.f85554d;
                String str = i3Var.f135070d;
                C87412m.m108593f(str, "oplog.ForcePushId");
                aVar2.mo58524qq(str, -1);
                ((C64156g) C86312j.m106911c(cls)).mo58059Hj(i3Var.f135070d, 6, C31543z5.m39453c() / ((long) 1000));
                return;
            }
            C32183a aVar3 = C32183a.f85554d;
            String str2 = i3Var.f135070d;
            C87412m.m108593f(str2, "oplog.ForcePushId");
            aVar3.mo58524qq(str2, 1);
            ((C64156g) C86312j.m106911c(cls)).mo58059Hj(i3Var.f135070d, 1, C31543z5.m39453c() / ((long) 1000));
        } else if (oVar.mo58568b() == 214) {
            C47465a aVar4 = oVar.f222536j;
            C87412m.m108592e(aVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.DelForcePush");
            C51482u20 u202 = (C51482u20) aVar4;
            int i2 = u202.f142562e;
            if (i == 0) {
                ((C64156g) C86312j.m106911c(cls)).mo58059Hj(u202.f142561d, i2, C31543z5.m39453c() / ((long) 1000));
                C32183a aVar5 = C32183a.f85554d;
                String str3 = u202.f142561d;
                C87412m.m108593f(str3, "oplog.ForcePushId");
                z = aVar5.mo58522c(str3);
            } else {
                z = false;
            }
            Log.m105925i(mVar.f167403f, "[onOpLogResult] DelForcePush id:%s ret:%s isDeleteLocal:%s", u202.f142561d, Integer.valueOf(i), Boolean.valueOf(z));
        }
    }
}
