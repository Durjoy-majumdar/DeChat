package u93;

import android.os.Looper;
import android.os.MessageQueue;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;

/* renamed from: u93.e */
public final class C52493e implements MessageQueue.IdleHandler {

    /* renamed from: d */
    public final /* synthetic */ String f146645d;

    public C52493e(String str) {
        this.f146645d = str;
    }

    public boolean queueIdle() {
        Looper.myQueue().removeIdleHandler(this);
        C52497i iVar = new C52497i(this.f146645d);
        if (C52495g.f146647a != null) {
            Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadLogic", "already exist preload obj");
            return false;
        }
        Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadLogic", "start to preload obj url:" + iVar.f146653a);
        iVar.f146654b = C31543z5.m39453c();
        C52495g.f146647a = new C52496h(iVar.f146653a);
        new C52506q(iVar).invoke();
        return false;
    }
}
