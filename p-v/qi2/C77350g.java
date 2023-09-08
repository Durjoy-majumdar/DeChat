package qi2;

import com.tencent.p014mm.autogen.events.ReceiveTransferAppMsgEvent;
import com.tencent.p014mm.message.C55268k;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import oi2.C77010f;
import vi2.C37738a;
import vi2.C78418c;

/* renamed from: qi2.g */
public class C77350g extends IStaticListener<ReceiveTransferAppMsgEvent> {
    public boolean callback(IEvent iEvent) {
        ReceiveTransferAppMsgEvent receiveTransferAppMsgEvent = (ReceiveTransferAppMsgEvent) iEvent;
        C77010f vx02 = C77010f.vx0();
        vx02.getClass();
        Log.m105925i("MicroMsg.SubCoreRemittance", "do insert delay transfer record: %s, %s", Long.valueOf(receiveTransferAppMsgEvent.f107727d.f107729b), receiveTransferAppMsgEvent.f107727d.f107728a);
        C68070l.C68072b bVar = receiveTransferAppMsgEvent.f107727d.f107730c;
        if (bVar != null) {
            int i = bVar.f195489G0;
            if (i == 5 || i == 25) {
                C37738a aVar = new C37738a();
                ReceiveTransferAppMsgEvent.C40157a aVar2 = receiveTransferAppMsgEvent.f107727d;
                aVar.field_msgId = aVar2.f107729b;
                aVar.field_transferId = aVar2.f107728a;
                C77010f.vx0().wx0().insert(aVar);
            }
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(receiveTransferAppMsgEvent.f107727d.f107729b);
            C78418c jo = vx02.yx0().mo108369jo(receiveTransferAppMsgEvent.f107727d.f107728a);
            if (jo != null) {
                jo.field_receiveStatus = receiveTransferAppMsgEvent.f107727d.f107730c.f195489G0;
                vx02.yx0().replace(jo);
                if (!b002.mo108768t().equals(C75592q0.m90789s())) {
                    vx02.Bx0(b002.mo108768t(), b002, (C78418c) null);
                }
            } else if (!b002.mo108768t().equals(C75592q0.m90789s())) {
                C78418c cVar = new C78418c();
                ReceiveTransferAppMsgEvent.C40157a aVar3 = receiveTransferAppMsgEvent.f107727d;
                cVar.field_locaMsgId = aVar3.f107729b;
                C68070l.C68072b bVar2 = aVar3.f107730c;
                cVar.field_transferId = bVar2.f195501J0;
                cVar.field_receiveStatus = bVar2.f195489G0;
                cVar.field_isSend = false;
                cVar.field_talker = b002.mo108768t();
                cVar.field_invalidtime = (long) receiveTransferAppMsgEvent.f107727d.f107730c.f195504K0;
                C68070l.C68072b u = C68070l.C68072b.m80422u(b002.getContent(), (String) null);
                if (u != null) {
                    cVar.field_receiverName = ((C55268k) u.mo93555w(C55268k.class)).f157427c;
                }
                vx02.yx0().replace(cVar);
                vx02.Bx0(b002.mo108768t(), b002, (C78418c) null);
            }
        }
        return false;
    }
}
