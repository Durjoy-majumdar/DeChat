package a83;

import com.tencent.p014mm.autogen.events.LocalCheckResUpdateCacheFileEvent;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: a83.i */
public class C27824i extends IStaticListener<LocalCheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent = (LocalCheckResUpdateCacheFileEvent) iEvent;
        LocalCheckResUpdateCacheFileEvent.C28773a aVar = localCheckResUpdateCacheFileEvent.f78859d;
        int i = aVar.f78860a;
        int i2 = 2;
        if (i == 27 && aVar.f78861b == 1) {
            i2 = 0;
        } else if (i == 27 && aVar.f78861b == 2) {
            i2 = 1;
        } else if (!(i == 62 && aVar.f78861b == 1)) {
            if (i == 40 && aVar.f78861b == 1) {
                i2 = 3;
            } else if (i == 64 && aVar.f78861b == 1) {
                i2 = 4;
            } else if (i == 66 && aVar.f78861b == 1) {
                i2 = 5;
            } else if (i == 79 && aVar.f78861b == 1) {
                i2 = 6;
            } else if (i == 85 && aVar.f78861b == 1) {
                i2 = 7;
            } else if (i == 84 && aVar.f78861b == 1) {
                i2 = 8;
            } else if (i == 84 && aVar.f78861b == 2) {
                i2 = 11;
            } else if (i == 95 && aVar.f78861b == 1) {
                i2 = 9;
            } else {
                if (i == 79 && aVar.f78861b == 2) {
                    i2 = 10;
                }
                return false;
            }
        }
        C43471q.m46983g(i2).mo71056c(localCheckResUpdateCacheFileEvent.f78859d.f78862c);
        return false;
    }
}
