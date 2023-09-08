package rx1;

import com.tencent.p014mm.autogen.events.ManualAuthEvent;
import com.tencent.p014mm.plugin.game.commlib.C30075d;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: rx1.b */
public class C36552b extends IStaticListener<ManualAuthEvent> {
    public boolean callback(IEvent iEvent) {
        ManualAuthEvent manualAuthEvent = (ManualAuthEvent) iEvent;
        Log.m105924i("ManualLoginListener", "manual force login");
        C30075d.m38954a().mo57102b(true, 4);
        return false;
    }
}
