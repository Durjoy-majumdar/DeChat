package hd2;

import com.tencent.p014mm.autogen.events.WalletOfflineSetCardSerialEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Util;
import kd2.C76559f;

/* renamed from: hd2.l */
public class C32846l extends IStaticListener<WalletOfflineSetCardSerialEvent> {
    public boolean callback(IEvent iEvent) {
        WalletOfflineSetCardSerialEvent walletOfflineSetCardSerialEvent = (WalletOfflineSetCardSerialEvent) iEvent;
        if (Util.isNullOrNil(walletOfflineSetCardSerialEvent.f79051d.f79052a)) {
            return false;
        }
        C76559f.m92123s(walletOfflineSetCardSerialEvent.f79051d.f79052a);
        return false;
    }
}
