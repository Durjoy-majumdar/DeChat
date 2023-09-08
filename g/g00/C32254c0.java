package g00;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.pluginsdk.model.C44595p1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;

/* renamed from: g00.c0 */
public class C32254c0 extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public boolean callback(IEvent iEvent) {
        CheckResUpdateCacheFileEvent.C28720a aVar = ((CheckResUpdateCacheFileEvent) iEvent).f78743d;
        if (49 != aVar.f78744a || 1 != aVar.f78745b) {
            return false;
        }
        if (!aVar.f78748e) {
            Log.m105924i("WvCheckResUpdateCacheFileEventListener", "receive xweb get config  notify!! fileUpdated == false ignore");
            return false;
        }
        Log.m105924i("WvCheckResUpdateCacheFileEventListener", "receive xweb get config  notify!!");
        C44595p1.m49048a(MMApplicationContext.getContext(), 5);
        return true;
    }
}
