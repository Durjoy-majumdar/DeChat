package ha3;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.autogen.events.ScanQrcodeKidsWatchLoginEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import ke3.C88144b;

/* renamed from: ha3.f */
public class C32757f extends IStaticListener<ScanQrcodeKidsWatchLoginEvent> {
    public boolean callback(IEvent iEvent) {
        ScanQrcodeKidsWatchLoginEvent scanQrcodeKidsWatchLoginEvent = (ScanQrcodeKidsWatchLoginEvent) iEvent;
        if (scanQrcodeKidsWatchLoginEvent == null) {
            return false;
        }
        Intent intent = new Intent();
        intent.putExtra("intent.key.login.url", scanQrcodeKidsWatchLoginEvent.f78969d.f78970a);
        intent.putExtra("intent.key.device.name", scanQrcodeKidsWatchLoginEvent.f78969d.f78971b);
        intent.setFlags(268435456);
        C88144b.m109791i(MMApplicationContext.getContext(), "kidswatch", ".ui.login.KidsWatchEntranceUI", intent, (Bundle) null);
        return false;
    }
}
