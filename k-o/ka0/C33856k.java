package ka0;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import java.util.concurrent.locks.ReentrantLock;
import p523fp.C32147e;

/* renamed from: ka0.k */
public final class C33856k extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        C87412m.m108594g(checkResUpdateCacheFileEvent, "event");
        CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
        if (aVar.f78744a != 103) {
            return false;
        }
        int i = aVar.f78745b;
        String str = aVar.f78746c;
        boolean z = aVar.f78748e;
        Log.m105924i("MicroMsg.MassSdkResEventListener", "get res " + i + ", " + str + ", " + z);
        if (str == null) {
            Log.m105928w("MicroMsg.MassSdkResEventListener", "get res path is null");
            return false;
        } else if (!z) {
            return false;
        } else {
            C33848g gVar = C33848g.f91487a;
            ReentrantLock reentrantLock = C33848g.f91489c;
            reentrantLock.lock();
            try {
                boolean g = gVar.mo59327g(i, str);
                reentrantLock.unlock();
                if (!g) {
                    return false;
                }
                ((C32147e) C86312j.m106911c(C32147e.class)).Y40(103, i, -1);
                return false;
            } catch (Throwable th) {
                C33848g.f91489c.unlock();
                throw th;
            }
        }
    }
}
