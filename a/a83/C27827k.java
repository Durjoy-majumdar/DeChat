package a83;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import u73.C101977i1;
import zt3.C119157j;

/* renamed from: a83.k */
public class C27827k extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
        if (checkResUpdateCacheFileEvent != null) {
            CheckResUpdateCacheFileEvent.C28720a aVar = checkResUpdateCacheFileEvent.f78743d;
            int i = aVar.f78744a;
            int i2 = 2;
            if (i == 27 && aVar.f78745b == 1) {
                i2 = 0;
            } else if (i == 27 && aVar.f78745b == 2) {
                i2 = 1;
            } else if (!(i == 62 && aVar.f78745b == 1)) {
                if (i == 40 && aVar.f78745b == 1) {
                    i2 = 3;
                } else if (i == 64 && aVar.f78745b == 1) {
                    i2 = 4;
                } else if (i == 66 && aVar.f78745b == 1) {
                    i2 = 5;
                } else if (i == 79 && aVar.f78745b == 1) {
                    i2 = 6;
                } else if (i == 85 && aVar.f78745b == 1) {
                    i2 = 7;
                } else if (i == 84 && aVar.f78745b == 1) {
                    i2 = 8;
                } else if (i == 84 && aVar.f78745b == 2) {
                    i2 = 11;
                } else if (i == 95 && aVar.f78745b == 1) {
                    i2 = 9;
                } else if (i == 79 && aVar.f78745b == 2) {
                    i2 = 10;
                }
            }
            C43471q.m46983g(i2).mo71054a(checkResUpdateCacheFileEvent.f78743d.f78746c);
            ((C119157j) C119157j.f356862d).mo183876g(new C101977i1(i2), "WebSearchThread");
        }
        return false;
    }
}
