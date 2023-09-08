package p375qh;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: qh.o$$c */
public class o$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C77347o f225541d;

    public o$$c(C77347o oVar) {
        this.f225541d = oVar;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis() - this.f225541d.f225532q;
        Log.m105924i("MicroMsg.SceneVoiceService", "Try Run service runningFlag:" + this.f225541d.f225530o + " timeWait:" + currentTimeMillis + " sending:" + this.f225541d.f225529n + " recving:" + this.f225541d.f225528j + "[" + this.f225541d.toString() + "]");
        if (this.f225541d.f225530o) {
            if (currentTimeMillis >= 60000) {
                Log.m105920e("MicroMsg.SceneVoiceService", "ERR: Try Run service runningFlag:" + this.f225541d.f225530o + " timeWait:" + currentTimeMillis + ">=MAX_TIME_WAIT sending:" + this.f225541d.f225529n + " recving:" + this.f225541d.f225528j);
            } else {
                return;
            }
        }
        C77347o oVar = this.f225541d;
        oVar.f225530o = true;
        oVar.f225529n = false;
        oVar.f225531p = 3;
        oVar.f225528j = false;
        oVar.f225533r.mo72289b();
        if (this.f225541d.f225524f) {
            C77347o.m93242b(this.f225541d);
        } else {
            Log.m105920e("MicroMsg.SceneVoiceService", "acc not ready");
        }
    }

    public String toString() {
        return super.toString() + "|run";
    }
}
