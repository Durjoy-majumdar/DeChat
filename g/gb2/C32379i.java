package gb2;

import cb2.C0443g;
import com.tencent.p014mm.autogen.events.LocalCheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import di3.C86312j;
import gy3.C87412m;

/* renamed from: gb2.i */
public final class C32379i extends IStaticListener<LocalCheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent = (LocalCheckResUpdateCacheFileEvent) iEvent;
        Class cls = C0443g.class;
        C87412m.m108594g(localCheckResUpdateCacheFileEvent, "event");
        LocalCheckResUpdateCacheFileEvent.C28773a aVar = localCheckResUpdateCacheFileEvent.f78859d;
        int i = aVar.f78860a;
        if (i != 87) {
            if (i != 92) {
                return false;
            }
            int i2 = aVar.f78861b;
            if (i2 == 1) {
                String str = localCheckResUpdateCacheFileEvent.f78859d.f78862c;
                C87412m.m108593f(str, "event.data.filePath");
                ((C0443g) C86312j.m106911c(cls)).xx0(str);
                return false;
            } else if (i2 != 2) {
                return false;
            } else {
                String str2 = localCheckResUpdateCacheFileEvent.f78859d.f78862c;
                C87412m.m108593f(str2, "event.data.filePath");
                ((C0443g) C86312j.m106911c(cls)).vx0(str2);
                return false;
            }
        } else if (aVar.f78861b != 1) {
            return false;
        } else {
            String str3 = localCheckResUpdateCacheFileEvent.f78859d.f78862c;
            C87412m.m108593f(str3, "event.data.filePath");
            ((C0443g) C86312j.m106911c(cls)).wx0(str3);
            return false;
        }
    }
}
