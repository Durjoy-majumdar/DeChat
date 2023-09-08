package p665qq;

import com.tencent.p014mm.autogen.events.ManualAuthEvent;
import com.tencent.p014mm.plugin.expt.pageflow.MMPageFlowService;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import j91.C21199a;
import w91.C22880b;

/* renamed from: qq.q */
public class C118210q extends IStaticListener<ManualAuthEvent> {
    public boolean callback(IEvent iEvent) {
        ManualAuthEvent manualAuthEvent = (ManualAuthEvent) iEvent;
        MMPageFlowService wx02 = MMPageFlowService.wx0();
        wx02.getClass();
        Log.m105924i("MicroMsg.MMPageFlowService", "manual force login");
        if (!wx02.f345926d) {
            wx02.f345926d = true;
            C22880b.m26858f(105, (String) null, 0, System.currentTimeMillis());
            C22880b.m26857d().mo36055g(7);
            C21199a.m23657b(7);
        }
        return false;
    }
}
