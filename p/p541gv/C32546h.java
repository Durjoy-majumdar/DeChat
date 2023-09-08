package p541gv;

import com.tencent.p014mm.autogen.events.ActivateEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import f40.C86709a0;
import ha2.C32749b;
import na2.C100109a;
import na2.C34754b;

/* renamed from: gv.h */
public class C32546h extends IStaticListener<ActivateEvent> {
    public boolean callback(IEvent iEvent) {
        ActivateEvent activateEvent = (ActivateEvent) iEvent;
        if (!C86709a0.m107522a() || activateEvent.f78706d.f78707a) {
            return false;
        }
        C34754b bVar = new C34754b();
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MUSIO_LAST_SCAN_MUSIC_FILE_TIME_LONG;
        long longValue = ((Long) i.mo119685f(aVar, 0L)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - longValue < C32749b.f89133c.longValue()) {
            Log.m105920e("MicroMsg.PieceCacheCleanController", "don't scanMusic because the time is in one day");
            return false;
        }
        C86709a0.m107535s().mo121142i().mo119677K(aVar, Long.valueOf(currentTimeMillis));
        ThreadPool.post((Runnable) new C100109a(bVar), "ScanMusicThread", 1);
        return false;
    }
}
