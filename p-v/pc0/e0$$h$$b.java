package pc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

public class e0$$h$$b implements C118009h {

    /* renamed from: a */
    public final /* synthetic */ e0$$h f352716a;

    public e0$$h$$b(e0$$h e0__h) {
        this.f352716a = e0__h;
    }

    /* renamed from: a */
    public boolean mo182771a(int i) {
        e0$$h e0__h = this.f352716a;
        Log.m105925i("MicroMsg.SyncService", "%s onFinishCmd resp:%s pushSycnFlag:%s recvTime:%s", e0__h, e0__h.f352745f, Integer.valueOf(e0__h.f352743d), Long.valueOf(this.f352716a.f352744e));
        if ((this.f352716a.f352743d & 1) > 0) {
            C86709a0.m107524d().mo123460f(new C118014p(this.f352716a.f352744e, C118000d0.f352701a.mo182756a()));
        }
        e0$$h e0__h2 = this.f352716a;
        e0__h2.f352746g.mo182763g(e0__h2);
        return true;
    }
}
