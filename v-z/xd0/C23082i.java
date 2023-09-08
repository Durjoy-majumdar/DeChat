package xd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import yd0.C23283a;

/* renamed from: xd0.i */
public final class C23082i implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C23283a f66309d;

    public C23082i(C23283a aVar) {
        this.f66309d = aVar;
    }

    public final void run() {
        Log.m105919d("MicroMsg.SubscribeMsgStorageTaskManager", "alvinluo onTaskAfter removeTask: %s", Integer.valueOf(this.f66309d.hashCode()));
        C23084k kVar = C23084k.f66311a;
        C23283a aVar = this.f66309d;
        List list = C23084k.f66313c.get(aVar.mo36763b());
        if (list != null) {
            list.remove(aVar);
        }
    }
}
