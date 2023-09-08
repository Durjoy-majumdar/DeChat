package hd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.HashMap;

public class z0$$c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98447z0 f288770d;

    public z0$$c(C98447z0 z0Var) {
        this.f288770d = z0Var;
    }

    public void run() {
        long currentTimeMillis = System.currentTimeMillis() - this.f288770d.f288764t;
        Log.m105918d("MicroMsg.VideoService", "Try Run service runningFlag:" + this.f288770d.f288762r + " timeWait:" + currentTimeMillis + " sending:" + this.f288770d.f288761q + " recving:" + this.f288770d.f288760p);
        if (this.f288770d.f288762r) {
            if (currentTimeMillis >= 60000) {
                Log.m105920e("MicroMsg.VideoService", "ERR: Try Run service runningFlag:" + this.f288770d.f288762r + " timeWait:" + currentTimeMillis + ">=MAX_TIME_WAIT sending:" + this.f288770d.f288761q + " recving:" + this.f288770d.f288760p);
                if (((HashMap) this.f288770d.f288759o).size() != 0 && this.f288770d.f288761q && currentTimeMillis < 300000) {
                    Log.m105924i("MicroMsg.VideoService", "already sending, do not reset service");
                    return;
                }
            } else {
                return;
            }
        }
        C98447z0 z0Var = this.f288770d;
        z0Var.f288763s = 3;
        z0Var.f288762r = true;
        z0Var.f288761q = false;
        z0Var.f288760p = false;
        z0Var.f288766v = null;
        z0Var.f288765u = null;
        z0Var.f288767w.mo72289b();
        this.f288770d.f288753f.startTimer(10);
    }

    public String toString() {
        return super.toString() + "|run";
    }
}
