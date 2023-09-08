package e50;

import com.qcloud.qvb.XNet;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;

/* renamed from: e50.b */
public final class C116700b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C116693a f350017d;

    public C116700b(C116693a aVar) {
        this.f350017d = aVar;
    }

    public final void run() {
        this.f350017d.f349983T.stopTimer();
        XNet.destroy();
        C86709a0.m107529k().mo121129d(this.f350017d.f349985V);
        this.f350017d.f350006u = true;
        this.f350017d.f349981R = false;
        Log.m105924i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper stopP2pService");
    }
}
