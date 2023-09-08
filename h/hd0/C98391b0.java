package hd0;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: hd0.b0 */
public class C98391b0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C98385a0 f288466d;

    public C98391b0(C98385a0 a0Var) {
        this.f288466d = a0Var;
    }

    public void run() {
        Log.m105918d("MicroMsg.SightMassSendService", "Try Run service runningFlag:" + this.f288466d.f288438f + " sending:" + this.f288466d.f288437e);
        C98385a0 a0Var = this.f288466d;
        if (!a0Var.f288438f) {
            a0Var.f288439g = 5;
            a0Var.f288441i.mo72289b();
            this.f288466d.f288437e = false;
        }
        C98385a0 a0Var2 = this.f288466d;
        a0Var2.f288438f = true;
        a0Var2.f288442j.startTimer(10);
    }

    public String toString() {
        return super.toString() + "|run";
    }
}
