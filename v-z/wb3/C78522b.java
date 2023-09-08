package wb3;

import com.tencent.p014mm.autogen.events.OnSoterInitializedEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import f40.C86709a0;
import p156gj.C107835h0;
import tb3.C77880b;
import tt1.C78093g;
import tt1.C78095h;
import tt1.C78101i;
import tt1.C78102j;
import xb3.C15635h;

/* renamed from: wb3.b */
public class C78522b extends IStaticListener<OnSoterInitializedEvent> {
    public boolean callback(IEvent iEvent) {
        C78101i iVar;
        OnSoterInitializedEvent onSoterInitializedEvent = (OnSoterInitializedEvent) iEvent;
        C77880b bVar = (C77880b) C86312j.m106911c(C77880b.class);
        bVar.getClass();
        Log.m105919d("MicroMsg.PluginWxPay", "soter initialized: %s, %s", Integer.valueOf(onSoterInitializedEvent.f78887d.f78888a), onSoterInitializedEvent.f78887d.f78889b);
        int i = onSoterInitializedEvent.f78887d.f78888a;
        if (i != 0 && C107835h0.f322851h.f322842a) {
            C15635h.f42265a.mo14380a(WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, "1", String.valueOf(i), onSoterInitializedEvent.f78887d.f78889b);
        }
        Class<C78101i> cls = C78101i.class;
        int i2 = onSoterInitializedEvent.f78887d.f78888a;
        C78102j jVar = new C78102j();
        if (jVar.gw0()) {
            jVar.prepare();
            iVar = jVar;
        } else {
            C78095h hVar = new C78095h();
            if (hVar.gw0()) {
                hVar.prepare();
                iVar = hVar;
            } else {
                iVar = new C78093g();
            }
        }
        C86709a0.m107532n(cls, iVar);
        bVar.f226905d = true;
        return false;
    }
}
