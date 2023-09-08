package qi2;

import com.tencent.p014mm.autogen.events.WalletQueryRemittanceStatusEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import oi2.C77010f;
import vi2.C78418c;

/* renamed from: qi2.k */
public class C77351k extends IStaticListener<WalletQueryRemittanceStatusEvent> {
    public boolean callback(IEvent iEvent) {
        WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent = (WalletQueryRemittanceStatusEvent) iEvent;
        C78418c Lo = C77010f.vx0().yx0().mo108368Lo(walletQueryRemittanceStatusEvent.f154909d.f154911a);
        if (Lo != null) {
            WalletQueryRemittanceStatusEvent.C55179b bVar = walletQueryRemittanceStatusEvent.f154910e;
            bVar.f154912a = Lo.field_receiveStatus;
            bVar.f154913b = Lo.field_isSend;
            bVar.f154914c = Lo.field_hasClicked;
        } else {
            WalletQueryRemittanceStatusEvent.C55179b bVar2 = walletQueryRemittanceStatusEvent.f154910e;
            bVar2.f154912a = -2;
            bVar2.f154913b = false;
            bVar2.f154914c = false;
        }
        return false;
    }
}
