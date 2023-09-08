package p375qh;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import qe3.C89625d;

/* renamed from: qh.n */
public class C77346n implements Runnable {
    public C77346n(C77340l lVar) {
    }

    public void run() {
        Log.m105920e("MicroMsg.SceneVoice.Recorder", "start record timeout");
        C115669n nVar = C115669n.INSTANCE;
        nVar.idkeyStat(357, 51, 1, true);
        if (!C77340l.f225494t) {
            if (C89625d.f257845k) {
                nVar.mo160135k("Record", "start record timeout", (Map<String, Object>) null);
            }
            nVar.idkeyStat(357, 52, 1, true);
        }
        C77340l.f225494t = true;
    }
}
