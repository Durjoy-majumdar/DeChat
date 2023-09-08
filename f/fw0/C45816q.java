package fw0;

import com.tencent.p014mm.autogen.events.NetSceneGetChatroomMemberDetailEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C31519v2;
import eb0.C75569c4;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75697g1;
import f62.C75700k0;
import pe3.C47465a;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: fw0.q */
public class C45816q implements C75697g1<C77949j3> {
    /* renamed from: I5 */
    public void mo71276I5(C47465a aVar) {
        String g = C48374j0.m53718g(((C77949j3) aVar).f227628e);
        if (!Util.isNullOrNil(g) && !((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69709k3(g)) {
            C31519v2.m39436a().mo55987c(g, "");
        }
    }

    /* renamed from: y1 */
    public void mo71277y1(C47465a aVar) {
        C77949j3 j3Var = (C77949j3) aVar;
        String g = C48374j0.m53718g(j3Var.f227628e);
        if (C72996z1.m85820U5(g)) {
            C44661m1 SE = ((C44662n1) C97625j3.m125812b().mo105902q()).mo69801SE(g);
            C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(g);
            if (z1Var == null || ((int) z1Var.f108320R1) <= 0) {
                C31519v2.m39436a().mo55988e(g, (String) null, new C45815p(this, SE, g));
            } else if (SE.mo69798z2()) {
                NetSceneGetChatroomMemberDetailEvent netSceneGetChatroomMemberDetailEvent = new NetSceneGetChatroomMemberDetailEvent();
                NetSceneGetChatroomMemberDetailEvent.C40141a aVar2 = netSceneGetChatroomMemberDetailEvent.f107649d;
                aVar2.f107650a = g;
                aVar2.f107651b = SE.mo69791s2();
                netSceneGetChatroomMemberDetailEvent.publish();
            }
        }
        long j = j3Var.f227638r;
        int i = C75569c4.f221998a;
        if (!Util.isNullOrNil(g) && j > 0 && C75569c4.f221999b.containsKey(Long.valueOf(j))) {
            C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).h30(g, j);
            if (!Util.isNullOrNil(h302.mo108768t()) && h302.mo108774y2() > 0) {
                Log.m105925i("MicroMsg.MsgSourceHelper", "found sec msg of %s", Long.valueOf(j));
                C75569c4.m90665K(h302, C75569c4.f221999b.get(Long.valueOf(j)), true);
                C75569c4.f221999b.remove(Long.valueOf(j));
            }
        }
    }
}
