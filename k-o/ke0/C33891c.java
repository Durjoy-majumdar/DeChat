package ke0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C31924c1;
import f62.C75700k0;
import java.util.Map;
import ob0.C35136m;
import sf0.C48374j0;
import te3.C77949j3;

/* renamed from: ke0.c */
public class C33891c implements C31924c1 {
    /* renamed from: o */
    public void mo8730o(String str, Map<String, String> map, C35136m.C35137a aVar) {
        Class cls = C75700k0.class;
        Log.m105924i("MicroMsg.OpenIMChatRoomAddChatRoomMemberReceiver", "onNewXmlReceived() ");
        if (map != null) {
            C77949j3 j3Var = aVar.f94242a;
            boolean z = true;
            if (Util.isEqual(j3Var.f227630g, 10002)) {
                String g = C48374j0.m53718g(j3Var.f227631h);
                if (Util.isNullOrNil(g)) {
                    Log.m105928w("MicroMsg.OpenIMChatRoomAddChatRoomMemberReceiver", "msg content is null");
                    return;
                }
                String g2 = C48374j0.m53718g(j3Var.f227628e);
                C72963f4 h302 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).h30(g2, j3Var.f227638r);
                if (h302.getMsgId() <= 0) {
                    z = false;
                }
                h302.mo108745Y2(j3Var.f227638r);
                h302.mo108733M2(C75604z3.m90841m(g2, (long) j3Var.f227635o));
                h302.setType(10002);
                h302.mo108732L2(g);
                h302.mo108740T2(0);
                h302.mo108749c3(g2);
                h302.mo101012p4(j3Var.f227636p);
                h302.mo108743W2(h302.f230723F & -129);
                C75604z3.m90842n(h302, aVar);
                if (!z) {
                    C75604z3.m90852x(h302);
                    return;
                }
                ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yy0(j3Var.f227638r, h302);
                return;
            }
            Log.m105925i("MicroMsg.OpenIMChatRoomAddChatRoomMemberReceiver", "not new xml type:%d ", Integer.valueOf(j3Var.f227630g));
        }
    }
}
