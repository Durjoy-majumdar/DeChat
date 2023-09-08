package zw0;

import com.tencent.p014mm.autogen.events.LocalCheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import ww0.C53209j;

/* renamed from: zw0.c */
public class C39463c extends IStaticListener<LocalCheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent = (LocalCheckResUpdateCacheFileEvent) iEvent;
        if (localCheckResUpdateCacheFileEvent == null) {
            return false;
        }
        LocalCheckResUpdateCacheFileEvent.C28773a aVar = localCheckResUpdateCacheFileEvent.f78859d;
        if (aVar.f78860a != 73 || aVar.f78861b != 1) {
            return false;
        }
        C53209j.yx0(aVar.f78862c, true);
        return false;
    }
}
