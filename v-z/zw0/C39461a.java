package zw0;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ww0.C53209j;

/* renamed from: zw0.a */
public class C39461a extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        int i;
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        if (checkResUpdateCacheFileEvent != null) {
            CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
            int i2 = aVar.f78744a;
            if (i2 == 62) {
                Log.m105925i("BoxCheckResUpdateListener", "CheckResUpdateCacheFileEvent %d", Integer.valueOf(aVar.f78745b));
                if (checkResUpdateCacheFileEvent.f78743d.f78745b == 2) {
                    String vx02 = C53209j.vx0();
                    if (C86013q1.m106450k(vx02)) {
                        C86013q1.m106447h(vx02);
                    }
                    C86009m1 m1Var = new C86009m1(vx02);
                    if (!m1Var.mo119974l().mo119967g()) {
                        C86013q1.m106461v(m1Var.mo119973k());
                    }
                    C86013q1.m106442c(checkResUpdateCacheFileEvent.f78743d.f78746c, vx02);
                    ((C53209j) C86312j.m106911c(C53209j.class)).xx0();
                }
            } else if (i2 == 73 && (i = aVar.f78745b) == 1) {
                CheckResUpdateCacheFileEvent.C28720a aVar2 = checkResUpdateCacheFileEvent.f78743d;
                Log.m105925i("BoxCheckResUpdateListener", "[checkResUpdateListener] word bank download, subtype: %d, file path: %s, version: %s, updated: %s", Integer.valueOf(i), aVar2.f78746c, Integer.valueOf(aVar2.f78747d), Boolean.valueOf(checkResUpdateCacheFileEvent.f78743d.f78748e));
                C53209j.yx0(checkResUpdateCacheFileEvent.f78743d.f78746c, false);
            }
        }
        return false;
    }
}
