package ob0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

public class b0$$b implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C89137b0 f256827d;

    public b0$$b(C89137b0 b0Var) {
        this.f256827d = b0Var;
    }

    public boolean onTimerExpired() {
        C89137b0 b0Var = this.f256827d;
        boolean z = false;
        if (b0Var.f256821s == null) {
            return false;
        }
        Log.m105927v("MicroMsg.NetSceneQueue", "onQueueIdle, running=%d, waiting=%d, foreground=%b", Integer.valueOf(b0Var.f256811f.size()), Integer.valueOf(this.f256827d.f256812g.size()), Boolean.valueOf(this.f256827d.f256815j));
        C89137b0 b0Var2 = this.f256827d;
        b0$$h b0__h = b0Var2.f256821s;
        if (b0Var2.f256823u && b0Var2.f256811f.isEmpty() && this.f256827d.f256812g.isEmpty()) {
            z = true;
        }
        b0__h.mo72832a(b0Var2, z);
        return true;
    }
}
