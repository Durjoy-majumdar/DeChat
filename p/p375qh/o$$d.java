package p375qh;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: qh.o$$d */
public class o$$d implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C77347o f225542d;

    public o$$d(C77347o oVar) {
        this.f225542d = oVar;
    }

    public boolean onTimerExpired() {
        Log.m105925i("MicroMsg.SceneVoiceService", "onTimerExpired[%s]", this.f225542d.toString());
        C77347o.m93242b(this.f225542d);
        return false;
    }

    public String toString() {
        return super.toString() + "|scenePusher";
    }
}
