package g00;

import com.tencent.p014mm.autogen.events.DynamicConfigUpdatedEvent;
import com.tencent.p014mm.pluginsdk.model.C44595p1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.XWebSdk;
import f40.C86709a0;
import lc3.C10485b;

/* renamed from: g00.i0 */
public class C32268i0 extends IStaticListener<DynamicConfigUpdatedEvent> {
    public boolean callback(IEvent iEvent) {
        if (((DynamicConfigUpdatedEvent) iEvent) instanceof DynamicConfigUpdatedEvent) {
            boolean ipType = XWebSdk.setIpType(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("WebKernelMode", -1));
            Log.m105925i("WvUpdateDynamicConfig", "updateWebViewDynamicConfig, need check update xwalk:%s", Boolean.valueOf(ipType));
            if (ipType) {
                C44595p1.m49048a(MMApplicationContext.getContext(), 5);
            }
        }
        return false;
    }
}
