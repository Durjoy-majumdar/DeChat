package bh2;

import com.tencent.p014mm.sdk.platformtools.Log;
import w80.C111742d;

/* renamed from: bh2.e */
public class C104113e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C104110c f308034d;

    public C104113e(C104110c cVar) {
        this.f308034d = cVar;
    }

    public void run() {
        C104110c cVar = this.f308034d;
        cVar.getClass();
        Log.m105924i("MicroMsg.Story.GLThread", "destoryGL");
        C111742d.f334647a.mo163471q(cVar.f308029d);
        cVar.f308030e.quit();
        cVar.f308028c.mo145780c();
    }
}
