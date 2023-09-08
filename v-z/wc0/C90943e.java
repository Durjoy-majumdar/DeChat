package wc0;

import com.tencent.p014mm.sdk.platformtools.Log;
import kj2.C117407d;
import p988jj.C87968a;

/* renamed from: wc0.e */
public class C90943e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f260966d;

    public C90943e(int i) {
        this.f260966d = i;
    }

    public void run() {
        int i = this.f260966d + 1;
        Log.m105924i("MicroMsg.recovery.reporter", "report crash count = " + i);
        if (i >= 0 && i <= 10) {
            Log.m105924i("MicroMsg.CompatReporter", "#reportRecoveryCrashCnt: recCrashCnt");
            C87968a.C87969a.m109466a(1, 0, "recCrashCnt", C87968a.m109465a(), "", "crash-" + i, "", "", "", "");
            C117407d.INSTANCE.idkeyStat(1341, (long) (i + 0), 1, false);
        }
    }
}
