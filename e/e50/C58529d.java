package e50;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: e50.d */
public final class C58529d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C116693a f167563d;

    public C58529d(C116693a aVar) {
        this.f167563d = aVar;
    }

    public final void run() {
        C116693a aVar = this.f167563d;
        aVar.f349981R = true;
        aVar.f349984U.startTimer(30000, 30000);
        this.f167563d.mo180710d();
        this.f167563d.getClass();
        Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper start post destroy p2p");
    }
}
