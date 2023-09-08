package p615mx;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import pl2.C35526c;
import pl2.C35528d;

/* renamed from: mx.b */
public final class C34675b extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        C87412m.m108594g(checkResUpdateCacheFileEvent, "event");
        if (!C86709a0.m107522a()) {
            return false;
        }
        C35526c cVar = (C35526c) C86312j.m106911c(C35526c.class);
        cVar.getClass();
        CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
        if (aVar.f78744a == 97 && aVar.f78745b == 1) {
            Log.m105924i("MicroMsg.ScanProductModelResLogic", "download res finish, path: " + checkResUpdateCacheFileEvent.f78743d.f78746c + ", fileVersion: " + checkResUpdateCacheFileEvent.f78743d.f78747d + ", fileUpdated: " + checkResUpdateCacheFileEvent.f78743d.f78748e);
            C86709a0.m107525e().postToWorker(new C35528d(cVar, checkResUpdateCacheFileEvent));
            cVar.f95002d.mo60305a(4);
            return false;
        }
        Log.m105918d("MicroMsg.ScanProductModelResLogic", "CheckResUpdateCacheFileEvent  resType：" + checkResUpdateCacheFileEvent.f78743d.f78744a + "  subType:" + checkResUpdateCacheFileEvent.f78743d.f78745b);
        return false;
    }
}
