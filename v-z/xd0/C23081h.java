package xd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import yd0.C23283a;

/* renamed from: xd0.h */
public final class C23081h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ long f66308d;

    public C23081h(long j) {
        this.f66308d = j;
    }

    public final void run() {
        Log.m105918d("MicroMsg.SubscribeMsgStorageTaskManager", "alvinluo cancelTask taskId: " + this.f66308d);
        C23283a remove = C23084k.f66314d.remove(Long.valueOf(this.f66308d));
        if (remove != null) {
            Log.m105918d("MicroMsg.SubscribeMsgStorageTaskManager", "alvinluo cancelTask task: " + remove);
            C23084k kVar = C23084k.f66311a;
            List list = C23084k.f66313c.get(remove.mo36763b());
            if (list != null) {
                list.remove(remove);
            }
            remove.mo36762a();
        }
    }
}
