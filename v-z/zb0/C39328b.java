package zb0;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: zb0.b */
public class C39328b extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        if (!C86709a0.m107522a()) {
            Log.m105929w("MicroMsg.FontResLogic", "received CheckResUpdateCacheFileEvent when account was not ready, resType: %s, subType: %s", Integer.valueOf(checkResUpdateCacheFileEvent.f78743d.f78744a), Integer.valueOf(checkResUpdateCacheFileEvent.f78743d.f78745b));
        } else {
            CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
            if (aVar.f78744a == 57 && aVar.f78745b == 1) {
                Log.m105925i("MicroMsg.FontResLogic", "download res finish, path: %s, fileVersion: %s, fileUpdated: %s", aVar.f78746c, Integer.valueOf(aVar.f78747d), Boolean.valueOf(checkResUpdateCacheFileEvent.f78743d.f78748e));
                C86709a0.m107525e().postToWorker(new C39327a(this, checkResUpdateCacheFileEvent));
            }
        }
        return false;
    }
}
