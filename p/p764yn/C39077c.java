package p764yn;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.autogen.events.CheckResUpdatePreOperationEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import sw0.C36869h;
import x02.C38431f;
import x02.C91118g;

/* renamed from: yn.c */
public class C39077c extends IStaticListener<IEvent> {
    public boolean callback(IEvent iEvent) {
        Class cls = C36869h.class;
        if (iEvent instanceof CheckResUpdatePreOperationEvent) {
            ((C36869h) C86312j.m106911c(cls)).getClass();
            CheckResUpdatePreOperationEvent.C28721a aVar = ((CheckResUpdatePreOperationEvent) iEvent).f78750d;
            if (29 == aVar.f78751a && aVar.f78753c == 0) {
                Log.m105918d("MicroMsg.Boots.PluginBoots", "hp_res received new hotpatch cache request");
                C38431f.m41873d(0);
            }
            return false;
        }
        if (iEvent instanceof CheckResUpdateCacheFileEvent) {
            ((C36869h) C86312j.m106911c(cls)).getClass();
            CheckResUpdateCacheFileEvent.C28720a aVar2 = ((CheckResUpdateCacheFileEvent) iEvent).f78743d;
            if (29 == aVar2.f78744a && aVar2.f78748e) {
                String i = C86013q1.m106448i(aVar2.f78746c, false);
                Log.m105919d("MicroMsg.Boots.PluginBoots", "hp_res received new/updated download resource, path=%s", i);
                C38431f.m41872c(0);
                C91118g.f261313f.get().mo125180d(i);
            }
        }
        return false;
    }
}
