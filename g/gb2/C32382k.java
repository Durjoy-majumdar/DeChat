package gb2;

import cb2.C0443g;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;
import gy3.C87412m;

/* renamed from: gb2.k */
public final class C32382k extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        Class cls = C0443g.class;
        C87412m.m108594g(checkResUpdateCacheFileEvent, "event");
        CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
        int i = aVar.f78744a;
        if (i != 87) {
            if (i != 92) {
                return false;
            }
            int i2 = aVar.f78745b;
            if (i2 == 1) {
                String str = checkResUpdateCacheFileEvent.f78743d.f78746c;
                C87412m.m108593f(str, "event.data.filePath");
                ((C0443g) C86312j.m106911c(cls)).xx0(str);
                return false;
            } else if (i2 != 2) {
                return false;
            } else {
                String str2 = checkResUpdateCacheFileEvent.f78743d.f78746c;
                C87412m.m108593f(str2, "event.data.filePath");
                ((C0443g) C86312j.m106911c(cls)).vx0(str2);
                return false;
            }
        } else if (aVar.f78745b != 1) {
            return false;
        } else {
            String str3 = checkResUpdateCacheFileEvent.f78743d.f78746c;
            C87412m.m108593f(str3, "event.data.filePath");
            ((C0443g) C86312j.m106911c(cls)).wx0(str3);
            return false;
        }
    }
}
